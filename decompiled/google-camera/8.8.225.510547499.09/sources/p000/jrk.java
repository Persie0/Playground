package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrk extends jij {
    public static final Parcelable.Creator CREATOR = new jri(3);

    /* JADX INFO: renamed from: a */
    public final int f34669a;

    /* JADX INFO: renamed from: b */
    public final List f34670b;

    /* JADX INFO: renamed from: c */
    public final jui f34671c;

    public jrk(int i, List list, jui juiVar) {
        this.f34669a = i;
        this.f34670b = list;
        this.f34671c = juiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34669a);
        jiy.m13239A(parcel, 2, this.f34670b);
        jiy.m13295v(parcel, 3, this.f34671c, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
