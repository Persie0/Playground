package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bw2 implements sg5, gp9 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9084a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9085b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9086c;

    public /* synthetic */ bw2(int i, ca7 ca7Var, ca7 ca7Var2) {
        this.f9084a = i;
        this.f9085b = ca7Var;
        this.f9086c = ca7Var2;
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        ca7 ca7Var = (ca7) this.f9085b;
        ca7 ca7Var2 = (ca7) this.f9086c;
        ba7 ba7Var = (ba7) obj;
        ba7Var.getClass();
        ba7Var.mo3518o(this.f9084a, ca7Var, ca7Var2);
    }

    @Override // p000.gp9
    /* JADX INFO: renamed from: n */
    public Object mo395n() {
        n16 n16Var = (n16) this.f9085b;
        ((C3309ls) n16Var.f52176d).m16493M((q50) this.f9086c, this.f9084a + 1, false);
        return null;
    }

    public /* synthetic */ bw2(n16 n16Var, q50 q50Var, int i) {
        this.f9085b = n16Var;
        this.f9086c = q50Var;
        this.f9084a = i;
    }
}
