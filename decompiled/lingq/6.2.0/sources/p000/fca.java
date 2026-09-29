package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class fca extends t80 {

    /* JADX INFO: renamed from: i */
    public int f38861i;

    /* JADX INFO: renamed from: j */
    public int f38862j;

    /* JADX INFO: renamed from: k */
    public boolean f38863k;

    /* JADX INFO: renamed from: l */
    public int f38864l;

    /* JADX INFO: renamed from: m */
    public byte[] f38865m;

    /* JADX INFO: renamed from: n */
    public int f38866n;

    /* JADX INFO: renamed from: o */
    public long f38867o;

    @Override // p000.t80
    /* JADX INFO: renamed from: a */
    public final C3850zy mo11768a(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        if (!uma.m22830y(c3850zy.f72368c)) {
            throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
        }
        this.f38863k = true;
        return (this.f38861i == 0 && this.f38862j == 0) ? C3850zy.f72365e : c3850zy;
    }

    @Override // p000.t80, p000.InterfaceC0828bz
    /* JADX INFO: renamed from: c */
    public final boolean mo4228c() {
        return super.mo4228c() && this.f38866n == 0;
    }

    @Override // p000.t80, p000.InterfaceC0828bz
    /* JADX INFO: renamed from: d */
    public final ByteBuffer mo4229d() {
        int i;
        if (super.mo4228c() && (i = this.f38866n) > 0) {
            m21900m(i).put(this.f38865m, 0, this.f38866n).flip();
            this.f38866n = 0;
        }
        return super.mo4229d();
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.f38864l);
        this.f38867o += (long) (iMin / this.f61967b.f72369d);
        this.f38864l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.f38864l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.f38866n + i2) - this.f38865m.length;
        ByteBuffer byteBufferM21900m = m21900m(length);
        int iM22812g = uma.m22812g(length, 0, this.f38866n);
        byteBufferM21900m.put(this.f38865m, 0, iM22812g);
        int iM22812g2 = uma.m22812g(length - iM22812g, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iM22812g2);
        byteBufferM21900m.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iM22812g2;
        int i4 = this.f38866n - iM22812g;
        this.f38866n = i4;
        byte[] bArr = this.f38865m;
        System.arraycopy(bArr, iM22812g, bArr, 0, i4);
        byteBuffer.get(this.f38865m, this.f38866n, i3);
        this.f38866n += i3;
        byteBufferM21900m.flip();
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: i */
    public final long mo4234i(long j) {
        return Math.max(0L, j - uma.m22801F(this.f61967b.f72366a, this.f38862j + this.f38861i));
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: j */
    public final void mo11769j() {
        if (this.f38863k) {
            this.f38863k = false;
            int i = this.f38862j;
            int i2 = this.f61967b.f72369d;
            this.f38865m = new byte[i * i2];
            this.f38864l = this.f38861i * i2;
        }
        this.f38866n = 0;
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: k */
    public final void mo11770k() {
        if (this.f38863k) {
            int i = this.f38866n;
            if (i > 0) {
                this.f38867o += (long) (i / this.f61967b.f72369d);
            }
            this.f38866n = 0;
        }
    }

    @Override // p000.t80
    /* JADX INFO: renamed from: l */
    public final void mo11771l() {
        this.f38865m = uma.f64081b;
    }
}
