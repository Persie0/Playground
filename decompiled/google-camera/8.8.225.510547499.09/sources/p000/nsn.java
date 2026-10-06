package p000;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU16;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsn implements InterleavedU16ClientAllocator {

    /* JADX INFO: renamed from: a */
    public InterleavedImageU16 f44418a;

    /* JADX INFO: renamed from: b */
    public boolean f44419b = false;

    /* JADX INFO: renamed from: c */
    private InterleavedWriteViewU16 f44420c;

    public nsn() {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        lku.m15614I(this.f44418a == null, "allocate() should be called at most once.");
        InterleavedImageU16 interleavedImageU16 = new InterleavedImageU16(GcamModuleJNI.new_InterleavedImageU16__SWIG_1(i, i2, i3));
        this.f44418a = interleavedImageU16;
        this.f44420c = new InterleavedWriteViewU16(GcamModuleJNI.InterleavedImageU16_write_view(interleavedImageU16.f8294a, interleavedImageU16));
        InterleavedWriteViewU16 interleavedWriteViewU16 = this.f44420c;
        return new LongPair(0L, interleavedWriteViewU16 == null ? 0L : interleavedWriteViewU16.f8302a);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU16ClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44418a != null, "doneWriting() was called before allocate().");
        lku.m15614I(!this.f44419b, "doneWriting() should be called at most once.");
        this.f44419b = true;
    }
}
