package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsm extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(3);

    /* JADX INFO: renamed from: a */
    public final int f34730a;

    /* JADX INFO: renamed from: b */
    public final boolean f34731b;

    public jsm(int i, boolean z) {
        this.f34730a = i;
        this.f34731b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34730a);
        jiy.m13284k(parcel, 3, this.f34731b);
        jiy.m13283j(parcel, iM13281h);
    }
}
