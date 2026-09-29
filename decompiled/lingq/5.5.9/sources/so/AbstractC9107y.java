package so;

import dm.C5206f;
import dm.C5207g;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import mo.C7653a;
import p124fp.InterfaceC5610g;
import sl.C9072e;
import to.C9347b;

/* JADX INFO: renamed from: so.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9107y implements Closeable {

    /* JADX INFO: renamed from: a */
    public a f47588a;

    /* JADX INFO: renamed from: so.y$a */
    public static final class a extends Reader {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5610g f47589a;

        /* JADX INFO: renamed from: b */
        public final Charset f47590b;

        /* JADX INFO: renamed from: c */
        public boolean f47591c;

        /* JADX INFO: renamed from: d */
        public InputStreamReader f47592d;

        public a(InterfaceC5610g interfaceC5610g, Charset charset) {
            C5207g.m11111f(interfaceC5610g, "source");
            C5207g.m11111f(charset, "charset");
            this.f47589a = interfaceC5610g;
            this.f47590b = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            C9072e c9072e;
            this.f47591c = true;
            InputStreamReader inputStreamReader = this.f47592d;
            if (inputStreamReader == null) {
                c9072e = null;
            } else {
                inputStreamReader.close();
                c9072e = C9072e.f47360a;
            }
            if (c9072e == null) {
                this.f47589a.close();
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // java.io.Reader
        public final int read(char[] cArr, int i10, int i11) throws IOException {
            C5207g.m11111f(cArr, "cbuf");
            if (this.f47591c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader = this.f47592d;
            if (inputStreamReader == null) {
                InterfaceC5610g interfaceC5610g = this.f47589a;
                inputStreamReader = new InputStreamReader(interfaceC5610g.mo11975x1(), C9347b.m17712s(interfaceC5610g, this.f47590b));
                this.f47592d = inputStreamReader;
            }
            return inputStreamReader.read(cArr, i10, i11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final byte[] m17354a() throws IOException {
        long jMo13136b = mo13136b();
        if (jMo13136b > 2147483647L) {
            throw new IOException(C5207g.m11116k(Long.valueOf(jMo13136b), "Cannot buffer entire body for content length: "));
        }
        InterfaceC5610g interfaceC5610gMo13138q = mo13138q();
        try {
            byte[] bArrMo11933I = interfaceC5610gMo13138q.mo11933I();
            C5206f.m11032z0(interfaceC5610gMo13138q, null);
            int length = bArrMo11933I.length;
            if (jMo13136b == -1 || jMo13136b == length) {
                return bArrMo11933I;
            }
            throw new IOException("Content-Length (" + jMo13136b + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(interfaceC5610gMo13138q, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo13136b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C9347b.m17697d(mo13138q());
    }

    /* JADX INFO: renamed from: l */
    public abstract C9098p mo13137l();

    /* JADX INFO: renamed from: q */
    public abstract InterfaceC5610g mo13138q();

    /* JADX INFO: renamed from: r */
    public final String m17355r() throws IOException {
        InterfaceC5610g interfaceC5610gMo13138q = mo13138q();
        try {
            C9098p c9098pMo13137l = mo13137l();
            Charset charsetM17338a = c9098pMo13137l == null ? null : c9098pMo13137l.m17338a(C7653a.f42116b);
            if (charsetM17338a == null) {
                charsetM17338a = C7653a.f42116b;
            }
            String strMo11962q0 = interfaceC5610gMo13138q.mo11962q0(C9347b.m17712s(interfaceC5610gMo13138q, charsetM17338a));
            C5206f.m11032z0(interfaceC5610gMo13138q, null);
            return strMo11962q0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                C5206f.m11032z0(interfaceC5610gMo13138q, th2);
                throw th3;
            }
        }
    }
}
