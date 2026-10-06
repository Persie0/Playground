package p021j$.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.stream.Stream;

/* JADX INFO: renamed from: j$.util.Collection$-EL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class Collection$EL {
    public static void forEach(Collection collection, Consumer consumer) {
        if (collection instanceof InterfaceC0522c) {
            ((InterfaceC0522c) collection).forEach(consumer);
            return;
        }
        consumer.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static /* synthetic */ boolean removeIf(Collection collection, Predicate predicate) {
        return collection instanceof InterfaceC0522c ? ((InterfaceC0522c) collection).removeIf(predicate) : AbstractC0521b.m12530d(collection, predicate);
    }

    public static /* synthetic */ Stream stream(Collection collection) {
        return collection instanceof InterfaceC0522c ? ((InterfaceC0522c) collection).stream() : AbstractC0521b.m12535i(collection);
    }
}
