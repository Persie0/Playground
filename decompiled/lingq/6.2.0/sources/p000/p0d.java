package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.measurement.internal.zzr;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f55402a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f55403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzr f55404c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f55405d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ oub f55406e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ v4d f55407f;

    public p0d(v4d v4dVar, String str, String str2, zzr zzrVar, boolean z, oub oubVar) {
        this.f55402a = str;
        this.f55403b = str2;
        this.f55404c = zzrVar;
        this.f55405d = z;
        this.f55406e = oubVar;
        this.f55407f = v4dVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        String str = this.f55402a;
        oub oubVar = this.f55406e;
        v4d v4dVar = this.f55407f;
        Bundle bundle = new Bundle();
        try {
            try {
                q9c q9cVar = v4dVar.f64866d;
                kjc kjcVar = (kjc) v4dVar.f60774a;
                String str2 = this.f55403b;
                if (q9cVar == null) {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17925c("Failed to get user properties; not connected to service", str, str2);
                    rad radVar = kjcVar.f47441i;
                    kjc.m15278j(radVar);
                    radVar.m20556u0(oubVar, bundle);
                    return;
                }
                List<zzpl> listMo11308z = q9cVar.mo11308z(str, str2, this.f55405d, this.f55404c);
                Bundle bundle2 = new Bundle();
                if (listMo11308z != null) {
                    for (zzpl zzplVar : listMo11308z) {
                        String str3 = zzplVar.f12410e;
                        String str4 = zzplVar.f12407b;
                        if (str3 != null) {
                            bundle2.putString(str4, str3);
                        } else {
                            Long l = zzplVar.f12409d;
                            if (l != null) {
                                bundle2.putLong(str4, l.longValue());
                            } else {
                                Double d = zzplVar.f12412g;
                                if (d != null) {
                                    bundle2.putDouble(str4, d.doubleValue());
                                }
                            }
                        }
                    }
                }
                try {
                    v4dVar.m23116Q();
                    rad radVar2 = kjcVar.f47441i;
                    kjc.m15278j(radVar2);
                    radVar2.m20556u0(oubVar, bundle2);
                } catch (RemoteException e) {
                    e = e;
                    bundle = bundle2;
                    xcc xccVar2 = ((kjc) v4dVar.f60774a).f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17925c("Failed to get user properties; remote exception", str, e);
                    rad radVar3 = ((kjc) v4dVar.f60774a).f47441i;
                    kjc.m15278j(radVar3);
                    radVar3.m20556u0(oubVar, bundle);
                } catch (Throwable th) {
                    th = th;
                    bundle = bundle2;
                    rad radVar4 = ((kjc) v4dVar.f60774a).f47441i;
                    kjc.m15278j(radVar4);
                    radVar4.m20556u0(oubVar, bundle);
                    throw th;
                }
            } catch (RemoteException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
