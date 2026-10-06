package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpb extends jij {
    public static final Parcelable.Creator CREATOR = new jny(12);

    /* JADX INFO: renamed from: a */
    final int f34525a;

    /* JADX INFO: renamed from: b */
    final jic f34526b;

    public jpb(int i, jic jicVar) {
        this.f34525a = i;
        this.f34526b = jicVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34525a);
        jiy.m13295v(parcel, 2, this.f34526b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
