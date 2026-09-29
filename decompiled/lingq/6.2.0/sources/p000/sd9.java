package p000;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sd9 implements td9 {

    /* JADX INFO: renamed from: a */
    public final float[] f60710a;

    /* JADX INFO: renamed from: b */
    public float[] f60711b;

    /* JADX INFO: renamed from: c */
    public float[] f60712c;

    /* JADX INFO: renamed from: d */
    public float[] f60713d;

    /* JADX INFO: renamed from: e */
    public double f60714e;

    /* JADX INFO: renamed from: f */
    public double f60715f;

    /* JADX INFO: renamed from: g */
    public double f60716g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vd9 f60717h;

    public sd9(vd9 vd9Var) {
        this.f60717h = vd9Var;
        int i = vd9Var.f65250h;
        this.f60710a = new float[i];
        int i2 = i * vd9Var.f65244b;
        this.f60711b = new float[i2];
        this.f60712c = new float[i2];
        this.f60713d = new float[i2];
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: a */
    public final void mo21253a(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f60711b;
        vd9 vd9Var = this.f60717h;
        floatBufferAsFloatBuffer.get(fArr, vd9Var.f65252j * vd9Var.f65244b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: b */
    public final void mo21254b(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.f60712c;
        int i2 = this.f60717h.f65244b;
        floatBufferAsFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: c */
    public final void mo21255c(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            vd9 vd9Var = this.f60717h;
            int i3 = vd9Var.f65244b;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.f60712c;
            int i4 = (vd9Var.f65253k * i3) + i2;
            float[] fArr2 = this.f60713d;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = ((long) vd9Var.f65256n) * j;
            int i6 = vd9Var.f65255m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            fArr[i4] = (((j6 - j5) * f2) + (j5 * f)) / j6;
            i2++;
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: d */
    public final void mo21256d(int i, int i2) {
        for (int i3 = 0; i3 < this.f60717h.f65244b * i2; i3++) {
            this.f60711b[i + i3] = 0.0f;
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: e */
    public final void mo21257e(int i, int i2) {
        vd9 vd9Var = this.f60717h;
        int i3 = vd9Var.f65250h / i2;
        int i4 = vd9Var.f65244b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += (double) this.f60711b[(i7 * i5) + i6 + i8];
            }
            this.f60710a[i7] = (float) (d / ((double) i5));
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: f */
    public final int mo21258f(int i, int i2, int i3) {
        return m21271s(i, i2, i3, this.f60711b);
    }

    @Override // p000.td9
    public final void flush() {
        this.f60716g = 0.0d;
        this.f60714e = 0.0d;
        this.f60715f = 0.0d;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: g */
    public final void mo21259g() {
        this.f60716g = this.f60714e;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: h */
    public final Object mo21260h() {
        return this.f60711b;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: i */
    public final Object mo21261i() {
        return this.f60712c;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: j */
    public final void mo21262j(int i) {
        this.f60712c = m21270r(this.f60717h.f65253k, i, this.f60712c);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: k */
    public final boolean mo21263k() {
        double d = this.f60714e;
        return d != 0.0d && this.f60717h.f65258p != 0 && this.f60715f <= d * 3.0d && d * 2.0d > this.f60716g * 3.0d;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: l */
    public final Object mo21264l() {
        return this.f60713d;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: m */
    public final void mo21265m(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.f60712c;
        float[] fArr2 = this.f60711b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: n */
    public final void mo21266n(int i) {
        this.f60713d = m21270r(this.f60717h.f65254l, i, this.f60713d);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: o */
    public final int mo21267o() {
        return 4;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: p */
    public final void mo21268p(int i) {
        this.f60711b = m21270r(this.f60717h.f65252j, i, this.f60711b);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: q */
    public final int mo21269q(int i, int i2) {
        return m21271s(0, i, i2, this.f60710a);
    }

    /* JADX INFO: renamed from: r */
    public final float[] m21270r(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.f60717h.f65244b;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: s */
    public final int m21271s(int i, int i2, int i3, float[] fArr) {
        int i4 = this.f60717h.f65244b * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double dAbs = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                dAbs += (double) Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d3 = i7;
            if (((double) i5) * dAbs < d * d3) {
                i5 = i7;
                d = dAbs;
            }
            if (((double) i6) * dAbs > d3 * d2) {
                i6 = i7;
                d2 = dAbs;
            }
            i7++;
            i4 = i9;
        }
        this.f60714e = d / ((double) i5);
        this.f60715f = d2 / ((double) i6);
        return i5;
    }
}
