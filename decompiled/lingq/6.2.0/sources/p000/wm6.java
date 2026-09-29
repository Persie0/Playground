package p000;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes2.dex */
public final class wm6 extends xm6 {

    /* JADX INFO: renamed from: d */
    public int[] f67055d = null;

    /* JADX INFO: renamed from: e */
    public MediaSessionCompat$Token f67056e;

    @Override // p000.xm6
    /* JADX INFO: renamed from: a */
    public final void mo22233a(C3329mb c3329mb) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) c3329mb.f50861c;
        if (i >= 34) {
            qm6.m20030d(builder, qm6.m20028b(rm6.m20713a(qm6.m20027a(), null, 0, null, Boolean.FALSE), this.f67055d, this.f67056e));
        } else {
            qm6.m20030d(builder, qm6.m20028b(qm6.m20027a(), this.f67055d, this.f67056e));
        }
    }
}
