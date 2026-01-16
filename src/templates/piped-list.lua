---@module "pandoc-types-annotations"
local pandoc = pandoc ---@type pandoc

local function process(div)
    if (div.attr.classes[1] ~= "piped-list") then return nil end
    table.remove(div.attr.classes, 1)
    if #div.content == 0 then return nil end

    local content = div.content
    assert(content[1].t == "BulletList",
            "expected bullet list, found " .. content[1].t)
    local bulletList = content[1] ---@type BulletList

    local blocks = pandoc.List()
    local textList = pandoc.List() ---@type List<Inline>
    local count = 0
    for item in bulletList.content:iter() do
        textList:extend(item[1].content)
        textList:insert(pandoc.Str " | ")
        count = count + 1
        if (count >= 3) then
            if #textList then
                textList:remove()
            end
            blocks:insert(pandoc.Para(textList))
            textList = pandoc.List()
            count = 0
        end
    end
    if #textList then
        textList:remove()
    end
    blocks:insert(pandoc.Para(textList))
    return pandoc.Div(blocks, {class = "piped-list", ["custom-style"] = "Heading 4"})
end

return {{Div = process}}