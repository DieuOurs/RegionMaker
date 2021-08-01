public static void initSchema(Location loc1, Location loc2,Type type) {
  int topBlockX = (loc1.getBlockX() < loc2.getBlockX()) ? loc2.getBlockX() : loc1.getBlockX();
	int bottomBlockX = (loc1.getBlockX() > loc2.getBlockX()) ? loc2.getBlockX() : loc1.getBlockX();
	int topBlockY = (loc1.getBlockY() < loc2.getBlockY()) ? loc2.getBlockY() : loc1.getBlockY();
	int bottomBlockY = (loc1.getBlockY() > loc2.getBlockY()) ? loc2.getBlockY() : loc1.getBlockY();
	int topBlockZ = (loc1.getBlockZ() < loc2.getBlockZ()) ? loc2.getBlockZ() : loc1.getBlockZ();
	int bottomBlockZ = (loc1.getBlockZ() > loc2.getBlockZ()) ? loc2.getBlockZ() : loc1.getBlockZ();
  for (int x = bottomBlockX; x <= topBlockX; x++) {
	  for (int z = bottomBlockZ; z <= topBlockZ; z++) {
		  for (int y = bottomBlockY; y <= topBlockY; y++) {
			  Block block = loc1.getWorld().getBlockAt(x, y, z);
				if(block.getType()!=Material.AIR){
				  //DO WHAT YOU WANT
				}
			}
		}
	}
}
