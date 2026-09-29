package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7165o<T> {
    private volatile AtomicReferenceArray<T> array;

    public C7165o(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* JADX INFO: renamed from: a */
    public final int m14462a() {
        return this.array.length();
    }

    /* JADX INFO: renamed from: b */
    public final T m14463b(int i10) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m14464c(int i10, CoroutineScheduler.C7176b c7176b) {
        AtomicReferenceArray<T> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, c7176b);
            return;
        }
        int i11 = i10 + 1;
        int i12 = length * 2;
        if (i11 < i12) {
            i11 = i12;
        }
        AtomicReferenceArray<T> atomicReferenceArray2 = new AtomicReferenceArray<>(i11);
        for (int i13 = 0; i13 < length; i13++) {
            atomicReferenceArray2.set(i13, atomicReferenceArray.get(i13));
        }
        atomicReferenceArray2.set(i10, c7176b);
        this.array = atomicReferenceArray2;
    }
}
