package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jst extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(10);

    /* JADX INFO: renamed from: a */
    public final int f34744a;

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor f34745b;

    public jst(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f34744a = i;
        this.f34745b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34744a);
        jiy.m13295v(parcel, 3, this.f34745b, i | 1);
        jiy.m13283j(parcel, iM13281h);
    }
}
