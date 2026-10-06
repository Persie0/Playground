package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtr extends jij {
    public static final Parcelable.Creator CREATOR = new jtt(1);

    /* JADX INFO: renamed from: a */
    public final int f34794a;

    /* JADX INFO: renamed from: b */
    public final jsa f34795b;

    public jtr(int i, jsa jsaVar) {
        this.f34794a = i;
        this.f34795b = jsaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34794a);
        jiy.m13295v(parcel, 3, this.f34795b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
