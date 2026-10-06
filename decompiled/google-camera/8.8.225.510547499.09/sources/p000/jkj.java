package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkj extends jij {
    public static final Parcelable.Creator CREATOR = new jie(11);

    /* JADX INFO: renamed from: a */
    final String f34241a;

    /* JADX INFO: renamed from: b */
    final String f34242b;

    /* JADX INFO: renamed from: c */
    final String f34243c;

    /* JADX INFO: renamed from: d */
    final String f34244d;

    public jkj(String str, String str2, String str3, String str4) {
        this.f34241a = str;
        this.f34242b = str2;
        this.f34243c = str4;
        this.f34244d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34241a);
        jiy.m13296w(parcel, 3, this.f34242b);
        jiy.m13296w(parcel, 4, this.f34243c);
        jiy.m13296w(parcel, 5, this.f34244d);
        jiy.m13283j(parcel, iM13281h);
    }
}
