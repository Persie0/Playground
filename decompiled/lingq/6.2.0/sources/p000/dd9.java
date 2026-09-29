package p000;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class dd9 {

    /* JADX INFO: renamed from: a */
    public final vi3 f35454a;

    /* JADX INFO: renamed from: b */
    public Object f35455b;

    /* JADX INFO: renamed from: c */
    public d66 f35456c;

    /* JADX INFO: renamed from: j */
    public boolean f35463j;

    /* JADX INFO: renamed from: k */
    public int f35464k;

    /* JADX INFO: renamed from: d */
    public int f35457d = -1;

    /* JADX INFO: renamed from: e */
    public final n66 f35458e = fa4.m11654p();

    /* JADX INFO: renamed from: f */
    public final n66 f35459f = new n66();

    /* JADX INFO: renamed from: g */
    public final o66 f35460g = new o66();

    /* JADX INFO: renamed from: h */
    public final x66 f35461h = new x66(new gc2[16]);

    /* JADX INFO: renamed from: i */
    public final sj3 f35462i = new sj3(this, 1);

    /* JADX INFO: renamed from: l */
    public final n66 f35465l = fa4.m11654p();

    /* JADX INFO: renamed from: m */
    public final HashMap f35466m = new HashMap();

    public dd9(vi3 vi3Var) {
        this.f35454a = vi3Var;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 16781. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m10297a(java.util.Set r46) {
        /*
            Method dump skipped, instruction units count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.dd9.m10297a(java.util.Set):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x008d A[LOOP:0: B:15:0x0048->B:28:0x008d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[EDGE_INSN: B:37:0x0090->B:29:0x0090 BREAK  A[LOOP:0: B:15:0x0048->B:28:0x008d], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m10298b(Object obj, int i, Object obj2, d66 d66Var) {
        int i2;
        if (this.f35464k > 0) {
            return;
        }
        int iM10124c = d66Var.m10124c(obj);
        if (iM10124c < 0) {
            iM10124c = ~iM10124c;
            i2 = -1;
        } else {
            i2 = d66Var.f35036c[iM10124c];
        }
        d66Var.f35035b[iM10124c] = obj;
        d66Var.f35036c[iM10124c] = i;
        if ((obj instanceof gc2) && i2 != i) {
            fc2 fc2VarM12475i = ((gc2) obj).m12475i();
            this.f35466m.put(obj, fc2VarM12475i.f38836f);
            d66 d66Var2 = fc2VarM12475i.f38835e;
            n66 n66Var = this.f35465l;
            fa4.m11633G(n66Var, obj);
            Object[] objArr = d66Var2.f35035b;
            long[] jArr = d66Var2.f35034a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i3 != length) {
                            break;
                            break;
                        }
                        i3++;
                    } else {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                ph9 ph9Var = (ph9) objArr[(i3 << 3) + i5];
                                if (ph9Var instanceof qh9) {
                                    ((qh9) ph9Var).m19974e(2);
                                }
                                fa4.m11645g(n66Var, ph9Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        } else if (i3 != length) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof qh9) {
                ((qh9) obj).m19974e(2);
            }
            fa4.m11645g(this.f35458e, obj, obj2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m10299c(Object obj, Object obj2) {
        n66 n66Var = this.f35458e;
        fa4.m11632F(n66Var, obj2, obj);
        if (!(obj2 instanceof gc2) || n66Var.m17251c(obj2)) {
            return;
        }
        fa4.m11633G(this.f35465l, obj2);
        this.f35466m.remove(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x009f A[LOOP:2: B:16:0x0066->B:28:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac A[EDGE_INSN: B:49:0x00ac->B:30:0x00ac BREAK  A[LOOP:2: B:16:0x0066->B:28:0x009f], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m10300d(vi3 vi3Var) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        n66 n66Var = this.f35459f;
        long[] jArr3 = n66Var.f52399a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j3 = jArr3[i2];
            char c2 = 7;
            long j4 = -9187201950435737472L;
            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j3 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = n66Var.f52400b[i6];
                        j2 = j4;
                        d66 d66Var = (d66) n66Var.f52401c[i6];
                        Boolean bool = (Boolean) vi3Var.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = d66Var.f35035b;
                            int[] iArr = d66Var.f35036c;
                            long[] jArr4 = d66Var.f35034a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j3;
                                int i8 = 0;
                                while (true) {
                                    long j5 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j5 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                m10299c(obj, obj2);
                                            }
                                            j5 >>= i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                        if (i8 != length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    } else if (i8 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j = j3;
                            }
                        } else {
                            jArr2 = jArr3;
                            j = j3;
                        }
                        if (bool.booleanValue()) {
                            n66Var.m17260l(i6);
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j3;
                        c = c2;
                        j2 = j4;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j3 = j >> i;
                    c2 = c;
                    j4 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
