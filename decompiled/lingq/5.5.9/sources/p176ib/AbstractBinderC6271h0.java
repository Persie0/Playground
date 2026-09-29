package p176ib;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import p455wb.BinderC9896b;
import p455wb.C9897c;
import sb.C8987a;

/* JADX INFO: renamed from: ib.h0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC6271h0 extends BinderC9896b {
    public AbstractBinderC6271h0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // p455wb.BinderC9896b
    /* JADX INFO: renamed from: h */
    public final boolean mo12899h(int i10, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i10 == 1) {
            int i11 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) C9897c.m18402a(parcel, Bundle.CREATOR);
            C9897c.m18403b(parcel);
            BinderC6289q0 binderC6289q0 = (BinderC6289q0) this;
            C6272i.m12916j(binderC6289q0.f36489a, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC6251a abstractC6251a = binderC6289q0.f36489a;
            abstractC6251a.getClass();
            C6293s0 c6293s0 = new C6293s0(abstractC6251a, i11, strongBinder, bundle);
            HandlerC6285o0 handlerC6285o0 = abstractC6251a.f36426k;
            handlerC6285o0.sendMessage(handlerC6285o0.obtainMessage(1, binderC6289q0.f36490b, -1, c6293s0));
            binderC6289q0.f36489a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            C9897c.m18403b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i10 != 3) {
                return false;
            }
            int i12 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) C9897c.m18402a(parcel, zzk.CREATOR);
            C9897c.m18403b(parcel);
            BinderC6289q0 binderC6289q1 = (BinderC6289q0) this;
            AbstractC6251a abstractC6251a2 = binderC6289q1.f36489a;
            C6272i.m12916j(abstractC6251a2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C6272i.m12915i(zzkVar);
            abstractC6251a2.f36414V = zzkVar;
            if (abstractC6251a2 instanceof C8987a) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.f13987d;
                C6274j c6274jM12918a = C6274j.m12918a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f13931a;
                synchronized (c6274jM12918a) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = C6274j.f36469c;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = c6274jM12918a.f36470a;
                            if (rootTelemetryConfiguration2 != null) {
                                if (rootTelemetryConfiguration2.f13962a < rootTelemetryConfiguration.f13962a) {
                                }
                            }
                        }
                        c6274jM12918a.f36470a = rootTelemetryConfiguration;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            Bundle bundle2 = zzkVar.f13984a;
            C6272i.m12916j(binderC6289q1.f36489a, "onPostInitComplete can be called only once per call to getRemoteService");
            AbstractC6251a abstractC6251a3 = binderC6289q1.f36489a;
            abstractC6251a3.getClass();
            C6293s0 c6293s1 = new C6293s0(abstractC6251a3, i12, strongBinder2, bundle2);
            HandlerC6285o0 handlerC6285o1 = abstractC6251a3.f36426k;
            handlerC6285o1.sendMessage(handlerC6285o1.obtainMessage(1, binderC6289q1.f36490b, -1, c6293s1));
            binderC6289q1.f36489a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
