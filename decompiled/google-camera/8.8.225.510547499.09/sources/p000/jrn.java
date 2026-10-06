package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrn extends jrm {
    public jrn(jec jecVar) {
        super(jecVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return new jrp(status, (jqq) null, 0);
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        jtd jtdVar = (jtd) ((juf) jdpVar).m13169u();
        jub jubVar = new jub(this);
        Parcel parcelM3398a = jtdVar.m3398a();
        cbs.m3405d(parcelM3398a, jubVar);
        parcelM3398a.writeString("snapshot_from_wear");
        parcelM3398a.writeInt(1);
        jtdVar.m3400z(42, parcelM3398a);
    }
}
