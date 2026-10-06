package p000;

import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsm implements InterleavedU8ClientAllocator {

    /* JADX INFO: renamed from: a */
    private final long f44414a;

    /* JADX INFO: renamed from: b */
    private final long f44415b;

    /* JADX INFO: renamed from: c */
    private HardwareBuffer f44416c;

    /* JADX INFO: renamed from: d */
    private LockedHardwareBuffer f44417d;

    public nsm(long j, long j2) {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
        lku.m15670x(true, "allocateUsage must contain USAGE_CPU_WRITE_RARELY.");
        lku.m15670x(true, "lockUsage must contain USAGE_CPU_WRITE_RARELY.");
        this.f44414a = j;
        this.f44415b = j2;
    }

    /* JADX INFO: renamed from: a */
    public final HardwareBuffer m17646a() {
        boolean z = false;
        if (this.f44416c != null && this.f44417d == null) {
            z = true;
        }
        lku.m15614I(z, "doneWriting() must be called before getImage.");
        return this.f44416c;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        lku.m15608C(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueHardwareBufferInterleavedU8ClientAllocator only supports %s.", i3, 4);
        lku.m15614I(this.f44416c == null, "allocate() should be called at most once.");
        HardwareBuffer hardwareBufferCreate = HardwareBuffer.create(i, i2, 1, 1, this.f44414a);
        this.f44416c = hardwareBufferCreate;
        this.f44417d = LockedHardwareBuffer.m5040c(hardwareBufferCreate, this.f44415b);
        return new LongPair(0L, InterleavedWriteViewU8.m5019a(this.f44417d.m5042b()));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44416c != null, "doneWriting() was called before allocate().");
        lku.m15614I(this.f44417d != null, "doneWriting() was called more than once.");
        this.f44417d.close();
        this.f44417d = null;
    }
}
