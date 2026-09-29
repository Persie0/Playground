package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ov4 implements il8, fl8 {

    /* JADX INFO: renamed from: a */
    public final jl8 f55031a;

    /* JADX INFO: renamed from: b */
    public final gl8 f55032b;

    /* JADX INFO: renamed from: c */
    public final o66 f55033c;

    public ov4(il8 il8Var, Map map, gl8 gl8Var) {
        kv4 kv4Var = new kv4(il8Var, 1);
        vh9 vh9Var = kl8.f47496a;
        this.f55031a = new jl8(map, kv4Var);
        this.f55032b = gl8Var;
        o66 o66Var = pm8.f56484a;
        this.f55033c = new o66();
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: a */
    public final hl8 mo10399a(String str, ui3 ui3Var) {
        return this.f55031a.mo10399a(str, ui3Var);
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: b */
    public final boolean mo10400b(Object obj) {
        return this.f55031a.mo10400b(obj);
    }

    @Override // p000.fl8
    /* JADX INFO: renamed from: c */
    public final void mo11934c(Object obj, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-858296452);
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
            this.f55032b.mo11934c(obj, c0282a, tj3Var, i2 & 126);
            boolean zM22124i = tj3Var.m22124i(this) | tj3Var.m22124i(obj);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3704w(24, this, obj);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10041h(obj, (vi3) objM22097O, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(this, obj, c0282a, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:5:0x000d->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[EDGE_INSN: B:21:0x0051->B:18:0x0051 BREAK  A[LOOP:0: B:5:0x000d->B:17:0x004e], SYNTHETIC] */
    @Override // p000.il8
    /* JADX INFO: renamed from: d */
    public final Map mo10401d() {
        o66 o66Var = this.f55033c;
        Object[] objArr = o66Var.f1303b;
        long[] jArr = o66Var.f1302a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            gl8 gl8Var = this.f55032b;
                            if (gl8Var.f40975b.m17259k(obj) == null) {
                                gl8Var.f40974a.remove(obj);
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.f55031a.mo10401d();
    }

    @Override // p000.il8
    /* JADX INFO: renamed from: e */
    public final Object mo10402e(String str) {
        return this.f55031a.mo10402e(str);
    }
}
