package p000;

/* JADX INFO: loaded from: classes2.dex */
public class h60 implements st8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41825a;

    /* JADX INFO: renamed from: b */
    public final long f41826b;

    /* JADX INFO: renamed from: c */
    public final Object f41827c;

    public h60(long j, long j2) {
        this.f41825a = 2;
        this.f41826b = j;
        ut8 ut8Var = j2 == 0 ? ut8.f64337c : new ut8(0L, j2);
        this.f41827c = new rt8(ut8Var, ut8Var);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        switch (this.f41825a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        int i = this.f41825a;
        int i2 = 1;
        Object obj = this.f41827c;
        switch (i) {
            case 0:
                i60 i60Var = (i60) obj;
                rt8 rt8VarM23673b = i60Var.f43570i[0].m23673b(j);
                while (true) {
                    w11[] w11VarArr = i60Var.f43570i;
                    if (i2 >= w11VarArr.length) {
                        return rt8VarM23673b;
                    }
                    rt8 rt8VarM23673b2 = w11VarArr[i2].m23673b(j);
                    if (rt8VarM23673b2.f59799a.f64339b < rt8VarM23673b.f59799a.f64339b) {
                        rt8VarM23673b = rt8VarM23673b2;
                    }
                    i2++;
                }
                break;
            case 1:
                p63 p63Var = (p63) obj;
                p63Var.f55642k.getClass();
                p33 p33Var = p63Var.f55642k;
                long[] jArr = (long[]) p33Var.f55513b;
                long[] jArr2 = (long[]) p33Var.f55514c;
                int iM22809d = uma.m22809d(jArr, uma.m22813h((((long) p63Var.f55636e) * j) / 1000000, 0L, p63Var.f55641j - 1), false);
                long j2 = iM22809d == -1 ? 0L : jArr[iM22809d];
                long j3 = iM22809d != -1 ? jArr2[iM22809d] : 0L;
                int i3 = p63Var.f55636e;
                long j4 = (j2 * 1000000) / ((long) i3);
                long j5 = this.f41826b;
                ut8 ut8Var = new ut8(j4, j3 + j5);
                if (j4 == j || iM22809d == jArr.length - 1) {
                    return new rt8(ut8Var, ut8Var);
                }
                int i4 = iM22809d + 1;
                return new rt8(ut8Var, new ut8((jArr[i4] * 1000000) / ((long) i3), j5 + jArr2[i4]));
            default:
                return (rt8) obj;
        }
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        switch (this.f41825a) {
            case 0:
                return this.f41826b;
            case 1:
                return ((p63) this.f41827c).m18919b();
            default:
                return this.f41826b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h60(long j) {
        this(j, 0L);
        this.f41825a = 2;
    }

    public /* synthetic */ h60(Object obj, long j, int i) {
        this.f41825a = i;
        this.f41827c = obj;
        this.f41826b = j;
    }
}
