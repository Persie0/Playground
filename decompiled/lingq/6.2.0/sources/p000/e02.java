package p000;

import android.content.Context;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class e02 extends c02 {

    /* JADX INFO: renamed from: c */
    public String f36485c;

    /* JADX INFO: renamed from: d */
    public String f36486d;

    /* JADX INFO: renamed from: e */
    public String f36487e;

    /* JADX INFO: renamed from: f */
    public String f36488f;

    /* JADX INFO: renamed from: g */
    public String f36489g;

    /* JADX INFO: renamed from: h */
    public String f36490h;

    /* JADX INFO: renamed from: i */
    public long f36491i;

    /* JADX INFO: renamed from: j */
    public eg4 f36492j;

    /* JADX INFO: renamed from: k */
    public String f36493k;

    /* JADX INFO: renamed from: l */
    public e32 f36494l;

    /* JADX INFO: renamed from: m */
    public String f36495m;

    /* JADX INFO: renamed from: n */
    public f74 f36496n;

    /* JADX INFO: renamed from: o */
    public String f36497o;

    /* JADX INFO: renamed from: p */
    public ef4 f36498p;

    /* JADX INFO: renamed from: q */
    public t44 f36499q;

    /* JADX INFO: renamed from: r */
    public eg4 f36500r;

    @Override // p000.c02
    /* JADX INFO: renamed from: a */
    public final synchronized a02[] mo4248a() {
        a02 a02VarM3b;
        a02 a02VarM3b2;
        a02 a02VarM3b3;
        a02 a02VarM3b4;
        a02 a02VarM3b5;
        a02 a02VarM3b6;
        a02 a02VarM3b7;
        a02 a02VarM3b8;
        PayloadType payloadType;
        a02 a02VarM3b9;
        a02 a02VarM2a;
        a02 a02VarM2a2;
        a02 a02VarM2a3;
        PayloadType payloadType2;
        PayloadType payloadType3;
        a02 a02VarM2a4;
        PayloadType payloadType4;
        PayloadType payloadType5;
        PayloadType[] payloadTypeArr = PayloadType.ALL_TRACKING;
        a02VarM3b = a02.m3b("action", true, false, payloadTypeArr);
        a02VarM3b2 = a02.m3b("kochava_app_id", true, true, payloadTypeArr);
        a02VarM3b3 = a02.m3b("kochava_device_id", true, true, payloadTypeArr);
        a02VarM3b4 = a02.m3b("sdk_version", true, false, payloadTypeArr);
        a02VarM3b5 = a02.m3b("sdk_protocol", true, false, payloadTypeArr);
        a02VarM3b6 = a02.m3b("sdk_capabilities", true, false, payloadTypeArr);
        a02VarM3b7 = a02.m3b("nt_id", true, false, payloadTypeArr);
        a02VarM3b8 = a02.m3b("init_token", false, false, payloadTypeArr);
        payloadType = PayloadType.Init;
        a02VarM3b9 = a02.m3b("modules", true, false, payloadType);
        a02VarM2a = a02.m2a("usertime", false, false, payloadTypeArr);
        a02VarM2a2 = a02.m2a("uptime", false, false, payloadTypeArr);
        a02VarM2a3 = a02.m2a("starttime", false, false, payloadTypeArr);
        payloadType2 = PayloadType.SessionBegin;
        payloadType3 = PayloadType.SessionEnd;
        a02VarM2a4 = a02.m2a("state", false, false, payloadType2, payloadType3);
        payloadType4 = PayloadType.Install;
        payloadType5 = PayloadType.Event;
        return new a02[]{a02VarM3b, a02VarM3b2, a02VarM3b3, a02VarM3b4, a02VarM3b5, a02VarM3b6, a02VarM3b7, a02VarM3b8, a02VarM3b9, a02VarM2a, a02VarM2a2, a02VarM2a3, a02VarM2a4, a02.m2a("state_active", false, false, payloadType4, payloadType2, payloadType3, payloadType5), a02.m2a("state_active_count", false, false, payloadType3), a02.m2a("partner_name", true, false, payloadType), a02.m2a("platform", false, false, payloadType, payloadType4), a02.m2a("identity_link", false, false, payloadType4), a02.m2a("token", false, false, PayloadType.PushTokenAdd, PayloadType.PushTokenRemove), a02.m2a("last_install", false, false, payloadType), a02.m2a("deeplinks", false, false, payloadType4), a02.m2a("deeplinks_augmentation", false, false, payloadType), a02.m2a("deeplinks_deferred_prefetch", false, false, payloadType4), a02.m2a("custom_values", false, false, payloadType4, payloadType2, payloadType3, payloadType5)};
    }

    @Override // p000.c02
    /* JADX INFO: renamed from: b */
    public final synchronized rf4 mo4249b(Context context, n67 n67Var, String str, List list, List list2) {
        rf4 rf4VarM20644d;
        rf4 rf4Var;
        try {
            switch (str) {
                case "starttime":
                    long j = n67Var.f52407c;
                    if (j == 0) {
                        j = n67Var.f52409e;
                    }
                    return new rf4(Long.valueOf(j / 1000));
                case "deeplinks_deferred_prefetch":
                    t44 t44Var = this.f36499q;
                    return t44Var != null ? ((wmd) t44Var).m24064e().m10332C() : rf4.m20644d();
                case "sdk_protocol":
                    String str2 = this.f36488f;
                    return str2 != null ? new rf4(str2) : rf4.m20644d();
                case "deeplinks":
                    f74 f74Var = this.f36496n;
                    return f74Var != null ? ((e74) f74Var).m10905m().m10332C() : rf4.m20644d();
                case "last_install":
                    e32 e32Var = this.f36494l;
                    return e32Var != null ? e32Var.m10823j().m10332C() : rf4.m20644d();
                case "action":
                    return new rf4(n67Var.f52405a.getAction());
                case "uptime":
                    return new rf4(Double.valueOf(n67Var.f52410f / 1000.0d));
                case "kochava_app_id":
                    String str3 = this.f36485c;
                    return str3 != null ? new rf4(str3) : rf4.m20644d();
                case "sdk_version":
                    String str4 = this.f36487e;
                    return str4 != null ? new rf4(str4) : rf4.m20644d();
                case "usertime":
                    return new rf4(Long.valueOf(n67Var.f52409e / 1000));
                case "state_active":
                    return rf4.m20642b(n67Var.f52411g);
                case "sdk_capabilities":
                    String str5 = this.f36489g;
                    return str5 != null ? new rf4(str5) : rf4.m20644d();
                case "kochava_device_id":
                    String str6 = this.f36486d;
                    return str6 != null ? new rf4(str6) : rf4.m20644d();
                case "nt_id":
                    if (this.f36490h != null) {
                        rf4VarM20644d = new rf4(this.f36490h + "-" + this.f36491i + "-" + UUID.randomUUID().toString());
                    } else {
                        rf4VarM20644d = rf4.m20644d();
                    }
                    return rf4VarM20644d;
                case "state":
                    PayloadType payloadType = n67Var.f52405a;
                    if (payloadType == PayloadType.SessionBegin) {
                        rf4Var = new rf4("resume");
                    } else {
                        rf4Var = payloadType == PayloadType.SessionEnd ? new rf4("pause") : rf4.m20644d();
                    }
                    return rf4Var;
                case "token":
                    String str7 = this.f36493k;
                    return str7 != null ? new rf4(str7) : rf4.m20644d();
                case "partner_name":
                    return rf4.m20644d();
                case "state_active_count":
                    return rf4.m20643c(n67Var.f52412h);
                case "identity_link":
                    return m10765e(list2);
                case "init_token":
                    String str8 = this.f36497o;
                    return str8 != null ? new rf4(str8) : rf4.m20644d();
                case "deeplinks_augmentation":
                    return rf4.m20644d();
                case "modules":
                    ef4 ef4Var = this.f36498p;
                    return ef4Var != null ? new rf4(ef4Var) : rf4.m20644d();
                case "custom_values":
                    eg4 eg4Var = this.f36500r;
                    return eg4Var != null ? ((dg4) eg4Var).m10332C() : rf4.m20644d();
                case "platform":
                    String str9 = this.f36495m;
                    return str9 != null ? new rf4(str9) : rf4.m20644d();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: e */
    public final rf4 m10765e(List list) {
        if (this.f36492j == null) {
            return rf4.m20644d();
        }
        dg4 dg4VarM10328c = dg4.m10328c();
        for (String str : ((dg4) this.f36492j).m10347q()) {
            if (!list.contains(str)) {
                dg4VarM10328c.m10355y(str, ((dg4) this.f36492j).m10341k(str, true));
            }
        }
        return dg4VarM10328c.m10332C();
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m10766f(dg4 dg4Var) {
        this.f36500r = dg4Var;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m10767g(String str) {
        this.f36486d = str;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m10768h(dg4 dg4Var) {
        this.f36492j = dg4Var;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m10769i(String str) {
        this.f36497o = str;
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m10770j(String str) {
        this.f36490h = str;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m10771k(f74 f74Var) {
        this.f36496n = f74Var;
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m10772l(e32 e32Var) {
        this.f36494l = e32Var;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m10773m(String str) {
        this.f36495m = str;
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m10774n(String str) {
        this.f36493k = str;
    }

    /* JADX INFO: renamed from: o */
    public final synchronized void m10775o() {
        this.f36488f = BuildConfig.SDK_PROTOCOL;
    }

    /* JADX INFO: renamed from: p */
    public final synchronized void m10776p() {
        this.f36487e = "AndroidTracker 5.7.1";
    }

    /* JADX INFO: renamed from: q */
    public final synchronized void m10777q(long j) {
        this.f36491i = Math.max(0L, j);
    }
}
