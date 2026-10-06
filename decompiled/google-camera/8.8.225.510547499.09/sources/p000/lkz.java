package p000;

import android.app.Activity;
import android.os.Handler;
import android.view.Window;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lkz implements lhr, lhq, lkv {

    /* JADX INFO: renamed from: a */
    private final Window.OnFrameMetricsAvailableListener f38524a;

    /* JADX INFO: renamed from: b */
    private final ohb f38525b;

    /* JADX INFO: renamed from: c */
    private Activity f38526c;

    /* JADX INFO: renamed from: d */
    private boolean f38527d;

    public lkz(Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener, ohb ohbVar) {
        this.f38524a = onFrameMetricsAvailableListener;
        this.f38525b = ohbVar;
    }

    /* JADX INFO: renamed from: e */
    private final void m15678e() {
        Activity activity = this.f38526c;
        if (activity != null) {
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f38524a, (Handler) this.f38525b.get());
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m15679f() {
        Activity activity = this.f38526c;
        if (activity != null) {
            try {
                activity.getWindow().removeOnFrameMetricsAvailableListener(this.f38524a);
            } catch (RuntimeException e) {
            }
        }
    }

    @Override // p000.lhr
    /* JADX INFO: renamed from: a */
    public void mo15318a(Activity activity) {
        synchronized (this) {
            this.f38526c = activity;
            if (this.f38527d) {
                m15678e();
            }
        }
    }

    @Override // p000.lhq
    /* JADX INFO: renamed from: b */
    public void mo15352b(Activity activity) {
        synchronized (this) {
            if (this.f38527d) {
                m15679f();
            }
            this.f38526c = null;
        }
    }

    @Override // p000.lkv
    /* JADX INFO: renamed from: c */
    public void mo15674c() {
        synchronized (this) {
            this.f38527d = true;
            if (this.f38526c != null) {
                m15678e();
            }
        }
    }

    @Override // p000.lkv
    /* JADX INFO: renamed from: d */
    public void mo15675d() {
        synchronized (this) {
            this.f38527d = false;
            m15679f();
        }
    }
}
