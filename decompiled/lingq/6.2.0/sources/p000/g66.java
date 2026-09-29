package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class g66 implements List, vg4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40265a;

    /* JADX INFO: renamed from: b */
    public final List f40266b;

    /* JADX INFO: renamed from: c */
    public final int f40267c;

    /* JADX INFO: renamed from: d */
    public int f40268d;

    public /* synthetic */ g66(int i, int i2, int i3, List list) {
        this.f40265a = i3;
        this.f40266b = list;
        this.f40267c = i;
        this.f40268d = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f40265a;
        int i3 = this.f40267c;
        List list = this.f40266b;
        switch (i2) {
            case 0:
                list.add(i + i3, obj);
                this.f40268d++;
                break;
            default:
                list.add(i + i3, obj);
                this.f40268d++;
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f40265a;
        int i3 = this.f40267c;
        List list = this.f40266b;
        switch (i2) {
            case 0:
                collection.getClass();
                list.addAll(i + i3, collection);
                this.f40268d = collection.size() + this.f40268d;
                return collection.size() > 0;
            default:
                list.addAll(i + i3, collection);
                int size = collection.size();
                this.f40268d += size;
                return size > 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        int i = this.f40265a;
        List list = this.f40266b;
        int i2 = this.f40267c;
        switch (i) {
            case 0:
                int i3 = this.f40268d - 1;
                if (i2 <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i2) {
                            i3--;
                        }
                    }
                }
                this.f40268d = i2;
                break;
            default:
                int i4 = this.f40268d - 1;
                if (i2 <= i4) {
                    while (true) {
                        list.remove(i4);
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                this.f40268d = i2;
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f40265a;
        List list = this.f40266b;
        int i2 = this.f40267c;
        switch (i) {
            case 0:
                int i3 = this.f40268d;
                while (i2 < i3) {
                    if (fa4.m11650l(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f40268d;
                while (i2 < i4) {
                    if (fa4.m11650l(list.get(i2), obj)) {
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f40265a) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f40265a;
        int i3 = this.f40267c;
        List list = this.f40266b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                break;
            default:
                y66.m24953a(i, this);
                break;
        }
        return list.get(i + i3);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int i = this.f40265a;
        List list = this.f40266b;
        int i2 = this.f40267c;
        switch (i) {
            case 0:
                int i3 = this.f40268d;
                for (int i4 = i2; i4 < i3; i4++) {
                    if (fa4.m11650l(list.get(i4), obj)) {
                        return i4 - i2;
                    }
                }
                return -1;
            default:
                int i5 = this.f40268d;
                for (int i6 = i2; i6 < i5; i6++) {
                    if (fa4.m11650l(list.get(i6), obj)) {
                        return i6 - i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f40265a) {
            case 0:
                return this.f40268d == this.f40267c;
            default:
                return this.f40268d == this.f40267c;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f40265a) {
            case 0:
                return new e66(0, 0, this);
            default:
                return new e66(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i = this.f40265a;
        List list = this.f40266b;
        int i2 = this.f40267c;
        switch (i) {
            case 0:
                int i3 = this.f40268d - 1;
                if (i2 > i3) {
                    return -1;
                }
                while (!fa4.m11650l(list.get(i3), obj)) {
                    if (i3 == i2) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i2;
            default:
                int i4 = this.f40268d - 1;
                if (i2 > i4) {
                    return -1;
                }
                while (!fa4.m11650l(list.get(i4), obj)) {
                    if (i4 == i2) {
                        return -1;
                    }
                    i4--;
                }
                return i4 - i2;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f40265a) {
            case 0:
                return new e66(0, 0, this);
            default:
                return new e66(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.f40265a;
        int i2 = this.f40267c;
        List list = this.f40266b;
        switch (i) {
            case 0:
                int i3 = this.f40268d;
                while (i2 < i3) {
                    if (fa4.m11650l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f40268d--;
                        return true;
                    }
                    i2++;
                }
                return false;
            default:
                int i4 = this.f40268d;
                while (i2 < i4) {
                    if (fa4.m11650l(list.get(i2), obj)) {
                        list.remove(i2);
                        this.f40268d--;
                        return true;
                    }
                    i2++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f40265a) {
            case 0:
                collection.getClass();
                int i = this.f40268d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i != this.f40268d;
            default:
                int i2 = this.f40268d;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i2 != this.f40268d;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.f40265a;
        int i2 = this.f40267c;
        List list = this.f40266b;
        switch (i) {
            case 0:
                collection.getClass();
                int i3 = this.f40268d;
                int i4 = i3 - 1;
                if (i2 <= i4) {
                    while (true) {
                        if (!collection.contains(list.get(i4))) {
                            list.remove(i4);
                            this.f40268d--;
                        }
                        if (i4 != i2) {
                            i4--;
                        }
                    }
                }
                return i3 != this.f40268d;
            default:
                int i5 = this.f40268d;
                int i6 = i5 - 1;
                if (i2 <= i6) {
                    while (true) {
                        if (!collection.contains(list.get(i6))) {
                            list.remove(i6);
                            this.f40268d--;
                        }
                        if (i6 != i2) {
                            i6--;
                        }
                    }
                }
                return i5 != this.f40268d;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2 = this.f40265a;
        int i3 = this.f40267c;
        List list = this.f40266b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                break;
            default:
                y66.m24953a(i, this);
                break;
        }
        return list.set(i + i3, obj);
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.f40265a) {
            case 0:
                i = this.f40268d;
                i2 = this.f40267c;
                break;
            default:
                i = this.f40268d;
                i2 = this.f40267c;
                break;
        }
        return i - i2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.f40265a) {
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
        switch (this.f40265a) {
            case 0:
                objArr.getClass();
                break;
        }
        return ss5.m21701a0(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f40265a) {
            case 0:
                break;
        }
        return ss5.m21699Z(this);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.f40265a) {
            case 0:
                return new e66(i, 0, this);
            default:
                return new e66(i, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i = this.f40265a;
        List list = this.f40266b;
        switch (i) {
            case 0:
                int i2 = this.f40268d;
                this.f40268d = i2 + 1;
                list.add(i2, obj);
                break;
            default:
                int i3 = this.f40268d;
                this.f40268d = i3 + 1;
                list.add(i3, obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i = this.f40265a;
        List list = this.f40266b;
        switch (i) {
            case 0:
                collection.getClass();
                list.addAll(this.f40268d, collection);
                this.f40268d = collection.size() + this.f40268d;
                return collection.size() > 0;
            default:
                list.addAll(this.f40268d, collection);
                int size = collection.size();
                this.f40268d += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2 = this.f40265a;
        int i3 = this.f40267c;
        List list = this.f40266b;
        switch (i2) {
            case 0:
                ip6.m14064a(i, this);
                Object objRemove = list.remove(i + i3);
                this.f40268d--;
                return objRemove;
            default:
                y66.m24953a(i, this);
                Object objRemove2 = list.remove(i + i3);
                this.f40268d--;
                return objRemove2;
        }
    }
}
