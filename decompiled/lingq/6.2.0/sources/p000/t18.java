package p000;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class t18 implements i99 {

    /* JADX INFO: renamed from: a */
    public final ImageView f61746a;

    public t18(ImageView imageView) {
        this.f61746a = imageView;
    }

    /* JADX INFO: renamed from: a */
    public static pvc m21815a(int i, int i2, int i3) {
        if (i == -2) {
            return ng2.f52701n;
        }
        int i4 = i - i3;
        if (i4 > 0) {
            return new lg2(i4);
        }
        int i5 = i2 - i3;
        if (i5 > 0) {
            return new lg2(i5);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public w89 m21816b() {
        ImageView imageView = this.f61746a;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        pvc pvcVarM21815a = m21815a(layoutParams != null ? layoutParams.width : -1, imageView.getWidth(), imageView.getPaddingRight() + imageView.getPaddingLeft());
        if (pvcVarM21815a == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        pvc pvcVarM21815a2 = m21815a(layoutParams2 != null ? layoutParams2.height : -1, imageView.getHeight(), imageView.getPaddingBottom() + imageView.getPaddingTop());
        if (pvcVarM21815a2 == null) {
            return null;
        }
        return new w89(pvcVarM21815a, pvcVarM21815a2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t18) {
            return this.f61746a.equals(((t18) obj).f61746a);
        }
        return false;
    }

    @Override // p000.i99
    /* JADX INFO: renamed from: h */
    public Object mo11204h(Continuation continuation) {
        w89 w89VarM21816b = m21816b();
        if (w89VarM21816b != null) {
            return w89VarM21816b;
        }
        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(continuation));
        sm0Var.m21468u();
        ViewTreeObserver viewTreeObserver = this.f61746a.getViewTreeObserver();
        bva bvaVar = new bva(this, viewTreeObserver, sm0Var);
        viewTreeObserver.addOnPreDrawListener(bvaVar);
        sm0Var.m21470w(new sb0(this, viewTreeObserver, bvaVar, 6));
        Object objM21466r = sm0Var.m21466r();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM21466r;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f61746a.hashCode() * 31);
    }
}
