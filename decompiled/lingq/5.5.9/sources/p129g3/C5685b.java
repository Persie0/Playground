package p129g3;

/* JADX INFO: renamed from: g3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5685b<T> extends AbstractC5692i<T> {

    /* JADX INFO: renamed from: a */
    public final T f34667a;

    /* JADX INFO: renamed from: b */
    public final int f34668b;

    /* JADX WARN: Multi-variable type inference failed */
    public C5685b(int i10, Object obj) {
        this.f34667a = obj;
        this.f34668b = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m12052a() {
        T t10 = this.f34667a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f34668b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
