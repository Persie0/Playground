package p021j$.util.concurrent;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import p021j$.util.AbstractC0521b;
import p021j$.util.InterfaceC0522c;
import p021j$.util.Spliterator;
import p021j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.concurrent.s */
/* JADX INFO: loaded from: classes3.dex */
final class C0541s extends AbstractC0524b implements InterfaceC0522c {
    C0541s(ConcurrentHashMap concurrentHashMap) {
        super(concurrentHashMap);
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33201a.containsValue(obj);
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
                consumer.accept(c0533kM12566a.f33213c);
            }
        }
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ConcurrentHashMap concurrentHashMap = this.f33201a;
        C0533k[] c0533kArr = concurrentHashMap.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        return new C0530h(c0533kArr, length, length, concurrentHashMap, 1);
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        AbstractC0523a abstractC0523a;
        if (obj == null) {
            return false;
        }
        Object it = iterator();
        do {
            abstractC0523a = (AbstractC0523a) it;
            if (!abstractC0523a.hasNext()) {
                return false;
            }
        } while (!obj.equals(((C0530h) it).next()));
        abstractC0523a.remove();
        return true;
    }

    @Override // p021j$.util.concurrent.AbstractC0524b, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Object it = iterator();
        boolean z = false;
        while (true) {
            AbstractC0523a abstractC0523a = (AbstractC0523a) it;
            if (!abstractC0523a.hasNext()) {
                return z;
            }
            if (collection.contains(((C0530h) it).next())) {
                abstractC0523a.remove();
                z = true;
            }
        }
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
                if (predicate.test(obj2) && concurrentHashMap.m12555h(obj, null, obj2) != null) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.lang.Iterable, p021j$.lang.InterfaceC0305a
    public final Spliterator spliterator() {
        ConcurrentHashMap concurrentHashMap = this.f33201a;
        long jM12556k = concurrentHashMap.m12556k();
        C0533k[] c0533kArr = concurrentHashMap.f33185a;
        int length = c0533kArr == null ? 0 : c0533kArr.length;
        return new C0531i(c0533kArr, length, 0, length, jM12556k >= 0 ? jM12556k : 0L, 1);
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
