package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lxt implements oni {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f39532a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39533b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39534c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f39535d;

    public /* synthetic */ lxt(lxl lxlVar, List list, lvi lviVar, int i) {
        this.f39535d = i;
        this.f39533b = lxlVar;
        this.f39534c = list;
        this.f39532a = lviVar;
    }

    public /* synthetic */ lxt(lxu lxuVar, List list, List list2, int i) {
        this.f39535d = i;
        this.f39532a = lxuVar;
        this.f39533b = list;
        this.f39534c = list2;
    }

    public /* synthetic */ lxt(maj majVar, lzb lzbVar, lxm lxmVar, int i) {
        this.f39535d = i;
        this.f39534c = majVar;
        this.f39533b = lzbVar;
        this.f39532a = lxmVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.oni
    /* JADX INFO: renamed from: a */
    public final Object mo1803a(Object obj) {
        switch (this.f39535d) {
            case 0:
                return lxs.m16122b((lxs) this.f39532a, this.f39533b, this.f39534c, (ols) obj);
            case 1:
                Object obj2 = this.f39533b;
                return lxd.m16114b((lxd) obj2, this.f39534c, (lvi) this.f39532a, (ols) obj);
            default:
                Object obj3 = this.f39534c;
                Object obj4 = this.f39533b;
                return lzv.m16253d((lzv) obj3, (lzb) obj4, (lxm) this.f39532a, (ols) obj);
        }
    }
}
