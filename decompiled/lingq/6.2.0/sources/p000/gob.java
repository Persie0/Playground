package p000;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class gob extends wdb {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ f90 f41099a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gob(f90 f90Var, Looper looper) {
        super(looper, 4);
        this.f41099a = f90Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ifb ifbVar;
        f90 f90Var = this.f41099a;
        int i = f90Var.f38663x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (ifbVar = (ifb) message.obj) != null) {
                ifbVar.m13879d();
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !f90Var.m11613q()) {
            ifb ifbVar2 = (ifb) message.obj;
            if (ifbVar2 != null) {
                ifbVar2.m13879d();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            f90Var.f38660u = new ConnectionResult(message.arg2, null, null);
            if (!f90Var.f38661v && !TextUtils.isEmpty(f90Var.mo3405m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(f90Var.mo3405m());
                    if (!f90Var.f38661v) {
                        f90Var.m11616u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = f90Var.f38660u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            f90Var.f38649j.mo4796a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = f90Var.f38660u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            f90Var.f38649j.mo4796a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            f90Var.f38649j.mo4796a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            f90Var.m11616u(5, null);
            c90 c90Var = f90Var.f38654o;
            if (c90Var != null) {
                c90Var.onConnectionSuspended(message.arg2);
            }
            System.currentTimeMillis();
            f90Var.m11615t(5, 1, null);
            return;
        }
        if (i4 == 2 && !f90Var.m11612p()) {
            ifb ifbVar3 = (ifb) message.obj;
            if (ifbVar3 != null) {
                ifbVar3.m13879d();
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 == 2 || i5 == 1 || i5 == 7) {
            ((ifb) message.obj).m13878c();
        } else {
            Log.wtf("GmsClient", wq1.m24124t(new StringBuilder(String.valueOf(i5).length() + 34), "Don't know how to handle message: ", i5), new Exception());
        }
    }
}
