package p000;

import android.content.Context;
import android.os.Build;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.platform.AbstractC0394f;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o4d {
    /* JADX INFO: renamed from: a */
    public static final void m17800a(vs3 vs3Var, boolean z, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        vs3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(799570533);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(vs3Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean z2 = (i2 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new ex8(vi3Var, 17);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            AbstractC3003fj.m11885a(z, (ui3) objM22097O, AbstractC3584sr.m21609V(AbstractC3423or.m18279s0(c99.m4429v(b16.f7762a), IntrinsicSize.Max), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d, 0.0f, 2), 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1461029770, new a05((xi3) vi3Var2, (Object) vs3Var, (Object) context, 18), tj3Var2), tj3Var, (i2 >> 3) & 14, 2040);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3294ld(vs3Var, z, vi3Var, vi3Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m17801b(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : fileArrListFiles) {
            z = m17801b(file2) && z;
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public static void m17802c(Context context, cc4 cc4Var) {
        if (m17801b(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            cc4Var.mo3878j(14, null);
        } else {
            cc4Var.mo3878j(15, null);
        }
    }
}
