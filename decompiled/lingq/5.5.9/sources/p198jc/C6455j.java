package p198jc;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;

/* JADX INFO: renamed from: jc.j */
/* JADX INFO: loaded from: classes.dex */
public final class C6455j {

    /* JADX INFO: renamed from: a */
    public static final int[] f37025a = {R.attr.stateListAnimator};

    /* JADX INFO: renamed from: a */
    public static void m13073a(View view, float f3) {
        int integer = view.getResources().getInteger(com.linguist.R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j10 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, com.linguist.R.attr.state_liftable, -2130969796}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j10));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f3).setDuration(j10));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }
}
