package p000;

import androidx.concurrent.futures.C0464b;
import java.util.NoSuchElementException;
import kotlinx.coroutines.CoroutineStart;
import p000.RunnableC3781y2;
import p000.cd4;
import p000.kn1;
import p000.nj0;
import p000.r78;
import p000.vz1;
import p000.wfb;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lz6 {

    /* JADX INFO: renamed from: a */
    public static final b64 f50353a = new b64("Auth.GOOGLE_SIGN_IN_API", new ncb(6), new p84(7));

    /* JADX INFO: renamed from: a */
    public static final void m16576a(io5 io5Var, io5 io5Var2) {
        if (lp1.f49971a.contains(lz6.class)) {
            return;
        }
        try {
            io5Var.getClass();
            io5Var2.getClass();
            int[] iArr = io5Var.f44357a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var2.f44359c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        int i7 = (i5 * i3) + (i4 * i2 * i3) + i6;
                        fArr[i7] = fArr[i7] + fArr2[i6];
                    }
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final io5 m16577b(io5[] io5VarArr) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            int i = io5VarArr[0].f44357a[0];
            int i2 = 0;
            for (io5 io5Var : io5VarArr) {
                i2 += io5Var.f44357a[1];
            }
            io5 io5Var2 = new io5(new int[]{i, i2});
            float[] fArr = io5Var2.f44359c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                for (io5 io5Var3 : io5VarArr) {
                    float[] fArr2 = io5Var3.f44359c;
                    int i5 = io5Var3.f44357a[1];
                    System.arraycopy(fArr2, i3 * i5, fArr, i4, i5);
                    i4 += i5;
                }
            }
            return io5Var2;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final io5 m16578c(io5 io5Var, io5 io5Var2) {
        io5 io5Var3;
        io5 io5Var4 = null;
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            io5Var.getClass();
            io5Var2.getClass();
            int[] iArr = io5Var.f44357a;
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int[] iArr2 = io5Var2.f44357a;
            int i5 = iArr2[0];
            int i6 = (i3 - i5) + 1;
            int i7 = iArr2[2];
            io5 io5Var5 = new io5(new int[]{i2, i6, i7});
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var5.f44359c;
            float[] fArr3 = io5Var2.f44359c;
            int i8 = 0;
            while (i8 < i2) {
                int i9 = i;
                while (i9 < i7) {
                    int i10 = i;
                    while (i10 < i6) {
                        float f = 0.0f;
                        io5Var3 = io5Var4;
                        int i11 = i;
                        while (i11 < i5) {
                            while (i < i4) {
                                try {
                                    f = (fArr[((i11 + i10) * i4) + (i3 * i4 * i8) + i] * fArr3[(((i11 * i4) + i) * i7) + i9]) + f;
                                    i++;
                                } catch (Throwable th) {
                                    th = th;
                                    lp1.m16420a(lz6.class, th);
                                    return io5Var3;
                                }
                            }
                            i11++;
                            i = 0;
                        }
                        fArr2[(i10 * i7) + (i6 * i7 * i8) + i9] = f;
                        i10++;
                        io5Var4 = io5Var3;
                        i = 0;
                    }
                    i9++;
                    i = 0;
                }
                i8++;
                i = 0;
            }
            return io5Var5;
        } catch (Throwable th2) {
            th = th2;
            io5Var3 = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final io5 m16579d(io5 io5Var, io5 io5Var2, io5 io5Var3) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            io5Var.getClass();
            io5Var2.getClass();
            io5Var3.getClass();
            int i = io5Var.f44357a[0];
            int i2 = io5Var3.f44357a[0];
            io5 io5VarM16584i = m16584i(io5Var, io5Var2);
            float[] fArr = io5Var3.f44359c;
            float[] fArr2 = io5VarM16584i.f44359c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = (i3 * i2) + i4;
                    fArr2[i5] = fArr2[i5] + fArr[i4];
                }
            }
            return io5VarM16584i;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final io5 m16580e(String[] strArr, io5 io5Var) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            io5Var.getClass();
            int length = strArr.length;
            int i = io5Var.f44357a[1];
            io5 io5Var2 = new io5(new int[]{length, 128, i});
            float[] fArr = io5Var2.f44359c;
            float[] fArr2 = io5Var.f44359c;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArrM12769n = gna.f41053a.m12769n(strArr[i2]);
                for (int i3 = 0; i3 < 128; i3++) {
                    System.arraycopy(fArr2, iArrM12769n[i3] * i, fArr, (i * i3) + (i * 128 * i2), i);
                }
            }
            return io5Var2;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX INFO: renamed from: f */
    public static final void m16581f(io5 io5Var) {
        boolean z;
        int i;
        if (lp1.f49971a.contains(lz6.class)) {
            return;
        }
        try {
            io5Var.getClass();
            int[] iArr = io5Var.f44357a;
            int i2 = 1;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            int i3 = 1;
            for (int i4 = 1; i4 < length; i4++) {
                i3 *= io5Var.f44357a[i4];
            }
            int i5 = io5Var.f44357a[0];
            int[] iArr2 = {i5, i3};
            io5Var.f44357a = iArr2;
            i84 i84Var = new i84(1, 1, 1);
            int i6 = i84Var.f40380b;
            int i7 = i84Var.f40381c;
            if (i7 > 0) {
                if (1 <= i6) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (1 >= i6) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i2 = i6;
            }
            while (z) {
                if (i2 != i6) {
                    i = i2 + i7;
                } else {
                    if (!z) {
                        throw new NoSuchElementException();
                    }
                    i = i2;
                    z = false;
                }
                i5 *= iArr2[i2];
                i2 = i;
            }
            float[] fArr = new float[i5];
            System.arraycopy(io5Var.f44359c, 0, fArr, 0, Math.min(io5Var.f44358b, i5));
            io5Var.f44359c = fArr;
            io5Var.f44358b = i5;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static gm0 m16582g(final kn1 kn1Var, final zi3 zi3Var) {
        final CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        kn1Var.getClass();
        coroutineStart.getClass();
        return f5d.m11561c(new em0() { // from class: androidx.work.a
            @Override // p000.em0
            /* JADX INFO: renamed from: c */
            public final Object mo392c(C0464b c0464b) {
                nj0 nj0Var = nj0.f52795N;
                kn1 kn1Var2 = kn1Var;
                RunnableC3781y2 runnableC3781y2 = new RunnableC3781y2((cd4) kn1Var2.get(nj0Var), 24);
                DirectExecutor directExecutor = DirectExecutor.INSTANCE;
                r78 r78Var = c0464b.f5330c;
                if (r78Var != null) {
                    r78Var.mo52a(runnableC3781y2, directExecutor);
                }
                return wfb.m23926u(vz1.m23619a(kn1Var2), null, coroutineStart, new ListenableFutureKt$launchFuture$1$2(zi3Var, c0464b, null), 1);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static final io5 m16583h(io5 io5Var, int i) {
        io5 io5Var2;
        io5 io5Var3 = null;
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            io5Var.getClass();
            int[] iArr = io5Var.f44357a;
            int i2 = 0;
            int i3 = iArr[0];
            int i4 = iArr[1];
            int i5 = iArr[2];
            int i6 = (i4 - i) + 1;
            io5 io5Var4 = new io5(new int[]{i3, i6, i5});
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var4.f44359c;
            int i7 = 0;
            while (i7 < i3) {
                int i8 = i2;
                while (i8 < i5) {
                    int i9 = i2;
                    while (i9 < i6) {
                        int i10 = i9 * i5;
                        int i11 = (i7 * i6 * i5) + i10 + i8;
                        int i12 = (i7 * i4 * i5) + i10 + i8;
                        fArr2[i11] = Float.MIN_VALUE;
                        int i13 = i2;
                        while (i13 < i) {
                            io5Var2 = io5Var3;
                            try {
                                fArr2[i11] = Math.max(fArr2[i11], fArr[(i13 * i5) + i12]);
                                i13++;
                                io5Var3 = io5Var2;
                            } catch (Throwable th) {
                                th = th;
                                lp1.m16420a(lz6.class, th);
                                return io5Var2;
                            }
                        }
                        i9++;
                        i2 = 0;
                    }
                    i8++;
                    i2 = 0;
                }
                i7++;
                i2 = 0;
            }
            return io5Var4;
        } catch (Throwable th2) {
            th = th2;
            io5Var2 = io5Var3;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final io5 m16584i(io5 io5Var, io5 io5Var2) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            io5Var.getClass();
            io5Var2.getClass();
            int i = io5Var.f44357a[0];
            int[] iArr = io5Var2.f44357a;
            int i2 = iArr[0];
            int i3 = iArr[1];
            io5 io5Var3 = new io5(new int[]{i, i3});
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var2.f44359c;
            float[] fArr3 = io5Var3.f44359c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    int i6 = (i4 * i3) + i5;
                    fArr3[i6] = 0.0f;
                    for (int i7 = 0; i7 < i2; i7++) {
                        fArr3[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr3[i6];
                    }
                }
            }
            return io5Var3;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m16585j(io5 io5Var) {
        if (lp1.f49971a.contains(lz6.class)) {
            return;
        }
        try {
            io5Var.getClass();
            float[] fArr = io5Var.f44359c;
            int length = fArr.length;
            for (int i = 0; i < length; i++) {
                if (fArr[i] < 0.0f) {
                    fArr[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m16586k(io5 io5Var) {
        if (lp1.f49971a.contains(lz6.class)) {
            return;
        }
        try {
            io5Var.getClass();
            int[] iArr = io5Var.f44357a;
            int i = iArr[0];
            int i2 = iArr[1];
            float[] fArr = io5Var.f44359c;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = i3 * i2;
                int i5 = i4 + i2;
                float f = Float.MIN_VALUE;
                for (int i6 = i4; i6 < i5; i6++) {
                    float f2 = fArr[i6];
                    if (f2 > f) {
                        f = f2;
                    }
                }
                float f3 = 0.0f;
                for (int i7 = i4; i7 < i5; i7++) {
                    float fExp = (float) Math.exp(fArr[i7] - f);
                    fArr[i7] = fExp;
                    f3 += fExp;
                }
                while (i4 < i5) {
                    fArr[i4] = fArr[i4] / f3;
                    i4++;
                }
            }
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final io5 m16587l(io5 io5Var) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            int[] iArr = io5Var.f44357a;
            int i = iArr[0];
            int i2 = iArr[1];
            io5 io5Var2 = new io5(new int[]{i2, i});
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var2.f44359c;
            for (int i3 = 0; i3 < i; i3++) {
                for (int i4 = 0; i4 < i2; i4++) {
                    fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
                }
            }
            return io5Var2;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static final io5 m16588m(io5 io5Var) {
        if (lp1.f49971a.contains(lz6.class)) {
            return null;
        }
        try {
            int[] iArr = io5Var.f44357a;
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            io5 io5Var2 = new io5(new int[]{i3, i2, i});
            float[] fArr = io5Var.f44359c;
            float[] fArr2 = io5Var2.f44359c;
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < i3; i6++) {
                        fArr2[(i5 * i) + (i6 * i * i2) + i4] = fArr[(i5 * i3) + (i4 * i2 * i3) + i6];
                    }
                }
            }
            return io5Var2;
        } catch (Throwable th) {
            lp1.m16420a(lz6.class, th);
            return null;
        }
    }
}
