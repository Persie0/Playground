package p000;

import android.app.Activity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dcf implements fbp, fbg {

    /* JADX INFO: renamed from: a */
    private DialogInterfaceC0155eg f10506a;

    /* JADX INFO: renamed from: b */
    private final Activity f10507b;

    public dcf(jvd jvdVar, fan fanVar, Activity activity) {
        jvdVar.execute(new cuq(this, fanVar, 5));
        this.f10507b = activity;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m5922b(DialogInterfaceC0155eg dialogInterfaceC0155eg) {
        jvd.m13538a();
        DialogInterfaceC0155eg dialogInterfaceC0155eg2 = this.f10506a;
        if (dialogInterfaceC0155eg2 != null) {
            dialogInterfaceC0155eg2.dismiss();
        }
        this.f10506a = dialogInterfaceC0155eg;
        if (this.f10507b.isFinishing()) {
            return false;
        }
        dialogInterfaceC0155eg.show();
        return true;
    }

    @Override // p000.fbg
    /* JADX INFO: renamed from: bC */
    public final void mo3521bC() {
        DialogInterfaceC0155eg dialogInterfaceC0155eg = this.f10506a;
        if (dialogInterfaceC0155eg != null) {
            dialogInterfaceC0155eg.dismiss();
        }
    }
}
