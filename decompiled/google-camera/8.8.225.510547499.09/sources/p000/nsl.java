package p000;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;
import com.google.googlex.gcam.base.LongPair;
import com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nsl implements InterleavedU8ClientAllocator {

    /* JADX INFO: renamed from: c */
    private static final Bitmap.Config f44410c = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a */
    public Bitmap f44411a;

    /* JADX INFO: renamed from: b */
    public nrs f44412b;

    /* JADX INFO: renamed from: d */
    private final DisplayMetrics f44413d;

    public nsl(DisplayMetrics displayMetrics) {
        lku.m15669w(GcamModuleJNI.kInvalidAllocationId_get() != 0);
        this.f44413d = displayMetrics;
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final LongPair allocate(int i, int i2, int i3) {
        lku.m15608C(i3 == 4, "Server requested an InterleavedImageU8 of %s channels, but UniqueBitmapClientAllocator only supports %s.", i3, 4);
        lku.m15614I(this.f44411a == null, "allocate() should be called at most once.");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f44413d, i, i2, f44410c);
        this.f44411a = bitmapCreateBitmap;
        this.f44412b = nrs.m17633a(bitmapCreateBitmap);
        return new LongPair(0L, InterleavedWriteViewU8.m5019a(this.f44412b.f44286a));
    }

    @Override // com.google.googlex.gcam.clientallocator.InterleavedU8ClientAllocator
    public final void doneWriting(long j) {
        lku.m15669w(j == 0);
        lku.m15614I(this.f44411a != null, "doneWriting() was called before allocate().");
        lku.m15614I(this.f44412b != null, VCYBIzY.AFuybfiuY);
        this.f44412b.close();
        this.f44412b = null;
    }
}
