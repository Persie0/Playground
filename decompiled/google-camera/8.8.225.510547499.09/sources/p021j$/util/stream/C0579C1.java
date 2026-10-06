package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;
import p021j$.util.concurrent.ConcurrentHashMap;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.C1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0579C1 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: d */
    private static final Object f33289d = new Object();

    /* JADX INFO: renamed from: a */
    private final Spliterator f33290a;

    /* JADX INFO: renamed from: b */
    private final ConcurrentHashMap f33291b;

    /* JADX INFO: renamed from: c */
    private Object f33292c;

    C0579C1(Spliterator spliterator) {
        this(spliterator, new ConcurrentHashMap());
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f33292c = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX INFO: renamed from: b */
    final void m12611b(Consumer consumer, Object obj) {
        if (this.f33291b.putIfAbsent(obj != null ? obj : f33289d, Boolean.TRUE) == null) {
            consumer.accept(obj);
        }
    }

    @Override // p021j$.util.Spliterator
    public final int characteristics() {
        return (this.f33290a.characteristics() & (-16469)) | 1;
    }

    @Override // p021j$.util.Spliterator
    public final long estimateSize() {
        return this.f33290a.estimateSize();
    }

    @Override // p021j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        this.f33290a.forEachRemaining(new C0673i(3, this, consumer));
    }

    @Override // p021j$.util.Spliterator
    public final Comparator getComparator() {
        return this.f33290a.getComparator();
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        while (this.f33290a.tryAdvance(this)) {
            Object obj = this.f33292c;
            if (obj == null) {
                obj = f33289d;
            }
            if (this.f33291b.putIfAbsent(obj, Boolean.TRUE) == null) {
                consumer.accept(this.f33292c);
                this.f33292c = null;
                return true;
            }
        }
        return false;
    }

    @Override // p021j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.f33290a.trySplit();
        if (spliteratorTrySplit != null) {
            return new C0579C1(spliteratorTrySplit, this.f33291b);
        }
        return null;
    }

    private C0579C1(Spliterator spliterator, ConcurrentHashMap concurrentHashMap) {
        this.f33290a = spliterator;
        this.f33291b = concurrentHashMap;
    }
}
