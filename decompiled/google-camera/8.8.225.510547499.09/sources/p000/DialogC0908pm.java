package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: pm */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC0908pm extends Dialog implements akv, InterfaceC0914ps, aqn {

    /* JADX INFO: renamed from: a */
    private final C0913pr f47436a;

    /* JADX INFO: renamed from: b */
    private aks f47437b;

    /* JADX INFO: renamed from: c */
    private final bzm f47438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0908pm(Context context, int i) {
        super(context, i);
        context.getClass();
        this.f47438c = aff.m468d(this);
        this.f47436a = new C0913pr(new RunnableC0852nk(this, 8));
    }

    /* JADX INFO: renamed from: a */
    private final void m19319a() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        aci.m194c(decorView, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        C0209gg.m9201c(decorView2, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        afh.m469A(decorView3, this);
    }

    /* JADX INFO: renamed from: b */
    private final aks m19320b() {
        aks aksVar = this.f47437b;
        if (aksVar != null) {
            return aksVar;
        }
        aks aksVar2 = new aks(this);
        this.f47437b = aksVar2;
        return aksVar2;
    }

    /* JADX INFO: renamed from: e */
    public static final void m19321e(DialogC0908pm dialogC0908pm) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m19319a();
        super.addContentView(view, layoutParams);
    }

    @Override // p000.akv
    public final aks getLifecycle() {
        return m19320b();
    }

    @Override // p000.aqn
    public final aqm getSavedStateRegistry() {
        return (aqm) this.f47438c.f4820b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f47436a.m19329b();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0913pr c0913pr = this.f47436a;
        OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
        onBackInvokedDispatcher.getClass();
        c0913pr.m19330c(onBackInvokedDispatcher);
        this.f47438c.m3225h(bundle);
        m19320b().m880b(akq.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f47438c.m3226i(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        m19320b().m880b(akq.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        m19320b().m880b(akq.ON_DESTROY);
        this.f47437b = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m19319a();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m19319a();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m19319a();
        super.setContentView(view, layoutParams);
    }
}
