package p000;

import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nso implements InterleavedU8ClientAllocator {

    /* JADX INFO: renamed from: a */
    public InterleavedImageU8 f44421a;

    /* JADX INFO: renamed from: b */
    public boolean f44422b = false;

    /* JADX INFO: renamed from: c */
    private InterleavedWriteViewU8 f44423c;

    public nso() {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        lku.m15614I(this.f44421a == null, "allocate() should be called at most once.");
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        this.f44421a = interleavedImageU8;
        this.f44423c = interleavedImageU8.m5006f();
        return new LongPair(0L, InterleavedWriteViewU8.m5019a(this.f44423c));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44421a != null, "doneWriting() was called before allocate().");
        lku.m15614I(!this.f44422b, "doneWriting() should be called at most once.");
        this.f44422b = true;
    }
}
