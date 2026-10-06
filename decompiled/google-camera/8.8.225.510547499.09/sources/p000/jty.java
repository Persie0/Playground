package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jty extends jij {
    public static final Parcelable.Creator CREATOR = new jtt(6);

    /* JADX INFO: renamed from: a */
    public final int f34806a;

    /* JADX INFO: renamed from: b */
    public final long f34807b;

    /* JADX INFO: renamed from: c */
    public final List f34808c;

    public jty(int i, long j, List list) {
        this.f34806a = i;
        this.f34807b = j;
        this.f34808c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34806a);
        jiy.m13288o(parcel, 3, this.f34807b);
        jiy.m13239A(parcel, 4, this.f34808c);
        jiy.m13283j(parcel, iM13281h);
    }
}
