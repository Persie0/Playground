package p170i5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dm.C5207g;

/* JADX INFO: renamed from: i5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6186e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC6187f<Object> f36042a;

    public C6186e(AbstractC6187f<Object> abstractC6187f) {
        this.f36042a = abstractC6187f;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(intent, "intent");
        this.f36042a.mo12704g(intent);
    }
}
