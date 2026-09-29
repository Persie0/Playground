package p000;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.transition.R$id;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class gg3 extends cg3 {
    @Override // p000.cg3
    /* JADX INFO: renamed from: a */
    public final void mo369a(View view, Object obj) {
        ((daa) obj).mo10204c(view);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: b */
    public final void mo370b(Object obj, ArrayList arrayList) {
        daa daaVar = (daa) obj;
        if (daaVar == null) {
            return;
        }
        int i = 0;
        if (daaVar instanceof raa) {
            raa raaVar = (raa) daaVar;
            int size = raaVar.f58989e0.size();
            while (i < size) {
                mo370b(raaVar.m20495X(i), arrayList);
                i++;
            }
            return;
        }
        if (cg3.m4635i(daaVar.f35333e) && cg3.m4635i(daaVar.f35335g) && cg3.m4635i(daaVar.f35336h) && cg3.m4635i(daaVar.f35334f)) {
            int size2 = arrayList.size();
            while (i < size2) {
                daaVar.mo10204c((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: c */
    public final void mo4636c(Object obj) {
        y9a y9aVar = (y9a) obj;
        y9aVar.m24996h();
        y9aVar.f69519d.m25117a(y9aVar.f69522g.f35326X + 1);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: d */
    public final void mo4637d(Object obj, RunnableC0806bd runnableC0806bd) {
        y9a y9aVar = (y9a) obj;
        y9aVar.f69521f = runnableC0806bd;
        y9aVar.m24996h();
        y9aVar.f69519d.m25117a(0.0f);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: e */
    public final void mo371e(ViewGroup viewGroup, Object obj) {
        oaa.m17884a(viewGroup, (daa) obj);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: f */
    public final boolean mo372f(Object obj) {
        return obj instanceof daa;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: g */
    public final Object mo373g(Object obj) {
        if (obj != null) {
            return ((daa) obj).clone();
        }
        return null;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: h */
    public final Object mo4638h(ViewGroup viewGroup, Object obj) {
        daa daaVar = (daa) obj;
        ArrayList arrayList = oaa.f54112c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut() && Build.VERSION.SDK_INT >= 34) {
            if (daaVar.mo3530B()) {
                arrayList.add(viewGroup);
                daa daaVarClone = daaVar.clone();
                raa raaVar = new raa();
                raaVar.m20494W(daaVarClone);
                oaa.m17886c(viewGroup, raaVar);
                viewGroup.setTag(R$id.transition_current_scene, null);
                naa naaVar = new naa();
                naaVar.f52544a = raaVar;
                naaVar.f52545b = viewGroup;
                viewGroup.addOnAttachStateChangeListener(naaVar);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(naaVar);
                viewGroup.invalidate();
                y9a y9aVar = new y9a(raaVar);
                raaVar.f35327Y = y9aVar;
                raaVar.m10202a(y9aVar);
                return raaVar.f35327Y;
            }
            C3386nv.m17626m("The Transition must support seeking.");
        }
        return null;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: j */
    public final boolean mo374j() {
        return true;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: k */
    public final boolean mo375k(Object obj) {
        boolean zMo3530B = ((daa) obj).mo3530B();
        if (!zMo3530B) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zMo3530B;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: l */
    public final Object mo376l(Object obj, Object obj2) {
        daa daaVar = (daa) obj;
        daa daaVar2 = (daa) obj2;
        if (daaVar == null || daaVar2 == null) {
            if (daaVar != null) {
                return daaVar;
            }
            if (daaVar2 != null) {
                return daaVar2;
            }
            return null;
        }
        raa raaVar = new raa();
        raaVar.m20494W(daaVar);
        raaVar.m20494W(daaVar2);
        raaVar.m20498b0(1);
        return raaVar;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: m */
    public final Object mo377m(Object obj, Object obj2) {
        raa raaVar = new raa();
        if (obj != null) {
            raaVar.m20494W((daa) obj);
        }
        raaVar.m20494W((daa) obj2);
        return raaVar;
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: n */
    public final void mo378n(Object obj, View view, ArrayList arrayList) {
        ((daa) obj).m10202a(new dg3(view, arrayList));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: o */
    public final void mo379o(Object obj, Object obj2, ArrayList arrayList) {
        ((daa) obj).m10202a(new eg3(this, obj2, arrayList));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: p */
    public final void mo4639p(Object obj, float f) {
        y9a y9aVar = (y9a) obj;
        boolean z = y9aVar.f69517b;
        if (z) {
            raa raaVar = y9aVar.f69522g;
            long j = raaVar.f35326X;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (y9aVar.f69519d != null) {
                C3386nv.m17633t("setCurrentPlayTimeMillis() called after animation has been started");
                return;
            }
            long j3 = y9aVar.f69516a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!y9aVar.f69518c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    raaVar.mo10193N(j2, j3);
                    y9aVar.f69516a = j2;
                }
            }
            y9aVar.f69520e.m16223a(j2, AnimationUtils.currentAnimationTimeMillis());
        }
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: q */
    public final void mo380q(Object obj) {
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: r */
    public final void mo381r(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, Object obj, um0 um0Var, Runnable runnable) {
        mo4640s(obj, um0Var, null, runnable);
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: s */
    public final void mo4640s(Object obj, um0 um0Var, RunnableC0002a0 runnableC0002a0, Runnable runnable) {
        daa daaVar = (daa) obj;
        ar1 ar1Var = new ar1(runnableC0002a0, daaVar, runnable, 2);
        synchronized (um0Var) {
            while (um0Var.f64058c) {
                try {
                    try {
                        um0Var.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (um0Var.f64057b != ar1Var) {
                um0Var.f64057b = ar1Var;
                if (um0Var.f64056a) {
                    Runnable runnable2 = (Runnable) ar1Var.f7379b;
                    daa daaVar2 = (daa) ar1Var.f7380c;
                    Runnable runnable3 = (Runnable) ar1Var.f7381d;
                    if (runnable2 == null) {
                        daaVar2.cancel();
                        runnable3.run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        daaVar.m10202a(new fg3(runnable));
    }

    @Override // p000.cg3
    /* JADX INFO: renamed from: t */
    public final void mo382t(ArrayList arrayList, ArrayList arrayList2) {
    }

    /* JADX INFO: renamed from: u */
    public final void m12581u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        daa daaVar = (daa) obj;
        int i = 0;
        if (daaVar instanceof raa) {
            raa raaVar = (raa) daaVar;
            int size = raaVar.f58989e0.size();
            while (i < size) {
                m12581u(raaVar.m20495X(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (cg3.m4635i(daaVar.f35333e) && cg3.m4635i(daaVar.f35335g) && cg3.m4635i(daaVar.f35336h)) {
            ArrayList arrayList3 = daaVar.f35334f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    daaVar.mo10204c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    daaVar.mo10190K((View) arrayList.get(size3));
                }
            }
        }
    }
}
