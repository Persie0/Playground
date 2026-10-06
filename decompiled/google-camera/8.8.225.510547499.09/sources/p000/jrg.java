package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrg extends jij {
    public static final Parcelable.Creator CREATOR = new jri(1);

    /* JADX INFO: renamed from: a */
    public final byte f34646a;

    /* JADX INFO: renamed from: b */
    public final byte f34647b;

    /* JADX INFO: renamed from: c */
    public final String f34648c;

    public jrg(byte b, byte b2, String str) {
        this.f34646a = b;
        this.f34647b = b2;
        this.f34648c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jrg jrgVar = (jrg) obj;
        return this.f34646a == jrgVar.f34646a && this.f34647b == jrgVar.f34647b && this.f34648c.equals(jrgVar.f34648c);
    }

    public final int hashCode() {
        return ((((this.f34646a + 31) * 31) + this.f34647b) * 31) + this.f34648c.hashCode();
    }

    public final String toString() {
        byte b = this.f34646a;
        byte b2 = this.f34647b;
        return "AmsEntityUpdateParcelable{, mEntityId=" + ((int) b) + ", mAttributeId=" + ((int) b2) + ", mValue='" + this.f34648c + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13285l(parcel, 2, this.f34646a);
        jiy.m13285l(parcel, 3, this.f34647b);
        jiy.m13296w(parcel, 4, this.f34648c);
        jiy.m13283j(parcel, iM13281h);
    }
}
