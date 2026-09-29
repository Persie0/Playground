package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
final class DefaultLazyKey implements Parcelable {
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new C0132a();

    /* JADX INFO: renamed from: a */
    public final int f2491a;

    public DefaultLazyKey(int i) {
        this.f2491a = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DefaultLazyKey) && this.f2491a == ((DefaultLazyKey) obj).f2491a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2491a);
    }

    public final String toString() {
        return wq1.m24122r(new StringBuilder("DefaultLazyKey(index="), this.f2491a, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2491a);
    }
}
