package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.window.layout.C0768a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public abstract class t9a {
    /* JADX INFO: renamed from: a */
    public static ArrayList m21911a(ArrayList arrayList, Serializable serializable) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(serializable)) {
            arrayList.add(serializable);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final n4b m21912b(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(760658738);
        long jMo915v = ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo915v(omd.m18152h0(((nw4) ((a5b) tj3Var.m22128k(AbstractC0402n.f4830v))).m17654a()));
        int i = 0;
        tj3Var.m22139q(false);
        List list = b7b.f8070c;
        Set set = dk2.f35741a;
        Set set2 = zj2.f71641a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (xj2.m24559a(bk2.m3806b(jMo915v), ((xj2) obj).f68285a) >= 0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        b7b b7bVar = null;
        if (it.hasNext()) {
            float fMax = ((xj2) it.next()).f68285a;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((xj2) it.next()).f68285a);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : set2) {
                if (xj2.m24559a(bk2.m3805a(jMo915v), ((xj2) obj2).f68285a) >= 0) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                float fMax2 = ((xj2) it2.next()).f68285a;
                while (it2.hasNext()) {
                    fMax2 = Math.max(fMax2, ((xj2) it2.next()).f68285a);
                }
                b7bVar = new b7b((int) fMax, (int) fMax2);
            } else {
                uk9.m22784s();
            }
        } else {
            uk9.m22784s();
        }
        Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
        boolean zM22120g = tj3Var.m22120g(context);
        Object objM22097O = tj3Var.m22097O();
        if (zM22120g || objM22097O == we1.f66679a) {
            d5b.f35026a.getClass();
            context.getClass();
            q4b q4bVarM4306b = (q4b) c5b.f9593b.getValue();
            if (q4bVarM4306b == null) {
                a79 a79Var = a79.f326c;
                q4bVarM4306b = c3d.m4306b(context);
            }
            u6b u6bVar = new u6b();
            iy5 iy5Var = new iy5(18);
            cy2.m9933a();
            C0768a c0768a = new C0768a(u6bVar, q4bVarM4306b, iy5Var);
            c5b.f9594c.getClass();
            objM22097O = new C3540rl(c0768a.m2895a(context), i);
            tj3Var.m22131l0(objM22097O);
        }
        List<fr3> list2 = (List) AbstractC0278f.m1251a((c83) objM22097O, EmptyList.f47638a, null, tj3Var, 48, 2).getValue();
        ArrayList arrayList3 = new ArrayList();
        boolean z = false;
        for (fr3 fr3Var : list2) {
            if (fr3Var.m12008c() == C3366nb.f52553g && fr3Var.m12009d() == C3404oc.f54160g) {
                z = true;
            }
            arrayList3.add(new vt3(bna.m3984x0(fr3Var.m12006a()), fr3Var.m12009d() == C3404oc.f54159f, fr3Var.m12008c() == C3366nb.f52552f, fr3Var.m12010e(), fr3Var.m12007b() == C2920da.f35229h));
        }
        return new n4b(b7bVar, new vh7(arrayList3, z));
    }

    /* JADX INFO: renamed from: c */
    public static Signature[] m21913c(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(134217728L)).signingInfo;
                if (signingInfo != null) {
                    return signingInfo.getSigningCertificateHistory();
                }
            } else {
                SigningInfo signingInfo2 = context.getPackageManager().getPackageInfo(str, 134217728).signingInfo;
                if (signingInfo2 != null) {
                    return signingInfo2.getSigningCertificateHistory();
                }
            }
        } catch (Throwable unused) {
        }
        return new Signature[0];
    }

    /* JADX INFO: renamed from: d */
    public static boolean m21914d(Context context, String str, String str2) {
        try {
            Signature[] signatureArrM21913c = m21913c(context, str);
            if (signatureArrM21913c.length >= 1) {
                if (!b34.m3255w(str2)) {
                    for (Signature signature : signatureArrM21913c) {
                        if (!str2.equals(signature.toCharsString())) {
                        }
                    }
                }
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static String m21915e(String str, int i, sq5 sq5Var, String str2, String str3) {
        if (b34.m3255w(str)) {
            str = null;
        }
        if (str == null) {
            r46.m20373P(sq5Var, str2, str3);
            return null;
        }
        if (str == null || i <= 0 || str.length() <= i) {
            return str;
        }
        String strSubstring = str.substring(0, i);
        r46.m20375R(i, sq5Var, str2, str3);
        return strSubstring;
    }

    /* JADX INFO: renamed from: f */
    public static final void m21916f(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        wnc wncVar = new wnc(1, level, exc, objArr, str);
        int i = jmd.f45851a;
        executor.execute(new wlc(new Ref$ObjectRef(), qld.m20020a(), wncVar, 4));
    }
}
