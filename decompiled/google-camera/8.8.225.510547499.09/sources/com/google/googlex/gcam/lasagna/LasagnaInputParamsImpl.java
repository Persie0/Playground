package com.google.googlex.gcam.lasagna;

import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.RawWriteView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.lku;
import p000.ntv;
import p000.ntx;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class LasagnaInputParamsImpl implements ntx {

    /* JADX INFO: renamed from: a */
    private static final AtomicBoolean f8403a = new AtomicBoolean();

    /* JADX INFO: renamed from: b */
    private long f8404b;

    public LasagnaInputParamsImpl(long j, long j2, long j3, long j4, List list, int i) {
        if (!f8403a.getAndSet(true)) {
            init();
        }
        lku.m15670x(j != 0, "staticMetadataPtr is 0.");
        lku.m15670x(j2 != 0, "shotParamsPtr is 0.");
        lku.m15670x(j3 != 0, "shotMetadataPtr is 0.");
        lku.m15670x(j4 != 0, "rawImagePlanarWriteView16Ptr is 0.");
        int size = list.size();
        long[] jArr = new long[size];
        long[] jArr2 = new long[size];
        long[] jArr3 = new long[size];
        Runnable[] runnableArr = new Runnable[size];
        for (int i2 = 0; i2 < size; i2++) {
            ntv ntvVar = (ntv) list.get(i2);
            jArr[i2] = ntvVar.f44592c.f8362a;
            jArr2[i2] = FrameMetadata.m4951b(ntvVar.f44591b);
            jArr3[i2] = RawWriteView.m5092c(ntvVar.f44590a);
            runnableArr[i2] = ntvVar.f44593d;
        }
        long jAlloc = alloc(j, j2, j3, j4, jArr3, jArr2, jArr, runnableArr, i);
        lku.m15614I(jAlloc != 0, "alloc() failed!");
        this.f8404b = jAlloc;
    }

    private static native long alloc(long j, long j2, long j3, long j4, long[] jArr, long[] jArr2, long[] jArr3, Runnable[] runnableArr, int i);

    private static native void dealloc(long j);

    private static native void init();

    @Override // p000.ntx
    /* JADX INFO: renamed from: a */
    public final synchronized long mo5161a() {
        return this.f8404b;
    }

    @Override // p000.ntx
    /* JADX INFO: renamed from: b */
    public final synchronized void mo5162b() {
        dealloc(this.f8404b);
        this.f8404b = 0L;
    }
}
