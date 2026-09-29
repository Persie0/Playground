package p000;

import android.content.Context;
import androidx.compose.p002ui.platform.AbstractC0394f;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t6d {
    /* JADX INFO: renamed from: a */
    public static final void m21879a(e16 e16Var, ArrayList arrayList, long j, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2078646209);
        int i2 = (tj3Var.m22124i(arrayList) ? 32 : 16) | i | (tj3Var.m22118f(j) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4412e = c99.m4412e(e16Var, 1.0f);
            boolean zM22124i = tj3Var.m22124i(context) | tj3Var.m22124i(arrayList) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new fv0(context, arrayList, j);
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4412e, (vi3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gv0(e16Var, arrayList, j, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m21880b(ByteString byteString) {
        StringBuilder sb = new StringBuilder(byteString.size());
        for (int i = 0; i < byteString.size(); i++) {
            byte bMo6409d = byteString.mo6409d(i);
            if (bMo6409d == 34) {
                sb.append("\\\"");
            } else if (bMo6409d == 39) {
                sb.append("\\'");
            } else if (bMo6409d != 92) {
                switch (bMo6409d) {
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
                        if (bMo6409d < 32 || bMo6409d > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo6409d >>> 6) & 3) + 48));
                            sb.append((char) (((bMo6409d >>> 3) & 7) + 48));
                            sb.append((char) ((bMo6409d & 7) + 48));
                        } else {
                            sb.append((char) bMo6409d);
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
