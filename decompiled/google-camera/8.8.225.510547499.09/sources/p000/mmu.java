package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mmu extends mnh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f41068a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mmx f41069b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ khb f41070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmu(mmx mmxVar, khb khbVar, khb khbVar2, String str, byte[] bArr, byte[] bArr2) {
        super(khbVar, null, null);
        this.f41069b = mmxVar;
        this.f41070c = khbVar2;
        this.f41068a = str;
    }

    @Override // p000.mnh
    /* JADX INFO: renamed from: a */
    protected final void mo16640a() {
        try {
            mmx mmxVar = this.f41069b;
            IInterface iInterface = mmxVar.f41074a.f41131k;
            String str = mmxVar.f41075b;
            Bundle bundleM16644b = mmx.m16644b();
            mmv mmvVar = new mmv(this.f41069b, this.f41070c, null, null);
            Parcel parcelM3398a = ((cbq) iInterface).m3398a();
            parcelM3398a.writeString(str);
            cbs.m3404c(parcelM3398a, bundleM16644b);
            cbs.m3405d(parcelM3398a, mmvVar);
            ((cbq) iInterface).m3397A(3, parcelM3398a);
        } catch (RemoteException e) {
            mmx.f41072d.m16288e(e, "completeUpdate(%s)", this.f41068a);
            this.f41070c.m14244j(new RuntimeException(e));
        }
    }
}
