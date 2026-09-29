package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rx1 implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public Context f59994a;

    /* JADX INFO: renamed from: a */
    public abstract void mo17664a(ComponentName componentName, C3156jq c3156jq);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        px3 px3Var;
        if (this.f59994a == null) {
            C3386nv.m17633t("Custom Tabs Service connected before an applicationcontext has been provided.");
            return;
        }
        int i = ox3.f55124f;
        if (iBinder == null) {
            px3Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(px3.f56943b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof px3)) {
                nx3 nx3Var = new nx3();
                nx3Var.f53358f = iBinder;
                px3Var = nx3Var;
            } else {
                px3Var = (px3) iInterfaceQueryLocalInterface;
            }
        }
        mo17664a(componentName, new C3156jq(px3Var, componentName));
    }
}
