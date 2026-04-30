package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.justmili.plushies.content.plushies.*;
import net.justmili.plushies.content.plushies.lumynitystudios.*;
import net.justmili.plushies.content.plushies.vtubers.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;

public class PlushBlocks {
    public static Block BASETEST_PLUSH; // Testing plush
    public static Block ENO_PLUSH; // Mascot
    public static Block MILLIE_PLUSH;
    public static Block APPELS_PLUSH;
    public static Block MAHAN_PLUSH;
    public static Block MOCHILA_PLUSH;
    public static Block GAEL_PLUSH;
    public static Block DGIRAFFE_PLUSH;
    public static Block FAYE_PLUSH;
    public static Block JOHN_PLUSH;
    public static Block PLUME_PLUSH;
    public static Block RAZE_PLUSH;
    public static Block MARY_PLUSH;
    public static Block IZYA_PLUSH;
    public static Block BLU_PLUSH; //Contributor
    public static Block NEMESTRO_PLUSH; //Old team member
    public static Block ZARSAI_PLUSH;
    public static Block SHADEVT_PLUSH;
    public static Block WHOISMONIA_PLUSH;
    public static Block KURAYAMI_PLUSH;
    public static Block QU1NNT0NZZ_PLUSH;
    public static Block MEOWYNYAA_PLUSH;
    public static Block SOOKIECHU_PLUSH;
    public static Block CHERRYCHIFFON_PLUSH;
    public static Block AURELIA_STARS_PLUSH;
    public static Block FUUMIZU_PLUSH;
    public static Block ANALOGWHISKERS_PLUSH;

    public static void load() {
        BASETEST_PLUSH = register("basetestplush", new BaseTestPlush());

        ENO_PLUSH = register("eno_plush", new EnoPlush());
        MILLIE_PLUSH = register("justmili_plush", new MilliePlush());
        APPELS_PLUSH = register("eetgeenappels_plush", new AppelsPlush());
        MAHAN_PLUSH = register("mahan_plush", new MahanPlush());
        MOCHILA_PLUSH = register("mochila_plush", new MochilaPlush());
        GAEL_PLUSH = register("gaelfm_plush", new GaelPlush());
        DGIRAFFE_PLUSH = register("dgiraffe_plush", new DGiraffePlush());
        FAYE_PLUSH = register("flufaye_plush", new FayePlush());
        JOHN_PLUSH = register("john_roboeye_plush", new JohnPlush());
        PLUME_PLUSH = register("hxplume_plush", new PlumePlush());
        RAZE_PLUSH = register("raze7th_plush", new RazePlush());
        MARY_PLUSH = register("mary_plush", new MaryPlush());
        IZYA_PLUSH = register("izya_plush", new IzyaPlush());
        BLU_PLUSH = register("bluspring_plush", new BluSpringPlush());
        NEMESTRO_PLUSH = register("nemestro_plush", new NemestroPlush());

        ZARSAI_PLUSH = register("zarsai_plush", new ZarsaiPlush());
        SHADEVT_PLUSH = register("shadevt_plush", new ShadeVTPlush());
        WHOISMONIA_PLUSH = register("whoismonia_plush", new WhoisMoniaPlush());
        KURAYAMI_PLUSH = register("kurayamispider_plush", new KurayamiPlush());
        QU1NNT0NZZ_PLUSH = register("qu1nnt0nzz_plush", new Qu1nnt0nzzPlush());
        MEOWYNYAA_PLUSH = register("meowynyaa_plush", new MeowynyaaPlush());
        SOOKIECHU_PLUSH = register("sookiechu_plush", new SookiechuPlush());
        CHERRYCHIFFON_PLUSH = register("cherrychiffonvt_plush", new CherryChiffonPlush());
        AURELIA_STARS_PLUSH = register("aurelia_stars_plush", new AureliaStarsPlush());
        FUUMIZU_PLUSH = register("fuumizu_plush", new FuuMizuPlush());
        ANALOGWHISKERS_PLUSH = register("analogwhiskers_plush", new AnalogWhiskersPlush());
    }

    private static Block register(String registryName, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, Plushies.asResource(registryName), block);
    }
}
