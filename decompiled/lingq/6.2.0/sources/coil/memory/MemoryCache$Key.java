package coil.memory;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p000.C3670v2;
import p000.fa4;

/* JADX INFO: loaded from: classes.dex */
public final class MemoryCache$Key implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<MemoryCache$Key> CREATOR = new C3670v2(6);

    /* JADX INFO: renamed from: a */
    public final String f10564a;

    /* JADX INFO: renamed from: b */
    public final Map f10565b;

    public MemoryCache$Key(String str, Map map) {
        this.f10564a = str;
        this.f10565b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemoryCache$Key)) {
            return false;
        }
        MemoryCache$Key memoryCache$Key = (MemoryCache$Key) obj;
        return fa4.m11650l(this.f10564a, memoryCache$Key.f10564a) && fa4.m11650l(this.f10565b, memoryCache$Key.f10565b);
    }

    public final int hashCode() {
        return this.f10565b.hashCode() + (this.f10564a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f10564a + ", extras=" + this.f10565b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10564a);
        Map map = this.f10565b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
