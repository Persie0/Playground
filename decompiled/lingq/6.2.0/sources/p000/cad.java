package p000;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cad {
    /* JADX INFO: renamed from: a */
    public static boolean m4482a(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: b */
    public static void m4483b(Uri uri) {
        m4484c();
        nx1.f53356d.lock();
        gv5 gv5Var = nx1.f53355c;
        if (gv5Var != null) {
            Bundle bundle = new Bundle();
            try {
                ((nx3) ((px3) gv5Var.f41392b)).m17665F((qx1) gv5Var.f41393c, uri, bundle);
            } catch (RemoteException unused) {
            }
        }
        nx1.f53356d.unlock();
    }

    /* JADX INFO: renamed from: c */
    public static void m4484c() {
        C3156jq c3156jq;
        gv5 gv5Var;
        nx1.f53356d.lock();
        if (nx1.f53355c == null && (c3156jq = nx1.f53354b) != null) {
            px3 px3Var = (px3) c3156jq.f45990a;
            qx1 qx1Var = new qx1();
            qx1Var.attachInterface(qx1Var, mx3.f51991a);
            new Handler(Looper.getMainLooper());
            try {
                gv5Var = !((nx3) px3Var).m17666G(qx1Var) ? null : new gv5(px3Var, qx1Var, (ComponentName) c3156jq.f45991b, 13);
            } catch (RemoteException unused) {
            }
            nx1.f53355c = gv5Var;
        }
        nx1.f53356d.unlock();
    }
}
