package p493xo;

import dm.C5207g;
import java.io.IOException;
import java.util.List;
import mo.C7661i;
import p124fp.C5614k;
import p124fp.C5617n;
import p385sf.C9000b;
import so.AbstractC9105w;
import so.AbstractC9107y;
import so.C9090h;
import so.C9095m;
import so.C9096n;
import so.C9098p;
import so.C9101s;
import so.C9106x;
import so.InterfaceC9091i;
import so.InterfaceC9097o;
import to.C9347b;

/* JADX INFO: renamed from: xo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C10261a implements InterfaceC9097o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9091i f51692a;

    public C10261a(InterfaceC9091i interfaceC9091i) {
        C5207g.m11111f(interfaceC9091i, "cookieJar");
        this.f51692a = interfaceC9091i;
    }

    @Override // so.InterfaceC9097o
    /* JADX INFO: renamed from: a */
    public final C9106x mo9450a(C10266f c10266f) throws IOException {
        boolean z10;
        AbstractC9107y abstractC9107y;
        C9101s c9101s = c10266f.f51701e;
        c9101s.getClass();
        C9101s.a aVar = new C9101s.a(c9101s);
        AbstractC9105w abstractC9105w = c9101s.f47545d;
        if (abstractC9105w != null) {
            C9098p c9098pMo13146b = abstractC9105w.mo13146b();
            if (c9098pMo13146b != null) {
                aVar.m17345c("Content-Type", c9098pMo13146b.f47475a);
            }
            long jMo13145a = abstractC9105w.mo13145a();
            if (jMo13145a != -1) {
                aVar.m17345c("Content-Length", String.valueOf(jMo13145a));
                aVar.f47550c.m17316f("Transfer-Encoding");
            } else {
                aVar.m17345c("Transfer-Encoding", "chunked");
                aVar.f47550c.m17316f("Content-Length");
            }
        }
        C9095m c9095m = c9101s.f47544c;
        String strM17305a = c9095m.m17305a("Host");
        int i10 = 0;
        C9096n c9096n = c9101s.f47542a;
        if (strM17305a == null) {
            aVar.m17345c("Host", C9347b.m17716w(c9096n, false));
        }
        if (c9095m.m17305a("Connection") == null) {
            aVar.m17345c("Connection", "Keep-Alive");
        }
        if (c9095m.m17305a("Accept-Encoding") == null && c9095m.m17305a("Range") == null) {
            aVar.m17345c("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        InterfaceC9091i interfaceC9091i = this.f51692a;
        List<C9090h> listMo16919a = interfaceC9091i.mo16919a(c9096n);
        if (!listMo16919a.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : listMo16919a) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                C9090h c9090h = (C9090h) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(c9090h.f47434a);
                sb2.append('=');
                sb2.append(c9090h.f47435b);
                i10 = i11;
            }
            String string = sb2.toString();
            C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
            aVar.m17345c("Cookie", string);
        }
        if (c9095m.m17305a("User-Agent") == null) {
            aVar.m17345c("User-Agent", "okhttp/4.11.0");
        }
        C9106x c9106xM19235c = c10266f.m19235c(aVar.m17344b());
        C9095m c9095m2 = c9106xM19235c.f47568f;
        C10265e.m19232b(interfaceC9091i, c9096n, c9095m2);
        C9106x.a aVar2 = new C9106x.a(c9106xM19235c);
        aVar2.f47575a = c9101s;
        if (z10 && C7661i.m15249O2("gzip", C9106x.m17348b(c9106xM19235c, "Content-Encoding")) && C10265e.m19231a(c9106xM19235c) && (abstractC9107y = c9106xM19235c.f47569g) != null) {
            C5614k c5614k = new C5614k(abstractC9107y.mo13138q());
            C9095m.a aVarM17307g = c9095m2.m17307g();
            aVarM17307g.m17316f("Content-Encoding");
            aVarM17307g.m17316f("Content-Length");
            aVar2.m17353c(aVarM17307g.m17314d());
            aVar2.f47581g = new C10267g(C9106x.m17348b(c9106xM19235c, "Content-Type"), -1L, C5617n.m11991c(c5614k));
        }
        return aVar2.m17352a();
    }
}
