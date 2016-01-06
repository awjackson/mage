/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets.oathofthegatewatch;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.CantBlockAbility;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.CastSourceTriggeredAbility;
import mage.abilities.effects.common.DoIfCostPaid;
import mage.abilities.effects.common.SacrificeEffect;
import mage.abilities.keyword.DevoidAbility;
import mage.abilities.keyword.FlyingAbility;
import mage.cards.CardImpl;
import mage.constants.CardType;
import mage.constants.Rarity;
import mage.filter.common.FilterCreaturePermanent;
import mage.target.common.TargetOpponent;

/**
 *
 * @author fireshoes
 */
public class BearerOfSilence extends CardImpl {

    public BearerOfSilence(UUID ownerId) {
        super(ownerId, 67, "Bearer of Silence", Rarity.RARE, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.expansionSetCode = "OGW";
        this.subtype.add("Eldrazi");
        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // Devoid
        this.addAbility(new DevoidAbility(this.color));

        // When you cast Bearer of Silence, you may pay {1}{C}. If you do, target opponent sacrifices a creature.
        Ability ability = new CastSourceTriggeredAbility(new DoIfCostPaid(new SacrificeEffect(new FilterCreaturePermanent(), 1, "Target opponent"), new ManaCostsImpl("{1}{C}")));
        ability.addTarget(new TargetOpponent());
        this.addAbility(ability);

        // Flying
        this.addAbility(FlyingAbility.getInstance());

        // Bearer of Silence can't block.
        this.addAbility(new CantBlockAbility());
    }

    public BearerOfSilence(final BearerOfSilence card) {
        super(card);
    }

    @Override
    public BearerOfSilence copy() {
        return new BearerOfSilence(this);
    }
}
