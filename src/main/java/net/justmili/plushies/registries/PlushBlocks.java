package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.justmili.plushies.content.plushies.*;
import net.justmili.plushies.content.plushies.lumynitystudios.*;
import net.justmili.plushies.content.plushies.vtubers.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

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
        BASETEST_PLUSH = register("basetestplush", properties -> new BaseTestPlush(properties));

        ENO_PLUSH = register("eno_plush", properties -> new EnoPlush(properties));
        MILLIE_PLUSH = register("justmili_plush", properties -> new MilliePlush(properties));
        APPELS_PLUSH = register("eetgeenappels_plush", properties -> new AppelsPlush(properties));
        MAHAN_PLUSH = register("mahan_plush", properties -> new MahanPlush(properties));
        MOCHILA_PLUSH = register("mochila_plush", properties -> new MochilaPlush(properties));
        GAEL_PLUSH = register("gaelfm_plush", properties -> new GaelPlush(properties));
        DGIRAFFE_PLUSH = register("dgiraffe_plush", properties -> new DGiraffePlush(properties));
        FAYE_PLUSH = register("flufaye_plush", properties -> new FayePlush(properties));
        JOHN_PLUSH = register("john_roboeye_plush", properties -> new JohnPlush(properties));
        PLUME_PLUSH = register("hxplume_plush", properties -> new PlumePlush(properties));
        RAZE_PLUSH = register("raze7th_plush", properties -> new RazePlush(properties));
        MARY_PLUSH = register("mary_plush", properties -> new MaryPlush(properties));
        IZYA_PLUSH = register("izya_plush", properties -> new IzyaPlush(properties));
        BLU_PLUSH = register("bluspring_plush", properties -> new BluSpringPlush(properties));
        NEMESTRO_PLUSH = register("nemestro_plush", properties -> new NemestroPlush(properties));

        ZARSAI_PLUSH = register("zarsai_plush", properties -> new ZarsaiPlush(properties));
        SHADEVT_PLUSH = register("shadevt_plush", properties -> new ShadeVTPlush(properties));
        WHOISMONIA_PLUSH = register("whoismonia_plush", properties -> new WhoisMoniaPlush(properties));
        KURAYAMI_PLUSH = register("kurayamispider_plush", properties -> new KurayamiPlush(properties));
        QU1NNT0NZZ_PLUSH = register("qu1nnt0nzz_plush", properties -> new Qu1nnt0nzzPlush(properties));
        MEOWYNYAA_PLUSH = register("meowynyaa_plush", properties -> new MeowynyaaPlush(properties));
        SOOKIECHU_PLUSH = register("sookiechu_plush", properties -> new SookiechuPlush(properties));
        CHERRYCHIFFON_PLUSH = register("cherrychiffonvt_plush", properties -> new CherryChiffonPlush(properties));
        AURELIA_STARS_PLUSH = register("aurelia_stars_plush", properties -> new AureliaStarsPlush(properties));
        FUUMIZU_PLUSH = register("fuumizu_plush", properties -> new FuuMizuPlush(properties));
        ANALOGWHISKERS_PLUSH = register("analogwhiskers_plush", properties -> new AnalogWhiskersPlush(properties));
    }

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> block) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.BLOCK, Plushies.asResource(name),
            block.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id))));
    }

    public static Block[] getPlushies() {
        return new Block[] {
            PlushBlocks.BASETEST_PLUSH, PlushBlocks.ENO_PLUSH,
            PlushBlocks.MILLIE_PLUSH, PlushBlocks.APPELS_PLUSH, PlushBlocks.MAHAN_PLUSH,
            PlushBlocks.MOCHILA_PLUSH, PlushBlocks.GAEL_PLUSH, PlushBlocks.DGIRAFFE_PLUSH,
            PlushBlocks.FAYE_PLUSH, PlushBlocks.JOHN_PLUSH, PlushBlocks.PLUME_PLUSH, PlushBlocks.RAZE_PLUSH, PlushBlocks.MARY_PLUSH,
            PlushBlocks.IZYA_PLUSH, PlushBlocks.BLU_PLUSH, PlushBlocks.NEMESTRO_PLUSH,
            PlushBlocks.ZARSAI_PLUSH, PlushBlocks.SHADEVT_PLUSH, PlushBlocks.WHOISMONIA_PLUSH,
            PlushBlocks.KURAYAMI_PLUSH, PlushBlocks.QU1NNT0NZZ_PLUSH,
            PlushBlocks.MEOWYNYAA_PLUSH, PlushBlocks.SOOKIECHU_PLUSH, PlushBlocks.CHERRYCHIFFON_PLUSH, PlushBlocks.AURELIA_STARS_PLUSH,
            PlushBlocks.FUUMIZU_PLUSH, PlushBlocks.ANALOGWHISKERS_PLUSH
        };
    }
}
