package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.ActivityC0979t;
import androidx.fragment.app.C0940a;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C2084f;
import com.bumptech.glide.C2086h;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.bumptech.glide.ComponentCallbacks2C2090l;
import dm.C5206f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p007a6.C0039r;
import p258m6.C7492l;
import p326q.C8446b;
import p338qd.C8573r0;
import p392t5.C9203i;

/* JADX INFO: renamed from: com.bumptech.glide.manager.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2158n implements Handler.Callback {

    /* JADX INFO: renamed from: j */
    public static final a f10870j = new a();

    /* JADX INFO: renamed from: a */
    public volatile ComponentCallbacks2C2090l f10871a;

    /* JADX INFO: renamed from: d */
    public final Handler f10874d;

    /* JADX INFO: renamed from: e */
    public final b f10875e;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2151g f10878h;

    /* JADX INFO: renamed from: i */
    public final C2155k f10879i;

    /* JADX INFO: renamed from: b */
    public final HashMap f10872b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f10873c = new HashMap();

    /* JADX INFO: renamed from: f */
    public final C8446b<View, Fragment> f10876f = new C8446b<>();

    /* JADX INFO: renamed from: g */
    public final C8446b<View, android.app.Fragment> f10877g = new C8446b<>();

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$a */
    public class a implements b {
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.n$b */
    public interface b {
    }

    public C2158n(b bVar, C2086h c2086h) {
        new Bundle();
        if (bVar == null) {
            bVar = f10870j;
        }
        this.f10875e = bVar;
        this.f10874d = new Handler(Looper.getMainLooper(), this);
        this.f10879i = new C2155k(bVar);
        this.f10878h = (C0039r.f36h && C0039r.f35g) ? c2086h.f10568a.containsKey(C2084f.class) ? new ComponentCallbacks2C2150f() : new C5206f() : new C8573r0();
    }

    /* JADX INFO: renamed from: a */
    public static Activity m6370a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m6370a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @TargetApi(26)
    @Deprecated
    /* JADX INFO: renamed from: b */
    public static void m6371b(FragmentManager fragmentManager, C8446b c8446b) {
        while (true) {
            for (android.app.Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    c8446b.put(fragment.getView(), fragment);
                    m6371b(fragment.getChildFragmentManager(), c8446b);
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m6372c(List list, C8446b c8446b) {
        View view;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && (view = fragment.f6094c0) != null) {
                c8446b.put(view, fragment);
                m6372c(fragment.m3594l().m3620H(), c8446b);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C2090l m6373d(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z10) {
        FragmentC2157m fragmentC2157mM6377h = m6377h(fragmentManager, fragment);
        ComponentCallbacks2C2090l componentCallbacks2C2090l = fragmentC2157mM6377h.f10866d;
        if (componentCallbacks2C2090l == null) {
            ComponentCallbacks2C2080b componentCallbacks2C2080bM6235a = ComponentCallbacks2C2080b.m6235a(context);
            ((a) this.f10875e).getClass();
            ComponentCallbacks2C2090l componentCallbacks2C2090l2 = new ComponentCallbacks2C2090l(componentCallbacks2C2080bM6235a, fragmentC2157mM6377h.f10863a, fragmentC2157mM6377h.f10864b, context);
            if (z10) {
                componentCallbacks2C2090l2.mo6252a();
            }
            fragmentC2157mM6377h.f10866d = componentCallbacks2C2090l2;
            componentCallbacks2C2090l = componentCallbacks2C2090l2;
        }
        return componentCallbacks2C2090l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Deprecated
    /* JADX INFO: renamed from: e */
    public final ComponentCallbacks2C2090l m6374e(Activity activity) {
        if (C7492l.m14887h()) {
            return m6375f(activity.getApplicationContext());
        }
        if (activity instanceof ActivityC0979t) {
            return m6376g((ActivityC0979t) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f10878h.mo6367o();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityM6370a = m6370a(activity);
        return m6373d(activity, fragmentManager, null, activityM6370a == null || !activityM6370a.isFinishing());
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public final ComponentCallbacks2C2090l m6375f(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = C7492l.f41383a;
        if ((Looper.myLooper() == Looper.getMainLooper()) && !(context instanceof Application)) {
            if (context instanceof ActivityC0979t) {
                return m6376g((ActivityC0979t) context);
            }
            if (context instanceof Activity) {
                return m6374e((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m6375f(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f10871a == null) {
            synchronized (this) {
                if (this.f10871a == null) {
                    ComponentCallbacks2C2080b componentCallbacks2C2080bM6235a = ComponentCallbacks2C2080b.m6235a(context.getApplicationContext());
                    b bVar = this.f10875e;
                    C5206f c5206f = new C5206f();
                    C9203i c9203i = new C9203i(3);
                    Context applicationContext = context.getApplicationContext();
                    ((a) bVar).getClass();
                    this.f10871a = new ComponentCallbacks2C2090l(componentCallbacks2C2080bM6235a, c5206f, c9203i, applicationContext);
                }
            }
        }
        return this.f10871a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final ComponentCallbacks2C2090l m6376g(ActivityC0979t activityC0979t) {
        if (C7492l.m14887h()) {
            return m6375f(activityC0979t.getApplicationContext());
        }
        if (activityC0979t.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f10878h.mo6367o();
        Activity activityM6370a = m6370a(activityC0979t);
        boolean z10 = activityM6370a == null || !activityM6370a.isFinishing();
        return this.f10879i.m6368a(activityC0979t, ComponentCallbacks2C2080b.m6235a(activityC0979t.getApplicationContext()), activityC0979t.f440d, activityC0979t.m3805K(), z10);
    }

    /* JADX INFO: renamed from: h */
    public final FragmentC2157m m6377h(FragmentManager fragmentManager, android.app.Fragment fragment) {
        HashMap map = this.f10872b;
        FragmentC2157m fragmentC2157m = (FragmentC2157m) map.get(fragmentManager);
        if (fragmentC2157m == null) {
            FragmentC2157m fragmentC2157m2 = (FragmentC2157m) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (fragmentC2157m2 == null) {
                fragmentC2157m2 = new FragmentC2157m();
                fragmentC2157m2.f10868f = fragment;
                if (fragment != null && fragment.getActivity() != null) {
                    fragmentC2157m2.m6369a(fragment.getActivity());
                }
                map.put(fragmentManager, fragmentC2157m2);
                fragmentManager.beginTransaction().add(fragmentC2157m2, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f10874d.obtainMessage(1, fragmentManager).sendToTarget();
            }
            fragmentC2157m = fragmentC2157m2;
        }
        return fragmentC2157m;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0126  */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean z10;
        Object objRemove;
        Object obj;
        Object obj2;
        boolean z11;
        boolean z12 = true;
        boolean z13 = false;
        boolean z14 = message.arg1 == 1;
        int i10 = message.what;
        Handler handler = this.f10874d;
        Object obj3 = null;
        if (i10 == 1) {
            FragmentManager fragmentManager = (FragmentManager) message.obj;
            HashMap map = this.f10872b;
            FragmentC2157m fragmentC2157m = (FragmentC2157m) map.get(fragmentManager);
            FragmentC2157m fragmentC2157m2 = (FragmentC2157m) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (fragmentC2157m2 == fragmentC2157m) {
                z10 = true;
            } else {
                if (fragmentC2157m2 != null && fragmentC2157m2.f10866d != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + fragmentC2157m2 + " New: " + fragmentC2157m);
                }
                if (z14 || fragmentManager.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager.isDestroyed()) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    fragmentC2157m.f10863a.m6364a();
                    z10 = true;
                } else {
                    FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(fragmentC2157m, "com.bumptech.glide.manager");
                    if (fragmentC2157m2 != null) {
                        fragmentTransactionAdd.remove(fragmentC2157m2);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
                    if (Log.isLoggable("RMRetriever", 3)) {
                        Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                    }
                    z10 = false;
                }
            }
            if (z10) {
                objRemove = map.remove(fragmentManager);
                obj2 = fragmentManager;
                obj3 = objRemove;
                z13 = true;
                obj = obj2;
            } else {
                obj = null;
                z13 = true;
                z12 = false;
            }
        } else if (i10 != 2) {
            z12 = false;
            obj = null;
        } else {
            androidx.fragment.app.FragmentManager fragmentManager2 = (androidx.fragment.app.FragmentManager) message.obj;
            HashMap map2 = this.f10873c;
            C2162r c2162r = (C2162r) map2.get(fragmentManager2);
            C2162r c2162r2 = (C2162r) fragmentManager2.m3616D("com.bumptech.glide.manager");
            if (c2162r2 == c2162r) {
                z11 = true;
            } else if (z14 || fragmentManager2.f6151H) {
                if (fragmentManager2.f6151H) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                    }
                } else if (Log.isLoggable("RMRetriever", 6)) {
                    Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                }
                c2162r.f10893v0.m6364a();
                z11 = true;
            } else {
                C0940a c0940a = new C0940a(fragmentManager2);
                c0940a.mo3695f(0, c2162r, "com.bumptech.glide.manager", 1);
                if (c2162r2 != null) {
                    c0940a.m3700l(c2162r2);
                }
                if (c0940a.f6350g) {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
                c0940a.f6351h = false;
                c0940a.f6250q.m3668y(c0940a, true);
                handler.obtainMessage(2, 1, 0, fragmentManager2).sendToTarget();
                if (Log.isLoggable("RMRetriever", 3)) {
                    Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
                }
                z11 = false;
            }
            if (z11) {
                objRemove = map2.remove(fragmentManager2);
                obj2 = fragmentManager2;
                obj3 = objRemove;
                z13 = true;
                obj = obj2;
            } else {
                obj = null;
                z13 = true;
                z12 = false;
            }
        }
        if (Log.isLoggable("RMRetriever", 5) && z12 && obj3 == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        }
        return z13;
    }

    /* JADX INFO: renamed from: i */
    public final C2162r m6378i(androidx.fragment.app.FragmentManager fragmentManager) {
        HashMap map = this.f10873c;
        C2162r c2162r = (C2162r) map.get(fragmentManager);
        if (c2162r != null) {
            return c2162r;
        }
        C2162r c2162r2 = (C2162r) fragmentManager.m3616D("com.bumptech.glide.manager");
        if (c2162r2 == null) {
            c2162r2 = new C2162r();
            c2162r2.f10896y0 = null;
            map.put(fragmentManager, c2162r2);
            C0940a c0940a = new C0940a(fragmentManager);
            c0940a.mo3695f(0, c2162r2, "com.bumptech.glide.manager", 1);
            c0940a.m3698j(true);
            this.f10874d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return c2162r2;
    }
}
