package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.p002ui.platform.AbstractC0394f;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class xb8 {

    /* JADX INFO: renamed from: a */
    public static final List f68031a = vz1.m23605K("😉", "😃", "😊", "🤩", "😉");

    /* JADX INFO: renamed from: b */
    public static final List f68032b = vz1.m23605K("🤔", "😔", "🙁");

    /* JADX INFO: renamed from: c */
    public static final List f68033c = vz1.m23604J("🤔");

    /* JADX INFO: renamed from: a */
    public static final void m24440a(String str, ui3 ui3Var, ye1 ye1Var, int i) {
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(798222910);
        int i2 = 4;
        int i3 = (tj3Var.m22122h(true) ? 4 : 2) | i | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22122h(true) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            AbstractC0054a.m729d(true, null, AbstractC0070i.m771f(0.5f, ss5.m21703b0(30, 0, null, 6)), AbstractC0070i.m773h(ss5.m21703b0(30, 350, null, 4), 2), null, ci8.m4703P(-1989954282, new a05((xi3) ui3Var, (Object) str, tj3Var.m22128k(AbstractC0394f.f4761b), 11), tj3Var), tj3Var, ((i3 >> 6) & 14) | 199680, 18);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tf2(str, ui3Var, i, i2);
        }
    }
}
