package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class r1a extends t80 {

    /* JADX INFO: renamed from: i */
    public static final int f58497i = Float.floatToIntBits(Float.NaN);

    /* JADX INFO: renamed from: n */
    public static void m20243n(int i, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (((double) i) * 4.656612875245797E-10d));
        if (iFloatToIntBits == f58497i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: a */
    public final C3850zy mo11768a(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c3850zy.f72368c;
        if (uma.m22829x(i) || i == 2) {
            return i != 4 ? new C3850zy(c3850zy.f72366a, c3850zy.f72367b, 4) : C3850zy.f72365e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM21900m;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.f61967b.f72368c;
        if (i2 == 2) {
            byteBufferM21900m = m21900m(i * 2);
            while (iPosition < iLimit) {
                m20243n(((byteBuffer.get(iPosition) & 255) << 16) | ((byteBuffer.get(iPosition + 1) & 255) << 24), byteBufferM21900m);
                iPosition += 2;
            }
        } else if (i2 == 1342177280) {
            byteBufferM21900m = m21900m((i / 3) * 4);
            while (iPosition < iLimit) {
                m20243n(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM21900m);
                iPosition += 3;
            }
        } else if (i2 == 1610612736) {
            byteBufferM21900m = m21900m(i);
            while (iPosition < iLimit) {
                m20243n((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferM21900m);
                iPosition += 4;
            }
        } else if (i2 == 1879048192) {
            byteBufferM21900m = m21900m(i / 2);
            while (iPosition < iLimit) {
                byteBufferM21900m.putFloat((float) byteBuffer.getDouble(iPosition));
                iPosition += 8;
            }
        } else if (i2 == 21) {
            byteBufferM21900m = m21900m((i / 3) * 4);
            while (iPosition < iLimit) {
                m20243n(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferM21900m);
                iPosition += 3;
            }
        } else {
            if (i2 != 22) {
                uk9.m22770c();
                return;
            }
            byteBufferM21900m = m21900m(i);
            while (iPosition < iLimit) {
                m20243n((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferM21900m);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferM21900m.flip();
    }
}
