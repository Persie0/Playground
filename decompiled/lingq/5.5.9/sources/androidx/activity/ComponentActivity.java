package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.AbstractC0207f;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0208g;
import androidx.fragment.app.C0943b0;
import androidx.fragment.app.C0945c0;
import androidx.fragment.app.C0972q;
import androidx.fragment.app.C0974r;
import androidx.fragment.app.FragmentManager;
import androidx.p544savedstate.C1189a;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.C1030e0;
import androidx.view.C1040j0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.FragmentC1022b0;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.InterfaceC1049o;
import androidx.view.InterfaceC1051q;
import androidx.view.Lifecycle;
import androidx.view.SavedStateHandleSupport;
import androidx.view.ViewTreeLifecycleOwner;
import androidx.view.ViewTreeViewModelStoreOwner;
import cm.InterfaceC2041a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p020b.C1274a;
import p020b.InterfaceC1275b;
import p035c.AbstractC1641a;
import p232l2.ActivityC7230i;
import p232l2.C7222a;
import p232l2.C7231j;
import p232l2.C7243v;
import p232l2.InterfaceC7240s;
import p232l2.InterfaceC7241t;
import p254m2.InterfaceC7473b;
import p254m2.InterfaceC7474c;
import p270n4.C7705b;
import p270n4.InterfaceC7706c;
import p338qd.C8573r0;
import p389t2.C9182a;
import p391t4.C9194a;
import p427v3.AbstractC9634a;
import p427v3.C9636c;
import p446w2.InterfaceC9803a;
import p471x2.C10044j;
import p471x2.InterfaceC10042i;
import p471x2.InterfaceC10048l;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends ActivityC7230i implements InterfaceC1048n0, InterfaceC1037i, InterfaceC7706c, InterfaceC0209s, InterfaceC0208g, InterfaceC7473b, InterfaceC7474c, InterfaceC7240s, InterfaceC7241t, InterfaceC10042i {

    /* JADX INFO: renamed from: H */
    public final CopyOnWriteArrayList<InterfaceC9803a<Integer>> f432H;

    /* JADX INFO: renamed from: I */
    public final CopyOnWriteArrayList<InterfaceC9803a<Intent>> f433I;

    /* JADX INFO: renamed from: J */
    public final CopyOnWriteArrayList<InterfaceC9803a<C7231j>> f434J;

    /* JADX INFO: renamed from: K */
    public final CopyOnWriteArrayList<InterfaceC9803a<C7243v>> f435K;

    /* JADX INFO: renamed from: L */
    public boolean f436L;

    /* JADX INFO: renamed from: M */
    public boolean f437M;

    /* JADX INFO: renamed from: b */
    public final C1274a f438b = new C1274a();

    /* JADX INFO: renamed from: c */
    public final C10044j f439c;

    /* JADX INFO: renamed from: d */
    public final C1052r f440d;

    /* JADX INFO: renamed from: e */
    public final C7705b f441e;

    /* JADX INFO: renamed from: f */
    public C1046m0 f442f;

    /* JADX INFO: renamed from: g */
    public C1030e0 f443g;

    /* JADX INFO: renamed from: h */
    public final OnBackPressedDispatcher f444h;

    /* JADX INFO: renamed from: i */
    public final ExecutorC0177e f445i;

    /* JADX INFO: renamed from: j */
    public final C0194m f446j;

    /* JADX INFO: renamed from: k */
    public final C0174b f447k;

    /* JADX INFO: renamed from: l */
    public final CopyOnWriteArrayList<InterfaceC9803a<Configuration>> f448l;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0173a implements Runnable {
        public RunnableC0173a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e10) {
                if (!TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    public class C0174b extends AbstractC0207f {
        public C0174b() {
        }

        @Override // androidx.activity.result.AbstractC0207f
        /* JADX INFO: renamed from: b */
        public final void mo801b(int i10, AbstractC1641a abstractC1641a, Object obj) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC1641a.a aVarMo5338b = abstractC1641a.mo5338b(componentActivity, obj);
            if (aVarMo5338b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0187f(this, i10, aVarMo5338b));
                return;
            }
            Intent intentMo3677a = abstractC1641a.mo3677a(componentActivity, obj);
            if (intentMo3677a.getExtras() != null && intentMo3677a.getExtras().getClassLoader() == null) {
                intentMo3677a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo3677a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentMo3677a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo3677a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo3677a.getAction())) {
                String[] stringArrayExtra = intentMo3677a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C7222a.m14545c(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo3677a.getAction())) {
                int i11 = C7222a.f40604c;
                C7222a.a.m14548b(componentActivity, intentMo3677a, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo3677a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f511a;
                Intent intent = intentSenderRequest.f512b;
                int i12 = intentSenderRequest.f513c;
                int i13 = intentSenderRequest.f514d;
                int i14 = C7222a.f40604c;
                C7222a.a.m14549c(componentActivity, intentSender, i10, intent, i12, i13, 0, bundle);
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0188g(this, i10, e10));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$c */
    public static class C0175c {
        /* JADX INFO: renamed from: a */
        public static OnBackInvokedDispatcher m802a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$d */
    public static final class C0176d {

        /* JADX INFO: renamed from: a */
        public C1046m0 f454a;
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$e */
    public class ExecutorC0177e implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: b */
        public Runnable f456b;

        /* JADX INFO: renamed from: a */
        public final long f455a = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: c */
        public boolean f457c = false;

        public ExecutorC0177e() {
        }

        /* JADX INFO: renamed from: a */
        public final void m803a(View view) {
            if (this.f457c) {
                return;
            }
            this.f457c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f456b = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f457c) {
                decorView.postOnAnimation(new RunnableC0190i(0, this));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z10;
            Runnable runnable = this.f456b;
            if (runnable != null) {
                runnable.run();
                this.f456b = null;
                C0194m c0194m = ComponentActivity.this.f446j;
                synchronized (c0194m.f497b) {
                    z10 = c0194m.f498c;
                }
                if (z10) {
                    this.f457c = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                }
            } else if (SystemClock.uptimeMillis() > this.f455a) {
                this.f457c = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.activity.c] */
    public ComponentActivity() {
        int i10 = 0;
        this.f439c = new C10044j(new RunnableC0183b(i10, this));
        C1052r c1052r = new C1052r(this);
        this.f440d = c1052r;
        C7705b c7705b = new C7705b(this);
        this.f441e = c7705b;
        this.f444h = new OnBackPressedDispatcher(new RunnableC0173a());
        ExecutorC0177e executorC0177e = new ExecutorC0177e();
        this.f445i = executorC0177e;
        this.f446j = new C0194m(executorC0177e, new InterfaceC2041a() { // from class: androidx.activity.c
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Object mo807E() {
                this.f477a.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.f447k = new C0174b();
        this.f448l = new CopyOnWriteArrayList<>();
        this.f432H = new CopyOnWriteArrayList<>();
        this.f433I = new CopyOnWriteArrayList<>();
        this.f434J = new CopyOnWriteArrayList<>();
        this.f435K = new CopyOnWriteArrayList<>();
        this.f436L = false;
        this.f437M = false;
        c1052r.mo3883a(new InterfaceC1049o() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        c1052r.mo3883a(new InterfaceC1049o() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    ComponentActivity.this.f438b.f7955b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.mo796n().m3952a();
                }
            }
        });
        c1052r.mo3883a(new InterfaceC1049o() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                ComponentActivity componentActivity = ComponentActivity.this;
                if (componentActivity.f442f == null) {
                    C0176d c0176d = (C0176d) componentActivity.getLastNonConfigurationInstance();
                    if (c0176d != null) {
                        componentActivity.f442f = c0176d.f454a;
                    }
                    if (componentActivity.f442f == null) {
                        componentActivity.f442f = new C1046m0();
                    }
                }
                componentActivity.f440d.mo3885c(this);
            }
        });
        c7705b.m15298a();
        SavedStateHandleSupport.m3909b(this);
        c7705b.f42232b.m4586c("android:support:activity-result", new C0185d(i10, this));
        m787I(new InterfaceC1275b() { // from class: androidx.activity.e
            @Override // p020b.InterfaceC1275b
            /* JADX INFO: renamed from: a */
            public final void mo812a() {
                ComponentActivity componentActivity = this.f480a;
                Bundle bundleM4584a = componentActivity.f441e.f42232b.m4584a("android:support:activity-result");
                if (bundleM4584a != null) {
                    ComponentActivity.C0174b c0174b = componentActivity.f447k;
                    c0174b.getClass();
                    ArrayList<Integer> integerArrayList = bundleM4584a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleM4584a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        c0174b.f525e = bundleM4584a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        c0174b.f521a = (Random) bundleM4584a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                        Bundle bundle = bundleM4584a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = c0174b.f528h;
                        bundle2.putAll(bundle);
                        for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                            String str = stringArrayList.get(i11);
                            HashMap map = c0174b.f523c;
                            boolean zContainsKey = map.containsKey(str);
                            HashMap map2 = c0174b.f522b;
                            if (zContainsKey) {
                                Integer num = (Integer) map.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    map2.remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i11).intValue();
                            String str2 = stringArrayList.get(i11);
                            map2.put(Integer.valueOf(iIntValue), str2);
                            map.put(str2, Integer.valueOf(iIntValue));
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: J */
    private void m782J() {
        ViewTreeLifecycleOwner.m3912b(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.m3914b(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.m4583b(getWindow().getDecorView(), this);
        C8573r0.m16712Z0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        C5207g.m11111f(decorView, "<this>");
        decorView.setTag(R.id.report_drawn, this);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p471x2.InterfaceC10042i
    /* JADX INFO: renamed from: A */
    public final void mo783A(FragmentManager.C0918c c0918c) {
        C10044j c10044j = this.f439c;
        c10044j.f51036b.remove(c0918c);
        if (((C10044j.a) c10044j.f51037c.remove(c0918c)) != null) {
            throw null;
        }
        c10044j.f51035a.run();
    }

    @Override // p232l2.InterfaceC7240s
    /* JADX INFO: renamed from: B */
    public final void mo784B(C0945c0 c0945c0) {
        this.f434J.remove(c0945c0);
    }

    @Override // p254m2.InterfaceC7473b
    /* JADX INFO: renamed from: E */
    public final void mo785E(InterfaceC9803a<Configuration> interfaceC9803a) {
        this.f448l.add(interfaceC9803a);
    }

    @Override // p232l2.ActivityC7230i, androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        return this.f440d;
    }

    /* JADX INFO: renamed from: I */
    public final void m787I(InterfaceC1275b interfaceC1275b) {
        C1274a c1274a = this.f438b;
        c1274a.getClass();
        if (c1274a.f7955b != null) {
            interfaceC1275b.mo812a();
        }
        c1274a.f7954a.add(interfaceC1275b);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m782J();
        this.f445i.m803a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.InterfaceC0209s
    /* JADX INFO: renamed from: b */
    public final OnBackPressedDispatcher mo788b() {
        return this.f444h;
    }

    @Override // p232l2.InterfaceC7241t
    /* JADX INFO: renamed from: e */
    public final void mo789e(C0972q c0972q) {
        this.f435K.add(c0972q);
    }

    @Override // p254m2.InterfaceC7474c
    /* JADX INFO: renamed from: f */
    public final void mo790f(C0943b0 c0943b0) {
        this.f432H.remove(c0943b0);
    }

    @Override // p232l2.InterfaceC7241t
    /* JADX INFO: renamed from: g */
    public final void mo791g(C0972q c0972q) {
        this.f435K.remove(c0972q);
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: i */
    public C1042k0.b mo470i() {
        if (this.f443g == null) {
            this.f443g = new C1030e0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f443g;
    }

    @Override // androidx.view.InterfaceC1037i
    /* JADX INFO: renamed from: j */
    public final AbstractC9634a mo792j() {
        C9636c c9636c = new C9636c(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = c9636c.f49329a;
        if (application != null) {
            linkedHashMap.put(C1040j0.f6663a, getApplication());
        }
        linkedHashMap.put(SavedStateHandleSupport.f6589a, this);
        linkedHashMap.put(SavedStateHandleSupport.f6590b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(SavedStateHandleSupport.f6591c, getIntent().getExtras());
        }
        return c9636c;
    }

    @Override // androidx.activity.result.InterfaceC0208g
    /* JADX INFO: renamed from: k */
    public final AbstractC0207f mo793k() {
        return this.f447k;
    }

    @Override // p254m2.InterfaceC7474c
    /* JADX INFO: renamed from: l */
    public final void mo794l(C0943b0 c0943b0) {
        this.f432H.add(c0943b0);
    }

    @Override // p232l2.InterfaceC7240s
    /* JADX INFO: renamed from: m */
    public final void mo795m(C0945c0 c0945c0) {
        this.f434J.add(c0945c0);
    }

    @Override // androidx.view.InterfaceC1048n0
    /* JADX INFO: renamed from: n */
    public final C1046m0 mo796n() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f442f == null) {
            C0176d c0176d = (C0176d) getLastNonConfigurationInstance();
            if (c0176d != null) {
                this.f442f = c0176d.f454a;
            }
            if (this.f442f == null) {
                this.f442f = new C1046m0();
            }
        }
        return this.f442f;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f447k.m866a(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f444h.m805b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC9803a<Configuration>> it = this.f448l.iterator();
        while (it.hasNext()) {
            it.next().mo3724a(configuration);
        }
    }

    @Override // p232l2.ActivityC7230i, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f441e.m15299b(bundle);
        C1274a c1274a = this.f438b;
        c1274a.getClass();
        c1274a.f7955b = this;
        Iterator it = c1274a.f7954a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1275b) it.next()).mo812a();
        }
        super.onCreate(bundle);
        int i10 = FragmentC1022b0.f6606b;
        FragmentC1022b0.b.m3923b(this);
        if (C9182a.m17515a()) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.f444h;
            OnBackInvokedDispatcher onBackInvokedDispatcherM802a = C0175c.m802a(this);
            onBackPressedDispatcher.getClass();
            C5207g.m11111f(onBackInvokedDispatcherM802a, "invoker");
            onBackPressedDispatcher.f464e = onBackInvokedDispatcherM802a;
            onBackPressedDispatcher.m806c();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            MenuInflater menuInflater = getMenuInflater();
            Iterator<InterfaceC10048l> it = this.f439c.f51036b.iterator();
            while (it.hasNext()) {
                it.next().mo3672c(menu, menuInflater);
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 != 0) {
            return false;
        }
        Iterator<InterfaceC10048l> it = this.f439c.f51036b.iterator();
        while (it.hasNext()) {
            if (it.next().mo3670a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10) {
        if (this.f436L) {
            return;
        }
        Iterator<InterfaceC9803a<C7231j>> it = this.f434J.iterator();
        while (it.hasNext()) {
            it.next().mo3724a(new C7231j(z10));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z10, Configuration configuration) {
        this.f436L = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.f436L = false;
            Iterator<InterfaceC9803a<C7231j>> it = this.f434J.iterator();
            while (it.hasNext()) {
                it.next().mo3724a(new C7231j(z10, 0));
            }
        } catch (Throwable th2) {
            this.f436L = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC9803a<Intent>> it = this.f433I.iterator();
        while (it.hasNext()) {
            it.next().mo3724a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator<InterfaceC10048l> it = this.f439c.f51036b.iterator();
        while (it.hasNext()) {
            it.next().mo3671b(menu);
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10) {
        if (this.f437M) {
            return;
        }
        Iterator<InterfaceC9803a<C7243v>> it = this.f435K.iterator();
        while (it.hasNext()) {
            it.next().mo3724a(new C7243v(z10));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z10, Configuration configuration) {
        this.f437M = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.f437M = false;
            Iterator<InterfaceC9803a<C7243v>> it = this.f435K.iterator();
            while (it.hasNext()) {
                it.next().mo3724a(new C7243v(z10, 0));
            }
        } catch (Throwable th2) {
            this.f437M = false;
            throw th2;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator<InterfaceC10048l> it = this.f439c.f51036b.iterator();
            while (it.hasNext()) {
                it.next().mo3673d(menu);
            }
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.f447k.m866a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0176d c0176d;
        C1046m0 c1046m0 = this.f442f;
        if (c1046m0 == null && (c0176d = (C0176d) getLastNonConfigurationInstance()) != null) {
            c1046m0 = c0176d.f454a;
        }
        if (c1046m0 == null) {
            return null;
        }
        C0176d c0176d2 = new C0176d();
        c0176d2.f454a = c1046m0;
        return c0176d2;
    }

    @Override // p232l2.ActivityC7230i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C1052r c1052r = this.f440d;
        if (c1052r instanceof C1052r) {
            c1052r.m3957h(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f441e.m15300c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<InterfaceC9803a<Integer>> it = this.f432H.iterator();
        while (it.hasNext()) {
            it.next().mo3724a(Integer.valueOf(i10));
        }
    }

    @Override // p270n4.InterfaceC7706c
    /* JADX INFO: renamed from: q */
    public final C1189a mo797q() {
        return this.f441e.f42232b;
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (C9194a.m17534a()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0194m c0194m = this.f446j;
            synchronized (c0194m.f497b) {
                c0194m.f498c = true;
                Iterator it = c0194m.f499d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2041a) it.next()).mo807E();
                }
                c0194m.f499d.clear();
                C9072e c9072e = C9072e.f47360a;
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        m782J();
        this.f445i.m803a(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m782J();
        this.f445i.m803a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m782J();
        this.f445i.m803a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public final void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // p471x2.InterfaceC10042i
    /* JADX INFO: renamed from: t */
    public final void mo798t(FragmentManager.C0918c c0918c) {
        C10044j c10044j = this.f439c;
        c10044j.f51036b.add(c0918c);
        c10044j.f51035a.run();
    }

    @Override // p254m2.InterfaceC7473b
    /* JADX INFO: renamed from: w */
    public final void mo799w(C0974r c0974r) {
        this.f448l.remove(c0974r);
    }
}
