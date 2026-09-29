package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb0 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46954a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f46955b;

    public /* synthetic */ kb0(int i, t66 t66Var) {
        this.f46954a = i;
        this.f46955b = t66Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f46954a;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f46955b;
        switch (i) {
            case 0:
                if (t66Var != null) {
                    return (List) t66Var.getValue();
                }
                return null;
            case 1:
                Boolean bool = (Boolean) t66Var.getValue();
                bool.booleanValue();
                return bool;
            case 2:
                return new js4((vi3) t66Var.getValue());
            case 3:
                return (yt4) ((ui3) t66Var.getValue()).mo0a();
            case 4:
                return new vu4((vi3) t66Var.getValue());
            case 5:
                return new tv4((vi3) t66Var.getValue());
            case 6:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 7:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 8:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 9:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 10:
                t66Var.setValue(Boolean.FALSE);
                return xfaVar;
            case 11:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            case 12:
                t66Var.setValue(Boolean.valueOf(!((Boolean) t66Var.getValue()).booleanValue()));
                return xfaVar;
            case 13:
                aq4 aq4Var = (aq4) t66Var.getValue();
                if (aq4Var != null) {
                    return aq4Var;
                }
                l54.m15817d("Required value was null.");
                C3386nv.m17631r();
                return null;
            case 14:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
            default:
                t66Var.setValue(Boolean.TRUE);
                return xfaVar;
        }
    }
}
