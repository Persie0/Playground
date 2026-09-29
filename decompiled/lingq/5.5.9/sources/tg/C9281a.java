package tg;

import ag.C0075b;
import ag.C0076c;
import com.kochava.tracker.events.BuildConfig;
import p003a2.C0009a;
import p338qd.C8573r0;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;
import p535zg.C10489a;

/* JADX INFO: renamed from: tg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9281a {

    /* JADX INFO: renamed from: d */
    public static final C0076c f47978d;

    /* JADX INFO: renamed from: a */
    public final String f47979a;

    /* JADX INFO: renamed from: b */
    public final C10487e f47980b = C10487e.m19445u();

    /* JADX INFO: renamed from: c */
    public final C10487e f47981c = C10487e.m19445u();

    static {
        C0075b c0075bM19476b = C10489a.m19476b();
        f47978d = C0009a.m17e(c0075bM19476b, c0075bM19476b, BuildConfig.SDK_MODULE_NAME, "Event");
    }

    public C9281a(String str) {
        this.f47979a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m17642a(InterfaceC10488f interfaceC10488f) {
        if (C8573r0.m16662A0("payload") || interfaceC10488f == null || interfaceC10488f.length() == 0) {
            f47978d.m460d("setCustomDictionary for key payload failed, invalid input");
        } else {
            this.f47980b.m19448B(interfaceC10488f, "payload");
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m17643b(double d10) {
        if (C8573r0.m16662A0("price")) {
            f47978d.m460d("setCustomNumberValue for key price failed, invalid input");
        } else {
            this.f47980b.m19473y("price", d10);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m17644c(String str, String str2) {
        try {
            if (!C8573r0.m16662A0(str) && !C8573r0.m16662A0(str2)) {
                this.f47980b.m19450D(str, str2);
                return;
            }
            f47978d.m460d("setCustomStringValue for key " + str + " failed, invalid input");
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
