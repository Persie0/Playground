package android.support.v4.os;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.f98;
import p000.gy3;
import p000.hfb;

/* JADX INFO: loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new hfb(29);

    /* JADX INFO: renamed from: a */
    public gy3 f997a;

    /* JADX INFO: renamed from: a */
    public void mo628a(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.f997a == null) {
                    this.f997a = new f98(this);
                }
                parcel.writeStrongBinder(this.f997a.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
