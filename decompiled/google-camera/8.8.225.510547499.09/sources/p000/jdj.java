package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jdj extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(10);

    /* JADX INFO: renamed from: a */
    public final boolean f33790a;

    /* JADX INFO: renamed from: b */
    public final String f33791b;

    /* JADX INFO: renamed from: c */
    public final int f33792c;

    /* JADX INFO: renamed from: d */
    public final int f33793d;

    public jdj(boolean z, String str, int i, int i2) {
        this.f33790a = z;
        this.f33791b = str;
        this.f33792c = jeu.m12981e(i) - 1;
        this.f33793d = jeu.m12982f(i2) - 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m12925a() {
        return jeu.m12981e(this.f33792c);
    }

    /* JADX INFO: renamed from: b */
    public final void m12926b() {
        jeu.m12982f(this.f33793d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13284k(parcel, 1, this.f33790a);
        jiy.m13296w(parcel, 2, this.f33791b);
        jiy.m13287n(parcel, 3, this.f33792c);
        jiy.m13287n(parcel, 4, this.f33793d);
        jiy.m13283j(parcel, iM13281h);
    }
}
