package p081e0;

import dm.C5207g;

/* JADX INFO: renamed from: e0.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5307e1<T> implements InterfaceC5301c1<T> {

    /* JADX INFO: renamed from: a */
    public final T f33575a;

    public C5307e1(T t10) {
        this.f33575a = t10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5307e1) {
            return C5207g.m11106a(this.f33575a, ((C5307e1) obj).f33575a);
        }
        return false;
    }

    @Override // p081e0.InterfaceC5301c1
    public final T getValue() {
        return this.f33575a;
    }

    public final int hashCode() {
        T t10 = this.f33575a;
        if (t10 == null) {
            return 0;
        }
        return t10.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.f33575a + ')';
    }
}
