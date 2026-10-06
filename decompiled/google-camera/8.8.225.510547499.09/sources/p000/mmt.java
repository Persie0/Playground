package p000;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mmt extends mnh {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f41065a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mmx f41066b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ khb f41067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mmt(mmx mmxVar, khb khbVar, String str, khb khbVar2, byte[] bArr, byte[] bArr2) {
        super(khbVar, null, null);
        this.f41066b = mmxVar;
        this.f41065a = str;
        this.f41067c = khbVar2;
    }

    @Override // p000.mnh
    /* JADX INFO: renamed from: a */
    protected final void mo16640a() {
        Integer numValueOf;
        try {
            mmx mmxVar = this.f41066b;
            IInterface iInterface = mmxVar.f41074a.f41131k;
            String str = mmxVar.f41075b;
            String str2 = this.f41065a;
            Bundle bundle = new Bundle();
            bundle.putAll(mmx.m16644b());
            bundle.putString("package.name", str2);
            try {
                numValueOf = Integer.valueOf(mmxVar.f41076c.getPackageManager().getPackageInfo(mmxVar.f41076c.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException e) {
                mmx.f41072d.m16287d("The current version of the app could not be retrieved", new Object[0]);
                numValueOf = null;
            }
            if (numValueOf != null) {
                bundle.putInt(HRLmc.Pmkx, numValueOf.intValue());
            }
            mmw mmwVar = new mmw(this.f41066b, this.f41067c, null, null);
            Parcel parcelM3398a = ((cbq) iInterface).m3398a();
            parcelM3398a.writeString(str);
            cbs.m3404c(parcelM3398a, bundle);
            cbs.m3405d(parcelM3398a, mmwVar);
            ((cbq) iInterface).m3397A(2, parcelM3398a);
        } catch (RemoteException e2) {
            mmx.f41072d.m16288e(e2, "requestUpdateInfo(%s)", this.f41065a);
            this.f41067c.m14244j(new RuntimeException(e2));
        }
    }
}
