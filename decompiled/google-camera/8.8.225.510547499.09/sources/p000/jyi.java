package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jyi implements jyc {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f35174a;

    public jyi(int i) {
        this.f35174a = i;
    }

    @Override // p000.jyc
    /* JADX INFO: renamed from: a */
    public final mrm mo13699a(jxp jxpVar, kmg kmgVar, boolean z, mrm mrmVar, mrm mrmVar2, boolean z2, boolean z3) {
        jyg jygVarM13701a;
        jyg jygVarM13701a2;
        switch (this.f35174a) {
            case 0:
                jyd jydVarM13700a = jyd.m13700a(jxpVar);
                jydVarM13700a.getClass();
                jyg jygVarM13817e = jzn.m13817e(kmgVar, jydVarM13700a);
                int iM13818f = jzn.m13818f(jygVarM13817e.f35166g, jxpVar, z, mrmVar, mrmVar2);
                if (z || z3) {
                    jyf jyfVarM13716b = jyg.m13716b(jygVarM13817e);
                    jyfVarM13716b.m13709i(5);
                    jyfVarM13716b.m13711k(true == z3 ? 2 : 1);
                    jyfVarM13716b.m13710j(65536);
                    jyfVarM13716b.m13708h(iM13818f);
                    jygVarM13701a = jyfVarM13716b.m13701a();
                } else {
                    jyf jyfVarM13716b2 = jyg.m13716b(jygVarM13817e);
                    jyfVarM13716b2.m13709i(2);
                    jyfVarM13716b2.m13711k(8);
                    jyfVarM13716b2.m13710j(32768);
                    jyfVarM13716b2.m13708h(iM13818f);
                    jygVarM13701a = jyfVarM13716b2.m13701a();
                }
                if (z2) {
                    jyf jyfVarM13716b3 = jyg.m13716b(jygVarM13701a);
                    jyfVarM13716b3.m13704d(3);
                    jyfVarM13716b3.m13703c(2);
                    jyfVarM13716b3.m13702b(192000);
                    jyfVarM13716b3.m13705e(48000);
                    jygVarM13701a = jyfVarM13716b3.m13701a();
                }
                return mrm.m16829i(jygVarM13701a);
            default:
                jyb jybVarM13698a = jyb.m13698a(jxpVar);
                jybVarM13698a.getClass();
                jyg jygVarM13816d = jzn.m13816d(kmgVar, jybVarM13698a);
                int iM13818f2 = jzn.m13818f(jygVarM13816d.f35166g, jxpVar, z, mrmVar, mrmVar2);
                if (z) {
                    jyf jyfVarM13716b4 = jyg.m13716b(jygVarM13816d);
                    jyfVarM13716b4.m13709i(5);
                    jyfVarM13716b4.m13711k(true == z3 ? 2 : 1);
                    jyfVarM13716b4.m13710j(65536);
                    jyfVarM13716b4.m13708h(iM13818f2);
                    jygVarM13701a2 = jyfVarM13716b4.m13701a();
                } else {
                    jyf jyfVarM13716b5 = jyg.m13716b(jygVarM13816d);
                    jyfVarM13716b5.m13709i(2);
                    jyfVarM13716b5.m13711k(true == z3 ? 16 : 1);
                    jyfVarM13716b5.m13710j(32768);
                    jyfVarM13716b5.m13708h(iM13818f2);
                    jygVarM13701a2 = jyfVarM13716b5.m13701a();
                }
                if (z2) {
                    jyf jyfVarM13716b6 = jyg.m13716b(jygVarM13701a2);
                    jyfVarM13716b6.m13704d(3);
                    jyfVarM13716b6.m13703c(2);
                    jyfVarM13716b6.m13702b(192000);
                    jyfVarM13716b6.m13705e(48000);
                    jygVarM13701a2 = jyfVarM13716b6.m13701a();
                }
                return mrm.m16829i(jygVarM13701a2);
        }
    }
}
