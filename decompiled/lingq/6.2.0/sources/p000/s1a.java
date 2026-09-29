package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class s1a extends t80 {
    @Override // p000.t80
    /* JADX INFO: renamed from: a */
    public final C3850zy mo11768a(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c3850zy.f72368c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4 || i == 1879048192) {
            return i != 2 ? new C3850zy(c3850zy.f72366a, c3850zy.f72367b, 2) : C3850zy.f72365e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f61967b.f72368c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else {
            if (i2 != 21) {
                if (i2 == 22) {
                    i /= 2;
                } else if (i2 != 268435456) {
                    if (i2 != 1342177280) {
                        if (i2 == 1610612736) {
                            i /= 2;
                        } else {
                            if (i2 != 1879048192) {
                                uk9.m22770c();
                                return;
                            }
                            i /= 4;
                        }
                    }
                }
            }
            i /= 3;
            i *= 2;
        }
        ByteBuffer byteBufferM21900m = m21900m(i);
        int i3 = this.f61967b.f72368c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put((byte) 0);
                byteBufferM21900m.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sM22811f = (short) (uma.m22811f(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferM21900m.put((byte) (sM22811f & 255));
                byteBufferM21900m.put((byte) ((sM22811f >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 21) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put(byteBuffer.get(iPosition + 1));
                byteBufferM21900m.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else if (i3 == 22) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put(byteBuffer.get(iPosition + 2));
                byteBufferM21900m.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put(byteBuffer.get(iPosition + 1));
                byteBufferM21900m.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 1342177280) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put(byteBuffer.get(iPosition + 1));
                byteBufferM21900m.put(byteBuffer.get(iPosition));
                iPosition += 3;
            }
        } else if (i3 == 1610612736) {
            while (iPosition < iLimit) {
                byteBufferM21900m.put(byteBuffer.get(iPosition + 1));
                byteBufferM21900m.put(byteBuffer.get(iPosition));
                iPosition += 4;
            }
        } else {
            if (i3 != 1879048192) {
                uk9.m22770c();
                return;
            }
            while (iPosition < iLimit) {
                short sMax = (short) (Math.max(-1.0d, Math.min(byteBuffer.getDouble(iPosition), 1.0d)) * 32767.0d);
                byteBufferM21900m.put((byte) (sMax & 255));
                byteBufferM21900m.put((byte) ((sMax >> 8) & 255));
                iPosition += 8;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM21900m.flip();
    }
}
