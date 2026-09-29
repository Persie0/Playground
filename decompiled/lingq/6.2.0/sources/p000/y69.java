package p000;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import p000.mq7;
import p000.q6b;
import p000.u69;
import p000.y69;

/* JADX INFO: loaded from: classes2.dex */
public final class y69 implements kx2 {

    /* JADX INFO: renamed from: a */
    public final SidecarInterface f69378a;

    /* JADX INFO: renamed from: b */
    public final u69 f69379b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f69380c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f69381d;

    /* JADX INFO: renamed from: e */
    public mq7 f69382e;

    public y69(Context context) {
        context.getClass();
        SidecarInterface sidecarInterfaceM23779a = w69.m23779a(context);
        u69 u69Var = new u69();
        this.f69378a = sidecarInterfaceM23779a;
        this.f69379b = u69Var;
        this.f69380c = new LinkedHashMap();
        this.f69381d = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final q6b m24959a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new q6b(EmptyList.f47638a);
        }
        SidecarInterface sidecarInterface = this.f69378a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f69378a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f69379b.m22513c(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m24960b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f69378a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f69381d;
        lk1 lk1Var = (lk1) linkedHashMap.get(activity);
        if (lk1Var != null) {
            if (activity instanceof ur6) {
                ((ur6) activity).mo13201B(lk1Var);
            }
            linkedHashMap.remove(activity);
        }
        mq7 mq7Var = this.f69382e;
        if (mq7Var != null) {
            ReentrantLock reentrantLock = (ReentrantLock) mq7Var.f51734c;
            reentrantLock.lock();
            try {
                ((WeakHashMap) mq7Var.f51735d).put(activity, null);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        LinkedHashMap linkedHashMap2 = this.f69380c;
        boolean z = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z || (sidecarInterface = this.f69378a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final void m24961c(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f69380c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f69378a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f69378a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        mq7 mq7Var = this.f69382e;
        if (mq7Var != null) {
            mq7Var.m16999g(activity, m24959a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f69381d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof ur6)) {
            lk1 lk1Var = new lk1() { // from class: v69
                @Override // p000.lk1
                public final void accept(Object obj) {
                    y69 y69Var = this.f64950a;
                    mq7 mq7Var2 = y69Var.f69382e;
                    if (mq7Var2 != null) {
                        Activity activity2 = activity;
                        mq7Var2.m16999g(activity2, y69Var.m24959a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, lk1Var);
            ((ur6) activity).mo13204z(lk1Var);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m24962d(vqb vqbVar) {
        this.f69382e = new mq7(vqbVar);
        SidecarInterface sidecarInterface = this.f69378a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f69379b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    sidecarDeviceState.getClass();
                    Collection<Activity> collectionValues = this.f7153a.f69380c.values();
                    y69 y69Var = this.f7153a;
                    for (Activity activity : collectionValues) {
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = y69Var.f69378a) != null) {
                            windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        mq7 mq7Var = y69Var.f69382e;
                        if (mq7Var != null) {
                            mq7Var.m16999g(activity, y69Var.f69379b.m22513c(windowLayoutInfo, sidecarDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                    SidecarDeviceState sidecarDeviceState;
                    iBinder.getClass();
                    sidecarWindowLayoutInfo.getClass();
                    Activity activity = (Activity) this.f7153a.f69380c.get(iBinder);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    y69 y69Var = this.f7153a;
                    u69 u69Var = y69Var.f69379b;
                    SidecarInterface sidecarInterface2 = y69Var.f69378a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    q6b q6bVarM22513c = u69Var.m22513c(sidecarWindowLayoutInfo, sidecarDeviceState);
                    mq7 mq7Var = this.f7153a.f69382e;
                    if (mq7Var != null) {
                        mq7Var.m16999g(activity, q6bVarM22513c);
                    }
                }
            }));
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m24963e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f69378a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!fa4.m11650l(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f69378a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f69378a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f69378a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!fa4.m11650l(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f69378a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!fa4.m11650l(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f69378a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!fa4.m11650l(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                objInvoke.getClass();
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            rect.getClass();
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                objInvoke2.getClass();
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
