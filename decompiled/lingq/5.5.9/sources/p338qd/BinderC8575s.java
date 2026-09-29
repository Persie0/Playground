package p338qd;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.play.core.assetpacks.C3112c;
import p290o6.C7967l0;
import td.AbstractBinderC9253b0;

/* JADX INFO: renamed from: qd.s */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC8575s extends AbstractBinderC9253b0 {

    /* JADX INFO: renamed from: a */
    public final C7967l0 f45986a = new C7967l0("AssetPackExtractionService");

    /* JADX INFO: renamed from: b */
    public final Context f45987b;

    /* JADX INFO: renamed from: c */
    public final C3112c f45988c;

    /* JADX INFO: renamed from: d */
    public final C8571q1 f45989d;

    /* JADX INFO: renamed from: e */
    public final ServiceConnectionC8552k0 f45990e;

    /* JADX INFO: renamed from: f */
    public final NotificationManager f45991f;

    public BinderC8575s(Context context, C3112c c3112c, C8571q1 c8571q1, ServiceConnectionC8552k0 serviceConnectionC8552k0) {
        this.f45987b = context;
        this.f45988c = c3112c;
        this.f45989d = c8571q1;
        this.f45990e = serviceConnectionC8552k0;
        this.f45991f = (NotificationManager) context.getSystemService("notification");
    }
}
