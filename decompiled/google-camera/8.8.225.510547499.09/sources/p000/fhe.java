package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class fhe implements kyt {

    /* JADX INFO: renamed from: a */
    private final kyt f21960a;

    /* JADX INFO: renamed from: b */
    private final nqf f21961b;

    public fhe(kyt kytVar, nqf nqfVar) {
        this.f21960a = kytVar;
        this.f21961b = nqfVar;
    }

    @Override // p000.kyt
    /* JADX INFO: renamed from: a */
    public final void mo8408a(nps npsVar) {
        this.f21960a.mo8408a(npsVar);
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.f21960a.mo8409b(byteBuffer, bufferInfo);
            if ((bufferInfo.flags & 1) != 0) {
                this.f21961b.mo14894e(Long.valueOf(bufferInfo.presentationTimeUs));
            }
        } catch (CancellationException e) {
            this.f21961b.cancel(false);
        } catch (Throwable th) {
            this.f21961b.cancel(false);
            throw th;
        }
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f21960a.close();
            if (this.f21961b.isDone()) {
                return;
            }
            this.f21961b.mo14894e(null);
        } catch (CancellationException e) {
            this.f21961b.cancel(false);
        } catch (Throwable th) {
            this.f21961b.cancel(false);
            throw th;
        }
    }
}
