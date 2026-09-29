package p000;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ff1 implements ov5, gm2 {

    /* JADX INFO: renamed from: a */
    public fm2 f38988a;

    /* JADX INFO: renamed from: b */
    public fm2 f38989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n9b f38990c;

    public ff1(n9b n9bVar) {
        this.f38990c = n9bVar;
        this.f38988a = new fm2(n9bVar.f57434c.f39279c, 0, null);
        this.f38989b = new fm2(n9bVar.f57435d.f39279c, 0, null);
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: C */
    public final void mo11804C(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var, int i2) {
        if (m11805a(i, jv5Var)) {
            fm2 fm2Var = this.f38988a;
            ru5 ru5VarM11806b = m11806b(ru5Var);
            fm2Var.getClass();
            fm2Var.m11936a(new d52(fm2Var, eh5Var, ru5VarM11806b, i2));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11805a(int i, jv5 jv5Var) {
        jv5 jv5VarMo17295u;
        n9b n9bVar = this.f38990c;
        if (jv5Var != null) {
            jv5VarMo17295u = n9bVar.mo17295u(jv5Var);
            if (jv5VarMo17295u == null) {
                return false;
            }
        } else {
            jv5VarMo17295u = null;
        }
        fm2 fm2Var = this.f38988a;
        if (fm2Var.f39277a != i || !Objects.equals(fm2Var.f39278b, jv5VarMo17295u)) {
            this.f38988a = new fm2(n9bVar.f57434c.f39279c, i, jv5VarMo17295u);
        }
        fm2 fm2Var2 = this.f38989b;
        if (fm2Var2.f39277a == i && Objects.equals(fm2Var2.f39278b, jv5VarMo17295u)) {
            return true;
        }
        this.f38989b = new fm2(n9bVar.f57435d.f39279c, i, jv5VarMo17295u);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final ru5 m11806b(ru5 ru5Var) {
        long j = ru5Var.f59830c;
        long j2 = ru5Var.f59831d;
        return (j == j && j2 == j2) ? ru5Var : new ru5(ru5Var.f59828a, ru5Var.f59829b, j, j2);
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: c */
    public final void mo11807c(int i, jv5 jv5Var, ru5 ru5Var) {
        if (m11805a(i, jv5Var)) {
            fm2 fm2Var = this.f38988a;
            ru5 ru5VarM11806b = m11806b(ru5Var);
            fm2Var.getClass();
            fm2Var.m11936a(new vg1(13, fm2Var, ru5VarM11806b));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: g */
    public final void mo11808g(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        if (m11805a(i, jv5Var)) {
            fm2 fm2Var = this.f38988a;
            ru5 ru5VarM11806b = m11806b(ru5Var);
            fm2Var.getClass();
            fm2Var.m11936a(new kv5(fm2Var, eh5Var, ru5VarM11806b, 1));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: j */
    public final void mo11809j(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var) {
        if (m11805a(i, jv5Var)) {
            fm2 fm2Var = this.f38988a;
            ru5 ru5VarM11806b = m11806b(ru5Var);
            fm2Var.getClass();
            fm2Var.m11936a(new kv5(fm2Var, eh5Var, ru5VarM11806b, 0));
        }
    }

    @Override // p000.ov5
    /* JADX INFO: renamed from: l */
    public final void mo11810l(int i, jv5 jv5Var, eh5 eh5Var, ru5 ru5Var, IOException iOException, boolean z) {
        if (m11805a(i, jv5Var)) {
            fm2 fm2Var = this.f38988a;
            ru5 ru5VarM11806b = m11806b(ru5Var);
            fm2Var.getClass();
            fm2Var.m11936a(new lv5(fm2Var, eh5Var, ru5VarM11806b, iOException, z));
        }
    }
}
