package p000;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class w2c extends wpb implements nvb {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3434os f66311f;

    public w2c(InterfaceC3434os interfaceC3434os) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f66311f = interfaceC3434os;
    }

    @Override // p000.wpb
    /* JADX INFO: renamed from: F */
    public final boolean mo3072F(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(this.f66311f);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) bqb.m4105b(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        bqb.m4109f(parcel);
        mo10690h(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.nvb
    /* JADX INFO: renamed from: d */
    public final int mo10689d() {
        return System.identityHashCode(this.f66311f);
    }

    @Override // p000.nvb
    /* JADX INFO: renamed from: h */
    public final void mo10690h(long j, Bundle bundle, String str, String str2) {
        this.f66311f.mo10094a(j, bundle, str, str2);
    }
}
