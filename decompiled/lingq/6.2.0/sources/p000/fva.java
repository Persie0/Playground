package p000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class fva extends gva {

    /* JADX INFO: renamed from: f */
    public boolean f39769f;

    @Override // p000.gva
    /* JADX INFO: renamed from: c */
    public final void mo9912c(View view, float f) {
        Method method;
        if (view instanceof AbstractC0475b) {
            ((AbstractC0475b) view).setProgress(m12918a(f));
            return;
        }
        if (this.f39769f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f39769f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m12918a(f)));
            } catch (IllegalAccessException e) {
                Log.e("ViewSpline", "unable to setProgress", e);
            } catch (InvocationTargetException e2) {
                Log.e("ViewSpline", "unable to setProgress", e2);
            }
        }
    }
}
