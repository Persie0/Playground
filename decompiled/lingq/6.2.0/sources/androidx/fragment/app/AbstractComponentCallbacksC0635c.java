package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.FragmentStrictMode$Flag;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.runtime.R$id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC3102i7;
import p000.AbstractC3572sf;
import p000.C3386nv;
import p000.InterfaceC2991f7;
import p000.RunnableC0002a0;
import p000.RunnableC3795yg;
import p000.ad3;
import p000.bd3;
import p000.bq1;
import p000.cd3;
import p000.ci8;
import p000.cua;
import p000.daa;
import p000.dd3;
import p000.dua;
import p000.ed3;
import p000.fs6;
import p000.gr3;
import p000.hd3;
import p000.id3;
import p000.lb4;
import p000.le3;
import p000.lg3;
import p000.p56;
import p000.pk9;
import p000.qn3;
import p000.rf3;
import p000.sf3;
import p000.ub5;
import p000.vl8;
import p000.w56;
import p000.wb5;
import p000.wl8;
import p000.wq1;
import p000.y47;
import p000.yta;
import p000.zta;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0635c implements ComponentCallbacks, View.OnCreateContextMenuListener, ub5, dua, gr3, vl8 {

    /* JADX INFO: renamed from: v0 */
    public static final Object f5665v0 = new Object();

    /* JADX INFO: renamed from: H */
    public boolean f5666H;

    /* JADX INFO: renamed from: I */
    public boolean f5667I;

    /* JADX INFO: renamed from: J */
    public boolean f5668J;

    /* JADX INFO: renamed from: K */
    public boolean f5669K;

    /* JADX INFO: renamed from: L */
    public boolean f5670L;

    /* JADX INFO: renamed from: M */
    public boolean f5671M;

    /* JADX INFO: renamed from: N */
    public boolean f5672N;

    /* JADX INFO: renamed from: O */
    public int f5673O;

    /* JADX INFO: renamed from: P */
    public AbstractC0638f f5674P;

    /* JADX INFO: renamed from: Q */
    public hd3 f5675Q;

    /* JADX INFO: renamed from: R */
    public le3 f5676R;

    /* JADX INFO: renamed from: S */
    public AbstractComponentCallbacksC0635c f5677S;

    /* JADX INFO: renamed from: T */
    public int f5678T;

    /* JADX INFO: renamed from: U */
    public int f5679U;

    /* JADX INFO: renamed from: V */
    public String f5680V;

    /* JADX INFO: renamed from: W */
    public boolean f5681W;

    /* JADX INFO: renamed from: X */
    public boolean f5682X;

    /* JADX INFO: renamed from: Y */
    public boolean f5683Y;

    /* JADX INFO: renamed from: Z */
    public boolean f5684Z;

    /* JADX INFO: renamed from: a */
    public int f5685a;

    /* JADX INFO: renamed from: a0 */
    public boolean f5686a0;

    /* JADX INFO: renamed from: b */
    public Bundle f5687b;

    /* JADX INFO: renamed from: b0 */
    public boolean f5688b0;

    /* JADX INFO: renamed from: c */
    public SparseArray f5689c;

    /* JADX INFO: renamed from: c0 */
    public ViewGroup f5690c0;

    /* JADX INFO: renamed from: d */
    public Bundle f5691d;

    /* JADX INFO: renamed from: d0 */
    public View f5692d0;

    /* JADX INFO: renamed from: e */
    public String f5693e;

    /* JADX INFO: renamed from: e0 */
    public boolean f5694e0;

    /* JADX INFO: renamed from: f */
    public Bundle f5695f;

    /* JADX INFO: renamed from: f0 */
    public boolean f5696f0;

    /* JADX INFO: renamed from: g */
    public AbstractComponentCallbacksC0635c f5697g;

    /* JADX INFO: renamed from: g0 */
    public ed3 f5698g0;

    /* JADX INFO: renamed from: h */
    public String f5699h;

    /* JADX INFO: renamed from: h0 */
    public boolean f5700h0;

    /* JADX INFO: renamed from: i */
    public int f5701i;

    /* JADX INFO: renamed from: i0 */
    public LayoutInflater f5702i0;

    /* JADX INFO: renamed from: j */
    public Boolean f5703j;

    /* JADX INFO: renamed from: j0 */
    public boolean f5704j0;

    /* JADX INFO: renamed from: k */
    public boolean f5705k;

    /* JADX INFO: renamed from: k0 */
    public String f5706k0;

    /* JADX INFO: renamed from: l */
    public boolean f5707l;

    /* JADX INFO: renamed from: l0 */
    public Lifecycle$State f5708l0;

    /* JADX INFO: renamed from: m0 */
    public wb5 f5709m0;

    /* JADX INFO: renamed from: n0 */
    public lg3 f5710n0;

    /* JADX INFO: renamed from: o0 */
    public final w56 f5711o0;

    /* JADX INFO: renamed from: p0 */
    public wl8 f5712p0;

    /* JADX INFO: renamed from: q0 */
    public fs6 f5713q0;

    /* JADX INFO: renamed from: r0 */
    public final int f5714r0;

    /* JADX INFO: renamed from: s0 */
    public final AtomicInteger f5715s0;

    /* JADX INFO: renamed from: t0 */
    public final ArrayList f5716t0;

    /* JADX INFO: renamed from: u0 */
    public final bd3 f5717u0;

    public AbstractComponentCallbacksC0635c() {
        this.f5685a = -1;
        this.f5693e = UUID.randomUUID().toString();
        this.f5699h = null;
        this.f5703j = null;
        this.f5676R = new le3();
        this.f5686a0 = true;
        this.f5696f0 = true;
        new RunnableC3795yg(this, 3);
        this.f5708l0 = Lifecycle$State.RESUMED;
        this.f5711o0 = new w56();
        this.f5715s0 = new AtomicInteger();
        this.f5716t0 = new ArrayList();
        this.f5717u0 = new bd3(this);
        m2113o();
    }

    /* JADX INFO: renamed from: A */
    public View mo2074A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f5714r0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: B */
    public void mo2075B() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: C */
    public void mo2076C() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: D */
    public void mo2077D() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: E */
    public LayoutInflater mo2078E(Bundle bundle) {
        hd3 hd3Var = this.f5675Q;
        if (hd3Var == null) {
            C3386nv.m17633t("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        id3 id3Var = hd3Var.f42213O;
        LayoutInflater layoutInflaterCloneInContext = id3Var.getLayoutInflater().cloneInContext(id3Var);
        layoutInflaterCloneInContext.setFactory2(this.f5676R.f5745f);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: F */
    public void mo2079F(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f5688b0 = true;
        hd3 hd3Var = this.f5675Q;
        if ((hd3Var == null ? null : hd3Var.f42209K) != null) {
            this.f5688b0 = true;
        }
    }

    /* JADX INFO: renamed from: G */
    public void mo2080G() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: H */
    public void mo2081H() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: I */
    public void mo2082I(Bundle bundle) {
    }

    /* JADX INFO: renamed from: J */
    public void mo2083J() {
        this.f5688b0 = true;
    }

    @Override // p000.ub5
    /* JADX INFO: renamed from: K */
    public final AbstractC3572sf mo256K() {
        return this.f5709m0;
    }

    /* JADX INFO: renamed from: L */
    public void mo2084L() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: M */
    public void mo2085M(View view) {
    }

    /* JADX INFO: renamed from: N */
    public void mo2086N(Bundle bundle) {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: O */
    public void mo2087O(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f5676R.m2146S();
        this.f5672N = true;
        this.f5710n0 = new lg3(this, mo2116r(), new RunnableC0002a0(this, 11));
        View viewMo2074A = mo2074A(layoutInflater, viewGroup, bundle);
        this.f5692d0 = viewMo2074A;
        lg3 lg3Var = this.f5710n0;
        if (viewMo2074A == null) {
            if (lg3Var.f49626e == null) {
                this.f5710n0 = null;
                return;
            } else {
                C3386nv.m17633t("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        lg3Var.m16179b();
        if (AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.f5692d0 + " for Fragment " + this);
        }
        View view = this.f5692d0;
        lg3 lg3Var2 = this.f5710n0;
        view.getClass();
        view.setTag(R$id.view_tree_lifecycle_owner, lg3Var2);
        View view2 = this.f5692d0;
        lg3 lg3Var3 = this.f5710n0;
        view2.getClass();
        view2.setTag(androidx.lifecycle.viewmodel.R$id.view_tree_view_model_store_owner, lg3Var3);
        View view3 = this.f5692d0;
        lg3 lg3Var4 = this.f5710n0;
        view3.getClass();
        view3.setTag(androidx.savedstate.R$id.view_tree_saved_state_registry_owner, lg3Var4);
        this.f5711o0.m23765i(this.f5710n0);
    }

    /* JADX INFO: renamed from: P */
    public final AbstractC3102i7 m2088P(InterfaceC2991f7 interfaceC2991f7, pk9 pk9Var) {
        qn3 qn3Var = new qn3(this);
        if (this.f5685a > 1) {
            C3386nv.m17633t(wq1.m24117m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        dd3 dd3Var = new dd3(this, qn3Var, atomicReference, pk9Var, interfaceC2991f7);
        if (this.f5685a >= 0) {
            dd3Var.mo3635a();
        } else {
            this.f5716t0.add(dd3Var);
        }
        return new ad3(atomicReference);
    }

    /* JADX INFO: renamed from: Q */
    public final id3 m2089Q() {
        id3 id3VarM2105g = m2105g();
        if (id3VarM2105g != null) {
            return id3VarM2105g;
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", this, " not attached to an activity."));
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final Context m2090R() {
        Context contextMo2107i = mo2107i();
        if (contextMo2107i != null) {
            return contextMo2107i;
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", this, " not attached to a context."));
        return null;
    }

    /* JADX INFO: renamed from: S */
    public final AbstractComponentCallbacksC0635c m2091S() {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5677S;
        if (abstractComponentCallbacksC0635c != null) {
            return abstractComponentCallbacksC0635c;
        }
        if (mo2107i() == null) {
            C3386nv.m17633t(wq1.m24117m("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        Context contextMo2107i = mo2107i();
        sb.append(" is not a child Fragment, it is directly attached to ");
        sb.append(contextMo2107i);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: T */
    public final View m2092T() {
        View view = this.f5692d0;
        if (view != null) {
            return view;
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    /* JADX INFO: renamed from: U */
    public final void m2093U() {
        Bundle bundle;
        Bundle bundle2 = this.f5687b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f5676R.m2157b0(bundle);
        le3 le3Var = this.f5676R;
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(1);
    }

    /* JADX INFO: renamed from: V */
    public final void m2094V(int i, int i2, int i3, int i4) {
        if (this.f5698g0 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m2104f().f37042b = i;
        m2104f().f37043c = i2;
        m2104f().f37044d = i3;
        m2104f().f37045e = i4;
    }

    /* JADX INFO: renamed from: W */
    public final void m2095W(Bundle bundle) {
        AbstractC0638f abstractC0638f = this.f5674P;
        if (abstractC0638f != null) {
            if (abstractC0638f == null ? false : abstractC0638f.m2144Q()) {
                C3386nv.m17633t("Fragment already added and state has been saved");
                return;
            }
        }
        this.f5695f = bundle;
    }

    /* JADX INFO: renamed from: X */
    public final void m2096X(daa daaVar) {
        m2104f().f37047g = daaVar;
    }

    /* JADX INFO: renamed from: Y */
    public final void m2097Y() {
        rf3 rf3Var = sf3.f60790a;
        sf3.m21333b(new SetRetainInstanceUsageViolation(this));
        sf3.m21332a(this).getClass();
        FragmentStrictMode$Flag fragmentStrictMode$Flag = FragmentStrictMode$Flag.PENALTY_LOG;
        this.f5683Y = true;
        AbstractC0638f abstractC0638f = this.f5674P;
        if (abstractC0638f != null) {
            abstractC0638f.f5738P.m17398V2(this);
        } else {
            this.f5684Z = true;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m2098Z(daa daaVar) {
        m2104f().f37048h = daaVar;
    }

    /* JADX INFO: renamed from: a */
    public bq1 mo2099a() {
        return new cd3(this);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2100a0(Intent intent) {
        hd3 hd3Var = this.f5675Q;
        if (hd3Var == null) {
            C3386nv.m17633t(wq1.m24117m("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            hd3Var.f42210L.startActivity(intent, null);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2101b0(Intent intent, int i) {
        if (this.f5675Q == null) {
            C3386nv.m17633t(wq1.m24117m("Fragment ", this, " not attached to Activity"));
            return;
        }
        AbstractC0638f abstractC0638fM2109k = m2109k();
        if (abstractC0638fM2109k.f5726D != null) {
            abstractC0638fM2109k.f5729G.addLast(new FragmentManager$LaunchedFragmentInfo(this.f5693e, i));
            abstractC0638fM2109k.f5726D.mo276a(intent);
            return;
        }
        hd3 hd3Var = abstractC0638fM2109k.f5763x;
        hd3Var.getClass();
        intent.getClass();
        if (i == -1) {
            hd3Var.f42210L.startActivity(intent, null);
        } else {
            C3386nv.m17633t("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: d */
    public zta mo2102d() {
        Application application = null;
        if (this.f5674P == null) {
            C3386nv.m17633t("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.f5712p0 == null) {
            for (Context applicationContext = m2090R().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            if (application == null && AbstractC0638f.m2128L(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + m2090R().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f5712p0 = new wl8(application, this, this.f5695f);
        }
        return this.f5712p0;
    }

    @Override // p000.gr3
    /* JADX INFO: renamed from: e */
    public final p56 mo2103e() {
        Application application;
        Context applicationContext = m2090R().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && AbstractC0638f.m2128L(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m2090R().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        p56 p56Var = new p56(0);
        LinkedHashMap linkedHashMap = p56Var.f58099a;
        if (application != null) {
            linkedHashMap.put(yta.f70452d, application);
        }
        linkedHashMap.put(ci8.f10122f, this);
        linkedHashMap.put(ci8.f10123g, this);
        Bundle bundle = this.f5695f;
        if (bundle != null) {
            linkedHashMap.put(ci8.f10124h, bundle);
        }
        return p56Var;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    /* JADX INFO: renamed from: f */
    public final ed3 m2104f() {
        if (this.f5698g0 == null) {
            ed3 ed3Var = new ed3();
            ed3Var.f37047g = null;
            Object obj = f5665v0;
            ed3Var.f37048h = obj;
            ed3Var.f37049i = null;
            ed3Var.f37050j = obj;
            ed3Var.f37051k = obj;
            ed3Var.f37052l = 1.0f;
            ed3Var.f37053m = null;
            this.f5698g0 = ed3Var;
        }
        return this.f5698g0;
    }

    /* JADX INFO: renamed from: g */
    public final id3 m2105g() {
        hd3 hd3Var = this.f5675Q;
        if (hd3Var == null) {
            return null;
        }
        return hd3Var.f42209K;
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC0638f m2106h() {
        if (this.f5675Q != null) {
            return this.f5676R;
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", this, " has not been attached yet."));
        return null;
    }

    /* JADX INFO: renamed from: i */
    public Context mo2107i() {
        hd3 hd3Var = this.f5675Q;
        if (hd3Var == null) {
            return null;
        }
        return hd3Var.f42210L;
    }

    /* JADX INFO: renamed from: j */
    public final int m2108j() {
        Lifecycle$State lifecycle$State = this.f5708l0;
        return (lifecycle$State == Lifecycle$State.INITIALIZED || this.f5677S == null) ? lifecycle$State.ordinal() : Math.min(lifecycle$State.ordinal(), this.f5677S.m2108j());
    }

    /* JADX INFO: renamed from: k */
    public final AbstractC0638f m2109k() {
        AbstractC0638f abstractC0638f = this.f5674P;
        if (abstractC0638f != null) {
            return abstractC0638f;
        }
        C3386nv.m17633t(wq1.m24117m("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final Resources m2110l() {
        return m2090R().getResources();
    }

    /* JADX INFO: renamed from: m */
    public final String m2111m(int i) {
        return m2110l().getString(i);
    }

    /* JADX INFO: renamed from: n */
    public final lg3 m2112n() {
        lg3 lg3Var = this.f5710n0;
        if (lg3Var != null) {
            return lg3Var;
        }
        C3386nv.m17633t(wq1.m24117m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final void m2113o() {
        this.f5709m0 = new wb5(this, true);
        this.f5713q0 = new fs6(new lb4(this, new y47(this, 8)));
        this.f5712p0 = null;
        ArrayList arrayList = this.f5716t0;
        bd3 bd3Var = this.f5717u0;
        if (arrayList.contains(bd3Var)) {
            return;
        }
        if (this.f5685a >= 0) {
            bd3Var.mo3635a();
        } else {
            arrayList.add(bd3Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.f5688b0 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        m2089Q().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m2114p() {
        m2113o();
        this.f5706k0 = this.f5693e;
        this.f5693e = UUID.randomUUID().toString();
        this.f5705k = false;
        this.f5707l = false;
        this.f5668J = false;
        this.f5669K = false;
        this.f5671M = false;
        this.f5673O = 0;
        this.f5674P = null;
        this.f5676R = new le3();
        this.f5675Q = null;
        this.f5678T = 0;
        this.f5679U = 0;
        this.f5680V = null;
        this.f5681W = false;
        this.f5682X = false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m2115q() {
        return this.f5675Q != null && this.f5705k;
    }

    @Override // p000.dua
    /* JADX INFO: renamed from: r */
    public final cua mo2116r() {
        if (this.f5674P == null) {
            C3386nv.m17633t("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m2108j() == Lifecycle$State.INITIALIZED.ordinal()) {
            C3386nv.m17633t("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f5674P.f5738P.f52638d;
        cua cuaVar = (cua) map.get(this.f5693e);
        if (cuaVar != null) {
            return cuaVar;
        }
        cua cuaVar2 = new cua();
        map.put(this.f5693e, cuaVar2);
        return cuaVar2;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2117s() {
        if (this.f5681W) {
            return true;
        }
        AbstractC0638f abstractC0638f = this.f5674P;
        if (abstractC0638f != null) {
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f5677S;
            abstractC0638f.getClass();
            if (abstractComponentCallbacksC0635c == null ? false : abstractComponentCallbacksC0635c.m2117s()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.vl8
    /* JADX INFO: renamed from: t */
    public final fs6 mo2118t() {
        return (fs6) this.f5713q0.f39591c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f5693e);
        if (this.f5678T != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f5678T));
        }
        if (this.f5680V != null) {
            sb.append(" tag=");
            sb.append(this.f5680V);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2119u() {
        return this.f5673O > 0;
    }

    /* JADX INFO: renamed from: v */
    public void mo2120v() {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: w */
    public void mo2121w(int i, int i2, Intent intent) {
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    /* JADX INFO: renamed from: x */
    public void mo2122x(Activity activity) {
        this.f5688b0 = true;
    }

    /* JADX INFO: renamed from: y */
    public void mo2123y(Context context) {
        this.f5688b0 = true;
        hd3 hd3Var = this.f5675Q;
        id3 id3Var = hd3Var == null ? null : hd3Var.f42209K;
        if (id3Var != null) {
            this.f5688b0 = false;
            mo2122x(id3Var);
        }
    }

    /* JADX INFO: renamed from: z */
    public void mo2124z(Bundle bundle) {
        this.f5688b0 = true;
        m2093U();
        le3 le3Var = this.f5676R;
        if (le3Var.f5762w >= 1) {
            return;
        }
        le3Var.f5731I = false;
        le3Var.f5732J = false;
        le3Var.f5738P.f52641g = false;
        le3Var.m2186u(1);
    }

    public AbstractComponentCallbacksC0635c(int i) {
        this();
        this.f5714r0 = i;
    }
}
