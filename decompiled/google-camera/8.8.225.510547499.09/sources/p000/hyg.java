package p000;

import android.app.Activity;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.ArraySet;
import androidx.wear.ambient.AmbientModeSupport;
import androidx.wear.ambient.WearableControllerProvider;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyg implements hyf {

    /* JADX INFO: renamed from: b */
    public final Activity f29910b;

    /* JADX INFO: renamed from: d */
    private final jvd f29912d;

    /* JADX INFO: renamed from: e */
    private final awm f29913e;

    /* JADX INFO: renamed from: f */
    private aea f29914f;

    /* JADX INFO: renamed from: a */
    public final Set f29909a = new ArraySet();

    /* JADX INFO: renamed from: c */
    public final jww f29911c = new jwf(jiy.m13267ab());

    public hyg(Activity activity, fba fbaVar, jvd jvdVar) {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        this.f29910b = activity;
        this.f29912d = jvdVar;
        int i = awr.f2610a;
        activity.getClass();
        axa axaVar = (axa) aws.f2611a.mo18586a();
        if (axaVar == null) {
            if (axm.f2664a == null) {
                ReentrantLock reentrantLock = axm.f2665b;
                reentrantLock.lock();
                try {
                    if (axm.f2664a == null) {
                        axj axjVar = null;
                        try {
                            awh awhVarM1667b = WearableControllerProvider.m1667b();
                            if (awhVarM1667b != null && awhVarM1667b.compareTo(awh.f2580a) >= 0) {
                                axj axjVar2 = new axj(activity);
                                SidecarInterface sidecarInterface = axjVar2.f2654a;
                                Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
                                Class<?> returnType = method != null ? method.getReturnType() : null;
                                if (!ooc.m18737c(returnType, Void.TYPE)) {
                                    throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
                                }
                                SidecarInterface sidecarInterface2 = axjVar2.f2654a;
                                if (sidecarInterface2 != null) {
                                    sidecarInterface2.getDeviceState();
                                }
                                SidecarInterface sidecarInterface3 = axjVar2.f2654a;
                                if (sidecarInterface3 != null) {
                                    sidecarInterface3.onDeviceStateListenersChanged(true);
                                }
                                SidecarInterface sidecarInterface4 = axjVar2.f2654a;
                                Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod(hsSUWRJfoeC.bXTrttOqcJB, IBinder.class);
                                Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
                                if (!ooc.m18737c(returnType2, SidecarWindowLayoutInfo.class)) {
                                    throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
                                }
                                SidecarInterface sidecarInterface5 = axjVar2.f2654a;
                                Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
                                Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
                                if (!ooc.m18737c(returnType3, Void.TYPE)) {
                                    throw new NoSuchMethodException(WIxTIdUIdfb.lRzR + returnType3);
                                }
                                SidecarInterface sidecarInterface6 = axjVar2.f2654a;
                                Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
                                Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
                                if (!ooc.m18737c(returnType4, Void.TYPE)) {
                                    throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                                }
                                SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                                try {
                                    sidecarDeviceState.posture = 3;
                                } catch (NoSuchFieldError e) {
                                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
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
                                } catch (NoSuchFieldError e2) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(sidecarDisplayFeature);
                                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                                    Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]);
                                    objInvoke2.getClass();
                                    if (!ooc.m18737c(arrayList, (List) objInvoke2)) {
                                        throw new Exception("Invalid display feature getter/setter");
                                    }
                                }
                                axjVar = axjVar2;
                            }
                        } catch (Throwable th) {
                        }
                        axm.f2664a = new axm(axjVar);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            axaVar = axm.f2664a;
            axaVar.getClass();
        }
        int i2 = awz.f2624a;
        this.f29913e = new awm(new aww(axaVar));
        fdh.m8265e(jvdVar, fbaVar, this);
    }

    @Override // p000.hyf
    /* JADX INFO: renamed from: a */
    public final kba mo10867a(AmbientModeSupport.AmbientController ambientController) {
        this.f29909a.add(ambientController);
        return new gto(this, ambientController, 17, null, null, null);
    }

    @Override // p000.fbn
    /* JADX INFO: renamed from: bG */
    public final void mo3524bG() {
        C0078bx c0078bx = new C0078bx(this, 8);
        this.f29914f = c0078bx;
        awm awmVar = this.f29913e;
        Activity activity = this.f29910b;
        jvd jvdVar = this.f29912d;
        activity.getClass();
        jvdVar.getClass();
        c0078bx.getClass();
        our ourVarM18782T = ook.m18782T(new awv((aww) awmVar.f2595a, activity, null));
        ReentrantLock reentrantLock = awmVar.f2596b;
        reentrantLock.lock();
        try {
            if (awmVar.f2597c.get(c0078bx) == null) {
                awmVar.f2597c.put(c0078bx, ooc.m18746l(oqv.m18925f(oqv.m18931l(jvdVar)), null, new awl(ourVarM18782T, c0078bx, null), 3));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.fbo
    /* JADX INFO: renamed from: e */
    public final void mo3525e() {
        aea aeaVar = this.f29914f;
        if (aeaVar != null) {
            awm awmVar = this.f29913e;
            ReentrantLock reentrantLock = awmVar.f2596b;
            reentrantLock.lock();
            try {
                ory oryVar = (ory) awmVar.f2597c.get(aeaVar);
                if (oryVar != null) {
                    oryVar.mo18977r(null);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
