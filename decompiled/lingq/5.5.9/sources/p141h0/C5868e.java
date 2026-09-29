package p141h0;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import dm.C5207g;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C5868e<T> extends AbstractC5864a<T> {

    /* JADX INFO: renamed from: c */
    public final PersistentVectorBuilder<T> f35142c;

    /* JADX INFO: renamed from: d */
    public int f35143d;

    /* JADX INFO: renamed from: e */
    public C5869f<? extends T> f35144e;

    /* JADX INFO: renamed from: f */
    public int f35145f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5868e(PersistentVectorBuilder<T> persistentVectorBuilder, int i10) {
        super(i10, persistentVectorBuilder.mo1822a());
        C5207g.m11111f(persistentVectorBuilder, "builder");
        this.f35142c = persistentVectorBuilder;
        this.f35143d = persistentVectorBuilder.m1844y();
        this.f35145f = -1;
        m12306b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m12305a() {
        if (this.f35143d != this.f35142c.m1844y()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // p141h0.AbstractC5864a, java.util.ListIterator
    public final void add(T t10) {
        m12305a();
        int i10 = this.f35132a;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        persistentVectorBuilder.add(i10, t10);
        this.f35132a++;
        this.f35133b = persistentVectorBuilder.mo1822a();
        this.f35143d = persistentVectorBuilder.m1844y();
        this.f35145f = -1;
        m12306b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: b */
    public final void m12306b() {
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        Object[] objArr = persistentVectorBuilder.f3193f;
        if (objArr == null) {
            this.f35144e = null;
            return;
        }
        int iMo1822a = (persistentVectorBuilder.mo1822a() - 1) & (-32);
        int i10 = this.f35132a;
        if (i10 > iMo1822a) {
            i10 = iMo1822a;
        }
        int i11 = (persistentVectorBuilder.f3191d / 5) + 1;
        C5869f<? extends T> c5869f = this.f35144e;
        if (c5869f == null) {
            this.f35144e = new C5869f<>(objArr, i10, iMo1822a, i11);
            return;
        }
        C5207g.m11108c(c5869f);
        c5869f.f35132a = i10;
        c5869f.f35133b = iMo1822a;
        c5869f.f35146c = i11;
        if (c5869f.f35147d.length < i11) {
            c5869f.f35147d = new Object[i11];
        }
        c5869f.f35147d[0] = objArr;
        ?? r10 = i10 == iMo1822a ? 1 : 0;
        c5869f.f35148e = r10;
        c5869f.m12308b(i10 - r10, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final T next() {
        m12305a();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35132a;
        this.f35145f = i10;
        C5869f<? extends T> c5869f = this.f35144e;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        if (c5869f == null) {
            Object[] objArr = persistentVectorBuilder.f3194g;
            this.f35132a = i10 + 1;
            return (T) objArr[i10];
        }
        if (c5869f.hasNext()) {
            this.f35132a++;
            return c5869f.next();
        }
        Object[] objArr2 = persistentVectorBuilder.f3194g;
        int i11 = this.f35132a;
        this.f35132a = i11 + 1;
        return (T) objArr2[i11 - c5869f.f35133b];
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final T previous() {
        m12305a();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f35132a;
        int i11 = i10 - 1;
        this.f35145f = i11;
        C5869f<? extends T> c5869f = this.f35144e;
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        if (c5869f == null) {
            Object[] objArr = persistentVectorBuilder.f3194g;
            this.f35132a = i11;
            return (T) objArr[i11];
        }
        int i12 = c5869f.f35133b;
        if (i10 <= i12) {
            this.f35132a = i11;
            return c5869f.previous();
        }
        Object[] objArr2 = persistentVectorBuilder.f3194g;
        this.f35132a = i11;
        return (T) objArr2[i11 - i12];
    }

    @Override // p141h0.AbstractC5864a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m12305a();
        int i10 = this.f35145f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        persistentVectorBuilder.mo1830l(i10);
        int i11 = this.f35145f;
        if (i11 < this.f35132a) {
            this.f35132a = i11;
        }
        this.f35133b = persistentVectorBuilder.mo1822a();
        this.f35143d = persistentVectorBuilder.m1844y();
        this.f35145f = -1;
        m12306b();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p141h0.AbstractC5864a, java.util.ListIterator
    public final void set(T t10) {
        m12305a();
        int i10 = this.f35145f;
        if (i10 == -1) {
            throw new IllegalStateException();
        }
        PersistentVectorBuilder<T> persistentVectorBuilder = this.f35142c;
        persistentVectorBuilder.set(i10, t10);
        this.f35143d = persistentVectorBuilder.m1844y();
        m12306b();
    }
}
