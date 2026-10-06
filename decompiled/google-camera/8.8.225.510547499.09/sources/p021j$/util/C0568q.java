package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0568q implements Spliterator.OfDouble {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0569r f33276a;

    private /* synthetic */ C0568q(InterfaceC0569r interfaceC0569r) {
        this.f33276a = interfaceC0569r;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m12588a(InterfaceC0569r interfaceC0569r) {
        if (interfaceC0569r == null) {
            return null;
        }
        return interfaceC0569r instanceof C0567p ? ((C0567p) interfaceC0569r).f33275a : new C0568q(interfaceC0569r);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33276a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0569r interfaceC0569r = this.f33276a;
        if (obj instanceof C0568q) {
            obj = ((C0568q) obj).f33276a;
        }
        return interfaceC0569r.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33276a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f33276a.forEachRemaining((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33276a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33276a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33276a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33276a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f33276a.tryAdvance((Object) doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfDouble trySplit() {
        return m12588a(this.f33276a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33276a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33276a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0733z.m12751a(this.f33276a.trySplit());
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(DoubleConsumer doubleConsumer) {
        this.f33276a.forEachRemaining(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(DoubleConsumer doubleConsumer) {
        return this.f33276a.tryAdvance(doubleConsumer);
    }

    @Override // java.util.Spliterator.OfDouble, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0500C.m12500a(this.f33276a.trySplit());
    }
}
