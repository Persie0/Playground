package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: dv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0143dv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(15);

    /* JADX INFO: renamed from: a */
    InterfaceC0142du f12623a;

    public C0143dv(Parcel parcel) {
        InterfaceC0142du c0140ds;
        IBinder strongBinder = parcel.readStrongBinder();
        if (strongBinder == null) {
            c0140ds = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0140ds = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0142du)) ? new C0140ds(strongBinder) : (InterfaceC0142du) iInterfaceQueryLocalInterface;
        }
        this.f12623a = c0140ds;
    }

    /* JADX INFO: renamed from: a */
    protected void mo1021a() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f12623a == null) {
                this.f12623a = new BinderC0141dt(this);
            }
            parcel.writeStrongBinder(this.f12623a.asBinder());
        }
    }
}
