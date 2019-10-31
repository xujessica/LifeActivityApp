package com.example.lifeactivityapp;

public class Movies {
    private String name;
    private String description;
    private String rating;

    // Inlcude rating and date released when done with main functionality of project

    public Movies(String name, String rating, String description){
        this.name = name;
        this.rating = rating;
        this.description = description;
    }

    public static final Movies[] Action = {
            new Movies("Joker","8.9", "Forever alone in a crowd, failed comedian Arthur Fleck seeks connection as he walks the streets of Gotham City. Arthur wears two masks -- the one he paints for his day job as a clown, and the guise he projects in a futile attempt to feel like he's part of the world around him. Isolated, bullied and disregarded by society, Fleck begins a slow descent into madness as he transforms into the criminal mastermind known as the Joker."),
            new Movies("Spiderman","7.3", "\"Spider-Man\" centers on student Peter Parker (Tobey Maguire) who, after being bitten by a genetically-altered spider, gains superhuman strength and the spider-like ability to cling to any surface. He vows to use his abilities to fight crime, coming to understand the words of his beloved Uncle Ben: \"With great power comes great responsibility.\""),
            new Movies("Avengers","8.0", "When Thor's evil brother, Loki (Tom Hiddleston), gains access to the unlimited power of the energy cube called the Tesseract, Nick Fury (Samuel L. Jackson), director of S.H.I.E.L.D., initiates a superhero recruitment effort to defeat the unprecedented threat to Earth. Joining Fury's \"dream team\" are Iron Man (Robert Downey Jr.), Captain America (Chris Evans), the Hulk (Mark Ruffalo), Thor (Chris Hemsworth), the Black Widow (Scarlett Johansson) and Hawkeye (Jeremy Renner)."),
            new Movies("Fast and Furious","6.6", "Dominic Toretto is forced to come out of hiding when a loved one is brutally murdered. Heading to LA to track down the culprit, he crosses paths with Brian O'Connor, the FBI agent whose undercover infiltration of Toretto's gang led to the motorised miscreant's exile across the border. The two men temporarily put their differences aside as they investigate the killing."),
            new Movies("Die Hard","8.2", "New York City policeman John McClane (Bruce Willis) is visiting his estranged wife (Bonnie Bedelia) and two daughters on Christmas Eve. He joins her at a holiday party in the headquarters of the Japanese-owned business she works for. But the festivities are interrupted by a group of terrorists who take over the exclusive high-rise, and everyone in it. Very soon McClane realizes that there's no one to save the hostages -- but him."),
            new Movies("Mad Max","8.1", "Years after the collapse of civilization, the tyrannical Immortan Joe enslaves apocalypse survivors inside the desert fortress the Citadel. When the warrior Imperator Furiosa (Charlize Theron) leads the despot's five wives in a daring escape, she forges an alliance with Max Rockatansky (Tom Hardy), a loner and former captive. Fortified in the massive, armored truck the War Rig, they try to outrun the ruthless warlord and his henchmen in a deadly high-speed chase through the Wasteland."),
            new Movies("Expendables","6.5", "A group of mercenaries is double-crossed during a mission and are approached by Church to overthrow the ruthless dictator of a South American country. It isn't long before the men realise things aren't quite as they appear, finding themselves caught in a dangerous web of betrayal. Although their mission is compromised and an innocent is in danger, soldier of fortune Barney and his comrades decide to get the job done."),
            new Movies("Terminator","8.0", "Disguised as a human, a cyborg assassin known as a Terminator (Arnold Schwarzenegger) travels from 2029 to 1984 to kill Sarah Connor (Linda Hamilton). Sent to protect Sarah is Kyle Reese (Michael Biehn), who divulges the coming of Skynet, an artificial intelligence system that will spark a nuclear holocaust. Sarah is targeted because Skynet knows that her unborn son will lead the fight against them. With the virtually unstoppable Terminator in hot pursuit, she and Kyle attempt to escape. "),
    };

    public static final Movies[] Comedy = {
            new Movies("Napolean's Dynamite","6.9", "In small-town Preston, Idaho, awkward teen Napoleon Dynamite (Jon Heder) has trouble fitting in. After his grandmother is injured in an accident, his life is made even worse when his strangely nostalgic uncle, Rico (Jon Gries), shows up to keep an eye on him. With no safe haven at home or at school, Napoleon befriends the new kid, Pedro (Efren Ramirez), a morose Hispanic boy who speaks little English. Together the two launch a campaign to run for class president"),
            new Movies("Bridesmaids","6.8", "Annie (Kristen Wiig) is a single woman whose own life is a mess, but when she learns that her lifelong best friend, Lillian (Maya Rudolph), is engaged, she has no choice but to serve as the maid of honor. Though lovelorn and almost penniless, Annie, nevertheless, winds her way through the strange and expensive rituals associated with her job as the bride's go-to gal. Determined to make things perfect, she gamely leads Lillian and the other bridesmaids down the wild road to the wedding."),
            new Movies("Mean Girls","7.0", "Teenage Cady Heron (Lindsay Lohan) was educated in Africa by her scientist parents. When her family moves to the suburbs of Illinois, Cady finally gets to experience public school and gets a quick primer on the cruel, tacit laws of popularity that divide her fellow students into tightly knit cliques. She unwittingly finds herself in the good graces of an elite group of cool students dubbed \"the Plastics,\" but Cady soon realizes how her shallow group of new friends earned this nickname."),
            new Movies("The Hangover","7.7", "Two days before his wedding, Doug (Justin Bartha) and three friends (Bradley Cooper, Ed Helms, Zach Galifianakis) drive to Las Vegas for a wild and memorable stag party. In fact, when the three groomsmen wake up the next morning, they can't remember a thing; nor can they find Doug. With little time to spare, the three hazy pals try to re-trace their steps and find Doug so they can get him back to Los Angeles in time to walk down the aisle."),
            new Movies("Grown Ups","5.9", "A single man who drinks too much. A father with three daughters who he rarely sees. A guy who is overweight and unemployed. A hen-pecked househusband. A successful Hollywood agent married to a fashion designer. What do these five men have in common? They used to play for the same basketball team at school. Now their former coach has died, and they are reunited at his funeral. Will the group rediscover old bonds?"),
            new Movies("Deadpool","8.0", "Wade Wilson (Ryan Reynolds) is a former Special Forces operative who now works as a mercenary. His world comes crashing down when evil scientist Ajax (Ed Skrein) tortures, disfigures and transforms him into Deadpool. The rogue experiment leaves Deadpool with accelerated healing powers and a twisted sense of humor. With help from mutant allies Colossus and Negasonic Teenage Warhead (Brianna Hildebrand), Deadpool uses his new skills to hunt down the man who nearly destroyed his life."),
            new Movies("Legally Blonde","6.2", "Elle Woods (Reese Witherspoon) has it all. She wants nothing more than to be Mrs. Warner Huntington III. But there is one thing stopping him (Matthew Davis) from proposing: She is too blond. Elle rallies all of her resources and gets into Harvard, determined to win him back."),
            new Movies("Dumb and Dumber","7.3", "Imbecilic best friends Lloyd Christmas (Jim Carrey) and Harry Dunne (Jeff Daniels) stumble across a suitcase full of money left behind in Harry's car by Mary Swanson (Lauren Holly), who was on her way to the airport. The pair decide to go to Aspen, Colo., to return the money, unaware that it is connected to a kidnapping. As Harry and Lloyd -- who has fallen in love with Mary -- are pursued across the country by hired killers and police, they find both their friendship and their brains tested.")
    };

    public static final Movies[] Romance = {
            new Movies("The Notebook","7.8", "In 1940s South Carolina, mill worker Noah Calhoun (Ryan Gosling) and rich girl Allie (Rachel McAdams) are desperately in love. But her parents don't approve. When Noah goes off to serve in World War II, it seems to mark the end of their love affair. In the interim, Allie becomes involved with another man (James Marsden). But when Noah returns to their small town years later, on the cusp of Allie's marriage, it soon becomes clear that their romance is anything but over."),
            new Movies("50 First Dates","6.8", "Playboy vet Henry sets his heart on romancing Lucy, but she has short-term memory loss; she can't remember anything that happened the day before. So every morning, Henry has to woo her again. Her friends and family are very protective, and Henry must convince them that he's in it for love."),
            new Movies("How to Lose a Guy in 10 days","", ""),
            new Movies("A Walk to Remember","6.4", "An advice columnist, Andie Anderson (Kate Hudson), tries pushing the boundaries of what she can write about in her new piece about how to get a man to leave you in 10 days. Her editor, Lana (Bebe Neuwirth), loves it, and Andie goes off to find a man she can use for the experiment. Enter executive Ben Berry (Matthew McConaughey), who is so confident in his romantic prowess that he thinks he can make any woman fall in love with him in 10 days. When Andie and Ben meet, their plans backfire."),
            new Movies("The Longest Ride","7.1", "Former bull-riding champion Luke (Scott Eastwood) and college student Sophia (Britt Robertson) are in love, but conflicting paths and ideals threaten to tear them apart: Luke hopes to make a comeback on the rodeo circuit, and Sophia is about to embark on her dream job in New York's art world. As the couple ponder their romantic future, they find inspiration in Ira (Alan Alda), an elderly man whose decades-long romance with his beloved wife withstood the test of time."),
            new Movies("Crazy Rich Asians","6.9", "Rachel Chu is happy to accompany her longtime boyfriend, Nick, to his best friend's wedding in Singapore. She's also surprised to learn that Nick's family is extremely wealthy and he's considered one of the country's most eligible bachelors. Thrust into the spotlight, Rachel must now contend with jealous socialites, quirky relatives and something far, far worse -- Nick's disapproving mother."),
            new Movies("To All The Boys I've Loved","7.2", "A teenage girl's love letters are exposed and wreak havoc on her life."),
            new Movies("Always Be My Maybe","6.8", "Childhood sweethearts have a falling out and don't speak for 15 years, only reconnecting as adults when Sasha runs into Marcus in San Francisco. Although the old sparks are still there, the couple live in different worlds."),
    };

    public static final Movies[] Kids = {
            new Movies("Frozen ","7.5", "When their kingdom becomes trapped in perpetual winter, fearless Anna (Kristen Bell) joins forces with mountaineer Kristoff (Jonathan Groff) and his reindeer sidekick to find Anna's sister, Snow Queen Elsa (Idina Menzel), and break her icy spell. Although their epic journey leads them to encounters with mystical trolls, a comedic snowman (Josh Gad), harsh conditions, and magic at every turn, Anna and Kristoff bravely push onward in a race to save their kingdom from winter's cold grip."),
            new Movies("The Lion King","8.5", "This Disney animated feature follows the adventures of the young lion Simba (Jonathan Taylor Thomas), the heir of his father, Mufasa (James Earl Jones). Simba's wicked uncle, Scar (Jeremy Irons), plots to usurp Mufasa's throne by luring father and son into a stampede of wildebeests. But Simba escapes, and only Mufasa is killed. Simba returns as an adult (Matthew Broderick) to take back his homeland from Scar with the help of his friends Timon (Nathan Lane) and Pumbaa (Ernie Sabella)."),
            new Movies("Abominable","7.1", "After discovering a Yeti on the roof of her apartment building, teenage Yi and her two friends embark on an epic quest to reunite the magical creature with his family. But to do so, they must stay one step ahead of a wealthy financier and a determined zoologist who want to capture the beast for their own gain."),
            new Movies("Toy Story","8.3", "Woody (Tom Hanks), a good-hearted cowboy doll who belongs to a young boy named Andy (John Morris), sees his position as Andy's favorite toy jeopardized when his parents buy him a Buzz Lightyear (Tim Allen) action figure. Even worse, the arrogant Buzz thinks he's a real spaceman on a mission to return to his home planet. When Andy's family moves to a new house, Woody and Buzz must escape the clutches of maladjusted neighbor Sid Phillips (Erik von Detten) and reunite with their boy."),
            new Movies("Coco","8.4", "Despite his family's generations-old ban on music, young Miguel dreams of becoming an accomplished musician like his idol Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead. After meeting a charming trickster named Héctor, the two new friends embark on an extraordinary journey to unlock the real story behind Miguel's family history."),
            new Movies("Moana","7.6", "An adventurous teenager sails out on a daring mission to save her people. During her journey, Moana meets the once-mighty demigod Maui, who guides her in her quest to become a master way-finder. Together they sail across the open ocean on an action-packed voyage, encountering enormous monsters and impossible odds. Along the way, Moana fulfills the ancient quest of her ancestors and discovers the one thing she always sought: her own identity."),
            new Movies("Inside Out","8.2", "Riley (Kaitlyn Dias) is a happy, hockey-loving 11-year-old Midwestern girl, but her world turns upside-down when she and her parents move to San Francisco. Riley's emotions -- led by Joy (Amy Poehler) -- try to guide her through this difficult, life-changing event. However, the stress of the move brings Sadness (Phyllis Smith) to the forefront. When Joy and Sadness are inadvertently swept into the far reaches of Riley's mind, the only emotions left in Headquarters are Anger, Fear and Disgust."),
            new Movies("Cars","7.1", "While traveling to California to race against The King (Richard Petty) and Chick Hicks (Michael Keaton) for the Piston Cup Championship, Lightning McQueen (Owen Wilson) becomes lost after falling out of his trailer in a run down town called Radiator Springs. While there he slowly befriends the town's odd residents, including Sally (Bonnie Hunt), Doc Hudson (Paul Newman) and Mater (Larry the Cable Guy). When it comes time for him to leave to championship is no longer his top priority."),
    };

    public String getName() {
        return name;
    }

    public static Movies[] getAction() {
        return Action;
    }
    public static Movies[] getComedy() {
        return Comedy;
    }
    public static Movies[] getRomance() {
        return Romance;
    }
    public static Movies[] getKids() {
        return Kids;
    }


    public String toString(){ return name;}

}
