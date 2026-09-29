package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9414i extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public boolean f48334a;

    /* JADX INFO: renamed from: b */
    public final Matrix f48335b = new Matrix();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f48336c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Matrix f48337d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f48338e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C9412h.e f48339f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C9412h.d f48340g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C9412h f48341h;

    public C9414i(C9412h c9412h, boolean z10, Matrix matrix, View view, C9412h.e eVar, C9412h.d dVar) {
        this.f48341h = c9412h;
        this.f48336c = z10;
        this.f48337d = matrix;
        this.f48338e = view;
        this.f48339f = eVar;
        this.f48340g = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f48334a = true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z10 = this.f48334a;
        C9412h.e eVar = this.f48339f;
        View view = this.f48338e;
        if (!z10) {
            if (this.f48336c && this.f48341h.f48315Y) {
                Matrix matrix = this.f48335b;
                matrix.set(this.f48337d);
                view.setTag(R.id.transition_transform, matrix);
                eVar.getClass();
                String[] strArr = C9412h.f48311b0;
                view.setTranslationX(eVar.f48325a);
                view.setTranslationY(eVar.f48326b);
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10029b0.i.m18729w(view, eVar.f48327c);
                view.setScaleX(eVar.f48328d);
                view.setScaleY(eVar.f48329e);
                view.setRotationX(eVar.f48330f);
                view.setRotationY(eVar.f48331g);
                view.setRotation(eVar.f48332h);
            } else {
                view.setTag(R.id.transition_transform, null);
                view.setTag(R.id.parent_matrix, null);
            }
        }
        C9433r0.f48403a.mo17835G(view, null);
        eVar.getClass();
        String[] strArr2 = C9412h.f48311b0;
        view.setTranslationX(eVar.f48325a);
        view.setTranslationY(eVar.f48326b);
        WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
        C10029b0.i.m18729w(view, eVar.f48327c);
        view.setScaleX(eVar.f48328d);
        view.setScaleY(eVar.f48329e);
        view.setRotationX(eVar.f48330f);
        view.setRotationY(eVar.f48331g);
        view.setRotation(eVar.f48332h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = this.f48340g.f48320a;
        Matrix matrix2 = this.f48335b;
        matrix2.set(matrix);
        View view = this.f48338e;
        view.setTag(R.id.transition_transform, matrix2);
        C9412h.e eVar = this.f48339f;
        eVar.getClass();
        String[] strArr = C9412h.f48311b0;
        view.setTranslationX(eVar.f48325a);
        view.setTranslationY(eVar.f48326b);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18729w(view, eVar.f48327c);
        view.setScaleX(eVar.f48328d);
        view.setScaleY(eVar.f48329e);
        view.setRotationX(eVar.f48330f);
        view.setRotationY(eVar.f48331g);
        view.setRotation(eVar.f48332h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.f48338e;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18729w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
