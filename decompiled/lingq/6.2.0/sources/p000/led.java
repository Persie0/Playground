package p000;

import com.google.android.gms.internal.vision.zzht;

/* JADX INFO: loaded from: classes2.dex */
public abstract class led {
    /* JADX INFO: renamed from: a */
    public static final void m16156a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(362318513);
        int i2 = i | (tj3Var2.m22124i(ui3Var) ? 4 : 2) | (tj3Var2.m22124i(ui3Var2) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var2, ci8.m4703P(1881362793, new C0839c9(9, ui3Var), tj3Var2), null, ci8.m4703P(1340933287, new C0839c9(10, ui3Var2), tj3Var2), null, null, jqb.f46019c, null, 0L, 0L, 0L, 0L, null, tj3Var, ((i2 >> 3) & 14) | 1575984, 16308);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m16157b(zzht zzhtVar) {
        StringBuilder sb = new StringBuilder(zzhtVar.mo5832f());
        for (int i = 0; i < zzhtVar.mo5832f(); i++) {
            byte bMo5831d = zzhtVar.mo5831d(i);
            if (bMo5831d == 34) {
                sb.append("\\\"");
            } else if (bMo5831d == 39) {
                sb.append("\\'");
            } else if (bMo5831d != 92) {
                switch (bMo5831d) {
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
                        if (bMo5831d < 32 || bMo5831d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo5831d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo5831d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo5831d & 7) + 48));
                        } else {
                            sb.append((char) bMo5831d);
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
