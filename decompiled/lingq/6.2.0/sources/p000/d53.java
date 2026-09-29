package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class d53 extends z67 {

    /* JADX INFO: renamed from: b */
    public final jk3 f35010b;

    public d53(jk3 jk3Var) {
        this.f35010b = jk3Var;
    }

    @Override // p000.z67
    /* JADX INFO: renamed from: a */
    public final boolean mo3300a() {
        jk3 jk3Var = this.f35010b;
        if (!jk3Var.m14520C()) {
            return false;
        }
        if (jk3Var.m14522y() > 0 || jk3Var.m14521x() > 0) {
            return true;
        }
        return jk3Var.m14519B() && jk3Var.m14518A().m11925w();
    }
}
