package androidx.view;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.lifecycle.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1020a0 extends C1033g {
    final /* synthetic */ C1060z this$0;

    /* JADX INFO: renamed from: androidx.lifecycle.a0$a */
    public static final class a extends C1033g {
        final /* synthetic */ C1060z this$0;

        public a(C1060z c1060z) {
            this.this$0 = c1060z;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            C5207g.m11111f(activity, "activity");
            this.this$0.m3965a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            C5207g.m11111f(activity, "activity");
            C1060z c1060z = this.this$0;
            int i10 = c1060z.f6694a + 1;
            c1060z.f6694a = i10;
            if (i10 == 1 && c1060z.f6697d) {
                c1060z.f6699f.m3955f(Lifecycle.Event.ON_START);
                c1060z.f6697d = false;
            }
        }
    }

    public C1020a0(C1060z c1060z) {
        this.this$0 = c1060z;
    }

    @Override // androidx.view.C1033g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        C5207g.m11111f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = FragmentC1022b0.f6606b;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            C5207g.m11109d(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((FragmentC1022b0) fragmentFindFragmentByTag).f6607a = this.this$0.f6701h;
        }
    }

    @Override // androidx.view.C1033g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        C5207g.m11111f(activity, "activity");
        C1060z c1060z = this.this$0;
        int i10 = c1060z.f6695b - 1;
        c1060z.f6695b = i10;
        if (i10 == 0) {
            Handler handler = c1060z.f6698e;
            C5207g.m11108c(handler);
            handler.postDelayed(c1060z.f6700g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        C5207g.m11111f(activity, "activity");
        C1060z.a.m3966a(activity, new a(this.this$0));
    }

    @Override // androidx.view.C1033g, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        C5207g.m11111f(activity, "activity");
        C1060z c1060z = this.this$0;
        int i10 = c1060z.f6694a - 1;
        c1060z.f6694a = i10;
        if (i10 == 0 && c1060z.f6696c) {
            c1060z.f6699f.m3955f(Lifecycle.Event.ON_STOP);
            c1060z.f6697d = true;
        }
    }
}
