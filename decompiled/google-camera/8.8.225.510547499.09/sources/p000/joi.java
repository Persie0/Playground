package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joi extends jij implements Comparable {
    public static final Parcelable.Creator CREATOR = new jny(9);

    /* JADX INFO: renamed from: a */
    public final int f34479a;

    /* JADX INFO: renamed from: b */
    public final int f34480b;

    public joi(int i, int i2) {
        this.f34479a = i;
        this.f34480b = i2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(joi joiVar) {
        int i = this.f34479a;
        int i2 = joiVar.f34479a;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = this.f34480b;
        int i4 = joiVar.f34480b;
        if (i3 < i4) {
            return -1;
        }
        return i3 > i4 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof joi) && compareTo((joi) obj) == 0;
    }

    public final int hashCode() {
        return (this.f34479a * 31) + this.f34480b;
    }

    public final String toString() {
        return hiCTUJiAxf.tLGKU + "(" + this.f34479a + ", " + this.f34480b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34479a);
        jiy.m13287n(parcel, 2, this.f34480b);
        jiy.m13283j(parcel, iM13281h);
    }
}
