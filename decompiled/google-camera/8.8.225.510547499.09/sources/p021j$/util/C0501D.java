package p021j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.D */
/* JADX INFO: loaded from: classes3.dex */
final class C0501D implements Iterator, Consumer {

    /* JADX INFO: renamed from: a */
    boolean f33111a = false;

    /* JADX INFO: renamed from: b */
    Object f33112b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Spliterator f33113c;

    C0501D(Spliterator spliterator) {
        this.f33113c = spliterator;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33111a = true;
        this.f33112b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33111a) {
            this.f33113c.tryAdvance(this);
        }
        return this.f33111a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f33111a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33111a = false;
        return this.f33112b;
    }
}
