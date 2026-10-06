package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jhc extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(18);

    /* JADX INFO: renamed from: a */
    public final jig f34029a;

    /* JADX INFO: renamed from: b */
    public final boolean f34030b;

    /* JADX INFO: renamed from: c */
    public final boolean f34031c;

    /* JADX INFO: renamed from: d */
    public final int[] f34032d;

    /* JADX INFO: renamed from: e */
    public final int f34033e;

    /* JADX INFO: renamed from: f */
    public final int[] f34034f;

    public jhc(jig jigVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f34029a = jigVar;
        this.f34030b = z;
        this.f34031c = z2;
        this.f34032d = iArr;
        this.f34033e = i;
        this.f34034f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 1, this.f34029a, i);
        jiy.m13284k(parcel, 2, this.f34030b);
        jiy.m13284k(parcel, 3, this.f34031c);
        jiy.m13293t(parcel, 4, this.f34032d);
        jiy.m13287n(parcel, 5, this.f34033e);
        jiy.m13293t(parcel, 6, this.f34034f);
        jiy.m13283j(parcel, iM13281h);
    }
}
