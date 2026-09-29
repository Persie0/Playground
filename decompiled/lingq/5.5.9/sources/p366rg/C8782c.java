package p366rg;

import android.content.Context;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;
import java.util.List;
import p075dh.C5176d;
import p158hh.C6047b;
import p510yg.C10360a;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10486d;
import p534zf.InterfaceC10488f;
import ug.C9523a;

/* JADX INFO: renamed from: rg.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8782c extends AbstractC8781b {

    /* JADX INFO: renamed from: c */
    public String f46543c = null;

    /* JADX INFO: renamed from: d */
    public String f46544d = null;

    /* JADX INFO: renamed from: e */
    public Boolean f46545e = null;

    /* JADX INFO: renamed from: f */
    public String f46546f = null;

    /* JADX INFO: renamed from: g */
    public Boolean f46547g = null;

    /* JADX INFO: renamed from: h */
    public String f46548h = null;

    /* JADX INFO: renamed from: i */
    public Boolean f46549i = null;

    /* JADX INFO: renamed from: j */
    public Boolean f46550j = null;

    /* JADX INFO: renamed from: k */
    public String f46551k = null;

    /* JADX INFO: renamed from: l */
    public String f46552l = null;

    /* JADX INFO: renamed from: m */
    public Integer f46553m = null;

    /* JADX INFO: renamed from: n */
    public C10360a f46554n = null;

    /* JADX INFO: renamed from: o */
    public C9523a f46555o = null;

    /* JADX INFO: renamed from: p */
    public C6047b f46556p = null;

    /* JADX INFO: renamed from: q */
    public InterfaceC10488f f46557q = null;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: b */
    public final synchronized C8780a[] mo17042b() {
        PayloadType payloadType;
        PayloadType payloadType2;
        payloadType = PayloadType.Install;
        payloadType2 = PayloadType.Update;
        return new C8780a[]{C8780a.m17039a("android_id", false, false, payloadType, payloadType2), C8780a.m17039a("adid", false, false, payloadType, payloadType2), C8780a.m17039a("fire_adid", false, false, payloadType, payloadType2), C8780a.m17039a("oaid", false, false, payloadType, payloadType2), C8780a.m17039a("device_limit_tracking", false, false, payloadType, payloadType2), C8780a.m17039a("app_limit_tracking", false, false, payloadType, payloadType2), C8780a.m17039a("fb_attribution_id", false, false, payloadType), C8780a.m17039a("asid", false, false, payloadType, payloadType2), C8780a.m17039a("asid_scope", false, false, payloadType), C8780a.m17039a("install_referrer", false, false, payloadType), C8780a.m17039a("huawei_referrer", false, false, payloadType), C8780a.m17039a("samsung_referrer", false, false, payloadType), C8780a.m17039a("custom_device_ids", false, true, payloadType), C8780a.m17039a("conversion_data", false, false, payloadType), C8780a.m17039a("conversion_type", false, false, payloadType)};
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC10486d mo17043c(Context context, C5176d c5176d, String str, ArrayList arrayList, List list) throws Exception {
        try {
            str.getClass();
            switch (str) {
                case "device_limit_tracking":
                    Boolean boolM17045e = m17045e();
                    return boolM17045e != null ? C10485c.m19439b(boolM17045e.booleanValue()) : C10485c.m19441d();
                case "fire_adid":
                    String str2 = this.f46546f;
                    return str2 != null ? new C10485c(str2) : C10485c.m19441d();
                case "adid":
                    String str3 = this.f46544d;
                    return str3 != null ? new C10485c(str3) : C10485c.m19441d();
                case "asid":
                    String str4 = this.f46552l;
                    return str4 != null ? new C10485c(str4) : C10485c.m19441d();
                case "oaid":
                    String str5 = this.f46548h;
                    return str5 != null ? new C10485c(str5) : C10485c.m19441d();
                case "asid_scope":
                    Integer num = this.f46553m;
                    return num != null ? C10485c.m19440c(num.intValue()) : C10485c.m19441d();
                case "custom_device_ids":
                    return m17046f(arrayList);
                case "conversion_data":
                    C10485c c10485cMo19457g = (this.f46557q != null && arrayList.contains("conversion_data") && this.f46557q.mo19463m("legacy_referrer")) ? this.f46557q.mo19457g("legacy_referrer") : C10485c.m19441d();
                    return c10485cMo19457g;
                case "conversion_type":
                    C10485c c10485c = (this.f46557q != null && arrayList.contains("conversion_type") && this.f46557q.mo19463m("legacy_referrer")) ? new C10485c("gplay") : C10485c.m19441d();
                    return c10485c;
                case "android_id":
                    String str6 = this.f46543c;
                    return str6 != null ? new C10485c(str6) : C10485c.m19441d();
                case "app_limit_tracking":
                    Boolean bool = this.f46550j;
                    return bool != null ? C10485c.m19439b(bool.booleanValue()) : C10485c.m19441d();
                case "install_referrer":
                    C10360a c10360a = this.f46554n;
                    return c10360a != null ? c10360a.m19383b().mo19461k() : C10485c.m19441d();
                case "samsung_referrer":
                    C6047b c6047b = this.f46556p;
                    return c6047b != null ? c6047b.m12492a().mo19461k() : C10485c.m19441d();
                case "fb_attribution_id":
                    String str7 = this.f46551k;
                    return str7 != null ? new C10485c(str7) : C10485c.m19441d();
                case "huawei_referrer":
                    C9523a c9523a = this.f46555o;
                    return c9523a != null ? c9523a.m17985b().mo19461k() : C10485c.m19441d();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX INFO: renamed from: e */
    public final Boolean m17045e() {
        Boolean bool;
        boolean z10;
        Boolean bool2 = this.f46545e;
        if (bool2 == null && this.f46547g == null && this.f46549i == null) {
            return null;
        }
        if (bool2 == null || !bool2.booleanValue()) {
            Boolean bool3 = this.f46547g;
            if ((bool3 == null || !bool3.booleanValue()) && ((bool = this.f46549i) == null || !bool.booleanValue())) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: f */
    public final InterfaceC10486d m17046f(ArrayList arrayList) {
        if (this.f46557q == null) {
            return C10485c.m19441d();
        }
        C10487e c10487eM19445u = C10487e.m19445u();
        for (String str : this.f46557q.mo19460j()) {
            if (arrayList.contains(str)) {
                if ("email".equals(str)) {
                    String strMo19467q = this.f46557q.mo19467q(str, "");
                    C10487e c10487eM19445u2 = C10487e.m19445u();
                    c10487eM19445u2.m19450D("email", "[" + strMo19467q + "]");
                    c10487eM19445u.m19448B(c10487eM19445u2, "ids");
                } else {
                    c10487eM19445u.mo19458h(str, this.f46557q.mo19457g(str));
                }
            }
        }
        return c10487eM19445u.mo19461k();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m17047g() {
        Boolean boolM17045e;
        try {
            boolM17045e = m17045e();
        } catch (Throwable th2) {
            throw th2;
        }
        return boolM17045e != null && boolM17045e.booleanValue();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m17048h(InterfaceC10488f interfaceC10488f) {
        this.f46557q = interfaceC10488f;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final synchronized void m17049i(C9523a c9523a) {
        this.f46555o = c9523a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m17050j(C10360a c10360a) {
        try {
            this.f46554n = c10360a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m17051k(C6047b c6047b) {
        try {
            this.f46556p = c6047b;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
