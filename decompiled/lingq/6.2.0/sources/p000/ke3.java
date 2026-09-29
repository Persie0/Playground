package p000;

import android.util.Log;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class ke3 implements ie3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0638f f47090a;

    public ke3(AbstractC0638f abstractC0638f) {
        this.f47090a = abstractC0638f;
    }

    @Override // p000.ie3
    /* JADX INFO: renamed from: a */
    public final boolean mo2126a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean zM2151X;
        AbstractC0638f abstractC0638f = this.f47090a;
        ArrayList<se3> arrayList5 = abstractC0638f.f5754o;
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + abstractC0638f.f5740a);
        }
        if (abstractC0638f.f5743d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zM2151X = false;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
        } else {
            g70 g70Var = (g70) AbstractC3393o1.m17731f(1, abstractC0638f.f5743d);
            abstractC0638f.f5747h = g70Var;
            Iterator it = g70Var.f40287a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = ((vf3) it.next()).f65305b;
                if (abstractComponentCallbacksC0635c != null) {
                    abstractComponentCallbacksC0635c.f5666H = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            zM2151X = abstractC0638f.m2151X(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            boolean zBooleanValue = ((Boolean) arrayList4.get(arrayList3.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(AbstractC0638f.m2127G((g70) it2.next()));
            }
            for (se3 se3Var : arrayList5) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    se3Var.m21307b((AbstractComponentCallbacksC0635c) it3.next(), zBooleanValue);
                }
            }
        }
        return zM2151X;
    }
}
