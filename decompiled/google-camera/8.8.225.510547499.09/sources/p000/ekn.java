package p000;

import android.media.AudioRecord;
import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekn extends Thread {

    /* JADX INFO: renamed from: a */
    public static final nbh f14469a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorderThread");

    /* JADX INFO: renamed from: d */
    private final AudioRecord f14472d;

    /* JADX INFO: renamed from: e */
    private final ekk f14473e;

    /* JADX INFO: renamed from: f */
    private final byte[] f14474f = new byte[2048];

    /* JADX INFO: renamed from: b */
    public boolean f14470b = false;

    /* JADX INFO: renamed from: c */
    public long f14471c = 0;

    public ekn(ekk ekkVar, AudioRecord audioRecord) {
        this.f14473e = ekkVar;
        this.f14472d = audioRecord;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AudioRecord audioRecord = this.f14472d;
        if (audioRecord == null) {
            this.f14470b = false;
            return;
        }
        this.f14470b = true;
        try {
            audioRecord.startRecording();
        } catch (IllegalStateException e) {
            ((nbe) ((nbe) ((nbe) f14469a.m17251b()).mo17283h(e)).mo17276G((char) 1545)).mo17293r("%s", e.getMessage());
        }
        while (this.f14470b) {
            int i = this.f14472d.read(this.f14474f, 0, 2048);
            if (i == -3 || i == -2) {
                ((nbe) ((nbe) f14469a.m17251b()).mo17276G((char) 1546)).mo17290o("Error reading audio");
                break;
            }
            if (this.f14471c != 0) {
                long jNanoTime = (System.nanoTime() / 1000) + this.f14471c;
                ekk ekkVar = this.f14473e;
                byte[] bArr = this.f14474f;
                if (ekkVar.f14463d) {
                    try {
                        ByteBuffer[] inputBuffers = ekkVar.f14461b.getInputBuffers();
                        int iDequeueInputBuffer = ekkVar.f14461b.dequeueInputBuffer(-1L);
                        if (iDequeueInputBuffer < 0) {
                            ((nbe) ((nbe) ekk.f14460a.m17251b()).mo17276G((char) 1534)).mo17290o("Could not find a valid buffer, will drop frame!");
                        } else {
                            ByteBuffer byteBuffer = inputBuffers[iDequeueInputBuffer];
                            byteBuffer.clear();
                            byteBuffer.put(bArr);
                            int i2 = true != ekkVar.f14462c ? 0 : 4;
                            MediaCodec mediaCodec = ekkVar.f14461b;
                            int length = bArr.length;
                            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 2048, jNanoTime, i2);
                            if (ekkVar.f14462c) {
                                ekkVar.f14463d = false;
                                ekkVar.f14462c = false;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        ((nbe) ((nbe) ((nbe) ekk.f14460a.m17251b()).mo17283h(e2)).mo17276G((char) 1535)).mo17290o("MediaCodec got into an illegal state");
                    }
                }
            }
        }
        try {
            this.f14472d.stop();
        } catch (IllegalStateException e3) {
            ((nbe) ((nbe) ((nbe) f14469a.m17251b()).mo17283h(e3)).mo17276G((char) 1544)).mo17293r("%s", e3.getMessage());
        }
        this.f14472d.release();
        this.f14470b = false;
    }
}
