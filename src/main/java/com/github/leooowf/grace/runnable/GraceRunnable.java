package com.github.leooowf.grace.runnable;

import com.github.leooowf.grace.GraceConstants;
import com.github.leooowf.grace.GracePlugin;
import com.github.leooowf.grace.utils.ColorUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class GraceRunnable implements Runnable {

    @Override
    public void run() {

        GraceConstants.setStatus(false);

        for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {

            for (String message : GracePlugin.getInstance().getConfig().getStringList("messages.disabled-grace"))
                onlinePlayers.sendMessage(ColorUtil.colored(message));
        }
    }
}