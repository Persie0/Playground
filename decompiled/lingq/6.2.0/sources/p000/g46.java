package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class g46 implements st8 {

    /* JADX INFO: renamed from: a */
    public final long f40180a;

    /* JADX INFO: renamed from: b */
    public final h46[] f40181b;

    /* JADX INFO: renamed from: c */
    public final int f40182c;

    public g46(long j, h46[] h46VarArr, int i) {
        this.f40180a = j;
        this.f40181b = h46VarArr;
        this.f40182c = i;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0061  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    /* JADX WARN: Code duplicated, block: B:34:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:53:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x009c A[SYNTHETIC] */
    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        long j2;
        long j3;
        long jMin;
        long j4;
        int i;
        long jMin2;
        o8a o8aVar;
        long[] jArr;
        int iM17854a;
        int iM17854a2;
        int iM17855b;
        h46[] h46VarArr = this.f40181b;
        int length = h46VarArr.length;
        ut8 ut8Var = ut8.f64337c;
        if (length == 0) {
            return new rt8(ut8Var, ut8Var);
        }
        int i2 = this.f40182c;
        if (i2 != -1) {
            o8a o8aVar2 = h46VarArr[i2].f41777b;
            int iM17854a3 = o8aVar2.m17854a(j);
            if (iM17854a3 == -1) {
                iM17854a3 = o8aVar2.m17855b(j);
            }
            long[] jArr2 = o8aVar2.f54017c;
            long[] jArr3 = o8aVar2.f54020f;
            if (iM17854a3 == -1) {
                return new rt8(ut8Var, ut8Var);
            }
            j3 = jArr3[iM17854a3];
            j2 = jArr2[iM17854a3];
            if (j3 < j && iM17854a3 < o8aVar2.f54016b - 1 && (iM17855b = o8aVar2.m17855b(j)) != -1 && iM17855b != iM17854a3) {
                j4 = jArr3[iM17855b];
                jMin = jArr2[iM17855b];
            }
            jMin2 = j2;
            for (i = 0; i < h46VarArr.length; i++) {
                if (i != i2) {
                    o8aVar = h46VarArr[i].f41777b;
                    jArr = o8aVar.f54017c;
                    iM17854a = o8aVar.m17854a(j3);
                    if (iM17854a == -1) {
                        iM17854a = o8aVar.m17855b(j3);
                    }
                    if (iM17854a != -1) {
                        jMin2 = Math.min(jArr[iM17854a], jMin2);
                    }
                    if (j4 == -9223372036854775807L) {
                        iM17854a2 = o8aVar.m17854a(j4);
                        if (iM17854a2 == -1) {
                            iM17854a2 = o8aVar.m17855b(j4);
                        }
                        if (iM17854a2 == -1) {
                            jMin = Math.min(jArr[iM17854a2], jMin);
                        }
                    }
                }
            }
            ut8 ut8Var2 = new ut8(j3, jMin2);
            return j4 == -9223372036854775807L ? new rt8(ut8Var2, ut8Var2) : new rt8(ut8Var2, new ut8(j4, jMin));
        }
        j2 = Long.MAX_VALUE;
        j3 = j;
        jMin = -1;
        j4 = -9223372036854775807L;
        jMin2 = j2;
        while (i < h46VarArr.length) {
            if (i != i2) {
                o8aVar = h46VarArr[i].f41777b;
                jArr = o8aVar.f54017c;
                iM17854a = o8aVar.m17854a(j3);
                if (iM17854a == -1) {
                    iM17854a = o8aVar.m17855b(j3);
                }
                if (iM17854a != -1) {
                    jMin2 = Math.min(jArr[iM17854a], jMin2);
                }
                if (j4 == -9223372036854775807L) {
                    iM17854a2 = o8aVar.m17854a(j4);
                    if (iM17854a2 == -1) {
                        iM17854a2 = o8aVar.m17855b(j4);
                    }
                    if (iM17854a2 == -1) {
                        jMin = Math.min(jArr[iM17854a2], jMin);
                    }
                }
            }
        }
        ut8 ut8Var3 = new ut8(j3, jMin2);
        if (j4 == -9223372036854775807L) {
        }
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f40180a;
    }
}
