package p021j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import p021j$.util.stream.Stream;
import p021j$.util.stream.StreamSupport;

/* JADX INFO: renamed from: j$.util.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0521b {
    /* JADX INFO: renamed from: a */
    public static void m12527a(InterfaceC0569r interfaceC0569r, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC0569r.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (AbstractC0519W.f33172a) {
                AbstractC0519W.m12525a(interfaceC0569r.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            interfaceC0569r.forEachRemaining((DoubleConsumer) new C0560i(consumer));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12528b(InterfaceC0728u interfaceC0728u, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            interfaceC0728u.forEachRemaining((IntConsumer) consumer);
        } else {
            if (AbstractC0519W.f33172a) {
                AbstractC0519W.m12525a(interfaceC0728u.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            interfaceC0728u.forEachRemaining((IntConsumer) new C0562k(consumer));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m12529c(InterfaceC0731x interfaceC0731x, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            interfaceC0731x.forEachRemaining((LongConsumer) consumer);
        } else {
            if (AbstractC0519W.f33172a) {
                AbstractC0519W.m12525a(interfaceC0731x.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
            interfaceC0731x.forEachRemaining((LongConsumer) new C0564m(consumer));
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m12530d(Collection collection, Predicate predicate) {
        if (DesugarCollections.f33114a.isInstance(collection)) {
            return DesugarCollections.m12503c(collection, predicate);
        }
        predicate.getClass();
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static Spliterator m12531e(Collection collection) {
        collection.getClass();
        return new C0515S(collection, 0);
    }

    /* JADX INFO: renamed from: f */
    public static Spliterator m12532f(List list) {
        if (list instanceof RandomAccess) {
            return new C0520a(list);
        }
        list.getClass();
        return new C0515S(list, 16);
    }

    /* JADX INFO: renamed from: g */
    public static Spliterator m12533g(Set set) {
        set.getClass();
        return new C0515S(set, 1);
    }

    /* JADX INFO: renamed from: h */
    public static Spliterator m12534h(SortedSet sortedSet) {
        return new C0566o(sortedSet, sortedSet);
    }

    /* JADX INFO: renamed from: i */
    public static Stream m12535i(Collection collection) {
        Spliterator c0515s;
        if (collection instanceof InterfaceC0522c) {
            c0515s = ((InterfaceC0522c) collection).spliterator();
        } else if (collection instanceof LinkedHashSet) {
            c0515s = m12539m((LinkedHashSet) collection);
        } else if (collection instanceof SortedSet) {
            c0515s = m12534h((SortedSet) collection);
        } else if (collection instanceof Set) {
            c0515s = m12533g((Set) collection);
        } else if (collection instanceof List) {
            c0515s = m12532f((List) collection);
        } else {
            collection.getClass();
            c0515s = new C0515S(collection, 0);
        }
        return StreamSupport.stream(c0515s, false);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m12536j(InterfaceC0569r interfaceC0569r, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return interfaceC0569r.tryAdvance((DoubleConsumer) consumer);
        }
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(interfaceC0569r.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC0569r.tryAdvance((DoubleConsumer) new C0560i(consumer));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m12537k(InterfaceC0728u interfaceC0728u, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return interfaceC0728u.tryAdvance((IntConsumer) consumer);
        }
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(interfaceC0728u.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC0728u.tryAdvance((IntConsumer) new C0562k(consumer));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m12538l(InterfaceC0731x interfaceC0731x, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return interfaceC0731x.tryAdvance((LongConsumer) consumer);
        }
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(interfaceC0731x.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return interfaceC0731x.tryAdvance((LongConsumer) new C0564m(consumer));
    }

    /* JADX INFO: renamed from: m */
    public static Spliterator m12539m(LinkedHashSet linkedHashSet) {
        linkedHashSet.getClass();
        return new C0515S(linkedHashSet, 17);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        obj.getClass();
    }

    public boolean tryAdvance(Object obj) {
        obj.getClass();
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
