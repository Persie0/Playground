package p165i0;

/* JADX INFO: renamed from: i0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C6132y<K, V> extends AbstractC6128u<K, V, V> {
    @Override // java.util.Iterator
    public final V next() {
        int i10 = this.f35958c + 2;
        this.f35958c = i10;
        return (V) this.f35956a[i10 - 1];
    }
}
