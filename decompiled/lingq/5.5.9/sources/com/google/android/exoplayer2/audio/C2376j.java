package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2376j extends AbstractC2370d {

    /* JADX INFO: renamed from: i */
    public final long f12002i = 150000;

    /* JADX INFO: renamed from: j */
    public final long f12003j = 20000;

    /* JADX INFO: renamed from: k */
    public final short f12004k = 1024;

    /* JADX INFO: renamed from: l */
    public int f12005l;

    /* JADX INFO: renamed from: m */
    public boolean f12006m;

    /* JADX INFO: renamed from: n */
    public byte[] f12007n;

    /* JADX INFO: renamed from: o */
    public byte[] f12008o;

    /* JADX INFO: renamed from: p */
    public int f12009p;

    /* JADX INFO: renamed from: q */
    public int f12010q;

    /* JADX INFO: renamed from: r */
    public int f12011r;

    /* JADX INFO: renamed from: s */
    public boolean f12012s;

    /* JADX INFO: renamed from: t */
    public long f12013t;

    public C2376j() {
        byte[] bArr = C10134c0.f51359f;
        this.f12007n = bArr;
        this.f12008o = bArr;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c2354a.f11839c == 2) {
            return this.f12006m ? c2354a : AudioProcessor.C2354a.f11836e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: b */
    public final boolean mo6787b() {
        return this.f12006m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        int iPosition;
        loop0: while (true) {
            while (true) {
                if (!byteBuffer.hasRemaining() || this.f11985g.hasRemaining()) {
                    break loop0;
                }
                int i10 = this.f12009p;
                if (i10 == 0) {
                    int iLimit = byteBuffer.limit();
                    byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.f12007n.length));
                    int iLimit2 = byteBuffer.limit();
                    while (true) {
                        iLimit2 -= 2;
                        if (iLimit2 < byteBuffer.position()) {
                            iPosition = byteBuffer.position();
                            break;
                        } else if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.f12004k) {
                            int i11 = this.f12005l;
                            iPosition = ((iLimit2 / i11) * i11) + i11;
                            break;
                        }
                    }
                    if (iPosition == byteBuffer.position()) {
                        this.f12009p = 1;
                    } else {
                        byteBuffer.limit(iPosition);
                        int iRemaining = byteBuffer.remaining();
                        m6860l(iRemaining).put(byteBuffer).flip();
                        if (iRemaining > 0) {
                            this.f12012s = true;
                        }
                    }
                    byteBuffer.limit(iLimit);
                } else if (i10 == 1) {
                    int iLimit3 = byteBuffer.limit();
                    int iM6895m = m6895m(byteBuffer);
                    int iPosition2 = iM6895m - byteBuffer.position();
                    byte[] bArr = this.f12007n;
                    int length = bArr.length;
                    int i12 = this.f12010q;
                    int i13 = length - i12;
                    if (iM6895m >= iLimit3 || iPosition2 >= i13) {
                        int iMin = Math.min(iPosition2, i13);
                        byteBuffer.limit(byteBuffer.position() + iMin);
                        byteBuffer.get(this.f12007n, this.f12010q, iMin);
                        int i14 = this.f12010q + iMin;
                        this.f12010q = i14;
                        byte[] bArr2 = this.f12007n;
                        if (i14 == bArr2.length) {
                            if (this.f12012s) {
                                m6896n(bArr2, this.f12011r);
                                this.f12013t += (long) ((this.f12010q - (this.f12011r * 2)) / this.f12005l);
                            } else {
                                this.f12013t += (long) ((i14 - this.f12011r) / this.f12005l);
                            }
                            m6897o(byteBuffer, this.f12007n, this.f12010q);
                            this.f12010q = 0;
                            this.f12009p = 2;
                        }
                        byteBuffer.limit(iLimit3);
                    } else {
                        m6896n(bArr, i12);
                        this.f12010q = 0;
                        this.f12009p = 0;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    int iLimit4 = byteBuffer.limit();
                    int iM6895m2 = m6895m(byteBuffer);
                    byteBuffer.limit(iM6895m2);
                    this.f12013t += (long) (byteBuffer.remaining() / this.f12005l);
                    m6897o(byteBuffer, this.f12008o, this.f12011r);
                    if (iM6895m2 < iLimit4) {
                        m6896n(this.f12008o, this.f12011r);
                        this.f12009p = 0;
                        byteBuffer.limit(iLimit4);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: i */
    public final void mo6857i() {
        if (this.f12006m) {
            AudioProcessor.C2354a c2354a = this.f11980b;
            int i10 = c2354a.f11840d;
            this.f12005l = i10;
            int i11 = c2354a.f11837a;
            int i12 = ((int) ((this.f12002i * ((long) i11)) / 1000000)) * i10;
            if (this.f12007n.length != i12) {
                this.f12007n = new byte[i12];
            }
            int i13 = ((int) ((this.f12003j * ((long) i11)) / 1000000)) * i10;
            this.f12011r = i13;
            if (this.f12008o.length != i13) {
                this.f12008o = new byte[i13];
            }
        }
        this.f12009p = 0;
        this.f12013t = 0L;
        this.f12010q = 0;
        this.f12012s = false;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: j */
    public final void mo6858j() {
        int i10 = this.f12010q;
        if (i10 > 0) {
            m6896n(this.f12007n, i10);
        }
        if (this.f12012s) {
            return;
        }
        this.f12013t += (long) (this.f12011r / this.f12005l);
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: k */
    public final void mo6859k() {
        this.f12006m = false;
        this.f12011r = 0;
        byte[] bArr = C10134c0.f51359f;
        this.f12007n = bArr;
        this.f12008o = bArr;
    }

    /* JADX INFO: renamed from: m */
    public final int m6895m(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.f12004k) {
                int i10 = this.f12005l;
                return (iPosition / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    /* JADX INFO: renamed from: n */
    public final void m6896n(byte[] bArr, int i10) {
        m6860l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f12012s = true;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m6897o(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int iMin = Math.min(byteBuffer.remaining(), this.f12011r);
        int i11 = this.f12011r - iMin;
        System.arraycopy(bArr, i10 - i11, this.f12008o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.f12008o, i11, iMin);
    }
}
