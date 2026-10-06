package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhb extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(17);

    /* JADX INFO: renamed from: a */
    Bundle f34025a;

    /* JADX INFO: renamed from: b */
    jcw[] f34026b;

    /* JADX INFO: renamed from: c */
    int f34027c;

    /* JADX INFO: renamed from: d */
    public jhc f34028d;

    public jhb() {
    }

    public jhb(Bundle bundle, jcw[] jcwVarArr, int i, jhc jhcVar) {
        this.f34025a = bundle;
        this.f34026b = jcwVarArr;
        this.f34027c = i;
        this.f34028d = jhcVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13289p(parcel, 1, this.f34025a);
        jiy.m13299z(parcel, 2, this.f34026b, i);
        jiy.m13287n(parcel, 3, this.f34027c);
        jiy.m13295v(parcel, 4, this.f34028d, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
