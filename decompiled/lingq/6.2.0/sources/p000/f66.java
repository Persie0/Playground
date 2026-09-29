package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class f66 implements List, vg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38519a;

    /* JADX INFO: renamed from: b */
    public final Object f38520b;

    public /* synthetic */ f66(Object obj, int i) {
        this.f38519a = i;
        this.f38520b = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int i3 = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i3) {
            case 0:
                h66 h66Var = (h66) obj2;
                if (i < 0 || i > (i2 = h66Var.f1294b)) {
                    h66Var.m13099p(i);
                    throw null;
                }
                int i4 = i2 + 1;
                Object[] objArr = h66Var.f1293a;
                if (objArr.length < i4) {
                    h66Var.m13097n(objArr, i4);
                }
                Object[] objArr2 = h66Var.f1293a;
                int i5 = h66Var.f1294b;
                if (i != i5) {
                    AbstractC3550rv.m20826T(i + 1, i, i5, objArr2, objArr2);
                }
                objArr2[i] = obj;
                h66Var.f1294b++;
                return;
            default:
                ((x66) obj2).m24304b(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f38519a;
        Object obj = this.f38520b;
        switch (i2) {
            case 0:
                collection.getClass();
                h66 h66Var = (h66) obj;
                if (i < 0 || i > h66Var.f1294b) {
                    h66Var.m13099p(i);
                    throw null;
                }
                int i3 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + h66Var.f1294b;
                Object[] objArr = h66Var.f1293a;
                if (objArr.length < size) {
                    h66Var.m13097n(objArr, size);
                }
                Object[] objArr2 = h66Var.f1293a;
                if (i != h66Var.f1294b) {
                    AbstractC3550rv.m20826T(collection.size() + i, i, h66Var.f1294b, objArr2, objArr2);
                }
                for (Object obj2 : collection) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    objArr2[i3 + i] = obj2;
                    i3 = i4;
                }
                h66Var.f1294b = collection.size() + h66Var.f1294b;
                return true;
            default:
                return ((x66) obj).m24308f(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                ((h66) obj).m13093j();
                break;
            default:
                ((x66) obj).m24310h();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i) {
            case 0:
                return ((h66) obj2).m718c(obj) >= 0;
            default:
                return ((x66) obj2).m24311i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                collection.getClass();
                h66 h66Var = (h66) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (h66Var.m718c(it.next()) < 0) {
                        return false;
                    }
                }
                return true;
            default:
                x66 x66Var = (x66) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!x66Var.m24311i(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f38519a;
        Object obj = this.f38520b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                return ((h66) obj).m717b(i);
            default:
                y66.m24953a(i, this);
                return ((x66) obj).f67830a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i) {
            case 0:
                return ((h66) obj2).m718c(obj);
            default:
                return ((x66) obj2).m24312j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                return ((h66) obj).m719d();
            default:
                return ((x66) obj).f67832c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f38519a) {
            case 0:
                return new e66(0, 0, this);
            default:
                return new e66(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i2) {
            case 0:
                h66 h66Var = (h66) obj2;
                Object[] objArr = h66Var.f1293a;
                int i3 = h66Var.f1294b;
                if (obj == null) {
                    i = i3 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i3 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                x66 x66Var = (x66) obj2;
                Object[] objArr2 = x66Var.f67830a;
                for (int i4 = x66Var.f67832c - 1; i4 >= 0; i4--) {
                    if (fa4.m11650l(obj, objArr2[i4])) {
                        return i4;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f38519a) {
            case 0:
                return new e66(0, 0, this);
            default:
                return new e66(0, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f38519a;
        Object obj = this.f38520b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                return ((h66) obj).m13095l(i);
            default:
                y66.m24953a(i, this);
                return ((x66) obj).m24314l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                collection.getClass();
                h66 h66Var = (h66) obj;
                int i2 = h66Var.f1294b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    h66Var.m13094k(it.next());
                }
                return i2 != h66Var.f1294b;
            default:
                x66 x66Var = (x66) obj;
                if (!collection.isEmpty()) {
                    int i3 = x66Var.f67832c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        x66Var.m24313k(it2.next());
                    }
                    if (i3 != x66Var.f67832c) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                collection.getClass();
                h66 h66Var = (h66) obj;
                int i2 = h66Var.f1294b;
                Object[] objArr = h66Var.f1293a;
                for (int i3 = i2 - 1; -1 < i3; i3--) {
                    if (!collection.contains(objArr[i3])) {
                        h66Var.m13095l(i3);
                    }
                }
                return i2 != h66Var.f1294b;
            default:
                x66 x66Var = (x66) obj;
                int i4 = x66Var.f67832c;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!collection.contains(x66Var.f67830a[i5])) {
                        x66Var.m24314l(i5);
                    }
                }
                return i4 != x66Var.f67832c;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                return ((h66) obj2).m13098o(i, obj);
            default:
                y66.m24953a(i, this);
                Object[] objArr = ((x66) obj2).f67830a;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                return ((h66) obj).f1294b;
            default:
                return ((x66) obj).f67832c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f38519a) {
            case 0:
                ip6.m14065b(i, i2, this);
                return new g66(i, i2, 0, this);
            default:
                y66.m24954b(i, i2, this);
                return new g66(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f38519a) {
            case 0:
                objArr.getClass();
                break;
        }
        return ss5.m21701a0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f38519a) {
            case 0:
                break;
        }
        return ss5.m21699Z(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f38519a) {
            case 0:
                return new e66(i, 0, this);
            default:
                return new e66(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i) {
            case 0:
                return ((h66) obj2).m13094k(obj);
            default:
                return ((x66) obj2).m24313k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f38519a;
        Object obj2 = this.f38520b;
        switch (i) {
            case 0:
                ((h66) obj2).m13090g(obj);
                break;
            default:
                ((x66) obj2).m24305c(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f38519a;
        Object obj = this.f38520b;
        switch (i) {
            case 0:
                collection.getClass();
                h66 h66Var = (h66) obj;
                int i2 = h66Var.f1294b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    h66Var.m13090g(it.next());
                }
                return i2 != h66Var.f1294b;
            default:
                x66 x66Var = (x66) obj;
                return x66Var.m24308f(x66Var.f67832c, collection);
        }
    }
}
