package cc;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.kochava.tracker.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import p176ib.C6272i;
import p295ob.C8032b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: cc.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1802e extends C1995z4 {

    /* JADX INFO: renamed from: b */
    public Boolean f9763b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1793d f9764c;

    /* JADX INFO: renamed from: d */
    public Boolean f9765d;

    public C1802e(C1897o4 c1897o4) {
        super(c1897o4);
        this.f9764c = C8573r0.f45965b;
    }

    /* JADX INFO: renamed from: h */
    public final String m5574h(String str) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            C6272i.m12915i(str2);
            return str2;
        } catch (ClassNotFoundException e10) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5624b(e10, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e11) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5624b(e11, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e12) {
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9942f.m5624b(e12, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e13) {
            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9942f.m5624b(e13, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: j */
    public final double m5575j(String str, C1976x2 c1976x2) {
        if (str == null) {
            return ((Double) c1976x2.m5912a(null)).doubleValue();
        }
        String strMo5570i = this.f9764c.mo5570i(str, c1976x2.f10291a);
        if (TextUtils.isEmpty(strMo5570i)) {
            return ((Double) c1976x2.m5912a(null)).doubleValue();
        }
        try {
            return ((Double) c1976x2.m5912a(Double.valueOf(Double.parseDouble(strMo5570i)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1976x2.m5912a(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m5576k(String str, C1976x2 c1976x2) {
        if (str == null) {
            return ((Integer) c1976x2.m5912a(null)).intValue();
        }
        String strMo5570i = this.f9764c.mo5570i(str, c1976x2.f10291a);
        if (TextUtils.isEmpty(strMo5570i)) {
            return ((Integer) c1976x2.m5912a(null)).intValue();
        }
        try {
            return ((Integer) c1976x2.m5912a(Integer.valueOf(Integer.parseInt(strMo5570i)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1976x2.m5912a(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m5577l(String str, C1976x2 c1976x2, int i10, int i11) {
        return Math.max(Math.min(m5576k(str, c1976x2), i11), i10);
    }

    /* JADX INFO: renamed from: m */
    public final void m5578m() {
        ((C1897o4) this.f10430a).getClass();
    }

    /* JADX INFO: renamed from: n */
    public final long m5579n(String str, C1976x2 c1976x2) {
        if (str == null) {
            return ((Long) c1976x2.m5912a(null)).longValue();
        }
        String strMo5570i = this.f9764c.mo5570i(str, c1976x2.f10291a);
        if (TextUtils.isEmpty(strMo5570i)) {
            return ((Long) c1976x2.m5912a(null)).longValue();
        }
        try {
            return ((Long) c1976x2.m5912a(Long.valueOf(Long.parseLong(strMo5570i)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1976x2.m5912a(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: o */
    public final Bundle m5580o() {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        try {
            if (((C1897o4) interfaceC1781b5).f10076a.getPackageManager() == null) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5623a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM15899a = C8032b.m15902a(((C1897o4) interfaceC1781b5).f10076a).m15899a(((C1897o4) interfaceC1781b5).f10076a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
            if (applicationInfoM15899a != null) {
                return applicationInfoM15899a.metaData;
            }
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5623a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9942f.m5624b(e10, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final Boolean m5581p(String str) {
        C6272i.m12912f(str);
        Bundle bundleM5580o = m5580o();
        if (bundleM5580o != null) {
            if (bundleM5580o.containsKey(str)) {
                return Boolean.valueOf(bundleM5580o.getBoolean(str));
            }
            return null;
        }
        C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9942f.m5623a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5582q(String str, C1976x2 c1976x2) {
        if (str == null) {
            return ((Boolean) c1976x2.m5912a(null)).booleanValue();
        }
        String strMo5570i = this.f9764c.mo5570i(str, c1976x2.f10291a);
        return TextUtils.isEmpty(strMo5570i) ? ((Boolean) c1976x2.m5912a(null)).booleanValue() : ((Boolean) c1976x2.m5912a(Boolean.valueOf("1".equals(strMo5570i)))).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5583r() {
        Boolean boolM5581p = m5581p("google_analytics_automatic_screen_reporting_enabled");
        return boolM5581p == null || boolM5581p.booleanValue();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5584s() {
        ((C1897o4) this.f10430a).getClass();
        Boolean boolM5581p = m5581p("firebase_analytics_collection_deactivated");
        return boolM5581p != null && boolM5581p.booleanValue();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5585t(String str) {
        return "1".equals(this.f9764c.mo5570i(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5586u() {
        if (this.f9763b == null) {
            Boolean boolM5581p = m5581p("app_measurement_lite");
            this.f9763b = boolM5581p;
            if (boolM5581p == null) {
                this.f9763b = Boolean.FALSE;
            }
        }
        return this.f9763b.booleanValue() || !((C1897o4) this.f10430a).f10082e;
    }
}
