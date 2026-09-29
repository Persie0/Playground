package p000;

import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.pager.AbstractC0150d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jv4 implements wn8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wn8 f46224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ do8 f46225c;

    public /* synthetic */ jv4(wn8 wn8Var, do8 do8Var, int i) {
        this.f46223a = i;
        this.f46225c = do8Var;
        this.f46224b = wn8Var;
    }

    @Override // p000.wn8
    /* JADX INFO: renamed from: a */
    public final float mo3997a(float f) {
        switch (this.f46223a) {
            case 0:
                break;
        }
        return this.f46224b.mo3997a(f);
    }

    /* JADX INFO: renamed from: b */
    public final int m14684b(int i) {
        Object obj;
        int i2 = this.f46223a;
        do8 do8Var = this.f46225c;
        switch (i2) {
            case 0:
                C0127b c0127b = (C0127b) do8Var;
                hv4 hv4VarM980j = c0127b.m980j();
                if (hv4VarM980j.f42985k.isEmpty()) {
                    return 0;
                }
                int iM978h = c0127b.m978h();
                if (i > m14687e() || iM978h > i) {
                    return ((i - c0127b.m978h()) * thb.m22039D(hv4VarM980j)) - c0127b.m979i();
                }
                List list = hv4VarM980j.f42985k;
                int size = list.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        obj = list.get(i3);
                        if (((iv4) obj).f44648a != i) {
                            i3++;
                        }
                    } else {
                        obj = null;
                    }
                }
                iv4 iv4Var = (iv4) obj;
                if (iv4Var != null) {
                    return iv4Var.f44662o;
                }
                return 0;
            default:
                AbstractC0150d abstractC0150d = (AbstractC0150d) do8Var;
                return (int) (l70.m15947j(omd.m18165u(abstractC0150d) + ((long) ss5.m21693T(((abstractC0150d.m1041p() * (i - abstractC0150d.m1036k())) - (abstractC0150d.m1037l() * abstractC0150d.m1041p())) + 0.0f)), abstractC0150d.f2678h, abstractC0150d.f2677g) - omd.m18165u(abstractC0150d));
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m14685c() {
        int i = this.f46223a;
        do8 do8Var = this.f46225c;
        switch (i) {
            case 0:
                return ((C0127b) do8Var).m978h();
            default:
                return ((AbstractC0150d) do8Var).f2675e;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m14686d() {
        int i = this.f46223a;
        do8 do8Var = this.f46225c;
        switch (i) {
            case 0:
                return ((C0127b) do8Var).m979i();
            default:
                return ((AbstractC0150d) do8Var).f2676f;
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m14687e() {
        int i = this.f46223a;
        do8 do8Var = this.f46225c;
        switch (i) {
            case 0:
                iv4 iv4Var = (iv4) u91.m22598P0(((C0127b) do8Var).m980j().f42985k);
                if (iv4Var != null) {
                    return iv4Var.f44648a;
                }
                return 0;
            default:
                return ((lt5) u91.m22597O0(((AbstractC0150d) do8Var).m1038m().f52219a)).f50100a;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m14688f(int i, int i2) {
        int i3 = this.f46223a;
        do8 do8Var = this.f46225c;
        switch (i3) {
            case 0:
                ((C0127b) do8Var).m982m(i, i2);
                break;
            default:
                AbstractC0150d abstractC0150d = (AbstractC0150d) do8Var;
                float fM1041p = abstractC0150d.m1041p();
                abstractC0150d.m1045v(fM1041p != 0.0f ? i2 / fM1041p : 0.0f, i, true);
                break;
        }
    }
}
