package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jqi extends jij {
    public static final Parcelable.Creator CREATOR = new jny(16);

    /* JADX INFO: renamed from: a */
    public final int f34591a;

    /* JADX INFO: renamed from: b */
    public final boolean f34592b;

    /* JADX INFO: renamed from: c */
    public final List f34593c;

    /* JADX INFO: renamed from: d */
    public final int f34594d;

    /* JADX INFO: renamed from: e */
    public final String f34595e;

    /* JADX INFO: renamed from: f */
    public final boolean f34596f;

    public jqi(int i, boolean z, List list, int i2, String str, boolean z2) {
        ArrayList arrayList = new ArrayList();
        this.f34593c = arrayList;
        this.f34591a = i;
        this.f34592b = z;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f34594d = i2;
        this.f34595e = str;
        this.f34596f = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34591a);
        jiy.m13284k(parcel, 3, this.f34592b);
        jiy.m13298y(parcel, 4, this.f34593c);
        jiy.m13287n(parcel, 5, this.f34594d);
        jiy.m13296w(parcel, 6, this.f34595e);
        jiy.m13284k(parcel, 7, this.f34596f);
        jiy.m13283j(parcel, iM13281h);
    }
}
