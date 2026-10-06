package p000;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mna extends cbr implements IInterface {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mmx f41091b;

    /* JADX INFO: renamed from: c */
    public final khb f41092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mna(mmx mmxVar, khb khbVar, byte[] bArr, byte[] bArr2) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f41091b = mmxVar;
        this.f41092c = khbVar;
    }

    /* JADX INFO: renamed from: b */
    public void mo16641b(Bundle bundle) {
        this.f41091b.f41074a.m16664f(this.f41092c);
    }

    /* JADX INFO: renamed from: c */
    public void mo16642c(Bundle bundle) {
        this.f41091b.f41074a.m16664f(this.f41092c);
    }

    @Override // p000.cbr
    /* JADX INFO: renamed from: x */
    protected final boolean mo3401x(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Bundle bundle = (Bundle) cbs.m3402a(parcel, Bundle.CREATOR);
                cbs.m3403b(parcel);
                mo16642c(bundle);
                return true;
            case 3:
                Bundle bundle2 = (Bundle) cbs.m3402a(parcel, Bundle.CREATOR);
                cbs.m3403b(parcel);
                mo16641b(bundle2);
                return true;
            default:
                return false;
        }
    }
}
