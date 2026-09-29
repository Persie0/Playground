package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2378l extends AbstractC2370d {

    /* JADX INFO: renamed from: i */
    public int f12029i;

    /* JADX INFO: renamed from: j */
    public int f12030j;

    /* JADX INFO: renamed from: k */
    public boolean f12031k;

    /* JADX INFO: renamed from: l */
    public int f12032l;

    /* JADX INFO: renamed from: m */
    public byte[] f12033m = C10134c0.f51359f;

    /* JADX INFO: renamed from: n */
    public int f12034n;

    /* JADX INFO: renamed from: o */
    public long f12035o;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        if (c2354a.f11839c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
        }
        this.f12031k = true;
        if (this.f12029i == 0) {
            if (this.f12030j == 0) {
                c2354a = AudioProcessor.C2354a.f11836e;
            }
        }
        return c2354a;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: d */
    public final boolean mo6789d() {
        return super.mo6789d() && this.f12034n == 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d, com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: e */
    public final ByteBuffer mo6790e() {
        int i10;
        if (super.mo6789d() && (i10 = this.f12034n) > 0) {
            m6860l(i10).put(this.f12033m, 0, this.f12034n).flip();
            this.f12034n = 0;
        }
        return super.mo6790e();
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.f12032l);
        this.f12035o += (long) (iMin / this.f11980b.f11840d);
        this.f12032l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f12032l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f12034n + i11) - this.f12033m.length;
        ByteBuffer byteBufferM6860l = m6860l(length);
        int iM19041h = C10134c0.m19041h(length, 0, this.f12034n);
        byteBufferM6860l.put(this.f12033m, 0, iM19041h);
        int iM19041h2 = C10134c0.m19041h(length - iM19041h, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iM19041h2);
        byteBufferM6860l.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iM19041h2;
        int i13 = this.f12034n - iM19041h;
        this.f12034n = i13;
        byte[] bArr = this.f12033m;
        System.arraycopy(bArr, iM19041h, bArr, 0, i13);
        byteBuffer.get(this.f12033m, this.f12034n, i12);
        this.f12034n += i12;
        byteBufferM6860l.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: i */
    public final void mo6857i() {
        if (this.f12031k) {
            this.f12031k = false;
            int i10 = this.f12030j;
            int i11 = this.f11980b.f11840d;
            this.f12033m = new byte[i10 * i11];
            this.f12032l = this.f12029i * i11;
        }
        this.f12034n = 0;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: j */
    public final void mo6858j() {
        if (this.f12031k) {
            int i10 = this.f12034n;
            if (i10 > 0) {
                this.f12035o += (long) (i10 / this.f11980b.f11840d);
            }
            this.f12034n = 0;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: k */
    public final void mo6859k() {
        this.f12033m = C10134c0.f51359f;
    }
}
