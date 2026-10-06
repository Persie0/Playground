package p000;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class elj {

    /* JADX INFO: renamed from: a */
    public static final nbh f14586a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/video/VideoDecoder");

    /* JADX INFO: renamed from: b */
    public final Surface f14587b;

    /* JADX INFO: renamed from: i */
    private final MediaCodec.BufferInfo f14594i = new MediaCodec.BufferInfo();

    /* JADX INFO: renamed from: d */
    public MediaFormat f14589d = null;

    /* JADX INFO: renamed from: e */
    public long f14590e = 0;

    /* JADX INFO: renamed from: j */
    private long f14595j = -1;

    /* JADX INFO: renamed from: k */
    private long f14596k = 0;

    /* JADX INFO: renamed from: l */
    private boolean f14597l = false;

    /* JADX INFO: renamed from: m */
    private boolean f14598m = false;

    /* JADX INFO: renamed from: f */
    public boolean f14591f = false;

    /* JADX INFO: renamed from: g */
    public ByteBuffer[] f14592g = null;

    /* JADX INFO: renamed from: h */
    public MediaCodec f14593h = null;

    /* JADX INFO: renamed from: c */
    public final MediaExtractor f14588c = new MediaExtractor();

    public elj(Surface surface) {
        this.f14587b = surface;
    }

    /* JADX INFO: renamed from: b */
    public static MediaFormat m7454b(MediaExtractor mediaExtractor, String str) {
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            int i = 0;
            while (true) {
                if (i >= trackCount) {
                    i = -1;
                    break;
                }
                if (mediaExtractor.getTrackFormat(i).getString("mime").startsWith("video/")) {
                    break;
                }
                i++;
            }
            if (i < 0) {
                ((nbe) ((nbe) f14586a.m17251b()).mo17276G((char) 1584)).mo17293r("No video track found in %s", str);
                return null;
            }
            mediaExtractor.selectTrack(i);
            return mediaExtractor.getTrackFormat(i);
        } catch (IOException e) {
            ((nbe) ((nbe) f14586a.m17251b()).mo17276G((char) 1585)).mo17293r("Could not open video file %s", str);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final synchronized float m7455a() {
        long j = this.f14590e;
        if (j == 0) {
            return 1.0f;
        }
        return this.f14596k / j;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX INFO: renamed from: c */
    public final synchronized boolean m7456c() {
        int iDequeueInputBuffer;
        boolean z = false;
        while (!z) {
            if (this.f14598m) {
                return false;
            }
            if (!this.f14597l && (iDequeueInputBuffer = this.f14593h.dequeueInputBuffer(1000L)) >= 0) {
                int sampleData = this.f14588c.readSampleData(this.f14592g[iDequeueInputBuffer], 0);
                if (sampleData < 0) {
                    this.f14593h.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                    this.f14597l = true;
                } else {
                    this.f14597l = false;
                    this.f14593h.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.f14588c.getSampleTime(), 0);
                    this.f14588c.advance();
                }
            }
            int iDequeueOutputBuffer = this.f14593h.dequeueOutputBuffer(this.f14594i, 1000L);
            if (iDequeueOutputBuffer >= 0) {
                this.f14596k = this.f14594i.presentationTimeUs;
                if ((this.f14594i.flags & 4) > 0) {
                    if (this.f14594i.size > 0) {
                        long j = this.f14596k;
                        if (j <= 0 || j >= this.f14590e) {
                            z = false;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    this.f14598m = true;
                    this.f14596k = this.f14590e;
                } else if (this.f14596k >= this.f14595j) {
                    z = true;
                }
                this.f14593h.releaseOutputBuffer(iDequeueOutputBuffer, z);
            }
        }
        this.f14595j = Math.min(this.f14596k + 1, this.f14590e);
        return true;
    }
}
