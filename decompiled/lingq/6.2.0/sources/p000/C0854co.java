package p000;

import android.window.OnBackInvokedCallback;

/* JADX INFO: renamed from: co */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0854co implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10341b;

    public /* synthetic */ C0854co(Object obj, int i) {
        this.f10340a = i;
        this.f10341b = obj;
    }

    public final void onBackInvoked() {
        int i = this.f10340a;
        Object obj = this.f10341b;
        switch (i) {
            case 0:
                ui3 ui3Var = (ui3) obj;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
                break;
            case 1:
                ((LayoutInflaterFactory2C3804yp) obj).m25223B();
                break;
            case 2:
                ((jr5) obj).mo6040a();
                break;
            case 3:
                ((hr6) obj).m10414a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
