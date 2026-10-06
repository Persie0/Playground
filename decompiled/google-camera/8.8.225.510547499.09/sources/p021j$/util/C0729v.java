package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0729v implements InterfaceC0731x {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfLong f33541a;

    private /* synthetic */ C0729v(Spliterator.OfLong ofLong) {
        this.f33541a = ofLong;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0731x m12748a(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C0730w ? ((C0730w) ofLong).f33542a : new C0729v(ofLong);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33541a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0729v) {
            obj = ((C0729v) obj).f33541a;
        }
        return this.f33541a.equals(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33541a.estimateSize();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33541a.forEachRemaining(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33541a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33541a.getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33541a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33541a.hashCode();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33541a.tryAdvance(obj);
    }

    @Override // p021j$.util.InterfaceC0731x, p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0731x trySplit() {
        return m12748a(this.f33541a.trySplit());
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33541a.forEachRemaining((Consumer<? super Long>) consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33541a.tryAdvance((Consumer<? super Long>) consumer);
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0498A trySplit() {
        return C0732y.m12750a(this.f33541a.trySplit());
    }

    @Override // p021j$.util.InterfaceC0731x
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f33541a.forEachRemaining(longConsumer);
    }

    @Override // p021j$.util.InterfaceC0731x
    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f33541a.tryAdvance(longConsumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0499B.m12499a(this.f33541a.trySplit());
    }
}
