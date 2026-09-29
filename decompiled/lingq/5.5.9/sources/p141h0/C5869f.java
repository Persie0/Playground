package p141h0;

import dm.C5207g;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5869f<E> extends AbstractC5864a<E> {

    /* JADX INFO: renamed from: c */
    public int f35146c;

    /* JADX INFO: renamed from: d */
    public Object[] f35147d;

    /* JADX INFO: renamed from: e */
    public boolean f35148e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    public C5869f(Object[] objArr, int i10, int i11, int i12) {
        super(i10, i11);
        C5207g.m11111f(objArr, "root");
        this.f35146c = i12;
        Object[] objArr2 = new Object[i12];
        this.f35147d = objArr2;
        ?? r10 = i10 == i11 ? 1 : 0;
        this.f35148e = r10;
        objArr2[0] = objArr;
        m12308b(i10 - r10, 1);
    }

    /* JADX INFO: renamed from: a */
    public final E m12307a() {
        int i10 = this.f35132a & 31;
        Object obj = this.f35147d[this.f35146c - 1];
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return (E) ((Object[]) obj)[i10];
    }

    /* JADX INFO: renamed from: b */
    public final void m12308b(int i10, int i11) {
        int i12 = (this.f35146c - i11) * 5;
        while (i11 < this.f35146c) {
            Object[] objArr = this.f35147d;
            Object obj = objArr[i11 - 1];
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i11] = ((Object[]) obj)[(i10 >> i12) & 31];
            i12 -= 5;
            i11++;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final E next() {
        int i10;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E eM12307a = m12307a();
        int i11 = this.f35132a + 1;
        this.f35132a = i11;
        if (i11 == this.f35133b) {
            this.f35148e = true;
            return eM12307a;
        }
        int i12 = 0;
        while (true) {
            i10 = this.f35132a;
            if (((i10 >> i12) & 31) != 0) {
                break;
            }
            i12 += 5;
        }
        if (i12 > 0) {
            m12308b(i10, ((this.f35146c - 1) - (i12 / 5)) + 1);
        }
        return eM12307a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.ListIterator
    public final E previous() {
        int i10;
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f35132a--;
        int i11 = 0;
        if (this.f35148e) {
            this.f35148e = false;
            return m12307a();
        }
        while (true) {
            i10 = this.f35132a;
            if (((i10 >> i11) & 31) != 31) {
                break;
            }
            i11 += 5;
        }
        if (i11 > 0) {
            m12308b(i10, ((this.f35146c - 1) - (i11 / 5)) + 1);
        }
        return m12307a();
    }
}
