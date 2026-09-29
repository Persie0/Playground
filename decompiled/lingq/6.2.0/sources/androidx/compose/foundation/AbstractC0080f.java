package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.p002ui.AbstractC0287b;
import p000.b16;
import p000.chd;
import p000.e16;
import p000.rh4;
import p000.rh8;
import p000.s34;
import p000.uh8;
import p000.ui3;
import p000.v56;
import p000.zgd;

/* JADX INFO: renamed from: androidx.compose.foundation.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0080f {
    /* JADX INFO: renamed from: a */
    public static e16 m814a(e16 e16Var, v56 v56Var, rh8 rh8Var, boolean z, uh8 uh8Var, ui3 ui3Var, int i) {
        e16 e16VarMo3161g;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            uh8Var = null;
        }
        uh8 uh8Var2 = uh8Var;
        if (rh8Var != null) {
            e16VarMo3161g = new ClickableElement(v56Var, rh8Var, false, z2, null, uh8Var2, ui3Var);
        } else if (rh8Var == null) {
            e16VarMo3161g = new ClickableElement(v56Var, null, false, z2, null, uh8Var2, ui3Var);
        } else {
            b16 b16Var = b16.f7762a;
            e16VarMo3161g = v56Var != null ? s34.m21046a(b16Var, v56Var, rh8Var).mo3161g(new ClickableElement(v56Var, null, false, z2, null, uh8Var2, ui3Var)) : AbstractC0287b.m1320a(b16Var, new C0078d(rh8Var, z2, uh8Var2, ui3Var));
        }
        return e16Var.mo3161g(e16VarMo3161g);
    }

    /* JADX INFO: renamed from: b */
    public static e16 m815b(String str, boolean z, ui3 ui3Var, e16 e16Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return e16Var.mo3161g(new ClickableElement(null, null, true, z2, str, null, ui3Var));
    }

    /* JADX INFO: renamed from: c */
    public static e16 m816c(e16 e16Var, v56 v56Var, rh8 rh8Var, ui3 ui3Var, ui3 ui3Var2, int i) {
        e16 e16VarMo3161g;
        String str = (i & 32) != 0 ? null : "Show options menu";
        ui3 ui3Var3 = (i & 64) != 0 ? null : ui3Var;
        if (rh8Var != null) {
            e16VarMo3161g = new CombinedClickableElement(v56Var, rh8Var, ui3Var2, str, ui3Var3);
        } else if (rh8Var == null) {
            e16VarMo3161g = new CombinedClickableElement(v56Var, null, ui3Var2, str, ui3Var3);
        } else {
            b16 b16Var = b16.f7762a;
            e16VarMo3161g = v56Var != null ? s34.m21046a(b16Var, v56Var, rh8Var).mo3161g(new CombinedClickableElement(v56Var, null, ui3Var2, str, ui3Var3)) : AbstractC0287b.m1320a(b16Var, new C0079e(rh8Var, ui3Var2, str, ui3Var3));
        }
        return e16Var.mo3161g(e16VarMo3161g);
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m817d(KeyEvent keyEvent) {
        long jM4667a = chd.m4667a(keyEvent);
        int i = rh4.f59280O;
        return rh4.m20661a(jM4667a, zgd.m25638i()) || rh4.m20661a(jM4667a, zgd.m25643n()) || rh4.m20661a(jM4667a, zgd.m25655z()) || rh4.m20661a(jM4667a, zgd.m25624I());
    }
}
