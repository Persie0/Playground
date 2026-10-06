package p000;

import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsk implements InterleavedU8ClientAllocator {

    /* JADX INFO: renamed from: a */
    private final Object f44404a = new Object();

    /* JADX INFO: renamed from: b */
    private final Object f44405b = new Object();

    /* JADX INFO: renamed from: c */
    private long f44406c = 0;

    /* JADX INFO: renamed from: d */
    private final Map f44407d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final Map f44408e = new HashMap();

    /* JADX INFO: renamed from: f */
    private final Map f44409f = new HashMap();

    /* JADX INFO: renamed from: a */
    public final mrm m17645a(long j) {
        mrm mrmVarM16828h;
        synchronized (this.f44405b) {
            mrmVarM16828h = mrm.m16828h((InterleavedImageU8) this.f44409f.remove(Long.valueOf(j)));
        }
        return mrmVarM16828h;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        LongPair longPair;
        InterleavedImageU8 interleavedImageU8 = new InterleavedImageU8(i, i2, i3);
        InterleavedWriteViewU8 interleavedWriteViewU8M5006f = interleavedImageU8.m5006f();
        synchronized (this.f44404a) {
            long j = this.f44406c;
            this.f44406c = 1 + j;
            Map map = this.f44407d;
            Long lValueOf = Long.valueOf(j);
            map.put(lValueOf, interleavedImageU8);
            this.f44408e.put(lValueOf, interleavedWriteViewU8M5006f);
            longPair = new LongPair(j, InterleavedWriteViewU8.m5019a(interleavedWriteViewU8M5006f));
        }
        return longPair;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        Long lValueOf;
        InterleavedImageU8 interleavedImageU8;
        synchronized (this.f44404a) {
            Map map = this.f44407d;
            lValueOf = Long.valueOf(j);
            interleavedImageU8 = (InterleavedImageU8) map.remove(lValueOf);
            this.f44408e.remove(lValueOf);
        }
        interleavedImageU8.getClass();
        synchronized (this.f44405b) {
            this.f44409f.put(lValueOf, interleavedImageU8);
        }
    }
}
