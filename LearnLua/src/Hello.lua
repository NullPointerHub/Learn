---
--- Generated by EmmyLua(https://github.com/EmmyLua)
--- Created by 86175.
--- DateTime: 2021/10/21 下午8:34
---

local clazz = require("unicom.Clazz")

--print("Hello Lua")

for var=1,10,1 do
    -- print(var)
end

local conf = {}

conf.key1 = "value1"
conf["key2"] = "value2"

print(_G)
print(_VERSION)

local object = clazz:new(nil,{arg = 100})
print(object)
--object:print()
--
--local other = object:clone()
--object = nil
--other:print()
--object:print()


local thd = {key = "thd-value"}
local fst = {}
local snd = {key = "snd-value", snd="snd", __index = thd }
setmetatable(fst,snd)

print(fst.snd)
print(fst.key)



function Split(szFullString, szSeparator)
    local nFindStartIndex = 1
    local nSplitIndex = 1
    local nSplitArray = {}
    while true do
        local nFindLastIndex = string.find(szFullString, szSeparator, nFindStartIndex)
        if not nFindLastIndex then
            nSplitArray[nSplitIndex] = string.sub(szFullString, nFindStartIndex, string.len(szFullString))
            break
        end
        nSplitArray[nSplitIndex] = string.sub(szFullString, nFindStartIndex, nFindLastIndex - 1)
        nFindStartIndex = nFindLastIndex + string.len(szSeparator)
        nSplitIndex = nSplitIndex + 1
    end
    return nSplitArray
end


local list = Split("abc,123,345", ",")
print(list)