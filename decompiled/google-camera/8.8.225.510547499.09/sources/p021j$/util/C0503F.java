package p021j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.F */
/* JADX INFO: loaded from: classes3.dex */
final class C0503F implements InterfaceC0565n, LongConsumer, InterfaceC0559h {

    /* JADX INFO: renamed from: a */
    boolean f33122a = false;

    /* JADX INFO: renamed from: b */
    long f33123b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC0731x f33124c;

    C0503F(InterfaceC0731x interfaceC0731x) {
        this.f33124c = interfaceC0731x;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f33122a = true;
        this.f33123b = j;
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }

    @Override // java.util.Iterator, p021j$.util.InterfaceC0559h
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            LongConsumer longConsumer = (LongConsumer) consumer;
            longConsumer.getClass();
            while (hasNext()) {
                if (!this.f33122a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f33122a = false;
                longConsumer.accept(this.f33123b);
            }
            return;
        }
        consumer.getClass();
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0503F.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        while (hasNext()) {
            if (!this.f33122a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.f33122a = false;
            consumer.accept(Long.valueOf(this.f33123b));
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33122a) {
            this.f33124c.tryAdvance((LongConsumer) this);
        }
        return this.f33122a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0503F.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }
        if (!this.f33122a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33122a = false;
        return Long.valueOf(this.f33123b);
    }
}
