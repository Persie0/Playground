package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0167a();

    /* JADX INFO: renamed from: a */
    public InterfaceC0169a f428a;

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$a */
    public class C0167a implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.os.ResultReceiver$b */
    public class BinderC0168b extends InterfaceC0169a.a {
        public BinderC0168b() {
        }
    }

    public ResultReceiver(Parcel parcel) {
        InterfaceC0169a c10583a;
        IBinder strongBinder = parcel.readStrongBinder();
        int i10 = InterfaceC0169a.a.f430a;
        if (strongBinder == null) {
            c10583a = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c10583a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0169a)) ? new InterfaceC0169a.a.C10583a(strongBinder) : (InterfaceC0169a) iInterfaceQueryLocalInterface;
        }
        this.f428a = c10583a;
    }

    /* JADX INFO: renamed from: a */
    public void mo534a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f428a == null) {
                this.f428a = new BinderC0168b();
            }
            parcel.writeStrongBinder(this.f428a.asBinder());
        }
    }
}
