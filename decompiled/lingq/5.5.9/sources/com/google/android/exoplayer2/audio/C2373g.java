package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2373g extends AbstractC2370d {

    /* JADX INFO: renamed from: i */
    public static final int f11989i = Float.floatToIntBits(Float.NaN);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = c2354a.f11839c;
        if (i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 4 ? new AudioProcessor.C2354a(c2354a.f11837a, c2354a.f11838b, 4) : AudioProcessor.C2354a.f11836e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM6860l;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.f11980b.f11839c;
        int i12 = f11989i;
        if (i11 == 536870912) {
            byteBufferM6860l = m6860l((i10 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i12) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferM6860l.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i11 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferM6860l = m6860l(i10);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i12) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferM6860l.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM6860l.flip();
    }
}
