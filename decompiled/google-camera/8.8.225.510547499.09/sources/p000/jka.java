package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jka extends jij {
    public static final Parcelable.Creator CREATOR = new jie(6);

    /* JADX INFO: renamed from: a */
    final String f34222a;

    /* JADX INFO: renamed from: b */
    final boolean f34223b;

    /* JADX INFO: renamed from: c */
    final boolean f34224c;

    /* JADX INFO: renamed from: d */
    final boolean f34225d;

    /* JADX INFO: renamed from: e */
    final boolean f34226e;

    public jka(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f34222a = str;
        this.f34223b = z;
        this.f34224c = z2;
        this.f34225d = z3;
        this.f34226e = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34222a);
        jiy.m13284k(parcel, 3, this.f34223b);
        jiy.m13284k(parcel, 4, this.f34224c);
        jiy.m13284k(parcel, 5, this.f34225d);
        jiy.m13284k(parcel, 6, this.f34226e);
        jiy.m13283j(parcel, iM13281h);
    }
}
