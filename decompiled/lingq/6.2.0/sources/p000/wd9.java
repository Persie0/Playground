package p000;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class wd9 implements InterfaceC0828bz {

    /* JADX INFO: renamed from: b */
    public int f66659b;

    /* JADX INFO: renamed from: c */
    public float f66660c;

    /* JADX INFO: renamed from: d */
    public float f66661d;

    /* JADX INFO: renamed from: e */
    public C3850zy f66662e;

    /* JADX INFO: renamed from: f */
    public C3850zy f66663f;

    /* JADX INFO: renamed from: g */
    public C3850zy f66664g;

    /* JADX INFO: renamed from: h */
    public C3850zy f66665h;

    /* JADX INFO: renamed from: i */
    public boolean f66666i;

    /* JADX INFO: renamed from: j */
    public vd9 f66667j;

    /* JADX INFO: renamed from: k */
    public ByteBuffer f66668k;

    /* JADX INFO: renamed from: l */
    public ByteBuffer f66669l;

    /* JADX INFO: renamed from: m */
    public long f66670m;

    /* JADX INFO: renamed from: n */
    public long f66671n;

    /* JADX INFO: renamed from: o */
    public boolean f66672o;

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: b */
    public final boolean mo4227b() {
        if (this.f66663f.f72366a != -1) {
            return Math.abs(this.f66660c - 1.0f) >= 1.0E-4f || Math.abs(this.f66661d - 1.0f) >= 1.0E-4f || this.f66663f.f72366a != this.f66662e.f72366a;
        }
        return false;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: c */
    public final boolean mo4228c() {
        if (!this.f66672o) {
            return false;
        }
        vd9 vd9Var = this.f66667j;
        return vd9Var == null || vd9Var.m23236b() == 0;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: d */
    public final ByteBuffer mo4229d() {
        int iM23236b;
        vd9 vd9Var = this.f66667j;
        if (vd9Var != null && (iM23236b = vd9Var.m23236b()) > 0) {
            if (this.f66668k.capacity() < iM23236b) {
                this.f66668k = ByteBuffer.allocateDirect(iM23236b).order(ByteOrder.nativeOrder());
            } else {
                this.f66668k.clear();
            }
            ByteBuffer byteBuffer = this.f66668k;
            int i = vd9Var.f65244b;
            td9 td9Var = vd9Var.f65251i;
            bna.m3987z(vd9Var.f65253k >= 0);
            int iMin = Math.min(byteBuffer.remaining() / (td9Var.mo21267o() * i), vd9Var.f65253k);
            td9Var.mo21254b(iMin, byteBuffer);
            vd9Var.f65253k -= iMin;
            System.arraycopy(td9Var.mo21261i(), iMin * i, td9Var.mo21261i(), 0, vd9Var.f65253k * i);
            this.f66668k.flip();
            this.f66671n += (long) iM23236b;
            this.f66669l = this.f66668k;
        }
        ByteBuffer byteBuffer2 = this.f66669l;
        this.f66669l = InterfaceC0828bz.f9188a;
        return byteBuffer2;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: e */
    public final void mo4230e(C0791az c0791az) {
        if (mo4227b()) {
            C3850zy c3850zy = this.f66662e;
            this.f66664g = c3850zy;
            C3850zy c3850zy2 = this.f66663f;
            this.f66665h = c3850zy2;
            if (this.f66666i) {
                this.f66667j = new vd9(c3850zy.f72366a, c3850zy.f72367b, this.f66660c, this.f66661d, c3850zy2.f72366a, c3850zy.f72368c == 4);
            } else {
                vd9 vd9Var = this.f66667j;
                if (vd9Var != null) {
                    vd9Var.f65252j = 0;
                    vd9Var.f65253k = 0;
                    vd9Var.f65254l = 0;
                    vd9Var.f65255m = 0;
                    vd9Var.f65256n = 0;
                    vd9Var.f65257o = 0;
                    vd9Var.f65258p = 0;
                    vd9Var.f65259q = 0.0d;
                    vd9Var.f65251i.flush();
                }
            }
        }
        this.f66669l = InterfaceC0828bz.f9188a;
        this.f66670m = 0L;
        this.f66671n = 0L;
        this.f66672o = false;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: f */
    public final void mo4231f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            vd9 vd9Var = this.f66667j;
            vd9Var.getClass();
            this.f66670m += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = vd9Var.f65244b;
            td9 td9Var = vd9Var.f65251i;
            int iMo21267o = iRemaining / (td9Var.mo21267o() * i);
            td9Var.mo21268p(iMo21267o);
            td9Var.mo21253a(iRemaining, byteBuffer);
            vd9Var.f65252j += iMo21267o;
            vd9Var.m23238d();
        }
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: g */
    public final C3850zy mo4232g(C3850zy c3850zy) throws AudioProcessor$UnhandledAudioFormatException {
        int i = c3850zy.f72368c;
        if (i != 2 && i != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(c3850zy);
        }
        int i2 = this.f66659b;
        if (i2 == -1) {
            i2 = c3850zy.f72366a;
        }
        this.f66662e = c3850zy;
        C3850zy c3850zy2 = new C3850zy(i2, c3850zy.f72367b, i);
        this.f66663f = c3850zy2;
        this.f66666i = true;
        return c3850zy2;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: h */
    public final void mo4233h() {
        vd9 vd9Var = this.f66667j;
        if (vd9Var != null) {
            int i = vd9Var.f65252j;
            float f = vd9Var.f65245c;
            float f2 = vd9Var.f65246d;
            double d = f / f2;
            double d2 = vd9Var.f65247e * f2;
            int i2 = vd9Var.f65257o;
            int i3 = vd9Var.f65253k + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + vd9Var.f65259q) + ((double) vd9Var.f65254l)) / d2) + 0.5d));
            vd9Var.f65259q = 0.0d;
            td9 td9Var = vd9Var.f65251i;
            int i4 = vd9Var.f65250h * 2;
            td9Var.mo21268p(i4 + i);
            td9Var.mo21256d(i * vd9Var.f65244b, i4);
            vd9Var.f65252j = i4 + vd9Var.f65252j;
            vd9Var.m23238d();
            if (vd9Var.f65253k > i3) {
                vd9Var.f65253k = Math.max(i3, 0);
            }
            vd9Var.f65252j = 0;
            vd9Var.f65257o = 0;
            vd9Var.f65254l = 0;
        }
        this.f66672o = true;
    }

    @Override // p000.InterfaceC0828bz
    /* JADX INFO: renamed from: i */
    public final long mo4234i(long j) {
        if (this.f66671n < 1024) {
            return (long) (j / ((double) this.f66660c));
        }
        long j2 = this.f66670m;
        vd9 vd9Var = this.f66667j;
        vd9Var.getClass();
        long jM23237c = j2 - ((long) vd9Var.m23237c());
        int i = this.f66665h.f72366a;
        int i2 = this.f66664g.f72366a;
        long j3 = this.f66671n;
        return i == i2 ? uma.m22803H(j, j3, jM23237c, RoundingMode.DOWN) : uma.m22803H(j, j3 * ((long) i2), jM23237c * ((long) i), RoundingMode.DOWN);
    }

    @Override // p000.InterfaceC0828bz
    public final void reset() {
        this.f66660c = 1.0f;
        this.f66661d = 1.0f;
        C3850zy c3850zy = C3850zy.f72365e;
        this.f66662e = c3850zy;
        this.f66663f = c3850zy;
        this.f66664g = c3850zy;
        this.f66665h = c3850zy;
        ByteBuffer byteBuffer = InterfaceC0828bz.f9188a;
        this.f66668k = byteBuffer;
        this.f66669l = byteBuffer;
        this.f66659b = -1;
        this.f66666i = false;
        this.f66667j = null;
        this.f66670m = 0L;
        this.f66671n = 0L;
        this.f66672o = false;
    }
}
