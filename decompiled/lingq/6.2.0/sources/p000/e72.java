package p000;

import androidx.lifecycle.Lifecycle$Event;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e72 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36793a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f36794b;

    /* JADX INFO: renamed from: c */
    public final Object f36795c;

    public e72(tb5 tb5Var) {
        this.f36794b = tb5Var;
        d31 d31Var = d31.f34889c;
        Class<?> cls = tb5Var.getClass();
        b31 b31Var = (b31) d31Var.f34890a.get(cls);
        this.f36795c = b31Var == null ? d31Var.m10004a(cls, null) : b31Var;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = this.f36793a;
        Object obj = this.f36794b;
        Object obj2 = this.f36795c;
        switch (i) {
            case 0:
                c72 c72Var = (c72) obj;
                switch (d72.f35075a[lifecycle$Event.ordinal()]) {
                    case 1:
                        c72Var.mo4380A(ub5Var);
                        break;
                    case 2:
                        c72Var.mo1335n(ub5Var);
                        break;
                    case 3:
                        c72Var.mo1756z(ub5Var);
                        break;
                    case 4:
                        c72Var.getClass();
                        break;
                    case 5:
                        c72Var.mo1326e(ub5Var);
                        break;
                    case 6:
                        c72Var.mo4381r(ub5Var);
                        break;
                    case 7:
                        C3386nv.m17626m("ON_ANY must not been send by anybody");
                        break;
                    default:
                        gm5.m12750e();
                        break;
                }
                rb5 rb5Var = (rb5) obj2;
                if (rb5Var != null) {
                    rb5Var.mo399c(ub5Var, lifecycle$Event);
                }
                break;
            case 1:
                jr6 jr6Var = (jr6) obj;
                int i2 = or6.f54786a[lifecycle$Event.ordinal()];
                if (i2 == 1) {
                    jr6Var.m14628g(true);
                    break;
                } else if (i2 == 2) {
                    jr6Var.m14628g(false);
                    break;
                } else if (i2 == 3) {
                    jr6Var.m3784e();
                    ((AbstractC3572sf) obj2).mo21331x(this);
                    break;
                }
                break;
            default:
                HashMap map = ((b31) obj2).f7834a;
                b31.m3205a((List) map.get(lifecycle$Event), ub5Var, lifecycle$Event, obj);
                b31.m3205a((List) map.get(Lifecycle$Event.ON_ANY), ub5Var, lifecycle$Event, obj);
                break;
        }
    }

    public e72(c72 c72Var, rb5 rb5Var) {
        c72Var.getClass();
        this.f36794b = c72Var;
        this.f36795c = rb5Var;
    }

    public e72(jr6 jr6Var, pr6 pr6Var, AbstractC3572sf abstractC3572sf) {
        this.f36794b = jr6Var;
        this.f36795c = abstractC3572sf;
    }
}
