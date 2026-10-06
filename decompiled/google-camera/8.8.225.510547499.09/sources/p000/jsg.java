package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsg extends jij {
    public static final Parcelable.Creator CREATOR = new jri(19);

    /* JADX INFO: renamed from: a */
    public final int f34718a;

    /* JADX INFO: renamed from: b */
    public final jrq f34719b;

    public jsg(int i, jrq jrqVar) {
        this.f34718a = i;
        this.f34719b = jrqVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34718a);
        jiy.m13295v(parcel, 3, this.f34719b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
