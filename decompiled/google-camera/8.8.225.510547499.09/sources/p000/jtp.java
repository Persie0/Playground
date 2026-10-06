package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtp extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(19);

    /* JADX INFO: renamed from: a */
    public final String f34789a;

    /* JADX INFO: renamed from: b */
    public final String f34790b;

    /* JADX INFO: renamed from: c */
    public final long f34791c;

    public jtp(String str, String str2, long j) {
        this.f34789a = str;
        this.f34790b = str2;
        this.f34791c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34789a);
        jiy.m13296w(parcel, 3, this.f34790b);
        jiy.m13288o(parcel, 4, this.f34791c);
        jiy.m13283j(parcel, iM13281h);
    }
}
