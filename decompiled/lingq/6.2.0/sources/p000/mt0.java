package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class mt0 extends daa {

    /* JADX INFO: renamed from: e0 */
    public static final String[] f51818e0 = {"android:clipBounds:clip"};

    /* JADX INFO: renamed from: f0 */
    public static final Rect f51819f0 = new Rect();

    /* JADX INFO: renamed from: W */
    public static void m17033W(waa waaVar, boolean z) {
        View view = waaVar.f66571b;
        HashMap map = waaVar.f66570a;
        if (view.getVisibility() == 8) {
            return;
        }
        Rect clipBounds = z ? (Rect) view.getTag(R$id.transition_clip) : null;
        if (clipBounds == null) {
            clipBounds = view.getClipBounds();
        }
        Rect rect = clipBounds != f51819f0 ? clipBounds : null;
        map.put("android:clipBounds:clip", rect);
        if (rect == null) {
            map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: B */
    public final boolean mo3530B() {
        return true;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: g */
    public final void mo3042g(waa waaVar) {
        m17033W(waaVar, false);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: j */
    public final void mo3043j(waa waaVar) {
        m17033W(waaVar, true);
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: o */
    public final Animator mo3044o(ViewGroup viewGroup, waa waaVar, waa waaVar2) {
        if (waaVar == null) {
            return null;
        }
        HashMap map = waaVar.f66570a;
        if (waaVar2 == null) {
            return null;
        }
        View view = waaVar2.f66571b;
        HashMap map2 = waaVar2.f66570a;
        if (!map.containsKey("android:clipBounds:clip") || !map2.containsKey("android:clipBounds:clip")) {
            return null;
        }
        Rect rect = (Rect) map.get("android:clipBounds:clip");
        Rect rect2 = (Rect) map2.get("android:clipBounds:clip");
        if (rect == null && rect2 == null) {
            return null;
        }
        Rect rect3 = rect == null ? (Rect) map.get("android:clipBounds:bounds") : rect;
        Rect rect4 = rect2 == null ? (Rect) map2.get("android:clipBounds:bounds") : rect2;
        if (rect3.equals(rect4)) {
            return null;
        }
        view.setClipBounds(rect);
        Rect rect5 = new Rect();
        f28 f28Var = new f28();
        f28Var.f38311a = rect5;
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, awa.f7628b, f28Var, rect3, rect4);
        lt0 lt0Var = new lt0(view, rect, rect2);
        objectAnimatorOfObject.addListener(lt0Var);
        m10202a(lt0Var);
        return objectAnimatorOfObject;
    }

    @Override // p000.daa
    /* JADX INFO: renamed from: y */
    public final String[] mo3045y() {
        return f51818e0;
    }
}
