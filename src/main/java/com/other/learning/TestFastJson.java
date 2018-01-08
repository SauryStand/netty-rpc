package com.other.learning;

/**
 * @Description:
 * @Created by Johnny Chou on 12/28/2017.
 * @Author：
 */
public class TestFastJson {
    static class ThreadA extends  Thread{
        private ThreadB b;
        public ThreadA(ThreadB b){
            this.b = b;
        }
        public void run() {
            synchronized (b){
                try {
                    b.start();
                    b.join(6000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *<p>
     * @author <a href="mailto:jstrachan@apache.org">James Strachan </a>
     * @version $Revision: 1.47 $*
     *		established estate ethical evaluate even eventually evidence evitable evolve exaggerate excel exceptional
    exchange exclude exclusive execute exhausted expect experiment expertise explicit exploit expose extend
    extinct extract extreme exude faculty fair famine fatigue feasible feature fertiliser financial finite fit
    fitness focus on foe format formation fragile fragment freeze frustration fulfill fund fundamental gene germ
    gifted grant graphic guarantee habitat halt harbour hardship harmonize harsh hazard hinder hint hostile hypothesis
    identify ignore illustrate imitate immediately immunity impact impair impede imperative impressive accordance
    inaccessible inaccurate inactive inappropriate incentive induce indulge infest influence inherit initial initiate
    innate installment integrate intelligence intense interaction interference interior interrupt introverted invent
    involve isolate jeopardize keen label lack landscape legal legitimate likelihood limb limitation linguistic link
    log lopsided loss magnetic main mainly malfunction mammal manage manifest manufacture marine massive mate measure
    mechanism mental mercury meteorological method microbe migrate military mimic minimize modify moisture monitor
    moral mortality motif motivate motive mould municipal native necessary neglect nocturnal norm notoriety obey
    objective obligation obscure obstacle obtain odd odour offensive official offset only opportunity optimum option
     * Class {@code Object} is the root of the class hierarchy.
     * Every class has {@code Object} as a superclass. All objects,
     * including arrays, implement the methods of this class.
     *
     * @author  unascribed
     * @see     java.lang.Class
     * @since   JDK1.0

    ordinary organ organize original overcome overlook overtake paralyse paramount participate particular patient
    pattern peak perceive peripheral permit persuade pessimistic phase physical plagiarise plague plenty of plot
    portable pose postpone potential poverty practice praise predict prefer to preference preliminary pressing
    prevent primary principal principle priority private prohibit prolong promote prompt proof property proportion
    prosper provision purify puzzle qualify quantity quotation radical range rare rate rather react realistic realize
    recognize record recreation reduction refer regulation rehearsal reject relative relevant reliance religious
    reluctant rely on replace reproduce resemble resistance respond responsible restriction retain revision revive risk
    rudimentary ruin scenic scope secrete seek setting settle shade shelter shift signal similar skepticism soar solely
    solicitor sophisticate specific spoil spouse stable standard steer stem stimulate stimulus stress stride subdivide
    substance substitute subtle succumb sufficiency suit superior supersede supplement suppress supremacy surpass
    surrounding surveillance survive suspicious sustainable swift syllabus symbol symptom synthetic talented tension
    term that theme therapy threaten throughout tolerate toll toxic trace track trait transcend transit transmit
    tremendous trigger tropical unbiased underestimate underlie unexpectedly uniform utilization valuable vanish
    variety vary vast versatile viable vicinity view violent virus visible visual volume vulnerable wholesome witness
    wreck yield
     *</p>
     * abandon accelerate accumulate acknowledge adapt to addictive adjust admit adversity aggression agreeable aid
    allergic allocate alter alternative altitude analyze ancient and application apply to appreciate approach approve
    array artificial assess assign association assumption assure attempt attitude authority avoid aware bacteria
    barrier based liable subject bear beneficial blight boundary budget bungle burden calamity calculate capacity
    catastrophic cater certify change characteristic chronic civic clue cognitive coin collapse comment commitment
    communal commute compare compatible compensate complicate comply component comprehend conceal concentrate concur
    condemn confer confidential conflict conform confuse conscious conservative considerable constrain consult
    contingent contrast contribute controversial convention conviction cooperation coordinate correlation courtship
    crash credibility criminal crisis criteria criticism cue curb curriculum damp dazzle deadline defeat defect
    deficiency delay delicate delivery demanding democratic demographic dental depend on depression derive designate
    detailed detain detect deter determine devastate diagnose differ differentiate diminish disaster discharge
    disclose disparate display disrupt distinguish distract distribute diversity divert documentation domain domestic
    dominant donate dramatic drought durable dynamics elaborate elderly eliminate eclusive emphasize encyclopaedia
    endanger engagement enormous entertainment entrepreneur environment equal equator erode erratically escape

     * @author Voyager
     * @param qname
     *            is the <code>QName</code> to be associated with this element
     */
    static class  ThreadB extends  Thread{
        public void run() {
            try {
                System.out.println("b run begin timer= " + System.currentTimeMillis());
                Thread.sleep(6000);
                System.out.println("b run end timer=  " + System.currentTimeMillis() );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized public void bService(){
            System.out.println("打印了bservice timer=  " + System.currentTimeMillis());
        }
    }

    static class ThreadC extends  Thread{
        private ThreadB threadB;
        public ThreadC(ThreadB threadB){
            this.threadB = threadB;
        }

        public void run() {
            threadB.bService();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);//这里new的b， join进a
        a.start();
        ThreadC c = new ThreadC(b);
        c.start();   //threadB.bService();方法能被立即调用，说明join方法具有释放锁的特点
    }

}
