package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g56 {

    /* JADX INFO: renamed from: a */
    public final n66 f40233a;

    public /* synthetic */ g56(n66 n66Var) {
        this.f40233a = n66Var;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m12364a(n66 n66Var) {
        Object objM17255g = n66Var.m17255g(null);
        if (objM17255g == null) {
            return null;
        }
        if (!(objM17255g instanceof h66)) {
            n66Var.m17259k(null);
            return objM17255g;
        }
        h66 h66Var = (h66) objM17255g;
        if (h66Var.m719d()) {
            uk9.m22775i("List is empty.");
            return null;
        }
        int i = h66Var.f1294b - 1;
        Object objM717b = h66Var.m717b(i);
        h66Var.m13095l(i);
        objM717b.getClass();
        if (h66Var.m719d()) {
            n66Var.m17259k(null);
        }
        if (h66Var.f1294b == 1) {
            n66Var.m17261m(null, h66Var.m716a());
        }
        return objM717b;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x005e A[LOOP:0: B:9:0x001c->B:22:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[EDGE_INSN: B:25:0x0061->B:23:0x0061 BREAK  A[LOOP:0: B:9:0x001c->B:22:0x005e], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final h66 m12365b(n66 n66Var) {
        if (n66Var.m17257i()) {
            h66 h66Var = ip6.f44400b;
            h66Var.getClass();
            return h66Var;
        }
        h66 h66Var2 = new h66();
        Object[] objArr = n66Var.f52401c;
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
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof h66) {
                                h66Var2.m13091h((h66) obj);
                            } else {
                                obj.getClass();
                                h66Var2.m13090g(obj);
                            }
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
        return h66Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g56) {
            return this.f40233a.equals(((g56) obj).f40233a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f40233a.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.f40233a + ')';
    }
}
