package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsd extends jij {
    public static final Parcelable.Creator CREATOR = new jri(16);

    /* JADX INFO: renamed from: a */
    public final int f34712a;

    /* JADX INFO: renamed from: b */
    public final List f34713b;

    public jsd(int i, List list) {
        this.f34712a = i;
        this.f34713b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34712a);
        jiy.m13239A(parcel, 3, this.f34713b);
        jiy.m13283j(parcel, iM13281h);
    }
}
