package p000;

/* JADX INFO: loaded from: classes.dex */
public class vl6 {

    /* JADX INFO: renamed from: a */
    public final x66 f65569a = new x66(new ol6[16]);

    /* JADX INFO: renamed from: b */
    public final h66 f65570b = new h66(10);

    /* JADX INFO: renamed from: a */
    public boolean mo18096a(tk5 tk5Var, aq4 aq4Var, x44 x44Var, boolean z) {
        x66 x66Var = this.f65569a;
        Object[] objArr = x66Var.f67830a;
        int i = x66Var.f67832c;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((ol6) objArr[i2]).mo18096a(tk5Var, aq4Var, x44Var, z) || z2;
        }
        return z2;
    }

    /* JADX INFO: renamed from: b */
    public void mo18097b(x44 x44Var) {
        x66 x66Var = this.f65569a;
        int i = x66Var.f67832c;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((ol6) x66Var.f67830a[i]).f54537d.f44720b == 0) {
                x66Var.m24314l(i);
            }
        }
    }
}
