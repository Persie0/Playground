package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.runtime.R$id;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes2.dex */
public class xc1 extends Dialog implements ub5, rr6, aj6, vl8 {

    /* JADX INFO: renamed from: a */
    public wb5 f68051a;

    /* JADX INFO: renamed from: b */
    public final fs6 f68052b;

    /* JADX INFO: renamed from: c */
    public final cs4 f68053c;

    /* JADX INFO: renamed from: d */
    public final cs4 f68054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(Context context, int i) {
        super(context, i);
        context.getClass();
        this.f68052b = new fs6(new lb4(this, new y47(this, 8)));
        final int i2 = 0;
        this.f68053c = AbstractC3192a.m15356a(new ui3(this) { // from class: wc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ xc1 f66610b;

            {
                this.f66610b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                xc1 xc1Var = this.f66610b;
                switch (i3) {
                    case 0:
                        rg2 rg2Var = new rg2();
                        xc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    default:
                        return new pr6(new RunnableC3781y2(xc1Var, 12));
                }
            }
        });
        final int i3 = 1;
        this.f68054d = AbstractC3192a.m15356a(new ui3(this) { // from class: wc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ xc1 f66610b;

            {
                this.f66610b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                xc1 xc1Var = this.f66610b;
                switch (i4) {
                    case 0:
                        rg2 rg2Var = new rg2();
                        xc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    default:
                        return new pr6(new RunnableC3781y2(xc1Var, 12));
                }
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static void m24444b(xc1 xc1Var) {
        super.onBackPressed();
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return m24445d();
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: a */
    public final ny8 mo504a() {
        return mo13202c().m19463b().f53170c;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m24446e();
        super.addContentView(view, layoutParams);
    }

    @Override // p000.rr6
    /* JADX INFO: renamed from: c */
    public final pr6 mo13202c() {
        return (pr6) this.f68054d.getValue();
    }

    /* JADX INFO: renamed from: d */
    public final wb5 m24445d() {
        wb5 wb5Var = this.f68051a;
        if (wb5Var != null) {
            return wb5Var;
        }
        wb5 wb5Var2 = new wb5(this, true);
        this.f68051a = wb5Var2;
        return wb5Var2;
    }

    /* JADX INFO: renamed from: e */
    public final void m24446e() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R$id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(androidx.navigationevent.R$id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((rg2) this.f68053c.getValue()).m10414a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            pr6 pr6VarMo13202c = mo13202c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            pr6VarMo13202c.m19464c(onBackInvokedDispatcher);
        }
        this.f68052b.m12091F(bundle);
        m24445d().m23833G(Lifecycle$Event.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.f68052b.m12092G(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        m24445d().m23833G(Lifecycle$Event.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m24445d().m23833G(Lifecycle$Event.ON_DESTROY);
        this.f68051a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        m24446e();
        super.setContentView(view);
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        return (fs6) this.f68052b.f39591c;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m24446e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        m24446e();
        super.setContentView(view, layoutParams);
    }
}
