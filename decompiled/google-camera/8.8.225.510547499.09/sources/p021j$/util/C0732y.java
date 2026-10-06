package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0732y implements InterfaceC0498A {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator.OfPrimitive f33543a;

    private /* synthetic */ C0732y(Spliterator.OfPrimitive ofPrimitive) {
        this.f33543a = ofPrimitive;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC0498A m12750a(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        if (ofPrimitive instanceof C0733z) {
            return ((C0733z) ofPrimitive).f33544a;
        }
        if (ofPrimitive instanceof Spliterator.OfDouble) {
            return C0567p.m12587a((Spliterator.OfDouble) ofPrimitive);
        }
        if (ofPrimitive instanceof Spliterator.OfInt) {
            return C0570s.m12589a((Spliterator.OfInt) ofPrimitive);
        }
        return ofPrimitive instanceof Spliterator.OfLong ? C0729v.m12748a((Spliterator.OfLong) ofPrimitive) : new C0732y(ofPrimitive);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33543a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0732y) {
            obj = ((C0732y) obj).f33543a;
        }
        return this.f33543a.equals(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33543a.estimateSize();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33543a.forEachRemaining(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33543a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33543a.getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33543a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33543a.hashCode();
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33543a.tryAdvance(obj);
    }

    @Override // p021j$.util.InterfaceC0498A, p021j$.util.Spliterator
    public final /* synthetic */ InterfaceC0498A trySplit() {
        return m12750a(this.f33543a.trySplit());
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33543a.forEachRemaining(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33543a.tryAdvance(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0499B.m12499a(this.f33543a.trySplit());
    }
}
