package so;

import dm.C5207g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import okio.ByteString;
import p124fp.C5608e;
import p124fp.InterfaceC5609f;

/* JADX INFO: renamed from: so.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C9099q extends AbstractC9105w {

    /* JADX INFO: renamed from: e */
    public static final C9098p f47478e;

    /* JADX INFO: renamed from: f */
    public static final C9098p f47479f;

    /* JADX INFO: renamed from: g */
    public static final byte[] f47480g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f47481h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f47482i;

    /* JADX INFO: renamed from: a */
    public final ByteString f47483a;

    /* JADX INFO: renamed from: b */
    public final List<c> f47484b;

    /* JADX INFO: renamed from: c */
    public final C9098p f47485c;

    /* JADX INFO: renamed from: d */
    public long f47486d;

    /* JADX INFO: renamed from: so.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final ByteString f47487a;

        /* JADX INFO: renamed from: b */
        public C9098p f47488b;

        /* JADX INFO: renamed from: c */
        public final ArrayList f47489c;

        public a() {
            String string = UUID.randomUUID().toString();
            C5207g.m11110e(string, "randomUUID().toString()");
            ByteString byteString = ByteString.f43897d;
            this.f47487a = ByteString.C8082a.m16001c(string);
            this.f47488b = C9099q.f47478e;
            this.f47489c = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: so.q$b */
    public static final class b {
        /* JADX INFO: renamed from: a */
        public static void m17341a(String str, StringBuilder sb2) {
            sb2.append('\"');
            int length = str.length();
            int i10 = 0;
            while (i10 < length) {
                int i11 = i10 + 1;
                char cCharAt = str.charAt(i10);
                if (cCharAt == '\n') {
                    sb2.append("%0A");
                } else if (cCharAt == '\r') {
                    sb2.append("%0D");
                } else if (cCharAt == '\"') {
                    sb2.append("%22");
                } else {
                    sb2.append(cCharAt);
                }
                i10 = i11;
            }
            sb2.append('\"');
        }
    }

    /* JADX INFO: renamed from: so.q$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final C9095m f47490a;

        /* JADX INFO: renamed from: b */
        public final AbstractC9105w f47491b;

        /* JADX INFO: renamed from: so.q$c$a */
        public static final class a {
            /* JADX INFO: renamed from: a */
            public static c m17342a(C9095m c9095m, AbstractC9105w abstractC9105w) {
                C5207g.m11111f(abstractC9105w, "body");
                if (!((c9095m == null ? null : c9095m.m17305a("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((c9095m != null ? c9095m.m17305a("Content-Length") : null) == null) {
                    return new c(c9095m, abstractC9105w);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
        }

        public c(C9095m c9095m, AbstractC9105w abstractC9105w) {
            this.f47490a = c9095m;
            this.f47491b = abstractC9105w;
        }
    }

    static {
        Pattern pattern = C9098p.f47473d;
        f47478e = C9098p.a.m17339a("multipart/mixed");
        C9098p.a.m17339a("multipart/alternative");
        C9098p.a.m17339a("multipart/digest");
        C9098p.a.m17339a("multipart/parallel");
        f47479f = C9098p.a.m17339a("multipart/form-data");
        f47480g = new byte[]{58, 32};
        f47481h = new byte[]{13, 10};
        f47482i = new byte[]{45, 45};
    }

    public C9099q(ByteString byteString, C9098p c9098p, List<c> list) {
        C5207g.m11111f(byteString, "boundaryByteString");
        C5207g.m11111f(c9098p, "type");
        this.f47483a = byteString;
        this.f47484b = list;
        Pattern pattern = C9098p.f47473d;
        this.f47485c = C9098p.a.m17339a(c9098p + "; boundary=" + byteString.m15988A());
        this.f47486d = -1L;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: a */
    public final long mo13145a() throws IOException {
        long jM17340d = this.f47486d;
        if (jM17340d == -1) {
            jM17340d = m17340d(null, true);
            this.f47486d = jM17340d;
        }
        return jM17340d;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: b */
    public final C9098p mo13146b() {
        return this.f47485c;
    }

    @Override // so.AbstractC9105w
    /* JADX INFO: renamed from: c */
    public final void mo13147c(InterfaceC5609f interfaceC5609f) throws IOException {
        m17340d(interfaceC5609f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final long m17340d(InterfaceC5609f interfaceC5609f, boolean z10) throws IOException {
        C5608e c5608e;
        InterfaceC5609f c5608e2;
        if (z10) {
            c5608e2 = new C5608e();
            c5608e = c5608e2;
        } else {
            c5608e = 0;
            c5608e2 = interfaceC5609f;
        }
        List<c> list = this.f47484b;
        int size = list.size();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            ByteString byteString = this.f47483a;
            byte[] bArr = f47482i;
            byte[] bArr2 = f47481h;
            if (i10 >= size) {
                C5207g.m11108c(c5608e2);
                c5608e2.mo11945U0(bArr);
                c5608e2.mo11950Z0(byteString);
                c5608e2.mo11945U0(bArr);
                c5608e2.mo11945U0(bArr2);
                if (!z10) {
                    return j10;
                }
                C5207g.m11108c(c5608e);
                long j11 = j10 + c5608e.f34435b;
                c5608e.m11951b();
                return j11;
            }
            int i11 = i10 + 1;
            c cVar = list.get(i10);
            C9095m c9095m = cVar.f47490a;
            C5207g.m11108c(c5608e2);
            c5608e2.mo11945U0(bArr);
            c5608e2.mo11950Z0(byteString);
            c5608e2.mo11945U0(bArr2);
            if (c9095m != null) {
                int length = c9095m.f47452a.length / 2;
                for (int i12 = 0; i12 < length; i12++) {
                    c5608e2.mo11957k0(c9095m.m17306f(i12)).mo11945U0(f47480g).mo11957k0(c9095m.m17309l(i12)).mo11945U0(bArr2);
                }
            }
            AbstractC9105w abstractC9105w = cVar.f47491b;
            C9098p c9098pMo13146b = abstractC9105w.mo13146b();
            if (c9098pMo13146b != null) {
                c5608e2.mo11957k0("Content-Type: ").mo11957k0(c9098pMo13146b.f47475a).mo11945U0(bArr2);
            }
            long jMo13145a = abstractC9105w.mo13145a();
            if (jMo13145a != -1) {
                c5608e2.mo11957k0("Content-Length: ").mo11967s1(jMo13145a).mo11945U0(bArr2);
            } else if (z10) {
                C5207g.m11108c(c5608e);
                c5608e.m11951b();
                return -1L;
            }
            c5608e2.mo11945U0(bArr2);
            if (z10) {
                j10 += jMo13145a;
            } else {
                abstractC9105w.mo13147c(c5608e2);
            }
            c5608e2.mo11945U0(bArr2);
            i10 = i11;
        }
    }
}
