package p000;

import com.lingq.feature.onboarding.p014v2.PendingMiniLessonLingq;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qz5 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58417a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f58418b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f58419c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f58420d;

    public /* synthetic */ qz5(vi3 vi3Var, t66 t66Var, t66 t66Var2) {
        this.f58418b = vi3Var;
        this.f58419c = t66Var;
        this.f58420d = t66Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f58417a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f58420d;
        t66 t66Var2 = this.f58419c;
        vi3 vi3Var = this.f58418b;
        switch (i) {
            case 0:
                PendingMiniLessonLingq pendingMiniLessonLingq = (PendingMiniLessonLingq) obj;
                pendingMiniLessonLingq.getClass();
                if (!((Boolean) t66Var2.getValue()).booleanValue()) {
                    vi3Var.invoke(new gv6(pendingMiniLessonLingq));
                    t66Var.setValue(Boolean.TRUE);
                }
                return xfaVar;
            default:
                jxa jxaVar = (jxa) obj;
                jxaVar.getClass();
                if (jxaVar.equals(gxa.f41509a)) {
                    t66Var2.setValue(Boolean.FALSE);
                    t66Var.setValue("");
                    return xfaVar;
                }
                if (jxaVar instanceof ixa) {
                    t66Var.setValue(((ixa) jxaVar).f44748a);
                    return xfaVar;
                }
                if (!jxaVar.equals(hxa.f43134a)) {
                    gm5.m12750e();
                    return null;
                }
                String string = vk9.m23376L0((String) t66Var.getValue()).toString();
                if (vk9.m23391n0(string)) {
                    return xfaVar;
                }
                t66Var2.setValue(Boolean.FALSE);
                t66Var.setValue("");
                vi3Var.invoke(new owa(string));
                return xfaVar;
        }
    }

    public /* synthetic */ qz5(t66 t66Var, vi3 vi3Var, t66 t66Var2) {
        this.f58419c = t66Var;
        this.f58418b = vi3Var;
        this.f58420d = t66Var2;
    }
}
