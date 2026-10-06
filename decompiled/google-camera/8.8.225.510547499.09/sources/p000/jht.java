package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.Log;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jht extends cbr implements IInterface {

    /* JADX INFO: renamed from: a */
    private jgw f34090a;

    /* JADX INFO: renamed from: b */
    private final int f34091b;

    public jht(jgw jgwVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.f34090a = jgwVar;
        this.f34091b = i;
    }

    /* JADX INFO: renamed from: b */
    public final void m13190b(int i, IBinder iBinder, Bundle bundle) {
        jib.m13206k(this.f34090a, EArqVBjecl.HfbEgwDVh);
        this.f34090a.mo13172x(i, iBinder, bundle, this.f34091b);
        this.f34090a = null;
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                int i2 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                Bundle bundle = (Bundle) cbs.m3402a(parcel, Bundle.CREATOR);
                cbs.m3403b(parcel);
                m13190b(i2, strongBinder, bundle);
                break;
            case 2:
                parcel.readInt();
                cbs.m3403b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                break;
            case 3:
                int i3 = parcel.readInt();
                IBinder strongBinder2 = parcel.readStrongBinder();
                jhb jhbVar = (jhb) cbs.m3402a(parcel, jhb.CREATOR);
                cbs.m3403b(parcel);
                jgw jgwVar = this.f34090a;
                jib.m13206k(jgwVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                jib.m13205j(jhbVar);
                jgwVar.f33997n = jhbVar;
                if (jgwVar.mo13154C()) {
                    jhc jhcVar = jhbVar.f34028d;
                    jif.m13225a().m13226b(jhcVar == null ? null : jhcVar.f34029a);
                }
                m13190b(i3, strongBinder2, jhbVar.f34025a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public jht() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
}
