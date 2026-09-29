package p000;

import android.view.View;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import com.google.android.gms.internal.measurement.zzbk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qdd {
    /* JADX INFO: renamed from: a */
    public static final View m19874a(d16 d16Var) {
        AbstractC0442b abstractC0442b = te1.m21979L(d16Var.f34837a).f4317J;
        View interopView = abstractC0442b != null ? abstractC0442b.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        C3386nv.m17633t("Could not fetch interop view");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m19875b(int i, String str, List list) {
        if (list.size() == i) {
            return;
        }
        fg2.m11821j(str, i, list.size(), " operation requires ");
    }

    /* JADX INFO: renamed from: c */
    public static void m19876c(int i, String str, List list) {
        if (list.size() >= i) {
            return;
        }
        fg2.m11821j(str, i, list.size(), " operation requires at least ");
    }

    /* JADX INFO: renamed from: d */
    public static void m19877d(int i, String str, ArrayList arrayList) {
        if (arrayList.size() <= i) {
            return;
        }
        fg2.m11821j(str, i, arrayList.size(), " operation requires at most ");
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19878e(kmb kmbVar) {
        if (kmbVar == null) {
            return false;
        }
        Double dMo3811e = kmbVar.mo3811e();
        return !dMo3811e.isNaN() && dMo3811e.doubleValue() >= 0.0d && dMo3811e.equals(Double.valueOf(Math.floor(dMo3811e.doubleValue())));
    }

    /* JADX INFO: renamed from: f */
    public static zzbk m19879f(String str) {
        zzbk zzbkVarZza = (str == null || str.isEmpty()) ? null : zzbk.zza(Integer.parseInt(str));
        if (zzbkVarZza != null) {
            return zzbkVarZza;
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("Unsupported commandId ", str));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m19880g(kmb kmbVar, kmb kmbVar2) {
        if (!kmbVar.getClass().equals(kmbVar2.getClass())) {
            return false;
        }
        if ((kmbVar instanceof cnb) || (kmbVar instanceof emb)) {
            return true;
        }
        if (kmbVar instanceof bkb) {
            if (Double.isNaN(kmbVar.mo3811e().doubleValue()) || Double.isNaN(kmbVar2.mo3811e().doubleValue())) {
                return false;
            }
            return kmbVar.mo3811e().equals(kmbVar2.mo3811e());
        }
        if (kmbVar instanceof xmb) {
            return kmbVar.mo3809c().equals(kmbVar2.mo3809c());
        }
        if (kmbVar instanceof sib) {
            return kmbVar.mo3808b().equals(kmbVar2.mo3808b());
        }
        return kmbVar == kmbVar2;
    }

    /* JADX INFO: renamed from: h */
    public static int m19881h(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: i */
    public static double m19882i(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return ((double) (d > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d));
    }

    /* JADX INFO: renamed from: j */
    public static Object m19883j(kmb kmbVar) {
        if (kmb.f47524z.equals(kmbVar)) {
            return null;
        }
        if (kmb.f47523y.equals(kmbVar)) {
            return "";
        }
        if (kmbVar instanceof bmb) {
            return m19884k((bmb) kmbVar);
        }
        if (!(kmbVar instanceof cib)) {
            return !kmbVar.mo3811e().isNaN() ? kmbVar.mo3811e() : kmbVar.mo3809c();
        }
        ArrayList arrayList = new ArrayList();
        cib cibVar = (cib) kmbVar;
        int i = 0;
        while (i < cibVar.m4744n()) {
            if (i >= cibVar.m4744n()) {
                uk9.m22775i(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
                return null;
            }
            int i2 = i + 1;
            Object objM19883j = m19883j(cibVar.m4745o(i));
            if (objM19883j != null) {
                arrayList.add(objM19883j);
            }
            i = i2;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static HashMap m19884k(bmb bmbVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(bmbVar.f8698a.keySet())) {
            Object objM19883j = m19883j(bmbVar.mo3880f(str));
            if (objM19883j != null) {
                map.put(str, objM19883j);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static void m19885l(C3329mb c3329mb) {
        int iM19881h = m19881h(c3329mb.m16740r("runtime.counter").mo3811e().doubleValue() + 1.0d);
        if (iM19881h <= 1000000) {
            c3329mb.m16738p("runtime.counter", new bkb(Double.valueOf(iM19881h)));
        } else {
            C3386nv.m17633t("Instructions allowed exceeded");
        }
    }
}
