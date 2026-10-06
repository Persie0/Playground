package p000;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkl extends jey {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Intent f34248a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ WeakReference f34249b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkl(jec jecVar, Intent intent, WeakReference weakReference) {
        super(jecVar);
        this.f34248a = intent;
        this.f34249b = weakReference;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return status == null ? Status.f7603c : status;
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        jko jkoVar = (jko) jdpVar;
        Context context = jkoVar.f33986c;
        jkq jkqVar = (jkq) jkoVar.m13169u();
        GoogleHelp googleHelp = (GoogleHelp) this.f34248a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        try {
            jkk jkkVar = new jkk(this.f34248a, this.f34249b, this);
            Parcel parcelM3398a = jkqVar.m3398a();
            cbs.m3404c(parcelM3398a, googleHelp);
            cbs.m3404c(parcelM3398a, null);
            cbs.m3405d(parcelM3398a, jkkVar);
            jkqVar.m3400z(2, parcelM3398a);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            m4648g(jkm.f34250a);
        }
    }

    @Override // p000.jey, p000.jez
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo12841c(Object obj) {
        super.m4649i((jel) obj);
    }
}
