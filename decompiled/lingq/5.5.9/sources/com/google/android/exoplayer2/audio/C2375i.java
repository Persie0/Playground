package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import p479xa.C10134c0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2375i extends AbstractC2370d {
    @Override // com.google.android.exoplayer2.audio.AbstractC2370d
    /* JADX INFO: renamed from: a */
    public final AudioProcessor.C2354a mo6856a(AudioProcessor.C2354a c2354a) throws AudioProcessor.UnhandledAudioFormatException {
        int i10 = c2354a.f11839c;
        if (i10 == 3 || i10 == 2 || i10 == 268435456 || i10 == 536870912 || i10 == 805306368 || i10 == 4) {
            return i10 != 2 ? new AudioProcessor.C2354a(c2354a.f11837a, c2354a.f11838b, 2) : AudioProcessor.C2354a.f11836e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(c2354a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0052  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055 A[LOOP:0: B:28:0x0053->B:29:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x006d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0074  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077 A[LOOP:1: B:34:0x0075->B:35:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0090 A[LOOP:2: B:37:0x008e->B:38:0x0090, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[ADDED_TO_REGION, LOOP:3: B:39:0x00a4->B:40:0x00a6, LOOP_START, PHI: r0
      0x00a4: PHI (r0v4 int) = (r0v0 int), (r0v5 int) binds: [B:22:0x0049, B:40:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a6 A[LOOP:3: B:39:0x00a4->B:40:0x00a6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2 A[LOOP:4: B:42:0x00d0->B:43:0x00d2, LOOP_END] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    /* JADX INFO: renamed from: f */
    public final void mo6791f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM6860l;
        int i10;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i11 = iLimit - iPosition;
        int i12 = this.f11980b.f11839c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 == 536870912) {
                        i11 /= 3;
                    } else if (i12 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                byteBufferM6860l = m6860l(i11);
                i10 = this.f11980b.f11839c;
                if (i10 == 3) {
                    while (iPosition < iLimit) {
                        byteBufferM6860l.put((byte) 0);
                        byteBufferM6860l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                        iPosition++;
                    }
                } else if (i10 == 4) {
                    while (iPosition < iLimit) {
                        short sM19040g = (short) (C10134c0.m19040g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                        byteBufferM6860l.put((byte) (sM19040g & 255));
                        byteBufferM6860l.put((byte) ((sM19040g >> 8) & 255));
                        iPosition += 4;
                    }
                } else if (i10 == 268435456) {
                    while (iPosition < iLimit) {
                        byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                        byteBufferM6860l.put(byteBuffer.get(iPosition));
                        iPosition += 2;
                    }
                } else if (i10 == 536870912) {
                    while (iPosition < iLimit) {
                        byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                        byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                } else {
                    if (i10 != 805306368) {
                        throw new IllegalStateException();
                    }
                    while (iPosition < iLimit) {
                        byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                        byteBufferM6860l.put(byteBuffer.get(iPosition + 3));
                        iPosition += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                byteBufferM6860l.flip();
            }
            i11 /= 2;
            byteBufferM6860l = m6860l(i11);
            i10 = this.f11980b.f11839c;
            if (i10 == 3) {
                while (iPosition < iLimit) {
                    byteBufferM6860l.put((byte) 0);
                    byteBufferM6860l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                    iPosition++;
                }
            } else if (i10 == 4) {
                while (iPosition < iLimit) {
                    short sM19040g2 = (short) (C10134c0.m19040g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                    byteBufferM6860l.put((byte) (sM19040g2 & 255));
                    byteBufferM6860l.put((byte) ((sM19040g2 >> 8) & 255));
                    iPosition += 4;
                }
            } else if (i10 == 268435456) {
                while (iPosition < iLimit) {
                    byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                    byteBufferM6860l.put(byteBuffer.get(iPosition));
                    iPosition += 2;
                }
            } else if (i10 == 536870912) {
                while (iPosition < iLimit) {
                    byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                    byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                    iPosition += 3;
                }
            } else {
                if (i10 != 805306368) {
                    throw new IllegalStateException();
                }
                while (iPosition < iLimit) {
                    byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                    byteBufferM6860l.put(byteBuffer.get(iPosition + 3));
                    iPosition += 4;
                }
            }
            byteBuffer.position(byteBuffer.limit());
            byteBufferM6860l.flip();
        }
        i11 *= 2;
        byteBufferM6860l = m6860l(i11);
        i10 = this.f11980b.f11839c;
        if (i10 == 3) {
            while (iPosition < iLimit) {
                byteBufferM6860l.put((byte) 0);
                byteBufferM6860l.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i10 == 4) {
            while (iPosition < iLimit) {
                short sM19040g3 = (short) (C10134c0.m19040g(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM6860l.put((byte) (sM19040g3 & 255));
                byteBufferM6860l.put((byte) ((sM19040g3 >> 8) & 255));
                iPosition += 4;
            }
        } else if (i10 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                byteBufferM6860l.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i10 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferM6860l.put(byteBuffer.get(iPosition + 1));
                byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i10 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferM6860l.put(byteBuffer.get(iPosition + 2));
                byteBufferM6860l.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM6860l.flip();
    }
}
