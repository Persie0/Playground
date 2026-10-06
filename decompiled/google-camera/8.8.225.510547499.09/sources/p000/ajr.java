package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajr {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f565a = 0;

    /* JADX INFO: renamed from: b */
    private static final ajq f566b = ajq.f562a;

    /* JADX INFO: renamed from: a */
    public static final void m839a(ComponentCallbacksC0077bw componentCallbacksC0077bw, String str) {
        componentCallbacksC0077bw.getClass();
        ajo ajoVar = new ajo(componentCallbacksC0077bw, str);
        m842d(ajoVar);
        ajq ajqVarM840b = m840b(componentCallbacksC0077bw);
        if (ajqVarM840b.f563b.contains(ajp.DETECT_FRAGMENT_REUSE) && m843e(ajqVarM840b, componentCallbacksC0077bw.getClass(), ajoVar.getClass())) {
            m841c(ajqVarM840b, ajoVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ajq m840b(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        while (componentCallbacksC0077bw != null) {
            if (componentCallbacksC0077bw.isAdded()) {
                componentCallbacksC0077bw.getParentFragmentManager();
            }
            componentCallbacksC0077bw = componentCallbacksC0077bw.f4574B;
        }
        return f566b;
    }

    /* JADX INFO: renamed from: c */
    public static final void m841c(ajq ajqVar, akb akbVar) {
        ComponentCallbacksC0077bw componentCallbacksC0077bw = akbVar.f581a;
        String name = componentCallbacksC0077bw.getClass().getName();
        ajqVar.f563b.contains(ajp.PENALTY_LOG);
        if (ajqVar.f563b.contains(ajp.PENALTY_DEATH)) {
            RunnableC0058bd runnableC0058bd = new RunnableC0058bd(name, akbVar, 12);
            if (!componentCallbacksC0077bw.isAdded()) {
                runnableC0058bd.run();
                return;
            }
            Handler handler = componentCallbacksC0077bw.getParentFragmentManager().f8789i.f5400d;
            if (ooc.m18737c(handler.getLooper(), Looper.myLooper())) {
                runnableC0058bd.run();
            } else {
                handler.post(runnableC0058bd);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m842d(akb akbVar) {
        if (C0111cq.m5275S(3)) {
            akbVar.f581a.getClass().getName();
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m843e(ajq ajqVar, Class cls, Class cls2) {
        Set set = (Set) ajqVar.f564c.get(cls.getName());
        if (set == null) {
            return true;
        }
        return (ooc.m18737c(cls2.getSuperclass(), akb.class) || !omn.m18676P(set, cls2.getSuperclass())) && !set.contains(cls2);
    }
}
