package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class k79 extends t80 {

    /* JADX INFO: renamed from: n */
    public int f46823n;

    /* JADX INFO: renamed from: o */
    public boolean f46824o;

    /* JADX INFO: renamed from: p */
    public int f46825p;

    /* JADX INFO: renamed from: q */
    public long f46826q;

    /* JADX INFO: renamed from: s */
    public byte[] f46828s;

    /* JADX INFO: renamed from: v */
    public byte[] f46831v;

    /* JADX INFO: renamed from: r */
    public int f46827r = 0;

    /* JADX INFO: renamed from: t */
    public int f46829t = 0;

    /* JADX INFO: renamed from: u */
    public int f46830u = 0;

    /* JADX INFO: renamed from: l */
    public final long f46821l = 100000;

    /* JADX INFO: renamed from: i */
    public final float f46818i = 0.2f;

    /* JADX INFO: renamed from: m */
    public final long f46822m = 2000000;

    /* JADX INFO: renamed from: k */
    public final int f46820k = 10;

    /* JADX INFO: renamed from: j */
    public final short f46819j = 1024;

    public k79() {
        byte[] bArr = uma.f64081b;
        this.f46828s = bArr;
        this.f46831v = bArr;
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: a */
    public final C3850zy mo11768a(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        if (c3850zy.f72368c == 2) {
            return c3850zy.f72366a == -1 ? C3850zy.f72365e : c3850zy;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
    }

    @Override // p000.t80, p000.InterfaceC0828bz
    /* JADX INFO: renamed from: b */
    public final boolean mo4227b() {
        return super.mo4227b() && this.f46824o;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f61972g.hasRemaining()) {
            int i = this.f46825p;
            short s = this.f46819j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f46828s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.f46823n;
                        iPosition = wq1.m24103C(iLimit3, i2, i2, i2);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f46825p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    m21900m(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    uk9.m22770c();
                    return;
                }
                bna.m3987z(this.f46829t < this.f46828s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.f46823n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f46829t;
                int i4 = this.f46830u;
                int length2 = length + i4;
                byte[] bArr = this.f46828s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f46828s, length2, iMin);
                int i6 = this.f46830u + iMin;
                this.f46830u = i6;
                bna.m3987z(i6 <= this.f46828s.length);
                boolean z2 = z && iPosition3 < i5;
                m14941o(z2);
                if (z2) {
                    this.f46825p = 0;
                    this.f46827r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: j */
    public final void mo11769j() {
        if (mo4227b()) {
            C3850zy c3850zy = this.f61967b;
            int i = c3850zy.f72367b * 2;
            this.f46823n = i;
            int i2 = ((((int) ((this.f46821l * ((long) c3850zy.f72366a)) / 1000000)) / 2) / i) * i * 2;
            if (this.f46828s.length != i2) {
                this.f46828s = new byte[i2];
                this.f46831v = new byte[i2];
            }
        }
        this.f46825p = 0;
        this.f46826q = 0L;
        this.f46827r = 0;
        this.f46829t = 0;
        this.f46830u = 0;
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: k */
    public final void mo11770k() {
        if (this.f46830u > 0) {
            m14941o(true);
            this.f46827r = 0;
        }
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: l */
    public final void mo11771l() {
        this.f46824o = false;
        byte[] bArr = uma.f64081b;
        this.f46828s = bArr;
        this.f46831v = bArr;
    }

    /* JADX INFO: renamed from: n */
    public final int m14940n(int i) {
        int length = ((((int) ((this.f46822m * ((long) this.f61967b.f72366a)) / 1000000)) - this.f46827r) * this.f46823n) - (this.f46828s.length / 2);
        bna.m3987z(length >= 0);
        int iMin = (int) Math.min((i * this.f46818i) + 0.5f, length);
        int i2 = this.f46823n;
        return (iMin / i2) * i2;
    }

    /* JADX INFO: renamed from: o */
    public final void m14941o(boolean z) {
        int length;
        int iM14940n;
        int i = this.f46830u;
        byte[] bArr = this.f46828s;
        if (i == bArr.length || z) {
            if (this.f46827r == 0) {
                if (z) {
                    m14942p(i, 3);
                    length = i;
                } else {
                    bna.m3987z(i >= bArr.length / 2);
                    length = this.f46828s.length / 2;
                    m14942p(length, 0);
                }
                iM14940n = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iM14940n2 = m14940n(length2) + (this.f46828s.length / 2);
                m14942p(iM14940n2, 2);
                iM14940n = iM14940n2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iM14940n = m14940n(length);
                m14942p(iM14940n, 1);
            }
            if (!(length % this.f46823n == 0)) {
                C3386nv.m17633t(b34.m3207B("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
                return;
            }
            bna.m3987z(i >= iM14940n);
            this.f46830u -= length;
            int i2 = this.f46829t + length;
            this.f46829t = i2;
            this.f46829t = i2 % this.f46828s.length;
            int i3 = this.f46827r;
            int i4 = this.f46823n;
            this.f46827r = (iM14940n / i4) + i3;
            this.f46826q += (long) ((length - iM14940n) / i4);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m14942p(int i, int i2) {
        if (i == 0) {
            return;
        }
        bna.m3969q(this.f46830u >= i);
        int i3 = this.f46829t;
        if (i2 == 2) {
            int i4 = this.f46830u;
            int i5 = i3 + i4;
            byte[] bArr = this.f46828s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.f46831v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                byte[] bArr2 = this.f46831v;
                if (length >= i) {
                    System.arraycopy(bArr, length - i, bArr2, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, bArr2, 0, i6);
                    System.arraycopy(this.f46828s, 0, this.f46831v, i6, length);
                }
            }
        } else {
            int i7 = i3 + i;
            byte[] bArr3 = this.f46828s;
            int length2 = bArr3.length;
            byte[] bArr4 = this.f46831v;
            if (i7 <= length2) {
                System.arraycopy(bArr3, i3, bArr4, 0, i);
            } else {
                int length3 = bArr3.length - i3;
                System.arraycopy(bArr3, i3, bArr4, 0, length3);
                System.arraycopy(this.f46828s, 0, this.f46831v, length3, i - length3);
            }
        }
        bna.m3965o("sizeToOutput is not aligned to frame size: %s", i, i % this.f46823n == 0);
        bna.m3987z(this.f46829t < this.f46828s.length);
        byte[] bArr5 = this.f46831v;
        bna.m3965o("byteOutput size is not aligned to frame size %s", i, i % this.f46823n == 0);
        if (i2 != 3) {
            for (int i8 = 0; i8 < i; i8 += 2) {
                int i9 = i8 + 1;
                int i10 = (bArr5[i9] << 8) | (bArr5[i8] & 255);
                int i11 = this.f46820k;
                if (i2 == 0) {
                    i11 = ((((i8 * DescriptorProtos.Edition.EDITION_2023_VALUE) / (i - 1)) * (i11 - 100)) / DescriptorProtos.Edition.EDITION_2023_VALUE) + 100;
                } else if (i2 == 2) {
                    i11 += (((i8 * DescriptorProtos.Edition.EDITION_2023_VALUE) * (100 - i11)) / (i - 1)) / DescriptorProtos.Edition.EDITION_2023_VALUE;
                }
                int i12 = (i10 * i11) / 100;
                if (i12 >= 32767) {
                    bArr5[i8] = -1;
                    bArr5[i9] = 127;
                } else if (i12 <= -32768) {
                    bArr5[i8] = 0;
                    bArr5[i9] = -128;
                } else {
                    bArr5[i8] = (byte) (i12 & 255);
                    bArr5[i9] = (byte) (i12 >> 8);
                }
            }
        }
        m21900m(i).put(bArr5, 0, i).flip();
    }
}
