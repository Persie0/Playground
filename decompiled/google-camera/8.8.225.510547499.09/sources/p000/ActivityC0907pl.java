package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p000.akq;
import p000.akv;

/* JADX INFO: renamed from: pl */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ActivityC0907pl extends ActivityC0136do implements akv, alw, akn, aqn, InterfaceC0914ps, InterfaceC0924qb, aca, acb, InterfaceC0130di, InterfaceC0131dj, aep {

    /* JADX INFO: renamed from: a */
    private final CopyOnWriteArrayList f47420a;

    /* JADX INFO: renamed from: b */
    private boolean f47421b;

    /* JADX INFO: renamed from: c */
    private boolean f47422c;

    /* JADX INFO: renamed from: d */
    private final ViewTreeObserverOnDrawListenerC0906pk f47423d;

    /* JADX INFO: renamed from: e */
    private bkn f47424e;

    /* JADX INFO: renamed from: g */
    public final C0913pr f47426g;

    /* JADX INFO: renamed from: h */
    public final C0923qa f47427h;

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f47428i;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f47429j;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f47430k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList f47431l;

    /* JADX INFO: renamed from: m */
    public final aks f47432m;

    /* JADX INFO: renamed from: n */
    final bzm f47433n;

    /* JADX INFO: renamed from: o */
    final bzm f47434o;

    /* JADX INFO: renamed from: f */
    public final C0915pt f47425f = new C0915pt();

    /* JADX INFO: renamed from: p */
    public final C1058va f47435p = new C1058va(new RunnableC0852nk(this, 5));

    public ActivityC0907pl() {
        aks aksVar = new aks(this);
        this.f47432m = aksVar;
        bzm bzmVarM468d = aff.m468d(this);
        this.f47433n = bzmVarM468d;
        this.f47426g = new C0913pr(new RunnableC0852nk(this, 6, (byte[]) null));
        ViewTreeObserverOnDrawListenerC0906pk viewTreeObserverOnDrawListenerC0906pk = new ViewTreeObserverOnDrawListenerC0906pk(this);
        this.f47423d = viewTreeObserverOnDrawListenerC0906pk;
        this.f47434o = new bzm(viewTreeObserverOnDrawListenerC0906pk);
        new AtomicInteger();
        this.f47427h = new C0923qa(this);
        this.f47420a = new CopyOnWriteArrayList();
        this.f47428i = new CopyOnWriteArrayList();
        this.f47429j = new CopyOnWriteArrayList();
        this.f47430k = new CopyOnWriteArrayList();
        this.f47431l = new CopyOnWriteArrayList();
        this.f47421b = false;
        this.f47422c = false;
        aksVar.m879a(new akt() { // from class: androidx.activity.ComponentActivity$3
            @Override // p000.akt
            /* JADX INFO: renamed from: a */
            public final void mo883a(akv akvVar, akq akqVar) {
                if (akqVar == akq.ON_STOP) {
                    Window window = this.f1426a.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        aksVar.m879a(new akt() { // from class: androidx.activity.ComponentActivity$4
            @Override // p000.akt
            /* JADX INFO: renamed from: a */
            public final void mo883a(akv akvVar, akq akqVar) {
                if (akqVar == akq.ON_DESTROY) {
                    this.f1427a.f47425f.f47454b = null;
                    if (this.f1427a.isChangingConfigurations()) {
                        return;
                    }
                    this.f1427a.getViewModelStore$ar$class_merging$ar$class_merging().m2591l();
                }
            }
        });
        aksVar.m879a(new akt() { // from class: androidx.activity.ComponentActivity$5
            @Override // p000.akt
            /* JADX INFO: renamed from: a */
            public final void mo883a(akv akvVar, akq akqVar) {
                this.f1428a.m19318m();
                this.f1428a.f47432m.m881c(this);
            }
        });
        bzmVarM468d.m3224g();
        all.m913c(this);
        getSavedStateRegistry().m1859b("android:support:activity-result", new C0088cg(this, 3));
        m19317l(new C0156eh(this, 2));
    }

    /* JADX INFO: renamed from: a */
    private void m19315a() {
        aci.m194c(getWindow().getDecorView(), this);
        acj.m196b(getWindow().getDecorView(), this);
        afh.m469A(getWindow().getDecorView(), this);
        C0209gg.m9201c(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(C0100R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m19315a();
        this.f47423d.m19314a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // p000.InterfaceC0924qb
    /* JADX INFO: renamed from: c */
    public final C0923qa mo3177c() {
        throw null;
    }

    @Override // p000.aca
    /* JADX INFO: renamed from: d */
    public final void mo176d(aea aeaVar) {
        this.f47420a.add(aeaVar);
    }

    @Override // p000.aca
    /* JADX INFO: renamed from: f */
    public final void mo177f(aea aeaVar) {
        this.f47420a.remove(aeaVar);
    }

    @Override // p000.akn
    public final alz getDefaultViewModelCreationExtras() {
        amb ambVar = new amb();
        if (getApplication() != null) {
            ambVar.m932b(als.f665b, getApplication());
        }
        ambVar.m932b(all.f643a, this);
        ambVar.m932b(all.f644b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            ambVar.m932b(all.f645c, getIntent().getExtras());
        }
        return ambVar;
    }

    @Override // p000.ActivityC0136do, p000.akv
    public final aks getLifecycle() {
        return this.f47432m;
    }

    @Override // p000.aqn
    public final aqm getSavedStateRegistry() {
        return (aqm) this.f47433n.f4820b;
    }

    @Override // p000.alw
    public final bkn getViewModelStore$ar$class_merging$ar$class_merging() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m19318m();
        return this.f47424e;
    }

    /* JADX INFO: renamed from: l */
    public final void m19317l(InterfaceC0916pu interfaceC0916pu) {
        C0915pt c0915pt = this.f47425f;
        if (c0915pt.f47454b != null) {
            Context context = c0915pt.f47454b;
            interfaceC0916pu.mo7319a();
        }
        c0915pt.f47453a.add(interfaceC0916pu);
    }

    /* JADX INFO: renamed from: m */
    public final void m19318m() {
        if (this.f47424e == null) {
            nax naxVar = (nax) getLastNonConfigurationInstance();
            if (naxVar != null) {
                this.f47424e = (bkn) naxVar.f41919a;
            }
            if (this.f47424e == null) {
                this.f47424e = new bkn((char[]) null, (byte[]) null);
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.f47427h.m19336e(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f47426g.m19329b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.f47420a.iterator();
        while (it.hasNext()) {
            ((aea) it.next()).mo309a(configuration);
        }
    }

    @Override // p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f47433n.m3225h(bundle);
        C0915pt c0915pt = this.f47425f;
        c0915pt.f47454b = this;
        Iterator it = c0915pt.f47453a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0916pu) it.next()).mo7319a();
        }
        super.onCreate(bundle);
        alh.m909b(this);
        int i = adg.f162a;
        this.f47426g.m19330c(C0905pj.m19313a(this));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(0, menu);
        this.f47435p.m19477e(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f47435p.m19479g(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.f47421b) {
            return;
        }
        Iterator it = this.f47430k.iterator();
        while (it.hasNext()) {
            ((aea) it.next()).mo309a(new lqc(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.f47429j.iterator();
        while (it.hasNext()) {
            ((aea) it.next()).mo309a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.f47435p.f47802a).iterator();
        while (it.hasNext()) {
            ((C0111cq) ((AmbientMode.AmbientController) it.next()).f1697a).m5339u(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.f47422c) {
            return;
        }
        Iterator it = this.f47431l.iterator();
        while (it.hasNext()) {
            ((aea) it.next()).mo309a(new lqc(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(0, view, menu);
        this.f47435p.m19478f(menu);
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f47427h.m19336e(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        nax naxVar;
        Object obj = this.f47424e;
        if (obj == null && (naxVar = (nax) getLastNonConfigurationInstance()) != null) {
            obj = naxVar.f41919a;
        }
        if (obj == null) {
            return null;
        }
        nax naxVar2 = new nax(null, null, null, null);
        naxVar2.f41919a = obj;
        return naxVar2;
    }

    @Override // p000.ActivityC0136do, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        aks aksVar = this.f47432m;
        if (aksVar instanceof aks) {
            aksVar.m882d(akr.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f47433n.m3226i(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.f47428i.iterator();
        while (it.hasNext()) {
            ((aea) it.next()).mo309a(Integer.valueOf(i));
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable, java.lang.Object] */
    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (arh.m1887a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            bzm bzmVar = this.f47434o;
            synchronized (bzmVar.f4820b) {
                bzmVar.f4819a = true;
                Iterator it = bzmVar.f4821c.iterator();
                while (it.hasNext()) {
                    ((omx) it.next()).mo2077a();
                }
                bzmVar.f4821c.clear();
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m19315a();
        this.f47423d.m19314a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.f47421b = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.f47421b = false;
            Iterator it = this.f47430k.iterator();
            while (it.hasNext()) {
                ((aea) it.next()).mo309a(new lqc(z, (byte[]) null));
            }
        } catch (Throwable th) {
            this.f47421b = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.f47422c = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.f47422c = false;
            Iterator it = this.f47431l.iterator();
            while (it.hasNext()) {
                ((aea) it.next()).mo309a(new lqc(z, (byte[]) null));
            }
        } catch (Throwable th) {
            this.f47422c = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m19315a();
        this.f47423d.m19314a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m19315a();
        this.f47423d.m19314a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
