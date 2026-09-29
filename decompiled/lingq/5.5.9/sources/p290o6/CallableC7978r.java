package p290o6;

import android.content.Context;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.pushnotification.C2260f;
import java.util.concurrent.Callable;
import p526z6.C10445a;
import p526z6.InterfaceC10446b;

/* JADX INFO: renamed from: o6.r */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7978r implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10446b f43402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f43403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f43404c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CleverTapAPI f43405d;

    public CallableC7978r(CleverTapAPI cleverTapAPI, C10445a c10445a, Bundle bundle, Context context) {
        this.f43405d = cleverTapAPI;
        this.f43402a = c10445a;
        this.f43403b = bundle;
        this.f43404c = context;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        synchronized (this.f43405d.f10981b.f43481k.f11349l) {
            this.f43405d.f10981b.f43481k.f11346i = this.f43402a;
            Bundle bundle = this.f43403b;
            if (bundle == null || !bundle.containsKey("notificationId")) {
                this.f43405d.f10981b.f43481k.m6574b(this.f43404c, this.f43403b, -1000);
            } else {
                C2260f c2260f = this.f43405d.f10981b.f43481k;
                Context context = this.f43404c;
                Bundle bundle2 = this.f43403b;
                c2260f.m6574b(context, bundle2, bundle2.getInt("notificationId"));
            }
        }
        return null;
    }
}
