package p000;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class jf9 implements ViewGroup.OnHierarchyChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MainActivity f45509a;

    public jf9(lf9 lf9Var, MainActivity mainActivity) {
        this.f45509a = mainActivity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        if (if9.m13874m(view2)) {
            SplashScreenView splashScreenViewM13869h = if9.m13869h(view2);
            splashScreenViewM13869h.getClass();
            WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
            windowInsetsBuild.getClass();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            if (windowInsetsBuild == splashScreenViewM13869h.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            View decorView = this.f45509a.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
