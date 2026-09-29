package p000;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final class k66 implements g77 {

    /* JADX INFO: renamed from: a */
    public final Context f46765a;

    /* JADX INFO: renamed from: b */
    public final Activity f46766b;

    /* JADX INFO: renamed from: c */
    public final t66 f46767c = AbstractC0278f.m1260j(m14918a());

    /* JADX INFO: renamed from: d */
    public AbstractC3102i7 f46768d;

    public k66(Context context, Activity activity) {
        this.f46765a = context;
        this.f46766b = activity;
    }

    /* JADX INFO: renamed from: a */
    public final j77 m14918a() {
        return do7.m10532h(this.f46765a, "android.permission.POST_NOTIFICATIONS") == 0 ? i77.f43628a : new h77(do7.m10517D(this.f46766b, "android.permission.POST_NOTIFICATIONS"));
    }

    @Override // p000.g77
    /* JADX INFO: renamed from: n */
    public final j77 mo12408n() {
        return (j77) ((xc9) this.f46767c).getValue();
    }

    @Override // p000.g77
    /* JADX INFO: renamed from: o */
    public final void mo12409o() {
        AbstractC3102i7 abstractC3102i7 = this.f46768d;
        if (abstractC3102i7 != null) {
            abstractC3102i7.mo276a("android.permission.POST_NOTIFICATIONS");
        } else {
            C3386nv.m17633t("ActivityResultLauncher cannot be null");
        }
    }
}
