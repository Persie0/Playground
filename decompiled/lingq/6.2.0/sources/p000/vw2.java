package p000;

import android.animation.Animator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class vw2 extends hwa {

    /* JADX INFO: renamed from: h0 */
    public static final DecelerateInterpolator f66010h0 = new DecelerateInterpolator();

    /* JADX INFO: renamed from: i0 */
    public static final AccelerateInterpolator f66011i0 = new AccelerateInterpolator();

    /* JADX INFO: renamed from: g0 */
    public int[] f66012g0;

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: Y */
    public final Animator mo3531Y(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        int[] iArr = this.f66012g0;
        if (waaVar2 == null) {
            return null;
        }
        Rect rect = (Rect) waaVar2.f66570a.get("android:explode:screenBounds");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        m23562c0(viewGroup, rect, iArr);
        return r8d.m20448a(view, waaVar2, rect.left, rect.top, translationX + iArr[0], translationY + iArr[1], translationX, translationY, f66010h0, this);
    }

    @Override // p000.hwa
    /* JADX INFO: renamed from: a0 */
    public final Animator mo3532a0(ViewGroup viewGroup, View view, waa waaVar, waa waaVar2) {
        float f;
        float f2;
        int[] iArr = this.f66012g0;
        if (waaVar == null) {
            return null;
        }
        Rect rect = (Rect) waaVar.f66570a.get("android:explode:screenBounds");
        int i = rect.left;
        int i2 = rect.top;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr2 = (int[]) waaVar.f66571b.getTag(R$id.transition_position);
        if (iArr2 != null) {
            int i3 = iArr2[0];
            f = (i3 - rect.left) + translationX;
            int i4 = iArr2[1];
            f2 = (i4 - rect.top) + translationY;
            rect.offsetTo(i3, i4);
        } else {
            f = translationX;
            f2 = translationY;
        }
        m23562c0(viewGroup, rect, iArr);
        return r8d.m20448a(view, waaVar, i, i2, translationX, translationY, f + iArr[0], f2 + iArr[1], f66011i0, this);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m23562c0(ViewGroup viewGroup, Rect rect, int[] iArr) {
        int[] iArr2 = this.f66012g0;
        viewGroup.getLocationOnScreen(iArr2);
        int i = iArr2[0];
        int i2 = iArr2[1];
        int iRound = Math.round(viewGroup.getTranslationX()) + (viewGroup.getWidth() / 2) + i;
        int iRound2 = Math.round(viewGroup.getTranslationY()) + (viewGroup.getHeight() / 2) + i2;
        float fCenterX = rect.centerX() - iRound;
        float fCenterY = rect.centerY() - iRound2;
        if (fCenterX == 0.0f && fCenterY == 0.0f) {
            fCenterX = ((float) (Math.random() * 2.0d)) - 1.0f;
            fCenterY = ((float) (Math.random() * 2.0d)) - 1.0f;
        }
        float fSqrt = (float) Math.sqrt((fCenterY * fCenterY) + (fCenterX * fCenterX));
        int i3 = iRound - i;
        int i4 = iRound2 - i2;
        float fMax = Math.max(i3, viewGroup.getWidth() - i3);
        float fMax2 = Math.max(i4, viewGroup.getHeight() - i4);
        float fSqrt2 = (float) Math.sqrt((fMax2 * fMax2) + (fMax * fMax));
        iArr[0] = Math.round((fCenterX / fSqrt) * fSqrt2);
        iArr[1] = Math.round(fSqrt2 * (fCenterY / fSqrt));
    }

    /* JADX INFO: renamed from: d0 */
    public final void m23563d0(waa waaVar) {
        View view = waaVar.f66571b;
        int[] iArr = this.f66012g0;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        waaVar.f66570a.put("android:explode:screenBounds", new Rect(i, i2, view.getWidth() + i, view.getHeight() + i2));
    }

    @Override // p000.hwa, p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        hwa.m13543W(waaVar);
        m23563d0(waaVar);
    }

    @Override // p000.hwa, p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        hwa.m13543W(waaVar);
        m23563d0(waaVar);
    }
}
