package td;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: td.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9255c0 extends C9272t {
    public C9255c0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    /* JADX INFO: renamed from: e */
    public final void m17618e(Bundle bundle) throws RemoteException {
        Parcel parcelM17632h = m17632h();
        int i10 = C9274v.f47976a;
        parcelM17632h.writeInt(1);
        bundle.writeToParcel(parcelM17632h, 0);
        m17633j(parcelM17632h, 3);
    }
}
