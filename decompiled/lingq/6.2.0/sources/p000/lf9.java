package p000;

import android.R;
import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.splashscreen.R$attr;
import com.lingq.p020ui.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class lf9 extends fs6 {

    /* JADX INFO: renamed from: d */
    public kf9 f49607d;

    /* JADX INFO: renamed from: e */
    public final jf9 f49608e;

    public lf9(MainActivity mainActivity) {
        super(mainActivity);
        this.f49608e = new jf9(this, mainActivity);
    }

    @Override // p000.fs6
    /* JADX INFO: renamed from: L */
    public final void mo12097L(ro5 ro5Var) {
        this.f39591c = ro5Var;
        View viewFindViewById = ((MainActivity) this.f39590b).findViewById(R.id.content);
        ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
        if (this.f49607d != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f49607d);
        }
        kf9 kf9Var = new kf9(this, viewFindViewById);
        this.f49607d = kf9Var;
        viewTreeObserver.addOnPreDrawListener(kf9Var);
    }

    @Override // p000.fs6
    /* JADX INFO: renamed from: z */
    public final void mo12119z() {
        int i;
        MainActivity mainActivity = (MainActivity) this.f39590b;
        Resources.Theme theme = mainActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R$attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            mainActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = mainActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.f49608e);
        }
    }
}
