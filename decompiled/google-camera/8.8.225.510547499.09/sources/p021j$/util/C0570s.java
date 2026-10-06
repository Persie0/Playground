package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.s */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0570s implements InterfaceC0728u {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfInt f33277a;

    private /* synthetic */ C0570s(Spliterator.OfInt ofInt) {
        this.f33277a = ofInt;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0728u m12589a(Spliterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C0727t ? ((C0727t) ofInt).f33540a : new C0570s(ofInt);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33277a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0570s) {
            obj = ((C0570s) obj).f33277a;
        }
        return this.f33277a.equals(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33277a.estimateSize();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33277a.forEachRemaining(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33277a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33277a.getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33277a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33277a.hashCode();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33277a.tryAdvance(obj);
    }

    @Override // p021j$.util.InterfaceC0728u, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0728u trySplit() {
        return m12589a(this.f33277a.trySplit());
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33277a.forEachRemaining((Consumer<? super Integer>) consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33277a.tryAdvance((Consumer<? super Integer>) consumer);
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0498A trySplit() {
        return C0732y.m12750a(this.f33277a.trySplit());
    }

    @Override // p021j$.util.InterfaceC0728u
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f33277a.forEachRemaining(intConsumer);
    }

    @Override // p021j$.util.InterfaceC0728u
    public final /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return this.f33277a.tryAdvance(intConsumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0499B.m12499a(this.f33277a.trySplit());
    }
}
