package p000;

import com.google.android.apps.camera.jni.lensoffset.LensOffsetQueueNative;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class enk implements enj {

    /* JADX INFO: renamed from: c */
    private final long f14760c;

    /* JADX INFO: renamed from: a */
    private final Object f14758a = new Object();

    /* JADX INFO: renamed from: b */
    private final Set f14759b = new HashSet();

    /* JADX INFO: renamed from: d */
    private boolean f14761d = false;

    public enk(int i, kbc kbcVar) {
        this.f14760c = LensOffsetQueueNative.createHandle(i, kbcVar.f35517a, kbcVar.f35518b);
    }

    @Override // p000.enj
    /* JADX INFO: renamed from: b */
    public final float[] mo7560b(long j, long j2) {
        float[] fArr = {0.0f, 0.0f};
        synchronized (this.f14758a) {
            if (this.f14761d) {
                return fArr;
            }
            if (j2 >= 2000000) {
                long j3 = j2 >> 1;
                long j4 = j + j3;
                float[] fArr2 = {0.0f, 0.0f};
                int i = 0;
                for (long j5 = j - j3; j5 < j4; j5 += 2000000) {
                    if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f14760c, j5, fArr2)) {
                        nbh.f41935b.mo17277H(TimeUnit.MILLISECONDS);
                    }
                    fArr[0] = fArr[0] + fArr2[0];
                    fArr[1] = fArr[1] + fArr2[1];
                    i++;
                }
                if (i > 0) {
                    float f = i;
                    fArr[0] = fArr[0] / f;
                    fArr[1] = fArr[1] / f;
                }
            } else if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f14760c, j, fArr)) {
                nbh.f41935b.mo17277H(TimeUnit.MILLISECONDS);
            }
            return fArr;
        }
    }

    @Override // p000.enj
    /* JADX INFO: renamed from: c */
    public final void mo7561c(long j, float f, float f2) {
        synchronized (this.f14758a) {
            if (this.f14761d) {
                return;
            }
            if (LensOffsetQueueNative.processAndEnqueueLensOffset(this.f14760c, j, f, f2)) {
                Iterator it = this.f14759b.iterator();
                while (it.hasNext()) {
                    ((eni) it.next()).m7562a();
                }
            }
        }
    }

    @Override // p000.enj, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f14758a) {
            if (this.f14761d) {
                return;
            }
            this.f14761d = true;
            LensOffsetQueueNative.releaseHandle(this.f14760c);
        }
    }

    @Override // p000.enj
    /* JADX INFO: renamed from: a */
    public final float[] mo7559a(long j) {
        float[] fArr = {0.0f, 0.0f};
        synchronized (this.f14758a) {
            if (this.f14761d) {
                return fArr;
            }
            if (!LensOffsetQueueNative.getLensOffsetAtTime(this.f14760c, j, fArr)) {
                nbh.f41935b.mo17277H(TimeUnit.MILLISECONDS);
            }
            return fArr;
        }
    }
}
