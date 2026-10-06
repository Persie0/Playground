package p000;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbi extends jbn {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f33662a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ GoogleSignInOptions f33663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jbi(jec jecVar, Context context, GoogleSignInOptions googleSignInOptions) {
        super(jecVar);
        this.f33662a = context;
        this.f33663b = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return new jrp((GoogleSignInAccount) null, status, 1);
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        jbs jbsVar = (jbs) ((jbg) jdpVar).m13169u();
        jbh jbhVar = new jbh(this);
        GoogleSignInOptions googleSignInOptions = this.f33663b;
        Parcel parcelM3398a = jbsVar.m3398a();
        cbs.m3405d(parcelM3398a, jbhVar);
        cbs.m3404c(parcelM3398a, googleSignInOptions);
        jbsVar.m3400z(101, parcelM3398a);
    }
}
