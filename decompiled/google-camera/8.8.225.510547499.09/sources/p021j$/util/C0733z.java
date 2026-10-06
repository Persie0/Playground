package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.z */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0733z implements Spliterator.OfPrimitive {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0498A f33544a;

    private /* synthetic */ C0733z(InterfaceC0498A interfaceC0498A) {
        this.f33544a = interfaceC0498A;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m12751a(InterfaceC0498A interfaceC0498A) {
        if (interfaceC0498A == null) {
            return null;
        }
        if (interfaceC0498A instanceof C0732y) {
            return ((C0732y) interfaceC0498A).f33543a;
        }
        if (interfaceC0498A instanceof InterfaceC0569r) {
            return C0568q.m12588a((InterfaceC0569r) interfaceC0498A);
        }
        if (interfaceC0498A instanceof InterfaceC0728u) {
            return C0727t.m12747a((InterfaceC0728u) interfaceC0498A);
        }
        return interfaceC0498A instanceof InterfaceC0731x ? C0730w.m12749a((InterfaceC0731x) interfaceC0498A) : new C0733z(interfaceC0498A);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33544a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0498A interfaceC0498A = this.f33544a;
        if (obj instanceof C0733z) {
            obj = ((C0733z) obj).f33544a;
        }
        return interfaceC0498A.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33544a.estimateSize();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f33544a.forEachRemaining(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33544a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33544a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33544a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33544a.hashCode();
    }

    @Override // java.util.Spliterator.OfPrimitive
    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f33544a.tryAdvance(obj);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return m12751a(this.f33544a.trySplit());
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33544a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33544a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator.OfPrimitive, java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return C0500C.m12500a(this.f33544a.trySplit());
    }
}
