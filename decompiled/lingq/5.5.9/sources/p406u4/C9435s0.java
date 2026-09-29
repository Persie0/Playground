package p406u4;

import android.annotation.SuppressLint;
import android.view.View;
import p338qd.C8584v;

/* JADX INFO: renamed from: u4.s0 */
/* JADX INFO: loaded from: classes.dex */
public class C9435s0 extends C8584v {

    /* JADX INFO: renamed from: I */
    public static boolean f48407I = true;

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: E */
    public float mo17833E(View view) {
        if (f48407I) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f48407I = false;
            }
        }
        return view.getAlpha();
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: F */
    public void mo17834F(View view, float f3) {
        if (f48407I) {
            try {
                view.setTransitionAlpha(f3);
                return;
            } catch (NoSuchMethodError unused) {
                f48407I = false;
            }
        }
        view.setAlpha(f3);
    }
}
