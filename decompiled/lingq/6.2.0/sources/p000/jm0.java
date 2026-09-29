package p000;

import androidx.media3.common.C0713b;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class jm0 extends y90 {

    /* JADX INFO: renamed from: N */
    public final m32 f45815N;

    /* JADX INFO: renamed from: O */
    public final k47 f45816O;

    /* JADX INFO: renamed from: P */
    public im0 f45817P;

    /* JADX INFO: renamed from: Q */
    public long f45818Q;

    public jm0() {
        super(6);
        this.f45815N = new m32(1);
        this.f45816O = new k47();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: D */
    public final int mo4251D(C0713b c0713b) {
        return "application/x-camera-motion".equals(c0713b.f6406o) ? y90.m24988f(4, 0, 0, 0) : y90.m24988f(0, 0, 0, 0);
    }

    @Override // p000.y90, p000.yb7
    /* JADX INFO: renamed from: d */
    public final void mo4256d(int i, Object obj) {
        if (i == 8) {
            this.f45817P = (im0) obj;
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: k */
    public final String mo4257k() {
        return "CameraMotionRenderer";
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: m */
    public final boolean mo4258m() {
        return m24993l();
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: o */
    public final boolean mo4259o() {
        return true;
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: p */
    public final void mo4260p() {
        im0 im0Var = this.f45817P;
        if (im0Var != null) {
            im0Var.mo12217a();
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: r */
    public final void mo4262r(long j, boolean z, boolean z2) {
        this.f45818Q = Long.MIN_VALUE;
        im0 im0Var = this.f45817P;
        if (im0Var != null) {
            im0Var.mo12217a();
        }
    }

    @Override // p000.y90
    /* JADX INFO: renamed from: z */
    public final void mo4266z(long j, long j2) {
        float[] fArr;
        while (!m24993l() && this.f45818Q < 100000 + j) {
            m32 m32Var = this.f45815N;
            m32Var.mo16607k();
            p33 p33Var = this.f69497c;
            p33Var.m18865G();
            if (m24994y(p33Var, m32Var, 0) != -4 || m32Var.m3751d(4)) {
                return;
            }
            long j3 = m32Var.f50502g;
            this.f45818Q = j3;
            boolean z = j3 < this.f69506l;
            if (this.f45817P != null && !z) {
                m32Var.m16610o();
                ByteBuffer byteBuffer = m32Var.f50500e;
                String str = uma.f64080a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    k47 k47Var = this.f45816O;
                    k47Var.m14816K(iLimit, bArrArray);
                    k47Var.m14818M(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(k47Var.m14831o());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f45817P.mo12218b(fArr, this.f45818Q - this.f69505k);
                }
            }
        }
    }
}
