package nuclear.content;

import mindustry.type.*;

import static mindustry.content.Planets.*;

public class nuclearsector{
    public static SectorPreset
    map1,map2,map3,map4,map5,map6,map7,map8,map9;


    public static void load(){
        //region serpulo
        // Jutlah
        map1 = new SectorPreset("7", serpulo, 7){{
            captureWave = 100;
            difficulty = 69;
        }};
        // plt reworked
        map2 = new SectorPreset("69", serpulo, 69){{
            difficulty = 69;
        }};
        // remenant 0025
        map3 = new SectorPreset("70", serpulo, 70){{
            captureWave = 30;
            difficulty = 69;
        }};
        // Bloodshed bastion
        map4 = new SectorPreset("129", serpulo, 129){{
            difficulty = 69;
        }};
        // cruxscape (temp)
        map5 = new SectorPreset("131", serpulo, 131){{
            difficulty = 69;
        }};
        // Geo Stronghold
        map6 = new SectorPreset("224", serpulo, 224){{
            difficulty = 69;
        }};
        // Cruxscape
        map7 = new SectorPreset("24", serpulo, 24){{
            difficulty = 69;
        }};
        //
        map8 = new SectorPreset("229", serpulo, 229){{
            difficulty = 69;
        }};
        map9 = new SectorPreset("234", serpulo, 234){{
            captureWave = 145;
            difficulty = 69;
        }};
    }
}