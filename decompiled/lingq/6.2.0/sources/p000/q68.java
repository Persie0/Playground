package p000;

import android.app.Activity;
import android.app.FragmentManager;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes.dex */
public abstract class q68 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m19682a(Activity activity, Lifecycle$Event lifecycle$Event) {
        lifecycle$Event.getClass();
        if (activity instanceof ub5) {
            AbstractC3572sf abstractC3572sfMo256K = ((ub5) activity).mo256K();
            if (abstractC3572sfMo256K instanceof wb5) {
                ((wb5) abstractC3572sfMo256K).m23833G(lifecycle$Event);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m19683b(Activity activity) {
        s68.C3563a.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new s68.C3563a());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new s68(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
