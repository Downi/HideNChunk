package nl.Steffion.BlockHunt.Commands;

import nl.Steffion.BlockHunt.BlockHunt;
import nl.Steffion.BlockHunt.ConfigC;
import nl.Steffion.BlockHunt.Managers.MessageM;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class CMDinfo extends DefaultCMD {
	/**
	 * Steffion's Engine - Made by Steffion.
	 * 
	 * You're allowed to use this engine for own usage, you're not allowed to
	 * republish the engine. Using this for your own plugin is allowed when a
	 * credit is placed somewhere in the plugin.
	 * 
	 * Thanks for your cooperate!
	 * 
	 * @author Steffion
	 */

	@Override
	public boolean exectue(Player player, Command cmd, String label,
			String[] args) {
		MessageM.sendFMessage(player, ConfigC.chat_headerhigh, "header-"
				+ BlockHunt.pdfFile.getName());
		MessageM.sendMessage(player, "%A%name%%N made by %A%autors%%N.",
				"name-" + "BlockHunt", "autors-"
						+ BlockHunt.pdfFile.getAuthors().get(0));
		MessageM.sendMessage(player, "%NModified by %A%autors%%N.",
				"name-" + BlockHunt.pdfFile.getName(), "autors-"
						+ "Daunilein");
		MessageM.sendMessage(player, "%NVersion: %A%version%%N.", "version-"
				+ BlockHunt.pdfFile.getVersion());
		MessageM.sendMessage(player, "%NCB-Version: %A%version%%N.", "version-"
				+ "0.1");
		MessageM.sendMessage(player, "%NType %A%helpusage% %Nfor help.",
				"helpusage-" + BlockHunt.CMDhelp.usage);
		MessageM.sendFMessage(player, ConfigC.chat_headerhigh,
				"header-&oInfo Page");
		return true;
	}
}
