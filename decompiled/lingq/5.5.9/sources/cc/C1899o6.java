package cc;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: cc.o6 */
/* JADX INFO: loaded from: classes.dex */
public final class C1899o6 extends AbstractC1774a7 {

    /* JADX INFO: renamed from: d */
    public final HashMap f10093d;

    /* JADX INFO: renamed from: e */
    public final C1959v3 f10094e;

    /* JADX INFO: renamed from: f */
    public final C1959v3 f10095f;

    /* JADX INFO: renamed from: g */
    public final C1959v3 f10096g;

    /* JADX INFO: renamed from: h */
    public final C1959v3 f10097h;

    /* JADX INFO: renamed from: i */
    public final C1959v3 f10098i;

    public C1899o6(C1846i7 c1846i7) {
        super(c1846i7);
        this.f10093d = new HashMap();
        C1986y3 c1986y3 = ((C1897o4) this.f10430a).f10085h;
        C1897o4.m5774i(c1986y3);
        this.f10094e = new C1959v3(c1986y3, "last_delete_stale", 0L);
        C1986y3 c1986y4 = ((C1897o4) this.f10430a).f10085h;
        C1897o4.m5774i(c1986y4);
        this.f10095f = new C1959v3(c1986y4, "backoff", 0L);
        C1986y3 c1986y5 = ((C1897o4) this.f10430a).f10085h;
        C1897o4.m5774i(c1986y5);
        this.f10096g = new C1959v3(c1986y5, "last_upload", 0L);
        C1986y3 c1986y6 = ((C1897o4) this.f10430a).f10085h;
        C1897o4.m5774i(c1986y6);
        this.f10097h = new C1959v3(c1986y6, "last_upload_attempt", 0L);
        C1986y3 c1986y7 = ((C1897o4) this.f10430a).f10085h;
        C1897o4.m5774i(c1986y7);
        this.f10098i = new C1959v3(c1986y7, "midnight_offset", 0L);
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public final Pair m5789l(String str) {
        C1890n6 c1890n6;
        AdvertisingIdClient.Info advertisingIdInfo;
        mo5748g();
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        c1897o4.f10058I.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f10093d;
        C1890n6 c1890n7 = (C1890n6) map.get(str);
        if (c1890n7 != null && jElapsedRealtime < c1890n7.f10040c) {
            return new Pair(c1890n7.f10038a, Boolean.valueOf(c1890n7.f10039b));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jM5579n = c1897o4.f10084g.m5579n(str, C1985y2.f10343c) + jElapsedRealtime;
        try {
            long jM5579n2 = ((C1897o4) interfaceC1781b5).f10084g.m5579n(str, C1985y2.f10345d);
            if (jM5579n2 > 0) {
                try {
                    advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((C1897o4) interfaceC1781b5).f10076a);
                } catch (PackageManager.NameNotFoundException unused) {
                    if (c1890n7 != null && jElapsedRealtime < c1890n7.f10040c + jM5579n2) {
                        return new Pair(c1890n7.f10038a, Boolean.valueOf(c1890n7.f10039b));
                    }
                    advertisingIdInfo = null;
                }
            } else {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(((C1897o4) interfaceC1781b5).f10076a);
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo.getId();
            c1890n6 = id2 != null ? new C1890n6(jM5579n, id2, advertisingIdInfo.isLimitAdTrackingEnabled()) : new C1890n6(jM5579n, "", advertisingIdInfo.isLimitAdTrackingEnabled());
            map.put(str, c1890n6);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(c1890n6.f10038a, Boolean.valueOf(c1890n6.f10039b));
        } catch (Exception e10) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9937H.m5624b(e10, "Unable to get advertising id");
            c1890n6 = new C1890n6(jM5579n, "", false);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final String m5790m(String str, boolean z10) {
        mo5748g();
        String str2 = z10 ? (String) m5789l(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestM5801p = C1900o7.m5801p();
        if (messageDigestM5801p == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM5801p.digest(str2.getBytes())));
    }
}
