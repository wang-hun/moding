///§ = alt+167
///对应色码如下
///§0黑色
///§1深蓝
///§2深绿
///§3天蓝
///§4红色
///§5深紫
///§6金黄
///§7浅灰
///§8深灰
///§9淡紫
///§a浅绿
///§b淡蓝
///§c淡红
///§d淡紫
///§e淡黄
///§f白色
/////////////
///§l粗体
///§o斜体
///§r清除效果
///§m删除线
///§n下划线
///ctrl+shirt+o 一键添加引用
///alt+/ 查看补全
///统一命名法！！！！物品全部小写且用_分割开！！！I标注物品形态，B标注方块形态
//硬度 泥土0.5 石头1.5
//ChinnabarOre朱砂矿
//body bust 尸尘
//对于语言文件，物品名称前缀item，方块前缀tile
采掘工具 pickaxe/axe/shove 
方块采掘等级
/*     Wood:    0
    *     Stone:   1
    *     Iron:    2
    *     Diamond: 3
    *     Gold:    0
    */
    
  ///blockstastesz中
  json中model"minecraft:cube_all"表示六个面均相同的方块
 不同如下
  {
    "variants": {
        "normal": {
            "model": "my_mod:example_block_model"
        }
    }
}
  
  ///model 不同使用如下
  {
    "parent": "block/cube",
    "textures": {
        "up": "my_mod:blocks/example_block_texture_up",
        "down": "my_mod:blocks/example_block_texture_down",
        "west": "my_mod:blocks/example_block_texture_west",
        "north": "my_mod:blocks/example_block_texture_north",
        "east": "my_mod:blocks/example_block_texture_east",
        "south": "my_mod:blocks/example_block_texture_south"
    }
}
四面块如下
{
"format_version": "1.16.0",
  "helloworld:canvasblock": {
    "textures": {
        "up": "log_oak_top",
        "down": "log_oak_top",
        "side": "canvasblock"
        },
    "sound":"dirt"
    }
}