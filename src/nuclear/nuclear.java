package nuclear;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import nuclear.content.*;

public class nuclear extends Mod{

    public nuclear(){
        Log.info("As I said jack");
        Log.info("Kid are cruel... AND I LOVE MINOR!");
    }

    @Override
    public void loadContent(){
        Log.info("Chinese ahh loader");
        nuclearsector.load();
    }

}
