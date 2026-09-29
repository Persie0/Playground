package p000;

import com.google.android.gms.internal.play_billing.zzev;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tdd {
    /* JADX INFO: renamed from: a */
    public static final void m21966a(int i, int i2, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, boolean z) {
        tj3 tj3Var;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(149272100);
        int i3 = i2 | (tj3Var2.m22122h(z) ? 4 : 2) | (tj3Var2.m22124i(vi3Var) ? 256 : 128) | (tj3Var2.m22116e(i) ? 2048 : 1024);
        int i4 = 1;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            AbstractC3003fj.m11885a(z, ui3Var, null, 0L, null, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e, 0L, 0.0f, ci8.m4703P(-1773559671, new bs0(i, vi3Var, i4), tj3Var2), tj3Var, i3 & 126, 1980);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new vb3(z, ui3Var, vi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m21967b(zzev zzevVar) {
        StringBuilder sb = new StringBuilder(zzevVar.mo5681h());
        for (int i = 0; i < zzevVar.mo5681h(); i++) {
            byte bMo5678d = zzevVar.mo5678d(i);
            if (bMo5678d == 34) {
                sb.append("\\\"");
            } else if (bMo5678d == 39) {
                sb.append("\\'");
            } else if (bMo5678d != 92) {
                switch (bMo5678d) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo5678d < 32 || bMo5678d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo5678d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo5678d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo5678d & 7) + 48));
                        } else {
                            sb.append((char) bMo5678d);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
