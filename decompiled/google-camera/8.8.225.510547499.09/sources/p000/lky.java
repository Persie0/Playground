package p000;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lky implements lkv, lho, lhp {

    /* JADX INFO: renamed from: a */
    private final Window.OnFrameMetricsAvailableListener f38522a;

    /* JADX INFO: renamed from: b */
    private final ohb f38523b;

    public lky(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, ohb ohbVar) {
        this.f38522a = onFrameMetricsAvailableListener;
        this.f38523b = ohbVar;
    }

    @Override // p000.lhp
    /* JADX INFO: renamed from: a */
    public void mo15351a(Activity activity) {
        activity.getWindow().removeOnFrameMetricsAvailableListener(this.f38522a);
    }

    @Override // p000.lho
    /* JADX INFO: renamed from: b */
    public void mo15350b(Activity activity, Bundle bundle) {
        activity.getWindow().addOnFrameMetricsAvailableListener(this.f38522a, (Handler) this.f38523b.get());
    }

    @Override // p000.lkv
    /* JADX INFO: renamed from: c */
    public void mo15674c() {
    }

    @Override // p000.lkv
    /* JADX INFO: renamed from: d */
    public void mo15675d() {
    }
}
