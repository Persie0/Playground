package p021j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.E */
/* JADX INFO: loaded from: classes3.dex */
final class C0502E implements InterfaceC0563l, IntConsumer, InterfaceC0559h {

    /* JADX INFO: renamed from: a */
    boolean f33119a = false;

    /* JADX INFO: renamed from: b */
    int f33120b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC0728u f33121c;

    C0502E(InterfaceC0728u interfaceC0728u) {
        this.f33121c = interfaceC0728u;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f33119a = true;
        this.f33120b = i;
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }

    @Override // java.util.Iterator, p021j$.util.InterfaceC0559h
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            IntConsumer intConsumer = (IntConsumer) consumer;
            intConsumer.getClass();
            while (hasNext()) {
                if (!this.f33119a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f33119a = false;
                intConsumer.accept(this.f33120b);
            }
            return;
        }
        consumer.getClass();
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0502E.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        while (hasNext()) {
            if (!this.f33119a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.f33119a = false;
            consumer.accept(Integer.valueOf(this.f33120b));
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33119a) {
            this.f33121c.tryAdvance((IntConsumer) this);
        }
        return this.f33119a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0502E.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }
        if (!this.f33119a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33119a = false;
        return Integer.valueOf(this.f33120b);
    }
}
