package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsu extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(11);

    /* JADX INFO: renamed from: a */
    public final int f34746a;

    /* JADX INFO: renamed from: b */
    public final jtn f34747b;

    public jsu(int i, jtn jtnVar) {
        this.f34746a = i;
        this.f34747b = jtnVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34746a);
        jiy.m13295v(parcel, 3, this.f34747b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
