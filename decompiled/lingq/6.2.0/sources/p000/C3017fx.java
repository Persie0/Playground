package p000;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: fx */
/* JADX INFO: loaded from: classes2.dex */
public final class C3017fx implements ut5 {

    /* JADX INFO: renamed from: g */
    public static final ArrayDeque f39823g = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public static final Object f39824h = new Object();

    /* JADX INFO: renamed from: a */
    public final MediaCodec f39825a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f39826b;

    /* JADX INFO: renamed from: c */
    public HandlerC3718wd f39827c;

    /* JADX INFO: renamed from: d */
    public final AtomicReference f39828d;

    /* JADX INFO: renamed from: e */
    public final hg1 f39829e;

    /* JADX INFO: renamed from: f */
    public boolean f39830f;

    public C3017fx(MediaCodec mediaCodec, HandlerThread handlerThread) {
        hg1 hg1Var = new hg1();
        this.f39825a = mediaCodec;
        this.f39826b = handlerThread;
        this.f39829e = hg1Var;
        this.f39828d = new AtomicReference();
    }

    /* JADX INFO: renamed from: a */
    public static C2980ex m12242a() {
        ArrayDeque arrayDeque = f39823g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C2980ex();
                }
                return (C2980ex) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: c */
    public final void mo4798c() {
        RuntimeException runtimeException = (RuntimeException) this.f39828d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: d */
    public final void mo4799d(Bundle bundle) {
        mo4798c();
        HandlerC3718wd handlerC3718wd = this.f39827c;
        String str = uma.f64080a;
        handlerC3718wd.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: e */
    public final void mo4800e(int i, xr1 xr1Var, long j, int i2) {
        mo4798c();
        C2980ex c2980exM12242a = m12242a();
        c2980exM12242a.f38013a = i;
        c2980exM12242a.f38014b = 0;
        c2980exM12242a.f38016d = j;
        c2980exM12242a.f38017e = i2;
        MediaCodec.CryptoInfo cryptoInfo = c2980exM12242a.f38015c;
        cryptoInfo.numSubSamples = xr1Var.f68565f;
        int[] iArr = xr1Var.f68563d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = xr1Var.f68564e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = xr1Var.f68561b;
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
        byte[] bArr2 = xr1Var.f68560a;
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
        cryptoInfo.mode = xr1Var.f68562c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(xr1Var.f68566g, xr1Var.f68567h));
        HandlerC3718wd handlerC3718wd = this.f39827c;
        String str = uma.f64080a;
        handlerC3718wd.obtainMessage(2, c2980exM12242a).sendToTarget();
    }

    @Override // p000.ut5
    /* JADX INFO: renamed from: f */
    public final void mo4801f(int i, int i2, int i3, long j) {
        mo4798c();
        C2980ex c2980exM12242a = m12242a();
        c2980exM12242a.f38013a = i;
        c2980exM12242a.f38014b = i2;
        c2980exM12242a.f38016d = j;
        c2980exM12242a.f38017e = i3;
        HandlerC3718wd handlerC3718wd = this.f39827c;
        String str = uma.f64080a;
        handlerC3718wd.obtainMessage(1, c2980exM12242a).sendToTarget();
    }

    @Override // p000.ut5
    public final void flush() {
        if (this.f39830f) {
            try {
                HandlerC3718wd handlerC3718wd = this.f39827c;
                handlerC3718wd.getClass();
                handlerC3718wd.removeCallbacksAndMessages(null);
                hg1 hg1Var = this.f39829e;
                synchronized (hg1Var) {
                    hg1Var.f42318b = false;
                }
                HandlerC3718wd handlerC3718wd2 = this.f39827c;
                handlerC3718wd2.getClass();
                handlerC3718wd2.obtainMessage(3).sendToTarget();
                synchronized (hg1Var) {
                    while (!hg1Var.f42318b) {
                        hg1Var.f42317a.getClass();
                        hg1Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                uk9.m22779n(e);
            }
        }
    }

    @Override // p000.ut5
    public final void shutdown() {
        if (this.f39830f) {
            flush();
            this.f39826b.quit();
        }
        this.f39830f = false;
    }

    @Override // p000.ut5
    public final void start() {
        if (this.f39830f) {
            return;
        }
        HandlerThread handlerThread = this.f39826b;
        handlerThread.start();
        this.f39827c = new HandlerC3718wd(this, handlerThread.getLooper(), 1);
        this.f39830f = true;
    }
}
