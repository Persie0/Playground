package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedDeque;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfl implements lfk {

    /* JADX INFO: renamed from: a */
    public final nps f38136a;

    /* JADX INFO: renamed from: b */
    public final nqf f38137b = nqf.m17621g();

    /* JADX INFO: renamed from: c */
    public final nqf f38138c;

    /* JADX INFO: renamed from: d */
    public final nqf f38139d;

    /* JADX INFO: renamed from: e */
    public final nqf f38140e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentLinkedDeque f38141f;

    /* JADX INFO: renamed from: g */
    public MediaMuxer f38142g;

    /* JADX INFO: renamed from: h */
    private final nqf f38143h;

    /* JADX INFO: renamed from: i */
    private final lfn f38144i;

    /* JADX INFO: renamed from: j */
    private final Object f38145j;

    /* JADX INFO: renamed from: k */
    private long f38146k;

    public lfl(nps npsVar, lfn lfnVar) {
        nqf nqfVarM17621g = nqf.m17621g();
        this.f38138c = nqfVarM17621g;
        this.f38143h = nqf.m17621g();
        this.f38139d = nqf.m17621g();
        this.f38140e = nqf.m17621g();
        this.f38141f = new ConcurrentLinkedDeque();
        this.f38145j = new Object();
        this.f38146k = 0L;
        this.f38144i = lfnVar;
        this.f38136a = npsVar;
        npsVar.mo2282d(new kxw(this, 15), lfnVar);
        nqfVarM17621g.mo2282d(new kxw(this, 15), lfnVar);
    }

    /* JADX INFO: renamed from: c */
    private static boolean m15280c(MediaFormat mediaFormat, String str) {
        return mediaFormat.containsKey(str) && mediaFormat.getInteger(str) > 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m15281a() {
        try {
            synchronized (this.f38145j) {
                if (this.f38136a.isDone() && !this.f38136a.isCancelled()) {
                    boolean zM15280c = m15280c((MediaFormat) kxk.m14973S(this.f38136a), "oo.muxer.drop_initial_non_keyframes");
                    if (!this.f38143h.isDone()) {
                        if (zM15280c) {
                            while (!this.f38141f.isEmpty() && (((MediaCodec.BufferInfo) ((lpe) this.f38141f.getFirst()).f38883b).flags & 1) == 0) {
                                this.f38141f.removeFirst();
                            }
                        }
                        if (!this.f38141f.isEmpty()) {
                            this.f38143h.mo14894e(Long.valueOf(((MediaCodec.BufferInfo) ((lpe) this.f38141f.getFirst()).f38883b).presentationTimeUs));
                        }
                    }
                }
                if (!this.f38137b.isDone()) {
                    boolean zIsCancelled = this.f38136a.isCancelled();
                    boolean z = this.f38136a.isDone() && !this.f38143h.isDone() && this.f38139d.isDone();
                    boolean z2 = !this.f38143h.isDone() && this.f38141f.isEmpty() && this.f38139d.isDone();
                    if (z || z2 || zIsCancelled) {
                        this.f38137b.mo14894e(false);
                        this.f38140e.mo14894e(null);
                    } else if (this.f38136a.isDone() && !this.f38136a.isCancelled() && this.f38143h.isDone()) {
                        this.f38137b.mo14894e(true);
                    }
                }
                if (this.f38138c.isDone() && this.f38136a.isDone() && !this.f38136a.isCancelled()) {
                    while (true) {
                        lpe lpeVar = (lpe) this.f38141f.pollFirst();
                        if (lpeVar == null) {
                            break;
                        }
                        int iIntValue = ((Integer) kxk.m14973S(this.f38138c)).intValue();
                        MediaMuxer mediaMuxer = this.f38142g;
                        long j = ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs;
                        long j2 = this.f38146k;
                        if (m15280c((MediaFormat) kxk.m14973S(this.f38136a), "oo.muxer.force_sequential")) {
                            if (j < j2) {
                                ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs = this.f38146k;
                            }
                            this.f38146k = ((MediaCodec.BufferInfo) lpeVar.f38883b).presentationTimeUs + 100;
                        }
                        try {
                            if (((MediaCodec.BufferInfo) lpeVar.f38883b).size != 0) {
                                mediaMuxer.writeSampleData(iIntValue, (ByteBuffer) lpeVar.f38884c, (MediaCodec.BufferInfo) lpeVar.f38883b);
                            }
                        } catch (Throwable th) {
                            Log.w("MuxerTrackStreamImpl", xRFdVyfdeve.wIKgxnYf, th);
                            this.f38140e.mo8566a(th);
                        }
                        Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", e);
                        this.f38140e.mo8566a(e);
                    }
                    lku.m15613H(this.f38141f.isEmpty());
                    if (this.f38139d.isDone()) {
                        this.f38140e.mo14894e(null);
                    }
                }
            }
        } catch (Exception e) {
            Log.w("MuxerTrackStreamImpl", "Exception while trying to write packets", e);
            this.f38140e.mo8566a(e);
        }
    }

    @Override // p000.lfk
    /* JADX INFO: renamed from: b */
    public final void mo8409b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        bufferInfo2.set(0, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        this.f38144i.execute(new kds(this, new lpe(byteBufferDuplicate, bufferInfo2), 20, null));
    }

    @Override // p000.lfk, java.lang.AutoCloseable
    public final void close() {
        this.f38144i.execute(new kxw(this, 16));
    }
}
