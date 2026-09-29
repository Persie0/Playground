package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class rs5 extends hwa {

    /* JADX INFO: renamed from: g0 */
    public final iwa f59761g0;

    /* JADX INFO: renamed from: h0 */
    public final iwa f59762h0;

    /* JADX INFO: renamed from: i0 */
    public final ArrayList f59763i0 = new ArrayList();

    public rs5(iwa iwaVar, iwa iwaVar2) {
        this.f59761g0 = iwaVar;
        this.f59762h0 = iwaVar2;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m20767c0(ArrayList arrayList, iwa iwaVar, ViewGroup viewGroup, View view, boolean z) {
        if (iwaVar == null) {
            return;
        }
        Animator animatorMo11003b = z ? iwaVar.mo11003b(view, viewGroup) : iwaVar.mo11002a(view, viewGroup);
        if (animatorMo11003b != null) {
            arrayList.add(animatorMo11003b);
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: Y */
    public final Animator mo3531Y(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        return m20768d0(viewGroup, view, true);
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: a0 */
    public final Animator mo3532a0(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        return m20768d0(viewGroup, view, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final AnimatorSet m20768d0(ViewGroup viewGroup, View view, boolean z) {
        int iM20364G;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        m20767c0(arrayList, this.f59761g0, viewGroup, view, z);
        m20767c0(arrayList, this.f59762h0, viewGroup, view, z);
        Iterator it = this.f59763i0.iterator();
        while (it.hasNext()) {
            m20767c0(arrayList, (iwa) it.next(), viewGroup, view, z);
        }
        Context context = viewGroup.getContext();
        int iMo4159f0 = mo4159f0(z);
        int i = vaa.f65153a;
        if (iMo4159f0 != 0 && this.f35331c == -1 && (iM20364G = r46.m20364G(context, iMo4159f0, -1)) != -1) {
            this.f35331c = iM20364G;
        }
        int iMo4160g0 = mo4160g0(z);
        TimeInterpolator timeInterpolatorMo4158e0 = mo4158e0();
        if (iMo4160g0 != 0 && this.f35332d == null) {
            this.f35332d = r46.m20365H(context, iMo4160g0, timeInterpolatorMo4158e0);
        }
        ci8.m4701N(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: e0 */
    public TimeInterpolator mo4158e0() {
        return AbstractC0853cn.f10297b;
    }

    /* JADX INFO: renamed from: f0 */
    public abstract int mo4159f0(boolean z);

    /* JADX INFO: renamed from: g0 */
    public abstract int mo4160g0(boolean z);
}
