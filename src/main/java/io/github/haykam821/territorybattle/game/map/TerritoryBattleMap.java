package io.github.haykam821.territorybattle.game.map;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import xyz.nucleoid.plasmid.game.map.template.MapTemplate;
import xyz.nucleoid.plasmid.game.map.template.TemplateChunkGenerator;
import xyz.nucleoid.plasmid.util.BlockBounds;

public class TerritoryBattleMap {
	private final MapTemplate template;
	private final BlockBounds platform;

	public TerritoryBattleMap(MapTemplate template, BlockBounds platform) {
		this.template = template;
		this.platform = platform;
	}

	public BlockBounds getPlatform() {
		return this.platform;
	}

	public ChunkGenerator createGenerator() {
		return new TemplateChunkGenerator(this.template, BlockPos.ORIGIN);
	}
}