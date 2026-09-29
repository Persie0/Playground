package androidx.view;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.lifecycle.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class FragmentC1022b0 extends Fragment {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f6606b = 0;

    /* JADX INFO: renamed from: a */
    public a f6607a;

    /* JADX INFO: renamed from: androidx.lifecycle.b0$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3919a();

        /* JADX INFO: renamed from: b */
        void mo3920b();

        /* JADX INFO: renamed from: c */
        void mo3921c();
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b0$b */
    public static final class b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static void m3922a(Activity activity, Lifecycle.Event event) {
            C5207g.m11111f(activity, "activity");
            C5207g.m11111f(event, "event");
            if (activity instanceof InterfaceC1053s) {
                ((InterfaceC1053s) activity).m3960u().m3955f(event);
                return;
            }
            if (activity instanceof InterfaceC1051q) {
                C1052r c1052rMo786G = ((InterfaceC1051q) activity).mo786G();
                if (c1052rMo786G instanceof C1052r) {
                    c1052rMo786G.m3955f(event);
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public static void m3923b(Activity activity) {
            C5207g.m11111f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new FragmentC1022b0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b0$c */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* JADX INFO: renamed from: androidx.lifecycle.b0$c$a */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            C5207g.m11111f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            C5207g.m11111f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C5207g.m11111f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            b.m3922a(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            C5207g.m11111f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
            C5207g.m11111f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C5207g.m11111f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C5207g.m11111f(activity, "activity");
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3918a(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            C5207g.m11110e(activity, "activity");
            b.m3922a(activity, event);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f6607a;
        if (aVar != null) {
            aVar.mo3920b();
        }
        m3918a(Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m3918a(Lifecycle.Event.ON_DESTROY);
        this.f6607a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m3918a(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        a aVar = this.f6607a;
        if (aVar != null) {
            aVar.mo3921c();
        }
        m3918a(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        a aVar = this.f6607a;
        if (aVar != null) {
            aVar.mo3919a();
        }
        m3918a(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m3918a(Lifecycle.Event.ON_STOP);
    }
}
