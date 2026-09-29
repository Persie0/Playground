package p000;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final class ba9 extends hwa {

    /* JADX INFO: renamed from: h0 */
    public static final DecelerateInterpolator f8230h0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: i0 */
    public static final AccelerateInterpolator f8231i0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: j0 */
    public static final y99 f8232j0 = new y99(0);

    /* JADX INFO: renamed from: k0 */
    public static final y99 f8233k0 = new y99(1);

    /* JADX INFO: renamed from: l0 */
    public static final z99 f8234l0 = new z99(0);

    /* JADX INFO: renamed from: m0 */
    public static final y99 f8235m0 = new y99(2);

    /* JADX INFO: renamed from: n0 */
    public static final y99 f8236n0 = new y99(3);

    /* JADX INFO: renamed from: o0 */
    public static final z99 f8237o0 = new z99(1);

    /* JADX INFO: renamed from: g0 */
    public aa9 f8238g0;

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: Y */
    public final Animator mo3531Y(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        if (waaVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) waaVar2.f66570a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return r8d.m20448a(view, waaVar2, iArr[0], iArr[1], this.f8238g0.mo215a(view, viewGroup), this.f8238g0.mo216b(view, viewGroup), translationX, translationY, f8230h0, this);
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: a0 */
    public final Animator mo3532a0(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        if (waaVar == null) {
            return null;
        }
        int[] iArr = (int[]) waaVar.f66570a.get("android:slide:screenPosition");
        return r8d.m20448a(view, waaVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f8238g0.mo215a(view, viewGroup), this.f8238g0.mo216b(view, viewGroup), f8231i0, this);
    }

    @Override // p000.hwa, p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        hwa.m13543W(waaVar);
        int[] iArr = new int[2];
        waaVar.f66571b.getLocationOnScreen(iArr);
        waaVar.f66570a.put("android:slide:screenPosition", iArr);
    }

    @Override // p000.hwa, p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        hwa.m13543W(waaVar);
        int[] iArr = new int[2];
        waaVar.f66571b.getLocationOnScreen(iArr);
        waaVar.f66570a.put("android:slide:screenPosition", iArr);
    }
}
