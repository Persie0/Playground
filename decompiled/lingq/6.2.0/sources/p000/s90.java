package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s90 {

    /* JADX INFO: renamed from: a */
    public final Context f60546a;

    /* JADX INFO: renamed from: b */
    public final ExtendedFloatingActionButton f60547b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f60548c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final vj6 f60549d;

    /* JADX INFO: renamed from: e */
    public s36 f60550e;

    /* JADX INFO: renamed from: f */
    public s36 f60551f;

    public s90(ExtendedFloatingActionButton extendedFloatingActionButton, vj6 vj6Var) {
        this.f60547b = extendedFloatingActionButton;
        this.f60546a = extendedFloatingActionButton.getContext();
        this.f60549d = vj6Var;
    }

    /* JADX INFO: renamed from: a */
    public AnimatorSet mo12951a() {
        s36 s36Var = this.f60551f;
        if (s36Var == null) {
            if (this.f60550e == null) {
                this.f60550e = s36.m21048b(this.f60546a, mo12952c());
            }
            s36Var = this.f60550e;
            s36Var.getClass();
        }
        return m21162b(s36Var);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m21162b(s36 s36Var) {
        ArrayList arrayList = new ArrayList();
        boolean zM21052f = s36Var.m21052f("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f60547b;
        if (zM21052f) {
            arrayList.add(s36Var.m21050d("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (s36Var.m21052f("scale")) {
            arrayList.add(s36Var.m21050d("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(s36Var.m21050d("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (s36Var.m21052f("width")) {
            arrayList.add(s36Var.m21050d("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f12954H0));
        }
        if (s36Var.m21052f("height")) {
            arrayList.add(s36Var.m21050d("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f12955I0));
        }
        if (s36Var.m21052f("paddingStart")) {
            arrayList.add(s36Var.m21050d("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f12956J0));
        }
        if (s36Var.m21052f("paddingEnd")) {
            arrayList.add(s36Var.m21050d("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f12957K0));
        }
        if (s36Var.m21052f("labelOpacity")) {
            arrayList.add(s36Var.m21050d("labelOpacity", extendedFloatingActionButton, new r90(Float.class, "LABEL_OPACITY_PROPERTY", 0)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ci8.m4701N(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public abstract int mo12952c();

    /* JADX INFO: renamed from: d */
    public void mo13547d() {
        this.f60549d.f65506b = null;
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo12953e();

    /* JADX INFO: renamed from: f */
    public abstract void mo12954f(Animator animator);

    /* JADX INFO: renamed from: g */
    public abstract void mo12955g();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo12956h();
}
