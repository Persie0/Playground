package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.C */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0500C implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator f33110a;

    private /* synthetic */ C0500C(Spliterator spliterator) {
        this.f33110a = spliterator;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator m12500a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof C0499B) {
            return ((C0499B) spliterator).f33109a;
        }
        return spliterator instanceof InterfaceC0498A ? C0733z.m12751a((InterfaceC0498A) spliterator) : new C0500C(spliterator);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33110a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Spliterator spliterator = this.f33110a;
        if (obj instanceof C0500C) {
            obj = ((C0500C) obj).f33110a;
        }
        return spliterator.equals(obj);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33110a.estimateSize();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33110a.forEachRemaining(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33110a.getComparator();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33110a.getExactSizeIfKnown();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33110a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33110a.hashCode();
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33110a.tryAdvance(consumer);
    }

    @Override // java.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m12500a(this.f33110a.trySplit());
    }
}
