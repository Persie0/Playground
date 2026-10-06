package p000;

import android.media.MediaFormat;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kyr implements kyq {

    /* JADX INFO: renamed from: a */
    private final lfi f37739a;

    public kyr(lfi lfiVar) {
        this.f37739a = lfiVar;
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: a */
    public final kyt mo8410a() {
        lfi lfiVar = this.f37739a;
        nqf nqfVarM17621g = nqf.m17621g();
        new MediaFormat();
        return new kys(nqfVarM17621g, lfiVar.mo8462c(lhz.m15359l(nqfVarM17621g)));
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: b */
    public final nps mo8411b() {
        return lau.m15120a(((lfj) this.f37739a).f38130g);
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: c */
    public final void mo8412c() {
        ((lfj) this.f37739a).f38130g.cancel(false);
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: d */
    public final void mo8413d() {
        this.f37739a.mo8461b();
    }
}
