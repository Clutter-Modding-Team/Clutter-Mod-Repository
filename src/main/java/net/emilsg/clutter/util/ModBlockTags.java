package net.emilsg.clutter.util;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModBlockTags {
    public static final TagKey<Block> FLAMMABLE = create("flammable");
    public static final TagKey<Block> STRIPPABLE_CHAIRS = create("strippable_chairs");
    public static final TagKey<Block> STRIPPABLE_BENCHES = create("strippable_benches");
    public static final TagKey<Block> FULL_SCULK_BLOCKS = create("full_sculk_blocks");
    public static final TagKey<Block> STRIPPABLE_TABLES = create("strippable_tables");
    public static final TagKey<Block> CHAINS = create("chains");
    public static final TagKey<Block> IMMOVABLE = create("immovable");
    public static final TagKey<Block> COPPER_DOORS = create("copper_doors");
    public static final TagKey<Block> SEATS = create("seats");
    public static final TagKey<Block> BUTTERFLY_VALID = create("butterfly_valid");
    public static final TagKey<Block> BASALT = create("basalt");
    public static final TagKey<Block> GREEN_FIRE_BASE_BLOCKS = create("green_fire_base_blocks");

    private static TagKey<Block> create(String path) {
        return create(path, "clutter");
    }

    private static TagKey<Block> create(String path, String namespace) {
        return TagKey.of(Registries.BLOCK.getKey(), new Identifier(namespace, path));
    }
}
