package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes.dex */
public final class bl7 extends kr2 {
    final /* synthetic */ cl7 this$0;

    /* JADX INFO: renamed from: bl7$a */
    public static final class C0815a extends kr2 {
        final /* synthetic */ cl7 this$0;

        public C0815a(cl7 cl7Var) {
            this.this$0 = cl7Var;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            cl7 cl7Var = this.this$0;
            int i = cl7Var.f10233b + 1;
            cl7Var.f10233b = i;
            if (i == 1) {
                if (cl7Var.f10234c) {
                    cl7Var.f10237f.m23833G(Lifecycle$Event.ON_RESUME);
                    cl7Var.f10234c = false;
                } else {
                    Handler handler = cl7Var.f10236e;
                    handler.getClass();
                    handler.removeCallbacks(cl7Var.f10238g);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            cl7 cl7Var = this.this$0;
            int i = cl7Var.f10232a + 1;
            cl7Var.f10232a = i;
            if (i == 1 && cl7Var.f10235d) {
                cl7Var.f10237f.m23833G(Lifecycle$Event.ON_START);
                cl7Var.f10235d = false;
            }
        }
    }

    public bl7(cl7 cl7Var) {
        this.this$0 = cl7Var;
    }

    @Override // p000.kr2, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getClass();
    }

    @Override // p000.kr2, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        cl7 cl7Var = this.this$0;
        int i = cl7Var.f10233b - 1;
        cl7Var.f10233b = i;
        if (i == 0) {
            Handler handler = cl7Var.f10236e;
            handler.getClass();
            handler.postDelayed(cl7Var.f10238g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.getClass();
        activity.registerActivityLifecycleCallbacks(new C0815a(this.this$0));
    }

    @Override // p000.kr2, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        cl7 cl7Var = this.this$0;
        int i = cl7Var.f10232a - 1;
        cl7Var.f10232a = i;
        if (i == 0 && cl7Var.f10234c) {
            cl7Var.f10237f.m23833G(Lifecycle$Event.ON_STOP);
            cl7Var.f10235d = true;
        }
    }
}
