package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.p */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0567p implements InterfaceC0569r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfDouble f33275a;

    private /* synthetic */ C0567p(Spliterator.OfDouble ofDouble) {
        this.f33275a = ofDouble;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0569r m12587a(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C0568q ? ((C0568q) ofDouble).f33276a : new C0567p(ofDouble);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33275a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0567p) {
            obj = ((C0567p) obj).f33275a;
        }
        return this.f33275a.equals(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33275a.estimateSize();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33275a.forEachRemaining(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33275a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33275a.getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33275a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33275a.hashCode();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33275a.tryAdvance(obj);
    }

    @Override // p021j$.util.InterfaceC0569r, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0569r trySplit() {
        return m12587a(this.f33275a.trySplit());
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33275a.forEachRemaining((Consumer<? super Double>) consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33275a.tryAdvance((Consumer<? super Double>) consumer);
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0498A trySplit() {
        return C0732y.m12750a(this.f33275a.trySplit());
    }

    @Override // p021j$.util.InterfaceC0569r
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f33275a.forEachRemaining(doubleConsumer);
    }

    @Override // p021j$.util.InterfaceC0569r
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f33275a.tryAdvance(doubleConsumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0499B.m12499a(this.f33275a.trySplit());
    }
}
