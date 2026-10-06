package p000;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtg extends jrm {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f34764a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f34765b;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ byte[] f34766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtg(jec jecVar, String str, String str2, byte[] bArr) {
        super(jecVar);
        this.f34764a = str;
        this.f34765b = str2;
        this.f34766f = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    /* JADX INFO: renamed from: a */
    protected final /* bridge */ /* synthetic */ jel mo4647a(Status status) {
        return new jth(status, -1);
    }

    @Override // p000.jey
    /* JADX INFO: renamed from: b */
    protected final /* bridge */ /* synthetic */ void mo12838b(jdp jdpVar) {
        String str = this.f34764a;
        String str2 = this.f34765b;
        byte[] bArr = this.f34766f;
        jtd jtdVar = (jtd) ((juf) jdpVar).m13169u();
        jue jueVar = new jue(this);
        Parcel parcelM3398a = jtdVar.m3398a();
        cbs.m3405d(parcelM3398a, jueVar);
        parcelM3398a.writeString(str);
        parcelM3398a.writeString(str2);
        parcelM3398a.writeByteArray(bArr);
        jtdVar.m3400z(12, parcelM3398a);
    }
}
