package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqp extends jhh {

    /* JADX INFO: renamed from: a */
    private final AtomicReference f34602a;

    public jqp(Context context, Looper looper, jgz jgzVar, jea jeaVar, jeb jebVar) {
        super(context, looper, 41, jgzVar, jeaVar, jebVar);
        this.f34602a = new AtomicReference();
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: C */
    public final boolean mo13154C() {
        return true;
    }

    /* JADX INFO: renamed from: I */
    public final void m13471I(joo jooVar, joo jooVar2, jez jezVar) {
        jqn jqnVar = new jqn((jqk) m13169u(), jezVar, jooVar2, null);
        if (jooVar == null) {
            if (jooVar2 == null) {
                jezVar.mo12841c(Status.f7601a);
                return;
            } else {
                ((jqk) m13169u()).m13470e(jooVar2, jqnVar);
                return;
            }
        }
        jqk jqkVar = (jqk) m13169u();
        Parcel parcelM3398a = jqkVar.m3398a();
        cbs.m3405d(parcelM3398a, jooVar);
        cbs.m3405d(parcelM3398a, jqnVar);
        jqkVar.m3400z(10, parcelM3398a);
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 12600000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        return iInterfaceQueryLocalInterface instanceof jqk ? (jqk) iInterfaceQueryLocalInterface : new jqk(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return WIxTIdUIdfb.FPPWl;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.gms.usagereporting.service.START";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: e */
    public final jcw[] mo12893e() {
        return jpx.f34579d;
    }

    @Override // p000.jgw, p000.jdu
    /* JADX INFO: renamed from: j */
    public final void mo12942j() {
        try {
            joo jooVar = (joo) this.f34602a.getAndSet(null);
            if (jooVar != null) {
                jqm jqmVar = new jqm();
                jqk jqkVar = (jqk) m13169u();
                Parcel parcelM3398a = jqkVar.m3398a();
                cbs.m3405d(parcelM3398a, jooVar);
                cbs.m3405d(parcelM3398a, jqmVar);
                jqkVar.m3400z(5, parcelM3398a);
            }
        } catch (RemoteException e) {
            Log.e("UsageReportingClientImp", "disconnect(): Could not unregister listener from remote:", e);
        }
        super.mo12942j();
    }
}
