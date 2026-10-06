package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oxv {
    public volatile AtomicReferenceArray array;

    public oxv(int i) {
        this.array = new AtomicReferenceArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final Object m19152a(int i) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m19153b(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, obj);
            return;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(ook.m18789c(i + 1, length + length));
        for (int i2 = 0; i2 < length; i2++) {
            atomicReferenceArray2.set(i2, atomicReferenceArray.get(i2));
        }
        atomicReferenceArray2.set(i, obj);
        this.array = atomicReferenceArray2;
    }
}
