package p000;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfa implements lex {

    /* JADX INFO: renamed from: b */
    public final lfi f38103b;

    /* JADX INFO: renamed from: g */
    private final nqf f38108g = nqf.m17621g();

    /* JADX INFO: renamed from: h */
    private final nqf f38109h = nqf.m17621g();

    /* JADX INFO: renamed from: i */
    private final nqf f38110i = nqf.m17621g();

    /* JADX INFO: renamed from: a */
    public final List f38102a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: c */
    private boolean f38104c = false;

    /* JADX INFO: renamed from: d */
    private boolean f38105d = false;

    /* JADX INFO: renamed from: e */
    private volatile mrm f38106e = mqu.f41450a;

    /* JADX INFO: renamed from: f */
    private final Object f38107f = new Object();

    public lfa(lfi lfiVar) {
        this.f38103b = lfiVar;
    }

    @Override // p000.lex
    /* JADX INFO: renamed from: a */
    public final synchronized nps mo15275a() {
        if (!this.f38105d) {
            return kxk.m14965K(true);
        }
        if (!this.f38104c) {
            Iterator it = this.f38102a.iterator();
            while (it.hasNext()) {
                ((lfb) it.next()).mo15274e();
            }
        }
        this.f38104c = true;
        nqf nqfVarM17621g = nqf.m17621g();
        kxk.m14975U(this.f38103b.mo8460a(), new lez(nqfVarM17621g), not.INSTANCE);
        return nqfVarM17621g;
    }

    @Override // p000.lex
    /* JADX INFO: renamed from: b */
    public final synchronized void mo15276b() {
        if (this.f38105d) {
            throw new IllegalStateException("MediaEncoder already started.");
        }
        synchronized (this.f38107f) {
            this.f38108g.mo14894e(null);
            this.f38109h.mo14894e(null);
        }
        this.f38110i.mo14894e(null);
        this.f38103b.mo8461b();
        Iterator it = this.f38102a.iterator();
        while (it.hasNext()) {
            ((lfb) it.next()).mo15273d();
        }
        this.f38105d = true;
    }

    /* JADX INFO: renamed from: c */
    public final lfc m15277c(final MediaFormat mediaFormat) {
        final nqf nqfVarM17621g = nqf.m17621g();
        lfc lfcVar = new lfc(mediaFormat, this.f38103b.mo8462c(lhz.m15359l(nqfVarM17621g)));
        mrf mrfVar = new mrf() { // from class: ley
            @Override // p000.mrf
            public final Object apply(Object obj) {
                lfa lfaVar = this.f38097a;
                MediaFormat mediaFormat2 = mediaFormat;
                nqf nqfVar = nqfVarM17621g;
                lew lewVar = (lew) obj;
                lfaVar.f38102a.add(lewVar);
                nqfVar.mo16665f(nod.m17553i(lewVar.mo15272c(), new hgv(mediaFormat2, 18), not.INSTANCE));
                return lewVar;
            }
        };
        synchronized (lfcVar.f38111a) {
            lfcVar.f38112b = new mrg(mrfVar, lfcVar.f38112b);
        }
        return lfcVar;
    }
}
