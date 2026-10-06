package p000;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alh extends Fragment {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    static void m908a(Activity activity, akq akqVar) {
        if (activity instanceof akx) {
            ((akx) activity).m887a().m880b(akqVar);
        } else if (activity instanceof akv) {
            aks lifecycle = ((akv) activity).getLifecycle();
            if (lifecycle instanceof aks) {
                lifecycle.m880b(akqVar);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m909b(Activity activity) {
        activity.registerActivityLifecycleCallbacks(new alg());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new alh(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        akp akpVar = akq.Companion;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        akp akpVar = akq.Companion;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        akp akpVar = akq.Companion;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        akp akpVar = akq.Companion;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        akp akpVar = akq.Companion;
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        akp akpVar = akq.Companion;
    }
}
