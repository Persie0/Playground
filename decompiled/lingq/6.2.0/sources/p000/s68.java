package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes.dex */
public class s68 extends Fragment {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f60434a = 0;

    /* JADX INFO: renamed from: s68$a */
    public static final class C3563a implements Application.ActivityLifecycleCallbacks {
        public static final r68 Companion = new r68();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            activity.getClass();
            activity.registerActivityLifecycleCallbacks(new C3563a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            activity.getClass();
            int i = s68.f60434a;
            q68.m19682a(activity, Lifecycle$Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            activity.getClass();
            bundle.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            activity.getClass();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        jb5 jb5Var = Lifecycle$Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        jb5 jb5Var = Lifecycle$Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        jb5 jb5Var = Lifecycle$Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        jb5 jb5Var = Lifecycle$Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        jb5 jb5Var = Lifecycle$Event.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        jb5 jb5Var = Lifecycle$Event.Companion;
    }
}
