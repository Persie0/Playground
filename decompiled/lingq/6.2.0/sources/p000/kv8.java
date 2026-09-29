package p000;

import androidx.collection.C0038a;
import androidx.compose.p002ui.semantics.C0427g;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class kv8 implements tv8, Iterable, tg4 {

    /* JADX INFO: renamed from: a */
    public final n66 f48471a;

    /* JADX INFO: renamed from: b */
    public cq5 f48472b;

    /* JADX INFO: renamed from: c */
    public boolean f48473c;

    /* JADX INFO: renamed from: d */
    public boolean f48474d;

    public kv8() {
        long[] jArr = om8.f54590a;
        this.f48471a = new n66();
    }

    @Override // p000.tv8
    /* JADX INFO: renamed from: d */
    public final void mo3709d(C0427g c0427g, Object obj) {
        boolean z = obj instanceof C3024g3;
        n66 n66Var = this.f48471a;
        if (z && n66Var.m17251c(c0427g)) {
            Object objM17255g = n66Var.m17255g(c0427g);
            objM17255g.getClass();
            C3024g3 c3024g3 = (C3024g3) objM17255g;
            C3024g3 c3024g4 = (C3024g3) obj;
            String str = c3024g4.f40090a;
            if (str == null) {
                str = c3024g3.f40090a;
            }
            xi3 xi3Var = c3024g4.f40091b;
            if (xi3Var == null) {
                xi3Var = c3024g3.f40091b;
            }
            n66Var.m17261m(c0427g, new C3024g3(str, xi3Var));
        } else {
            n66Var.m17261m(c0427g, obj);
        }
        c0427g.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv8)) {
            return false;
        }
        kv8 kv8Var = (kv8) obj;
        return fa4.m11650l(this.f48471a, kv8Var.f48471a) && this.f48473c == kv8Var.f48473c && this.f48474d == kv8Var.f48474d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005d A[LOOP:0: B:5:0x0026->B:15:0x005d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[EDGE_INSN: B:18:0x0060->B:16:0x0060 BREAK  A[LOOP:0: B:5:0x0026->B:15:0x005d], SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final kv8 m15705f() {
        kv8 kv8Var = new kv8();
        kv8Var.f48473c = this.f48473c;
        kv8Var.f48474d = this.f48474d;
        n66 n66Var = kv8Var.f48471a;
        n66Var.getClass();
        n66 n66Var2 = this.f48471a;
        n66Var2.getClass();
        Object[] objArr = n66Var2.f52400b;
        Object[] objArr2 = n66Var2.f52401c;
        long[] jArr = n66Var2.f52399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            n66Var.m17261m(objArr[i4], objArr2[i4]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return kv8Var;
    }

    /* JADX INFO: renamed from: g */
    public final Object m15706g(C0427g c0427g) {
        Object objM17255g = this.f48471a.m17255g(c0427g);
        if (objM17255g != null) {
            return objM17255g;
        }
        v63.m23148z("Key not present: ", c0427g, " - consider getOrElse or getOrNull");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m15707h(kv8 kv8Var) {
        n66 n66Var = kv8Var.f48471a;
        Object[] objArr = n66Var.f52400b;
        Object[] objArr2 = n66Var.f52401c;
        long[] jArr = n66Var.f52399a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        C0427g c0427g = (C0427g) obj;
                        n66 n66Var2 = this.f48471a;
                        Object objM17255g = n66Var2.m17255g(c0427g);
                        c0427g.getClass();
                        Object objInvoke = c0427g.f5024b.invoke(objM17255g, obj2);
                        if (objInvoke != null) {
                            n66Var2.m17261m(c0427g, objInvoke);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48474d) + g9a.m12428e(this.f48471a.hashCode() * 31, 31, this.f48473c);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        cq5 cq5Var = this.f48472b;
        if (cq5Var == null) {
            n66 n66Var = this.f48471a;
            n66Var.getClass();
            cq5 cq5Var2 = new cq5(n66Var);
            this.f48472b = cq5Var2;
            cq5Var = cq5Var2;
        }
        return ((C0038a) cq5Var.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f48473c) {
            sb.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f48474d) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        n66 n66Var = this.f48471a;
        Object[] objArr = n66Var.f52400b;
        Object[] objArr2 = n66Var.f52401c;
        long[] jArr = n66Var.f52399a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((C0427g) obj).f5023a);
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ygd.m25141a(this) + "{ " + ((Object) sb) + " }";
    }
}
