package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ri0 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59342a;

    /* JADX INFO: renamed from: b */
    public Object f59343b;

    public /* synthetic */ ri0(Object obj, int i) {
        this.f59342a = i;
        this.f59343b = obj;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f59342a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((tm0) this.f59343b).cancel();
                return xfaVar;
            case 1:
                ((ul0) this.f59343b).cancel();
                return xfaVar;
            case 2:
                ((List) this.f59343b).get(((Number) obj).intValue());
                return null;
            case 3:
                ((sm0) this.f59343b).resumeWith(xfaVar);
                return xfaVar;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pg7 pg7Var = (pg7) this.f59343b;
                if (pg7Var != null) {
                    pg7Var.f56187c = zBooleanValue;
                }
                return xfaVar;
            default:
                float[] fArr = ((ts5) obj).f62824a;
                aq4 aq4Var = (aq4) this.f59343b;
                if (aq4Var.mo1691n()) {
                    bq1.m4054e0(aq4Var).mo1685i(aq4Var, fArr);
                }
                return xfaVar;
        }
    }
}
