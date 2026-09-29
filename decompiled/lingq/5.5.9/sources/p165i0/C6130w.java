package p165i0;

/* JADX INFO: renamed from: i0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C6130w<K, V> extends AbstractC6128u<K, V, K> {
    @Override // java.util.Iterator
    public final K next() {
        int i10 = this.f35958c + 2;
        this.f35958c = i10;
        return (K) this.f35956a[i10 - 2];
    }
}
