package p000;

import java.util.Collections;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grq implements grf {

    /* JADX INFO: renamed from: a */
    public final nqf f26172a = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    public grm f26173b;

    @Override // p000.grf, p000.kba, java.lang.AutoCloseable
    public final void close() {
        grm grmVar = this.f26173b;
        if (grmVar == null) {
            this.f26172a.mo14894e(Collections.emptySet());
        } else {
            this.f26172a.mo14894e(mxk.m17136H(grmVar));
        }
    }
}
