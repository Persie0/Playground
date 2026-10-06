package p000;

import java.util.Collection;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ouy implements ous {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46611a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46612b;

    public ouy(aea aeaVar, int i) {
        this.f46612b = i;
        this.f46611a = aeaVar;
    }

    public ouy(Collection collection, int i) {
        this.f46612b = i;
        this.f46611a = collection;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [aea, java.lang.Object] */
    @Override // p000.ous
    /* JADX INFO: renamed from: a */
    public final Object mo16103a(Object obj, ols olsVar) {
        switch (this.f46612b) {
            case 0:
                this.f46611a.add(obj);
                break;
            default:
                this.f46611a.mo309a(obj);
                break;
        }
        return oki.f46196a;
    }
}
