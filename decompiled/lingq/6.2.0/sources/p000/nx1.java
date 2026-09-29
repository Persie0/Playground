package p000;

import android.content.ComponentName;
import android.os.RemoteException;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public final class nx1 extends rx1 {

    /* JADX INFO: renamed from: b */
    public static C3156jq f53354b;

    /* JADX INFO: renamed from: c */
    public static gv5 f53355c;

    /* JADX INFO: renamed from: d */
    public static final ReentrantLock f53356d = new ReentrantLock();

    @Override // p000.rx1
    /* JADX INFO: renamed from: a */
    public final void mo17664a(ComponentName componentName, C3156jq c3156jq) {
        componentName.getClass();
        try {
            ((nx3) ((px3) c3156jq.f45990a)).m17667H();
        } catch (RemoteException unused) {
        }
        f53354b = c3156jq;
        cad.m4484c();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
