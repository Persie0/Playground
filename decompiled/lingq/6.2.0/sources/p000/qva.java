package p000;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class qva extends rva {

    /* JADX INFO: renamed from: k */
    public boolean f58257k;

    @Override // p000.rva
    /* JADX INFO: renamed from: d */
    public final boolean mo17649d(float f, long j, View view, web webVar) {
        Method method;
        if (view instanceof AbstractC0475b) {
            ((AbstractC0475b) view).setProgress(m20868b(f, j, view, webVar));
        } else {
            if (this.f58257k) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f58257k = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m20868b(f, j, view, webVar)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e2);
                }
            }
        }
        return this.f59891h;
    }
}
