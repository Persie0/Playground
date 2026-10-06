package p000;

import android.graphics.Bitmap;
import com.google.googlex.gcam.AndroidJniUtils;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InterleavedWriteViewU8;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrs implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final InterleavedWriteViewU8 f44286a;

    /* JADX INFO: renamed from: b */
    private final Bitmap f44287b;

    /* JADX INFO: renamed from: c */
    private long f44288c;

    private nrs(Bitmap bitmap) {
        bitmap.getClass();
        this.f44287b = bitmap;
        lku.m15607B(bitmap.getConfig().equals(Bitmap.Config.ARGB_8888), "Bitmap Config must be ARGB_8888", bitmap.getConfig());
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int rowBytes = bitmap.getRowBytes();
        lku.m15608C(bitmap.getRowBytes() % 4 == 0, "Bitmap's row stride in bytes (%s) must evenly divide the number of channels (%s)", bitmap.getRowBytes(), 4);
        long jLockBitmap = AndroidJniUtils.lockBitmap(bitmap);
        this.f44288c = jLockBitmap;
        if (jLockBitmap == 0) {
            throw new IllegalArgumentException("Failed to lock bitmap.");
        }
        this.f44286a = new InterleavedWriteViewU8(GcamModuleJNI.new_InterleavedWriteViewU8__SWIG_1(width, height, 4, nsd.m17642a(new nsd(jLockBitmap)), rowBytes));
    }

    /* JADX INFO: renamed from: a */
    public static nrs m17633a(Bitmap bitmap) {
        return new nrs(bitmap);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f44288c != 0) {
            AndroidJniUtils.unlockBitmap(this.f44287b);
            this.f44288c = 0L;
        }
    }

    protected final void finalize() {
        if (this.f44288c != 0) {
            System.err.printf("LockedBitmap finalized with a non-zero native pointer (0x%x), this indicates a resource management error.%n", Long.valueOf(this.f44288c));
        }
        close();
    }
}
