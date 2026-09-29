package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class gu0 extends t80 {

    /* JADX INFO: renamed from: i */
    public int[] f41319i;

    /* JADX INFO: renamed from: j */
    public int[] f41320j;

    @Override // p000.t80
    /* JADX INFO: renamed from: a */
    public final C3850zy mo11768a(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c3850zy.f72368c;
        int[] iArr = this.f41319i;
        if (iArr == null) {
            return C3850zy.f72365e;
        }
        int i2 = c3850zy.f72367b;
        if (!uma.m22830y(i)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
        }
        boolean z = i2 != iArr.length;
        int i3 = 0;
        while (i3 < iArr.length) {
            int i4 = iArr[i3];
            if (i4 >= i2) {
                throw new AudioProcessor$UnhandledAudioFormatException("Channel map (" + Arrays.toString(iArr) + ") trying to access non-existent input channel.", c3850zy);
            }
            z |= i4 != i3;
            i3++;
        }
        return z ? new C3850zy(c3850zy.f72366a, iArr.length, i) : C3850zy.f72365e;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00db  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x010d  */
    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int[] iArr = this.f41320j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferM21900m = m21900m(((iLimit - iPosition) / this.f61967b.f72369d) * this.f61968c.f72369d);
        while (iPosition < iLimit) {
            for (int i5 : iArr) {
                int iM22819n = (uma.m22819n(this.f61967b.f72368c) * i5) + iPosition;
                int i6 = this.f61967b.f72368c;
                if (i6 == 2) {
                    byteBufferM21900m.putShort(byteBuffer.getShort(iM22819n));
                } else if (i6 == 3) {
                    byteBufferM21900m.put(byteBuffer.get(iM22819n));
                } else if (i6 == 4) {
                    byteBufferM21900m.putFloat(byteBuffer.getFloat(iM22819n));
                } else if (i6 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM22819n;
                    } else {
                        i = iM22819n + 2;
                    }
                    byte b = byteBuffer.get(i);
                    byte b2 = byteBuffer.get(iM22819n + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM22819n += 2;
                    }
                    i2 = ((((b << 24) & (-16777216)) | ((b2 << 16) & 16711680)) | ((byteBuffer.get(iM22819n) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0 || (i2 & (-8388608)) == -8388608) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bna.m3971r(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    bna.m3969q(byteBufferM21900m.remaining() >= 3);
                    if (byteBufferM21900m.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b3 = (byte) i3;
                    byte b4 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM21900m.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM21900m.put(b3).put(b4).put((byte) i4);
                } else if (i6 == 22) {
                    byteBufferM21900m.putInt(byteBuffer.getInt(iM22819n));
                } else if (i6 == 268435456) {
                    byteBufferM21900m.putShort(byteBuffer.getShort(iM22819n));
                } else if (i6 == 1342177280) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i = iM22819n;
                    } else {
                        i = iM22819n + 2;
                    }
                    byte b5 = byteBuffer.get(i);
                    byte b6 = byteBuffer.get(iM22819n + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iM22819n += 2;
                    }
                    i2 = ((((b5 << 24) & (-16777216)) | ((b6 << 16) & 16711680)) | ((byteBuffer.get(iM22819n) << 8) & 65280)) >> 8;
                    if ((i2 & (-16777216)) != 0) {
                        z = true;
                    } else {
                        z = true;
                    }
                    bna.m3971r(z, "Value out of range of 24-bit integer: %s", Integer.toHexString(i2));
                    bna.m3969q(byteBufferM21900m.remaining() >= 3);
                    if (byteBufferM21900m.order() == byteOrder) {
                        i3 = (i2 & 16711680) >> 16;
                    } else {
                        i3 = i2 & 255;
                    }
                    byte b7 = (byte) i3;
                    byte b8 = (byte) ((i2 & 65280) >> 8);
                    if (byteBufferM21900m.order() == byteOrder) {
                        i4 = i2 & 255;
                    } else {
                        i4 = (i2 & 16711680) >> 16;
                    }
                    byteBufferM21900m.put(b7).put(b8).put((byte) i4);
                } else if (i6 == 1610612736) {
                    byteBufferM21900m.putInt(byteBuffer.getInt(iM22819n));
                } else {
                    if (i6 != 1879048192) {
                        hm2.m13331a(this.f61967b.f72368c, "Unexpected encoding: ");
                        return;
                    }
                    byteBufferM21900m.putDouble(byteBuffer.getDouble(iM22819n));
                }
            }
            iPosition += this.f61967b.f72369d;
        }
        byteBuffer.position(iLimit);
        byteBufferM21900m.flip();
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: j */
    public final void mo11769j() {
        this.f41320j = this.f41319i;
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: l */
    public final void mo11771l() {
        this.f41320j = null;
        this.f41319i = null;
    }
}
