package de.reloader;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class Main extends PluginBase {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("reloadplugins") && sender.isOp()) {
            this.getServer().getPluginManager().clearPlugins();
            this.getServer().getPluginManager().loadPlugins(this.getServer().getPluginPath());
            sender.sendMessage("§aPlugins where reloadet");
            return true;
        }
        return false;
    }
}
