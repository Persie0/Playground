package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class zf5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71491a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dg5 f71492b;

    public /* synthetic */ zf5(dg5 dg5Var, int i) {
        this.f71491a = i;
        this.f71492b = dg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f71491a;
        dg5 dg5Var = this.f71492b;
        switch (i) {
            case 0:
                nm2 nm2Var = dg5Var.f35610c;
                if (nm2Var != null) {
                    nm2Var.setListSelectionHidden(true);
                    nm2Var.requestLayout();
                }
                break;
            default:
                nm2 nm2Var2 = dg5Var.f35610c;
                if (nm2Var2 != null && nm2Var2.isAttachedToWindow() && dg5Var.f35610c.getCount() > dg5Var.f35610c.getChildCount() && dg5Var.f35610c.getChildCount() <= dg5Var.f35594H) {
                    dg5Var.f35607U.setInputMethodMode(2);
                    dg5Var.mo10360f();
                    break;
                }
                break;
        }
    }
}
