package p000;

import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jze {

    /* JADX INFO: renamed from: a */
    private final nqf f35265a = nqf.m17621g();

    /* JADX INFO: renamed from: b */
    private final void m13788b() {
        try {
            this.f35265a.get(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("AuViEncoderStop", "Error getting last video frame timestamp.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    private static boolean m13789c(long j, AtomicLong atomicLong) {
        return atomicLong.get() <= 0 || j - atomicLong.get() <= 3000000;
    }

    /* JADX INFO: renamed from: a */
    public final void m13790a(int i, long j, AtomicLong atomicLong, nps npsVar) {
        String.format("%s Waiting for EOS at: %d, frames at: %d", jzn.m13814b(i), Long.valueOf(SystemClock.uptimeMillis() * 1000), Long.valueOf(atomicLong.get()));
        try {
            atomicLong.get();
            if (atomicLong.get() > 0 && !m13789c(j, atomicLong)) {
                throw new TimeoutException(String.format("%s not waiting for last frame to arrive. [stop us: %d, last frame us: %d]", jzn.m13814b(i), Long.valueOf(j), Long.valueOf(atomicLong.get())));
            }
            npsVar.get(700L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            Log.w("AuViEncoderStop", String.format("%s Failed waiting for eos, stream may have stopped early (last frame: %d)", jzn.m13814b(i), Long.valueOf(atomicLong.get())));
            m13789c(j, atomicLong);
        }
        if (i == 2) {
            this.f35265a.mo14894e(Long.valueOf(atomicLong.get()));
        } else {
            m13788b();
        }
        String.format("Last %s frame timestamp: %d", jzn.m13814b(i), Long.valueOf(atomicLong.get()));
    }
}
