package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jye implements jyc {

    /* JADX INFO: renamed from: a */
    private final jyk f35145a;

    public jye(jyk jykVar) {
        this.f35145a = jykVar;
    }

    @Override // p000.jyc
    /* JADX INFO: renamed from: a */
    public final mrm mo13699a(jxp jxpVar, kmg kmgVar, boolean z, mrm mrmVar, mrm mrmVar2, boolean z2, boolean z3) {
        jyg jygVarM13701a;
        jyg jygVar = this.f35145a.f35185j;
        if (jygVar == null) {
            return mqu.f41450a;
        }
        int iM13818f = jzn.m13818f(jygVar.f35166g, jxpVar, z, mrmVar, mrmVar2);
        if (z) {
            jyf jyfVarM13716b = jyg.m13716b(jygVar);
            jyfVarM13716b.m13709i(5);
            jyfVarM13716b.m13711k(true != z3 ? 1 : 2);
            jyfVarM13716b.m13710j(65536);
            jyfVarM13716b.m13708h(iM13818f);
            jygVarM13701a = jyfVarM13716b.m13701a();
        } else {
            jyf jyfVarM13716b2 = jyg.m13716b(jygVar);
            jyfVarM13716b2.m13709i(2);
            jyfVarM13716b2.m13711k(true != z3 ? 8 : 16);
            jyfVarM13716b2.m13710j(32768);
            jyfVarM13716b2.m13708h(iM13818f);
            jygVarM13701a = jyfVarM13716b2.m13701a();
        }
        return mrm.m16829i(jygVarM13701a);
    }
}
