package p000;

import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class gc2 extends qh9 implements dh9 {

    /* JADX INFO: renamed from: b */
    public final ui3 f40522b;

    /* JADX INFO: renamed from: c */
    public final yc9 f40523c;

    /* JADX INFO: renamed from: d */
    public fc2 f40524d = new fc2(nc9.m17358j().mo3582g());

    public gc2(ui3 ui3Var, yc9 yc9Var) {
        this.f40522b = ui3Var;
        this.f40523c = yc9Var;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: d */
    public final rh9 mo1310d() {
        return this.f40524d;
    }

    @Override // p000.ph9
    /* JADX INFO: renamed from: g */
    public final void mo1311g(rh9 rh9Var) {
        rh9Var.getClass();
        this.f40524d = (fc2) rh9Var;
    }

    @Override // p000.dh9
    public final Object getValue() {
        vi3 vi3VarMo3163e = nc9.m17358j().mo3163e();
        if (vi3VarMo3163e != null) {
            vi3VarMo3163e.invoke(this);
        }
        jc9 jc9VarM17358j = nc9.m17358j();
        return m12474h((fc2) nc9.m17357i(this.f40524d, jc9VarM17358j), jc9VarM17358j, true, this.f40522b).f38836f;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x009c A[EDGE_INSN: B:101:0x009c->B:31:0x009c BREAK  A[LOOP:1: B:16:0x0049->B:30:0x0099], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0099 A[Catch: all -> 0x0038, LOOP:1: B:16:0x0049->B:30:0x0099, LOOP_END, TryCatch #3 {all -> 0x0038, blocks: (B:8:0x0023, B:10:0x002f, B:13:0x003b, B:16:0x0049, B:18:0x0059, B:20:0x0065, B:22:0x006f, B:24:0x0087, B:26:0x008d, B:30:0x0099, B:31:0x009c), top: B:96:0x0023 }] */
    /* JADX INFO: renamed from: h */
    public final fc2 m12474h(fc2 fc2Var, jc9 jc9Var, boolean z, ui3 ui3Var) {
        fc2 fc2Var2;
        yc9 yc9Var;
        int i;
        if (fc2Var.m11763c(this, jc9Var)) {
            if (z) {
                x66 x66VarM1253c = AbstractC0278f.m1253c();
                Object[] objArr = x66VarM1253c.f67830a;
                int i2 = x66VarM1253c.f67832c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((sj3) objArr[i3]).m21416b();
                }
                try {
                    d66 d66Var = fc2Var.f38835e;
                    sq5 sq5Var = zc9.f71367a;
                    k84 k84Var = (k84) sq5Var.m21566g();
                    if (k84Var == null) {
                        k84Var = new k84();
                        sq5Var.m21552A(k84Var);
                    }
                    int i4 = k84Var.f46854a;
                    Object[] objArr2 = d66Var.f35035b;
                    int[] iArr = d66Var.f35036c;
                    long[] jArr = d66Var.f35034a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i5 != length) {
                                    break;
                                    break;
                                }
                                i5++;
                            } else {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j & 255) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        ph9 ph9Var = (ph9) objArr2[i9];
                                        i = i6;
                                        k84Var.f46854a = i4 + iArr[i9];
                                        vi3 vi3VarMo3163e = jc9Var.mo3163e();
                                        if (vi3VarMo3163e != null) {
                                            vi3VarMo3163e.invoke(ph9Var);
                                        }
                                    } else {
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                }
                                if (i7 != i6) {
                                    break;
                                }
                                if (i5 != length) {
                                    break;
                                }
                                i5++;
                            }
                        }
                    }
                    k84Var.f46854a = i4;
                } finally {
                    Object[] objArr3 = x66VarM1253c.f67830a;
                    int i10 = x66VarM1253c.f67832c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        ((sj3) objArr3[i11]).m21415a();
                    }
                }
            }
            return fc2Var;
        }
        d66 d66Var2 = new d66();
        sq5 sq5Var2 = zc9.f71367a;
        k84 k84Var2 = (k84) sq5Var2.m21566g();
        if (k84Var2 == null) {
            k84Var2 = new k84();
            sq5Var2.m21552A(k84Var2);
        }
        k84 k84Var3 = k84Var2;
        int i12 = k84Var3.f46854a;
        x66 x66VarM1253c2 = AbstractC0278f.m1253c();
        Object[] objArr4 = x66VarM1253c2.f67830a;
        int i13 = x66VarM1253c2.f67832c;
        for (int i14 = 0; i14 < i13; i14++) {
            ((sj3) objArr4[i14]).m21416b();
        }
        try {
            k84Var3.f46854a = i12 + 1;
            Object objM16107G = lda.m16107G(new ec2(i12, 0, this, k84Var3, d66Var2), ui3Var);
            k84Var3.f46854a = i12;
            Object[] objArr5 = x66VarM1253c2.f67830a;
            int i15 = x66VarM1253c2.f67832c;
            for (int i16 = 0; i16 < i15; i16++) {
                ((sj3) objArr5[i16]).m21415a();
            }
            Object obj = nc9.f52602c;
            synchronized (obj) {
                try {
                    jc9 jc9VarM17358j = nc9.m17358j();
                    Object obj2 = fc2Var.f38836f;
                    if (obj2 == fc2.f38832h || (yc9Var = this.f40523c) == null || !yc9Var.mo21078f(objM16107G, obj2)) {
                        fc2 fc2Var3 = this.f40524d;
                        synchronized (obj) {
                            rh9 rh9VarM17361m = nc9.m17361m(fc2Var3, this);
                            rh9VarM17361m.mo3651a(fc2Var3);
                            rh9VarM17361m.f59322a = jc9VarM17358j.mo3582g();
                            fc2Var2 = (fc2) rh9VarM17361m;
                            fc2Var2.f38835e = d66Var2;
                            fc2Var2.f38837g = fc2Var2.m11764d(this, jc9VarM17358j);
                            fc2Var2.f38836f = objM16107G;
                        }
                        return fc2Var2;
                    }
                    fc2Var.f38835e = d66Var2;
                    fc2Var.f38837g = fc2Var.m11764d(this, jc9VarM17358j);
                    fc2Var2 = fc2Var;
                } catch (Throwable th) {
                    throw th;
                }
            }
            k84 k84Var4 = (k84) zc9.f71367a.m21566g();
            if (k84Var4 == null || k84Var4.f46854a != 0) {
                return fc2Var2;
            }
            nc9.m17358j().mo3168m();
            synchronized (obj) {
                jc9 jc9VarM17358j2 = nc9.m17358j();
                fc2Var2.f38833c = jc9VarM17358j2.mo3582g();
                fc2Var2.f38834d = jc9VarM17358j2.mo3583h();
                return fc2Var2;
            }
        } catch (Throwable th2) {
            Object[] objArr6 = x66VarM1253c2.f67830a;
            int i17 = x66VarM1253c2.f67832c;
            for (int i18 = 0; i18 < i17; i18++) {
                ((sj3) objArr6[i18]).m21415a();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final fc2 m12475i() {
        jc9 jc9VarM17358j = nc9.m17358j();
        return m12474h((fc2) nc9.m17357i(this.f40524d, jc9VarM17358j), jc9VarM17358j, false, this.f40522b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        fc2 fc2Var = (fc2) nc9.m17356h(this.f40524d);
        sb.append(fc2Var.m11763c(this, nc9.m17358j()) ? String.valueOf(fc2Var.f38836f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
