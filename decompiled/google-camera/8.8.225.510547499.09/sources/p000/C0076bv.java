package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: bv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0076bv implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0821mg(1);

    /* JADX INFO: renamed from: a */
    final Bundle f4515a;

    public C0076bv(Parcel parcel, ClassLoader classLoader) {
        Bundle bundle = parcel.readBundle();
        this.f4515a = bundle;
        if (classLoader == null || bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f4515a);
    }
}
