package p000;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbk extends jbn {
    public jbk(jec jecVar) {
        super(jecVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return status;
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        jbg jbgVar = (jbg) jdpVar;
        jbs jbsVar = (jbs) jbgVar.m13169u();
        jbj jbjVar = new jbj(this);
        GoogleSignInOptions googleSignInOptions = jbgVar.f33660a;
        Parcel parcelM3398a = jbsVar.m3398a();
        cbs.m3405d(parcelM3398a, jbjVar);
        cbs.m3404c(parcelM3398a, googleSignInOptions);
        jbsVar.m3400z(102, parcelM3398a);
    }
}
