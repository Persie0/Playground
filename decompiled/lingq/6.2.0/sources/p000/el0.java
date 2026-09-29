package p000;

/* JADX INFO: loaded from: classes.dex */
public final class el0 extends vc3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fl0 f37404b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pc0 f37405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public el0(fl0 fl0Var, pc0 pc0Var, t89 t89Var) {
        super(t89Var);
        this.f37404b = fl0Var;
        this.f37405c = pc0Var;
    }

    @Override // p000.vc3, p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        fl0 fl0Var = this.f37404b;
        pc0 pc0Var = this.f37405c;
        synchronized (fl0Var) {
            if (pc0Var.f55937a) {
                return;
            }
            pc0Var.f55937a = true;
            super.close();
            ((C3552rx) this.f37405c.f55938b).m20968c();
        }
    }
}
