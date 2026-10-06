package p000;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ele extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ elf f14551a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ele(elf elfVar) {
        super("EncoderDrainerDrainThread");
        this.f14551a = elfVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            elf elfVar = this.f14551a;
            if (elfVar.f14558g) {
                return;
            }
            MediaCodec mediaCodecMo7411a = elfVar.f14553b.mo7411a();
            ByteBuffer[] outputBuffers = mediaCodecMo7411a.getOutputBuffers();
            while (elfVar.f14560i) {
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                try {
                    int iDequeueOutputBuffer = mediaCodecMo7411a.dequeueOutputBuffer(bufferInfo, 250000L);
                    if (iDequeueOutputBuffer == -1) {
                        if (!elfVar.f14558g || elfVar.f14563l == 0) {
                            ((nbe) ((nbe) elf.f14552a.m17252c()).mo17276G((char) 1560)).mo17290o("MediaCodec timed out.");
                            break;
                        }
                    } else if (iDequeueOutputBuffer == -3) {
                        outputBuffers = mediaCodecMo7411a.getOutputBuffers();
                    } else if (iDequeueOutputBuffer == -2) {
                        elfVar.f14557f = elfVar.f14554c.m7448a(mediaCodecMo7411a.getOutputFormat());
                    } else if (iDequeueOutputBuffer < 0) {
                        continue;
                    } else {
                        ByteBuffer byteBuffer = outputBuffers[iDequeueOutputBuffer];
                        if (byteBuffer == null) {
                            ((nbe) ((nbe) elf.f14552a.m17251b()).mo17276G(1559)).mo17291p("encoderOutputBuffer %s was null", iDequeueOutputBuffer);
                            break;
                        }
                        if ((bufferInfo.flags & 2) != 0) {
                            bufferInfo.size = 0;
                        }
                        if (bufferInfo.size != 0) {
                            byteBuffer.rewind();
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.get(bArr);
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            elfVar.f14563l++;
                            synchronized (elfVar.f14556e) {
                                elfVar.f14555d.offer(new gtd(byteBufferWrap, bufferInfo));
                                elfVar.f14556e.notifyAll();
                            }
                        }
                        mediaCodecMo7411a.releaseOutputBuffer(iDequeueOutputBuffer, false);
                        if ((bufferInfo.flags & 4) != 0) {
                            elfVar.f14558g = true;
                            break;
                        }
                    }
                } catch (IllegalStateException e) {
                    ((nbe) ((nbe) ((nbe) elf.f14552a.m17251b()).mo17283h(e)).mo17276G((char) 1561)).mo17290o("Illegal state when dequeueing output buffer");
                    elfVar.f14558g = true;
                }
            }
        }
    }
}
