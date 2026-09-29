package p000;

import android.content.Context;
import android.net.Uri;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;
import com.kochava.tracker.privacy.consent.internal.ConsentState;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class l67 {

    /* JADX INFO: renamed from: l */
    public static final sq5 f49186l;

    /* JADX INFO: renamed from: a */
    public final n67 f49187a;

    /* JADX INFO: renamed from: b */
    public final eg4 f49188b;

    /* JADX INFO: renamed from: c */
    public final eg4 f49189c;

    /* JADX INFO: renamed from: d */
    public final Uri f49190d;

    /* JADX INFO: renamed from: e */
    public int f49191e;

    /* JADX INFO: renamed from: f */
    public boolean f49192f;

    /* JADX INFO: renamed from: g */
    public boolean f49193g;

    /* JADX INFO: renamed from: h */
    public boolean f49194h;

    /* JADX INFO: renamed from: i */
    public boolean f49195i;

    /* JADX INFO: renamed from: j */
    public m67 f49196j;

    /* JADX INFO: renamed from: k */
    public boolean f49197k;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f49186l = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "Payload");
    }

    public l67(n67 n67Var, eg4 eg4Var, eg4 eg4Var2, Uri uri, int i, boolean z, boolean z2, boolean z3, boolean z4, m67 m67Var, boolean z5) {
        this.f49187a = n67Var;
        this.f49188b = eg4Var;
        this.f49189c = eg4Var2;
        this.f49190d = uri;
        this.f49191e = i;
        this.f49192f = z;
        this.f49193g = z2;
        this.f49194h = z3;
        this.f49195i = z4;
        this.f49196j = m67Var;
        this.f49197k = z5;
    }

    /* JADX INFO: renamed from: a */
    public static String m15898a(byte[] bArr) {
        return new String(bArr, b34.m3245k());
    }

    /* JADX INFO: renamed from: b */
    public static void m15899b(StringBuilder sb, Object obj) {
        if (obj == null) {
            return;
        }
        sb.append(obj);
    }

    /* JADX INFO: renamed from: c */
    public static l67 m15900c(PayloadType payloadType, long j, long j2, long j3, long j4, boolean z, int i) {
        return new l67(new n67(payloadType, PayloadMethod.Post, j, j2, j3, j4, z, i), dg4.m10328c(), dg4.m10328c(), Uri.EMPTY, 0, true, true, true, false, null, false);
    }

    /* JADX INFO: renamed from: d */
    public static l67 m15901d(eg4 eg4Var) {
        m67 m67Var;
        dg4 dg4Var = (dg4) eg4Var;
        dg4 dg4Var2 = (dg4) dg4Var.m10342l("metadata", true);
        PayloadType payloadTypeFromKey = PayloadType.fromKey(dg4Var2.m10344n("payload_type", ""));
        PayloadMethod payloadMethodFromKey = PayloadMethod.fromKey(dg4Var2.m10344n("payload_method", ""));
        long jLongValue = dg4Var2.m10343m("creation_start_time_millis", 0L).longValue();
        long jLongValue2 = dg4Var2.m10343m("creation_start_count", 0L).longValue();
        long jLongValue3 = dg4Var2.m10343m("creation_time_millis", 0L).longValue();
        long jLongValue4 = dg4Var2.m10343m("uptime_millis", 0L).longValue();
        Boolean bool = Boolean.FALSE;
        n67 n67Var = new n67(payloadTypeFromKey, payloadMethodFromKey, jLongValue, jLongValue2, jLongValue3, jLongValue4, dg4Var2.m10337g("state_active", bool).booleanValue(), dg4Var2.m10339i(0, "state_active_count").intValue());
        eg4 eg4VarM10342l = dg4Var.m10342l("envelope", true);
        eg4 eg4VarM10342l2 = dg4Var.m10342l("data", true);
        String strM10344n = dg4Var.m10344n("url", "");
        Uri uri = Uri.EMPTY;
        Uri uriM3218M = b34.m3218M(strM10344n);
        Uri uri2 = uriM3218M != null ? uriM3218M : uri;
        int iIntValue = dg4Var.m10339i(0, "lifetime_attempt_count").intValue();
        Boolean bool2 = Boolean.TRUE;
        boolean zBooleanValue = dg4Var.m10337g("send_date_allowed", bool2).booleanValue();
        boolean zBooleanValue2 = dg4Var.m10337g("attempt_count_allowed", bool2).booleanValue();
        boolean zBooleanValue3 = dg4Var.m10337g("user_agent_allowed", bool2).booleanValue();
        boolean zBooleanValue4 = dg4Var.m10337g("consent_enabled", bool).booleanValue();
        eg4 eg4VarM10342l3 = dg4Var.m10342l("consent", false);
        sq5 sq5Var = m67.f50666d;
        if (eg4VarM10342l3 == null) {
            m67Var = null;
        } else {
            dg4 dg4Var3 = (dg4) eg4VarM10342l3;
            m67Var = new m67(dg4Var3.m10337g("applies", bool).booleanValue(), ConsentState.fromKey(dg4Var3.m10344n("state", "")), dg4Var3.m10343m("state_time", 0L).longValue());
        }
        return new l67(n67Var, eg4VarM10342l, eg4VarM10342l2, uri2, iIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, zBooleanValue4, m67Var, dg4Var.m10337g("filled", bool).booleanValue());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00c0 */
    /* JADX WARN: Code duplicated, block: B:28:0x005b A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0025, B:6:0x0028, B:7:0x0029, B:8:0x002d, B:10:0x0030, B:11:0x0031, B:37:0x0070, B:39:0x0084, B:41:0x0091, B:43:0x0099, B:45:0x009d, B:46:0x00a4, B:48:0x00a7, B:49:0x00a8, B:56:0x00b6, B:57:0x00b7, B:15:0x0039, B:17:0x0040, B:22:0x004c, B:27:0x0055, B:28:0x005b, B:30:0x005f, B:32:0x0063, B:36:0x006a, B:64:0x00bf, B:71:0x00c6, B:5:0x0026, B:47:0x00a5, B:9:0x002e), top: B:78:0x0001, inners: #2, #3, #5 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a A[Catch: all -> 0x00b0, TryCatch #1 {, blocks: (B:3:0x0001, B:4:0x0025, B:6:0x0028, B:7:0x0029, B:8:0x002d, B:10:0x0030, B:11:0x0031, B:37:0x0070, B:39:0x0084, B:41:0x0091, B:43:0x0099, B:45:0x009d, B:46:0x00a4, B:48:0x00a7, B:49:0x00a8, B:56:0x00b6, B:57:0x00b7, B:15:0x0039, B:17:0x0040, B:22:0x004c, B:27:0x0055, B:28:0x005b, B:30:0x005f, B:32:0x0063, B:36:0x006a, B:64:0x00bf, B:71:0x00c6, B:5:0x0026, B:47:0x00a5, B:9:0x002e), top: B:78:0x0001, inners: #2, #3, #5 }] */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m15902e(Context context, g02 g02Var) {
        boolean z;
        m67 m67Var;
        String str;
        this.f49192f = g02Var.m12259g(this.f49187a.f52405a, "send_date");
        this.f49193g = g02Var.m12259g(this.f49187a.f52405a, "attempt_count");
        this.f49194h = g02Var.m12259g(this.f49187a.f52405a, "User-Agent");
        synchronized (g02Var) {
            try {
                z = g02Var.f40009p;
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            }
        }
        this.f49195i = z;
        m67 m67Var2 = this.f49196j;
        synchronized (g02Var) {
            try {
                m67Var = g02Var.f40010q;
            } catch (Throwable th3) {
                th = th3;
                while (true) {
                    throw th;
                }
            }
        }
        sq5 sq5Var = m67.f50666d;
        if (m67Var != null) {
            if (m67Var2 == null) {
                sq5Var.m21555D("Consent updated unknown to known");
            } else {
                ConsentState consentState = m67Var.f50668b;
                ConsentState consentState2 = ConsentState.NOT_ANSWERED;
                if (consentState != consentState2) {
                    if (!(m67Var2.f50668b != consentState2)) {
                        sq5Var.m21555D("Consent updated not answered to answered");
                    } else if (m67Var2.f50667a) {
                        if (!(m67Var2.f50668b != consentState2)) {
                            sq5Var.m21555D("Consent updated not applies to not applies");
                        }
                        throw th;
                    }
                } else if (m67Var2.f50667a && !m67Var.f50667a) {
                    if (!(m67Var2.f50668b != consentState2)) {
                        sq5Var.m21555D("Consent updated not applies to not applies");
                    }
                    throw th;
                }
            }
            m67Var2 = m67Var;
        }
        this.f49196j = m67Var2;
        boolean zM12259g = g02Var.m12259g(this.f49187a.f52405a, "sdk_timing");
        n67 n67Var = this.f49187a;
        if (n67Var.f52406b == PayloadMethod.Post) {
            g02Var.m12255c(context, n67Var, this.f49197k, this.f49188b, this.f49189c);
            if (zM12259g && this.f49187a.f52405a == PayloadType.Install && !this.f49197k) {
                g02Var.m12254b(SdkTimingAction.InstallReady);
                eg4 eg4Var = this.f49189c;
                synchronized (g02Var) {
                    str = g02Var.f40012s;
                }
                ((dg4) eg4Var).m10331B("sdk_timing", str);
            }
        }
        this.f49197k = true;
    }

    /* JADX INFO: renamed from: f */
    public final Uri m15903f() {
        Uri uri = this.f49190d;
        if (b34.m3257y(uri)) {
            return uri;
        }
        PayloadType payloadType = this.f49187a.f52405a;
        return payloadType == PayloadType.Event ? payloadType.getUrl(((dg4) this.f49189c).m10344n("event_name", "")) : payloadType.getUrl();
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m15904g(g02 g02Var) {
        boolean z;
        boolean z2;
        m67 m67Var;
        ConsentState consentState;
        boolean zContains;
        PayloadType payloadType = this.f49187a.f52405a;
        synchronized (g02Var) {
            z = true;
            z2 = (g02Var.f40002i.contains(payloadType) || g02Var.f40008o.contains(payloadType)) ? false : true;
        }
        if (!z2) {
            return false;
        }
        if (this.f49187a.f52405a == PayloadType.Event && !g02Var.m12258f(((dg4) this.f49189c).m10344n("event_name", ""))) {
            return false;
        }
        if (this.f49187a.f52405a == PayloadType.IdentityLink) {
            dg4 dg4Var = (dg4) ((dg4) this.f49189c).m10342l("identity_link", true);
            if (dg4Var.m10348r() == 0) {
                return false;
            }
            String str = (String) dg4Var.m10347q().get(0);
            synchronized (g02Var) {
                zContains = g02Var.f40006m.contains(str);
            }
            if (zContains) {
                return false;
            }
        }
        if (this.f49195i && (m67Var = this.f49196j) != null && (consentState = m67Var.f50668b) != ConsentState.GRANTED && consentState != ConsentState.NOT_ANSWERED && m67Var.f50667a && this.f49187a.f52405a != PayloadType.Init) {
            z = false;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized dg4 m15905h() {
        dg4 dg4VarM10328c;
        try {
            dg4VarM10328c = dg4.m10328c();
            dg4VarM10328c.m10356z("metadata", this.f49187a.m17262a());
            dg4VarM10328c.m10356z("envelope", this.f49188b);
            dg4VarM10328c.m10356z("data", this.f49189c);
            dg4VarM10328c.m10331B("url", this.f49190d.toString());
            dg4VarM10328c.m10353w(this.f49191e, "lifetime_attempt_count");
            dg4VarM10328c.m10351u("send_date_allowed", this.f49192f);
            dg4VarM10328c.m10351u("attempt_count_allowed", this.f49193g);
            dg4VarM10328c.m10351u("user_agent_allowed", this.f49194h);
            dg4VarM10328c.m10351u("consent_enabled", this.f49195i);
            m67 m67Var = this.f49196j;
            if (m67Var != null) {
                dg4 dg4VarM10328c2 = dg4.m10328c();
                dg4VarM10328c2.m10351u("applies", m67Var.f50667a);
                dg4VarM10328c2.m10331B("state", m67Var.f50668b.key);
                dg4VarM10328c2.m10330A("state_time", m67Var.f50669c);
                dg4VarM10328c.m10356z("consent", dg4VarM10328c2);
            }
            dg4VarM10328c.m10351u("filled", this.f49197k);
        } catch (Throwable th) {
            throw th;
        }
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: i */
    public final nk6 m15906i(Context context, int i, long[] jArr) {
        w41 w41Var;
        m67 m67Var;
        nk6 nk6VarM23716J;
        this.f49191e++;
        int[] iArr = k67.f46769a;
        n67 n67Var = this.f49187a;
        int i2 = iArr[n67Var.f52406b.ordinal()];
        if (i2 == 1) {
            dg4 dg4VarM10336f = ((dg4) this.f49188b).m10336f();
            dg4 dg4VarM10336f2 = ((dg4) this.f49189c).m10336f();
            dg4VarM10336f.m10356z("data", dg4VarM10336f2);
            if (this.f49193g && n67Var.f52405a == PayloadType.GetAttribution) {
                dg4VarM10336f2.m10353w(i, "attempt_count");
            }
            if (this.f49195i && (m67Var = this.f49196j) != null) {
                dg4 dg4VarM10328c = dg4.m10328c();
                dg4VarM10328c.m10351u("required", m67Var.f50667a);
                if (m67Var.f50668b == ConsentState.GRANTED) {
                    dg4VarM10328c.m10330A("time", m67Var.f50669c / 1000);
                }
                dg4VarM10336f.m10356z("consent", dg4VarM10328c);
            }
            if (this.f49192f) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                StringBuilder sb = new StringBuilder();
                m15899b(sb, dg4VarM10336f.m10344n(m15898a(new byte[]{110, 116, 95, 105, 100}), null));
                m15899b(sb, dg4VarM10336f.m10344n(m15898a(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 97, 112, 112, 95, 105, 100}), null));
                m15899b(sb, dg4VarM10336f.m10344n(m15898a(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 100, 101, 118, 105, 99, 101, 95, 105, 100}), null));
                m15899b(sb, dg4VarM10336f.m10344n(m15898a(new byte[]{115, 100, 107, 95, 118, 101, 114, 115, 105, 111, 110}), null));
                m15899b(sb, dg4VarM10336f.m10344n(m15898a(new byte[]{105, 110, 105, 116, 95, 116, 111, 107, 101, 110}), null));
                m15899b(sb, str);
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{97, 100, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{102, 105, 114, 101, 95, 97, 100, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{111, 97, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{97, 115, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{102, 98, 95, 97, 116, 116, 114, 105, 98, 117, 116, 105, 111, 110, 95, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{99, 117, 115, 116, 111, 109}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{99, 117, 115, 116, 111, 109, 95, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{99, 111, 110, 118, 101, 114, 115, 105, 111, 110, 95, 100, 97, 116, 97}), null));
                m15899b(sb, dg4VarM10336f2.m10344n(m15898a(new byte[]{99, 103, 105, 100}), null));
                m15899b(sb, dg4VarM10336f2.m10339i(null, m15898a(new byte[]{117, 115, 101, 114, 116, 105, 109, 101})));
                eg4 eg4VarM10342l = dg4VarM10336f2.m10342l(m15898a(new byte[]{105, 100, 115}), false);
                if (eg4VarM10342l != null) {
                    m15899b(sb, ((dg4) eg4VarM10342l).m10344n(m15898a(new byte[]{101, 109, 97, 105, 108}), null));
                }
                eg4 eg4VarM10342l2 = dg4VarM10336f2.m10342l(m15898a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (eg4VarM10342l2 != null) {
                    dg4 dg4Var = (dg4) eg4VarM10342l2;
                    m15899b(sb, dg4Var.m10344n(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null));
                    m15899b(sb, dg4Var.m10344n(m15898a(new byte[]{115, 116, 97, 116, 117, 115}), null));
                    m15899b(sb, dg4Var.m10343m(m15898a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null));
                    m15899b(sb, dg4Var.m10343m(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null));
                }
                eg4 eg4VarM10342l3 = dg4VarM10336f2.m10342l(m15898a(new byte[]{104, 117, 97, 119, 101, 105, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (eg4VarM10342l3 != null) {
                    dg4 dg4Var2 = (dg4) eg4VarM10342l3;
                    m15899b(sb, dg4Var2.m10344n(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null));
                    m15899b(sb, dg4Var2.m10344n(m15898a(new byte[]{115, 116, 97, 116, 117, 115}), null));
                    m15899b(sb, dg4Var2.m10343m(m15898a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null));
                    m15899b(sb, dg4Var2.m10343m(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null));
                }
                eg4 eg4VarM10342l4 = dg4VarM10336f2.m10342l(m15898a(new byte[]{115, 97, 109, 115, 117, 110, 103, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (eg4VarM10342l4 != null) {
                    dg4 dg4Var3 = (dg4) eg4VarM10342l4;
                    m15899b(sb, dg4Var3.m10344n(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null));
                    m15899b(sb, dg4Var3.m10344n(m15898a(new byte[]{115, 116, 97, 116, 117, 115}), null));
                    m15899b(sb, dg4Var3.m10343m(m15898a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null));
                    m15899b(sb, dg4Var3.m10343m(m15898a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null));
                }
                byte[] bytes = sb.toString().getBytes(b34.m3245k());
                long j = 0;
                for (byte b : bytes) {
                    j += (long) (b & 255);
                }
                dg4VarM10336f.m10331B("send_date", str + "." + String.format(Locale.US, "%03d", Long.valueOf(j % 1000)) + "Z");
            }
            w41Var = new w41(context, m15903f(), new rf4(dg4VarM10336f));
        } else {
            if (i2 != 2) {
                ho2.m13385e("Invalid method type");
                return null;
            }
            w41Var = new w41(context, m15903f(), null);
        }
        synchronized (w41Var) {
            w41Var.f66368d = jArr;
        }
        if (!this.f49194h) {
            synchronized (w41Var) {
                try {
                    if (((HashMap) w41Var.f66369e) == null) {
                        w41Var.f66369e = new HashMap();
                    }
                    ((HashMap) w41Var.f66369e).put("User-Agent", "");
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (w41Var) {
            nk6VarM23716J = w41Var.m23716J(i, this);
        }
        sq5 sq5Var = f49186l;
        ((sj5) sq5Var.f61249c).m21420a(3, nk6VarM23716J.f52884f, (String) sq5Var.f61248b, (String) sq5Var.f61250d);
        return nk6VarM23716J;
    }
}
