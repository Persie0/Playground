package p000;

import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ud9 implements td9 {

    /* JADX INFO: renamed from: a */
    public final short[] f63792a;

    /* JADX INFO: renamed from: b */
    public short[] f63793b;

    /* JADX INFO: renamed from: c */
    public short[] f63794c;

    /* JADX INFO: renamed from: d */
    public short[] f63795d;

    /* JADX INFO: renamed from: e */
    public int f63796e;

    /* JADX INFO: renamed from: f */
    public int f63797f;

    /* JADX INFO: renamed from: g */
    public int f63798g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vd9 f63799h;

    public ud9(vd9 vd9Var) {
        this.f63799h = vd9Var;
        int i = vd9Var.f65250h;
        this.f63792a = new short[i];
        int i2 = i * vd9Var.f65244b;
        this.f63793b = new short[i2];
        this.f63794c = new short[i2];
        this.f63795d = new short[i2];
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: a */
    public final void mo21253a(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f63793b;
        vd9 vd9Var = this.f63799h;
        shortBufferAsShortBuffer.get(sArr, vd9Var.f65252j * vd9Var.f65244b, i / 2);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: b */
    public final void mo21254b(int i, ByteBuffer byteBuffer) {
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        short[] sArr = this.f63794c;
        int i2 = this.f63799h.f65244b;
        shortBufferAsShortBuffer.put(sArr, 0, i * i2);
        byteBuffer.position((i * 2 * i2) + byteBuffer.position());
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: c */
    public final void mo21255c(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            vd9 vd9Var = this.f63799h;
            int i3 = vd9Var.f65244b;
            if (i2 >= i3) {
                return;
            }
            short[] sArr = this.f63794c;
            int i4 = (vd9Var.f65253k * i3) + i2;
            short[] sArr2 = this.f63795d;
            int i5 = (i * i3) + i2;
            short s = sArr2[i5];
            short s2 = sArr2[i5 + i3];
            long j3 = ((long) vd9Var.f65256n) * j;
            int i6 = vd9Var.f65255m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            sArr[i4] = (short) ((((j6 - j5) * ((long) s2)) + (((long) s) * j5)) / j6);
            i2++;
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: d */
    public final void mo21256d(int i, int i2) {
        for (int i3 = 0; i3 < this.f63799h.f65244b * i2; i3++) {
            this.f63793b[i + i3] = 0;
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: e */
    public final void mo21257e(int i, int i2) {
        short[] sArr = this.f63793b;
        vd9 vd9Var = this.f63799h;
        int i3 = vd9Var.f65250h / i2;
        int i4 = vd9Var.f65244b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f63792a[i7] = (short) (i8 / i5);
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: f */
    public final int mo21258f(int i, int i2, int i3) {
        return m22698s(this.f63793b, i, i2, i3);
    }

    @Override // p000.td9
    public final void flush() {
        this.f63798g = 0;
        this.f63796e = 0;
        this.f63797f = 0;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: g */
    public final void mo21259g() {
        this.f63798g = this.f63796e;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: h */
    public final Object mo21260h() {
        return this.f63793b;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: i */
    public final Object mo21261i() {
        return this.f63794c;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: j */
    public final void mo21262j(int i) {
        this.f63794c = m22697r(this.f63794c, this.f63799h.f65253k, i);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: k */
    public final boolean mo21263k() {
        int i = this.f63796e;
        return i != 0 && this.f63799h.f65258p != 0 && this.f63797f <= i * 3 && i * 2 > this.f63798g * 3;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: l */
    public final Object mo21264l() {
        return this.f63795d;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: m */
    public final void mo21265m(int i, int i2, int i3, int i4, int i5) {
        short[] sArr = this.f63794c;
        short[] sArr2 = this.f63793b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr2[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: n */
    public final void mo21266n(int i) {
        this.f63795d = m22697r(this.f63795d, this.f63799h.f65254l, i);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: o */
    public final int mo21267o() {
        return 2;
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: p */
    public final void mo21268p(int i) {
        this.f63793b = m22697r(this.f63793b, this.f63799h.f65252j, i);
    }

    @Override // p000.td9
    /* JADX INFO: renamed from: q */
    public final int mo21269q(int i, int i2) {
        return m22698s(this.f63792a, 0, i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final short[] m22697r(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f63799h.f65244b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: s */
    public final int m22698s(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f63799h.f65244b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f63796e = i6 / i7;
        this.f63797f = i8 / i5;
        return i7;
    }
}
