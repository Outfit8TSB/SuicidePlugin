package club.aurorapvp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandListener implements CommandExecutor {
  @Override
  public boolean onCommand(@NotNull CommandSender sender, Command command, @NotNull String label,
                           String[] args) {
    Player p = (Player) sender;

    if (command.getName().equals("kill")) {
      p.setHealth(0);
    } else if (command.getName().equals("suicide")) {
          // Create a new ItemStack of type BOOK_AND_QUILL
    ItemStack bookAndQuill = new ItemStack(Material.BOOK_AND_QUILL);
    
    // Give the book to the player
    player.getInventory().addItem(bookAndQuill);
    }
    return false;
  }
}
