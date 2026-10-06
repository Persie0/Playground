package p000;

import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kjv implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final Comparator f36311a = new kjv();

    /* JADX INFO: renamed from: b */
    private final mzh f36312b = new kjw(mws.m17099n(kgj.SURFACE_VIEW, kgj.SURFACE_TEXTURE, kgj.SURFACE_DEFERRED));

    /* JADX INFO: renamed from: c */
    private final mzh f36313c = new kjw(mws.m17098m(0, 34));

    private kjv() {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        kky kkyVar = (kky) obj;
        kky kkyVar2 = (kky) obj2;
        kkyVar.getClass();
        kkyVar2.getClass();
        int iCompare = this.f36312b.compare(kkyVar.mo14453h(), kkyVar2.mo14453h());
        if (iCompare == 0 && (iCompare = this.f36313c.compare(Integer.valueOf(kkyVar.mo14191a()), Integer.valueOf(kkyVar2.mo14191a()))) == 0) {
            return 0;
        }
        return iCompare;
    }
}
