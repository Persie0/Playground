package p000;

import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lzi implements oni {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39625a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39626b;

    public /* synthetic */ lzi(lxq lxqVar, int i) {
        this.f39626b = i;
        this.f39625a = lxqVar;
    }

    public /* synthetic */ lzi(lzo lzoVar, int i) {
        this.f39626b = i;
        this.f39625a = lzoVar;
    }

    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final Object mo1803a(Object obj) {
        switch (this.f39626b) {
            case 0:
                return lzh.m16245b((lzh) this.f39625a, (ols) obj);
            case 1:
                ((lxq) this.f39625a).m16121d((HashMap) obj);
                return oki.f46196a;
            case 2:
                return lzh.m16246d((lzh) this.f39625a, (ols) obj);
            default:
                ((lzo) this.f39625a).m16251g((HashMap) obj);
                return oki.f46196a;
        }
    }
}
