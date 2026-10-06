package p021j$.util.concurrent;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0522c;
import p021j$.util.Spliterator;
import p021j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.concurrent.e */
/* JADX INFO: loaded from: classes3.dex */
final class C0527e extends AbstractC0524b implements Set, InterfaceC0522c {
    C0527e(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return this.f33201a.m12554g(entry.getKey(), entry.getValue(), false) == null;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (this.f33201a.m12554g(entry.getKey(), entry.getValue(), false) == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map.Entry entry;
        Object key;
        Object obj2;
        Object value;
        return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.f33201a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
    }

    @Override // java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final void forEach(Consumer consumer) {
        consumer.getClass();
        C0533k[] c0533kArr = this.f33201a.f33185a;
        if (c0533kArr == null) {
            return;
        }
        C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
        while (true) {
            C0533k c0533kM12566a = c0538p.m12566a();
            if (c0533kM12566a == null) {
                return;
            } else {
                consumer.accept(new C0532j(c0533kM12566a.f33212b, c0533kM12566a.f33213c, this.f33201a));
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        C0533k[] c0533kArr = this.f33201a.f33185a;
        int iHashCode = 0;
        if (c0533kArr != null) {
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                iHashCode += c0533kM12566a.hashCode();
            }
        }
        return iHashCode;
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f33201a;
        C0533k[] c0533kArr = concurrentHashMap.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        return new C0526d(c0533kArr, length, length, concurrentHashMap);
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.f33201a.remove(key, value);
    }

    @Override // java.util.Collection, p021j$.util.InterfaceC0522c
    public final boolean removeIf(Predicate predicate) {
        ConcurrentHashMap concurrentHashMap = this.f33201a;
        concurrentHashMap.getClass();
        predicate.getClass();
        C0533k[] c0533kArr = concurrentHashMap.f33185a;
        boolean z = false;
        if (c0533kArr != null) {
            C0538p c0538p = new C0538p(c0533kArr, c0533kArr.length, 0, c0533kArr.length);
            while (true) {
                C0533k c0533kM12566a = c0538p.m12566a();
                if (c0533kM12566a == null) {
                    break;
                }
                Object obj = c0533kM12566a.f33212b;
                Object obj2 = c0533kM12566a.f33213c;
                if (predicate.test(new AbstractMap.SimpleImmutableEntry(obj, obj2)) && concurrentHashMap.m12555h(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f33201a;
        long jM12556k = concurrentHashMap.m12556k();
        C0533k[] c0533kArr = concurrentHashMap.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        return new C0528f(c0533kArr, length, 0, length, jM12556k >= 0 ? jM12556k : 0L, concurrentHashMap);
    }

    @Override // java.util.Collection, p021j$.util.InterfaceC0522c
    public final /* synthetic */ Stream stream() {
        return AbstractC0521b.m12535i(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }
}
