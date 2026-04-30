package net.justmili.plushies.registries;

import net.justmili.plushies.Plushies;
import net.justmili.plushies.content.plushies.*;
import net.justmili.plushies.content.plushies.lumynitystudios.*;
import net.justmili.plushies.content.plushies.vtubers.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class PlushBlocks {
    public static Block BASETEST_PLUSH = register("basetestplush", BaseTestPlush::new); // Testing plush

    public static Block ENO_PLUSH = register("eno_plush", EnoPlush::new); // Mascot
    public static Block MILLIE_PLUSH = register("justmili_plush", MilliePlush::new);
    public static Block APPELS_PLUSH = register("eetgeenappels_plush", AppelsPlush::new);
    public static Block MAHAN_PLUSH = register("mahan_plush", MahanPlush::new);
    public static Block MOCHILA_PLUSH = register("mochila_plush", MochilaPlush::new);
    public static Block GAEL_PLUSH = register("gaelfm_plush", GaelPlush::new);
    public static Block DGIRAFFE_PLUSH = register("dgiraffe_plush", DGiraffePlush::new);
    public static Block FAYE_PLUSH = register("flufaye_plush", FayePlush::new);
    public static Block JOHN_PLUSH = register("john_roboeye_plush", JohnPlush::new);
    public static Block PLUME_PLUSH = register("hxplume_plush", PlumePlush::new);
    public static Block RAZE_PLUSH = register("raze7th_plush", RazePlush::new);
    public static Block MARY_PLUSH = register("mary_plush", MaryPlush::new);
    public static Block IZYA_PLUSH = register("izya_plush", IzyaPlush::new);
    public static Block BLU_PLUSH = register("bluspring_plush", BluSpringPlush::new); //Contributor
    public static Block NEMESTRO_PLUSH = register("nemestro_plush", NemestroPlush::new); //Old team member

    public static Block ZARSAI_PLUSH = register("zarsai_plush", ZarsaiPlush::new);
    public static Block SHADEVT_PLUSH = register("shadevt_plush", ShadeVTPlush::new);
    public static Block WHOISMONIA_PLUSH = register("whoismonia_plush", WhoisMoniaPlush::new);
    public static Block KURAYAMI_PLUSH = register("kurayamispider_plush", KurayamiPlush::new);
    public static Block QU1NNT0NZZ_PLUSH = register("qu1nnt0nzz_plush", Qu1nnt0nzzPlush::new);
    public static Block MEOWYNYAA_PLUSH = register("meowynyaa_plush", MeowynyaaPlush::new);
    public static Block SOOKIECHU_PLUSH = register("sookiechu_plush", SookiechuPlush::new);
    public static Block CHERRYCHIFFON_PLUSH = register("cherrychiffonvt_plush", CherryChiffonPlush::new);
    public static Block AURELIA_STARS_PLUSH = register("aurelia_stars_plush", AureliaStarsPlush::new);
    public static Block FUUMIZU_PLUSH = register("fuumizu_plush", FuuMizuPlush::new);
    public static Block ANALOGWHISKERS_PLUSH = register("analogwhiskers_plush", AnalogWhiskersPlush::new);

    private static Block register(String name, Function<BlockBehaviour.Properties, Block> block) {
        var id = Plushies.asResource(name);
        return Registry.register(BuiltInRegistries.BLOCK, Plushies.asResource(name),
            block.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id))));
    }

    public static void load() {}

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
