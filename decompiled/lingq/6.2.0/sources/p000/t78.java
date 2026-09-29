package p000;

import androidx.compose.foundation.style.C0158c;
import androidx.compose.foundation.style.C0159d;
import androidx.compose.runtime.AbstractC0279g;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t78 implements w64, sf1, fb2 {

    /* JADX INFO: renamed from: a */
    public float f61943a;

    /* JADX INFO: renamed from: b */
    public C0159d f61944b;

    /* JADX INFO: renamed from: c */
    public em9 f61945c;

    /* JADX INFO: renamed from: d */
    public em9 f61946d;

    /* JADX INFO: renamed from: e */
    public em9 f61947e;

    /* JADX INFO: renamed from: f */
    public em9 f61948f;

    /* JADX INFO: renamed from: g */
    public t56 f61949g;

    /* JADX INFO: renamed from: h */
    public t56 f61950h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0025an f61951i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0025an f61952j;

    /* JADX INFO: renamed from: k */
    public C0158c f61953k;

    @Override // p000.sf1
    /* JADX INFO: renamed from: A */
    public final Object mo1058A(AbstractC0279g abstractC0279g) {
        C0159d c0159d = this.f61944b;
        c0159d.getClass();
        return thb.m22050i(c0159d, abstractC0279g);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f61943a;
    }

    /* JADX INFO: renamed from: b */
    public final void m21881b(InterfaceC0025an interfaceC0025an, InterfaceC0025an interfaceC0025an2, vl9 vl9Var) {
        em9 em9Var = this.f61945c;
        InterfaceC0025an interfaceC0025an3 = this.f61951i;
        InterfaceC0025an interfaceC0025an4 = this.f61952j;
        try {
            this.f61951i = interfaceC0025an;
            this.f61952j = interfaceC0025an2;
            em9 em9Var2 = this.f61947e;
            if (em9Var2 == null) {
                em9Var2 = new em9();
                this.f61947e = em9Var2;
            }
            this.f61945c = em9Var2;
            vl9Var.mo11427a(this);
        } finally {
            this.f61945c = em9Var;
            this.f61951i = interfaceC0025an3;
            this.f61952j = interfaceC0025an4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m21882c(long j) {
        m21886g((byte) 34);
        m21886g((byte) 51);
        em9 em9Var = this.f61945c;
        if (em9Var != null) {
            em9Var.m11232b(j);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m21883d(float f, long j) {
        float fCeil = 0.0f;
        if (!xj2.m24560b(f, Float.NaN)) {
            fCeil = xj2.m24560b(f, 0.0f) ? 1.0f : (float) Math.ceil(f * this.f61943a);
        }
        m21886g((byte) 8);
        em9 em9Var = this.f61945c;
        if (em9Var != null) {
            em9Var.f37497a |= 256;
            em9Var.f37510k = fCeil;
        }
        m21886g((byte) 35);
        m21886g((byte) 50);
        em9 em9Var2 = this.f61945c;
        if (em9Var2 != null) {
            em9Var2.m11234d(j);
        }
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public final void m21884e() {
        long j;
        long j2;
        boolean z;
        InterfaceC0025an interfaceC0025an;
        InterfaceC0025an interfaceC0025an2;
        InterfaceC0025an interfaceC0025an3;
        InterfaceC0025an interfaceC0025an4;
        C0159d c0159d = this.f61944b;
        c0159d.getClass();
        this.f61944b = null;
        em9 em9Var = this.f61947e;
        if (em9Var == null) {
            return;
        }
        C0158c c0158c = this.f61953k;
        if (c0158c == null) {
            c0158c = new C0158c();
            this.f61953k = c0158c;
        }
        em9 em9Var2 = this.f61946d;
        t56 t56Var = this.f61950h;
        t56 t56Var2 = this.f61949g;
        synchronized (c0158c.f2749a) {
            try {
                c0158c.m1054c();
                if (em9Var2 != null) {
                    int i = em9Var.f37499b;
                    j = 1;
                    long j3 = em9Var.f37497a;
                    j2 = 0;
                    if (em9Var2.m11250t(51) && em9Var.m11249s((byte) 34)) {
                        i |= 2;
                        j3 &= -17179869185L;
                    }
                    if (em9Var2.m11250t(50) && em9Var.m11249s((byte) 35)) {
                        i |= 1;
                        j3 &= -34359738369L;
                    }
                    if (em9Var2.m11250t(57) && em9Var.m11249s((byte) 37)) {
                        i |= 128;
                        j3 &= -137438953473L;
                    }
                    if (em9Var2.m11250t(52) && em9Var.m11249s((byte) 36)) {
                        i |= 4;
                        j3 &= -68719476737L;
                    }
                    while (j3 != 0) {
                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                        if (t56Var == null || (interfaceC0025an3 = (InterfaceC0025an) t56Var.m10152b(iNumberOfTrailingZeros)) == null) {
                            interfaceC0025an3 = u78.f63520a;
                        }
                        if (t56Var2 == null || (interfaceC0025an4 = (InterfaceC0025an) t56Var2.m10152b(iNumberOfTrailingZeros)) == null) {
                            interfaceC0025an4 = u78.f63520a;
                        }
                        c0158c.m1055d(iNumberOfTrailingZeros, interfaceC0025an3, interfaceC0025an4);
                        j3 ^= 1 << iNumberOfTrailingZeros;
                    }
                    while (i != 0) {
                        int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(i);
                        int i2 = iNumberOfTrailingZeros2 + 50;
                        if (t56Var == null || (interfaceC0025an = (InterfaceC0025an) t56Var.m10152b(i2)) == null) {
                            interfaceC0025an = u78.f63520a;
                        }
                        if (t56Var2 == null || (interfaceC0025an2 = (InterfaceC0025an) t56Var2.m10152b(i2)) == null) {
                            interfaceC0025an2 = u78.f63520a;
                        }
                        c0158c.m1055d(i2, interfaceC0025an, interfaceC0025an2);
                        i ^= 1 << iNumberOfTrailingZeros2;
                    }
                } else {
                    j = 1;
                    j2 = 0;
                }
                c0158c.m1053b(c0159d);
            } catch (Throwable th) {
                throw th;
            }
        }
        em9 em9Var3 = this.f61948f;
        if (em9Var3 == null) {
            em9Var3 = new em9();
            this.f61948f = em9Var3;
        }
        long jM11941e = em9Var.f37497a & fm9.m11941e(63);
        int i3 = em9Var.f37499b & (fm9.f39306h | fm9.f39307i | fm9.f39308j | fm9.f39309k | fm9.f39310l | fm9.f39311m);
        if (jM11941e != j2) {
            if ((jM11941e & 8192) != j2) {
                float f = em9Var.f37515p;
                em9Var3.f37497a = 8192 | em9Var3.f37497a;
                em9Var3.f37515p = f;
            }
            if ((jM11941e & 16384) != j2) {
                float f2 = em9Var.f37516q;
                em9Var3.f37497a = 16384 | em9Var3.f37497a;
                em9Var3.f37516q = f2;
            }
            if ((jM11941e & 32768) != j2) {
                float f3 = em9Var.f37517r;
                em9Var3.f37497a = 32768 | em9Var3.f37497a;
                em9Var3.f37517r = f3;
            }
            if ((jM11941e & 65536) != j2) {
                float f4 = em9Var.f37518s;
                em9Var3.f37497a = 65536 | em9Var3.f37497a;
                em9Var3.f37518s = f4;
            }
            if ((jM11941e & 262144) != j2) {
                float f5 = em9Var.f37519t;
                em9Var3.f37497a = 262144 | em9Var3.f37497a;
                em9Var3.f37519t = f5;
            }
            if ((jM11941e & 1048576) != j2) {
                float f6 = em9Var.f37520u;
                em9Var3.f37497a = 1048576 | em9Var3.f37497a;
                em9Var3.f37520u = f6;
            }
            if ((jM11941e & 131072) != j2) {
                float f7 = em9Var.f37521v;
                em9Var3.f37497a = 131072 | em9Var3.f37497a;
                em9Var3.f37521v = f7;
            }
            if ((jM11941e & 524288) != j2) {
                float f8 = em9Var.f37522w;
                em9Var3.f37497a = 524288 | em9Var3.f37497a;
                em9Var3.f37522w = f8;
            }
            if ((jM11941e & j) != j2) {
                float f9 = em9Var.f37501c;
                em9Var3.f37497a |= j;
                em9Var3.f37501c = f9;
            }
            if ((jM11941e & 2) != j2) {
                float f10 = em9Var.f37503d;
                em9Var3.f37497a = 2 | em9Var3.f37497a;
                em9Var3.f37503d = f10;
            }
            if ((jM11941e & 4) != j2) {
                float f11 = em9Var.f37504e;
                em9Var3.f37497a = 4 | em9Var3.f37497a;
                em9Var3.f37504e = f11;
            }
            if ((jM11941e & 8) != j2) {
                float f12 = em9Var.f37505f;
                em9Var3.f37497a = 8 | em9Var3.f37497a;
                em9Var3.f37505f = f12;
            }
            if ((jM11941e & 16) != j2) {
                float f13 = em9Var.f37506g;
                em9Var3.f37497a = 16 | em9Var3.f37497a;
                em9Var3.f37506g = f13;
            }
            if ((jM11941e & 32) != j2) {
                float f14 = em9Var.f37507h;
                em9Var3.f37497a = 32 | em9Var3.f37497a;
                em9Var3.f37507h = f14;
            }
            if ((jM11941e & 64) != j2) {
                float f15 = em9Var.f37508i;
                em9Var3.f37497a = 64 | em9Var3.f37497a;
                em9Var3.f37508i = f15;
            }
            if ((jM11941e & 128) != j2) {
                float f16 = em9Var.f37509j;
                em9Var3.f37497a = 128 | em9Var3.f37497a;
                em9Var3.f37509j = f16;
            }
            if ((jM11941e & 256) != j2) {
                float f17 = em9Var.f37510k;
                em9Var3.f37497a = 256 | em9Var3.f37497a;
                em9Var3.f37510k = f17;
            }
            if ((jM11941e & 2097152) != j2) {
                float f18 = em9Var.f37478H;
                em9Var3.f37497a = 2097152 | em9Var3.f37497a;
                em9Var3.f37478H = f18;
            }
            if ((jM11941e & 4194304) != j2) {
                float f19 = em9Var.f37479I;
                em9Var3.f37497a = 4194304 | em9Var3.f37497a;
                em9Var3.f37479I = f19;
            }
            if ((jM11941e & 8388608) != j2) {
                float f20 = em9Var.f37480J;
                em9Var3.f37497a = 8388608 | em9Var3.f37497a;
                em9Var3.f37480J = f20;
            }
            if ((jM11941e & 16777216) != j2) {
                float f21 = em9Var.f37481K;
                em9Var3.f37497a = 16777216 | em9Var3.f37497a;
                em9Var3.f37481K = f21;
            }
            if ((jM11941e & 33554432) != j2) {
                float f22 = em9Var.f37482L;
                em9Var3.f37497a = 33554432 | em9Var3.f37497a;
                em9Var3.f37482L = f22;
            }
            if ((jM11941e & 67108864) != j2) {
                float f23 = em9Var.f37483M;
                em9Var3.f37497a = 67108864 | em9Var3.f37497a;
                em9Var3.f37483M = f23;
            }
            if ((jM11941e & 134217728) != j2) {
                float f24 = em9Var.f37484N;
                em9Var3.f37497a = 134217728 | em9Var3.f37497a;
                em9Var3.f37484N = f24;
            }
            if ((jM11941e & 268435456) != j2) {
                float f25 = em9Var.f37485O;
                em9Var3.f37497a = 268435456 | em9Var3.f37497a;
                em9Var3.f37485O = f25;
            }
            if ((jM11941e & 536870912) != j2) {
                float f26 = em9Var.f37486P;
                em9Var3.f37497a = 536870912 | em9Var3.f37497a;
                em9Var3.f37486P = f26;
            }
            if ((jM11941e & 1073741824) != j2) {
                float f27 = em9Var.f37487Q;
                em9Var3.f37497a = 1073741824 | em9Var3.f37497a;
                em9Var3.f37487Q = f27;
            }
            if ((jM11941e & 4294967296L) != j2) {
                float f28 = em9Var.f37489S;
                em9Var3.f37497a = 4294967296L | em9Var3.f37497a;
                em9Var3.f37489S = f28;
            }
            if ((jM11941e & 8589934592L) != j2) {
                float f29 = em9Var.f37488R;
                em9Var3.f37497a = 8589934592L | em9Var3.f37497a;
                em9Var3.f37488R = f29;
            }
            if ((34359738368L & jM11941e) != j2) {
                em9Var3.m11234d(em9Var.f37523x);
            }
            if ((17179869184L & jM11941e) != j2) {
                em9Var3.m11232b(em9Var.f37525z);
            }
            if ((jM11941e & 68719476736L) != j2) {
                long j4 = em9Var.f37472B;
                em9Var3.f37497a = 68719476736L | em9Var3.f37497a;
                em9Var3.f37499b &= -5;
                em9Var3.f37472B = j4;
                em9Var3.f37473C = null;
            }
            if ((jM11941e & 2147483648L) != j2) {
                boolean z2 = em9Var.f37474D;
                em9Var3.f37497a = 2147483648L | em9Var3.f37497a;
                em9Var3.f37474D = z2;
            }
            if ((jM11941e & 512) != j2) {
                float f30 = em9Var.f37511l;
                em9Var3.f37497a = (512 | em9Var3.f37497a) & (-2049);
                em9Var3.f37511l = f30;
                em9Var3.f37513n = Float.NaN;
            }
            if ((jM11941e & 1024) != j2) {
                float f31 = em9Var.f37512m;
                em9Var3.f37497a = (1024 | em9Var3.f37497a) & (-4097);
                em9Var3.f37512m = f31;
                em9Var3.f37514o = Float.NaN;
            }
            if ((jM11941e & 2048) != j2) {
                float f32 = em9Var.f37513n;
                em9Var3.f37497a = 2048 | (em9Var3.f37497a & (-513));
                em9Var3.f37513n = f32;
                em9Var3.f37511l = Float.NaN;
            }
            if ((jM11941e & 4096) != j2) {
                float f33 = em9Var.f37514o;
                em9Var3.f37497a = 4096 | (em9Var3.f37497a & (-1025));
                em9Var3.f37514o = f33;
                em9Var3.f37512m = Float.NaN;
            }
            if ((jM11941e & 137438953472L) != j2) {
                long j5 = em9Var.f37491U;
                em9Var3.f37497a = 137438953472L | em9Var3.f37497a;
                em9Var3.f37499b &= -129;
                em9Var3.f37491U = j5;
                em9Var3.f37492V = null;
            }
            if ((jM11941e & 140737488355328L) != j2) {
                long j6 = em9Var.f37496Z;
                em9Var3.f37497a = 140737488355328L | em9Var3.f37497a;
                em9Var3.f37496Z = j6;
            }
            if ((jM11941e & 281474976710656L) != j2) {
                long j7 = em9Var.f37498a0;
                em9Var3.f37497a = 281474976710656L | em9Var3.f37497a;
                em9Var3.f37498a0 = j7;
            }
            if ((jM11941e & 8796093022208L) != j2) {
                float f34 = em9Var.f37500b0;
                em9Var3.f37497a = 8796093022208L | em9Var3.f37497a;
                em9Var3.f37500b0 = f34;
            }
            if ((jM11941e & 562949953421312L) != j2) {
                em9Var3.f37497a = 562949953421312L | em9Var3.f37497a;
            }
            if ((131666517426176L & jM11941e) != j2) {
                if ((274877906944L & jM11941e) != j2) {
                    em9Var3.m11253w(em9Var.m11247q());
                }
                if ((jM11941e & 70368744177664L) != j2) {
                    long j8 = em9Var.f37495Y;
                    em9Var3.f37497a = 70368744177664L | em9Var3.f37497a;
                    em9Var3.f37495Y = j8;
                }
                if ((2199023255552L & jM11941e) != j2) {
                    em9Var3.m11252v(em9Var.m11246p());
                }
                if ((4398046511104L & jM11941e) != j2) {
                    em9Var3.m11254x(em9Var.m11248r());
                }
                if ((17592186044416L & jM11941e) != j2) {
                    em9Var3.m11251u(em9Var.m11244n());
                }
                if ((35184372088832L & jM11941e) != j2) {
                    em9Var3.m11238h(em9Var.m11242l());
                }
                if ((549755813888L & jM11941e) != j2) {
                    em9Var3.m11239i(em9Var.m11243m());
                }
                if ((jM11941e & 1099511627776L) != j2) {
                    em9Var3.m11237g(em9Var.m11241k());
                }
            }
        }
        if (i3 != 0) {
            if ((i3 & 8) != 0) {
                o39 o39Var = em9Var.f37475E;
                em9Var3.f37499b |= 8;
                em9Var3.f37475E = o39Var;
            }
            if ((i3 & 16) != 0) {
                fa1 fa1Var = em9Var.f37490T;
                em9Var3.f37499b |= 16;
                em9Var3.f37490T = fa1Var;
            }
            if ((i3 & 1) != 0) {
                em9Var3.m11233c(em9Var.f37524y);
            }
            if ((i3 & 2) != 0) {
                em9Var3.m11231a(em9Var.f37471A);
            }
            if ((i3 & 4) != 0) {
                em9Var3.m11240j(em9Var.f37473C);
            }
            if ((i3 & 32) != 0) {
                Object obj = em9Var.f37476F;
                int i4 = em9Var3.f37499b;
                em9Var3.f37499b = obj != null ? i4 | 32 : i4 & (-33);
                em9Var3.f37476F = obj;
            }
            if ((i3 & 64) != 0) {
                Object obj2 = em9Var.f37477G;
                int i5 = em9Var3.f37499b;
                em9Var3.f37499b = obj2 != null ? i5 | 64 : i5 & (-65);
                em9Var3.f37477G = obj2;
            }
            if ((i3 & 128) != 0) {
                em9Var3.m11235e(em9Var.f37492V);
            }
            if ((i3 & 256) != 0) {
                em9Var3.f37499b |= 256;
            }
            if ((i3 & 512) != 0) {
                ax9 ax9Var = em9Var.f37493W;
                em9Var3.f37499b |= 512;
                em9Var3.f37493W = ax9Var;
            }
            if ((i3 & 1024) != 0) {
                aw9 aw9Var = em9Var.f37494X;
                aw9Var.getClass();
                em9Var3.f37499b |= 1024;
                em9Var3.f37494X = aw9Var;
            }
        }
        synchronized (c0158c.f2749a) {
            z = c0158c.f2750b.f35147e == 0;
        }
        if (z) {
            this.f61953k = null;
            this.f61948f = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m21885f() {
        int i;
        C0158c c0158c = this.f61953k;
        int i2 = 0;
        if (c0158c == null) {
            return 0;
        }
        t56 t56Var = c0158c.f2750b;
        int[] iArr = t56Var.f35144b;
        Object[] objArr = t56Var.f35145c;
        long[] jArr = t56Var.f35143a;
        int length = jArr.length - 2;
        long j = 0;
        if (length < 0) {
            i = i2;
            break;
        }
        int i3 = 0;
        i = 0;
        while (true) {
            long j2 = jArr[i3];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8 - ((~(i3 - length)) >>> 31);
                for (int i5 = 0; i5 < i4; i5++) {
                    if ((255 & j2) < 128) {
                        int i6 = (i3 << 3) + i5;
                        int i7 = iArr[i6];
                        if (i7 < 50) {
                            j |= 1 << ((byte) i7);
                        } else {
                            i |= 1 << (i7 - 50);
                        }
                    }
                    j2 >>= 8;
                }
                if (i4 != 8) {
                    break;
                }
            }
            if (i3 == length) {
                i2 = i;
                i = i2;
                break;
            }
            i3++;
        }
        return fm9.m11940d(i) | fm9.m11942f(j);
    }

    /* JADX INFO: renamed from: g */
    public final void m21886g(byte b) {
        if (fa4.m11650l(this.f61945c, this.f61946d)) {
            t56 t56Var = this.f61949g;
            if (t56Var != null) {
            }
            t56 t56Var2 = this.f61950h;
            if (t56Var2 != null) {
                return;
            }
            return;
        }
        InterfaceC0025an interfaceC0025an = this.f61951i;
        InterfaceC0025an interfaceC0025an2 = this.f61952j;
        if (interfaceC0025an != null) {
            t56 t56Var3 = this.f61949g;
            if (t56Var3 == null) {
                t56 t56Var4 = e84.f36837a;
                t56Var3 = new t56();
                this.f61949g = t56Var3;
            }
            t56Var3.m21850i(b, interfaceC0025an);
        }
        if (interfaceC0025an2 != null) {
            t56 t56Var5 = this.f61950h;
            if (t56Var5 == null) {
                t56 t56Var6 = e84.f36837a;
                t56Var5 = new t56();
                this.f61950h = t56Var5;
            }
            t56Var5.m21850i(b, interfaceC0025an2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:293:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:310:0x0621  */
    /* JADX WARN: Code duplicated, block: B:311:0x0623  */
    /* JADX INFO: renamed from: i */
    public final void m21887i(int i, em9 em9Var) {
        boolean z;
        em9 em9Var2;
        float f;
        float f2;
        double d;
        int i2;
        ax9 ax9Var;
        float f3;
        long j;
        long j2;
        long j3;
        fa1 dc5Var;
        Object objMo11319a;
        em9 em9Var3 = this.f61946d;
        if (em9Var3 == null) {
            fm9.f39312n.m11236f(em9Var);
            return;
        }
        em9Var3.m11236f(em9Var);
        C0158c c0158c = this.f61953k;
        if (c0158c == null) {
            return;
        }
        synchronized (c0158c.f2749a) {
            z = c0158c.f2750b.f35147e == 0;
        }
        if (z || (em9Var2 = this.f61948f) == null) {
            return;
        }
        int i3 = i & 1;
        int i4 = i & 8;
        int i5 = i & 2;
        int i6 = i & 4;
        int i7 = i & 32;
        int i8 = i & 16;
        long j4 = (i3 != 0 ? fm9.f39300b : 0L) | (i4 != 0 ? fm9.f39301c : 0L) | (i5 != 0 ? fm9.f39302d : 0L) | (i6 != 0 ? fm9.f39303e : 0L) | (i7 != 0 ? fm9.f39304f : 0L) | (i8 != 0 ? fm9.f39305g : 0L);
        int i9 = (i3 != 0 ? fm9.f39306h : 0) | (i4 != 0 ? fm9.f39307i : 0) | (i5 != 0 ? fm9.f39308j : 0) | (i6 != 0 ? fm9.f39309k : 0) | (i7 != 0 ? fm9.f39310l : 0) | (i8 != 0 ? fm9.f39311m : 0);
        int[] iArr = fm9.f39299a;
        int i10 = i9 & (em9Var3.f37499b | em9Var2.f37499b);
        long j5 = (em9Var2.f37497a | em9Var3.f37497a) & j4;
        int i11 = i10 & 1;
        if (i11 != 0) {
            j5 &= -34359738369L;
        }
        int i12 = i10 & 128;
        if (i12 != 0) {
            j5 &= -137438953473L;
        }
        int i13 = i10 & 2;
        if (i13 != 0) {
            j5 &= -17179869185L;
        }
        int i14 = i10 & 4;
        if (i14 != 0) {
            j5 &= -68719476737L;
        }
        if (j5 == 0 && i10 == 0) {
            return;
        }
        if ((fm9.f39301c & j5) != 0) {
            if ((j5 & 16) != 0) {
                float fM1056e = c0158c.m1056e(4);
                f = 1.0f;
                float f4 = em9Var3.f37506g;
                float f5 = em9Var2.f37506g;
                boolean zIsNaN = Float.isNaN(f4);
                boolean zIsNaN2 = Float.isNaN(f5);
                float f6 = (fM1056e * f5) + ((1.0f - fM1056e) * f4);
                if (zIsNaN) {
                    f4 = f5;
                } else {
                    if (!zIsNaN2) {
                        f4 = f6;
                    }
                    em9Var.f37497a |= 16;
                    em9Var.f37506g = f4;
                }
                em9Var.f37497a |= 16;
                em9Var.f37506g = f4;
            } else {
                j5 = j5;
                f = 1.0f;
            }
            if ((j5 & 32) != 0) {
                float fM1056e2 = c0158c.m1056e(5);
                float f7 = em9Var3.f37507h;
                float f8 = em9Var2.f37507h;
                boolean zIsNaN3 = Float.isNaN(f7);
                boolean zIsNaN4 = Float.isNaN(f8);
                float f9 = (fM1056e2 * f8) + ((f - fM1056e2) * f7);
                if (zIsNaN3) {
                    f7 = f8;
                } else if (!zIsNaN4) {
                    f7 = f9;
                }
                em9Var.f37497a |= 32;
                em9Var.f37507h = f7;
            }
            if ((j5 & 64) != 0) {
                float fM1056e3 = c0158c.m1056e(6);
                float f10 = em9Var3.f37508i;
                float f11 = em9Var2.f37508i;
                boolean zIsNaN5 = Float.isNaN(f10);
                boolean zIsNaN6 = Float.isNaN(f11);
                float f12 = (fM1056e3 * f11) + ((f - fM1056e3) * f10);
                if (zIsNaN5) {
                    f10 = f11;
                } else if (!zIsNaN6) {
                    f10 = f12;
                }
                em9Var.f37497a = 64 | em9Var.f37497a;
                em9Var.f37508i = f10;
            }
            if ((j5 & 128) != 0) {
                float fM1056e4 = c0158c.m1056e(7);
                float f13 = em9Var3.f37509j;
                float f14 = em9Var2.f37509j;
                boolean zIsNaN7 = Float.isNaN(f13);
                boolean zIsNaN8 = Float.isNaN(f14);
                float f15 = (fM1056e4 * f14) + ((f - fM1056e4) * f13);
                if (zIsNaN7) {
                    f13 = f14;
                } else if (!zIsNaN8) {
                    f13 = f15;
                }
                em9Var.f37497a = 128 | em9Var.f37497a;
                em9Var.f37509j = f13;
            }
            if ((j5 & 8192) != 0) {
                float fM1056e5 = c0158c.m1056e(13);
                float f16 = em9Var3.f37515p;
                float f17 = em9Var2.f37515p;
                boolean zIsNaN9 = Float.isNaN(f16);
                boolean zIsNaN10 = Float.isNaN(f17);
                float f18 = (fM1056e5 * f17) + ((f - fM1056e5) * f16);
                if (zIsNaN9) {
                    f16 = f17;
                } else if (!zIsNaN10) {
                    f16 = f18;
                }
                em9Var.f37497a = 8192 | em9Var.f37497a;
                em9Var.f37515p = f16;
            }
            if ((j5 & 16384) != 0) {
                float fM1056e6 = c0158c.m1056e(14);
                float f19 = em9Var3.f37516q;
                float f20 = em9Var2.f37516q;
                boolean zIsNaN11 = Float.isNaN(f19);
                boolean zIsNaN12 = Float.isNaN(f20);
                float f21 = (fM1056e6 * f20) + ((f - fM1056e6) * f19);
                if (zIsNaN11) {
                    f19 = f20;
                } else if (!zIsNaN12) {
                    f19 = f21;
                }
                em9Var.f37497a = 16384 | em9Var.f37497a;
                em9Var.f37516q = f19;
            }
            if ((j5 & 32768) != 0) {
                float fM1056e7 = c0158c.m1056e(15);
                float f22 = em9Var3.f37517r;
                float f23 = em9Var2.f37517r;
                boolean zIsNaN13 = Float.isNaN(f22);
                boolean zIsNaN14 = Float.isNaN(f23);
                float f24 = (fM1056e7 * f23) + ((f - fM1056e7) * f22);
                if (zIsNaN13) {
                    f22 = f23;
                } else if (!zIsNaN14) {
                    f22 = f24;
                }
                em9Var.f37497a = 32768 | em9Var.f37497a;
                em9Var.f37517r = f22;
            }
            if ((j5 & 65536) != 0) {
                float fM1056e8 = c0158c.m1056e(16);
                float f25 = em9Var3.f37518s;
                float f26 = em9Var2.f37518s;
                boolean zIsNaN15 = Float.isNaN(f25);
                boolean zIsNaN16 = Float.isNaN(f26);
                float f27 = (fM1056e8 * f26) + ((f - fM1056e8) * f25);
                if (zIsNaN15) {
                    f25 = f26;
                } else if (!zIsNaN16) {
                    f25 = f27;
                }
                em9Var.f37497a = 65536 | em9Var.f37497a;
                em9Var.f37518s = f25;
            }
            if ((j5 & 512) != 0) {
                float fM1056e9 = c0158c.m1056e(9);
                float f28 = em9Var3.f37511l;
                float f29 = em9Var2.f37511l;
                boolean zIsNaN17 = Float.isNaN(f28);
                boolean zIsNaN18 = Float.isNaN(f29);
                float f30 = (fM1056e9 * f29) + ((f - fM1056e9) * f28);
                if (zIsNaN17) {
                    f28 = f29;
                } else if (!zIsNaN18) {
                    f28 = f30;
                }
                em9Var.f37497a = (em9Var.f37497a | 512) & (-2049);
                em9Var.f37511l = f28;
                em9Var.f37513n = Float.NaN;
            }
            if ((j5 & 1024) != 0) {
                float fM1056e10 = c0158c.m1056e(10);
                float f31 = em9Var3.f37512m;
                float f32 = em9Var2.f37512m;
                boolean zIsNaN19 = Float.isNaN(f31);
                boolean zIsNaN20 = Float.isNaN(f32);
                float f33 = (fM1056e10 * f32) + ((f - fM1056e10) * f31);
                if (zIsNaN19) {
                    f31 = f32;
                } else if (!zIsNaN20) {
                    f31 = f33;
                }
                em9Var.f37497a = (em9Var.f37497a | 1024) & (-4097);
                em9Var.f37512m = f31;
                em9Var.f37514o = Float.NaN;
            }
            if ((j5 & 2048) != 0) {
                float fM1056e11 = c0158c.m1056e(11);
                float f34 = em9Var3.f37513n;
                float f35 = em9Var2.f37513n;
                boolean zIsNaN21 = Float.isNaN(f34);
                boolean zIsNaN22 = Float.isNaN(f35);
                float f36 = (fM1056e11 * f35) + ((f - fM1056e11) * f34);
                if (zIsNaN21) {
                    f34 = f35;
                } else if (!zIsNaN22) {
                    f34 = f36;
                }
                em9Var.f37497a = (em9Var.f37497a & (-513)) | 2048;
                em9Var.f37513n = f34;
                em9Var.f37511l = Float.NaN;
            }
            if ((j5 & 4096) != 0) {
                float fM1056e12 = c0158c.m1056e(12);
                float f37 = em9Var3.f37514o;
                float f38 = em9Var2.f37514o;
                boolean zIsNaN23 = Float.isNaN(f37);
                boolean zIsNaN24 = Float.isNaN(f38);
                float f39 = (fM1056e12 * f38) + ((f - fM1056e12) * f37);
                if (zIsNaN23) {
                    f37 = f38;
                } else if (!zIsNaN24) {
                    f37 = f39;
                }
                em9Var.f37497a = (em9Var.f37497a & (-1025)) | 4096;
                em9Var.f37514o = f37;
                em9Var.f37512m = Float.NaN;
            }
            if ((j5 & 131072) != 0) {
                float fM1056e13 = c0158c.m1056e(17);
                float f40 = em9Var3.f37521v;
                float f41 = em9Var2.f37521v;
                boolean zIsNaN25 = Float.isNaN(f40);
                boolean zIsNaN26 = Float.isNaN(f41);
                float f42 = (fM1056e13 * f41) + ((f - fM1056e13) * f40);
                if (zIsNaN25) {
                    f40 = f41;
                } else if (!zIsNaN26) {
                    f40 = f42;
                }
                em9Var.f37497a = 131072 | em9Var.f37497a;
                em9Var.f37521v = f40;
            }
            if ((j5 & 524288) != 0) {
                float fM1056e14 = c0158c.m1056e(19);
                float f43 = em9Var3.f37522w;
                float f44 = em9Var2.f37522w;
                boolean zIsNaN27 = Float.isNaN(f43);
                boolean zIsNaN28 = Float.isNaN(f44);
                float f45 = (fM1056e14 * f44) + ((f - fM1056e14) * f43);
                if (zIsNaN27) {
                    f43 = f44;
                } else if (!zIsNaN28) {
                    f43 = f45;
                }
                em9Var.f37497a = 524288 | em9Var.f37497a;
                em9Var.f37522w = f43;
            }
            if ((j5 & 262144) != 0) {
                float fM1056e15 = c0158c.m1056e(18);
                float f46 = em9Var3.f37519t;
                float f47 = em9Var2.f37519t;
                boolean zIsNaN29 = Float.isNaN(f46);
                boolean zIsNaN30 = Float.isNaN(f47);
                float f48 = (fM1056e15 * f47) + ((f - fM1056e15) * f46);
                if (zIsNaN29) {
                    f46 = f47;
                } else if (!zIsNaN30) {
                    f46 = f48;
                }
                em9Var.f37497a = 262144 | em9Var.f37497a;
                em9Var.f37519t = f46;
            }
            if ((j5 & 1048576) != 0) {
                float fM1056e16 = c0158c.m1056e(20);
                float f49 = em9Var3.f37520u;
                float f50 = em9Var2.f37520u;
                boolean zIsNaN31 = Float.isNaN(f49);
                boolean zIsNaN32 = Float.isNaN(f50);
                float f51 = (fM1056e16 * f50) + ((f - fM1056e16) * f49);
                if (zIsNaN31) {
                    f49 = f50;
                } else if (!zIsNaN32) {
                    f49 = f51;
                }
                em9Var.f37497a = 1048576 | em9Var.f37497a;
                em9Var.f37520u = f49;
            }
        } else {
            j5 = j5;
            f = 1.0f;
        }
        if ((j5 & fm9.f39300b) != 0) {
            if ((j5 & 1) != 0) {
                float fM18232Q = AbstractC3423or.m18232Q(em9Var3.f37501c, em9Var2.f37501c, c0158c.m1056e(0));
                em9Var.f37497a = 1 | em9Var.f37497a;
                em9Var.f37501c = fM18232Q;
            }
            if ((j5 & 2) != 0) {
                float fM18232Q2 = AbstractC3423or.m18232Q(em9Var3.f37503d, em9Var2.f37503d, c0158c.m1056e(1));
                em9Var.f37497a = 2 | em9Var.f37497a;
                em9Var.f37503d = fM18232Q2;
            }
            if ((j5 & 4) != 0) {
                float fM18232Q3 = AbstractC3423or.m18232Q(em9Var3.f37504e, em9Var2.f37504e, c0158c.m1056e(2));
                em9Var.f37497a = 4 | em9Var.f37497a;
                em9Var.f37504e = fM18232Q3;
            }
            if ((j5 & 8) != 0) {
                float fM18232Q4 = AbstractC3423or.m18232Q(em9Var3.f37505f, em9Var2.f37505f, c0158c.m1056e(3));
                em9Var.f37497a = 8 | em9Var.f37497a;
                em9Var.f37505f = fM18232Q4;
            }
        }
        if ((j5 & fm9.f39302d) != 0) {
            if ((j5 & 256) != 0) {
                float fM18232Q5 = AbstractC3423or.m18232Q(em9Var3.f37510k, em9Var2.f37510k, c0158c.m1056e(8));
                em9Var.f37497a |= 256;
                em9Var.f37510k = fM18232Q5;
            }
            if ((j5 & 34359738368L) != 0) {
                em9Var.m11234d(d32.m10026X(em9Var3.f37523x, em9Var2.f37523x, c0158c.m1056e(35)));
            }
            if ((j5 & 17179869184L) != 0) {
                em9Var.m11232b(d32.m10026X(em9Var3.f37525z, em9Var2.f37525z, c0158c.m1056e(34)));
            }
            if ((j5 & 68719476736L) != 0) {
                long jM10026X = d32.m10026X(em9Var3.f37472B, em9Var2.f37472B, c0158c.m1056e(36));
                em9Var.f37497a |= 68719476736L;
                em9Var.f37499b &= -5;
                em9Var.f37472B = jM10026X;
                em9Var.f37473C = null;
            }
        }
        if ((fm9.f39308j & i10) != 0) {
            if (i11 != 0) {
                f2 = 0.5f;
                d = 0.5d;
                i2 = 32;
                em9Var.m11233c(fm9.m11937a(em9Var3.f37524y, em9Var3.f37523x, em9Var2.f37524y, em9Var2.f37523x, c0158c.m1056e(50)));
            } else {
                f2 = 0.5f;
                d = 0.5d;
                i2 = 32;
            }
            if (i13 != 0) {
                em9Var.m11231a(fm9.m11937a(em9Var3.f37471A, em9Var3.f37525z, em9Var2.f37471A, em9Var2.f37525z, c0158c.m1056e(51)));
            }
            if (i14 != 0) {
                em9Var.m11240j(fm9.m11937a(em9Var3.f37473C, em9Var3.f37472B, em9Var2.f37473C, em9Var2.f37472B, c0158c.m1056e(52)));
            }
            if ((i10 & 64) != 0) {
                Object objM11938b = fm9.m11938b(c0158c.m1056e(56), em9Var3.f37477G, em9Var2.f37477G);
                int i15 = em9Var.f37499b;
                em9Var.f37499b = objM11938b != null ? i15 | 64 : i15 & (-65);
                em9Var.f37477G = objM11938b;
            }
            if ((i10 & 32) != 0) {
                Object objM11938b2 = fm9.m11938b(c0158c.m1056e(55), em9Var3.f37476F, em9Var2.f37476F);
                int i16 = em9Var.f37499b;
                em9Var.f37499b = objM11938b2 != null ? i16 | 32 : i16 & (-33);
                em9Var.f37476F = objM11938b2;
            }
            if ((i10 & 8) != 0) {
                float fM1056e17 = c0158c.m1056e(53);
                o39 o39Var = em9Var3.f37475E;
                o39 o39Var2 = em9Var2.f37475E;
                if (fM1056e17 != 0.0f) {
                    if (fM1056e17 != f) {
                        if (!fa4.m11650l(o39Var, o39Var2)) {
                            objMo11319a = o39Var instanceof w94 ? ((w94) o39Var).mo11319a(o39Var2, fM1056e17) : null;
                            if (objMo11319a == null && (o39Var2 instanceof w94)) {
                                objMo11319a = ((w94) o39Var2).mo11319a(o39Var, f - fM1056e17);
                            }
                            if (objMo11319a == null) {
                                if (fM1056e17 < f2) {
                                    objMo11319a = o39Var;
                                } else {
                                    objMo11319a = o39Var2;
                                }
                            }
                        } else if (fM1056e17 < f2) {
                            objMo11319a = o39Var;
                        } else {
                            objMo11319a = o39Var2;
                        }
                        o39 o39Var3 = objMo11319a instanceof o39 ? (o39) objMo11319a : null;
                        if (o39Var3 != null) {
                            o39Var = o39Var3;
                        } else if (fM1056e17 >= d) {
                            o39Var = o39Var2;
                        }
                    } else {
                        o39Var = o39Var2;
                    }
                }
                em9Var.f37499b |= 8;
                em9Var.f37475E = o39Var;
            }
        } else {
            i12 = i12;
            f2 = 0.5f;
            d = 0.5d;
            i2 = 32;
        }
        if ((j5 & fm9.f39303e) != 0) {
            if ((j5 & 2097152) != 0) {
                float fM18232Q6 = AbstractC3423or.m18232Q(em9Var3.f37478H, em9Var2.f37478H, c0158c.m1056e(21));
                em9Var.f37497a = 2097152 | em9Var.f37497a;
                em9Var.f37478H = fM18232Q6;
            }
            if ((j5 & 4194304) != 0) {
                float fM18232Q7 = AbstractC3423or.m18232Q(em9Var3.f37479I, em9Var2.f37479I, c0158c.m1056e(22));
                em9Var.f37497a = 4194304 | em9Var.f37497a;
                em9Var.f37479I = fM18232Q7;
            }
            if ((j5 & 8388608) != 0) {
                float fM18232Q8 = AbstractC3423or.m18232Q(em9Var3.f37480J, em9Var2.f37480J, c0158c.m1056e(23));
                em9Var.f37497a = 8388608 | em9Var.f37497a;
                em9Var.f37480J = fM18232Q8;
            }
            if ((j5 & 16777216) != 0) {
                float fM18232Q9 = AbstractC3423or.m18232Q(em9Var3.f37481K, em9Var2.f37481K, c0158c.m1056e(24));
                em9Var.f37497a |= 16777216;
                em9Var.f37481K = fM18232Q9;
            }
            if ((j5 & 33554432) != 0) {
                float fM18232Q10 = AbstractC3423or.m18232Q(em9Var3.f37482L, em9Var2.f37482L, c0158c.m1056e(25));
                em9Var.f37497a |= 33554432;
                em9Var.f37482L = fM18232Q10;
            }
            if ((j5 & 67108864) != 0) {
                float fM18232Q11 = AbstractC3423or.m18232Q(em9Var3.f37483M, em9Var2.f37483M, c0158c.m1056e(26));
                em9Var.f37497a |= 67108864;
                em9Var.f37483M = fM18232Q11;
            }
            if ((j5 & 134217728) != 0) {
                float fM18232Q12 = AbstractC3423or.m18232Q(em9Var3.f37484N, em9Var2.f37484N, c0158c.m1056e(27));
                em9Var.f37497a |= 134217728;
                em9Var.f37484N = fM18232Q12;
            }
            if ((j5 & 268435456) != 0) {
                float fM18232Q13 = AbstractC3423or.m18232Q(em9Var3.f37485O, em9Var2.f37485O, c0158c.m1056e(28));
                em9Var.f37497a |= 268435456;
                em9Var.f37485O = fM18232Q13;
            }
            if ((j5 & 536870912) != 0) {
                float fM18232Q14 = AbstractC3423or.m18232Q(em9Var3.f37486P, em9Var2.f37486P, c0158c.m1056e(29));
                em9Var.f37497a |= 16777216;
                em9Var.f37481K = fM18232Q14;
            }
            if ((j5 & 1073741824) != 0) {
                float fM18232Q15 = AbstractC3423or.m18232Q(em9Var3.f37487Q, em9Var2.f37487Q, c0158c.m1056e(30));
                em9Var.f37497a |= 33554432;
                em9Var.f37482L = fM18232Q15;
            }
            if ((j5 & 4294967296L) != 0) {
                float fM18232Q16 = AbstractC3423or.m18232Q(em9Var3.f37489S, em9Var2.f37489S, c0158c.m1056e(i2));
                em9Var.f37497a |= 4294967296L;
                em9Var.f37489S = fM18232Q16;
            }
            if ((j5 & 2147483648L) != 0) {
                boolean z2 = (c0158c.m1056e(31) < f2 ? em9Var3 : em9Var2).f37474D;
                em9Var.f37497a |= 2147483648L;
                em9Var.f37474D = z2;
            }
        }
        if ((fm9.f39309k & i10) != 0 && (i10 & 16) != 0) {
            float fM1056e18 = c0158c.m1056e(54);
            fa1 fa1Var = em9Var3.f37490T;
            fa1 fa1Var2 = em9Var2.f37490T;
            if ((fa1Var instanceof qd0) && (fa1Var2 instanceof qd0)) {
                qd0 qd0Var = (qd0) fa1Var;
                qd0 qd0Var2 = (qd0) fa1Var2;
                dc5Var = new qd0((fM1056e18 <= f2 ? qd0Var : qd0Var2).f57604c, d32.m10026X(qd0Var.f57603b, qd0Var2.f57603b, fM1056e18));
            } else {
                if ((fa1Var instanceof dc5) && (fa1Var2 instanceof dc5)) {
                    dc5 dc5Var2 = (dc5) fa1Var;
                    dc5 dc5Var3 = (dc5) fa1Var2;
                    dc5Var = new dc5(d32.m10026X(dc5Var2.f35389b, dc5Var3.f35389b, fM1056e18), d32.m10026X(dc5Var2.f35390c, dc5Var3.f35390c, fM1056e18));
                } else if (fM1056e18 > f2) {
                    fa1Var = fa1Var2;
                }
                em9Var.f37499b |= 16;
                em9Var.f37490T = fa1Var;
            }
            fa1Var = dc5Var;
            em9Var.f37499b |= 16;
            em9Var.f37490T = fa1Var;
        }
        if ((j5 & 137438953472L) != 0) {
            long jM10026X2 = d32.m10026X(em9Var3.f37491U, em9Var2.f37491U, c0158c.m1056e(37));
            em9Var.f37497a |= 137438953472L;
            em9Var.f37499b &= -129;
            em9Var.f37491U = jM10026X2;
            em9Var.f37492V = null;
        }
        if (i12 != 0) {
            em9Var.m11235e(fm9.m11937a(em9Var3.f37492V, em9Var3.f37491U, em9Var2.f37492V, em9Var2.f37491U, c0158c.m1056e(57)));
        }
        if ((j5 & fm9.f39305g) != 0) {
            if ((j5 & 274877906944L) != 0) {
                em9Var.m11253w(((em9Var3.f37497a & 274877906944L) == 0 || ((274877906944L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(38)) >= d)) ? em9Var2.m11247q() : em9Var3.m11247q());
            }
            if ((j5 & 70368744177664L) != 0) {
                if ((em9Var3.f37497a & 70368744177664L) == 0) {
                    j3 = em9Var2.f37495Y;
                } else if ((em9Var2.f37497a & 70368744177664L) != 0) {
                    j3 = (((double) c0158c.m1056e(46)) < d ? em9Var3 : em9Var2).f37495Y;
                } else {
                    j3 = em9Var3.f37495Y;
                }
                em9Var.f37497a = 70368744177664L | em9Var.f37497a;
                em9Var.f37495Y = j3;
            }
            if ((j5 & 140737488355328L) != 0) {
                if ((em9Var3.f37497a & 140737488355328L) == 0) {
                    j2 = em9Var2.f37496Z;
                } else if ((em9Var2.f37497a & 140737488355328L) != 0) {
                    j2 = (((double) c0158c.m1056e(47)) < d ? em9Var3 : em9Var2).f37496Z;
                } else {
                    j2 = em9Var3.f37496Z;
                }
                em9Var.f37497a = 140737488355328L | em9Var.f37497a;
                em9Var.f37496Z = j2;
            }
            if ((j5 & 281474976710656L) != 0) {
                if ((em9Var3.f37497a & 281474976710656L) == 0) {
                    j = em9Var2.f37498a0;
                } else if ((em9Var2.f37497a & 281474976710656L) != 0) {
                    j = (((double) c0158c.m1056e(48)) < d ? em9Var3 : em9Var2).f37498a0;
                } else {
                    j = em9Var3.f37498a0;
                }
                em9Var.f37497a = 281474976710656L | em9Var.f37497a;
                em9Var.f37498a0 = j;
            }
            if ((j5 & 8796093022208L) != 0) {
                if ((em9Var3.f37497a & 8796093022208L) == 0) {
                    f3 = em9Var2.f37500b0;
                } else if ((em9Var2.f37497a & 8796093022208L) != 0) {
                    f3 = (((double) c0158c.m1056e(43)) < d ? em9Var3 : em9Var2).f37500b0;
                } else {
                    f3 = em9Var3.f37500b0;
                }
                em9Var.f37497a = 8796093022208L | em9Var.f37497a;
                em9Var.f37500b0 = f3;
            }
            if ((j5 & 562949953421312L) != 0) {
                if ((em9Var3.f37497a & 562949953421312L) != 0 && (em9Var2.f37497a & 562949953421312L) != 0) {
                    c0158c.m1056e(49);
                }
                em9Var.f37497a = 562949953421312L | em9Var.f37497a;
            }
            if ((j5 & 2199023255552L) != 0) {
                em9Var.m11252v(((em9Var3.f37497a & 2199023255552L) == 0 || ((2199023255552L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(41)) >= d)) ? em9Var2.m11246p() : em9Var3.m11246p());
            }
            if ((j5 & 4398046511104L) != 0) {
                em9Var.m11254x(((em9Var3.f37497a & 4398046511104L) == 0 || ((4398046511104L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(42)) >= d)) ? em9Var2.m11248r() : em9Var3.m11248r());
            }
            if ((j5 & 17592186044416L) != 0) {
                em9Var.m11251u(((em9Var3.f37497a & 17592186044416L) == 0 || ((17592186044416L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(44)) >= d)) ? em9Var2.m11244n() : em9Var3.m11244n());
            }
            if ((j5 & 35184372088832L) != 0) {
                em9Var.m11238h(((em9Var3.f37497a & 35184372088832L) == 0 || ((35184372088832L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(45)) >= d)) ? em9Var2.m11242l() : em9Var3.m11242l());
            }
            if ((j5 & 549755813888L) != 0) {
                em9Var.m11239i(((em9Var3.f37497a & 549755813888L) == 0 || ((549755813888L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(39)) >= d)) ? em9Var2.m11243m() : em9Var3.m11243m());
            }
            if ((j5 & 1099511627776L) != 0) {
                em9Var.m11237g(((em9Var3.f37497a & 1099511627776L) == 0 || ((1099511627776L & em9Var2.f37497a) != 0 && ((double) c0158c.m1056e(40)) >= d)) ? em9Var2.m11241k() : em9Var3.m11241k());
            }
        }
        if ((fm9.f39311m & i10) != 0) {
            if ((i10 & 256) != 0) {
                if ((em9Var3.f37499b & 256) != 0 && (em9Var2.f37499b & 256) != 0) {
                    c0158c.m1056e(58);
                }
                em9Var.f37499b |= 256;
            }
            if ((i10 & 512) != 0) {
                if ((em9Var3.f37499b & 512) == 0) {
                    ax9Var = em9Var2.f37493W;
                } else if ((em9Var2.f37499b & 512) != 0) {
                    ax9Var = (((double) c0158c.m1056e(59)) < d ? em9Var3 : em9Var2).f37493W;
                } else {
                    ax9Var = em9Var3.f37493W;
                }
                em9Var.f37499b |= 512;
                em9Var.f37493W = ax9Var;
            }
            if ((i10 & 1024) != 0) {
                if ((em9Var3.f37499b & 1024) == 0) {
                    aw9 aw9Var = em9Var2.f37494X;
                    aw9Var.getClass();
                    em9Var.f37499b |= 1024;
                    em9Var.f37494X = aw9Var;
                    return;
                }
                if ((em9Var2.f37499b & 1024) != 0) {
                    aw9 aw9Var2 = ((double) c0158c.m1056e(60)) < d ? em9Var3.f37494X : em9Var2.f37494X;
                    aw9Var2.getClass();
                    em9Var.f37499b |= 1024;
                    em9Var.f37494X = aw9Var2;
                    return;
                }
                aw9 aw9Var3 = em9Var3.f37494X;
                aw9Var3.getClass();
                em9Var.f37499b |= 1024;
                em9Var.f37494X = aw9Var3;
            }
        }
    }

    @Override // p000.w64
    /* JADX INFO: renamed from: l */
    public final ux8 mo1817l() {
        em9 em9Var = this.f61945c;
        if (em9Var == null) {
            return sr2.f61293a;
        }
        ArrayList arrayList = new ArrayList();
        long j = em9Var.f37497a;
        int i = em9Var.f37499b;
        if ((1 & j) != 0) {
            em9.m11230y(arrayList, "contentPaddingStart", Float.valueOf(em9Var.f37501c));
        }
        if ((2 & j) != 0) {
            em9.m11230y(arrayList, "contentPaddingEnd", Float.valueOf(em9Var.f37503d));
        }
        if ((4 & j) != 0) {
            em9.m11230y(arrayList, "contentPaddingTop", Float.valueOf(em9Var.f37504e));
        }
        if ((8 & j) != 0) {
            em9.m11230y(arrayList, "contentPaddingBottom", Float.valueOf(em9Var.f37505f));
        }
        if ((16 & j) != 0) {
            em9.m11230y(arrayList, "externalPaddingStart", Float.valueOf(em9Var.f37506g));
        }
        if ((32 & j) != 0) {
            em9.m11230y(arrayList, "externalPaddingEnd", Float.valueOf(em9Var.f37507h));
        }
        if ((64 & j) != 0) {
            em9.m11230y(arrayList, "externalPaddingTop", Float.valueOf(em9Var.f37508i));
        }
        if ((128 & j) != 0) {
            em9.m11230y(arrayList, "externalPaddingBottom", Float.valueOf(em9Var.f37509j));
        }
        if ((256 & j) != 0) {
            em9.m11230y(arrayList, "borderWidth", Float.valueOf(em9Var.f37510k));
        }
        if ((512 & j) != 0) {
            em9.m11230y(arrayList, "width", Float.valueOf(em9Var.f37511l));
        }
        if ((1024 & j) != 0) {
            em9.m11230y(arrayList, "height", Float.valueOf(em9Var.f37512m));
        }
        if ((2048 & j) != 0) {
            em9.m11230y(arrayList, "widthFraction", Float.valueOf(em9Var.f37513n));
        }
        if ((4096 & j) != 0) {
            em9.m11230y(arrayList, "heightFraction", Float.valueOf(em9Var.f37514o));
        }
        if ((2097152 & j) != 0) {
            em9.m11230y(arrayList, "alpha", Float.valueOf(em9Var.f37478H));
        }
        if ((4194304 & j) != 0) {
            em9.m11230y(arrayList, "scaleX", Float.valueOf(em9Var.f37479I));
        }
        if ((8388608 & j) != 0) {
            em9.m11230y(arrayList, "scaleY", Float.valueOf(em9Var.f37480J));
        }
        if ((16777216 & j) != 0) {
            em9.m11230y(arrayList, "translationX", Float.valueOf(em9Var.f37481K));
        }
        if ((33554432 & j) != 0) {
            em9.m11230y(arrayList, "translationY", Float.valueOf(em9Var.f37482L));
        }
        if ((67108864 & j) != 0) {
            em9.m11230y(arrayList, "rotationX", Float.valueOf(em9Var.f37483M));
        }
        if ((134217728 & j) != 0) {
            em9.m11230y(arrayList, "rotationY", Float.valueOf(em9Var.f37484N));
        }
        if ((268435456 & j) != 0) {
            em9.m11230y(arrayList, "rotationZ", Float.valueOf(em9Var.f37485O));
        }
        if ((536870912 & j) != 0) {
            em9.m11230y(arrayList, "transformOriginX", Float.valueOf(em9Var.f37486P));
        }
        if ((1073741824 & j) != 0) {
            em9.m11230y(arrayList, "transformOriginY", Float.valueOf(em9Var.f37487Q));
        }
        if ((4294967296L & j) != 0) {
            em9.m11230y(arrayList, "zIndex", Float.valueOf(em9Var.f37489S));
        }
        if ((i & 16) != 0) {
            em9.m11230y(arrayList, "colorFilter", em9Var.f37490T);
        }
        if ((8589934592L & j) != 0) {
            em9.m11230y(arrayList, "cameraDistance", Float.valueOf(em9Var.f37488R));
        }
        if ((34359738368L & j) != 0) {
            em9.m11230y(arrayList, "borderColor", new aa1(em9Var.f37523x));
        }
        if ((i & 1) != 0) {
            em9.m11230y(arrayList, "borderBrush", em9Var.f37524y);
        }
        if ((17179869184L & j) != 0) {
            em9.m11230y(arrayList, "backgroundColor", new aa1(em9Var.f37525z));
        }
        if ((i & 2) != 0) {
            em9.m11230y(arrayList, "backgroundBrush", em9Var.f37471A);
        }
        if ((i & 4) != 0) {
            em9.m11230y(arrayList, "foregroundBrush", em9Var.f37473C);
        }
        if ((2147483648L & j) != 0) {
            em9.m11230y(arrayList, "clip", Boolean.valueOf(em9Var.f37474D));
        }
        if ((i & 8) != 0) {
            em9.m11230y(arrayList, "shape", em9Var.f37475E);
        }
        if ((137438953472L & j) != 0) {
            em9.m11230y(arrayList, "contentColor", new aa1(em9Var.f37491U));
        }
        if ((i & 128) != 0) {
            em9.m11230y(arrayList, "contentBrush", em9Var.f37492V);
        }
        if ((i & 256) != 0) {
            em9.m11230y(arrayList, "fontFamily", null);
        }
        if ((i & 512) != 0) {
            em9.m11230y(arrayList, "textMotion", em9Var.f37493W);
        }
        if ((i & 1024) != 0) {
            em9.m11230y(arrayList, "textIndent", em9Var.f37494X);
        }
        if ((70368744177664L & j) != 0) {
            em9.m11230y(arrayList, "fontSize", new zx9(em9Var.f37495Y));
        }
        if ((140737488355328L & j) != 0) {
            em9.m11230y(arrayList, "lineHeight", new zx9(em9Var.f37496Z));
        }
        if ((281474976710656L & j) != 0) {
            em9.m11230y(arrayList, "letterSpacing", new zx9(em9Var.f37498a0));
        }
        if ((8796093022208L & j) != 0) {
            em9.m11230y(arrayList, "baselineShift", new oa0(em9Var.f37500b0));
        }
        if ((562949953421312L & j) != 0) {
            em9.m11230y(arrayList, "lineBreak", new hc5(0));
        }
        if ((2199023255552L & j) != 0) {
            em9.m11230y(arrayList, "textAlign", new ks9(em9Var.m11246p()));
        }
        if ((4398046511104L & j) != 0) {
            em9.m11230y(arrayList, "textDirection", new vt9(em9Var.m11248r()));
        }
        if ((17592186044416L & j) != 0) {
            em9.m11230y(arrayList, "hyphens", new kx3(em9Var.m11244n()));
        }
        if ((1099511627776L & j) != 0) {
            em9.m11230y(arrayList, "fontStyle", new wb3(em9Var.m11241k()));
        }
        if ((549755813888L & j) != 0) {
            em9.m11230y(arrayList, "fontWeight", em9Var.m11243m());
        }
        if ((35184372088832L & j) != 0) {
            em9.m11230y(arrayList, "fontSynthesis", new xb3(em9Var.m11242l()));
        }
        if ((j & 274877906944L) != 0) {
            em9.m11230y(arrayList, "textDecoration", em9Var.m11247q());
        }
        return new z91(arrayList, 0);
    }
}
