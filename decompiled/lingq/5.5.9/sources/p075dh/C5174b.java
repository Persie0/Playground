package p075dh;

import ag.C0075b;
import ag.C0076c;
import android.content.Context;
import android.net.Uri;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadMethod;
import com.kochava.tracker.payload.internal.PayloadType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import p003a2.C0009a;
import p074dg.C5169a;
import p074dg.C5170b;
import p074dg.InterfaceC5171c;
import p338qd.C8573r0;
import p349qo.C8656b;
import p366rg.C8785f;
import p366rg.InterfaceC8786g;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: dh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5174b implements InterfaceC5175c, InterfaceC5171c {

    /* JADX INFO: renamed from: j */
    public static final C0076c f33186j;

    /* JADX INFO: renamed from: a */
    public final C5176d f33187a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC10488f f33188b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10488f f33189c;

    /* JADX INFO: renamed from: d */
    public final Uri f33190d;

    /* JADX INFO: renamed from: e */
    public int f33191e;

    /* JADX INFO: renamed from: f */
    public boolean f33192f;

    /* JADX INFO: renamed from: g */
    public boolean f33193g;

    /* JADX INFO: renamed from: h */
    public boolean f33194h;

    /* JADX INFO: renamed from: i */
    public boolean f33195i;

    /* JADX INFO: renamed from: dh.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f33196a;

        static {
            int[] iArr = new int[PayloadMethod.values().length];
            f33196a = iArr;
            try {
                iArr[PayloadMethod.Post.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f33196a[PayloadMethod.Get.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f33186j = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "Payload");
    }

    public C5174b(C5176d c5176d, InterfaceC10488f interfaceC10488f, InterfaceC10488f interfaceC10488f2, Uri uri, int i10, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f33187a = c5176d;
        this.f33188b = interfaceC10488f;
        this.f33189c = interfaceC10488f2;
        this.f33190d = uri;
        this.f33191e = i10;
        this.f33192f = z10;
        this.f33193g = z11;
        this.f33194h = z12;
        this.f33195i = z13;
    }

    /* JADX INFO: renamed from: a */
    public static String m10950a(byte[] bArr) {
        return new String(bArr, C8573r0.m16736l0());
    }

    /* JADX INFO: renamed from: b */
    public static void m10951b(Object obj, StringBuilder sb2) {
        if (obj == null) {
            return;
        }
        sb2.append(obj);
    }

    /* JADX INFO: renamed from: c */
    public static C5174b m10952c(PayloadType payloadType, long j10, long j11, long j12, long j13, boolean z10, int i10) {
        return new C5174b(C5176d.m10960a(payloadType, PayloadMethod.Post, j10, j11, j12, j13, z10, i10), C10487e.m19445u(), C10487e.m19445u(), Uri.EMPTY, 0, true, true, true, false);
    }

    /* JADX INFO: renamed from: d */
    public static C5174b m10953d(PayloadType payloadType, long j10, long j11, long j12, long j13, boolean z10, int i10, InterfaceC10488f interfaceC10488f) {
        return new C5174b(C5176d.m10960a(payloadType, PayloadMethod.Post, j10, j11, j12, j13, z10, i10), C10487e.m19445u(), interfaceC10488f, Uri.EMPTY, 0, true, true, true, false);
    }

    /* JADX INFO: renamed from: e */
    public static C5174b m10954e(InterfaceC10488f interfaceC10488f) {
        InterfaceC10488f interfaceC10488fMo19454d = interfaceC10488f.mo19454d("metadata", true);
        PayloadType payloadTypeFromKey = PayloadType.fromKey(interfaceC10488fMo19454d.mo19467q("payload_type", ""));
        PayloadMethod payloadMethodFromKey = PayloadMethod.fromKey(interfaceC10488fMo19454d.mo19467q("payload_method", ""));
        long jLongValue = interfaceC10488fMo19454d.mo19459i("creation_start_time_millis", 0L).longValue();
        long jLongValue2 = interfaceC10488fMo19454d.mo19459i("creation_start_count", 0L).longValue();
        long jLongValue3 = interfaceC10488fMo19454d.mo19459i("creation_time_millis", 0L).longValue();
        long jLongValue4 = interfaceC10488fMo19454d.mo19459i("uptime_millis", 0L).longValue();
        Boolean bool = Boolean.FALSE;
        C5176d c5176d = new C5176d(payloadTypeFromKey, payloadMethodFromKey, jLongValue, jLongValue2, jLongValue3, jLongValue4, interfaceC10488fMo19454d.mo19468r("state_active", bool).booleanValue(), interfaceC10488fMo19454d.mo19466p(0, "state_active_count").intValue());
        InterfaceC10488f interfaceC10488fMo19454d2 = interfaceC10488f.mo19454d("envelope", true);
        InterfaceC10488f interfaceC10488fMo19454d3 = interfaceC10488f.mo19454d("data", true);
        Uri uriM16890Q = C8656b.m16890Q(interfaceC10488f.mo19467q("url", ""), Uri.EMPTY);
        int iIntValue = interfaceC10488f.mo19466p(0, "lifetime_attempt_count").intValue();
        Boolean bool2 = Boolean.TRUE;
        return new C5174b(c5176d, interfaceC10488fMo19454d2, interfaceC10488fMo19454d3, uriM16890Q, iIntValue, interfaceC10488f.mo19468r("send_date_allowed", bool2).booleanValue(), interfaceC10488f.mo19468r("attempt_count_allowed", bool2).booleanValue(), interfaceC10488f.mo19468r("user_agent_allowed", bool2).booleanValue(), interfaceC10488f.mo19468r("filled", bool).booleanValue());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public final synchronized void m10955f(Context context, InterfaceC8786g interfaceC8786g) {
        try {
            C8785f c8785f = (C8785f) interfaceC8786g;
            this.f33192f = c8785f.m17072e(this.f33187a.f33197a, "send_date");
            this.f33193g = c8785f.m17072e(this.f33187a.f33197a, "attempt_count");
            this.f33194h = c8785f.m17072e(this.f33187a.f33197a, "User-Agent");
            C5176d c5176d = this.f33187a;
            if (c5176d.f33198b == PayloadMethod.Post) {
                c8785f.m17069b(context, c5176d, this.f33195i, this.f33188b, this.f33189c);
            }
            this.f33195i = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Uri m10956g() {
        Uri uri = this.f33190d;
        if (C8656b.m16878E(uri)) {
            return uri;
        }
        PayloadType payloadType = this.f33187a.f33197a;
        return payloadType == PayloadType.Event ? payloadType.getUrl(this.f33189c.mo19467q("event_name", "")) : payloadType.getUrl();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: h */
    public final synchronized boolean m10957h(InterfaceC8786g interfaceC8786g) {
        boolean z10;
        boolean z11;
        try {
            C8785f c8785f = (C8785f) interfaceC8786g;
            if (!c8785f.m17073f(this.f33187a.f33197a)) {
                return false;
            }
            if (this.f33187a.f33197a == PayloadType.Event) {
                String strMo19467q = this.f33189c.mo19467q("event_name", "");
                synchronized (c8785f) {
                    try {
                        z11 = !c8785f.f46583i.contains(strMo19467q);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (!z11) {
                    return false;
                }
            }
            if (this.f33187a.f33197a == PayloadType.IdentityLink) {
                InterfaceC10488f interfaceC10488fMo19454d = this.f33189c.mo19454d("identity_link", true);
                if (interfaceC10488fMo19454d.length() == 0) {
                    return false;
                }
                String str = (String) interfaceC10488fMo19454d.mo19460j().get(0);
                synchronized (c8785f) {
                    z10 = !c8785f.f46584j.contains(str);
                }
                if (!z10) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C10487e m10958i() {
        C10487e c10487eM19445u = C10487e.m19445u();
        C5176d c5176d = this.f33187a;
        c5176d.getClass();
        C10487e c10487eM19445u2 = C10487e.m19445u();
        c10487eM19445u2.m19450D("payload_type", c5176d.f33197a.getKey());
        c10487eM19445u2.m19450D("payload_method", c5176d.f33198b.key);
        c10487eM19445u2.m19449C("creation_start_time_millis", c5176d.f33199c);
        c10487eM19445u2.m19449C("creation_start_count", c5176d.f33200d);
        c10487eM19445u2.m19449C("creation_time_millis", c5176d.f33201e);
        c10487eM19445u2.m19449C("uptime_millis", c5176d.f33202f);
        c10487eM19445u2.m19472x("state_active", c5176d.f33203g);
        c10487eM19445u2.m19474z("state_active_count", c5176d.f33204h);
        c10487eM19445u.m19448B(c10487eM19445u2, "metadata");
        c10487eM19445u.m19448B(this.f33188b, "envelope");
        c10487eM19445u.m19448B(this.f33189c, "data");
        c10487eM19445u.m19450D("url", this.f33190d.toString());
        c10487eM19445u.m19474z("lifetime_attempt_count", this.f33191e);
        c10487eM19445u.m19472x("send_date_allowed", this.f33192f);
        c10487eM19445u.m19472x("attempt_count_allowed", this.f33193g);
        c10487eM19445u.m19472x("user_agent_allowed", this.f33194h);
        c10487eM19445u.m19472x("filled", this.f33195i);
        return c10487eM19445u;
    }

    /* JADX INFO: renamed from: j */
    public final C5170b m10959j(Context context, int i10, long[] jArr) {
        C5169a c5169a;
        C5170b c5170bM10946e;
        this.f33191e++;
        int[] iArr = a.f33196a;
        C5176d c5176d = this.f33187a;
        int i11 = iArr[c5176d.f33198b.ordinal()];
        if (i11 == 1) {
            C10487e c10487eMo19451a = this.f33188b.mo19451a();
            C10487e c10487eMo19451a2 = this.f33189c.mo19451a();
            c10487eMo19451a.m19448B(c10487eMo19451a2, "data");
            if (this.f33193g && c5176d.f33197a == PayloadType.GetAttribution) {
                c10487eMo19451a2.m19474z("attempt_count", i10);
            }
            if (this.f33192f) {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
                StringBuilder sb2 = new StringBuilder();
                m10951b(c10487eMo19451a.mo19467q(m10950a(new byte[]{110, 116, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a.mo19467q(m10950a(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 97, 112, 112, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a.mo19467q(m10950a(new byte[]{107, 111, 99, 104, 97, 118, 97, 95, 100, 101, 118, 105, 99, 101, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a.mo19467q(m10950a(new byte[]{115, 100, 107, 95, 118, 101, 114, 115, 105, 111, 110}), null), sb2);
                m10951b(c10487eMo19451a.mo19467q(m10950a(new byte[]{105, 110, 105, 116, 95, 116, 111, 107, 101, 110}), null), sb2);
                m10951b(str, sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{97, 100, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{97, 110, 100, 114, 111, 105, 100, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{102, 105, 114, 101, 95, 97, 100, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{111, 97, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{97, 115, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{102, 98, 95, 97, 116, 116, 114, 105, 98, 117, 116, 105, 111, 110, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{99, 117, 115, 116, 111, 109}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{99, 117, 115, 116, 111, 109, 95, 105, 100}), null), sb2);
                m10951b(c10487eMo19451a2.mo19467q(m10950a(new byte[]{99, 111, 110, 118, 101, 114, 115, 105, 111, 110, 95, 100, 97, 116, 97}), null), sb2);
                m10951b(c10487eMo19451a2.mo19466p(null, m10950a(new byte[]{117, 115, 101, 114, 116, 105, 109, 101})), sb2);
                InterfaceC10488f interfaceC10488fMo19454d = c10487eMo19451a2.mo19454d(m10950a(new byte[]{105, 100, 115}), false);
                if (interfaceC10488fMo19454d != null) {
                    m10951b(interfaceC10488fMo19454d.mo19467q(m10950a(new byte[]{101, 109, 97, 105, 108}), null), sb2);
                }
                InterfaceC10488f interfaceC10488fMo19454d2 = c10487eMo19451a2.mo19454d(m10950a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (interfaceC10488fMo19454d2 != null) {
                    m10951b(interfaceC10488fMo19454d2.mo19467q(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb2);
                    m10951b(interfaceC10488fMo19454d2.mo19467q(m10950a(new byte[]{115, 116, 97, 116, 117, 115}), null), sb2);
                    m10951b(interfaceC10488fMo19454d2.mo19459i(m10950a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb2);
                    m10951b(interfaceC10488fMo19454d2.mo19459i(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb2);
                }
                InterfaceC10488f interfaceC10488fMo19454d3 = c10487eMo19451a2.mo19454d(m10950a(new byte[]{104, 117, 97, 119, 101, 105, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (interfaceC10488fMo19454d3 != null) {
                    m10951b(interfaceC10488fMo19454d3.mo19467q(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb2);
                    m10951b(interfaceC10488fMo19454d3.mo19467q(m10950a(new byte[]{115, 116, 97, 116, 117, 115}), null), sb2);
                    m10951b(interfaceC10488fMo19454d3.mo19459i(m10950a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb2);
                    m10951b(interfaceC10488fMo19454d3.mo19459i(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb2);
                }
                InterfaceC10488f interfaceC10488fMo19454d4 = c10487eMo19451a2.mo19454d(m10950a(new byte[]{115, 97, 109, 115, 117, 110, 103, 95, 114, 101, 102, 101, 114, 114, 101, 114}), false);
                if (interfaceC10488fMo19454d4 != null) {
                    m10951b(interfaceC10488fMo19454d4.mo19467q(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114}), null), sb2);
                    m10951b(interfaceC10488fMo19454d4.mo19467q(m10950a(new byte[]{115, 116, 97, 116, 117, 115}), null), sb2);
                    m10951b(interfaceC10488fMo19454d4.mo19459i(m10950a(new byte[]{105, 110, 115, 116, 97, 108, 108, 95, 98, 101, 103, 105, 110, 95, 116, 105, 109, 101}), null), sb2);
                    m10951b(interfaceC10488fMo19454d4.mo19459i(m10950a(new byte[]{114, 101, 102, 101, 114, 114, 101, 114, 95, 99, 108, 105, 99, 107, 95, 116, 105, 109, 101}), null), sb2);
                }
                long j10 = 0;
                for (byte b10 : sb2.toString().getBytes(C8573r0.m16736l0())) {
                    j10 += (long) (b10 & 255);
                }
                c10487eMo19451a.m19450D("send_date", str + "." + String.format(Locale.US, "%03d", Long.valueOf(j10 % 1000)) + "Z");
            }
            c5169a = new C5169a(context, m10956g(), new C10485c(c10487eMo19451a));
        } else {
            if (i11 != 2) {
                throw new RuntimeException("Invalid method type");
            }
            c5169a = new C5169a(context, m10956g(), null);
        }
        synchronized (c5169a) {
            c5169a.f10449e = jArr;
        }
        if (!this.f33194h) {
            synchronized (c5169a) {
                if (c5169a.f10448d == null) {
                    c5169a.f10448d = new HashMap();
                }
                c5169a.f10448d.put("User-Agent", "");
            }
        }
        synchronized (c5169a) {
            c5170bM10946e = c5169a.m10946e(i10, this);
        }
        f33186j.m457a(c5170bM10946e.f33175e);
        return c5170bM10946e;
    }
}
