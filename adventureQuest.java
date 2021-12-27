package netbeanscode2021;


import java.util.*;
public class adventureQuest
{
public static void main (String args[]) 
{	
        //Caleb Cleavinger
	Random randomGen= new Random();
	Scanner scan = new Scanner (System.in);
	double melee=0;
	double ranged=0;
	double health=0;
	double magic=0;
	int magicalMultiplier=randomGen.nextInt(2)- -1;
	int speed=0;
	int numOfHE=0;
	int numOfBE=0;
	int numOfME=0;
	int gold=0;
	int numOfMana=3;
        int armorRank=0;
        int bowRank=1;
        int numOfArrow=5;
        int numOfFlameArrow=0;
        boolean haveBeatenSerpentine=false;
        boolean hasArmorBarbs = false;
        boolean hasQuickShoes = false;
        boolean haveStoneStomper=false;
        boolean haveFlameSword=false;
        boolean flameDMG = false;
        int numOfBloonBombs = 0;
        double rankOfSword=1;
	boolean endDecider=true;
while(endDecider==true)
{
System.out.println("Welcome to adventure quest choose your hero! \n 1 for brute  \n 2 for archer \n 3 for swordsmen \n 4 for magician");
	int warriorClass= scan.nextInt();
for(int i=1; i<3; i++)
if (warriorClass == 1)
{
	System.out.println("As a brute you are extra bulky and slow.");
	melee=7;
	ranged=1;
	health=15;
	magic=0;
	speed=3;
	i=3;
}
else if(warriorClass == 2)
{
	System.out.println("As a archer you are a master of the bow and have a small knowledge of magic runes.");
	melee=3;
	ranged=7;
	health=8;
	magic=3;
	speed=7;
	i=3;
}
else if(warriorClass == 3)
{
	System.out.println("As a swordsman you are the master of the blade you are fast, can take a hit, but a lack of knowledge on magic.");
	melee=7;
	ranged=2;
	health=10;
	magic=0;
	speed=6;
	i=3;
}
else if(warriorClass == 4)
{
	System.out.println("As a magician you are a master of the mystic arts. Magic has a chance to be devastatingly strong or fail miserably.");
	melee=3;
	ranged=4;
	health=7;
	magic=8;
	speed=3;
	i=3;
}

else
{
	System.out.println("Invalid warrior class. Please retype a value 1-4 \n 1 for brute \n 2 for archer \n 3 for swordsmen \n 4 for magician");
		warriorClass=scan.nextInt();
}
    System.out.println("What is your first name?");
    String name=scan.next();

	System.out.println("Welcome "+name+" to the land of Suchestadt where the greatest warriors dwell including you my friend!");
	System.out.println("");
	System.out.println(name+"... "+name+".... Your adventure awaits! \n You wake up and climb out of bed. Would you like to (1 look outside (2 put on your slippers (3 go downstairs >>>");
	//d1 stands for decision 1
int d1=scan.nextInt();
while(d1>4 || d1<0)
{
	System.out.println("Invalid decision please try again.");
	System.out.println();
	System.out.println(" (1 to look outside (2 put on your slippers (3 go downstairs >>> ");
	d1=scan.nextInt();
}
        while(d1<4 && d1>0)
{
	if(d1 == 1)
{
		System.out.println("You open up the window and let the cool wild breeze come in. You see a large amount of smoke in the distance.");
                System.out.println(" (2 put on your slippers (3 go downstairs >>> ");
                d1=scan.nextInt();
}
else if(d1 == 2)
{
	System.out.println("You put on your slippers. They’re very comfy.");
	System.out. println(" (1 to look outside (3 go downstairs");
	d1=scan.nextInt();
}


else if(d1 == 3)
{
	System.out.println(name+" went downstairs.");
	d1=459;
}

}
        while(d1 != 459 && d1<4 && d1>0)
{
	if(d1 != 459 && d1>4  || d1<0)
	{
System.out.println("Invalid decision please try again.");
	System.out.println();
	System.out.println(" (1 to look outside (2 put on your slippers (3 go downstairs >>>");
}
	else if(d1 == 1)
{
		System.out.println("You open up the window and let the cool wild breeze come in. You see a large amount of smoke in the distance.");
System.out.println(" (2 put on your slippers (3 go downstairs >>> ");
}
else if(d1 == 2)
{
	System.out.println("You put on your slippers. They’re very comfy.");
	System.out. println(" (1 to look outside (2 put on your slippers (3 go downstairs");
	d1=scan.nextInt();
}
	else if(d1 == 3)
{
	System.out.println(name+" went downstairs.");
	d1=459;
}
}
System.out.println("You are downstairs.");
System.out.println("Your feeling a little hungry.");
System.out.println("You can have (1 eggs (2 Toast (3 shattered glass");
int d2=scan.nextInt();
while(d2>3 || d2<0)
{
	System.out.println("Invalid option please retry");
	System.out.println();
	System.out.println("You can have these for breakfast (1 eggs (2 Toast (3 shattered glass");
	d2=scan.nextInt();
}



while(d2<4 && d2>0)
{
	if(d2 == 1)
{
	System.out.println("You died from salmonella");
        endDecider=false;
        d2=78;
}
        
    else if(d2 == 3)
    {
	System.out.println("The glass was magical and multiplied your base stats by 1.5!");
	melee=melee*1.5;
	ranged=ranged*1.5;
	health=health*1.5;
	magic=magic*1.5;
        d2=3421;
    }
    else if(d2 == 2)
    {
	System.out.println("You ate a buttery piece of toast.");
	d2=3421;
    }
    }
if(endDecider==false)
        {
            endDecider=false;
            break;
        }
    int d3=0;
    if(d2==3421)
    {
    System.out.println();
    System.out.println("You hear heavy knocks on the door. A deep voice then shouts: " + name + "! Come out here! Goblins have lit farmer Garson’s barn on flames! Please help us round up these foul beasts!");
    System.out.println("What will you do?");
    System.out.println("You can (1 pretend you didn’t hear him (2 tell him that your not there (3 go to battle against the goblins");
    d3 = scan.nextInt();
    }

if(d3>3 && d3<0)
{
	System.out.println("Invalid decision retry");
	System.out.println(" (1 pretend you didn’t hear him (2 tell him that your not there (3 go to battle against the goblins");
	d3=scan.nextInt();
}
while(d3>0 && d3<4)
{
	

if(d3 == 1)
{
	System.out.println("You pretended you didn’t hear him.");
	System.out.println("I know you heard me come on join me in glorious conquest!");
	System.out.println("(2 tell him that your not there (3 go to battle against the goblins");
	d3=scan.nextInt();
}
else if(d3 == 2)
{
		System.out.println("You told the man outside you weren’t there the man outside becomes so mad he burns you house down.");
		d3=4587;
		endDecider=false;
}
else if(d3==3)
{
		System.out.println(name+" went outside. The man outside bellowed deeply: ‘Oi let's slay these foul beasts!");
	d3=4587;
}
}
    if(endDecider==false)
    {
        break;
    }
    if(d3 != 4587)
    {
    while(d3<0 && d3>4 && d3!=4587)
    {

        if(d3 == 1)
        {
	System.out.println("You pretended you didn’t hear him.");
	System.out.println("I know you heard me come on join me in glorious conquest!");
	System.out.println("(2 tell him that your not there (3 go to battle against the goblins");
	d3=scan.nextInt();
        }
        else if(d3 == 2)
        {
	System.out.println("You told the man outside you weren’t there the man outside becomes so mad he burns you house down.");
	d3=4587;
	endDecider=false;
        }
        else if(d3==3)
        {
	System.out.println(name+" went outside. The man outside bellowed deeply: ‘Oi let's slay these foul beasts!");
	d3=4587;
        }
    }
    }
        if(endDecider==false)
        {
            break;
        }
	String friendName= " ";
	System.out.println("But before we go you should know my name. My name is Hurmbelty Flurmbetlet the III. Or you can create a nickname for me.");
	System.out.println("(1 to create a nickname \n (2 to just call him Hurmbelty Flurbetlet the III");
	int nicknameD=scan.nextInt();
    while(nicknameD != 555)
    {
    if(nicknameD < 1 || nicknameD > 2)
    {
	System.out.println("Invalid Decision \n");
        System.out.println("(1 to create a nickname \n (2 to just call him Hurmbelty Flurbetlet the III");
	nicknameD=scan.nextInt();
    }
        if(nicknameD == 1)
    {
	System.out.println("Type his nickname >>> ");
	friendName=scan.next();
        nicknameD=555;
    }
        else if(nicknameD == 2)
    {
	System.out.println("Are you sure you want to call him Hurmbelty Flurmbetlet the III");
	System.out.println(" (1 Yes \n (2 No");
        int trueNameD=scan.nextInt();
	if(trueNameD==1)
    {
	friendName="Hurmbelty Flurmeltlet the III";
	nicknameD=555;
    }
	

        else
        {
	nicknameD=1;
        System.out.println();
        }
    }
}
	System.out.println(name+" and "+friendName+" went to the burning barn.");
	System.out.println("2 goblins stare back with their shiny green eyes. They gnash their crooked, bloodstained teeth and jumped at you.");
	System.out. println(friendName+": The goblins are ready to attack, let's fight! \n I’ll take the one on the left!");
//random variable for goblin damage insert here
	Double bElixirBuff=1.0;
	double battleHealth=health;
        int inventoryD=0;
	int dmgToPlayer=0;
	int battleChoice=0;
	double dmg=0;
	int goblinHealth=randomGen.nextInt(15)-10;
        double mobHealth=goblinHealth;
	int goblinSpeed=0;
        int mobType=1;
        //1 for humanoid 2 for stone 3 for plant 4 for air
        boolean bloonBombInAir=false;
	System.out.println("(1 physical attack      (2 ranged attack");
	System.out.println("(3  magic attack        (4 Inventory	");
	battleChoice=scan.nextInt();
	while(battleChoice != 385)
	{
		if(mobHealth<=0)
		{
			System.out.println("Congratulations you defeated a goblin!");
			System.out.println("+ 50 gold");
			gold+=50;
			battleChoice=385;
		}
		
                else if(battleChoice==1)
		{
                        if(haveStoneStomper==true || haveFlameSword==true)
                        {
                            System.out.println("Would you like to use a special weapon?");
                            System.out.println("(1 Yes \n(2 No");
                            battleChoice=scan.nextInt();
                            if(battleChoice==1)
                            {
                                if(haveStoneStomper)
                                {
                                    System.out.println("(1  Stone Stomper");
                                }
                                if(haveFlameSword)
                                {
                                    System.out.println("(2  Flame Sword");
                                }
                                battleChoice=scan.nextInt();
                                if(battleChoice==1)
                                {
                                    dmg=melee*bElixirBuff-5;
                                    if(mobType==2)
                                    {
                                        dmg*=3;
                                    }
                                    if(mobHealth<0)
                                    {
                                        mobHealth=0;
                                    }
                                    System.out.println("You used the stone stomper!");
                                    System.out.println("You dealt "+dmg+" damadge. Leaving the goblin with "+mobHealth);
                                    if(mobType==2)
                                    {
                                        System.out.println("Super Effective! Dealt 3x damadge!");
                                    }
                                }
                            }
                        }
			dmg=melee*bElixirBuff;
                        mobHealth=mobHealth-dmg;
			System.out.println("You attacked the goblin with your sword. It dealt "+dmg+" leaving it with "+goblinHealth+" health");
			System.out.println("Damage dealt to player while attacking up close");
			dmg=0;
		}
		else if(battleChoice==2 && numOfArrow>0 ||battleChoice==2 && numOfFlameArrow>0)
		{
                        if(numOfFlameArrow>0)
                        {
                            System.out.println("Would you like to use a flame arrow instead?");
                            System.out.println("(1 Yes \n(2 No");
                            battleChoice=scan.nextInt();
                            if(battleChoice==1)
                            {
                                dmg=(ranged*bElixirBuff);
                                mobHealth=mobHealth-dmg;
                                numOfFlameArrow-=1;
                                flameDMG=true;
                                System.out.println("You shot the goblin with your bow. Dealt "+dmg+" leaving it with "+goblinHealth+" health. You have "+numOfFlameArrow+" flame arrows left.");
                            }
                        }
                        if(battleChoice==2 || numOfFlameArrow<=0)
                        {
			dmg=(ranged*bElixirBuff);
			mobHealth=mobHealth-dmg;
			numOfArrow-=1;
			System.out.println("You shot the goblin with your bow. dealt "+dmg+" leaving it with "+goblinHealth+". You have "+numOfArrow+" arrows left.");
			dmg=0;
                        }
                        if(bloonBombInAir=true)
                        {
                            System.out.println("Your arrow popped the bloon bomb dropping it from the sky dealing 50 damadge!");
                            goblinHealth-=50;
                        }
                        battleChoice=2;
                        dmg=0;
		}
		else if(battleChoice==2 && numOfArrow<=0 && numOfFlameArrow<=0)
		{
			System.out.println("Out of arrows. Please try again.");
			dmg=0;
		}
		else if(battleChoice==3 && numOfMana>0)
		{
			dmg=(magic* magicalMultiplier)*bElixirBuff;
			mobHealth=mobHealth-dmg;
			System.out.println("You cast a magical spell on the goblin dealing "+dmg+" damage leaving the goblin with "+goblinHealth+" health. Your magic fluctuated and had a multiplier of "+magicalMultiplier);
			numOfMana-=1;
			System.out.println("You depleted your mana by 1 leaving you with "+numOfMana);
			dmg=0;
			battleChoice=0;
			}
		else if(battleChoice==3 && numOfMana<=0)
		{
			System.out.println("You ran out of mana magic won’t work!");
			numOfMana=0;
			dmg=0;
		}
		else if(battleChoice == 4)
		{
			System.out.println("Choose which of the following you want to use press 5 to leave your inventory.");
			if(numOfHE > 0)
			{
                            System.out.println("(1		Health Elixir >>> "+numOfHE);
			}
			if(numOfBE > 0)
			{
                            System.out.println("(2		Battle Elixir >>> "+numOfBE);
			}

                        if(numOfME > 0)
			{
                            System.out.println("(3		Mana Elixir >>> "+numOfME);
			}
			if(numOfBloonBombs>0)
                        {
                            System.out.println("(4              Bloon Bombs >>> "+numOfBloonBombs);
                        }
			inventoryD=scan.nextInt();
			if(inventoryD>4 || inventoryD<=0)
			{
				System.out.println("Wasted a turn rummaging through your bag.");
			}
                        else if(inventoryD==1 && numOfHE<=0)
                        {
                            System.out.println("Wasted a turn rummaging through your bag");
                        }
			else if(inventoryD==1)
			{
				battleHealth=battleHealth+(health/2);
                                if(battleHealth>health)
                                {
                                    battleHealth=battleHealth-(battleHealth-health);
                                }
				numOfHE-=1;
				System.out.println("Used health elixir. \nHealth is at "+battleHealth);
			}
                        else if(inventoryD==2 && numOfBE<=0)
                        {
                            System.out.println("Wasted a turn rummaging through your bag.");
                        }
			else if(inventoryD==2)
			{
				numOfBE-=1;
				bElixirBuff=1.5;
				System.out.println("You feel the battle elixir flowing through your muscles! Attack x1.5!");
			}
                        else if(inventoryD==3 && numOfME<=0)
                        {
                            System.out.println("Wasted a turn rummaging through your bag.");
                        }
			else if(inventoryD==3)
			{
				numOfMana+=2;
				System.out.println("You drank a mana elixir you felt the magic course through your lifeblood.");
                                System.out.println("+2 Mana");
			}
                        else if(inventoryD==4 && numOfBloonBombs<=0)
                        {
                            System.out.println("Wasted a turn rummaging through your bag.");
                        }
                        else if(inventoryD==4)
                        {
                            bloonBombInAir=true;
                            System.out.println("You let a bloon bomb rise up into the air floating above the enemie's head.");
                            numOfBloonBombs-=1;
                        }
		}
			
			dmgToPlayer=randomGen.nextInt(3)-1;
			battleHealth=battleHealth-dmgToPlayer;
			goblinSpeed=randomGen.nextInt(6)-1;
			if(battleHealth>0 && goblinSpeed>speed)
			{
                        System.out.println("The goblin lept and attacked you dealing "+dmgToPlayer+" damage leaving you with "+battleHealth+" health.");
                        }
                        else if(speed>goblinSpeed)
			{
				System.out.println("You outsped the goblin and dodged his attack");
			}

			if(battleHealth<=0)
			{
			System.out.println("The goblin killed you. x_x ");
                        System.out.println();
			endDecider=false;
                        battleChoice=385;
			}
			if(mobHealth >0)
                        {
                        System.out.println("Scroll up to view battle results.");
                        System.out.println("Next Turn");
                        System.out.println();
                        System.out.println(" (1 physical attack	(2 ranged attack");
			System.out.println("(3  magic attack		(4 Inventory");
			battleChoice=scan.nextInt();
                        }
                        }
        if(battleChoice==385)
        {
            endDecider=false;
            break;
        }
                        //End of 1st battle
        System.out.println();
	System.out.println(friendName+": That was splendid! You look a little beat up why don’t I help you?");
	dmg=0;
	goblinHealth=0;
	battleHealth=health;
	bElixirBuff=0.0;
	battleChoice=0;
	dmg=0;
	System.out.println("In the distance the beat up goblins ran off glaring back angrily.");
	System.out.println("Farmer Garson: Hey thanks for fighting off those beasts.Here is some payment for your help!");
	if(warriorClass==1)
	{
        System.out.println("Farmer Garson gave you 1 health elixir");
        numOfHE+=1;
	}
	

else if(warriorClass==2)
	{
		System.out.println("Farmer Garson gave you 3 arrows.");
		numOfArrow+=3;
	}
	else if(warriorClass==3)
	{
		System.out.println("Farmer Garson gave you a Battle Elixir");
		numOfBE+=1;
	}
	else if(warriorClass==4)
	{
		System.out.println("Farmer Garson gave you a Mana Elixir");
		numOfME+=1;
	}
	System.out.println();
	System.out.println(friendName+": "+name+" good news villagers have already heard of our heroic deed. Another village wants help with a snake issue.");
	System.out.println("The village would pay us handsomely. Or would you like to put your gold to some good use?");
	System.out.println(" (1 to take care of the snakes (2 to stay at the village a little longer.");
	int d4=scan.nextInt();
        int d5=0;
        double swordDisplayRank=rankOfSword+1;
        int shopDecision=0;
        int costOfSword=50;
        int costOfArmor=45;
        int costOfBow=30;
        int numOfItemPurchase=0;
	if(d4==2)
	{
		System.out.println("You walk into the village square a dosen smells fly by. You hear children laughing and playing. Merchants bicker trying to haggle one another for the best price.");
		System.out.println("There are 4 shops in the village square.");
		System.out.println("You can go to: \n (1 Swordy McSword’s blacksmithing or something \n (2 Loafy Joan’s travel armor \n (3  Quincy’s Archery and Inflatables \n (4 Harry’s Wand Shop \n (5 Gold Summoner \n (6 Snake Village");
                d5=scan.nextInt();
                boolean inTown=true;
                //shop code
                while(inTown)
                {
                    if(d5==329)
                    {
                        shopDecision=0;
                        System.out.println("Would you like to (1 leave or (2 stay in town?");
                        shopDecision=scan.nextInt();
                        if(shopDecision==1)
                        {
                            inTown=false;
                        }
                        else if(shopDecision==2)
                        {
                            System.out.println("You can go to: \n (1 Swordy McSword’s blacksmithing or something \n (2 Loafy Joan’s travel armor \n (3  Quincy’s Archery and inflatables \n (4 Harry’s Wand Shop \n (5 Gold Summoner");
                            d5=scan.nextInt();
                        }
                    }
                    else if(d5>6 || d5<0 )
                    {
                        System.out.println("Invalid decision please try again.");
                        System.out.println("You can go to: \n (1 Swordy McSword’s blacksmithing or something \n (2 Loafy Joan’s travel armor \n (3  Quincy’s Archery and inflatables \n (4 Harry’s Wand Shop \n (5 Gold Summoner");
                        d5=scan.nextInt();
                    }
                    while (d5==1)
                    //Code for Sword shop
                    {
                        System.out.println("You have "+gold+" gold.");
                        System.out.println("McSwordy: See anytang ya like?");
                        if(swordDisplayRank<10)
                        {
                        System.out.println("(1 Sword    rank "+swordDisplayRank+" >>> "+costOfSword+" gold");
                        }
                        else
                        {
                            System.out.println("Max Sword Rank!");
                        }
                        if(haveStoneStomper=false)
                        {
                        System.out.println("(2 Stone Stomper >>> 250 gold");
                        }
                        else
                        {
                            System.out.println("(3 Flame Sword >>> 600 gold");
                        }
                        System.out.println("(4 Leave shop");
                        shopDecision=scan.nextInt();
                        if(shopDecision==1 && swordDisplayRank<10)
                        {
                            shopDecision=0;
                            System.out.println("Are you sure you want to purchase a rank"+swordDisplayRank+" sword?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1 && gold>=costOfSword)
                            {
                                System.out.println("You got a rank "+swordDisplayRank+" sword! +10 attack for melee!");
                                melee+=10;
                                gold-=costOfSword;
                                System.out.println("You have "+gold+" gold left after you bought a rank "+swordDisplayRank+" sword?");
                                swordDisplayRank+=1;
                                costOfSword+=100;
                            }
                            else if(shopDecision==1 && gold<costOfSword)
                            {
                                System.out.println("Swordy McSwordy: Not enough gold.");
                            }
                            shopDecision=0;
                        }
                        else if(shopDecision==2 && gold>=250)
                        {
                            System.out.println("Are you sure you want to purchase a Stone Stomper?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You got a Stone Stomper Club! Does triple damadge to stone enemies!");
                                gold-=250;
                                System.out.println("You have "+gold+" gold left after you bought the Stone Stomper.");
                                haveStoneStomper=true;
                            }
                        }
                        else if(shopDecision==2 && gold<250)
                        {
                            System.out.println("Swordy McSwordy: Not enough gold!");
                            shopDecision=0;
                        }
                        else if(shopDecision==3 && haveStoneStomper==true && gold>=600)
                        {
                            System.out.println("Are you sure you would like to buy a Flame Sword?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You got a Flame Sword! Leaves a burning affect on non-stone enemies!");
                                gold-=600;
                                System.out.println("You have "+gold+" gold left after you bought the Flame Sword.");
                                haveFlameSword=true;
                            }
                        }
                        else if(shopDecision==3 && haveStoneStomper==true && gold<=600)
                        {
                            System.out.println("Swordy McSwordy: Not enough gold");
                        }
                        else if(shopDecision==3 && haveStoneStomper==false)
                        {
                            System.out.println("Swordy McSwordy: Ya intrestin my empty space? I'm a get a new sword in that slot soon enough.");
                        }
                        else if(shopDecision==4)
                        {
                            System.out.println("Swordy McSwordy: See ya later! \n You left Swordy McSword's blacksmithing or something.");
                            d5=329;
                        }
                        else if(shopDecision>4 || shopDecision<0)
                        {
                            System.out.println("Invalid decision please try again \n");
                        }
                        shopDecision=0;
                    }
                    //Code for amor shop
                    while(d5==2)
                    {
                        System.out.println("You have "+gold+" gold.");
                        System.out.println("Loafy Jones: I have quite the armor selection.");
                        if(armorRank<10)
                        {
                            System.out.println("(1 rank "+armorRank+1+"Chain Mail >>> "+costOfArmor+" gold");
                        }
                        else if(armorRank>10)
                        {
                            System.out.println("Max Level of Armor!");
                        }
                        if(hasArmorBarbs==false)
                        {
                            System.out.println("(2 Install armor barbs >>> 300 gold");
                        }
                        else if(hasArmorBarbs==true && hasQuickShoes==false)
                        {
                            System.out.println("(3 Quick Shoes >>> 500 gold");
                        }
                        System.out.println("(4 Leave the shop");
                        shopDecision=scan.nextInt();
                        if(shopDecision==1 && gold>=costOfArmor)
                        {
                            System.out.println("Are you sure you want to buy rank "+armorRank+1+" Chain Mail  for "+costOfArmor+" gold?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You bought rank "+armorRank+" Chain Mail! +10 health!");
                                gold-=costOfArmor;
                                System.out.println("You have "+gold+" gold left.");
                                health+=10;
                                armorRank+=1;
                                costOfArmor+=100;
                            }
                        }
                        else if(shopDecision==1 && gold<costOfArmor)
                        {
                            System.out.println("Loafy Jones: Not enough gold.");
                        }
                        else if(shopDecision==1 && armorRank==10)
                        {
                            System.out.println("Loafy Jones: Can you quit staring at my empty armor rack? You already have my best armor.");
                        }
                        if(shopDecision==2 && gold>=300 && hasArmorBarbs==false)
                        {
                            System.out.println("Are you sure you want to have armor barbs installed?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You got armor barbs installed!");
                                gold-=300;
                                System.out.println("You have "+gold+" gold left.");
                                hasArmorBarbs=true;
                                System.out.println("New Product In Shop! \n     **Quick Shoes**");
                            }
                            shopDecision=0;
                        }
                        else if(shopDecision==2 && gold<300 && hasArmorBarbs==false)
                        {
                            System.out.println("Loafy Jones: Not enough gold");
                        }
                        else if(shopDecision==2 && hasArmorBarbs==true)
                        {
                            System.out.println("Loafy Jones: Can you quit staring at my empty armor rack? You already have your armor barbs installed.");
                        }
                        if(shopDecision==3 && hasArmorBarbs==true && hasQuickShoes==false && gold>=500)
                        {
                            System.out.println("Are you sure you want to buy quick shoes?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You got quick shoes! +5 speed.");
                                hasQuickShoes=true;
                                speed+=5;
                                gold-=500;
                                System.out.println("You have "+gold+" gold left after you bought quick shoes.");
                                shopDecision=0;
                            }
                        }
                        else if(shopDecision==3 && hasArmorBarbs==false)
                        {
                            System.out.println("Loafy Jones: Can you quit staring at my empty shoe rack? I'll get new products in soon.");
                        }
                        else if(shopDecision==3 && hasArmorBarbs==true && gold<500)
                        {
                            System.out.println("Loafy Jones: Not enough gold.");
                        }
                        else if(shopDecision==3 && hasArmorBarbs==true && hasQuickShoes==true)
                        {
                            System.out.println("Loafy Jones: You already got quick shoes.");
                        }
                        if(shopDecision==4)
                        {
                            System.out.println("Loafy Jones: See ya later!");
                            System.out.println("\nYou left Loafy Jone's Travel Armor");
                            d5=329;
                        }
                        
                    }
                    //Archery Shop Code
                    while(d5==3)
                    {
                        if(bowRank<10)
                        {
                            System.out.println("(1 Rank "+bowRank+1+" bow >>> "+costOfBow+" gold");
                        }
                        else if(bowRank==10)
                        {
                            System.out.println("Max Bow Rank");
                        }
                        System.out.println("(2 Arrows >>> 5 gold");
                        if(haveBeatenSerpentine==true)
                        {     
                        System.out.println("(3 Flame Arrow >>> 20 gold");
                        }       
                        if(haveBeatenSerpentine==false)
                        {
                            System.out.println("New Item To Be In Stock");
                        }
                        System.out.println("(4 Bloon Bomb >>> 100 gold");
                        System.out.println("(5 Leave shop");
                        shopDecision=scan.nextInt();
                        if(shopDecision==1 && gold>=costOfBow && bowRank<10)
                        {
                            System.out.println("Are you sure you want to purchase a rank "+bowRank+1+" bow?");
                            System.out.println("(1 Yes \n (2 No");
                            shopDecision=scan.nextInt();
                            if(shopDecision==1)
                            {
                                System.out.println("You got a rank "+bowRank+1+" bow! +10 ranged damadge!");
                                gold-=costOfBow;
                                bowRank+=1;
                                System.out.println("You have "+gold+" gold left after you bought a rank "+bowRank+" bow.");
                                costOfBow+=100;
                                ranged+=10;
                            }
                        }
                        else if(shopDecision==1 && bowRank==10)
                        {
                            System.out.println("Quincy: Sorry sir you already have a max level bow. Nothing should get past it! (except maybe a DDT)");
                        }
                        else if(shopDecision==1 && gold<costOfBow)
                        {
                            System.out.println("Quincy: Not quite enough gold.");
                        }
                        if(shopDecision==2)
                        {
                            System.out.println("The maximum amount of arrows you can buy is "+gold/5);
                            System.out.println("How many arrows do you want?");
                            numOfItemPurchase=scan.nextInt();
                            if(numOfItemPurchase*5>gold)
                            {
                                System.out.println("Quincy: Not enough gold for "+numOfItemPurchase+" arrows.");
                            }
                            else if(numOfItemPurchase*5<=gold)
                            {
                                System.out.println("Are you sure you want to buy "+numOfItemPurchase+" arrows?");
                                System.out.println("(1 Yes \n (2 No");
                                shopDecision=scan.nextInt();
                                if(shopDecision==1)
                                {
                                    System.out.println("You got "+numOfItemPurchase+" arrows.");
                                    numOfArrow+=numOfItemPurchase;
                                }
                                shopDecision=0;
                                numOfItemPurchase=0;
                            }
                        }
                        if(shopDecision==3 && haveBeatenSerpentine==false)
                        {
                            System.out.println("Quincy: Oh thats my spot for some arrows that will pack a real punch against lead bloons!");
                        }
                        else if(shopDecision==3)
                        {
                            System.out.println("The maximum amount of flame arrows you can buy is "+gold/20);
                            System.out.println("How many flame arrows do you want?");
                            numOfItemPurchase=scan.nextInt();
                            if(numOfItemPurchase*20>gold)
                            {
                                System.out.println("Quincy: Not enough gold for "+numOfItemPurchase+" flame arrows.");
                            }
                            else if(numOfItemPurchase*20<=gold)
                            {
                                System.out.println("Are you sure you want to buy "+numOfItemPurchase+" flame arrows?");
                                System.out.println("(1 Yes \n (2 No");
                                shopDecision=scan.nextInt();
                                if(shopDecision==1)
                                {
                                    System.out.println("You got "+numOfItemPurchase+" flame arrows.");
                                    numOfFlameArrow+=numOfItemPurchase;
                                }
                                shopDecision=0;
                                numOfItemPurchase=0;
                            }
                        }
                        if(shopDecision==4)
                        {
                            System.out.println("The maximum amount of bloon bombs you can buy is "+gold/100);
                            System.out.println("How many bloon bombs do you want?");
                            numOfItemPurchase=scan.nextInt();
                            if(numOfItemPurchase*100>gold)
                            {
                                System.out.println("Quincy: Not enough gold for "+numOfItemPurchase+" bloon bombs.");
                            }
                            else if(numOfItemPurchase*100<=gold)
                            {
                                System.out.println("Are you sure you want to buy "+numOfItemPurchase+" bloon bombs?");
                                System.out.println("(1 Yes \n (2 No");
                                shopDecision=scan.nextInt();
                                if(shopDecision==1)
                                {
                                    System.out.println("You got "+numOfItemPurchase+" bloon bombs.");
                                    numOfBloonBombs+=numOfItemPurchase;
                                }
                                shopDecision=0;
                                numOfItemPurchase=0;
                            }
                        }
                        if(shopDecision==5)
                        {
                            System.out.println("Quincy: Come back soon!");
                            System.out.println("\nYou left Quincy's Archery and Inflatibles");
                            d5=329;
                        }
                    }
                    //Wizard Shop Code
                    while(d5==4)
                    {
                        System.out.println("Harry: Can you close the door? *sigh* \n~Wingardion Leviosa~ \nA stool floats up and pushes the door closed.");
                        
                        
                    }
                    
                    
                }
	}
        
//Bottom
}
if(endDecider==false)
{
        System.out.println("-----      /\\    |\\     /|    |-----       ------    \\    /   |----    ___");
		System.out.println("|  _      /  \\   | \\  /  |    |-----       |    |     \\  /    |----   |___|");
		System.out.println("|___|    /    \\  |  \\/   |    |_____       |____|      \\/     |____   |  \\");
}
}
}








