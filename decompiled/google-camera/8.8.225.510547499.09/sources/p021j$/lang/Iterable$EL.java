package p021j$.lang;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;
import p021j$.util.AbstractC0517U;
import p021j$.util.AbstractC0521b;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Iterable$EL {
    /* JADX INFO: renamed from: a */
    public static void m12057a(Iterable iterable, Consumer consumer) {
        if (iterable instanceof InterfaceC0305a) {
            ((InterfaceC0305a) iterable).forEach(consumer);
            return;
        }
        if (iterable instanceof Collection) {
            consumer.getClass();
            Iterator it = ((Collection) iterable).iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
            return;
        }
        consumer.getClass();
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            consumer.accept(it2.next());
        }
    }

    public static Spliterator spliterator(Iterable iterable) {
        if (iterable instanceof InterfaceC0305a) {
            return ((InterfaceC0305a) iterable).spliterator();
        }
        if (iterable instanceof LinkedHashSet) {
            return AbstractC0521b.m12539m((LinkedHashSet) iterable);
        }
        if (iterable instanceof SortedSet) {
            return AbstractC0521b.m12534h((SortedSet) iterable);
        }
        if (iterable instanceof Set) {
            return AbstractC0521b.m12533g((Set) iterable);
        }
        if (iterable instanceof List) {
            return AbstractC0521b.m12532f((List) iterable);
        }
        return iterable instanceof Collection ? AbstractC0521b.m12531e((Collection) iterable) : AbstractC0517U.m12524n(iterable.iterator());
    }
}
