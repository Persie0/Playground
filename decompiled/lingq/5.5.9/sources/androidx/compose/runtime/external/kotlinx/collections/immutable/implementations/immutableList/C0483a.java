package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import ae.C0062b;
import cm.InterfaceC2052l;
import dm.C5207g;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.C6744b;
import p126g0.InterfaceC5631a;
import p126g0.InterfaceC5633c;
import p141h0.C5865b;
import p141h0.C5866c;
import tl.C9322j;

/* JADX INFO: renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0483a<E> extends AbstractPersistentList<E> implements InterfaceC5631a<E> {

    /* JADX INFO: renamed from: b */
    public static final C0483a f3197b = new C0483a(new Object[0]);

    /* JADX INFO: renamed from: a */
    public final Object[] f3198a;

    public C0483a(Object[] objArr) {
        this.f3198a = objArr;
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: M */
    public final InterfaceC5633c<E> mo1845M(int i10) {
        Object[] objArr = this.f3198a;
        C0062b.m342e0(i10, objArr.length);
        if (objArr.length == 1) {
            return f3197b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        C9322j.m17673a0(i10, i10 + 1, objArr.length, objArr, objArrCopyOf);
        return new C0483a(objArrCopyOf);
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: T */
    public final InterfaceC5633c<E> mo1846T(InterfaceC2052l<? super E, Boolean> interfaceC2052l) {
        Object[] objArr = this.f3198a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z10 = false;
        for (int i10 = 0; i10 < length2; i10++) {
            Object obj = objArr[i10];
            if (((Boolean) ((AbstractPersistentList.C04811) interfaceC2052l).mo528n(obj)).booleanValue()) {
                if (!z10) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
                    z10 = true;
                    length = i10;
                }
            } else if (z10) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f3197b : new C0483a(C9322j.m17677e0(0, length, objArrCopyOf));
    }

    @Override // kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: a */
    public final int mo1847a() {
        return this.f3198a.length;
    }

    @Override // java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> add(int i10, E e10) {
        Object[] objArr = this.f3198a;
        C0062b.m348g0(i10, objArr.length);
        Object[] objArr2 = this.f3198a;
        if (i10 == objArr2.length) {
            return add((Object) e10);
        }
        if (objArr2.length < 32) {
            Object[] objArr3 = new Object[objArr2.length + 1];
            C9322j.m17675c0(objArr2, objArr3, 0, 0, i10, 6);
            C9322j.m17673a0(i10 + 1, i10, objArr.length, objArr2, objArr3);
            objArr3[i10] = e10;
            return new C0483a(objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
        C9322j.m17673a0(i10 + 1, i10, objArr.length - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i10] = e10;
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr2[31];
        return new C5866c(objArr.length + 1, 0, objArrCopyOf, objArr4);
    }

    @Override // java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> add(E e10) {
        Object[] objArr = this.f3198a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = e10;
            return new C5866c(objArr.length + 1, 0, objArr, objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        objArrCopyOf[objArr.length] = e10;
        return new C0483a(objArrCopyOf);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> addAll(Collection<? extends E> collection) {
        C5207g.m11111f(collection, "elements");
        Object[] objArr = this.f3198a;
        if (collection.size() + objArr.length > 32) {
            PersistentVectorBuilder persistentVectorBuilderMo1848j = mo1848j();
            persistentVectorBuilderMo1848j.addAll(collection);
            return persistentVectorBuilderMo1848j.m1836q();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, newSize)");
        int length = objArr.length;
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C0483a(objArrCopyOf);
    }

    @Override // java.util.List
    public final E get(int i10) {
        C0062b.m342e0(i10, mo1847a());
        return (E) this.f3198a[i10];
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final int indexOf(Object obj) {
        return C6744b.m13384p0(obj, this.f3198a);
    }

    @Override // p126g0.InterfaceC5633c
    /* JADX INFO: renamed from: j */
    public final PersistentVectorBuilder mo1848j() {
        return new PersistentVectorBuilder(this, null, this.f3198a, 0);
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f3198a;
        C5207g.m11111f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i10 < 0) {
                        return -1;
                    }
                    length = i10;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i11 = length2 - 1;
                    if (C5207g.m11106a(obj, objArr[length2])) {
                        return length2;
                    }
                    if (i11 < 0) {
                        return -1;
                    }
                    length2 = i11;
                }
            }
        }
        return -1;
    }

    @Override // tl.AbstractC9313a, java.util.List
    public final ListIterator<E> listIterator(int i10) {
        C0062b.m348g0(i10, mo1847a());
        return new C5865b(i10, mo1847a(), this.f3198a);
    }

    @Override // tl.AbstractC9313a, java.util.List, p126g0.InterfaceC5633c
    public final InterfaceC5633c<E> set(int i10, E e10) {
        C0062b.m342e0(i10, mo1847a());
        Object[] objArr = this.f3198a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        C5207g.m11110e(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i10] = e10;
        return new C0483a(objArrCopyOf);
    }
}
