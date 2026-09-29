package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p000.af9;
import p000.bf9;

/* JADX INFO: loaded from: classes.dex */
public enum SpecialEffectsController$Operation$State {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static final af9 Companion = new af9();

    public static final SpecialEffectsController$Operation$State from(int i) {
        Companion.getClass();
        return af9.m350b(i);
    }

    public final void applyState(View view, ViewGroup viewGroup) {
        view.getClass();
        viewGroup.getClass();
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i = bf9.f8481a[ordinal()];
        if (i == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup2 != null) {
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup2);
                }
                viewGroup2.removeView(view);
                return;
            }
            return;
        }
        if (i == 2) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (AbstractC0638f.m2128L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + viewGroup);
                }
                viewGroup.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i == 3) {
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i != 4) {
            return;
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
