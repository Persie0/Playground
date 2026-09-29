package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzj;

/* JADX INFO: loaded from: classes2.dex */
public final class ewb extends qcb {

    /* JADX INFO: renamed from: g */
    public f90 f38010g;

    /* JADX INFO: renamed from: h */
    public final int f38011h;

    public ewb(f90 f90Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f38010g = f90Var;
        this.f38011h = i;
    }

    @Override // p000.qcb
    /* JADX INFO: renamed from: G */
    public final boolean mo11371G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zrb.m25756a(parcel, Bundle.CREATOR);
            zrb.m25758c(parcel);
            lda.m16131q(this.f38010g, "onPostInitComplete can be called only once per call to getRemoteService");
            f90 f90Var = this.f38010g;
            int i3 = this.f38011h;
            f90Var.getClass();
            e4c e4cVar = new e4c(f90Var, i2, strongBinder, bundle);
            gob gobVar = f90Var.f38645f;
            gobVar.sendMessage(gobVar.obtainMessage(1, i3, -1, e4cVar));
            this.f38010g = null;
        } else if (i == 2) {
            parcel.readInt();
            zrb.m25758c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) zrb.m25756a(parcel, zzj.CREATOR);
            zrb.m25758c(parcel);
            f90 f90Var2 = this.f38010g;
            lda.m16131q(f90Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            lda.m16130p(zzjVar);
            f90Var2.f38662w = zzjVar;
            if (f90Var2.mo11614s()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f11746d;
                hi8 hi8VarM13280u = hi8.m13280u();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f11690a;
                synchronized (hi8VarM13280u) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = hi8.f42407d;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) hi8VarM13280u.f42410b;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f11721a < rootTelemetryConfiguration.f11721a) {
                            }
                        }
                        hi8VarM13280u.f42410b = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzjVar.f11743a;
            lda.m16131q(this.f38010g, "onPostInitComplete can be called only once per call to getRemoteService");
            f90 f90Var3 = this.f38010g;
            int i5 = this.f38011h;
            f90Var3.getClass();
            e4c e4cVar2 = new e4c(f90Var3, i4, strongBinder2, bundle2);
            gob gobVar2 = f90Var3.f38645f;
            gobVar2.sendMessage(gobVar2.obtainMessage(1, i5, -1, e4cVar2));
            this.f38010g = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
