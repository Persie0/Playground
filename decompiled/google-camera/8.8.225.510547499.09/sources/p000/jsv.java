package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsv extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(12);

    /* JADX INFO: renamed from: a */
    public final int f34748a;

    /* JADX INFO: renamed from: b */
    public final String f34749b;

    public jsv(int i, String str) {
        this.f34748a = i;
        this.f34749b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34748a);
        jiy.m13296w(parcel, 3, this.f34749b);
        jiy.m13283j(parcel, iM13281h);
    }
}
