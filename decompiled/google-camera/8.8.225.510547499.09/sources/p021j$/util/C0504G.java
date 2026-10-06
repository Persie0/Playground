package p021j$.util;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p021j$.util.function.C0551c;

/* JADX INFO: renamed from: j$.util.G */
/* JADX INFO: loaded from: classes3.dex */
final class C0504G implements InterfaceC0561j, DoubleConsumer, InterfaceC0559h {

    /* JADX INFO: renamed from: a */
    boolean f33125a = false;

    /* JADX INFO: renamed from: b */
    double f33126b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ InterfaceC0569r f33127c;

    C0504G(InterfaceC0569r interfaceC0569r) {
        this.f33127c = interfaceC0569r;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f33125a = true;
        this.f33126b = d;
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0551c(this, doubleConsumer);
    }

    @Override // java.util.Iterator, p021j$.util.InterfaceC0559h
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) consumer;
            doubleConsumer.getClass();
            while (hasNext()) {
                if (!this.f33125a && !hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f33125a = false;
                doubleConsumer.accept(this.f33126b);
            }
            return;
        }
        consumer.getClass();
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0504G.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        while (hasNext()) {
            if (!this.f33125a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.f33125a = false;
            consumer.accept(Double.valueOf(this.f33126b));
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f33125a) {
            this.f33127c.tryAdvance((DoubleConsumer) this);
        }
        return this.f33125a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (AbstractC0519W.f33172a) {
            AbstractC0519W.m12525a(C0504G.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        if (!this.f33125a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.f33125a = false;
        return Double.valueOf(this.f33126b);
    }
}
