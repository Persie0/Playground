package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brl implements brc {

    /* JADX INFO: renamed from: a */
    public final bxm f4227a;

    public brl(InputStream inputStream, btg btgVar) {
        bxm bxmVar = new bxm(inputStream, btgVar);
        this.f4227a = bxmVar;
        bxmVar.mark(5242880);
    }

    @Override // p000.brc
    /* JADX INFO: renamed from: b */
    public final void mo2950b() {
        this.f4227a.m3166b();
    }

    @Override // p000.brc
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InputStream mo2949a() {
        this.f4227a.reset();
        return this.f4227a;
    }
}
