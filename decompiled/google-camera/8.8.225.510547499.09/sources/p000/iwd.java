package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.clockwork.common.wearable.wearmaterial.button.ContentChangeTransition;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearSnapshot;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iwd extends Transition {

    /* JADX INFO: renamed from: a */
    private static final String f32459a;

    /* JADX INFO: renamed from: b */
    private static final String f32460b;

    /* JADX INFO: renamed from: c */
    private static final Property f32461c;

    static {
        String name = iwd.class.getName();
        f32459a = name;
        f32460b = String.valueOf(name).concat(":snapshot");
        f32461c = new iwb();
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        ContentChangeTransition.m4580b(transitionValues);
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        BitmapDrawable bitmapDrawable;
        ContentChangeTransition.m4580b(transitionValues);
        View view = transitionValues.view;
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (rect.isEmpty() || view.getVisibility() != 0) {
            bitmapDrawable = null;
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
            view.draw(new Canvas(bitmapCreateBitmap));
            bitmapDrawable = new BitmapDrawable(view.getResources(), bitmapCreateBitmap);
            bitmapDrawable.setBounds(rect);
        }
        WearSnapshot wearSnapshot = bitmapDrawable != null ? new WearSnapshot(bitmapDrawable, view) : null;
        if (wearSnapshot != null) {
            transitionValues.values.put(f32460b, wearSnapshot);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        WearSnapshot wearSnapshot = (WearSnapshot) transitionValues.values.remove(f32460b);
        if (wearSnapshot == null) {
            return null;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(wearSnapshot, (Property<WearSnapshot, Integer>) f32461c, 25);
        objectAnimatorOfInt.addListener(new iwc(wearSnapshot));
        objectAnimatorOfInt.addListener(new iwe(transitionValues.view));
        addListener(new iwg(transitionValues.view));
        return objectAnimatorOfInt;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return ContentChangeTransition.f7420a;
    }

    @Override // android.transition.Transition
    public final boolean isTransitionRequired(TransitionValues transitionValues, TransitionValues transitionValues2) {
        return (transitionValues == null || transitionValues2 == null || !ContentChangeTransition.m4583e(transitionValues, transitionValues2)) ? false : true;
    }
}
