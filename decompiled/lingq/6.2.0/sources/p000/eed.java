package p000;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.AbstractC0054a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class eed {

    /* JADX INFO: renamed from: a */
    public static SharedPreferences f37138a;

    /* JADX INFO: renamed from: a */
    public static final void m11083a(boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i) {
        int i2;
        boolean z2;
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(481685872);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(ui3Var3) ? 2048 : 1024;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, null, null, null, ci8.m4703P(2126036888, new vh3(ui3Var, ui3Var2, ui3Var3, i3), tj3Var), tj3Var, (i2 & 14) | 196608, 30);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(z2, ui3Var, ui3Var2, ui3Var3, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static SharedPreferences m11084b(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f37138a == null) {
                    f37138a = (SharedPreferences) jdd.m14413c(new z06(context, 5));
                }
                sharedPreferences = f37138a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }
}
