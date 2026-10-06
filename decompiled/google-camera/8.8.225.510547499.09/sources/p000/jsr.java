package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsr extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(8);

    /* JADX INFO: renamed from: a */
    public final int f34740a;

    /* JADX INFO: renamed from: b */
    public final jsa f34741b;

    public jsr(int i, jsa jsaVar) {
        this.f34740a = i;
        this.f34741b = jsaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34740a);
        jiy.m13295v(parcel, 3, this.f34741b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
