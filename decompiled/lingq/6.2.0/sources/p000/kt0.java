package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class kt0 extends daa {

    /* JADX INFO: renamed from: g0 */
    public static final ft0 f48397g0;

    /* JADX INFO: renamed from: h0 */
    public static final ft0 f48398h0;

    /* JADX INFO: renamed from: i0 */
    public static final ft0 f48399i0;

    /* JADX INFO: renamed from: j0 */
    public static final ft0 f48400j0;

    /* JADX INFO: renamed from: k0 */
    public static final ft0 f48401k0;

    /* JADX INFO: renamed from: e0 */
    public boolean f48403e0;

    /* JADX INFO: renamed from: f0 */
    public static final String[] f48396f0 = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: l0 */
    public static final f28 f48402l0 = new f28();

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f48397g0 = new ft0(cls, str, 0);
        String str2 = "bottomRight";
        f48398h0 = new ft0(cls, str2, 1);
        f48399i0 = new ft0(cls, str2, 2);
        f48400j0 = new ft0(cls, str, 3);
        f48401k0 = new ft0(cls, "position", 4);
    }

    /* JADX INFO: renamed from: W */
    public final void m15687W(waa waaVar) {
        View view = waaVar.f66571b;
        HashMap map = waaVar.f66570a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
        if (this.f48403e0) {
            map.put("android:changeBounds:clip", view.getClipBounds());
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        m15687W(waaVar);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        Rect rect;
        m15687W(waaVar);
        if (!this.f48403e0 || (rect = (Rect) waaVar.f66571b.getTag(R$id.transition_clip)) == null) {
            return;
        }
        waaVar.f66570a.put("android:changeBounds:clip", rect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        int i;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorM16029c;
        if (waaVar != null) {
            HashMap map = waaVar.f66570a;
            if (waaVar2 != null) {
                HashMap map2 = waaVar2.f66570a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = waaVar2.f66571b;
                    Rect rect2 = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect3 = (Rect) map2.get("android:changeBounds:bounds");
                    int i3 = rect2.left;
                    int i4 = rect3.left;
                    int i5 = rect2.top;
                    int i6 = rect3.top;
                    int i7 = rect2.right;
                    int i8 = rect3.right;
                    int i9 = rect2.bottom;
                    int i10 = rect3.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect4 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect5 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                        i = 0;
                    } else {
                        i = (i3 == i4 && i5 == i6) ? 0 : 1;
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    }
                    if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                        i++;
                    }
                    int i15 = i;
                    if (i15 <= 0) {
                        return null;
                    }
                    boolean z = this.f48403e0;
                    ft0 ft0Var = f48401k0;
                    if (z) {
                        awa.m3101b(view, i3, i5, i3 + Math.max(i11, i13), i5 + Math.max(i12, i14));
                        ObjectAnimator objectAnimatorM24662a = (i3 == i4 && i5 == i6) ? null : xsb.m24662a(view, ft0Var, this.f35325W.mo10646a(i3, i5, i4, i6));
                        boolean z2 = rect4 == null;
                        if (z2) {
                            i2 = 0;
                            rect = new Rect(0, 0, i11, i12);
                        } else {
                            i2 = 0;
                            rect = rect4;
                        }
                        int i16 = rect5 == null ? 1 : i2;
                        Rect rect6 = i16 != 0 ? new Rect(i2, i2, i13, i14) : rect5;
                        if (rect.equals(rect6)) {
                            objectAnimator = null;
                        } else {
                            view.setClipBounds(rect);
                            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", f48402l0, rect, rect6);
                            ht0 ht0Var = new ht0(view, rect, z2, rect6, i16, i3, i5, i7, i9, i4, i6, i8, i10);
                            objectAnimatorOfObject.addListener(ht0Var);
                            m10202a(ht0Var);
                            objectAnimator = objectAnimatorOfObject;
                        }
                        animatorM16029c = l8d.m16029c(objectAnimatorM24662a, objectAnimator);
                    } else {
                        awa.m3101b(view, i3, i5, i7, i9);
                        if (i15 != 2) {
                            animatorM16029c = (i3 == i4 && i5 == i6) ? xsb.m24662a(view, f48399i0, this.f35325W.mo10646a(i7, i9, i8, i10)) : xsb.m24662a(view, f48400j0, this.f35325W.mo10646a(i3, i5, i4, i6));
                        } else if (i11 == i13 && i12 == i14) {
                            animatorM16029c = xsb.m24662a(view, ft0Var, this.f35325W.mo10646a(i3, i5, i4, i6));
                        } else {
                            jt0 jt0Var = new jt0(view);
                            ObjectAnimator objectAnimatorM24662a2 = xsb.m24662a(jt0Var, f48397g0, this.f35325W.mo10646a(i3, i5, i4, i6));
                            ObjectAnimator objectAnimatorM24662a3 = xsb.m24662a(jt0Var, f48398h0, this.f35325W.mo10646a(i7, i9, i8, i10));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorM24662a2, objectAnimatorM24662a3);
                            animatorSet.addListener(new gt0(jt0Var));
                            animatorM16029c = animatorSet;
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        uad.m22664b(viewGroup4);
                        m10218w().m10202a(new it0(viewGroup4));
                    }
                    return animatorM16029c;
                }
            }
        }
        return null;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public final String[] mo3045y() {
        return f48396f0;
    }
}
