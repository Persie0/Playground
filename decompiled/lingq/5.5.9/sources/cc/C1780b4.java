package cc;

import com.kochava.tracker.BuildConfig;
import p295ob.C8031a;
import p295ob.C8032b;

/* JADX INFO: renamed from: cc.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1780b4 {

    /* JADX INFO: renamed from: a */
    public final C1897o4 f9684a;

    public C1780b4(C1846i7 c1846i7) {
        this.f9684a = c1846i7.f9902l;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5513a() {
        C1897o4 c1897o4 = this.f9684a;
        try {
            C8031a c8031aM15902a = C8032b.m15902a(c1897o4.f10076a);
            if (c8031aM15902a != null) {
                return c8031aM15902a.m15900b("com.android.vending", BuildConfig.SDK_TRUNCATE_LENGTH).versionCode >= 80837300;
            }
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5623a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e10) {
            C1860k3 c1860k4 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9938I.m5624b(e10, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
