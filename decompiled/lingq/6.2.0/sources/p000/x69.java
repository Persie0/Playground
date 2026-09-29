package p000;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class x69 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67835a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f67836b;

    /* JADX INFO: renamed from: c */
    public final Object f67837c;

    public x69(y69 y69Var, Activity activity) {
        y69Var.getClass();
        this.f67836b = y69Var;
        this.f67837c = new WeakReference(activity);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        int i = this.f67835a;
        Object obj = this.f67837c;
        Object obj2 = this.f67836b;
        switch (i) {
            case 0:
                view.getClass();
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                if (activity != null && iBinder != null) {
                    ((y69) obj2).m24961c(iBinder, activity);
                }
                break;
            default:
                ((ViewGroup) obj2).addView((hp9) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f67835a) {
            case 0:
                view.getClass();
                break;
            default:
                ((ViewGroup) this.f67836b).addView((hp9) this.f67837c, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    public x69(ViewGroup viewGroup, hp9 hp9Var) {
        this.f67836b = viewGroup;
        this.f67837c = hp9Var;
    }
}
