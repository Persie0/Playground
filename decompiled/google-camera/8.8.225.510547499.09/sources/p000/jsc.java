package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsc extends jij {
    public static final Parcelable.Creator CREATOR = new jri(15);

    /* JADX INFO: renamed from: a */
    public final int f34710a;

    /* JADX INFO: renamed from: b */
    public final int f34711b;

    public jsc(int i, int i2) {
        this.f34710a = i;
        this.f34711b = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34710a);
        jiy.m13287n(parcel, 3, this.f34711b);
        jiy.m13283j(parcel, iM13281h);
    }
}
