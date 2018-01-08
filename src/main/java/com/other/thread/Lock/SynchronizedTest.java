package com.other.thread.Lock;

/**
#Unit01 State critical Statue manifestation statistic statistical stationary 
statement understatement overstate statesman politician estate real estate broker 
devastate devastating workstation status assert certainly affirm public publication 
republican publicity publicized publicly in public mass massive civil law claw lawful lawsuit flaw lawyer attorney 
legislation mean odd even average meaning well–meaning meaningless meaningfully means meanwhile by means of by no 
means indicate implication influence dictator influential impact brace for impact have an impact on live alive 
deliver delivery outlive liveliness livelihood live off lay off dwell reside resident survive survival inhabit 
settle cohabitation federal federal bureau of investigation central intelligence agency bureaucracy federation 
large largely enlarge augment at large bulky outsize huge mark market marketplace marked marketer remark remarkable 
landmark milestone touchstone bolt spot stain symbol symptom system systematic systematically regime organization 
structure stress stressed–out highlight emphasize strain string  #Unit02 peer peer at gaze at stare at glare at 
contemproary literature issue critical thinking tissue fuss claim proclaim disclaim acclaim lay claim to allege 
contend assert patent intelligent property court courteous line hardline underline decline refuse reject discipline 
online offline coastline deadline incline inclination baseline airline outline lineage kinship linen pipeline 
guideline in line with series row boundary bound route succession procession value overvalue devalued worth be worth 
of be worth doing significance view interview viewer review reviewer worldview in view of in terms of in view on 
view into account perspective individual individually collective economic uneconomic economics economically 
socioeconomic fiscal cliff IMF financial fiscal monetary currency current create creature creative recreate 
creativity creation creationism creationist procreation breed legal illegal lawful legitimate qualification 
official consider consideration reconsider considerable considering consider as  #Unit03 subject subjective 
objective be subject to be subjected to lead access accessory leadership mislead leader 
plead side with plead for leading lead someone on lead up to take the lead intend intend to do sector section 
separation 
account accountant describe subscribe account for explain exclaim on account of as a result of as a result consumer 
consumption consuming consumerism luxury client environment environmental environmentally environmentalist 
surroundings atmosphere situation essay article thesis matter intellectual substance as a matter of fact substance 
stuff material materialism materialistic fund grant fundamental fundamentally nonfundamentalist radicalism underfund 
hold household holder withhold shareholder shareholding stockholder stakeholder hold back hold on hold out hold up 
cling withstand undertake seize function functional work employ masterpiece evidence evident obvious proof 
confirmation practice in practice perform performance art note denote noteworthy take notes  #Unit04 degree 
agreement Greek concern concerned unconcerned indifferent care free allow shallow superficial allow for product 
production productive productivity invention level line low–level level off on the level effort toil and moil 
effortless infer inferiority inferior superior inference deference deduce induce conclude professional 
professionalize professinalization professionalism provide provided provider provision supply offer challenge 
mentally physically unchallenged  #Unit05 deal ideal idealism dealing dealership deal with a great deal of 
contract trail track trace trailer contraction inflation structure struct obstruct obstruction obstacle stacle 
restructuring reshuffle retreat rearrange structural infrastructure define content be content with contention 
contend dispute reputation convention controversy self–contented arrogant immigrant migrate immigration emigrate 
comprehension comprehensive potential possible probable mass massive massacre slaughter butcher biomass biography 
rally compare comparable comparison comparative comparatively contrast by contrast in contrast to feature involve volve include involvement intimate intimacy revolve rotate evolve evolution revolution invalid valid validity engage occupy occupation segment section separation segregation fraction fracture fragment access accessible access road cover coverage recovery discover cloak conceal hide cape reveal uncover unveil display disclose analysis analyze anatomy tomb probe  #Unit06 identify identity recognize cognition defy defiance title entitle be entitled with entitlement qualification subtitle doubt skeptic doubter undoubtedly unquestionably doubtful in doubt physical physics geophysical astrophysics spacephysics physician surgeon plastic surgeon material bodily introduce introductory launch initiate initial original figure pose posture gesture figure out conduct semiconductor conductive conductor behavior steer tell teller intellect intellectual intellectualism capitalism socialism intelligent intelligently intelligence satellite inform notify lack blackened slack idle lazy available obtainable accessible emerge emergence emergency emerge from surface originate appear express press journalist press conference expression impress impressive unimpressive depress depression depressant compress pressing oppress suppress rebel rebellion press for state convey consequence sequence in consequence out come contribute tribute contributing contribution contribute to lead to give rise to executive execution death penalty current curve curve diagram sort resort scenery assort classify secure safeguard shield lance free lance threat threaten frighten menace  #Unit07 material materialism materialistic observe observer be obsessed with abide obey obedience survey investigate establish establishment well established establish oneself in launch wonder wander wonderful no wonder approach access to come up to get close to grant immigrant take for ganted position positive negative neglect posture composition composer composed opposition oppose opponent proposition propose disposition character disposable locate site brain brainstorm brain drain drainage term provition item determine consider regard determinedly terminate terminal terminally in terms of clause increasingly increased labor laboratory elaborate painstaking laborsaving collaborate collaboratively workforce mobile mob mobbery detail tail tailor entail career occupation vocation recruit recruitment crew quit resign renounce depart departure department apartment essential necessary vital indispensable dispens irreplaceable core head headache go ahead headline headway headlong headhunter head for chief talent aptitude attitude altitude respect respected respectable considerable respectively irrespectively with respect to concerning in respect of refer to with regard to esteem prestige prestigious maintain retain uphold sustain sustainable primary primarily prime principal principle central  #Unit08 relate integrate integration integrity interrelated correlate correlated be correlated with relate to bond commune mutual commute directly directory guide guild directive indirectly straight stubborn frankly otherwise likewise meanwhile reflect reflect on ponder on reflection unreflecting despite although while in spite of discipline land landlord landscape mainland landing element elevate elevator escalator escalate lift smooth mollify console isolation indicate expose pose purpose propose impose levy compose oppose suppose supposedly assume assumption be composed of ad oppose to be supposed to religion religious suffer suffering epidemic popular flu influenza episode melody addict addictive payment hijack scale circumstance circulate circumscribe restrict confine describe threaten menace frighten intimidate prospect prospective perspective insight insightful  
#Unit09 reject refuse decline rejection discard occur occurrence incur concur happen arise arouse curiosity 
meet assemble resemble simulate symmetry congregate gregarious lady aggregate personal interpersonal personality 
impersonal objective individual private privilege indeed certainly definitely manage manager manageabl controllable 
manipulate steer compel expel management administration administer regulate control recognize unrecognized 
recognition object subject objection objective objectivity objectiveness trust distrust mistrust mislead 
trust fund critical critically hypocritical hypocrite hypocrisy critic maniac immediate immediately instant 
let outlet unseasonal advocate advocacy instance instantly instantaneously spontaneously sponsor simultaneously 
preserve preservative conserve reserve maintain  #Unit10 concept conception preconception conceive conceive of 
notion enhance increase augment enhanced chancellor enhancement boost thrive boast heighten reference parallel 
unparalleled unprecedented precede precedence precedent prior priority parachute chute slide succeed be succeeded by successor inherit herit heredity conscious conscience conscientiously consciousness subconscious be conscious of be aware of deliberate liberate liberal refect on intend intentional by design conservation conserve preserve liberty freedom conservation conserve energy progressive global globalize specialize standardize customize crisis critic criticism muscle muscular robust masculine masculinism feminine feminism presence present absent represent in the presence of gene genetic genealogist generate code encode arrange retail retailer etailer entail upset upsetting disturbance partner partnership counterpart encounter mateship soulmate spouse version converse 
reverse invert avert diversion
 */
public class SynchronizedTest {

    public static  void init(){
        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(1000);
                        Outprint.out("hadoop");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ).start();


        new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(1000);
                        Outprint.out("spark");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        ).start();
    }

    static  class Outprint{
        public static  void out(String str) {
            synchronized (Outprint.class){
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i));
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest.init();
    }
}
