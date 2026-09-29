package p366rg;

import android.content.Context;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import p075dh.C5176d;
import p176ib.C6259c1;
import p485xg.C10188d;
import p534zf.C10483a;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10486d;
import p534zf.InterfaceC10488f;
import sg.C9002a;

/* JADX INFO: renamed from: rg.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8783d extends AbstractC8781b {

    /* JADX INFO: renamed from: c */
    public String f46558c = null;

    /* JADX INFO: renamed from: d */
    public String f46559d = null;

    /* JADX INFO: renamed from: e */
    public String f46560e = null;

    /* JADX INFO: renamed from: f */
    public String f46561f = null;

    /* JADX INFO: renamed from: g */
    public String f46562g = null;

    /* JADX INFO: renamed from: h */
    public String f46563h = null;

    /* JADX INFO: renamed from: i */
    public long f46564i = 0;

    /* JADX INFO: renamed from: j */
    public InterfaceC10488f f46565j = null;

    /* JADX INFO: renamed from: k */
    public InterfaceC10488f f46566k = null;

    /* JADX INFO: renamed from: l */
    public String f46567l = null;

    /* JADX INFO: renamed from: m */
    public C10188d f46568m = null;

    /* JADX INFO: renamed from: n */
    public String f46569n = null;

    /* JADX INFO: renamed from: o */
    public C9002a f46570o = null;

    /* JADX INFO: renamed from: p */
    public String f46571p = null;

    /* JADX INFO: renamed from: q */
    public InterfaceC10484b f46572q = null;

    /* JADX INFO: renamed from: r */
    public InterfaceC10488f f46573r = null;

    /* JADX INFO: renamed from: s */
    public C6259c1 f46574s = null;

    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: b */
    public final synchronized C8780a[] mo17042b() {
        PayloadType[] payloadTypeArr;
        PayloadType payloadType;
        PayloadType payloadType2;
        PayloadType payloadType3;
        PayloadType payloadType4;
        try {
            payloadTypeArr = PayloadType.ALL_TRACKING;
            payloadType = PayloadType.Init;
            payloadType2 = PayloadType.SessionBegin;
            payloadType3 = PayloadType.SessionEnd;
            payloadType4 = PayloadType.Install;
        } catch (Throwable th2) {
            throw th2;
        }
        return new C8780a[]{C8780a.m17040b("action", true, false, payloadTypeArr), C8780a.m17040b("kochava_app_id", true, true, payloadTypeArr), C8780a.m17040b("kochava_device_id", true, true, payloadTypeArr), C8780a.m17040b("sdk_version", true, false, payloadTypeArr), C8780a.m17040b("sdk_protocol", true, false, payloadTypeArr), C8780a.m17040b("nt_id", true, false, payloadTypeArr), C8780a.m17040b("init_token", false, false, payloadTypeArr), C8780a.m17040b("modules", true, false, payloadType), C8780a.m17040b("consent", true, true, payloadTypeArr), C8780a.m17039a("usertime", false, false, payloadTypeArr), C8780a.m17039a("uptime", false, false, payloadTypeArr), C8780a.m17039a("starttime", false, false, payloadTypeArr), C8780a.m17039a("state", false, false, payloadType2, payloadType3), C8780a.m17039a("state_active", false, false, payloadType4, payloadType2, payloadType3, PayloadType.Event), C8780a.m17039a("state_active_count", false, false, payloadType3), C8780a.m17039a("partner_name", true, false, payloadType), C8780a.m17039a("platform", false, false, payloadType, payloadType4), C8780a.m17039a("identity_link", false, false, payloadType4), C8780a.m17039a("token", false, false, PayloadType.PushTokenAdd, PayloadType.PushTokenRemove), C8780a.m17039a("last_install", false, false, payloadType), C8780a.m17039a("deeplinks", false, false, payloadType4), C8780a.m17039a("deeplinks_augmentation", false, false, payloadType), C8780a.m17039a("deeplinks_deferred_prefetch", false, false, payloadType4)};
    }

    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC10486d mo17043c(Context context, C5176d c5176d, String str, ArrayList arrayList, List list) throws Exception {
        C10485c c10485cM19441d;
        C10485c c10485c;
        try {
            str.getClass();
            switch (str) {
                case "starttime":
                    long j10 = c5176d.f33199c;
                    if (j10 == 0) {
                        j10 = c5176d.f33201e;
                    }
                    return new C10485c(Long.valueOf(j10 / 1000));
                case "deeplinks_deferred_prefetch":
                    C6259c1 c6259c1 = this.f46574s;
                    return c6259c1 != null ? c6259c1.m12893a().mo19461k() : C10485c.m19441d();
                case "sdk_protocol":
                    String str2 = this.f46562g;
                    return str2 != null ? new C10485c(str2) : C10485c.m19441d();
                case "deeplinks":
                    C9002a c9002a = this.f46570o;
                    return c9002a != null ? c9002a.m17265a().mo19461k() : C10485c.m19441d();
                case "last_install":
                    C10188d c10188d = this.f46568m;
                    return c10188d != null ? c10188d.m19200b().mo19461k() : C10485c.m19441d();
                case "action":
                    return new C10485c(c5176d.f33197a.getAction());
                case "uptime":
                    return new C10485c(Double.valueOf(C5206f.m11011j1(c5176d.f33202f)));
                case "kochava_app_id":
                    String str3 = this.f46558c;
                    return str3 != null ? new C10485c(str3) : C10485c.m19441d();
                case "sdk_version":
                    String str4 = this.f46561f;
                    return str4 != null ? new C10485c(str4) : C10485c.m19441d();
                case "usertime":
                    return new C10485c(Long.valueOf(c5176d.f33201e / 1000));
                case "state_active":
                    return C10485c.m19439b(c5176d.f33203g);
                case "kochava_device_id":
                    String str5 = this.f46560e;
                    return str5 != null ? new C10485c(str5) : C10485c.m19441d();
                case "nt_id":
                    if (this.f46563h != null) {
                        c10485cM19441d = new C10485c(this.f46563h + "-" + this.f46564i + "-" + UUID.randomUUID().toString());
                    } else {
                        c10485cM19441d = C10485c.m19441d();
                    }
                    return c10485cM19441d;
                case "state":
                    PayloadType payloadType = c5176d.f33197a;
                    if (payloadType == PayloadType.SessionBegin) {
                        c10485c = new C10485c("resume");
                    } else {
                        c10485c = payloadType == PayloadType.SessionEnd ? new C10485c("pause") : C10485c.m19441d();
                    }
                    return c10485c;
                case "token":
                    String str6 = this.f46567l;
                    return str6 != null ? new C10485c(str6) : C10485c.m19441d();
                case "partner_name":
                    String str7 = this.f46559d;
                    return str7 != null ? new C10485c(str7) : C10485c.m19441d();
                case "state_active_count":
                    return C10485c.m19440c(c5176d.f33204h);
                case "identity_link":
                    return m17052e(list);
                case "init_token":
                    String str8 = this.f46571p;
                    return str8 != null ? new C10485c(str8) : C10485c.m19441d();
                case "consent":
                    InterfaceC10488f interfaceC10488f = this.f46573r;
                    return interfaceC10488f != null ? new C10485c(interfaceC10488f) : C10485c.m19441d();
                case "deeplinks_augmentation":
                    InterfaceC10488f interfaceC10488f2 = this.f46566k;
                    return interfaceC10488f2 != null ? interfaceC10488f2.mo19461k() : C10485c.m19441d();
                case "modules":
                    InterfaceC10484b interfaceC10484b = this.f46572q;
                    return interfaceC10484b != null ? new C10485c(interfaceC10484b) : C10485c.m19441d();
                case "platform":
                    String str9 = this.f46569n;
                    return str9 != null ? new C10485c(str9) : C10485c.m19441d();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC10486d m17052e(List<String> list) {
        if (this.f46565j == null) {
            return C10485c.m19441d();
        }
        C10487e c10487eM19445u = C10487e.m19445u();
        for (String str : this.f46565j.mo19460j()) {
            if (!list.contains(str)) {
                c10487eM19445u.mo19458h(str, this.f46565j.mo19457g(str));
            }
        }
        return c10487eM19445u.mo19461k();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m17053f(InterfaceC10488f interfaceC10488f) {
        try {
            this.f46566k = interfaceC10488f;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final synchronized void m17054g(C6259c1 c6259c1) {
        try {
            this.f46574s = c6259c1;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final synchronized void m17055h(String str) {
        try {
            this.f46563h = str;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m17056i(C10188d c10188d) {
        try {
            this.f46568m = c10188d;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public final synchronized void m17057j(C10483a c10483a) {
        try {
            this.f46572q = c10483a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m17058k(String str) {
        this.f46567l = str;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m17059l(long j10) {
        this.f46564i = Math.max(0L, j10);
    }
}
