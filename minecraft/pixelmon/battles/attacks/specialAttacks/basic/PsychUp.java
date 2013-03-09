package pixelmon.battles.attacks.specialAttacks.basic;

import java.util.ArrayList;

import pixelmon.battles.attacks.Attack;
import pixelmon.battles.attacks.Value;
import pixelmon.comm.ChatHandler;
import pixelmon.entities.pixelmon.EntityPixelmon;

public class PsychUp extends SpecialAttackBase {

	public PsychUp(Value... values) {
		super(ApplyStage.During, false);
	}

	@Override
	public boolean ApplyEffect(EntityPixelmon user, EntityPixelmon target, Attack a, ArrayList<String> attackList, ArrayList<String> targetAttackList) throws Exception {
		user.battleStats.copyStats(target.battleStats);
		ChatHandler.sendBattleMessage(user.getOwner(), user.getName() + " copied the foe's stat changes!");
		ChatHandler.sendBattleMessage(target.getOwner(), "The foe copied " + target.getName() + "'s stat changes");
		return true;

	}

}
