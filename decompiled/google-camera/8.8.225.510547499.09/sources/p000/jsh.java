package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsh extends jij {
    public static final Parcelable.Creator CREATOR = new jri(20);

    /* JADX INFO: renamed from: a */
    public final int f34720a;

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor f34721b;

    public jsh(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f34720a = i;
        this.f34721b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34720a);
        jiy.m13295v(parcel, 3, this.f34721b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
