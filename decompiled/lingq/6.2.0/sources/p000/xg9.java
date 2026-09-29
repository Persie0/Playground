package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xg9 extends uc3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ st8 f68187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rr3 f68188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg9(rr3 rr3Var, st8 st8Var, st8 st8Var2) {
        super(st8Var);
        this.f68188c = rr3Var;
        this.f68187b = st8Var2;
    }

    @Override // p000.uc3, p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        rt8 rt8VarMo3543f = this.f68187b.mo3543f(j);
        ut8 ut8Var = rt8VarMo3543f.f59799a;
        long j2 = ut8Var.f64338a;
        long j3 = ut8Var.f64339b;
        long j4 = this.f68188c.f59738b;
        ut8 ut8Var2 = new ut8(j2, j3 + j4);
        ut8 ut8Var3 = rt8VarMo3543f.f59800b;
        return new rt8(ut8Var2, new ut8(ut8Var3.f64338a, ut8Var3.f64339b + j4));
    }
}
