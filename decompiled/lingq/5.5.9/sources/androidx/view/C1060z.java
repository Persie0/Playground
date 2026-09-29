package androidx.view;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.activity.RunnableC0193l;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.lifecycle.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1060z implements InterfaceC1051q {

    /* JADX INFO: renamed from: i */
    public static final C1060z f6693i = new C1060z();

    /* JADX INFO: renamed from: a */
    public int f6694a;

    /* JADX INFO: renamed from: b */
    public int f6695b;

    /* JADX INFO: renamed from: e */
    public Handler f6698e;

    /* JADX INFO: renamed from: c */
    public boolean f6696c = true;

    /* JADX INFO: renamed from: d */
    public boolean f6697d = true;

    /* JADX INFO: renamed from: f */
    public final C1052r f6699f = new C1052r(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0193l f6700g = new RunnableC0193l(3, this);

    /* JADX INFO: renamed from: h */
    public final b f6701h = new b();

    /* JADX INFO: renamed from: androidx.lifecycle.z$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static final void m3966a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C5207g.m11111f(activity, "activity");
            C5207g.m11111f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.z$b */
    public static final class b implements FragmentC1022b0.a {
        public b() {
        }

        @Override // androidx.view.FragmentC1022b0.a
        /* JADX INFO: renamed from: a */
        public final void mo3919a() {
            C1060z c1060z = C1060z.this;
            int i10 = c1060z.f6694a + 1;
            c1060z.f6694a = i10;
            if (i10 == 1 && c1060z.f6697d) {
                c1060z.f6699f.m3955f(Lifecycle.Event.ON_START);
                c1060z.f6697d = false;
            }
        }

        @Override // androidx.view.FragmentC1022b0.a
        /* JADX INFO: renamed from: b */
        public final void mo3920b() {
        }

        @Override // androidx.view.FragmentC1022b0.a
        /* JADX INFO: renamed from: c */
        public final void mo3921c() {
            C1060z.this.m3965a();
        }
    }

    @Override // androidx.view.InterfaceC1051q
    /* JADX INFO: renamed from: G */
    public final C1052r mo786G() {
        return this.f6699f;
    }

    /* JADX INFO: renamed from: a */
    public final void m3965a() {
        int i10 = this.f6695b + 1;
        this.f6695b = i10;
        if (i10 == 1) {
            if (this.f6696c) {
                this.f6699f.m3955f(Lifecycle.Event.ON_RESUME);
                this.f6696c = false;
            } else {
                Handler handler = this.f6698e;
                C5207g.m11108c(handler);
                handler.removeCallbacks(this.f6700g);
            }
        }
    }
}
