package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes2.dex */
public abstract class t2d {
    /* JADX INFO: renamed from: a */
    public static final void m21820a(ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(941681111);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var3) ? 256 : 128;
        }
        int i4 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            tj3Var = tj3Var2;
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(-926879853, new vd5(rv2VarM13115b, ui3Var, i4), tj3Var2), null, null, null, 0, 0L, 0L, null, ci8.m4703P(951621544, new a05(rv2VarM13115b, ui3Var2, ui3Var3, i3), tj3Var2), tj3Var, 805306416, 508);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 15, ui3Var, ui3Var2, ui3Var3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m21821b(LogRecord logRecord) {
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            return 5;
        }
        return logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
    }
}
