package p406u4;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: renamed from: u4.u0 */
/* JADX INFO: loaded from: classes.dex */
public class C9439u0 extends C9437t0 {

    /* JADX INFO: renamed from: M */
    public static boolean f48414M = true;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: J */
    public void mo17839J(View view, int i10, int i11, int i12, int i13) {
        if (f48414M) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f48414M = false;
            }
        }
    }
}
