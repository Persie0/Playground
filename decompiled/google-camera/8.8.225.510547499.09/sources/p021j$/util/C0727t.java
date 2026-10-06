package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.t */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0727t implements Spliterator.OfInt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0728u f33540a;

    private /* synthetic */ C0727t(InterfaceC0728u interfaceC0728u) {
        this.f33540a = interfaceC0728u;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfInt m12747a(InterfaceC0728u interfaceC0728u) {
        if (interfaceC0728u == null) {
            return null;
        }
        return interfaceC0728u instanceof C0570s ? ((C0570s) interfaceC0728u).f33277a : new C0727t(interfaceC0728u);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33540a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0728u interfaceC0728u = this.f33540a;
        if (obj instanceof C0727t) {
            obj = ((C0727t) obj).f33540a;
        }
        return interfaceC0728u.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33540a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f33540a.forEachRemaining((Object) intConsumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33540a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33540a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33540a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33540a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f33540a.tryAdvance((Object) intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfInt trySplit() {
        return m12747a(this.f33540a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33540a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33540a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return C0733z.m12751a(this.f33540a.trySplit());
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: forEachRemaining, reason: avoid collision after fix types in other method */
    public final /* synthetic */ void forEachRemaining2(IntConsumer intConsumer) {
        this.f33540a.forEachRemaining(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt
    /* JADX INFO: renamed from: tryAdvance, reason: avoid collision after fix types in other method */
    public final /* synthetic */ boolean tryAdvance2(IntConsumer intConsumer) {
        return this.f33540a.tryAdvance(intConsumer);
    }

    @Override // java.util.Spliterator.OfInt, java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0500C.m12500a(this.f33540a.trySplit());
    }
}
