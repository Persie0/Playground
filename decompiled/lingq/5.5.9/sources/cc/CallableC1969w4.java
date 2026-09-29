package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: cc.w4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1969w4 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f10275b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f10276c;

    public /* synthetic */ CallableC1969w4(String str, int i10, Object obj) {
        this.f10274a = i10;
        this.f10276c = obj;
        this.f10275b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f10274a;
        String str = this.f10275b;
        Object obj = this.f10276c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) obj;
                binderC1987y4.f10411a.m5647a();
                C1847j c1847j = binderC1987y4.f10411a.f9893c;
                C1846i7.m5629H(c1847j);
                return c1847j.m5678L(str);
            default:
                C1834h4 c1834h4 = (C1834h4) obj;
                C1847j c1847j2 = c1834h4.f10436b.f9893c;
                C1846i7.m5629H(c1847j2);
                C1790c5 c1790c5M5668B = c1847j2.m5668B(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((C1897o4) c1834h4.f10430a).f10084g.m5578m();
                map.put("gmp_version", 76003L);
                if (c1790c5M5668B != null) {
                    String strM5539G = c1790c5M5668B.m5539G();
                    if (strM5539G != null) {
                        map.put("app_version", strM5539G);
                    }
                    map.put("app_version_int", Long.valueOf(c1790c5M5668B.m5533A()));
                    map.put("dynamite_version", Long.valueOf(c1790c5M5668B.m5534B()));
                }
                return map;
        }
    }
}
