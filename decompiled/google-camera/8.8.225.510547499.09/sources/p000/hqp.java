package p000;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import androidx.wear.ambient.AmbientModeSupport;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hqp {

    /* JADX INFO: renamed from: a */
    public static final nbh f29163a = nbh.m17259h("com/google/android/apps/camera/timelapse/extractor/VideoExtractorImpl");

    /* JADX INFO: renamed from: a */
    public static final void m10618a(int i, mrm mrmVar, mrm mrmVar2, MediaExtractor mediaExtractor, ConcurrentLinkedQueue concurrentLinkedQueue, Object obj, int i2) {
        if (mrmVar2.mo16813g() == mrmVar.mo16813g()) {
            ((nbe) ((nbe) f29163a.m17251b()).mo17276G((char) 3904)).mo17290o("Must specify exactly one of the two intervals (sample or time).");
            return;
        }
        synchronized (obj) {
            if (i == -1) {
                ((nbe) ((nbe) f29163a.m17252c()).mo17276G(3902)).mo17290o("Can't find video track from data source.");
                return;
            }
            mediaExtractor.selectTrack(i);
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i2);
            long j = -1;
            int i3 = 0;
            while (true) {
                int sampleData = mediaExtractor.readSampleData(byteBufferAllocate, 0);
                if (sampleData < 0) {
                    break;
                }
                i3++;
                long sampleTime = mediaExtractor.getSampleTime();
                if (mrmVar2.mo16813g() && sampleTime == j) {
                    break;
                }
                if (sampleData == i2) {
                    ((nbe) ((nbe) f29163a.m17252c()).mo17276G(3901)).mo17290o("The read sample size is equal to the buffer size. The read sample might be incomplete.");
                }
                int sampleFlags = mediaExtractor.getSampleFlags();
                int i4 = sampleFlags & 1;
                if ((sampleFlags & 4) != 0) {
                    i4 |= 8;
                }
                bufferInfo.flags = i4;
                bufferInfo.offset = 0;
                bufferInfo.size = sampleData;
                bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    hoz hozVar = (hoz) it.next();
                    synchronized (hozVar.f28706d.f28750t) {
                        bufferInfo.presentationTimeUs = TimeUnit.SECONDS.toMicros(hozVar.f28706d.f28744n.getAndIncrement()) / ((long) hozVar.f28706d.f28756z.f29162h);
                        hozVar.f28703a.mo14524h(hozVar.f28704b, byteBufferAllocate, bufferInfo);
                        hpa hpaVar = hozVar.f28706d;
                        hqm hqmVar = hpaVar.f28753w;
                        hqmVar.getClass();
                        hqmVar.m10608c(hpaVar.f28727A);
                        hpa hpaVar2 = hozVar.f28706d;
                        AmbientModeSupport.AmbientController ambientController = hpaVar2.f28730D;
                        if (ambientController != null) {
                            ((hqk) ambientController.f1702a).m10598d(hpaVar2.f28744n.get() / hozVar.f28705c);
                        }
                    }
                }
                byteBufferAllocate.clear();
                if (mrmVar.mo16813g()) {
                    for (int i5 = 0; i5 < ((Long) mrmVar.mo16809c()).longValue(); i5++) {
                        mediaExtractor.advance();
                    }
                } else {
                    mediaExtractor.seekTo(nnd.m17517a((Duration) mrmVar2.mo16809c()) * ((long) i3), 2);
                }
                j = sampleTime;
            }
            mediaExtractor.unselectTrack(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m10619b(MediaExtractor mediaExtractor, Object obj) {
        synchronized (obj) {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i = 0; i < trackCount; i++) {
                String string = mediaExtractor.getTrackFormat(i).getString("mime");
                if (string != null && string.startsWith("video/")) {
                    return i;
                }
            }
            return -1;
        }
    }
}
