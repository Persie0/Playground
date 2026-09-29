package p000;

import android.view.View;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes.dex */
public final class af9 {
    /* JADX INFO: renamed from: a */
    public static SpecialEffectsController$Operation$State m349a(View view) {
        view.getClass();
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? SpecialEffectsController$Operation$State.INVISIBLE : m350b(view.getVisibility());
    }

    /* JADX INFO: renamed from: b */
    public static SpecialEffectsController$Operation$State m350b(int i) {
        if (i == 0) {
            return SpecialEffectsController$Operation$State.VISIBLE;
        }
        if (i == 4) {
            return SpecialEffectsController$Operation$State.INVISIBLE;
        }
        if (i == 8) {
            return SpecialEffectsController$Operation$State.GONE;
        }
        C3386nv.m17626m(ux5.m22988k(i, "Unknown visibility "));
        return null;
    }
}
