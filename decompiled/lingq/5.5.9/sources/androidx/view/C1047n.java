package androidx.view;

import android.app.Activity;
import android.os.Bundle;
import dm.C5207g;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1047n {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f6678a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.n$a */
    public static final class a extends C1033g {
        @Override // androidx.view.C1033g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C5207g.m11111f(activity, "activity");
            int i10 = FragmentC1022b0.f6606b;
            FragmentC1022b0.b.m3923b(activity);
        }
    }
}
