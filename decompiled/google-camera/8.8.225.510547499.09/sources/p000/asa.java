package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class asa extends AbstractC0127df {
    /* JADX INFO: renamed from: t */
    private static boolean m1909t(asf asfVar) {
        return (m6044r(asfVar.f2230c) && m6044r(null) && m6044r(null)) ? false : true;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: a */
    public final Object mo1910a(Object obj) {
        if (obj != null) {
            return ((asf) obj).clone();
        }
        return null;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: b */
    public final Object mo1911b(Object obj, Object obj2, Object obj3) {
        asf asfVar = (asf) obj;
        asf asfVar2 = (asf) obj2;
        asf asfVar3 = (asf) obj3;
        if (asfVar != null && asfVar2 != null) {
            asm asmVar = new asm();
            asmVar.m1960H(asfVar);
            asmVar.m1960H(asfVar2);
            asmVar.m1961I();
            asfVar = asmVar;
        } else if (asfVar == null) {
            asfVar = asfVar2 != null ? asfVar2 : null;
        }
        if (asfVar3 == null) {
            return asfVar;
        }
        asm asmVar2 = new asm();
        if (asfVar != null) {
            asmVar2.m1960H(asfVar);
        }
        asmVar2.m1960H(asfVar3);
        return asmVar2;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: c */
    public final Object mo1912c(Object obj) {
        if (obj == null) {
            return null;
        }
        asm asmVar = new asm();
        asmVar.m1960H((asf) obj);
        return asmVar;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: d */
    public final void mo1913d(Object obj, View view) {
        ((asf) obj).mo1954x(view);
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: e */
    public final void mo1914e(Object obj, ArrayList arrayList) {
        asf asfVar = (asf) obj;
        if (asfVar == null) {
            return;
        }
        int i = 0;
        if (asfVar instanceof asm) {
            asm asmVar = (asm) asfVar;
            int iM1962e = asmVar.m1962e();
            while (i < iM1962e) {
                mo1914e(asmVar.m1963f(i), arrayList);
                i++;
            }
            return;
        }
        if (m1909t(asfVar) || !m6044r(asfVar.f2231d)) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            asfVar.mo1954x((View) arrayList.get(i));
            i++;
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: f */
    public final void mo1915f(ViewGroup viewGroup, Object obj) {
        asf asfVar = (asf) obj;
        if (asj.f2251a.contains(viewGroup) || !afe.m462f(viewGroup)) {
            return;
        }
        asj.f2251a.add(viewGroup);
        asf asfVarClone = asfVar.clone();
        ArrayList arrayList = (ArrayList) asj.m1958a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((asf) arrayList.get(i)).mo1947q(viewGroup);
            }
        }
        if (asfVarClone != null) {
            asfVarClone.m1944n(viewGroup, true);
        }
        if (((asb) viewGroup.getTag(C0100R.id.transition_current_scene)) != null) {
            throw null;
        }
        viewGroup.setTag(C0100R.id.transition_current_scene, null);
        if (asfVarClone == null || viewGroup == null) {
            return;
        }
        asi asiVar = new asi(asfVarClone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(asiVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(asiVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m1916g(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        asf asfVar = (asf) obj;
        int i = 0;
        if (asfVar instanceof asm) {
            asm asmVar = (asm) asfVar;
            int iM1962e = asmVar.m1962e();
            while (i < iM1962e) {
                m1916g(asmVar.m1963f(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m1909t(asfVar)) {
            return;
        }
        ArrayList arrayList3 = asfVar.f2231d;
        if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                asfVar.mo1954x((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                asfVar.mo1956z((View) arrayList.get(size2));
            }
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: h */
    public final void mo1917h(Object obj, View view, ArrayList arrayList) {
        ((asf) obj).m1953w(new arw(view, arrayList));
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: i */
    public final void mo1918i(Object obj, Rect rect) {
        ((asf) obj).mo1936F(new asn());
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: j */
    public final void mo1919j(Object obj, View view) {
        if (view != null) {
            m6045s(view, new Rect());
            ((asf) obj).mo1936F(new asn());
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: k */
    public final void mo1920k(Object obj, View view, ArrayList arrayList) {
        asm asmVar = (asm) obj;
        ArrayList arrayList2 = asmVar.f2231d;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            m6043q(arrayList2, (View) arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo1914e(asmVar, arrayList);
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: l */
    public final void mo1921l(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        asm asmVar = (asm) obj;
        if (asmVar != null) {
            asmVar.f2231d.clear();
            asmVar.f2231d.addAll(arrayList2);
            m1916g(asmVar, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: m */
    public final boolean mo1922m(Object obj) {
        return obj instanceof asf;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: n */
    public final Object mo1923n(Object obj, Object obj2) {
        asm asmVar = new asm();
        if (obj != null) {
            asmVar.m1960H((asf) obj);
        }
        asmVar.m1960H((asf) obj2);
        return asmVar;
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: o */
    public final void mo1924o(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((asf) obj).m1953w(new arx(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p000.AbstractC0127df
    /* JADX INFO: renamed from: p */
    public final void mo1925p(Object obj, exz exzVar, Runnable runnable) {
        asf asfVar = (asf) obj;
        exzVar.m8036a(new ary(asfVar, 0));
        asfVar.m1953w(new arz(runnable));
    }
}
