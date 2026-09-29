package p074dg;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import cg.AbstractC2006a;
import com.kochava.core.json.internal.JsonType;
import com.kochava.tracker.payload.internal.PayloadType;
import dm.C5206f;
import java.io.IOException;
import p075dh.C5174b;
import p075dh.C5176d;
import p349qo.C8656b;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: dg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5169a extends AbstractC2006a {
    public C5169a(Context context, Uri uri, C10485c c10485c) {
        super(context, uri, c10485c);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX INFO: renamed from: d */
    public final C5170b m10945d(int i10, InterfaceC5171c interfaceC5171c, long j10, C10487e c10487e, boolean z10, C10485c c10485c) {
        C5172d c5172d;
        InterfaceC10488f interfaceC10488fMo19454d;
        long j11;
        long j12;
        C5176d c5176d = ((C5174b) interfaceC5171c).f33187a;
        PayloadType payloadType = c5176d.f33197a;
        if (payloadType == PayloadType.Click) {
            if (z10) {
                c5172d = new C5172d(0L, true, false);
            } else {
                c5172d = i10 < 3 ? new C5172d(-1L, false, true) : new C5172d(0L, false, false);
            }
        } else if (payloadType == PayloadType.Smartlink) {
            if (z10 && c10485c.m19444f() == JsonType.JsonObject) {
                c5172d = new C5172d(0L, true, false);
            } else {
                c5172d = new C5172d(0L, false, false);
            }
        } else if (c10485c.m19444f() != JsonType.JsonObject || c10485c.m19443a().length() == 0) {
            c5172d = new C5172d(-1L, false, true);
        } else {
            InterfaceC10488f interfaceC10488fM19443a = c10485c.m19443a();
            if (!interfaceC10488fM19443a.mo19468r("success", Boolean.FALSE).booleanValue()) {
                c5172d = new C5172d(-1L, false, true);
            } else if (c5176d.f33197a == PayloadType.GetAttribution && (interfaceC10488fMo19454d = interfaceC10488fM19443a.mo19454d("data", false)) != null && interfaceC10488fMo19454d.mo19463m("retry")) {
                long jM11017p1 = C5206f.m11017p1(interfaceC10488fMo19454d.mo19462l("retry", Double.valueOf(0.0d)).doubleValue());
                if (jM11017p1 > 0) {
                    c5172d = new C5172d(Math.max(0L, jM11017p1), false, true);
                } else {
                    c5172d = new C5172d(0L, true, false);
                }
            } else {
                c5172d = new C5172d(0L, true, false);
            }
        }
        if (c5172d.f33177a) {
            return new C5170b(true, false, 0L, j10, c10487e, c10485c);
        }
        long j13 = c5172d.f33179c;
        if (j13 >= 0) {
            return new C5170b(false, c5172d.f33178b, j13, j10, c10487e, new C10485c(""));
        }
        boolean z11 = c5172d.f33178b;
        synchronized (this) {
            long[] jArr = this.f10449e;
            if (jArr == null || jArr.length == 0) {
                int iMax = Math.max(1, i10);
                if (iMax == 1) {
                    j11 = 7000;
                } else if (iMax != 2) {
                    j11 = iMax != 3 ? 1800000L : 300000L;
                } else {
                    j11 = 30000;
                }
                j12 = j11;
            } else {
                j12 = this.f10449e[Math.min(jArr.length - 1, Math.max(0, i10 - 1))];
            }
        }
        return new C5170b(false, z11, j12, j10, c10487e, new C10485c(""));
    }

    /* JADX INFO: renamed from: e */
    public final synchronized C5170b m10946e(int i10, InterfaceC5171c interfaceC5171c) {
        long jCurrentTimeMillis;
        C10487e c10487eM19445u;
        C10485c c10485cM5940c;
        try {
            jCurrentTimeMillis = System.currentTimeMillis();
            c10487eM19445u = C10487e.m19445u();
            C10485c c10485c = new C10485c("");
            try {
                try {
                    c10485cM5940c = AbstractC2006a.m5940c(c10487eM19445u, this.f10445a, this.f10446b, this.f10448d, this.f10447c);
                    c10487eM19445u.m19473y("duration", C5206f.m11011j1(System.currentTimeMillis() - jCurrentTimeMillis));
                    c10487eM19445u.m19450D("url", this.f10446b.toString());
                    c10487eM19445u.mo19458h("response", c10485cM5940c);
                } catch (IOException e10) {
                    c10487eM19445u.m19450D("error", C8656b.m16889P(e10.getMessage(), ""));
                    c10487eM19445u.m19450D("stacktrace", C8656b.m16889P(Log.getStackTraceString(e10), ""));
                    C5170b c5170bM10945d = m10945d(i10, interfaceC5171c, System.currentTimeMillis() - jCurrentTimeMillis, c10487eM19445u, false, c10485c);
                    c10487eM19445u.m19473y("duration", C5206f.m11011j1(System.currentTimeMillis() - jCurrentTimeMillis));
                    c10487eM19445u.m19450D("url", this.f10446b.toString());
                    c10487eM19445u.mo19458h("response", c10485c);
                    return c5170bM10945d;
                }
            } catch (Throwable th2) {
                c10487eM19445u.m19473y("duration", C5206f.m11011j1(System.currentTimeMillis() - jCurrentTimeMillis));
                c10487eM19445u.m19450D("url", this.f10446b.toString());
                c10487eM19445u.mo19458h("response", c10485c);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return m10945d(i10, interfaceC5171c, System.currentTimeMillis() - jCurrentTimeMillis, c10487eM19445u, true, c10485cM5940c);
    }
}
