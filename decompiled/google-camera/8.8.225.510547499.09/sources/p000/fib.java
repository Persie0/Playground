package p000;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fib implements fgz {
    @Override // p000.fgz
    /* JADX INFO: renamed from: a */
    public final kyq mo8405a(final FileOutputStream fileOutputStream, int i, nps npsVar, Executor executor) {
        nps npsVarM17553i = nod.m17553i(npsVar, ddu.f10603t, not.INSTANCE);
        try {
            lfm lfmVarM14877p = kua.m14877p(executor);
            lfmVarM14877p.m15284c(fileOutputStream.getFD());
            lfmVarM14877p.m15283b(i);
            lfmVarM14877p.f38148b = nod.m17553i(npsVarM17553i, hnk.f28501n, lfmVarM14877p.f38147a);
            lfmVarM14877p.f38149c = nod.m17553i(npsVarM17553i, hnk.f28502o, lfmVarM14877p.f38147a);
            lfmVarM14877p.f38150d = false;
            kyr kyrVar = new kyr(lfmVarM14877p.m15282a());
            final nqf nqfVarM17621g = nqf.m17621g();
            final nps npsVarMo8411b = kyrVar.mo8411b();
            npsVarMo8411b.mo2282d(new Runnable() { // from class: fhz
                @Override // java.lang.Runnable
                public final void run() {
                    FileOutputStream fileOutputStream2 = fileOutputStream;
                    nqf nqfVar = nqfVarM17621g;
                    nps npsVar2 = npsVarMo8411b;
                    try {
                        try {
                            fileOutputStream2.close();
                            nqfVar.mo16665f(npsVar2);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    } catch (Throwable th) {
                        nqfVar.mo16665f(npsVar2);
                        throw th;
                    }
                }
            }, not.INSTANCE);
            return new fia(kyrVar, nqfVarM17621g);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
