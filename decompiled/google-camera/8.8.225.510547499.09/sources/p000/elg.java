package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elg {

    /* JADX INFO: renamed from: a */
    private static final nbh f14566a = nbh.m17259h(KMNlNMe.xkIWxERODNVYMd);

    /* JADX INFO: renamed from: b */
    private final MediaMuxer f14567b;

    /* JADX INFO: renamed from: c */
    private final int f14568c;

    /* JADX INFO: renamed from: d */
    private final CountDownLatch f14569d = new CountDownLatch(1);

    /* JADX INFO: renamed from: e */
    private int f14570e = 0;

    public elg(String str, int i) {
        this.f14568c = i;
        try {
            this.f14567b = new MediaMuxer(str, 0);
        } catch (IOException e) {
            throw new RuntimeException("MediaMuxer creation failed", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized int m7448a(MediaFormat mediaFormat) {
        if (m7451d()) {
            ((nbe) ((nbe) f14566a.m17251b()).mo17276G(1573)).mo17291p("addTrack called after muxer was started with %d tracks", this.f14570e);
            return -1;
        }
        int iAddTrack = this.f14567b.addTrack(mediaFormat);
        int i = this.f14570e + 1;
        this.f14570e = i;
        if (i == this.f14568c) {
            this.f14567b.start();
            this.f14569d.countDown();
        }
        return iAddTrack;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7449b() {
        if (this.f14570e <= 0) {
            ((nbe) ((nbe) f14566a.m17251b()).mo17276G((char) 1577)).mo17290o("stopTrack called but no tracks were added!");
            return;
        }
        if (m7451d()) {
            int i = this.f14570e - 1;
            this.f14570e = i;
            if (i <= 0) {
                try {
                    this.f14567b.stop();
                } catch (IllegalStateException e) {
                    ((nbe) ((nbe) ((nbe) f14566a.m17251b()).mo17283h(e)).mo17276G((char) 1575)).mo17293r("%s", e.getMessage());
                }
                try {
                    this.f14567b.release();
                } catch (IllegalStateException e2) {
                    ((nbe) ((nbe) ((nbe) f14566a.m17251b()).mo17283h(e2)).mo17276G((char) 1574)).mo17293r("%s", e2.getMessage());
                }
            }
        } else {
            ((nbe) ((nbe) f14566a.m17251b()).mo17276G((char) 1576)).mo17290o("stopTrack called but the muxer is not started!");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7450c(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        try {
            this.f14569d.await();
            try {
                this.f14567b.writeSampleData(i, byteBuffer, bufferInfo);
            } catch (IllegalArgumentException e) {
                ((nbe) ((nbe) ((nbe) f14566a.m17251b()).mo17283h(e)).mo17276G((char) 1578)).mo17293r("%s", e.getMessage());
            }
        } catch (InterruptedException e2) {
            ((nbe) ((nbe) f14566a.m17251b()).mo17276G((char) 1579)).mo17290o("writeSampleData called but muxer was not started!");
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m7451d() {
        return this.f14569d.getCount() == 0;
    }
}
