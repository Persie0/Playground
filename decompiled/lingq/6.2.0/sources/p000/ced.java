package p000;

import android.view.View;
import android.view.WindowInsets;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ced {
    /* JADX INFO: renamed from: a */
    public static WindowInsets m4603a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, FragmentContainerView fragmentContainerView, WindowInsets windowInsets) {
        onApplyWindowInsetsListener.getClass();
        WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(fragmentContainerView, windowInsets);
        windowInsetsOnApplyWindowInsets.getClass();
        return windowInsetsOnApplyWindowInsets;
    }

    /* JADX INFO: renamed from: b */
    public static int m4604b(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
