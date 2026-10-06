package p000;

import android.hardware.camera2.params.MeteringRectangle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kir implements kew {

    /* JADX INFO: renamed from: a */
    public Integer f36195a;

    /* JADX INFO: renamed from: b */
    public Integer f36196b;

    /* JADX INFO: renamed from: c */
    public Integer f36197c;

    /* JADX INFO: renamed from: d */
    public Integer f36198d;

    /* JADX INFO: renamed from: e */
    public Integer f36199e;

    /* JADX INFO: renamed from: f */
    public Boolean f36200f;

    /* JADX INFO: renamed from: g */
    public Boolean f36201g;

    /* JADX INFO: renamed from: h */
    public Boolean f36202h;

    /* JADX INFO: renamed from: i */
    public MeteringRectangle[] f36203i;

    /* JADX INFO: renamed from: j */
    public MeteringRectangle[] f36204j;

    /* JADX INFO: renamed from: k */
    public MeteringRectangle[] f36205k;

    public kir(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.f36195a = num;
        this.f36196b = num2;
        this.f36197c = num3;
        this.f36198d = num4;
        this.f36199e = num5;
        this.f36203i = meteringRectangleArr;
        this.f36204j = meteringRectangleArr2;
        this.f36205k = meteringRectangleArr3;
        this.f36200f = bool;
        this.f36201g = bool2;
        this.f36202h = bool3;
    }

    /* JADX INFO: renamed from: b */
    public static kir m14363b(kex kexVar) {
        return new kir(kexVar.mo14094d(), kexVar.mo14092b(), kexVar.mo14091a(), kexVar.mo14093c(), kexVar.mo14095e(), kexVar.mo14097g(), kexVar.mo14096f(), kexVar.mo14098h(), false, false, false);
    }

    /* JADX INFO: renamed from: c */
    public static kir m14364c(kis kisVar) {
        kir kirVarM14363b = m14363b(kisVar);
        kirVarM14363b.f36200f = kisVar.f36206a;
        kirVarM14363b.f36201g = kisVar.f36207b;
        kirVarM14363b.f36202h = kisVar.f36208c;
        return kirVarM14363b;
    }

    @Override // p000.kew
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ kex mo14090a() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final kis m14365d() {
        return new kis(this.f36195a.intValue(), this.f36196b.intValue(), this.f36197c.intValue(), this.f36198d.intValue(), this.f36199e.intValue(), this.f36200f.booleanValue(), this.f36201g.booleanValue(), this.f36202h.booleanValue(), this.f36203i, this.f36204j, this.f36205k);
    }
}
