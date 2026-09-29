package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Window;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public abstract class kaa {

    /* JADX INFO: renamed from: a */
    public static Boolean f46951a;

    /* JADX INFO: renamed from: a */
    public static final void m15039a(faa faaVar, baa baaVar, Object obj, Object obj2, l43 l43Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(867041821);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(faaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22120g(baaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? tj3Var.m22120g(obj) : tj3Var.m22124i(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? tj3Var.m22120g(obj2) : tj3Var.m22124i(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? tj3Var.m22120g(l43Var) : tj3Var.m22124i(l43Var) ? 16384 : 8192;
        }
        if (!tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22102U();
        } else if (faaVar.m11673g()) {
            baaVar.m3537g(obj, obj2, l43Var);
        } else {
            baaVar.m3538h(obj2, l43Var);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3125iw(faaVar, baaVar, obj, obj2, l43Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final v9a m15040b(faa faaVar, jda jdaVar, String str, ye1 ye1Var, int i, int i2) {
        u9a u9aVar;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean zM22120g = ((tj3) ye1Var).m22120g(faaVar);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (zM22120g || objM22097O == p84Var) {
            objM22097O = new v9a(faaVar, jdaVar, str);
            tj3Var.m22131l0(objM22097O);
        }
        v9a v9aVar = (v9a) objM22097O;
        boolean zM22120g2 = tj3Var.m22120g(faaVar) | tj3Var.m22124i(v9aVar);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g2 || objM22097O2 == p84Var) {
            objM22097O2 = new ui5(21, faaVar, v9aVar);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10041h(v9aVar, (vi3) objM22097O2, tj3Var);
        if (faaVar.m11673g() && (u9aVar = (u9a) ((xc9) v9aVar.f65084b).getValue()) != null) {
            faa faaVar2 = v9aVar.f65085c;
            u9aVar.f63621a.m3537g(u9aVar.f63623c.invoke(faaVar2.m11672f().mo217a()), u9aVar.f63623c.invoke(faaVar2.m11672f().mo218c()), (l43) u9aVar.f63622b.invoke(faaVar2.m11672f()));
        }
        return v9aVar;
    }

    /* JADX INFO: renamed from: c */
    public static final baa m15041c(faa faaVar, Object obj, Object obj2, l43 l43Var, jda jdaVar, ye1 ye1Var, int i) {
        Object obj3;
        Object obj4;
        int i2 = i & 14;
        int i3 = i2 ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && ((tj3) ye1Var).m22120g(faaVar)) || (i & 6) == 4;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (z2 || objM22097O == p84Var) {
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                obj3 = obj2;
                AbstractC3081hn abstractC3081hn = (AbstractC3081hn) jdaVar.f45442a.invoke(obj3);
                abstractC3081hn.mo10486d();
                obj4 = obj;
                baa baaVar = new baa(faaVar, obj4, abstractC3081hn, jdaVar);
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                tj3Var.m22131l0(baaVar);
                objM22097O = baaVar;
            } catch (Throwable th) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th;
            }
        } else {
            obj4 = obj;
            obj3 = obj2;
        }
        baa baaVar2 = (baa) objM22097O;
        int i4 = (i >> 3) & 8;
        int i5 = i << 3;
        m15039a(faaVar, baaVar2, obj4, obj3, l43Var, tj3Var, i2 | (i4 << 6) | (i5 & 896) | (i4 << 9) | (i5 & 7168) | (57344 & i5));
        if ((i3 <= 4 || !tj3Var.m22120g(faaVar)) && (i & 6) != 4) {
            z = false;
        }
        boolean zM22120g = tj3Var.m22120g(baaVar2) | z;
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g || objM22097O2 == p84Var) {
            objM22097O2 = new ui5(22, faaVar, baaVar2);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10041h(baaVar2, (vi3) objM22097O2, tj3Var);
        return baaVar2;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m15042d(Context context) {
        Boolean bool = f46951a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f46951a = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            C3723wi.m23970d().m23971a("No perf logcat meta data found " + e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m15043e(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: f */
    public static void m15044f(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AbstractC3708w3.m23695d(window, z);
        } else if (i >= 30) {
            qh2.m19969c(window, z);
        } else {
            vbd.m23219a(window, z);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final faa m15045g(w66 w66Var, String str, ye1 ye1Var, int i) {
        int i2 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && ((tj3) ye1Var).m22120g(w66Var)) || (i & 6) == 4;
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        Object obj = we1.f66679a;
        if (z || objM22097O == obj) {
            jc9 jc9VarM16139y = lda.m16139y();
            vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
            jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
            try {
                Object faaVar = new faa(w66Var, null, str);
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                tj3Var.m22131l0(faaVar);
                objM22097O = faaVar;
            } catch (Throwable th) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                throw th;
            }
        }
        faa faaVar2 = (faa) objM22097O;
        tj3Var.m22111b0(-1356604288);
        faaVar2.m11667a(((xc9) w66Var.f66458c).getValue(), tj3Var, 0);
        tj3Var.m22139q(false);
        boolean zM22120g = tj3Var.m22120g(faaVar2);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22120g || objM22097O2 == obj) {
            objM22097O2 = new iaa(faaVar2, i2);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10041h(faaVar2, (vi3) objM22097O2, tj3Var);
        return faaVar2;
    }

    /* JADX INFO: renamed from: h */
    public static final faa m15046h(Object obj, String str, ye1 ye1Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new faa(new w66(obj), null, str);
            tj3Var.m22131l0(objM22097O);
        }
        faa faaVar = (faa) objM22097O;
        faaVar.m11667a(obj, tj3Var, (i & 8) | 48 | (i & 14));
        Object objM22097O2 = tj3Var.m22097O();
        if (objM22097O2 == p84Var) {
            objM22097O2 = new iaa(faaVar, 0);
            tj3Var.m22131l0(objM22097O2);
        }
        d32.m10041h(faaVar, (vi3) objM22097O2, tj3Var);
        return faaVar;
    }

    /* JADX INFO: renamed from: i */
    public static File m15047i(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return filesDir;
        }
        SystemClock.sleep(100L);
        File filesDir2 = context.getFilesDir();
        if (filesDir2 != null) {
            return filesDir2;
        }
        C3386nv.m17633t("getFilesDir returned null twice.");
        return null;
    }
}
