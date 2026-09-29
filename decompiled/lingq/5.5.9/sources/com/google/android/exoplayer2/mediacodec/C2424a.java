package com.google.android.exoplayer2.mediacodec;

import ae.C0062b;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.activity.RunnableC0190i;
import com.google.android.exoplayer2.mediacodec.C2424a;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.NoSuchElementException;
import p218k9.C6633c;
import p479xa.C10129a;
import p479xa.C10134c0;
import p479xa.C10136e;
import p482xd.InterfaceC10177i;
import p504y9.C10312e;
import p504y9.C10313f;
import p504y9.C10316i;
import p504y9.HandlerC10311d;
import p505ya.C10324f;

/* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2424a implements InterfaceC2426c {

    /* JADX INFO: renamed from: a */
    public final MediaCodec f12602a;

    /* JADX INFO: renamed from: b */
    public final C10313f f12603b;

    /* JADX INFO: renamed from: c */
    public final C10312e f12604c;

    /* JADX INFO: renamed from: d */
    public final boolean f12605d;

    /* JADX INFO: renamed from: e */
    public boolean f12606e;

    /* JADX INFO: renamed from: f */
    public int f12607f = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.mediacodec.a$a */
    public static final class a implements InterfaceC2426c.b {

        /* JADX INFO: renamed from: a */
        public final InterfaceC10177i<HandlerThread> f12608a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC10177i<HandlerThread> f12609b;

        public a(final int i10) {
            InterfaceC10177i<HandlerThread> interfaceC10177i = new InterfaceC10177i() { // from class: y9.b
                @Override // p482xd.InterfaceC10177i
                public final Object get() {
                    return new HandlerThread(C2424a.m7177o("ExoPlayer:MediaCodecAsyncAdapter:", i10));
                }
            };
            InterfaceC10177i<HandlerThread> interfaceC10177i2 = new InterfaceC10177i() { // from class: y9.c
                @Override // p482xd.InterfaceC10177i
                public final Object get() {
                    return new HandlerThread(C2424a.m7177o("ExoPlayer:MediaCodecQueueingThread:", i10));
                }
            };
            this.f12608a = interfaceC10177i;
            this.f12609b = interfaceC10177i2;
        }

        @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2424a mo7192a(InterfaceC2426c.a aVar) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            String str = aVar.f12610a.f12615a;
            C2424a c2424a = null;
            try {
                C0062b.m315V("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    C2424a c2424a2 = new C2424a(mediaCodecCreateByCodecName, this.f12608a.get(), this.f12609b.get(), false);
                    try {
                        C0062b.m283K0();
                        C2424a.m7176n(c2424a2, aVar.f12611b, aVar.f12613d, aVar.f12614e);
                        return c2424a2;
                    } catch (Exception e10) {
                        e = e10;
                        c2424a = c2424a2;
                        if (c2424a == null) {
                            if (mediaCodecCreateByCodecName != null) {
                                mediaCodecCreateByCodecName.release();
                            }
                            throw e;
                        }
                        c2424a.release();
                        throw e;
                    }
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public C2424a(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f12602a = mediaCodec;
        this.f12603b = new C10313f(handlerThread);
        this.f12604c = new C10312e(mediaCodec, handlerThread2);
        this.f12605d = z10;
    }

    /* JADX INFO: renamed from: n */
    public static void m7176n(C2424a c2424a, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        C10313f c10313f = c2424a.f12603b;
        C10129a.m18992d(c10313f.f51859c == null);
        HandlerThread handlerThread = c10313f.f51858b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = c2424a.f12602a;
        mediaCodec.setCallback(c10313f, handler);
        c10313f.f51859c = handler;
        C0062b.m315V("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        C0062b.m283K0();
        C10312e c10312e = c2424a.f12604c;
        if (!c10312e.f51850f) {
            HandlerThread handlerThread2 = c10312e.f51846b;
            handlerThread2.start();
            c10312e.f51847c = new HandlerC10311d(c10312e, handlerThread2.getLooper());
            c10312e.f51850f = true;
        }
        C0062b.m315V("startCodec");
        mediaCodec.start();
        C0062b.m283K0();
        c2424a.f12607f = 1;
    }

    /* JADX INFO: renamed from: o */
    public static String m7177o(String str, int i10) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: a */
    public final void mo7178a() {
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: b */
    public final MediaFormat mo7179b() {
        MediaFormat mediaFormat;
        C10313f c10313f = this.f12603b;
        synchronized (c10313f.f51857a) {
            mediaFormat = c10313f.f51864h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: c */
    public final void mo7180c(Bundle bundle) {
        m7191p();
        this.f12602a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: d */
    public final void mo7181d(int i10, long j10) {
        this.f12602a.releaseOutputBuffer(i10, j10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: e */
    public final int mo7182e() {
        int i10;
        this.f12604c.m19315b();
        C10313f c10313f = this.f12603b;
        synchronized (c10313f.f51857a) {
            boolean z10 = false;
            i10 = -1;
            if (!(c10313f.f51867k > 0 || c10313f.f51868l)) {
                IllegalStateException illegalStateException = c10313f.f51869m;
                if (illegalStateException != null) {
                    c10313f.f51869m = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = c10313f.f51866j;
                if (codecException != null) {
                    c10313f.f51866j = null;
                    throw codecException;
                }
                C10316i c10316i = c10313f.f51860d;
                int i11 = c10316i.f51878c;
                if (i11 == 0) {
                    z10 = true;
                }
                if (!z10) {
                    if (i11 == 0) {
                        throw new NoSuchElementException();
                    }
                    int[] iArr = c10316i.f51879d;
                    int i12 = c10316i.f51876a;
                    int i13 = iArr[i12];
                    c10316i.f51876a = c10316i.f51880e & (i12 + 1);
                    c10316i.f51878c = i11 - 1;
                    i10 = i13;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: f */
    public final int mo7183f(MediaCodec.BufferInfo bufferInfo) {
        this.f12604c.m19315b();
        C10313f c10313f = this.f12603b;
        synchronized (c10313f.f51857a) {
            if (c10313f.f51867k > 0 || c10313f.f51868l) {
                return -1;
            }
            IllegalStateException illegalStateException = c10313f.f51869m;
            if (illegalStateException != null) {
                c10313f.f51869m = null;
                throw illegalStateException;
            }
            MediaCodec.CodecException codecException = c10313f.f51866j;
            if (codecException != null) {
                c10313f.f51866j = null;
                throw codecException;
            }
            C10316i c10316i = c10313f.f51861e;
            int i10 = c10316i.f51878c;
            if (i10 == 0) {
                return -1;
            }
            if (i10 == 0) {
                throw new NoSuchElementException();
            }
            int[] iArr = c10316i.f51879d;
            int i11 = c10316i.f51876a;
            int i12 = iArr[i11];
            c10316i.f51876a = c10316i.f51880e & (i11 + 1);
            c10316i.f51878c = i10 - 1;
            if (i12 >= 0) {
                C10129a.m18993e(c10313f.f51864h);
                MediaCodec.BufferInfo bufferInfoRemove = c10313f.f51862f.remove();
                bufferInfo.set(bufferInfoRemove.offset, bufferInfoRemove.size, bufferInfoRemove.presentationTimeUs, bufferInfoRemove.flags);
            } else if (i12 == -2) {
                c10313f.f51864h = c10313f.f51863g.remove();
            }
            return i12;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void flush() {
        this.f12604c.m19314a();
        this.f12602a.flush();
        C10313f c10313f = this.f12603b;
        synchronized (c10313f.f51857a) {
            c10313f.f51867k++;
            Handler handler = c10313f.f51859c;
            int i10 = C10134c0.f51354a;
            handler.post(new RunnableC0190i(12, c10313f));
        }
        this.f12602a.start();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: g */
    public final void mo7184g(int i10, int i11, int i12, long j10) {
        C10312e.a aVar;
        C10312e c10312e = this.f12604c;
        c10312e.m19315b();
        ArrayDeque<C10312e.a> arrayDeque = C10312e.f51843g;
        synchronized (arrayDeque) {
            aVar = arrayDeque.isEmpty() ? new C10312e.a() : arrayDeque.removeFirst();
        }
        aVar.f51851a = i10;
        aVar.f51852b = 0;
        aVar.f51853c = i11;
        aVar.f51855e = j10;
        aVar.f51856f = i12;
        HandlerC10311d handlerC10311d = c10312e.f51847c;
        int i13 = C10134c0.f51354a;
        handlerC10311d.obtainMessage(0, aVar).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: h */
    public final void mo7185h(final InterfaceC2426c.c cVar, Handler handler) {
        m7191p();
        this.f12602a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: y9.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f51838a.getClass();
                C10324f.c cVar2 = (C10324f.c) cVar;
                cVar2.getClass();
                if (C10134c0.f51354a >= 30) {
                    cVar2.m19342a(j10);
                } else {
                    Handler handler2 = cVar2.f51961a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j10 >> 32), (int) j10));
                }
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: i */
    public final void mo7186i(int i10, boolean z10) {
        this.f12602a.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: j */
    public final void mo7187j(int i10, C6633c c6633c, long j10) {
        C10312e.a aVar;
        C10312e c10312e = this.f12604c;
        c10312e.m19315b();
        ArrayDeque<C10312e.a> arrayDeque = C10312e.f51843g;
        synchronized (arrayDeque) {
            try {
                aVar = arrayDeque.isEmpty() ? new C10312e.a() : arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f51851a = i10;
        aVar.f51852b = 0;
        aVar.f51853c = 0;
        aVar.f51855e = j10;
        aVar.f51856f = 0;
        int i11 = c6633c.f37597f;
        MediaCodec.CryptoInfo cryptoInfo = aVar.f51854d;
        cryptoInfo.numSubSamples = i11;
        int[] iArr = c6633c.f37595d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c6633c.f37596e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c6633c.f37593b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c6633c.f37592a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c6633c.f37594c;
        if (C10134c0.f51354a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c6633c.f37598g, c6633c.f37599h));
        }
        c10312e.f51847c.obtainMessage(1, aVar).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: k */
    public final ByteBuffer mo7188k(int i10) {
        return this.f12602a.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: l */
    public final void mo7189l(Surface surface) {
        m7191p();
        this.f12602a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    /* JADX INFO: renamed from: m */
    public final ByteBuffer mo7190m(int i10) {
        return this.f12602a.getOutputBuffer(i10);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: p */
    public final void m7191p() {
        if (this.f12605d) {
            try {
                C10312e c10312e = this.f12604c;
                C10136e c10136e = c10312e.f51849e;
                synchronized (c10136e) {
                    try {
                        c10136e.f51371a = false;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                HandlerC10311d handlerC10311d = c10312e.f51847c;
                handlerC10311d.getClass();
                handlerC10311d.obtainMessage(2).sendToTarget();
                synchronized (c10136e) {
                    while (!c10136e.f51371a) {
                        c10136e.wait();
                    }
                }
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void release() {
        try {
            if (this.f12607f == 1) {
                C10312e c10312e = this.f12604c;
                if (c10312e.f51850f) {
                    c10312e.m19314a();
                    c10312e.f51846b.quit();
                }
                c10312e.f51850f = false;
                C10313f c10313f = this.f12603b;
                synchronized (c10313f.f51857a) {
                    c10313f.f51868l = true;
                    c10313f.f51858b.quit();
                    c10313f.m19316a();
                }
            }
            this.f12607f = 2;
            if (this.f12606e) {
                return;
            }
            this.f12602a.release();
            this.f12606e = true;
        } catch (Throwable th2) {
            if (!this.f12606e) {
                this.f12602a.release();
                this.f12606e = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.InterfaceC2426c
    public final void setVideoScalingMode(int i10) {
        m7191p();
        this.f12602a.setVideoScalingMode(i10);
    }
}
