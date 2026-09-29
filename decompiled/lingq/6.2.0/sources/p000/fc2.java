package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class fc2 extends rh9 {

    /* JADX INFO: renamed from: h */
    public static final Object f38832h = new Object();

    /* JADX INFO: renamed from: c */
    public long f38833c;

    /* JADX INFO: renamed from: d */
    public int f38834d;

    /* JADX INFO: renamed from: e */
    public d66 f38835e;

    /* JADX INFO: renamed from: f */
    public Object f38836f;

    /* JADX INFO: renamed from: g */
    public int f38837g;

    public fc2(long j) {
        super(j);
        d66 d66Var = hp6.f42737a;
        d66Var.getClass();
        this.f38835e = d66Var;
        this.f38836f = f38832h;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: a */
    public final void mo3651a(rh9 rh9Var) {
        rh9Var.getClass();
        fc2 fc2Var = (fc2) rh9Var;
        this.f38835e = fc2Var.f38835e;
        this.f38836f = fc2Var.f38836f;
        this.f38837g = fc2Var.f38837g;
    }

    @Override // p000.rh9
    /* JADX INFO: renamed from: b */
    public final rh9 mo3652b(long j) {
        return new fc2(j);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11763c(gc2 gc2Var, jc9 jc9Var) {
        boolean z;
        boolean z2;
        Object obj = nc9.f52602c;
        synchronized (obj) {
            z = true;
            z2 = (this.f38833c == jc9Var.mo3582g() && this.f38834d == jc9Var.mo3583h()) ? false : true;
        }
        if (this.f38836f == f38832h || (z2 && this.f38837g != m11764d(gc2Var, jc9Var))) {
            z = false;
        }
        if (!z || !z2) {
            return z;
        }
        synchronized (obj) {
            this.f38833c = jc9Var.mo3582g();
            this.f38834d = jc9Var.mo3583h();
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[PHI: r11
      0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[Catch: all -> 0x00cc, LOOP:3: B:29:0x009c->B:44:0x00de, LOOP_END, TryCatch #0 {all -> 0x00cc, blocks: (B:12:0x0025, B:15:0x0032, B:17:0x0041, B:19:0x004f, B:21:0x0059, B:24:0x0076, B:26:0x007a, B:29:0x009c, B:31:0x00ab, B:33:0x00b5, B:35:0x00bb, B:38:0x00cf, B:47:0x00f8, B:44:0x00de, B:46:0x00e8), top: B:74:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014c A[LOOP:5: B:62:0x014a->B:63:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8 A[EDGE_INSN: B:84:0x00f8->B:47:0x00f8 BREAK  A[LOOP:3: B:29:0x009c->B:44:0x00de], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [fc2] */
    /* JADX WARN: Type inference failed for: r13v5, types: [rh9] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, rh9] */
    /* JADX WARN: Type inference failed for: r18v3, types: [int] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX INFO: renamed from: d */
    public final int m11764d(gc2 gc2Var, jc9 jc9Var) {
        d66 d66Var;
        int iIdentityHashCode;
        Object[] objArr;
        int i;
        int i2;
        long[] jArr;
        int i3;
        Object[] objArr2;
        long[] jArr2;
        ?? r25;
        Object[] objArr3;
        long j;
        long j2;
        int i4;
        ?? r26;
        ?? M17357i;
        synchronized (nc9.f52602c) {
            d66Var = this.f38835e;
        }
        int i5 = 7;
        if (d66Var.f35038e == 0) {
            return 7;
        }
        x66 x66VarM1253c = AbstractC0278f.m1253c();
        Object[] objArr4 = x66VarM1253c.f67830a;
        int i6 = x66VarM1253c.f67832c;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((sj3) objArr4[i7]).m21416b();
        }
        try {
            Object[] objArr5 = d66Var.f35035b;
            int[] iArr = d66Var.f35036c;
            long[] jArr3 = d66Var.f35034a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i3 = i5;
                        ?? r3 = z;
                        while (r3 < i10) {
                            if ((j3 & 255) < 128) {
                                ?? r18 = (i8 << 3) + r3;
                                j2 = j4;
                                ph9 ph9Var = (ph9) objArr5[r18];
                                int i11 = i9;
                                if (iArr[r18] != 1) {
                                    jArr2 = jArr3;
                                    r25 = r3;
                                    objArr3 = objArr5;
                                    j = j3;
                                } else {
                                    if (ph9Var instanceof gc2) {
                                        gc2 gc2Var2 = (gc2) ph9Var;
                                        M17357i = gc2Var2.m12474h((fc2) nc9.m17357i(gc2Var2.f40524d, jc9Var), jc9Var, z, gc2Var2.f40522b);
                                        d66 d66Var2 = M17357i.f38835e;
                                        Object[] objArr6 = d66Var2.f35035b;
                                        long[] jArr4 = d66Var2.f35034a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        if (length2 >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j5 = jArr4[i12];
                                                j = j3;
                                                int iIdentityHashCode2 = iIdentityHashCode;
                                                if ((((~j5) << i3) & j5 & j2) == j2) {
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                } else {
                                                    int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                                    for (int i14 = 0; i14 < i13; i14++) {
                                                        if ((j5 & 255) < 128) {
                                                            iIdentityHashCode2 = (iIdentityHashCode2 * 31) + System.identityHashCode((ph9) objArr6[(i12 << 3) + i14]);
                                                        }
                                                        j5 >>= i11;
                                                    }
                                                    if (i13 != i11) {
                                                        iIdentityHashCode = iIdentityHashCode2;
                                                        break;
                                                    }
                                                    iIdentityHashCode = iIdentityHashCode2;
                                                    if (i12 != length2) {
                                                        break;
                                                    }
                                                    i12++;
                                                    j3 = j;
                                                    i11 = 8;
                                                }
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        r26 = r3;
                                        objArr3 = objArr5;
                                        j = j3;
                                        M17357i = nc9.m17357i(ph9Var.mo1310d(), jc9Var);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(M17357i)) * 31) + Long.hashCode(M17357i.f59322a);
                                    r25 = r26;
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                r25 = r3;
                                objArr3 = objArr5;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr5 = objArr3;
                            z = false;
                            r3 = r25 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr2 = objArr5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i3 = i5;
                        objArr2 = objArr5;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i3;
                        jArr3 = jArr;
                        objArr5 = objArr2;
                        z = false;
                    } else {
                        i5 = iIdentityHashCode;
                    }
                }
                objArr = x66VarM1253c.f67830a;
                i = x66VarM1253c.f67832c;
                for (i2 = 0; i2 < i; i2++) {
                    ((sj3) objArr[i2]).m21415a();
                }
                return iIdentityHashCode;
            }
            iIdentityHashCode = i5;
            objArr = x66VarM1253c.f67830a;
            i = x66VarM1253c.f67832c;
            while (i2 < i) {
                ((sj3) objArr[i2]).m21415a();
            }
            return iIdentityHashCode;
        } catch (Throwable th) {
            Object[] objArr7 = x66VarM1253c.f67830a;
            int i15 = x66VarM1253c.f67832c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((sj3) objArr7[i16]).m21415a();
            }
            throw th;
        }
    }
}
