package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrf extends jij {
    public static final Parcelable.Creator CREATOR = new jny(20);

    /* JADX INFO: renamed from: a */
    public final int f34645a;

    public jrf(int i) {
        this.f34645a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34645a);
        jiy.m13283j(parcel, iM13281h);
    }
}
