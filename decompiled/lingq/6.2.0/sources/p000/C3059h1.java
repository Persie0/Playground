package p000;

import java.util.Collection;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3059h1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41647a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Collection f41648b;

    public /* synthetic */ C3059h1(int i, Collection collection) {
        this.f41647a = i;
        this.f41648b = collection;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        boolean zContains;
        int i = this.f41647a;
        Collection collection = this.f41648b;
        switch (i) {
            case 0:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = collection.contains(obj);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
