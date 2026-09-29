package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import com.lingq.core.analytics.embedded.EmbeddedMessage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ecd {
    /* JADX INFO: renamed from: a */
    public static final void m11039a(EmbeddedMessage embeddedMessage, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1028331358);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(embeddedMessage) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22120g(e16Var) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            r46.m20382g(c99.m4429v(e16Var), null, null, null, null, null, ci8.m4703P(455007160, new op2(embeddedMessage, vi3Var, i2), tj3Var), tj3Var, 1572864, 62);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new pp2(embeddedMessage, vi3Var, e16Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m11040b(String str, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1259485932);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(895589296, new vd5(rv2VarM13115b, ui3Var, 3), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(660368251, new iq0(str, 19), tj3Var), tj3Var, 805306416, 508);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tf2(str, ui3Var, i, 6);
        }
    }
}
