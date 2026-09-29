package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzji;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class cmb extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public Boolean f10287b;

    /* JADX INFO: renamed from: c */
    public String f10288c;

    /* JADX INFO: renamed from: d */
    public amb f10289d;

    /* JADX INFO: renamed from: e */
    public Boolean f10290e;

    /* JADX INFO: renamed from: E */
    public final boolean m4859E(String str) {
        kjc.m15278j(((kjc) this.f60774a).f47441i);
        if (rad.m20509e0((String) z8c.f71173g1.m21901a(null), str) || rad.m20509e0((String) z8c.f71176h1.m21901a(null), str) || rad.m20509e0((String) z8c.f71179i1.m21901a(null), str)) {
            return true;
        }
        return "1".equals(this.f10289d.mo579f(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: F */
    public final boolean m4860F(String str) {
        return "1".equals(this.f10289d.mo579f(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: G */
    public final boolean m4861G() {
        if (this.f10287b == null) {
            Boolean boolM4871Q = m4871Q("app_measurement_lite");
            this.f10287b = boolM4871Q;
            if (boolM4871Q == null) {
                this.f10287b = Boolean.FALSE;
            }
        }
        return this.f10287b.booleanValue() || !((kjc) this.f60774a).f47434b;
    }

    /* JADX INFO: renamed from: H */
    public final String m4862H(String str) {
        kjc kjcVar = (kjc) this.f60774a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            lda.m16130p(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68080f.m17924b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            xcc xccVar4 = kjcVar.f47438f;
            kjc.m15280l(xccVar4);
            xccVar4.f68080f.m17924b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m4863I(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(m4867M(str, z8c.f71172g0), 500), 100) : 500, 256);
    }

    /* JADX INFO: renamed from: J */
    public final void m4864J() {
        ((kjc) this.f60774a).getClass();
    }

    /* JADX INFO: renamed from: K */
    public final String m4865K(String str, t8c t8cVar) {
        return TextUtils.isEmpty(str) ? (String) t8cVar.m21901a(null) : (String) t8cVar.m21901a(this.f10289d.mo579f(str, t8cVar.f61996a));
    }

    /* JADX INFO: renamed from: L */
    public final long m4866L(String str, t8c t8cVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) t8cVar.m21901a(null)).longValue();
        }
        String strMo579f = this.f10289d.mo579f(str, t8cVar.f61996a);
        if (TextUtils.isEmpty(strMo579f)) {
            return ((Long) t8cVar.m21901a(null)).longValue();
        }
        try {
            return ((Long) t8cVar.m21901a(Long.valueOf(Long.parseLong(strMo579f)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) t8cVar.m21901a(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: M */
    public final int m4867M(String str, t8c t8cVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) t8cVar.m21901a(null)).intValue();
        }
        String strMo579f = this.f10289d.mo579f(str, t8cVar.f61996a);
        if (TextUtils.isEmpty(strMo579f)) {
            return ((Integer) t8cVar.m21901a(null)).intValue();
        }
        try {
            return ((Integer) t8cVar.m21901a(Integer.valueOf(Integer.parseInt(strMo579f)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) t8cVar.m21901a(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: N */
    public final double m4868N(String str, t8c t8cVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) t8cVar.m21901a(null)).doubleValue();
        }
        String strMo579f = this.f10289d.mo579f(str, t8cVar.f61996a);
        if (TextUtils.isEmpty(strMo579f)) {
            return ((Double) t8cVar.m21901a(null)).doubleValue();
        }
        try {
            return ((Double) t8cVar.m21901a(Double.valueOf(Double.parseDouble(strMo579f)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) t8cVar.m21901a(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m4869O(String str, t8c t8cVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) t8cVar.m21901a(null)).booleanValue();
        }
        String strMo579f = this.f10289d.mo579f(str, t8cVar.f61996a);
        return TextUtils.isEmpty(strMo579f) ? ((Boolean) t8cVar.m21901a(null)).booleanValue() : ((Boolean) t8cVar.m21901a(Boolean.valueOf("1".equals(strMo579f)))).booleanValue();
    }

    /* JADX INFO: renamed from: P */
    public final Bundle m4870P() {
        kjc kjcVar = (kjc) this.f60774a;
        try {
            Context context = kjcVar.f47433a;
            Context context2 = kjcVar.f47433a;
            xcc xccVar = kjcVar.f47438f;
            if (context.getPackageManager() == null) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17923a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoM23948a = m9b.m16702a(context2).m23948a(128, context2.getPackageName());
            if (applicationInfoM23948a != null) {
                return applicationInfoM23948a.metaData;
            }
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final Boolean m4871Q(String str) {
        lda.m16127m(str);
        Bundle bundleM4870P = m4870P();
        if (bundleM4870P != null) {
            if (bundleM4870P.containsKey(str)) {
                return Boolean.valueOf(bundleM4870P.getBoolean(str));
            }
            return null;
        }
        xcc xccVar = ((kjc) this.f60774a).f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68080f.m17923a("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4872R() {
        ((kjc) this.f60774a).getClass();
        Boolean boolM4871Q = m4871Q("firebase_analytics_collection_deactivated");
        return boolM4871Q != null && boolM4871Q.booleanValue();
    }

    /* JADX INFO: renamed from: S */
    public final boolean m4873S() {
        Boolean boolM4871Q = m4871Q("google_analytics_automatic_screen_reporting_enabled");
        return boolM4871Q == null || boolM4871Q.booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public final zzji m4874T(String str, boolean z) {
        Object obj;
        lda.m16127m(str);
        kjc kjcVar = (kjc) this.f60774a;
        Bundle bundleM4870P = m4870P();
        if (bundleM4870P == null) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM4870P.get(str);
        }
        if (obj == null) {
            return zzji.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return zzji.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return zzji.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return zzji.POLICY;
        }
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar2);
        xccVar2.f68083i.m17924b(str, "Invalid manifest metadata for");
        return zzji.UNINITIALIZED;
    }
}
