package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.w */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0730w implements Spliterator.OfLong {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0731x f33542a;

    private /* synthetic */ C0730w(InterfaceC0731x interfaceC0731x) {
        this.f33542a = interfaceC0731x;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m12749a(InterfaceC0731x interfaceC0731x) {
        if (interfaceC0731x == null) {
            return null;
        }
        return interfaceC0731x instanceof C0729v ? ((C0729v) interfaceC0731x).f33541a : new C0730w(interfaceC0731x);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33542a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0731x interfaceC0731x = this.f33542a;
        if (obj instanceof C0730w) {
            obj = ((C0730w) obj).f33542a;
        }
        return interfaceC0731x.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33542a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f33542a.forEachRemaining((Object) longConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33542a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33542a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33542a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33542a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f33542a.tryAdvance((Object) longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfLong trySplit() {
        return m12749a(this.f33542a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33542a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33542a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0733z.m12751a(this.f33542a.trySplit());
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(LongConsumer longConsumer) {
        this.f33542a.forEachRemaining(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(LongConsumer longConsumer) {
        return this.f33542a.tryAdvance(longConsumer);
    }

    @Override // java.util.Spliterator.OfLong, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0500C.m12500a(this.f33542a.trySplit());
    }
}
