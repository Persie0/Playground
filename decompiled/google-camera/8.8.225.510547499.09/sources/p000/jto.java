package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jto extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(18);

    /* JADX INFO: renamed from: a */
    public final int f34787a;

    /* JADX INFO: renamed from: b */
    public final jrt f34788b;

    public jto(int i, jrt jrtVar) {
        this.f34787a = i;
        this.f34788b = jrtVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34787a);
        jiy.m13295v(parcel, 3, this.f34788b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
