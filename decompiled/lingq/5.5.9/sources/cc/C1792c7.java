package cc;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2806q2;
import com.google.android.gms.internal.measurement.C2854tb;
import com.google.android.gms.internal.measurement.InterfaceC2867ub;
import java.util.HashMap;

/* JADX INFO: renamed from: cc.c7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1792c7 extends C1997z6 {
    public C1792c7(C1846i7 c1846i7) {
        super(c1846i7);
    }

    /* JADX INFO: renamed from: h */
    public final C1783b7 m5568h(String str) throws Throwable {
        ((InterfaceC2867ub) C2854tb.f14447b.f14448a.zza()).zza();
        C1897o4 c1897o4 = (C1897o4) this.f10430a;
        C1783b7 c1783b7 = null;
        if (c1897o4.f10084g.m5582q(null, C1985y2.f10364m0)) {
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9938I.m5623a("sgtm feature flag enabled.");
            C1846i7 c1846i7 = this.f10436b;
            C1847j c1847j = c1846i7.f9893c;
            C1846i7.m5629H(c1847j);
            C1790c5 c1790c5M5668B = c1847j.m5668B(str);
            if (c1790c5M5668B == null) {
                return new C1783b7(m5569j(str));
            }
            if (c1790c5M5668B.m5567z()) {
                C1860k3 c1860k4 = c1897o4.f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9938I.m5623a("sgtm upload enabled in manifest.");
                C1834h4 c1834h4 = c1846i7.f9891a;
                C1846i7.m5629H(c1834h4);
                C2806q2 c2806q2M5618r = c1834h4.m5618r(c1790c5M5668B.m5537E());
                if (c2806q2M5618r != null) {
                    String strM8166C = c2806q2M5618r.m8166C();
                    if (!TextUtils.isEmpty(strM8166C)) {
                        String strM8165B = c2806q2M5618r.m8165B();
                        C1860k3 c1860k5 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9938I.m5625c(strM8166C, true != TextUtils.isEmpty(strM8165B) ? "N" : "Y", "sgtm configured with upload_url, server_info");
                        if (TextUtils.isEmpty(strM8165B)) {
                            c1897o4.getClass();
                            c1783b7 = new C1783b7(strM8166C);
                        } else {
                            HashMap map = new HashMap();
                            map.put("x-google-sgtm-server-info", strM8165B);
                            c1783b7 = new C1783b7(strM8166C, map);
                        }
                    }
                }
            }
            if (c1783b7 != null) {
                return c1783b7;
            }
        }
        return new C1783b7(m5569j(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final String m5569j(String str) throws Throwable {
        C1834h4 c1834h4 = this.f10436b.f9891a;
        C1846i7.m5629H(c1834h4);
        c1834h4.mo5748g();
        c1834h4.m5615n(str);
        String str2 = (String) c1834h4.f9848l.getOrDefault(str, null);
        if (TextUtils.isEmpty(str2)) {
            return (String) C1985y2.f10375s.m5912a(null);
        }
        Uri uri = Uri.parse((String) C1985y2.f10375s.m5912a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(str2 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
