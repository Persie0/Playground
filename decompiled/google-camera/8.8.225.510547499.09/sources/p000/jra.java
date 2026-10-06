package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jra implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34627a;

    public jra(int i) {
        this.f34627a = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.f34627a;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.f34627a;
    }
}
