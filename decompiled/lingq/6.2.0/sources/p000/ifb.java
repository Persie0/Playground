package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ifb {

    /* JADX INFO: renamed from: a */
    public Boolean f44057a;

    /* JADX INFO: renamed from: b */
    public boolean f44058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f90 f44059c;

    /* JADX INFO: renamed from: d */
    public final int f44060d;

    /* JADX INFO: renamed from: e */
    public final Bundle f44061e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ f90 f44062f;

    public ifb(f90 f90Var, int i, Bundle bundle) {
        this.f44062f = f90Var;
        Boolean bool = Boolean.TRUE;
        this.f44059c = f90Var;
        this.f44057a = bool;
        this.f44058b = false;
        this.f44060d = i;
        this.f44061e = bundle;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo10847a();

    /* JADX INFO: renamed from: b */
    public abstract void mo10848b(ConnectionResult connectionResult);

    /* JADX INFO: renamed from: c */
    public final void m13878c() {
        Boolean bool;
        synchronized (this) {
            try {
                bool = this.f44057a;
                if (this.f44058b) {
                    String string = toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    Log.w("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            f90 f90Var = this.f44062f;
            int i = this.f44060d;
            if (i != 0) {
                f90Var.m11616u(1, null);
                Bundle bundle = this.f44061e;
                mo10848b(new ConnectionResult(i, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!mo10847a()) {
                f90Var.m11616u(1, null);
                mo10848b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (this) {
            this.f44058b = true;
        }
        m13879d();
    }

    /* JADX INFO: renamed from: d */
    public final void m13879d() {
        m13880e();
        f90 f90Var = this.f44059c;
        synchronized (f90Var.f38651l) {
            f90Var.f38651l.remove(this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13880e() {
        synchronized (this) {
            this.f44057a = null;
        }
    }
}
