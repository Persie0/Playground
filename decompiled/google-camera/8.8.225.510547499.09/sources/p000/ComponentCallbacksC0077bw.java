package p000;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: bw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacksC0077bw implements ComponentCallbacks, View.OnCreateContextMenuListener, akv, alw, akn, aqn {

    /* JADX INFO: renamed from: e */
    static final Object f4572e = new Object();

    /* JADX INFO: renamed from: A */
    public C0111cq f4573A;

    /* JADX INFO: renamed from: B */
    public ComponentCallbacksC0077bw f4574B;

    /* JADX INFO: renamed from: C */
    public int f4575C;

    /* JADX INFO: renamed from: D */
    public int f4576D;

    /* JADX INFO: renamed from: E */
    public String f4577E;

    /* JADX INFO: renamed from: F */
    public boolean f4578F;

    /* JADX INFO: renamed from: G */
    public boolean f4579G;

    /* JADX INFO: renamed from: H */
    public boolean f4580H;

    /* JADX INFO: renamed from: I */
    boolean f4581I;

    /* JADX INFO: renamed from: J */
    boolean f4582J;

    /* JADX INFO: renamed from: K */
    boolean f4583K;

    /* JADX INFO: renamed from: L */
    public boolean f4584L;

    /* JADX INFO: renamed from: M */
    public ViewGroup f4585M;

    /* JADX INFO: renamed from: N */
    public View f4586N;

    /* JADX INFO: renamed from: O */
    public boolean f4587O;

    /* JADX INFO: renamed from: P */
    public boolean f4588P;

    /* JADX INFO: renamed from: Q */
    public C0073bs f4589Q;

    /* JADX INFO: renamed from: R */
    Runnable f4590R;

    /* JADX INFO: renamed from: S */
    public boolean f4591S;

    /* JADX INFO: renamed from: T */
    public LayoutInflater f4592T;

    /* JADX INFO: renamed from: U */
    public boolean f4593U;

    /* JADX INFO: renamed from: V */
    public akr f4594V;

    /* JADX INFO: renamed from: W */
    public C0128dg f4595W;

    /* JADX INFO: renamed from: X */
    public ald f4596X;

    /* JADX INFO: renamed from: Y */
    alt f4597Y;

    /* JADX INFO: renamed from: Z */
    public final AtomicInteger f4598Z;

    /* JADX INFO: renamed from: a */
    private int f4599a;

    /* JADX INFO: renamed from: aa */
    public final ArrayList f4600aa;

    /* JADX INFO: renamed from: ab */
    public aks f4601ab;

    /* JADX INFO: renamed from: ac */
    bzm f4602ac;

    /* JADX INFO: renamed from: b */
    private final AbstractC0075bu f4603b;

    /* JADX INFO: renamed from: f */
    public int f4604f;

    /* JADX INFO: renamed from: g */
    public Bundle f4605g;

    /* JADX INFO: renamed from: h */
    public SparseArray f4606h;

    /* JADX INFO: renamed from: i */
    public Bundle f4607i;

    /* JADX INFO: renamed from: j */
    public Boolean f4608j;

    /* JADX INFO: renamed from: k */
    public String f4609k;

    /* JADX INFO: renamed from: l */
    public Bundle f4610l;

    /* JADX INFO: renamed from: m */
    public ComponentCallbacksC0077bw f4611m;
    public String mPreviousWho;

    /* JADX INFO: renamed from: n */
    public String f4612n;

    /* JADX INFO: renamed from: o */
    public int f4613o;

    /* JADX INFO: renamed from: p */
    public Boolean f4614p;

    /* JADX INFO: renamed from: q */
    public boolean f4615q;

    /* JADX INFO: renamed from: r */
    public boolean f4616r;

    /* JADX INFO: renamed from: s */
    public boolean f4617s;

    /* JADX INFO: renamed from: t */
    public boolean f4618t;

    /* JADX INFO: renamed from: u */
    public boolean f4619u;

    /* JADX INFO: renamed from: v */
    public boolean f4620v;

    /* JADX INFO: renamed from: w */
    public boolean f4621w;

    /* JADX INFO: renamed from: x */
    public int f4622x;

    /* JADX INFO: renamed from: y */
    public C0111cq f4623y;

    /* JADX INFO: renamed from: z */
    public C0086ce f4624z;

    public ComponentCallbacksC0077bw() {
        this.f4604f = -1;
        this.f4609k = UUID.randomUUID().toString();
        this.f4612n = null;
        this.f4614p = null;
        this.f4573A = new C0111cq();
        this.f4583K = true;
        this.f4588P = true;
        this.f4590R = new RunnableC0059be(this, 3, (byte[]) null);
        this.f4594V = akr.RESUMED;
        this.f4596X = new ald();
        this.f4598Z = new AtomicInteger();
        this.f4600aa = new ArrayList();
        this.f4603b = new C0069bo(this);
        m3105A();
    }

    /* JADX INFO: renamed from: A */
    private final void m3105A() {
        this.f4601ab = new aks(this);
        this.f4602ac = aff.m468d(this);
        this.f4597Y = null;
        if (this.f4600aa.contains(this.f4603b)) {
            return;
        }
        m3106B(this.f4603b);
    }

    /* JADX INFO: renamed from: B */
    private final void m3106B(AbstractC0075bu abstractC0075bu) {
        if (this.f4604f >= 0) {
            abstractC0075bu.mo2783a();
        } else {
            this.f4600aa.add(abstractC0075bu);
        }
    }

    /* JADX INFO: renamed from: c */
    private final int m3107c() {
        return (this.f4594V == akr.f593b || this.f4574B == null) ? this.f4594V.ordinal() : Math.min(this.f4594V.ordinal(), this.f4574B.m3107c());
    }

    /* JADX INFO: renamed from: d */
    private final ComponentCallbacksC0077bw m3108d(boolean z) {
        String str;
        if (z) {
            ajv ajvVar = new ajv(this);
            ajr.m842d(ajvVar);
            ajq ajqVarM840b = ajr.m840b(this);
            if (ajqVarM840b.f563b.contains(ajp.DETECT_TARGET_FRAGMENT_USAGE) && ajr.m843e(ajqVarM840b, getClass(), ajvVar.getClass())) {
                ajr.m841c(ajqVarM840b, ajvVar);
            }
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f4611m;
        if (componentCallbacksC0077bw != null) {
            return componentCallbacksC0077bw;
        }
        C0111cq c0111cq = this.f4623y;
        if (c0111cq == null || (str = this.f4612n) == null) {
            return null;
        }
        return c0111cq.m5323c(str);
    }

    @Deprecated
    public static ComponentCallbacksC0077bw instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: renamed from: z */
    private final AbstractC0919px m3109z(AbstractC0927qe abstractC0927qe, InterfaceC0944qv interfaceC0944qv, InterfaceC0918pw interfaceC0918pw) {
        if (this.f4604f <= 1) {
            m3106B(new C0072br(this, interfaceC0944qv, new AtomicReference(), abstractC0927qe, interfaceC0918pw));
            return new C0068bn();
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    /* JADX INFO: renamed from: aT */
    public AbstractC0083cb mo2698aT() {
        return new C0070bp(this);
    }

    /* JADX INFO: renamed from: cj */
    public void mo2700cj(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f4573A.m5300H();
        this.f4621w = true;
        this.f4595W = new C0128dg(this, getViewModelStore$ar$class_merging$ar$class_merging(), new RunnableC0059be(this, 2), null, null);
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.f4586N = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.f4595W.f10831a != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f4595W = null;
        } else {
            this.f4595W.m6087b();
            aci.m194c(this.f4586N, this.f4595W);
            acj.m196b(this.f4586N, this.f4595W);
            afh.m469A(this.f4586N, this.f4595W);
            this.f4596X.mo904g(this.f4595W);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f4575C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f4576D));
        printWriter.print(" mTag=");
        printWriter.println(this.f4577E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f4604f);
        printWriter.print(" mWho=");
        printWriter.print(this.f4609k);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f4622x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f4615q);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f4616r);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f4618t);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f4619u);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f4578F);
        printWriter.print(" mDetached=");
        printWriter.print(this.f4579G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f4583K);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f4582J);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f4580H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f4588P);
        if (this.f4623y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f4623y);
        }
        if (this.f4624z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f4624z);
        }
        if (this.f4574B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f4574B);
        }
        if (this.f4610l != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f4610l);
        }
        if (this.f4605g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f4605g);
        }
        if (this.f4606h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f4606h);
        }
        if (this.f4607i != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f4607i);
        }
        ComponentCallbacksC0077bw componentCallbacksC0077bwM3108d = m3108d(false);
        if (componentCallbacksC0077bwM3108d != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(componentCallbacksC0077bwM3108d);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f4613o);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(m3127v());
        if (m3110e() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(m3110e());
        }
        if (m3111f() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(m3111f());
        }
        if (m3112g() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(m3112g());
        }
        if (m3113h() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(m3113h());
        }
        if (this.f4585M != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f4585M);
        }
        if (this.f4586N != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f4586N);
        }
        if (getContext() != null) {
            amd.m936a(this).m939d(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.f4573A + ":");
        this.f4573A.m5295C(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* JADX INFO: renamed from: e */
    public final int m3110e() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return 0;
        }
        return c0073bs.f4256b;
    }

    /* JADX INFO: renamed from: f */
    public final int m3111f() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return 0;
        }
        return c0073bs.f4257c;
    }

    /* JADX INFO: renamed from: g */
    public final int m3112g() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return 0;
        }
        return c0073bs.f4258d;
    }

    public final ActivityC0080bz getActivity() {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            return null;
        }
        return (ActivityC0080bz) c0086ce.f5398b;
    }

    public final boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null || (bool = c0073bs.f4270p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null || (bool = c0073bs.f4269o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final Bundle getArguments() {
        return this.f4610l;
    }

    public final C0111cq getChildFragmentManager() {
        if (this.f4624z != null) {
            return this.f4573A;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context getContext() {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            return null;
        }
        return c0086ce.f5399c;
    }

    @Override // p000.akn
    public final alz getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
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
        if (application == null && C0111cq.m5275S(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find Application instance from Context ");
            sb.append(requireContext().getApplicationContext());
            sb.append(", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        amb ambVar = new amb();
        if (application != null) {
            ambVar.m932b(als.f665b, application);
        }
        ambVar.m932b(all.f643a, this);
        ambVar.m932b(all.f644b, this);
        Bundle bundle = this.f4610l;
        if (bundle != null) {
            ambVar.m932b(all.f645c, bundle);
        }
        return ambVar;
    }

    public final alt getDefaultViewModelProviderFactory() {
        Application application;
        if (this.f4623y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.f4597Y == null) {
            Context applicationContext = requireContext().getApplicationContext();
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
            if (application == null && C0111cq.m5275S(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find Application instance from Context ");
                sb.append(requireContext().getApplicationContext());
                sb.append(", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.f4597Y = new alo(application, this, this.f4610l);
        }
        return this.f4597Y;
    }

    public final Object getEnterTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        return c0073bs.f4263i;
    }

    public final Object getExitTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        return c0073bs.f4265k;
    }

    @Deprecated
    public final C0111cq getFragmentManager() {
        return this.f4623y;
    }

    public final Object getHost() {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            return null;
        }
        return ((C0079by) c0086ce).f4732a;
    }

    public final int getId() {
        return this.f4575C;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.f4592T;
        return layoutInflater == null ? m3115j(null) : layoutInflater;
    }

    @Override // p000.akv
    public final aks getLifecycle() {
        return this.f4601ab;
    }

    @Deprecated
    public final amd getLoaderManager() {
        return amd.m936a(this);
    }

    public final ComponentCallbacksC0077bw getParentFragment() {
        return this.f4574B;
    }

    public final C0111cq getParentFragmentManager() {
        C0111cq c0111cq = this.f4623y;
        if (c0111cq != null) {
            return c0111cq;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final Object getReenterTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        Object obj = c0073bs.f4266l;
        return obj == f4572e ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        ajt ajtVar = new ajt(this);
        ajr.m842d(ajtVar);
        ajq ajqVarM840b = ajr.m840b(this);
        if (ajqVarM840b.f563b.contains(ajp.DETECT_RETAIN_INSTANCE_USAGE) && ajr.m843e(ajqVarM840b, getClass(), ajtVar.getClass())) {
            ajr.m841c(ajqVarM840b, ajtVar);
        }
        return this.f4580H;
    }

    public final Object getReturnTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        Object obj = c0073bs.f4264j;
        return obj == f4572e ? getEnterTransition() : obj;
    }

    @Override // p000.aqn
    public final aqm getSavedStateRegistry() {
        return (aqm) this.f4602ac.f4820b;
    }

    public final Object getSharedElementEnterTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        return c0073bs.f4267m;
    }

    public final Object getSharedElementReturnTransition() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        Object obj = c0073bs.f4268n;
        return obj == f4572e ? getSharedElementEnterTransition() : obj;
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.f4577E;
    }

    @Deprecated
    public final ComponentCallbacksC0077bw getTargetFragment() {
        return m3108d(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        aju ajuVar = new aju(this);
        ajr.m842d(ajuVar);
        ajq ajqVarM840b = ajr.m840b(this);
        if (ajqVarM840b.f563b.contains(ajp.DETECT_TARGET_FRAGMENT_USAGE) && ajr.m843e(ajqVarM840b, getClass(), ajuVar.getClass())) {
            ajr.m841c(ajqVarM840b, ajuVar);
        }
        return this.f4613o;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public final boolean getUserVisibleHint() {
        return this.f4588P;
    }

    public final View getView() {
        return this.f4586N;
    }

    public final akv getViewLifecycleOwner() {
        C0128dg c0128dg = this.f4595W;
        if (c0128dg != null) {
            return c0128dg;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final alc getViewLifecycleOwnerLiveData() {
        return this.f4596X;
    }

    @Override // p000.alw
    public final bkn getViewModelStore$ar$class_merging$ar$class_merging() {
        if (this.f4623y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (m3107c() == akr.f593b.ordinal()) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        C0113cs c0113cs = this.f4623y.f8801u;
        bkn bknVar = (bkn) c0113cs.f9208d.get(this.f4609k);
        if (bknVar != null) {
            return bknVar;
        }
        bkn bknVar2 = new bkn((char[]) null, (byte[]) null);
        c0113cs.f9208d.put(this.f4609k, bknVar2);
        return bknVar2;
    }

    /* JADX INFO: renamed from: h */
    public final int m3113h() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return 0;
        }
        return c0073bs.f4259e;
    }

    public final boolean hasOptionsMenu() {
        return this.f4582J;
    }

    /* JADX INFO: renamed from: i */
    public final C0073bs m3114i() {
        if (this.f4589Q == null) {
            this.f4589Q = new C0073bs();
        }
        return this.f4589Q;
    }

    public final boolean isAdded() {
        return this.f4624z != null && this.f4615q;
    }

    public final boolean isDetached() {
        return this.f4579G;
    }

    public final boolean isHidden() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw;
        if (this.f4578F) {
            return true;
        }
        return (this.f4623y == null || (componentCallbacksC0077bw = this.f4574B) == null || !componentCallbacksC0077bw.isHidden()) ? false : true;
    }

    public final boolean isInLayout() {
        return this.f4619u;
    }

    public final boolean isMenuVisible() {
        if (this.f4583K) {
            return this.f4623y == null || C0111cq.m5277Y(this.f4574B);
        }
        return false;
    }

    public final boolean isRemoving() {
        return this.f4616r;
    }

    public final boolean isResumed() {
        return this.f4604f >= 7;
    }

    public final boolean isStateSaved() {
        C0111cq c0111cq = this.f4623y;
        if (c0111cq == null) {
            return false;
        }
        return c0111cq.m5313V();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.f4586N) == null || view.getWindowToken() == null || this.f4586N.getVisibility() != 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final LayoutInflater m3115j(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.f4592T = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    /* JADX INFO: renamed from: k */
    final ArrayList m3116k() {
        ArrayList arrayList;
        C0073bs c0073bs = this.f4589Q;
        return (c0073bs == null || (arrayList = c0073bs.f4261g) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: l */
    final ArrayList m3117l() {
        ArrayList arrayList;
        C0073bs c0073bs = this.f4589Q;
        return (c0073bs == null || (arrayList = c0073bs.f4262h) == null) ? new ArrayList() : arrayList;
    }

    /* JADX INFO: renamed from: m */
    final void m3118m(boolean z) {
        ViewGroup viewGroup;
        C0111cq c0111cq;
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs != null) {
            c0073bs.f4273s = false;
        }
        if (this.f4586N == null || (viewGroup = this.f4585M) == null || (c0111cq = this.f4623y) == null) {
            return;
        }
        C0134dm c0134dmM6385b = C0134dm.m6385b(viewGroup, c0111cq);
        c0134dmM6385b.m6393e();
        if (z) {
            this.f4624z.f5400d.post(new RunnableC0059be(c0134dmM6385b, 5));
        } else {
            c0134dmM6385b.m6391c();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m3119n() {
        m3105A();
        this.mPreviousWho = this.f4609k;
        this.f4609k = UUID.randomUUID().toString();
        this.f4615q = false;
        this.f4616r = false;
        this.f4618t = false;
        this.f4619u = false;
        this.f4620v = false;
        this.f4622x = 0;
        this.f4623y = null;
        this.f4573A = new C0111cq();
        this.f4624z = null;
        this.f4575C = 0;
        this.f4576D = 0;
        this.f4577E = null;
        this.f4578F = false;
        this.f4579G = false;
    }

    /* JADX INFO: renamed from: o */
    public final void m3120o() {
        Bundle bundle = this.f4605g;
        onViewCreated(this.f4586N, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f4573A.m5293A(2);
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.f4584L = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in onActivityResult(): requestCode: ");
            sb.append(i);
            sb.append(" resultCode: ");
            sb.append(i2);
            sb.append(" data: ");
            sb.append(intent);
        }
    }

    @Deprecated
    public final void onAttach(Activity activity) {
        this.f4584L = true;
    }

    public void onAttach(Context context) {
        this.f4584L = true;
        C0086ce c0086ce = this.f4624z;
        if ((c0086ce == null ? null : c0086ce.f5398b) != null) {
            this.f4584L = true;
        }
    }

    @Deprecated
    public final void onAttachFragment(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f4584L = true;
    }

    public final boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.f4584L = true;
        m3121p();
        C0111cq c0111cq = this.f4573A;
        if (c0111cq.f8788h > 0) {
            return;
        }
        c0111cq.m5334p();
    }

    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public final Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Deprecated
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f4599a;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.f4584L = true;
    }

    @Deprecated
    public final void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.f4584L = true;
    }

    public void onDetach() {
        this.f4584L = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public final void onHiddenChanged(boolean z) {
    }

    @Deprecated
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f4584L = true;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f4584L = true;
        C0086ce c0086ce = this.f4624z;
        if ((c0086ce == null ? null : c0086ce.f5398b) != null) {
            this.f4584L = true;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f4584L = true;
    }

    public final void onMultiWindowModeChanged(boolean z) {
    }

    @Deprecated
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    @Deprecated
    public final void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.f4584L = true;
    }

    public final void onPictureInPictureModeChanged(boolean z) {
    }

    @Deprecated
    public final void onPrepareOptionsMenu(Menu menu) {
    }

    public final void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.f4584L = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.f4584L = true;
    }

    public void onStop() {
        this.f4584L = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.f4584L = true;
    }

    /* JADX INFO: renamed from: p */
    public final void m3121p() {
        Bundle bundle;
        Bundle bundle2 = this.f4605g;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.f4573A.m5302J(bundle);
        this.f4573A.m5334p();
    }

    public final void postponeEnterTransition() {
        m3114i().f4273s = true;
    }

    /* JADX INFO: renamed from: q */
    public final void m3122q(int i, int i2, int i3, int i4) {
        if (this.f4589Q == null && i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        m3114i().f4256b = i;
        m3114i().f4257c = i2;
        m3114i().f4258d = i3;
        m3114i().f4259e = i4;
    }

    /* JADX INFO: renamed from: r */
    public final void m3123r(View view) {
        m3114i().f4272r = view;
    }

    public final AbstractC0919px registerForActivityResult(AbstractC0927qe abstractC0927qe, InterfaceC0918pw interfaceC0918pw) {
        return m3109z(abstractC0927qe, new C0071bq(this, 1), interfaceC0918pw);
    }

    public final void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.f4624z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        C0111cq parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8795o != null) {
            parentFragmentManager.f8796p.addLast(new C0095cn(this.f4609k, i));
            parentFragmentManager.f8795o.mo2762b(strArr);
        }
    }

    public final ActivityC0080bz requireActivity() {
        ActivityC0080bz activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle bundle = this.f4610l;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final C0111cq requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final ComponentCallbacksC0077bw requireParentFragment() {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = this.f4574B;
        if (componentCallbacksC0077bw != null) {
            return componentCallbacksC0077bw;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final View requireView() {
        View view = this.f4586N;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    /* JADX INFO: renamed from: s */
    final void m3124s(int i) {
        if (this.f4589Q == null && i == 0) {
            return;
        }
        m3114i();
        this.f4589Q.f4260f = i;
    }

    public final void setAllowEnterTransitionOverlap(boolean z) {
        m3114i().f4270p = Boolean.valueOf(z);
    }

    public final void setAllowReturnTransitionOverlap(boolean z) {
        m3114i().f4269o = Boolean.valueOf(z);
    }

    public final void setArguments(Bundle bundle) {
        C0111cq c0111cq = this.f4623y;
        if (c0111cq != null && c0111cq.m5313V()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f4610l = bundle;
    }

    public final void setEnterSharedElementCallback$ar$class_merging(aaa aaaVar) {
        m3114i().f4274t = aaaVar;
    }

    public final void setEnterTransition(Object obj) {
        m3114i().f4263i = obj;
    }

    public final void setExitSharedElementCallback$ar$class_merging(aaa aaaVar) {
        m3114i().f4275u = aaaVar;
    }

    public final void setExitTransition(Object obj) {
        m3114i().f4265k = obj;
    }

    @Deprecated
    public final void setHasOptionsMenu(boolean z) {
        if (this.f4582J != z) {
            this.f4582J = z;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.f4624z.mo3178e();
        }
    }

    public final void setInitialSavedState(C0076bv c0076bv) {
        Bundle bundle;
        if (this.f4623y != null) {
            throw new IllegalStateException("Fragment already added");
        }
        Bundle bundle2 = null;
        if (c0076bv != null && (bundle = c0076bv.f4515a) != null) {
            bundle2 = bundle;
        }
        this.f4605g = bundle2;
    }

    public final void setMenuVisibility(boolean z) {
        if (this.f4583K != z) {
            this.f4583K = z;
            if (this.f4582J && isAdded() && !isHidden()) {
                this.f4624z.mo3178e();
            }
        }
    }

    public final void setReenterTransition(Object obj) {
        m3114i().f4266l = obj;
    }

    @Deprecated
    public final void setRetainInstance(boolean z) {
        ajx ajxVar = new ajx(this);
        ajr.m842d(ajxVar);
        ajq ajqVarM840b = ajr.m840b(this);
        if (ajqVarM840b.f563b.contains(ajp.DETECT_RETAIN_INSTANCE_USAGE) && ajr.m843e(ajqVarM840b, getClass(), ajxVar.getClass())) {
            ajr.m841c(ajqVarM840b, ajxVar);
        }
        this.f4580H = z;
        C0111cq c0111cq = this.f4623y;
        if (c0111cq == null) {
            this.f4581I = true;
        } else if (z) {
            c0111cq.f8801u.m5446a(this);
        } else {
            c0111cq.f8801u.m5449e(this);
        }
    }

    public final void setReturnTransition(Object obj) {
        m3114i().f4264j = obj;
    }

    public final void setSharedElementEnterTransition(Object obj) {
        m3114i().f4267m = obj;
    }

    public final void setSharedElementReturnTransition(Object obj) {
        m3114i().f4268n = obj;
    }

    @Deprecated
    public final void setTargetFragment(ComponentCallbacksC0077bw componentCallbacksC0077bw, int i) {
        if (componentCallbacksC0077bw != null) {
            ajy ajyVar = new ajy(this, componentCallbacksC0077bw, i);
            ajr.m842d(ajyVar);
            ajq ajqVarM840b = ajr.m840b(this);
            if (ajqVarM840b.f563b.contains(ajp.DETECT_TARGET_FRAGMENT_USAGE) && ajr.m843e(ajqVarM840b, getClass(), ajyVar.getClass())) {
                ajr.m841c(ajqVarM840b, ajyVar);
            }
        }
        C0111cq c0111cq = this.f4623y;
        C0111cq c0111cq2 = componentCallbacksC0077bw != null ? componentCallbacksC0077bw.f4623y : null;
        if (c0111cq != null && c0111cq2 != null && c0111cq != c0111cq2) {
            throw new IllegalArgumentException("Fragment " + componentCallbacksC0077bw + " must share the same FragmentManager to be set as a target fragment");
        }
        for (ComponentCallbacksC0077bw componentCallbacksC0077bwM3108d = componentCallbacksC0077bw; componentCallbacksC0077bwM3108d != null; componentCallbacksC0077bwM3108d = componentCallbacksC0077bwM3108d.m3108d(false)) {
            if (componentCallbacksC0077bwM3108d.equals(this)) {
                throw new IllegalArgumentException("Setting " + componentCallbacksC0077bw + " as the target of " + this + " would create a target cycle");
            }
        }
        if (componentCallbacksC0077bw != null) {
            if (this.f4623y == null || componentCallbacksC0077bw.f4623y == null) {
                this.f4612n = null;
                this.f4611m = componentCallbacksC0077bw;
            } else {
                this.f4612n = componentCallbacksC0077bw.f4609k;
            }
            this.f4613o = i;
        }
        this.f4612n = null;
        this.f4611m = null;
        this.f4613o = i;
    }

    @Deprecated
    public final void setUserVisibleHint(boolean z) {
        C0111cq c0111cq;
        ajz ajzVar = new ajz(this, z);
        ajr.m842d(ajzVar);
        ajq ajqVarM840b = ajr.m840b(this);
        if (ajqVarM840b.f563b.contains(ajp.DETECT_SET_USER_VISIBLE_HINT) && ajr.m843e(ajqVarM840b, getClass(), ajzVar.getClass())) {
            ajr.m841c(ajqVarM840b, ajzVar);
        }
        if (!this.f4588P && z && this.f4604f < 5 && (c0111cq = this.f4623y) != null && isAdded() && this.f4593U) {
            c0111cq.m5320ae(c0111cq.m5319ad(this));
        }
        this.f4588P = z;
        boolean z2 = false;
        if (this.f4604f < 5 && !z) {
            z2 = true;
        }
        this.f4587O = z2;
        if (this.f4605g != null) {
            this.f4608j = Boolean.valueOf(z);
        }
    }

    public final boolean shouldShowRequestPermissionRationale(String str) {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            return false;
        }
        ActivityC0080bz activityC0080bz = ((C0079by) c0086ce).f4732a;
        int i = adg.f162a;
        return aar.m37a(activityC0080bz, str);
    }

    public final void startActivity(Intent intent) {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce != null) {
            c0086ce.m3536h(intent, -1, null);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i) {
        if (this.f4624z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        C0111cq parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8793m == null) {
            parentFragmentManager.f8789i.m3536h(intent, i, null);
            return;
        }
        parentFragmentManager.f8796p.addLast(new C0095cn(this.f4609k, i));
        parentFragmentManager.f8793m.mo2762b(intent);
    }

    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2 = intent;
        if (this.f4624z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (C0111cq.m5275S(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" received the following in startIntentSenderForResult() requestCode: ");
            sb.append(i);
            sb.append(" IntentSender: ");
            sb.append(intentSender);
            sb.append(" fillInIntent: ");
            sb.append(intent);
            sb.append(" options: ");
            sb.append(bundle);
        }
        C0111cq parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8794n == null) {
            C0086ce c0086ce = parentFragmentManager.f8789i;
            if (i != -1) {
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
            aap.m31c(c0086ce.f5398b, intentSender, -1, intent, i2, i3, i4, bundle);
            return;
        }
        if (bundle != null) {
            if (intent2 == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (C0111cq.m5275S(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ActivityOptions ");
                sb2.append(bundle);
                sb2.append(" were added to fillInIntent ");
                sb2.append(intent2);
                sb2.append(" for fragment ");
                sb2.append(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        C0925qc c0925qc = new C0925qc(intentSender);
        c0925qc.f47471a = intent2;
        c0925qc.m19339b(i3, i2);
        C0926qd c0926qdM19338a = c0925qc.m19338a();
        parentFragmentManager.f8796p.addLast(new C0095cn(this.f4609k, i));
        if (C0111cq.m5275S(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment ");
            sb3.append(this);
            sb3.append("is launching an IntentSender for result ");
        }
        parentFragmentManager.f8794n.mo2762b(c0926qdM19338a);
    }

    public final void startPostponedEnterTransition() {
        if (this.f4589Q == null || !m3114i().f4273s) {
            return;
        }
        if (this.f4624z == null) {
            m3114i().f4273s = false;
        } else if (Looper.myLooper() != this.f4624z.f5400d.getLooper()) {
            this.f4624z.f5400d.postAtFrontOfQueue(new RunnableC0059be(this, 4, (char[]) null));
        } else {
            m3118m(true);
        }
    }

    /* JADX INFO: renamed from: t */
    final void m3125t(boolean z) {
        if (this.f4589Q == null) {
            return;
        }
        m3114i().f4255a = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f4609k);
        if (this.f4575C != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f4575C));
        }
        if (this.f4577E != null) {
            sb.append(" tag=");
            sb.append(this.f4577E);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    final void m3126u(ArrayList arrayList, ArrayList arrayList2) {
        m3114i();
        C0073bs c0073bs = this.f4589Q;
        c0073bs.f4261g = arrayList;
        c0073bs.f4262h = arrayList2;
    }

    public final void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    /* JADX INFO: renamed from: v */
    final boolean m3127v() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return false;
        }
        return c0073bs.f4255a;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3128w() {
        return this.f4622x > 0;
    }

    /* JADX INFO: renamed from: x */
    final aaa m3129x() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        return c0073bs.f4274t;
    }

    /* JADX INFO: renamed from: y */
    final aaa m3130y() {
        C0073bs c0073bs = this.f4589Q;
        if (c0073bs == null) {
            return null;
        }
        return c0073bs.f4275u;
    }

    @Deprecated
    public static ComponentCallbacksC0077bw instantiate(Context context, String str, Bundle bundle) {
        try {
            ClassLoader classLoader = context.getClassLoader();
            int i = C0085cd.f5249a;
            try {
                ComponentCallbacksC0077bw componentCallbacksC0077bw = (ComponentCallbacksC0077bw) C0085cd.m3475a(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (bundle != null) {
                    bundle.setClassLoader(componentCallbacksC0077bw.getClass().getClassLoader());
                    componentCallbacksC0077bw.setArguments(bundle);
                }
                return componentCallbacksC0077bw;
            } catch (ClassCastException e) {
                throw new C0074bt("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
            } catch (ClassNotFoundException e2) {
                throw new C0074bt("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
            }
        } catch (IllegalAccessException e3) {
            throw new C0074bt("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (InstantiationException e4) {
            throw new C0074bt("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        } catch (NoSuchMethodException e5) {
            throw new C0074bt("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e5);
        } catch (InvocationTargetException e6) {
            throw new C0074bt("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    @Deprecated
    public final LayoutInflater getLayoutInflater(Bundle bundle) {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        C0079by c0079by = (C0079by) c0086ce;
        LayoutInflater layoutInflaterCloneInContext = c0079by.f4732a.getLayoutInflater().cloneInContext(c0079by.f4732a);
        layoutInflaterCloneInContext.setFactory2(this.f4573A.f8783c);
        return layoutInflaterCloneInContext;
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        m3114i().f4273s = true;
        C0111cq c0111cq = this.f4623y;
        Handler handler = c0111cq != null ? c0111cq.f8789i.f5400d : new Handler(Looper.getMainLooper());
        handler.removeCallbacks(this.f4590R);
        handler.postDelayed(this.f4590R, timeUnit.toMillis(j));
    }

    public final AbstractC0919px registerForActivityResult(AbstractC0927qe abstractC0927qe, C0923qa c0923qa, InterfaceC0918pw interfaceC0918pw) {
        return m3109z(abstractC0927qe, new C0071bq(c0923qa, 0), interfaceC0918pw);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        C0086ce c0086ce = this.f4624z;
        if (c0086ce == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        c0086ce.m3536h(intent, -1, bundle);
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (this.f4624z == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        C0111cq parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f8793m != null) {
            parentFragmentManager.f8796p.addLast(new C0095cn(this.f4609k, i));
            if (intent != null && bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f8793m.mo2762b(intent);
            return;
        }
        parentFragmentManager.f8789i.m3536h(intent, i, bundle);
    }

    public ComponentCallbacksC0077bw(int i) {
        this();
        this.f4599a = i;
    }
}
