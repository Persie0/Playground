package p232l2;

import android.app.Notification;
import android.os.Bundle;

/* JADX INFO: renamed from: l2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7235n extends AbstractC7237p {

    /* JADX INFO: renamed from: d */
    public CharSequence f40640d;

    @Override // p232l2.AbstractC7237p
    /* JADX INFO: renamed from: a */
    public final void mo14575a(Bundle bundle) {
        super.mo14575a(bundle);
    }

    @Override // p232l2.AbstractC7237p
    /* JADX INFO: renamed from: b */
    public final void mo60b(C7238q c7238q) {
        Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(c7238q.f40670b).setBigContentTitle(null).bigText(this.f40640d);
        if (this.f40668c) {
            bigTextStyleBigText.setSummaryText(this.f40667b);
        }
    }

    @Override // p232l2.AbstractC7237p
    /* JADX INFO: renamed from: c */
    public final String mo14568c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
