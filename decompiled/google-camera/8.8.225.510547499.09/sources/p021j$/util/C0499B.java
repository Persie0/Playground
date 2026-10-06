package p021j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.B */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0499B implements Spliterator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Spliterator f33109a;

    private /* synthetic */ C0499B(Spliterator spliterator) {
        this.f33109a = spliterator;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Spliterator m12499a(Spliterator spliterator) {
        if (spliterator == null) {
            return null;
        }
        if (spliterator instanceof C0500C) {
            return ((C0500C) spliterator).f33110a;
        }
        return spliterator instanceof Spliterator.OfPrimitive ? C0732y.m12750a((Spliterator.OfPrimitive) spliterator) : new C0499B(spliterator);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ int characteristics() {
        return this.f33109a.characteristics();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        if (obj instanceof C0499B) {
            obj = ((C0499B) obj).f33109a;
        }
        return this.f33109a.equals(obj);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long estimateSize() {
        return this.f33109a.estimateSize();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f33109a.forEachRemaining(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return this.f33109a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f33109a.getExactSizeIfKnown();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f33109a.hasCharacteristics(i);
    }

    public final /* synthetic */ int hashCode() {
        return this.f33109a.hashCode();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f33109a.tryAdvance(consumer);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ Spliterator trySplit() {
        return m12499a(this.f33109a.trySplit());
    }
}
