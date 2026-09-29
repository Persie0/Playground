package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gl8 implements fl8 {

    /* JADX INFO: renamed from: e */
    public static final fs6 f40973e = new fs6(19, new ln1(21), new vp6(25));

    /* JADX INFO: renamed from: a */
    public final Map f40974a;

    /* JADX INFO: renamed from: b */
    public final n66 f40975b;

    /* JADX INFO: renamed from: c */
    public il8 f40976c;

    /* JADX INFO: renamed from: d */
    public final kv4 f40977d;

    public gl8(Map map) {
        this.f40974a = map;
        long[] jArr = om8.f54590a;
        this.f40975b = new n66();
        this.f40977d = new kv4(this, 20);
    }

    @Override // p000.fl8
    /* JADX INFO: renamed from: c */
    public final void mo11934c(Object obj, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(533563200);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(this) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22117e0(obj);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                kv4 kv4Var = this.f40977d;
                if (!((Boolean) kv4Var.invoke(obj)).booleanValue()) {
                    v63.m23135m("Type of the key ", obj, " is not supported. On Android you can only use types which can be stored inside the Bundle.");
                    return;
                }
                Map map = (Map) this.f40974a.get(obj);
                vh9 vh9Var = kl8.f47496a;
                ll8 ll8Var = new ll8(new jl8(map, kv4Var));
                tj3Var.m22131l0(ll8Var);
                objM22097O = ll8Var;
            }
            ll8 ll8Var2 = (ll8) objM22097O;
            pvc.m19508d(new a02[]{kl8.f47496a.mo1265a(ll8Var2), li5.f49717a.mo1265a(ll8Var2)}, c0282a, tj3Var, (i2 & 112) | 8);
            boolean zM22124i = tj3Var.m22124i(this) | tj3Var.m22124i(obj) | tj3Var.m22124i(ll8Var2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new bb0(this, obj, ll8Var2, 13);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10041h(xfa.f68157a, (vi3) objM22097O2, tj3Var);
            if (tj3Var.f62411y && tj3Var.f62372G.f8290i == tj3Var.f62412z) {
                tj3Var.f62412z = -1;
                tj3Var.f62411y = false;
            }
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(this, obj, c0282a, i, 4);
        }
    }
}
