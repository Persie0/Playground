package p000;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import p000.awx;
import p000.axg;
import p000.axh;
import p000.axj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axm implements axa {

    /* JADX INFO: renamed from: a */
    public static volatile axm f2664a;

    /* JADX INFO: renamed from: b */
    public static final ReentrantLock f2665b = new ReentrantLock();

    /* JADX INFO: renamed from: c */
    public final CopyOnWriteArrayList f2666c = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: d */
    private final axe f2667d;

    public axm(axe axeVar) {
        this.f2667d = axeVar;
        if (axeVar != null) {
            final axj axjVar = (axj) axeVar;
            axjVar.f2658e = new axh(new axk(this));
            SidecarInterface sidecarInterface = axjVar.f2654a;
            if (sidecarInterface != null) {
                sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(axjVar.f2655b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
                        SidecarInterface sidecarInterface2;
                        sidecarDeviceState.getClass();
                        Collection<Activity> collectionValues = axjVar.f2656c.values();
                        axj axjVar2 = axjVar;
                        for (Activity activity : collectionValues) {
                            IBinder iBinderM1666a = WearableControllerProvider.m1666a(activity);
                            SidecarWindowLayoutInfo windowLayoutInfo = null;
                            if (iBinderM1666a != null && (sidecarInterface2 = axjVar2.f2654a) != null) {
                                windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinderM1666a);
                            }
                            axh axhVar = axjVar2.f2658e;
                            if (axhVar != null) {
                                axhVar.m2083a(activity, axg.m2082a(windowLayoutInfo, sidecarDeviceState));
                            }
                        }
                    }

                    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
                        SidecarDeviceState sidecarDeviceState;
                        iBinder.getClass();
                        sidecarWindowLayoutInfo.getClass();
                        Activity activity = (Activity) axjVar.f2656c.get(iBinder);
                        if (activity == null) {
                            Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                            return;
                        }
                        SidecarInterface sidecarInterface2 = axjVar.f2654a;
                        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                            sidecarDeviceState = new SidecarDeviceState();
                        }
                        awx awxVarM2082a = axg.m2082a(sidecarWindowLayoutInfo, sidecarDeviceState);
                        axh axhVar = axjVar.f2658e;
                        if (axhVar != null) {
                            axhVar.m2083a(activity, awxVarM2082a);
                        }
                    }
                }));
            }
        }
    }

    @Override // p000.axa
    /* JADX INFO: renamed from: a */
    public final void mo2078a(Context context, Executor executor, aea aeaVar) {
        Object next;
        ReentrantLock reentrantLock = f2665b;
        reentrantLock.lock();
        try {
            axe axeVar = this.f2667d;
            if (axeVar == null) {
                aeaVar.mo309a(new awx(okv.f46215a));
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.f2666c;
            boolean z = false;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (ooc.m18737c(((axl) it.next()).f2660a, context)) {
                        z = true;
                        break;
                    }
                }
            }
            axl axlVar = new axl((Activity) context, executor, aeaVar);
            this.f2666c.add(axlVar);
            if (z) {
                Iterator it2 = this.f2666c.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!ooc.m18737c(context, ((axl) next).f2660a));
                axl axlVar2 = (axl) next;
                awx awxVar = axlVar2 != null ? axlVar2.f2662c : null;
                if (awxVar != null) {
                    axlVar.m2086a(awxVar);
                }
            } else {
                IBinder iBinderM1666a = WearableControllerProvider.m1666a((Activity) context);
                if (iBinderM1666a != null) {
                    ((axj) axeVar).m2085b(iBinderM1666a, (Activity) context);
                } else {
                    ((Activity) context).getWindow().getDecorView().addOnAttachStateChangeListener(new axi((axj) axeVar, (Activity) context));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.axa
    /* JADX INFO: renamed from: b */
    public final void mo2079b(aea aeaVar) {
        IBinder iBinderM1666a;
        SidecarInterface sidecarInterface;
        synchronized (f2665b) {
            if (this.f2667d == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (axl axlVar : this.f2666c) {
                if (axlVar.f2661b == aeaVar) {
                    axlVar.getClass();
                    arrayList.add(axlVar);
                }
            }
            this.f2666c.removeAll(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Activity activity = ((axl) it.next()).f2660a;
                CopyOnWriteArrayList copyOnWriteArrayList = this.f2666c;
                if (!copyOnWriteArrayList.isEmpty()) {
                    Iterator it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (ooc.m18737c(((axl) it2.next()).f2660a, activity)) {
                            }
                        }
                    }
                }
                axe axeVar = this.f2667d;
                if (axeVar != null && (iBinderM1666a = WearableControllerProvider.m1666a(activity)) != null) {
                    SidecarInterface sidecarInterface2 = ((axj) axeVar).f2654a;
                    if (sidecarInterface2 != null) {
                        sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderM1666a);
                    }
                    aea aeaVar2 = (aea) ((axj) axeVar).f2657d.get(activity);
                    if (aeaVar2 != null) {
                        if (activity instanceof aca) {
                            ((aca) activity).mo177f(aeaVar2);
                        }
                        ((axj) axeVar).f2657d.remove(activity);
                    }
                    axh axhVar = ((axj) axeVar).f2658e;
                    if (axhVar != null) {
                        ReentrantLock reentrantLock = axhVar.f2649a;
                        reentrantLock.lock();
                        try {
                            axhVar.f2650b.put(activity, null);
                            reentrantLock.unlock();
                        } catch (Throwable th) {
                            reentrantLock.unlock();
                            throw th;
                        }
                    }
                    int size = ((axj) axeVar).f2656c.size();
                    ((axj) axeVar).f2656c.remove(iBinderM1666a);
                    if (size == 1 && (sidecarInterface = ((axj) axeVar).f2654a) != null) {
                        sidecarInterface.onDeviceStateListenersChanged(true);
                    }
                }
            }
        }
    }
}
