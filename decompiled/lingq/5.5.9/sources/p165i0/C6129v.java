package p165i0;

import java.util.Map;

/* JADX INFO: renamed from: i0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C6129v<K, V> extends AbstractC6128u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f35958c + 2;
        this.f35958c = i10;
        Object[] objArr = this.f35956a;
        return new C6109b(objArr[i10 - 2], objArr[i10 - 1]);
    }
}
