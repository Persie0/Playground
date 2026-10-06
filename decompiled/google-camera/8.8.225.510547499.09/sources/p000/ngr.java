package p000;

import java.util.Comparator;
import java.util.function.Consumer;
import p021j$.util.Spliterator;
import p021j$.util.Spliterators$AbstractSpliterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ngr extends Spliterators$AbstractSpliterator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ngs f42231a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ngr(ngs ngsVar, final long j) {
        this.f42231a = ngsVar;
        final int i = 16;
        new Spliterator<T>(j, i) { // from class: j$.util.Spliterators$AbstractSpliterator

            /* JADX INFO: renamed from: a */
            private final int f33155a;

            /* JADX INFO: renamed from: b */
            private long f33156b;

            /* JADX INFO: renamed from: c */
            private int f33157c;

            {
                this.f33156b = j;
                this.f33155a = (i & 64) != 0 ? i | 16384 : i;
            }

            @Override // p021j$.util.Spliterator
            public final int characteristics() {
                return this.f33155a;
            }

            @Override // p021j$.util.Spliterator
            public final long estimateSize() {
                return this.f33156b;
            }

            @Override // p021j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // p021j$.util.Spliterator
            public /* synthetic */ Comparator getComparator() {
                return Spliterator.CC.$default$getComparator(this);
            }

            @Override // p021j$.util.Spliterator
            public /* synthetic */ long getExactSizeIfKnown() {
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            }

            @Override // p021j$.util.Spliterator
            public /* synthetic */ boolean hasCharacteristics(int i2) {
                return Spliterator.CC.$default$hasCharacteristics(this, i2);
            }

            @Override // p021j$.util.Spliterator
            public final Spliterator trySplit() {
                C0507J c0507j = new C0507J();
                long j2 = this.f33156b;
                if (j2 <= 1 || !tryAdvance(c0507j)) {
                    return null;
                }
                int i2 = this.f33157c + 1024;
                if (i2 > j2) {
                    i2 = (int) j2;
                }
                if (i2 > 33554432) {
                    i2 = 33554432;
                }
                Object[] objArr = new Object[i2];
                int i3 = 0;
                do {
                    objArr[i3] = c0507j.f33132a;
                    i3++;
                    if (i3 >= i2) {
                        break;
                    }
                } while (tryAdvance(c0507j));
                this.f33157c = i3;
                long j3 = this.f33156b;
                if (j3 != Long.MAX_VALUE) {
                    this.f33156b = j3 - ((long) i3);
                }
                return new C0508K(objArr, 0, i3, this.f33155a);
            }
        };
    }

    @Override // p021j$.util.Spliterators$AbstractSpliterator, p021j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Spliterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // p021j$.util.Spliterators$AbstractSpliterator, p021j$.util.Spliterator
    public final /* synthetic */ Comparator getComparator() {
        return Spliterator.CC.$default$getComparator(this);
    }

    @Override // p021j$.util.Spliterators$AbstractSpliterator, p021j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return Spliterator.CC.$default$getExactSizeIfKnown(this);
    }

    @Override // p021j$.util.Spliterators$AbstractSpliterator, p021j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return Spliterator.CC.$default$hasCharacteristics(this, i);
    }

    @Override // p021j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        ngs ngsVar = this.f42231a;
        if (!ngsVar.f42234c.tryAdvance(ngsVar.f42232a) || !ngsVar.f42235d.tryAdvance(ngsVar.f42233b)) {
            return false;
        }
        ngs ngsVar2 = this.f42231a;
        consumer.accept(ngu.m17470e(ngsVar2.f42232a.f42228a, ngsVar2.f42233b.f42228a));
        return true;
    }
}
