package nuclear.content;

import mindustry.type.*;

import static mindustry.content.Planets.*;

public class nuclearsector{
    public static SectorPreset
    map1,map2,map3,map4,map5,map6,map7;


    public static void load(){
        //region serpulo
        map1 = new SectorPreset("7", serpulo, 7){{
            captureWave = 100;
            difficulty = 69;
        }};
        map7 = new SectorPreset("24", serpulo, 24){{
            difficulty = 69;
        }};
        map2 = new SectorPreset("69", serpulo, 69){{
            difficulty = 69;
        }};
        map3 = new SectorPreset("70", serpulo, 70){{
            difficulty = 69;
        }};
        map4 = new SectorPreset("129", serpulo, 129){{
            difficulty = 69;
        }};
        map5 = new SectorPreset("131", serpulo, 131){{
            captureWave = 145;
            difficulty = 69;
        }};
        map6 = new SectorPreset("224", serpulo, 224){{
            difficulty = 69;
        }};
    }
}