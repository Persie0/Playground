package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fqm implements fqu {

    /* JADX INFO: renamed from: a */
    private final fql f23233a;

    /* JADX INFO: renamed from: b */
    private final kyt f23234b;

    /* JADX INFO: renamed from: c */
    private boolean f23235c = false;

    /* JADX INFO: renamed from: d */
    private final bkn f23236d;

    public fqm(fql fqlVar, kyt kytVar, bkn bknVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f23233a = fqlVar;
        this.f23234b = kytVar;
        this.f23236d = bknVar;
    }

    @Override // p000.fqu
    /* JADX INFO: renamed from: a */
    public final synchronized boolean mo8697a(kpw kpwVar) {
        try {
            fql fqlVar = this.f23233a;
            bkn bknVar = this.f23236d;
            fql fqlVar2 = ((fqn) fqlVar).f23237a;
            for (int i = 0; i < 3; i++) {
                try {
                    fql fqlVar3 = ((fqn) fqlVar2).f23237a;
                    long jIncrementAndGet = ((fqo) fqlVar3).f23239a.incrementAndGet();
                    long jMo7248d = kpwVar.mo7248d();
                    fqk fqkVarMo8707a = ((fqo) fqlVar3).f23240b.mo8707a(new fqs(kpwVar, jIncrementAndGet * 1000000), bknVar);
                    long jConvert = TimeUnit.MICROSECONDS.convert(jMo7248d, TimeUnit.NANOSECONDS);
                    MediaCodec.BufferInfo bufferInfo = ((fqp) fqkVarMo8707a).f23241a;
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    bufferInfo2.presentationTimeUs = jConvert;
                    bufferInfo2.size = bufferInfo.size;
                    bufferInfo2.offset = bufferInfo.offset;
                    bufferInfo2.flags = bufferInfo.flags;
                    fqr fqrVar = new fqr(bufferInfo2, fqkVarMo8707a);
                    try {
                        MediaFormat outputFormat = ((fqp) fqrVar.f23248b).f23242b.getOutputFormat();
                        MediaCodec.BufferInfo bufferInfo3 = fqrVar.f23247a;
                        MediaCodec.BufferInfo bufferInfo4 = new MediaCodec.BufferInfo();
                        bufferInfo4.presentationTimeUs = bufferInfo3.presentationTimeUs;
                        bufferInfo4.flags = bufferInfo3.flags;
                        bufferInfo4.offset = bufferInfo3.offset;
                        bufferInfo4.size = bufferInfo3.size;
                        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bufferInfo4.size);
                        fqk fqkVar = fqrVar.f23248b;
                        ByteBuffer outputBuffer = ((fqp) fqkVar).f23242b.getOutputBuffer(((fqp) fqkVar).f23243c);
                        outputBuffer.getClass();
                        ByteBuffer byteBufferDuplicate = outputBuffer.duplicate();
                        byteBufferDuplicate.position(((fqp) fqkVar).f23241a.offset);
                        byteBufferDuplicate.limit(((fqp) fqkVar).f23241a.offset + ((fqp) fqkVar).f23241a.size);
                        byteBufferAllocateDirect.put(byteBufferDuplicate.slice());
                        byteBufferAllocateDirect.rewind();
                        fqq fqqVar = new fqq(bufferInfo4, outputFormat, byteBufferAllocateDirect);
                        fqrVar.close();
                        MediaCodec.BufferInfo bufferInfo5 = fqqVar.f23244a;
                        if (!this.f23235c) {
                            this.f23234b.mo8408a(kxk.m14965K(fqqVar.f23245b));
                            this.f23235c = true;
                        }
                        if ((bufferInfo5.flags & 4) == 0 && (bufferInfo5.flags & 2) == 0) {
                            this.f23234b.mo8409b(fqqVar.f23246c, bufferInfo5);
                        }
                        kpwVar.close();
                    } catch (Throwable th) {
                        try {
                            fqrVar.close();
                        } catch (Throwable th2) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            } catch (Exception e) {
                            }
                        }
                        throw th;
                    }
                } catch (IllegalStateException e2) {
                    ((nbe) ((nbe) ((nbe) fqt.f23250a.m17252c()).mo17283h(e2)).mo17276G((char) 2488)).mo17290o("Encoding failed. Retrying...");
                }
            }
            throw new IllegalStateException(BEeWZPor.fNGxXLOwMx);
        } catch (Throwable th3) {
            kpwVar.close();
            throw th3;
        }
        return true;
    }

    @Override // p000.fqu, p000.kba, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f23234b.close();
    }
}
