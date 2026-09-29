package jo;

import dm.C5201a;
import dm.C5207g;
import dm.C5213m;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C6744b;
import p100em.InterfaceC5429a;
import p260m8.C7499b;

/* JADX INFO: renamed from: jo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6532d<T> extends AbstractSet<T> {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f37193c = 0;

    /* JADX INFO: renamed from: a */
    public Object f37194a;

    /* JADX INFO: renamed from: b */
    public int f37195b;

    /* JADX INFO: renamed from: jo.d$a */
    public static final class a<T> implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final C5201a f37196a;

        public a(T[] tArr) {
            this.f37196a = C7499b.m14931b0(tArr);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f37196a.hasNext();
        }

        @Override // java.util.Iterator
        public final T next() {
            return (T) this.f37196a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: jo.d$b */
    public static final class b<T> implements Iterator<T>, InterfaceC5429a {

        /* JADX INFO: renamed from: a */
        public final T f37197a;

        /* JADX INFO: renamed from: b */
        public boolean f37198b = true;

        public b(T t10) {
            this.f37197a = t10;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f37198b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!this.f37198b) {
                throw new NoSuchElementException();
            }
            this.f37198b = false;
            return this.f37197a;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(T t10) {
        Object obj;
        int i10 = this.f37195b;
        if (i10 == 0) {
            this.f37194a = t10;
        } else if (i10 == 1) {
            if (C5207g.m11106a(this.f37194a, t10)) {
                return false;
            }
            this.f37194a = new Object[]{this.f37194a, t10};
        } else if (i10 < 5) {
            Object obj2 = this.f37194a;
            C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj2;
            if (C6744b.m13377i0(t10, objArr)) {
                return false;
            }
            int i11 = this.f37195b;
            if (i11 == 4) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                C5207g.m11111f(objArrCopyOf, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(C7499b.m14941g0(objArrCopyOf.length));
                C6744b.m13390v0(linkedHashSet, objArrCopyOf);
                linkedHashSet.add(t10);
                obj = linkedHashSet;
            } else {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i11 + 1);
                C5207g.m11110e(objArrCopyOf2, "copyOf(this, newSize)");
                objArrCopyOf2[objArrCopyOf2.length - 1] = t10;
                obj = objArrCopyOf2;
            }
            this.f37194a = obj;
        } else {
            Object obj3 = this.f37194a;
            C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!C5213m.m11199d(obj3).add(t10)) {
                return false;
            }
        }
        this.f37195b++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f37194a = null;
        this.f37195b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f37195b;
        if (i10 == 0) {
            return false;
        }
        if (i10 == 1) {
            return C5207g.m11106a(this.f37194a, obj);
        }
        if (i10 < 5) {
            Object obj2 = this.f37194a;
            C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return C6744b.m13377i0(obj, (Object[]) obj2);
        }
        Object obj3 = this.f37194a;
        C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<T> iterator() {
        int i10 = this.f37195b;
        if (i10 == 0) {
            return Collections.emptySet().iterator();
        }
        if (i10 == 1) {
            return new b(this.f37194a);
        }
        if (i10 < 5) {
            Object obj = this.f37194a;
            C5207g.m11109d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f37194a;
        C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return C5213m.m11199d(obj2).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f37195b;
    }
}
