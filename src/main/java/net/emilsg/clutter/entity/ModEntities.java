package net.emilsg.clutter.entity;

import net.emilsg.clutter.Clutter;
import net.emilsg.clutter.entity.custom.ButterflyEntity;
import net.emilsg.clutter.entity.custom.ChameleonEntity;
import net.emilsg.clutter.entity.custom.EchofinEntity;
import net.emilsg.clutter.entity.custom.MossbloomEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<ButterflyEntity> BUTTERFLY = Registry.register(Registries.ENTITY_TYPE, new Identifier(Clutter.MOD_ID, "butterfly"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ButterflyEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static final EntityType<ChameleonEntity> CHAMELEON = Registry.register(Registries.ENTITY_TYPE, new Identifier(Clutter.MOD_ID, "chameleon"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ChameleonEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.5f)).build());

    public static final EntityType<EchofinEntity> ECHOFIN = Registry.register(Registries.ENTITY_TYPE, new Identifier(Clutter.MOD_ID, "echofin"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, EchofinEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static final EntityType<MossbloomEntity> MOSSBLOOM = Registry.register(Registries.ENTITY_TYPE, new Identifier(Clutter.MOD_ID, "mossbloom"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MossbloomEntity::new).dimensions(EntityDimensions.fixed(1.0f, 1.25f)).build());
}
