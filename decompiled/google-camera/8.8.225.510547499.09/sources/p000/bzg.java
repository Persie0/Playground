package p000;

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
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.bumptech.glide.manager.LifecycleLifecycle;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzg implements Handler.Callback {

    /* JADX INFO: renamed from: e */
    private static final bzq f4805e = new bzq((byte[]) null);

    /* JADX INFO: renamed from: a */
    final Map f4806a = new HashMap();

    /* JADX INFO: renamed from: b */
    final Map f4807b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Handler f4808c;

    /* JADX INFO: renamed from: d */
    private volatile bpp f4809d;

    /* JADX INFO: renamed from: f */
    private final bzq f4810f;

    /* JADX INFO: renamed from: g */
    private final dsx f4811g;

    public bzg() {
        new C1109wy();
        new C1109wy();
        new Bundle();
        bzq bzqVar = f4805e;
        this.f4810f = bzqVar;
        this.f4808c = new Handler(Looper.getMainLooper(), this);
        this.f4811g = new dsx(bzqVar, (byte[]) null);
        int i = bxh.f4692a;
    }

    /* JADX INFO: renamed from: d */
    private static Activity m3210d(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m3210d(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    private static void m3211e(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m3212f(Context context) {
        Activity activityM3210d = m3210d(context);
        return activityM3210d == null || !activityM3210d.isFinishing();
    }

    /* JADX INFO: renamed from: a */
    public final bpp m3213a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (cbi.m3391l() && !(context instanceof Application)) {
            if (context instanceof ActivityC0080bz) {
                return m3214b((ActivityC0080bz) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (cbi.m3390k()) {
                    return m3213a(activity.getApplicationContext());
                }
                if (activity instanceof ActivityC0080bz) {
                    return m3214b((ActivityC0080bz) activity);
                }
                m3211e(activity);
                FragmentManager fragmentManager = activity.getFragmentManager();
                boolean zM3212f = m3212f(activity);
                bzf bzfVarM3215c = m3215c(fragmentManager);
                bpp bppVar = bzfVarM3215c.f4802c;
                if (bppVar != null) {
                    return bppVar;
                }
                bpp bppVarM3262b = bzq.m3262b(box.m2826b(activity), bzfVarM3215c.f4800a, bzfVarM3215c.f4801b, activity);
                if (zM3212f) {
                    bppVarM3262b.mo2868h();
                }
                bzfVarM3215c.f4802c = bppVarM3262b;
                return bppVarM3262b;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m3213a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f4809d == null) {
            synchronized (this) {
                if (this.f4809d == null) {
                    this.f4809d = bzq.m3262b(box.m2826b(context.getApplicationContext()), new byv(), new bzc(), context.getApplicationContext());
                }
            }
        }
        return this.f4809d;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public final bpp m3214b(ActivityC0080bz activityC0080bz) {
        if (cbi.m3390k()) {
            return m3213a(activityC0080bz.getApplicationContext());
        }
        m3211e(activityC0080bz);
        boolean zM3212f = m3212f(activityC0080bz);
        box boxVarM2826b = box.m2826b(activityC0080bz.getApplicationContext());
        dsx dsxVar = this.f4811g;
        aks aksVar = activityC0080bz.f47432m;
        activityC0080bz.m3206bA();
        cbi.m3387h();
        cbi.m3387h();
        bpp bppVar = (bpp) dsxVar.f12521a.get(aksVar);
        if (bppVar != null) {
            return bppVar;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(aksVar);
        Object obj = dsxVar.f12522b;
        bpp bppVarM3262b = bzq.m3262b(boxVarM2826b, lifecycleLifecycle, new bzc(), activityC0080bz);
        dsxVar.f12521a.put(aksVar, bppVarM3262b);
        lifecycleLifecycle.mo3200a(new bzb(dsxVar, aksVar, null, null, null));
        if (zM3212f) {
            bppVarM3262b.mo2868h();
        }
        return bppVarM3262b;
    }

    /* JADX INFO: renamed from: c */
    public final bzf m3215c(FragmentManager fragmentManager) {
        bzf bzfVar = (bzf) this.f4806a.get(fragmentManager);
        if (bzfVar != null) {
            return bzfVar;
        }
        String str = hsSUWRJfoeC.WXrzrIaxmysB;
        bzf bzfVar2 = (bzf) fragmentManager.findFragmentByTag(str);
        if (bzfVar2 != null) {
            return bzfVar2;
        }
        bzf bzfVar3 = new bzf();
        this.f4806a.put(fragmentManager, bzfVar3);
        fragmentManager.beginTransaction().add(bzfVar3, str).commitAllowingStateLoss();
        this.f4808c.obtainMessage(1, fragmentManager).sendToTarget();
        return bzfVar3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        int i = message.arg1;
        Object objRemove = null;
        boolean z = false;
        boolean z2 = true;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                bzf bzfVar = (bzf) this.f4806a.get(fragmentManager);
                bzf bzfVar2 = (bzf) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
                if (bzfVar2 == bzfVar) {
                    objRemove = this.f4806a.remove(fragmentManager);
                    z = true;
                    obj = fragmentManager;
                } else {
                    if (bzfVar2 != null && bzfVar2.f4802c != null) {
                        throw new IllegalStateException("We've added two fragments with requests! Old: " + bzfVar2.toString() + " New: " + String.valueOf(bzfVar));
                    }
                    if (i == 1 || fragmentManager.isDestroyed()) {
                        if (Log.isLoggable("RMRetriever", 5)) {
                            if (fragmentManager.isDestroyed()) {
                                Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                            } else {
                                Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                            }
                        }
                        bzfVar.f4800a.m3201b();
                        objRemove = this.f4806a.remove(fragmentManager);
                        z = true;
                        obj = fragmentManager;
                    } else {
                        FragmentTransaction fragmentTransactionAdd = fragmentManager.beginTransaction().add(bzfVar, "com.bumptech.glide.manager");
                        if (bzfVar2 != null) {
                            fragmentTransactionAdd.remove(bzfVar2);
                        }
                        fragmentTransactionAdd.commitAllowingStateLoss();
                        this.f4808c.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
                        obj = null;
                    }
                }
                break;
            case 2:
                C0111cq c0111cq = (C0111cq) message.obj;
                bzn bznVar = (bzn) this.f4807b.get(c0111cq);
                bzn bznVar2 = (bzn) c0111cq.m5325e("com.bumptech.glide.manager");
                if (bznVar2 == bznVar) {
                    objRemove = this.f4807b.remove(c0111cq);
                    z = true;
                    obj = c0111cq;
                } else if (i == 1 || c0111cq.f8800t) {
                    if (c0111cq.f8800t) {
                        if (Log.isLoggable("RMRetriever", 5)) {
                            Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                        }
                    } else if (Log.isLoggable("RMRetriever", 6)) {
                        Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                    }
                    bznVar.f4822a.m3201b();
                    objRemove = this.f4807b.remove(c0111cq);
                    z = true;
                    obj = c0111cq;
                } else {
                    AbstractC0118cx abstractC0118cxM5327i = c0111cq.m5327i();
                    abstractC0118cxM5327i.m5699o(bznVar, "com.bumptech.glide.manager");
                    if (bznVar2 != null) {
                        abstractC0118cxM5327i.mo2024k(bznVar2);
                    }
                    abstractC0118cxM5327i.mo2016c();
                    this.f4808c.obtainMessage(2, 1, 0, c0111cq).sendToTarget();
                    obj = null;
                }
                break;
            default:
                obj = null;
                z2 = false;
                break;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            Log.w("RMRetriever", pIeXJQLZLfgIN.PUdKSQnklRFxdpE.concat(String.valueOf(String.valueOf(obj))));
        }
        return z2;
    }
}
