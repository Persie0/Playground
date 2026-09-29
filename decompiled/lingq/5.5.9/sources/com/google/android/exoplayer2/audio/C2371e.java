package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2371e extends AbstractC2370d {

    /* JADX INFO: renamed from: i */
    public int[] f11987i;

    /* JADX INFO: renamed from: j */
    public int[] f11988j;

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        int[] iArr = this.f11987i;
        if (iArr == null) {
            return AudioProcessor.C2354a.f11836e;
        }
        if (c2354a.f11839c != 2) {
            throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
        }
        int length = iArr.length;
        int i10 = c2354a.f11838b;
        boolean z10 = i10 != length;
        int i11 = 0;
        while (i11 < iArr.length) {
            int i12 = iArr[i11];
            if (i12 >= i10) {
                throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
            }
            z10 |= i12 != i11;
            i11++;
        }
        return z10 ? new AudioProcessor.C2354a(c2354a.f11837a, iArr.length, 2) : AudioProcessor.C2354a.f11836e;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        int[] iArr = this.f11988j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM6860l = m6860l(((iLimit - iPosition) / this.f11980b.f11840d) * this.f11981c.f11840d);
        while (iPosition < iLimit) {
            for (int i10 : iArr) {
                byteBufferM6860l.putShort(byteBuffer.getShort((i10 * 2) + iPosition));
            }
            iPosition += this.f11980b.f11840d;
        }
        byteBuffer.position(iLimit);
        byteBufferM6860l.flip();
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: i */
    public final void mo6857i() {
        this.f11988j = this.f11987i;
    }

    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: k */
    public final void mo6859k() {
        this.f11988j = null;
        this.f11987i = null;
    }
}
