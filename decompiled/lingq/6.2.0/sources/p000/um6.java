package p000;

import android.app.Notification;

/* JADX INFO: loaded from: classes2.dex */
public final class um6 extends xm6 {

    /* JADX INFO: renamed from: d */
    public CharSequence f64076d;

    @Override // p000.xm6
    /* JADX INFO: renamed from: a */
    public final void mo22233a(C3329mb c3329mb) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle((Notification.Builder) c3329mb.f50861c).setBigContentTitle(null).bigText(this.f64076d);
        if (this.f68351c) {
            bigTextStyleBigText.setSummaryText(this.f68350b);
        }
    }

    @Override // p000.xm6
    /* JADX INFO: renamed from: b */
    public final String mo22234b() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    /* JADX INFO: renamed from: c */
    public final void m22793c(String str) {
        this.f64076d = vm6.m23410d(str);
    }
}
