public class App {
    public static void main(String[] args) {

        //Character Class
        Character barbarian = new Character();

        barbarian.strength = 20;
        barbarian.agility = 10;
        barbarian.intelligence = 5;
        barbarian.name = "Viking";
        barbarian.sayMyName1();

        Character archer = new Character();

        archer.strength = 15;
        archer.agility = 10;
        archer.intelligence = 10;
        archer.name = "Arrow";
        archer.sayMyName2();

        Character goblin = new Character();

        goblin.strength = 30;
        goblin.agility = 20;
        goblin.intelligence = 20;
        goblin.name = "Sneaky";
        goblin.sayMyName3();
      
        Character healer = new Character();

        healer.strength = 20;
        healer.agility = 15;
        healer.intelligence = 10;
        healer.name = "Barbara";
        healer.sayMyName4();

        //Enemy Class
        Enemy king = new Enemy();

        king.damage = 90;
        king.health = 100;
        king.armor = 80;
        king.MagicImmunity = true;
        king.name = "Frost King";
        king.enemyDialogueKing();

        Enemy cthulhu = new Enemy();

        cthulhu.damage = 100;
        cthulhu.health = 70;
        cthulhu.armor = 90;
        cthulhu.speed = 100;
        cthulhu.MagicImmunity = false;
        cthulhu.name = "Eye of Cthulhu";
        cthulhu.enemyDialogueCthulhu();

        Enemy draco = new Enemy();

        draco.damage = 100;
        draco.health = 60;
        draco.armor = 80;
        draco.MagicImmunity = false;
        draco.name = "Dracarys";
        draco.enemyDialogueDracarys();

        //Gear
        
        Gear hat = new Gear();

        hat.type = "gauntlet";
        hat.name = "hatty";
        hat.rarity = "Epic";
        hat.weight = 28;
        hat.description = " an Epic gauntlet owned by Frost King ";

        hat.sayGearDescription();
        hat.showAllAttributes();
    
    }

}
