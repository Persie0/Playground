package p000;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.runtime.R$id;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3192a;

/* JADX INFO: loaded from: classes.dex */
public abstract class uc1 extends tc1 implements dua, gr3, vl8, rr6, aj6, InterfaceC3564s7, ur6 {
    private static final oc1 Companion = new oc1();

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArrayList f63689H;

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArrayList f63690I;

    /* JADX INFO: renamed from: J */
    public final CopyOnWriteArrayList f63691J;

    /* JADX INFO: renamed from: K */
    public final CopyOnWriteArrayList f63692K;

    /* JADX INFO: renamed from: L */
    public boolean f63693L;

    /* JADX INFO: renamed from: M */
    public boolean f63694M;

    /* JADX INFO: renamed from: N */
    public final cs4 f63695N;

    /* JADX INFO: renamed from: O */
    public final cs4 f63696O;

    /* JADX INFO: renamed from: P */
    public final cs4 f63697P;

    /* JADX INFO: renamed from: b */
    public final pl1 f63698b;

    /* JADX INFO: renamed from: c */
    public final sq5 f63699c;

    /* JADX INFO: renamed from: d */
    public final fs6 f63700d;

    /* JADX INFO: renamed from: e */
    public cua f63701e;

    /* JADX INFO: renamed from: f */
    public final qc1 f63702f;

    /* JADX INFO: renamed from: g */
    public final cs4 f63703g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f63704h;

    /* JADX INFO: renamed from: i */
    public final sc1 f63705i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f63706j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f63707k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f63708l;

    public uc1() {
        pl1 pl1Var = new pl1();
        pl1Var.f56398b = new CopyOnWriteArraySet();
        this.f63698b = pl1Var;
        final int i = 1;
        this.f63699c = new sq5(new ic1(this, 1));
        lb4 lb4Var = new lb4(this, new y47(this, 8));
        fs6 fs6Var = new fs6(lb4Var);
        this.f63700d = fs6Var;
        this.f63702f = new qc1(this);
        final int i2 = 0;
        this.f63703g = AbstractC3192a.m15356a(new ui3(this) { // from class: kc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f47020b;

            {
                this.f47020b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i2;
                uc1 uc1Var = this.f47020b;
                switch (i3) {
                    case 0:
                        return new ti3(uc1Var.f63702f, new C3539rk(uc1Var, 8));
                    case 1:
                        rg2 rg2Var = new rg2();
                        uc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    case 2:
                        return new wl8(uc1Var.getApplication(), uc1Var, uc1Var.getIntent() != null ? uc1Var.getIntent().getExtras() : null);
                    default:
                        int i4 = 0;
                        pr6 pr6Var = new pr6(new ic1(uc1Var, 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                                uc1Var.f62130a.mo21323g(new jc1(i4, pr6Var, uc1Var));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new RunnableC3470pr(5, uc1Var, pr6Var));
                            }
                        }
                        return pr6Var;
                }
            }
        });
        this.f63704h = new AtomicInteger();
        this.f63705i = new sc1(this);
        this.f63706j = new CopyOnWriteArrayList();
        this.f63707k = new CopyOnWriteArrayList();
        this.f63708l = new CopyOnWriteArrayList();
        this.f63689H = new CopyOnWriteArrayList();
        this.f63690I = new CopyOnWriteArrayList();
        this.f63691J = new CopyOnWriteArrayList();
        this.f63692K = new CopyOnWriteArrayList();
        this.f63695N = AbstractC3192a.m15356a(new ui3(this) { // from class: kc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f47020b;

            {
                this.f47020b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i3 = i;
                uc1 uc1Var = this.f47020b;
                switch (i3) {
                    case 0:
                        return new ti3(uc1Var.f63702f, new C3539rk(uc1Var, 8));
                    case 1:
                        rg2 rg2Var = new rg2();
                        uc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    case 2:
                        return new wl8(uc1Var.getApplication(), uc1Var, uc1Var.getIntent() != null ? uc1Var.getIntent().getExtras() : null);
                    default:
                        int i4 = 0;
                        pr6 pr6Var = new pr6(new ic1(uc1Var, 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                                uc1Var.f62130a.mo21323g(new jc1(i4, pr6Var, uc1Var));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new RunnableC3470pr(5, uc1Var, pr6Var));
                            }
                        }
                        return pr6Var;
                }
            }
        });
        wb5 wb5Var = this.f62130a;
        if (wb5Var == null) {
            C3386nv.m17633t("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        wb5Var.mo21323g(new rb5(this) { // from class: lc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f49424b;

            {
                this.f49424b = this;
            }

            @Override // p000.rb5
            /* JADX INFO: renamed from: c */
            public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
                Window window;
                View viewPeekDecorView;
                int i3 = i2;
                uc1 uc1Var = this.f49424b;
                switch (i3) {
                    case 0:
                        if (lifecycle$Event == Lifecycle$Event.ON_STOP && (window = uc1Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                            uc1Var.f63698b.f56397a = null;
                            if (!uc1Var.isChangingConfigurations()) {
                                uc1Var.mo2116r().m9899a();
                            }
                            qc1 qc1Var = uc1Var.f63702f;
                            uc1 uc1Var2 = qc1Var.f57559d;
                            uc1Var2.getWindow().getDecorView().removeCallbacks(qc1Var);
                            uc1Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(qc1Var);
                        }
                        break;
                }
            }
        });
        this.f62130a.mo21323g(new rb5(this) { // from class: lc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f49424b;

            {
                this.f49424b = this;
            }

            @Override // p000.rb5
            /* JADX INFO: renamed from: c */
            public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
                Window window;
                View viewPeekDecorView;
                int i3 = i;
                uc1 uc1Var = this.f49424b;
                switch (i3) {
                    case 0:
                        if (lifecycle$Event == Lifecycle$Event.ON_STOP && (window = uc1Var.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                            uc1Var.f63698b.f56397a = null;
                            if (!uc1Var.isChangingConfigurations()) {
                                uc1Var.mo2116r().m9899a();
                            }
                            qc1 qc1Var = uc1Var.f63702f;
                            uc1 uc1Var2 = qc1Var.f57559d;
                            uc1Var2.getWindow().getDecorView().removeCallbacks(qc1Var);
                            uc1Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(qc1Var);
                        }
                        break;
                }
            }
        });
        this.f62130a.mo21323g(new d28(this, i));
        lb4Var.m16060a();
        ci8.m4731p(this);
        ((fs6) fs6Var.f39591c).m12094I("android:support:activity-result", new mc1(this, i2));
        m22669g(new nc1(this, i2));
        final int i3 = 2;
        this.f63696O = AbstractC3192a.m15356a(new ui3(this) { // from class: kc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f47020b;

            {
                this.f47020b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i4 = i3;
                uc1 uc1Var = this.f47020b;
                switch (i4) {
                    case 0:
                        return new ti3(uc1Var.f63702f, new C3539rk(uc1Var, 8));
                    case 1:
                        rg2 rg2Var = new rg2();
                        uc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    case 2:
                        return new wl8(uc1Var.getApplication(), uc1Var, uc1Var.getIntent() != null ? uc1Var.getIntent().getExtras() : null);
                    default:
                        int i5 = 0;
                        pr6 pr6Var = new pr6(new ic1(uc1Var, 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                                uc1Var.f62130a.mo21323g(new jc1(i5, pr6Var, uc1Var));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new RunnableC3470pr(5, uc1Var, pr6Var));
                            }
                        }
                        return pr6Var;
                }
            }
        });
        final int i4 = 3;
        this.f63697P = AbstractC3192a.m15356a(new ui3(this) { // from class: kc1

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uc1 f47020b;

            {
                this.f47020b = this;
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                int i5 = i4;
                uc1 uc1Var = this.f47020b;
                switch (i5) {
                    case 0:
                        return new ti3(uc1Var.f63702f, new C3539rk(uc1Var, 8));
                    case 1:
                        rg2 rg2Var = new rg2();
                        uc1Var.mo504a().m17693g(rg2Var);
                        return rg2Var;
                    case 2:
                        return new wl8(uc1Var.getApplication(), uc1Var, uc1Var.getIntent() != null ? uc1Var.getIntent().getExtras() : null);
                    default:
                        int i6 = 0;
                        pr6 pr6Var = new pr6(new ic1(uc1Var, 0));
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (fa4.m11650l(Looper.myLooper(), Looper.getMainLooper())) {
                                uc1Var.f62130a.mo21323g(new jc1(i6, pr6Var, uc1Var));
                            } else {
                                new Handler(Looper.getMainLooper()).post(new RunnableC3470pr(5, uc1Var, pr6Var));
                            }
                        }
                        return pr6Var;
                }
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static void m22668f(uc1 uc1Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!fa4.m11650l(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!fa4.m11650l(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // p000.ur6
    /* JADX INFO: renamed from: B */
    public final void mo13201B(lk1 lk1Var) {
        lk1Var.getClass();
        this.f63706j.remove(lk1Var);
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return this.f62130a;
    }

    @Override // p000.aj6
    /* JADX INFO: renamed from: a */
    public final ny8 mo504a() {
        return mo13202c().m19463b().f53170c;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22670h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f63702f.m19858a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p000.rr6
    /* JADX INFO: renamed from: c */
    public final pr6 mo13202c() {
        return (pr6) this.f63697P.getValue();
    }

    /* JADX INFO: renamed from: d */
    public zta mo2102d() {
        return (zta) this.f63696O.getValue();
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: e */
    public final p56 mo2103e() {
        p56 p56Var = new p56(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = p56Var.f58099a;
        if (application != null) {
            linkedHashMap.put(yta.f70452d, getApplication());
        }
        linkedHashMap.put(ci8.f10122f, this);
        linkedHashMap.put(ci8.f10123g, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(ci8.f10124h, extras);
        }
        return p56Var;
    }

    /* JADX INFO: renamed from: g */
    public final void m22669g(wr6 wr6Var) {
        pl1 pl1Var = this.f63698b;
        pl1Var.getClass();
        uc1 uc1Var = (uc1) pl1Var.f56397a;
        if (uc1Var != null) {
            wr6Var.mo9822a(uc1Var);
        }
        ((CopyOnWriteArraySet) pl1Var.f56398b).add(wr6Var);
    }

    /* JADX INFO: renamed from: h */
    public final void m22670h() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R$id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(androidx.activity.R$id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(androidx.activity.R$id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(androidx.navigationevent.R$id.view_tree_navigation_event_dispatcher_owner, this);
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC3102i7 m22671i(InterfaceC2991f7 interfaceC2991f7, pk9 pk9Var) {
        sc1 sc1Var = this.f63705i;
        sc1Var.getClass();
        return sc1Var.m21216c("activity_rq#" + this.f63704h.getAndIncrement(), this, pk9Var, interfaceC2991f7);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f63705i.m21214a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((rg2) this.f63695N.getValue()).m10414a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator it = this.f63706j.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(configuration);
        }
    }

    @Override // p000.tc1, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f63700d.m12091F(bundle);
        pl1 pl1Var = this.f63698b;
        pl1Var.getClass();
        pl1Var.f56397a = this;
        Iterator it = ((CopyOnWriteArraySet) pl1Var.f56398b).iterator();
        while (it.hasNext()) {
            ((wr6) it.next()).mo9822a(this);
        }
        super.onCreate(bundle);
        int i = s68.f60434a;
        q68.m19683b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f63699c.f61249c).iterator();
        while (it.hasNext()) {
            ((ce3) it.next()).f9965a.m2173k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f63699c.f61249c).iterator();
            while (it.hasNext()) {
                if (((ce3) it.next()).f9965a.m2181p()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.f63693L = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f63693L = false;
            Iterator it = this.f63689H.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((lk1) it.next()).accept(new h56(z, configuration));
            }
        } catch (Throwable th) {
            this.f63693L = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator it = this.f63708l.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.f63699c.f61249c).iterator();
        while (it.hasNext()) {
            ((ce3) it.next()).f9965a.m2182q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.f63694M = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f63694M = false;
            Iterator it = this.f63690I.iterator();
            it.getClass();
            while (it.hasNext()) {
                ((lk1) it.next()).accept(new i87(z, configuration));
            }
        } catch (Throwable th) {
            this.f63694M = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        bw8 bw8VarM15742a = l1c.m15742a(pictureInPictureUiState);
        Iterator it = this.f63691J.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(bw8VarM15742a);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f63699c.f61249c).iterator();
        while (it.hasNext()) {
            ((ce3) it.next()).f9965a.m2185t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.f63705i.m21214a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        pc1 pc1Var;
        cua cuaVar = this.f63701e;
        if (cuaVar == null && (pc1Var = (pc1) getLastNonConfigurationInstance()) != null) {
            cuaVar = pc1Var.f55942a;
        }
        if (cuaVar == null) {
            return null;
        }
        pc1 pc1Var2 = new pc1();
        pc1Var2.f55942a = cuaVar;
        return pc1Var2;
    }

    @Override // p000.tc1, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        wb5 wb5Var = this.f62130a;
        if (wb5Var != null) {
            wb5Var.m23835I(Lifecycle$State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f63700d.m12092G(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f63707k.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f63692K.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // p000.InterfaceC3564s7
    /* JADX INFO: renamed from: p */
    public final sc1 mo13203p() {
        return this.f63705i;
    }

    @Override // p000.dua
    /* JADX INFO: renamed from: r */
    public final cua mo2116r() {
        if (getApplication() == null) {
            C3386nv.m17633t("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this.f63701e == null) {
            pc1 pc1Var = (pc1) getLastNonConfigurationInstance();
            if (pc1Var != null) {
                this.f63701e = pc1Var.f55942a;
            }
            if (this.f63701e == null) {
                this.f63701e = new cua();
            }
        }
        cua cuaVar = this.f63701e;
        cuaVar.getClass();
        return cuaVar;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                pvc.m19517m("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ti3 ti3Var = (ti3) this.f63703g.getValue();
            synchronized (ti3Var.f62337a) {
                try {
                    ti3Var.f62338b = true;
                    Iterator it = ti3Var.f62339c.iterator();
                    while (it.hasNext()) {
                        ((ui3) it.next()).mo0a();
                    }
                    ti3Var.f62339c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m22670h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f63702f.m19858a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        return (fs6) this.f63700d.f39591c;
    }

    @Override // p000.ur6
    /* JADX INFO: renamed from: z */
    public final void mo13204z(lk1 lk1Var) {
        lk1Var.getClass();
        this.f63706j.add(lk1Var);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m22670h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f63702f.m19858a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m22670h();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        this.f63702f.m19858a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f63693L) {
            return;
        }
        Iterator it = this.f63689H.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(new h56(z));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f63694M) {
            return;
        }
        Iterator it = this.f63690I.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((lk1) it.next()).accept(new i87(z));
        }
    }
}
