package okhttp3.logging;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5206f;
import dm.C5207g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mo.C7661i;
import okhttp3.Protocol;
import okhttp3.internal.connection.C8077a;
import p003a2.C0009a;
import p124fp.C5608e;
import p124fp.C5614k;
import p124fp.InterfaceC5610g;
import p338qd.C8573r0;
import p493xo.C10265e;
import p493xo.C10266f;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9095m;
import so.C9098p;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9097o;

/* JADX INFO: loaded from: classes2.dex */
public final class HttpLoggingInterceptor implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8080a f43893a = InterfaceC8080a.f43896a;

    /* JADX INFO: renamed from: b */
    public volatile EmptySet f43894b = EmptySet.f38034a;

    /* JADX INFO: renamed from: c */
    public volatile Level f43895c = Level.NONE;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: renamed from: okhttp3.logging.HttpLoggingInterceptor$a */
    public interface InterfaceC8080a {

        /* JADX INFO: renamed from: a */
        public static final C8081a f43896a = new C8081a();

        /* JADX INFO: renamed from: a */
        void mo15987a(String str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15985b(C9095m c9095m) {
        String strM17305a = c9095m.m17305a("Content-Encoding");
        return (strM17305a == null || C7661i.m15249O2(strM17305a, "identity") || C7661i.m15249O2(strM17305a, "gzip")) ? false : true;
    }

    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws Exception {
        String strM11116k;
        Long lValueOf;
        Charset charsetM17338a;
        Level level = this.f43895c;
        C9101s c9101s = c10266f.f51701e;
        if (level == Level.NONE) {
            return c10266f.m19235c(c9101s);
        }
        boolean z10 = level == Level.BODY;
        boolean z11 = z10 || level == Level.HEADERS;
        AbstractC9105w abstractC9105w = c9101s.f47545d;
        C8077a c8077aM19234a = c10266f.m19234a();
        StringBuilder sb2 = new StringBuilder("--> ");
        sb2.append(c9101s.f47543b);
        sb2.append(' ');
        sb2.append(c9101s.f47542a);
        if (c8077aM19234a != null) {
            Protocol protocol = c8077aM19234a.f43872f;
            C5207g.m11108c(protocol);
            strM11116k = C5207g.m11116k(protocol, " ");
        } else {
            strM11116k = "";
        }
        sb2.append(strM11116k);
        String string = sb2.toString();
        if (!z11 && abstractC9105w != null) {
            StringBuilder sbM26o = C0009a.m26o(string, " (");
            sbM26o.append(abstractC9105w.mo13145a());
            sbM26o.append("-byte body)");
            string = sbM26o.toString();
        }
        this.f43893a.mo15987a(string);
        if (z11) {
            C9095m c9095m = c9101s.f47544c;
            if (abstractC9105w != null) {
                C9098p c9098pMo13146b = abstractC9105w.mo13146b();
                if (c9098pMo13146b != null && c9095m.m17305a("Content-Type") == null) {
                    this.f43893a.mo15987a(C5207g.m11116k(c9098pMo13146b, "Content-Type: "));
                }
                if (abstractC9105w.mo13145a() != -1 && c9095m.m17305a("Content-Length") == null) {
                    this.f43893a.mo15987a(C5207g.m11116k(Long.valueOf(abstractC9105w.mo13145a()), "Content-Length: "));
                }
            }
            int length = c9095m.f47452a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                m15986c(c9095m, i10);
            }
            if (!z10 || abstractC9105w == null) {
                this.f43893a.mo15987a(C5207g.m11116k(c9101s.f47543b, "--> END "));
            } else if (m15985b(c9101s.f47544c)) {
                this.f43893a.mo15987a("--> END " + c9101s.f47543b + " (encoded body omitted)");
            } else {
                C5608e c5608e = new C5608e();
                abstractC9105w.mo13147c(c5608e);
                C9098p c9098pMo13146b2 = abstractC9105w.mo13146b();
                Charset charsetM17338a2 = c9098pMo13146b2 == null ? null : c9098pMo13146b2.m17338a(StandardCharsets.UTF_8);
                if (charsetM17338a2 == null) {
                    charsetM17338a2 = StandardCharsets.UTF_8;
                    C5207g.m11110e(charsetM17338a2, "UTF_8");
                }
                this.f43893a.mo15987a("");
                if (C8573r0.m16668D0(c5608e)) {
                    this.f43893a.mo15987a(c5608e.m11931G0(c5608e.f34435b, charsetM17338a2));
                    this.f43893a.mo15987a("--> END " + c9101s.f47543b + " (" + abstractC9105w.mo13145a() + "-byte body)");
                } else {
                    this.f43893a.mo15987a("--> END " + c9101s.f47543b + " (binary " + abstractC9105w.mo13145a() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            C9106x c9106xM19235c = c10266f.m19235c(c9101s);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            AbstractC9107y abstractC9107y = c9106xM19235c.f47569g;
            C5207g.m11108c(abstractC9107y);
            long jMo13136b = abstractC9107y.mo13136b();
            String str = jMo13136b != -1 ? jMo13136b + "-byte" : "unknown-length";
            InterfaceC8080a interfaceC8080a = this.f43893a;
            StringBuilder sb3 = new StringBuilder("<-- ");
            sb3.append(c9106xM19235c.f47566d);
            sb3.append(c9106xM19235c.f47565c.length() == 0 ? r9 : C0204c.m852k(" ", c9106xM19235c.f47565c));
            sb3.append(' ');
            sb3.append(c9106xM19235c.f47563a.f47542a);
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(!z11 ? C0141b.m611g(", ", str, " body") : r9);
            sb3.append(')');
            interfaceC8080a.mo15987a(sb3.toString());
            if (z11) {
                C9095m c9095m2 = c9106xM19235c.f47568f;
                int length2 = c9095m2.f47452a.length / 2;
                for (int i11 = 0; i11 < length2; i11++) {
                    m15986c(c9095m2, i11);
                }
                if (!z10 || !C10265e.m19231a(c9106xM19235c)) {
                    this.f43893a.mo15987a("<-- END HTTP");
                } else if (m15985b(c9106xM19235c.f47568f)) {
                    this.f43893a.mo15987a("<-- END HTTP (encoded body omitted)");
                } else {
                    InterfaceC5610g interfaceC5610gMo13138q = abstractC9107y.mo13138q();
                    interfaceC5610gMo13138q.mo11929E0(Long.MAX_VALUE);
                    C5608e c5608eMo11956f = interfaceC5610gMo13138q.mo11956f();
                    if (C7661i.m15249O2("gzip", c9095m2.m17305a("Content-Encoding"))) {
                        lValueOf = Long.valueOf(c5608eMo11956f.f34435b);
                        C5614k c5614k = new C5614k(c5608eMo11956f.clone());
                        try {
                            c5608eMo11956f = new C5608e();
                            c5608eMo11956f.mo11940O0(c5614k);
                            charsetM17338a = null;
                            C5206f.m11032z0(c5614k, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                C5206f.m11032z0(c5614k, th2);
                                throw th3;
                            }
                        }
                    } else {
                        lValueOf = null;
                        charsetM17338a = null;
                    }
                    C9098p c9098pMo13137l = abstractC9107y.mo13137l();
                    if (c9098pMo13137l != null) {
                        charsetM17338a = c9098pMo13137l.m17338a(StandardCharsets.UTF_8);
                    }
                    if (charsetM17338a == null) {
                        charsetM17338a = StandardCharsets.UTF_8;
                        C5207g.m11110e(charsetM17338a, "UTF_8");
                    }
                    if (!C8573r0.m16668D0(c5608eMo11956f)) {
                        this.f43893a.mo15987a("");
                        this.f43893a.mo15987a("<-- END HTTP (binary " + c5608eMo11956f.f34435b + "-byte body omitted)");
                        return c9106xM19235c;
                    }
                    if (jMo13136b != 0) {
                        this.f43893a.mo15987a("");
                        InterfaceC8080a interfaceC8080a2 = this.f43893a;
                        C5608e c5608eClone = c5608eMo11956f.clone();
                        interfaceC8080a2.mo15987a(c5608eClone.m11931G0(c5608eClone.f34435b, charsetM17338a));
                    }
                    if (lValueOf != null) {
                        this.f43893a.mo15987a("<-- END HTTP (" + c5608eMo11956f.f34435b + "-byte, " + lValueOf + "-gzipped-byte body)");
                    } else {
                        this.f43893a.mo15987a("<-- END HTTP (" + c5608eMo11956f.f34435b + "-byte body)");
                    }
                }
            }
            return c9106xM19235c;
        } catch (Exception e10) {
            this.f43893a.mo15987a(C5207g.m11116k(e10, "<-- HTTP FAILED: "));
            throw e10;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15986c(C9095m c9095m, int i10) {
        this.f43894b.contains(c9095m.m17306f(i10));
        String strM17309l = c9095m.m17309l(i10);
        this.f43893a.mo15987a(c9095m.m17306f(i10) + ": " + strM17309l);
    }
}
