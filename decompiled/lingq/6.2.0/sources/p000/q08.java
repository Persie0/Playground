package p000;

import android.app.Activity;

/* JADX INFO: loaded from: classes2.dex */
public final class q08 implements zh2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f57106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f57107b;

    public q08(Activity activity, boolean z) {
        this.f57106a = activity;
        this.f57107b = z;
    }

    @Override // p000.zh2
    /* JADX INFO: renamed from: a */
    public final void mo1799a() {
        Activity activity = this.f57106a;
        if (activity != null) {
            activity.setRequestedOrientation(this.f57107b ? 1 : -1);
        }
    }
}
