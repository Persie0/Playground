package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bg9 implements l43 {

    /* JADX INFO: renamed from: a */
    public final float f8516a;

    /* JADX INFO: renamed from: b */
    public final float f8517b;

    /* JADX INFO: renamed from: c */
    public final Object f8518c;

    public bg9(float f, float f2, Object obj) {
        this.f8516a = f;
        this.f8517b = f2;
        this.f8518c = obj;
    }

    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    public final voa mo589a(jda jdaVar) {
        InterfaceC3117in gw9Var;
        Object obj = this.f8518c;
        AbstractC3081hn abstractC3081hn = obj == null ? null : (AbstractC3081hn) jdaVar.f45442a.invoke(obj);
        int[] iArr = woa.f67133a;
        float f = this.f8516a;
        float f2 = this.f8517b;
        if (abstractC3081hn != null) {
            gw9Var = new gw9(abstractC3081hn, f, f2);
        } else {
            nr9 nr9Var = new nr9();
            nr9Var.f53173a = new m73(f, f2, 0.01f);
            gw9Var = nr9Var;
        }
        nr9 nr9Var2 = new nr9();
        nr9Var2.f53173a = new ny8(gw9Var);
        return nr9Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bg9) {
            bg9 bg9Var = (bg9) obj;
            if (bg9Var.f8516a == this.f8516a && bg9Var.f8517b == this.f8517b && fa4.m11650l(bg9Var.f8518c, this.f8518c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f8518c;
        return Float.hashCode(this.f8517b) + wq1.m24105a((obj != null ? obj.hashCode() : 0) * 31, this.f8516a, 31);
    }

    public /* synthetic */ bg9(Object obj) {
        this(1.0f, 1500.0f, obj);
    }
}
