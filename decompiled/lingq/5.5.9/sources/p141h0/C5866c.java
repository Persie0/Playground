package p141h0;

import ae.C0062b;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.C0483a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.ListIterator;
import p080e.C5288t;
import p126g0.InterfaceC5633c;
import tl.C9322j;

/* JADX INFO: renamed from: h0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5866c<E> extends AbstractPersistentList<E> {

    /* JADX INFO: renamed from: a */
    public final Object[] f35136a;

    /* JADX INFO: renamed from: b */
    public final Object[] f35137b;

    /* JADX INFO: renamed from: c */
    public final int f35138c;

    /* JADX INFO: renamed from: d */
    public final int f35139d;

    public C5866c(int i10, int i11, Object[] objArr, Object[] objArr2) {
        C5207g.m11111f(objArr, "root");
        C5207g.m11111f(objArr2, "tail");
        this.f35136a = objArr;
        this.f35137b = objArr2;
        this.f35138c = i10;
        this.f35139d = i11;
        if (mo1847a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + mo1847a()).toString());
    }

    /* JADX INFO: renamed from: u */
    public static Object[] m12295u(int i10, int i11, Object obj, Object[] objArr) {
        int i12 = (i11 >> i10) & 31;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        if (i10 == 0) {
            objArrCopyOf[i12] = obj;
        } else {
            Object obj2 = objArrCopyOf[i12];
            C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf[i12] = m12295u(i10 - 5, i11, obj, (Object[]) obj2);
        }
        return objArrCopyOf;
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: M */
    public final InterfaceC5633c<E> mo1845M(int i10) {
        C0062b.m342e0(i10, this.f35138c);
        int iM12304t = m12304t();
        Object[] objArr = this.f35136a;
        int i11 = this.f35139d;
        return i10 >= iM12304t ? m12303q(objArr, iM12304t, i11, i10 - iM12304t) : m12303q(m12302p(objArr, i11, i10, new C5288t(2, this.f35137b[0])), iM12304t, i11, 0);
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: T */
    public final InterfaceC5633c<E> mo1846T(InterfaceC2052l<? super E, Boolean> interfaceC2052l) {
        PersistentVectorBuilder<E> persistentVectorBuilderMo1848j = mo1848j();
        persistentVectorBuilderMo1848j.m1837q0(interfaceC2052l);
        return persistentVectorBuilderMo1848j.m1836q();
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f35138c;
    }

    @Override // java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> add(int i10, E e10) {
        C0062b.m348g0(i10, mo1847a());
        if (i10 == mo1847a()) {
            return add((Object) e10);
        }
        int iM12304t = m12304t();
        if (i10 >= iM12304t) {
            return m12298i(i10 - iM12304t, e10, this.f35136a);
        }
        C5288t c5288t = new C5288t(2, (Object) null);
        return m12298i(0, c5288t.f33503b, m12297g(this.f35136a, this.f35139d, i10, e10, c5288t));
    }

    @Override // java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> add(E e10) {
        int iM12304t = m12304t();
        int i10 = this.f35138c;
        int i11 = i10 - iM12304t;
        Object[] objArr = this.f35137b;
        Object[] objArr2 = this.f35136a;
        if (i11 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = e10;
            return m12300m(objArr2, objArr, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i11] = e10;
        return new C5866c(i10 + 1, this.f35139d, objArr2, objArrCopyOf);
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final PersistentVectorBuilder<E> mo1848j() {
        return new PersistentVectorBuilder<>(this, this.f35136a, this.f35137b, this.f35139d);
    }

    /* JADX INFO: renamed from: g */
    public final Object[] m12297g(Object[] objArr, int i10, int i11, Object obj, C5288t c5288t) {
        Object[] objArr2;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            if (i12 == 0) {
                objArr2 = new Object[32];
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
                objArr2 = objArrCopyOf;
            }
            C9322j.m17673a0(i12 + 1, i12, 31, objArr, objArr2);
            c5288t.f33503b = objArr[31];
            objArr2[i12] = obj;
            return objArr2;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        Object obj2 = objArr[i12];
        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i12] = m12297g((Object[]) obj2, i13, i11, obj, c5288t);
        while (true) {
            i12++;
            if (i12 >= 32 || objArrCopyOf2[i12] == null) {
                break;
            }
            Object obj3 = objArr[i12];
            C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i12] = m12297g((Object[]) obj3, i13, 0, c5288t.f33503b, c5288t);
        }
        return objArrCopyOf2;
    }

    @Override // java.util.List
    public final E get(int i10) {
        Object[] objArr;
        C0062b.m342e0(i10, mo1847a());
        if (m12304t() <= i10) {
            objArr = this.f35137b;
        } else {
            objArr = this.f35136a;
            for (int i11 = this.f35139d; i11 > 0; i11 -= 5) {
                Object obj = objArr[(i10 >> i11) & 31];
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return (E) objArr[i10 & 31];
    }

    /* JADX INFO: renamed from: i */
    public final C5866c m12298i(int i10, Object obj, Object[] objArr) {
        int iM12304t = m12304t();
        int i11 = this.f35138c;
        int i12 = i11 - iM12304t;
        Object[] objArr2 = this.f35137b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        if (i12 < 32) {
            C9322j.m17673a0(i10 + 1, i10, i12, objArr2, objArrCopyOf);
            objArrCopyOf[i10] = obj;
            return new C5866c(i11 + 1, this.f35139d, objArr, objArrCopyOf);
        }
        Object obj2 = objArr2[31];
        C9322j.m17673a0(i10 + 1, i10, i12 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return m12300m(objArr, objArrCopyOf, objArr3);
    }

    /* JADX INFO: renamed from: l */
    public final Object[] m12299l(Object[] objArr, int i10, int i11, C5288t c5288t) {
        Object[] objArrM12299l;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 5) {
            c5288t.f33503b = objArr[i12];
            objArrM12299l = null;
        } else {
            Object obj = objArr[i12];
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrM12299l = m12299l((Object[]) obj, i10 - 5, i11, c5288t);
        }
        if (objArrM12299l == null && i12 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i12] = objArrM12299l;
        return objArrCopyOf;
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        C0062b.m348g0(i10, mo1847a());
        return new C5867d(i10, mo1847a(), (this.f35139d / 5) + 1, this.f35136a, this.f35137b);
    }

    /* JADX INFO: renamed from: m */
    public final C5866c<E> m12300m(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i10 = this.f35138c;
        int i11 = i10 >> 5;
        int i12 = this.f35139d;
        if (i11 <= (1 << i12)) {
            return new C5866c<>(i10 + 1, i12, m12301o(i12, objArr, objArr2), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i13 = i12 + 5;
        return new C5866c<>(i10 + 1, i13, m12301o(i13, objArr4, objArr2), objArr3);
    }

    /* JADX INFO: renamed from: o */
    public final Object[] m12301o(int i10, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int iMo1847a = ((mo1847a() - 1) >> i10) & 31;
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i10 == 5) {
            objArrCopyOf[iMo1847a] = objArr2;
        } else {
            objArrCopyOf[iMo1847a] = m12301o(i10 - 5, (Object[]) objArrCopyOf[iMo1847a], objArr2);
        }
        return objArrCopyOf;
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m12302p(Object[] objArr, int i10, int i11, C5288t c5288t) {
        Object[] objArrCopyOf;
        int i12 = (i11 >> i10) & 31;
        if (i10 == 0) {
            if (i12 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            }
            C9322j.m17673a0(i12, i12 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c5288t.f33503b;
            c5288t.f33503b = objArr[i12];
            return objArrCopyOf;
        }
        int iM12304t = objArr[31] == null ? 31 & ((m12304t() - 1) >> i10) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
        int i13 = i10 - 5;
        int i14 = i12 + 1;
        if (i14 <= iM12304t) {
            while (true) {
                Object obj = objArrCopyOf2[iM12304t];
                C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[iM12304t] = m12302p((Object[]) obj, i13, 0, c5288t);
                if (iM12304t == i14) {
                    break;
                }
                iM12304t--;
            }
        }
        Object obj2 = objArrCopyOf2[i12];
        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i12] = m12302p((Object[]) obj2, i13, i11, c5288t);
        return objArrCopyOf2;
    }

    /* JADX INFO: renamed from: q */
    public final AbstractPersistentList m12303q(Object[] objArr, int i10, int i11, int i12) {
        C5866c c5866c;
        int i13 = this.f35138c - i10;
        if (i13 != 1) {
            Object[] objArr2 = this.f35137b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
            int i14 = i13 - 1;
            if (i12 < i14) {
                C9322j.m17673a0(i12, i12 + 1, i13, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i14] = null;
            return new C5866c((i10 + i13) - 1, i11, objArr, objArrCopyOf);
        }
        if (i11 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                C5207g.m11110e(objArr, "copyOf(this, newSize)");
            }
            return new C0483a(objArr);
        }
        C5288t c5288t = new C5288t(2, (Object) null);
        Object[] objArrM12299l = m12299l(objArr, i11, i10 - 1, c5288t);
        C5207g.m11108c(objArrM12299l);
        Object obj = c5288t.f33503b;
        C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (objArrM12299l[1] == null) {
            Object obj2 = objArrM12299l[0];
            C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            c5866c = new C5866c(i10, i11 - 5, (Object[]) obj2, objArr3);
        } else {
            c5866c = new C5866c(i10, i11, objArrM12299l, objArr3);
        }
        return c5866c;
    }

    @Override // tl.AbstractC9313a, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> set(int i10, E e10) {
        int i11 = this.f35138c;
        C0062b.m342e0(i10, i11);
        int iM12304t = m12304t();
        Object[] objArr = this.f35137b;
        Object[] objArr2 = this.f35136a;
        int i12 = this.f35139d;
        if (iM12304t > i10) {
            return new C5866c(i11, i12, m12295u(i12, i10, e10, objArr2), objArr);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[i10 & 31] = e10;
        return new C5866c(i11, i12, objArr2, objArrCopyOf);
    }

    /* JADX INFO: renamed from: t */
    public final int m12304t() {
        return (mo1847a() - 1) & (-32);
    }
}
