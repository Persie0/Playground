package p152hb;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.internal.TelemetryData;
import p136gc.C5752h;
import p176ib.C6276k;
import p197jb.C6442a;
import p197jb.C6444c;
import p197jb.C6445d;
import p412ub.C9514c;

/* JADX INFO: renamed from: hb.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5976h1 extends AbstractC5989m {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC5989m.a f35496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5976h1(AbstractC5989m.a aVar, Feature[] featureArr, boolean z10) {
        super(featureArr, z10);
        this.f35496c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.AbstractC5989m
    /* JADX INFO: renamed from: a */
    public final void mo12422a(C2542a.e eVar, C5752h c5752h) throws RemoteException {
        TelemetryData telemetryData = (TelemetryData) this.f35496c.f35529a.f9487a;
        C2542a<C6276k> c2542a = C6444c.f36992k;
        C6442a c6442a = (C6442a) ((C6445d) eVar).m12871C();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c6442a.f49017b);
        int i10 = C9514c.f49018a;
        if (telemetryData == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            telemetryData.writeToParcel(parcelObtain, 0);
        }
        try {
            c6442a.f49016a.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            c5752h.m12114b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }
}
