package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class os3 extends vj1 {

    /* JADX INFO: renamed from: t0 */
    public vj1[] f54930t0 = new vj1[4];

    /* JADX INFO: renamed from: u0 */
    public int f54931u0 = 0;

    /* JADX INFO: renamed from: S */
    public final void m18460S(vj1 vj1Var) {
        if (vj1Var == this || vj1Var == null) {
            return;
        }
        int i = this.f54931u0 + 1;
        vj1[] vj1VarArr = this.f54930t0;
        if (i > vj1VarArr.length) {
            this.f54930t0 = (vj1[]) Arrays.copyOf(vj1VarArr, vj1VarArr.length * 2);
        }
        vj1[] vj1VarArr2 = this.f54930t0;
        int i2 = this.f54931u0;
        vj1VarArr2[i2] = vj1Var;
        this.f54931u0 = i2 + 1;
    }

    /* JADX INFO: renamed from: T */
    public final void m18461T(int i, k4b k4bVar, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f54931u0; i2++) {
            k4bVar.m14844a(this.f54930t0[i2]);
        }
        for (int i3 = 0; i3 < this.f54931u0; i3++) {
            bna.m3923L(this.f54930t0[i3], i, arrayList, k4bVar);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo11369U() {
    }

    @Override // p000.vj1
    /* JADX INFO: renamed from: g */
    public void mo10150g(vj1 vj1Var, HashMap map) {
        super.mo10150g(vj1Var, map);
        os3 os3Var = (os3) vj1Var;
        this.f54931u0 = 0;
        int i = os3Var.f54931u0;
        for (int i2 = 0; i2 < i; i2++) {
            m18460S((vj1) map.get(os3Var.f54930t0[i2]));
        }
    }
}
