package p406u4;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: u4.v0 */
/* JADX INFO: loaded from: classes.dex */
public class C9441v0 extends C9439u0 {

    /* JADX INFO: renamed from: N */
    public static boolean f48423N = true;

    @Override // p338qd.C8584v
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: B */
    public void mo16802B(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo16802B(view, i10);
        } else if (f48423N) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f48423N = false;
            }
        }
    }
}
