package td;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: td.i */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC9261i implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9262j f47950a;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C9262j c9262j = this.f47950a;
        c9262j.f47953b.m15814o("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        c9262j.m17619a().post(new C9259g(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C9262j c9262j = this.f47950a;
        c9262j.f47953b.m15814o("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        c9262j.m17619a().post(new C9260h(this));
    }
}
