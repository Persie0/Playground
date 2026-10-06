package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class aue {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.MarginLayoutParams f2406a;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f2406a = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2027a(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (m2027a(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}
