package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtl extends jrm {
    public jtl(jec jecVar) {
        super(jecVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return new jrp(status, new ArrayList(), 2);
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ void mo12838b(jdp jdpVar) {
        jtd jtdVar = (jtd) ((juf) jdpVar).m13169u();
        juc jucVar = new juc(this);
        Parcel parcelM3398a = jtdVar.m3398a();
        cbs.m3405d(parcelM3398a, jucVar);
        jtdVar.m3400z(15, parcelM3398a);
    }
}
