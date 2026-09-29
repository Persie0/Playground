package p000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class kua extends lua {

    /* JADX INFO: renamed from: g */
    public boolean f48440g;

    @Override // p000.lua
    /* JADX INFO: renamed from: d */
    public final void mo13481d(View view, float f) {
        Method method;
        if (view instanceof AbstractC0475b) {
            ((AbstractC0475b) view).setProgress(m16547a(f));
            return;
        }
        if (this.f48440g) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f48440g = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m16547a(f)));
            } catch (IllegalAccessException e) {
                Log.e("ViewOscillator", "unable to setProgress", e);
            } catch (InvocationTargetException e2) {
                Log.e("ViewOscillator", "unable to setProgress", e2);
            }
        }
    }
}
