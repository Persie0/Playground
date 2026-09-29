package p000;

import android.view.ViewGroup;
import androidx.transition.R$id;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class oaa {

    /* JADX INFO: renamed from: a */
    public static final p20 f54110a = new p20();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f54111b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f54112c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m17884a(ViewGroup viewGroup, daa daaVar) {
        ArrayList arrayList = f54112c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (daaVar == null) {
            daaVar = f54110a;
        }
        daa daaVarClone = daaVar.clone();
        m17886c(viewGroup, daaVarClone);
        viewGroup.setTag(R$id.transition_current_scene, null);
        naa naaVar = new naa();
        naaVar.f52544a = daaVarClone;
        naaVar.f52545b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(naaVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(naaVar);
    }

    /* JADX INFO: renamed from: b */
    public static C3275kv m17885b() {
        C3275kv c3275kv;
        ThreadLocal threadLocal = f54111b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c3275kv = (C3275kv) weakReference.get()) != null) {
            return c3275kv;
        }
        C3275kv c3275kv2 = new C3275kv(0);
        threadLocal.set(new WeakReference(c3275kv2));
        return c3275kv2;
    }

    /* JADX INFO: renamed from: c */
    public static void m17886c(ViewGroup viewGroup, daa daaVar) {
        ArrayList arrayList = (ArrayList) m17885b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((daa) it.next()).mo10187G(viewGroup);
            }
        }
        if (daaVar != null) {
            daaVar.m10209k(viewGroup, true);
        }
        if (viewGroup.getTag(R$id.transition_current_scene) == null) {
            return;
        }
        ho2.m13383c();
    }
}
