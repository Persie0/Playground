package p000;

import java.io.InputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class brk implements brb {

    /* JADX INFO: renamed from: a */
    private final btg f4226a;

    public brk(btg btgVar) {
        this.f4226a = btgVar;
    }

    @Override // p000.brb
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ brc mo2947a(Object obj) {
        return new brl((InputStream) obj, this.f4226a);
    }

    @Override // p000.brb
    /* JADX INFO: renamed from: b */
    public final Class mo2948b() {
        return InputStream.class;
    }
}
