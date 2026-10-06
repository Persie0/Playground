package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jih extends jij {
    public static final Parcelable.Creator CREATOR = new jie(3);

    /* JADX INFO: renamed from: a */
    public final int f34127a;

    /* JADX INFO: renamed from: b */
    public List f34128b;

    public jih(int i, List list) {
        this.f34127a = i;
        this.f34128b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34127a);
        jiy.m13239A(parcel, 2, this.f34128b);
        jiy.m13283j(parcel, iM13281h);
    }
}
