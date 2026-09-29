package p000;

import androidx.compose.foundation.text.HandleState;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sm1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yw4 f61018b;

    public /* synthetic */ sm1(yw4 yw4Var, int i) {
        this.f61017a = i;
        this.f61018b = yw4Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f61017a;
        xfa xfaVar = xfa.f68157a;
        yw4 yw4Var = this.f61018b;
        switch (i) {
            case 0:
                aq4 aq4Var = (aq4) obj;
                sw9 sw9VarM25363d = yw4Var.m25363d();
                if (sw9VarM25363d != null) {
                    sw9VarM25363d.f61521c = aq4Var;
                }
                return xfaVar;
            case 1:
                t66 t66Var = yw4Var.f70588t;
                vv9 vv9Var = (vv9) obj;
                String str = vv9Var.f65990a.f54604b;
                C3419on c3419on = yw4Var.f70578j;
                if (!fa4.m11650l(str, c3419on != null ? c3419on.f54604b : null)) {
                    ((xc9) yw4Var.f70579k).setValue(HandleState.None);
                    if (((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
                        ((xc9) t66Var).setValue(Boolean.FALSE);
                    } else {
                        ((xc9) yw4Var.f70587s).setValue(Boolean.FALSE);
                    }
                }
                long j = cx9.f34692b;
                yw4Var.m25365f(j);
                yw4Var.m25364e(j);
                yw4Var.f70589u.invoke(vv9Var);
                x18 x18Var = yw4Var.f70570b;
                pf1 pf1Var = x18Var.f67639a;
                if (pf1Var != null) {
                    pf1Var.m19103s(x18Var, null);
                }
                return xfaVar;
            case 2:
                yw4Var.f70586r.m11889b(((v04) obj).f64658a);
                return xfaVar;
            case 3:
                return Boolean.valueOf(yw4Var.f70586r.m11889b(((v04) obj).f64658a));
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((xc9) yw4Var.f70585q).setValue(bool);
                return xfaVar;
        }
    }
}
