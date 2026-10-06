package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpv extends jij {
    public static final Parcelable.Creator CREATOR = new jny(14);

    /* JADX INFO: renamed from: a */
    public final String f34570a;

    /* JADX INFO: renamed from: b */
    public final byte[] f34571b;

    /* JADX INFO: renamed from: c */
    public final List f34572c;

    public jpv(String str, byte[] bArr, List list) {
        this.f34570a = str;
        this.f34571b = bArr;
        this.f34572c = list == null ? new ArrayList(0) : new ArrayList(list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpv)) {
            return false;
        }
        jpv jpvVar = (jpv) obj;
        return jib.m13209n(this.f34570a, jpvVar.f34570a) && jib.m13209n(this.f34571b, jpvVar.f34571b) && jib.m13209n(this.f34572c, jpvVar.f34572c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34570a, this.f34571b, this.f34572c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34570a);
        jiy.m13290q(parcel, 2, this.f34571b);
        ArrayList arrayList = new ArrayList(this.f34572c);
        int iM13282i = jiy.m13282i(parcel, 3);
        int size = arrayList.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) arrayList.get(i2)).intValue());
        }
        jiy.m13283j(parcel, iM13282i);
        jiy.m13283j(parcel, iM13281h);
    }
}
