package p000;

import android.media.MediaCodec;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class fjd implements kba {

    /* JADX INFO: renamed from: b */
    private static final nbh f22209b = nbh.m17259h("com/google/android/apps/camera/microvideo/gyro/IncompleteMotionDataFrame");

    /* JADX INFO: renamed from: a */
    public final fje f22210a;

    private fjd(fje fjeVar) {
        this.f22210a = fjeVar;
    }

    /* JADX INFO: renamed from: d */
    public static fjd m8481d(kbc kbcVar, long j, int i) {
        return new fjd(new fje(kbcVar, j, i));
    }

    /* JADX INFO: renamed from: a */
    public final long m8482a() {
        return TimeUnit.MICROSECONDS.convert(this.f22210a.f22212b, TimeUnit.NANOSECONDS);
    }

    /* JADX INFO: renamed from: b */
    public final void m8483b() {
        this.f22210a.f22213c.cancel(false);
        this.f22210a.f22215e.cancel(false);
        this.f22210a.f22214d.cancel(false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8484c() {
        return this.f22210a.f22213c.isDone() && this.f22210a.f22214d.isDone() && this.f22210a.f22217g;
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: e */
    public final boolean m8485e(fjd fjdVar) {
        boolean z;
        if (fjdVar.m8482a() <= TimeUnit.MICROSECONDS.convert(this.f22210a.f22212b, TimeUnit.NANOSECONDS)) {
            return false;
        }
        fje fjeVar = fjdVar.f22210a;
        try {
            z = (this.f22210a.f22214d.isDone() || !fjdVar.f22210a.f22214d.isDone() || (((MediaCodec.BufferInfo) kxk.m14973S(fjdVar.f22210a.f22214d)).flags & 1) == 0) ? false : true;
        } catch (ExecutionException e) {
            ((nbe) ((nbe) ((nbe) f22209b.m17251b()).mo17283h(e)).mo17276G((char) 2341)).mo17290o("Unexpected exception thrown while fetching values.");
            z = false;
        }
        if (z) {
            ((nbe) ((nbe) f22209b.m17252c()).mo17276G((char) 2340)).mo17290o("Stale encoder frame detected");
        }
        return (fjeVar.f22213c.isDone() && !this.f22210a.f22213c.isDone()) || this.f22210a.f22215e.isCancelled() || z;
    }

    public final String toString() {
        return String.format(Locale.US, "%d - metadataFuture: %s, videoBufferInfoFuture: %s, largeMetadataTimestampSeen: %s", Long.valueOf(this.f22210a.f22212b), Boolean.valueOf(this.f22210a.f22213c.isDone()), Boolean.valueOf(this.f22210a.f22214d.isDone()), Boolean.valueOf(this.f22210a.f22217g));
    }
}
