package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ip5 implements m98 {

    /* JADX INFO: renamed from: b */
    public boolean f44396b;

    /* JADX INFO: renamed from: c */
    public boolean f44397c;

    /* JADX INFO: renamed from: a */
    public boolean f44395a = true;

    /* JADX INFO: renamed from: d */
    public final n66 f44398d = new n66();

    /* JADX WARN: Code duplicated, block: B:18:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0051 A[LOOP:0: B:5:0x000d->B:19:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[EDGE_INSN: B:23:0x0054->B:20:0x0054 BREAK  A[LOOP:0: B:5:0x000d->B:19:0x0051], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m14063a() {
        n66 n66Var = this.f44398d;
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
                                h66 h66Var = (h66) obj;
                                Object[] objArr2 = h66Var.f1293a;
                                int i4 = h66Var.f1294b;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        n66Var.m17249a();
    }
}
