package p290o6;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o6.t */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7981t implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f43411a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f43412b = "clevertapNotification";

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CharSequence f43413c = "LingQ Offers";

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f43414d = 5;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f43415e = "LingQ Offers";

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f43416f = true;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CleverTapAPI f43417g;

    public CallableC7981t(Context context, CleverTapAPI cleverTapAPI) {
        this.f43411a = context;
        this.f43417g = cleverTapAPI;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        NotificationManager notificationManager = (NotificationManager) this.f43411a.getSystemService("notification");
        if (notificationManager != null) {
            String str = this.f43412b;
            CharSequence charSequence = this.f43413c;
            NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, this.f43414d);
            notificationChannel.setDescription(this.f43415e);
            notificationChannel.setShowBadge(this.f43416f);
            notificationManager.createNotificationChannel(notificationChannel);
            CleverTapAPI cleverTapAPI = this.f43417g;
            cleverTapAPI.m6429f().m6462g(cleverTapAPI.m6428e(), "Notification channel " + charSequence.toString() + " has been created");
        }
        return null;
    }
}
