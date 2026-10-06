package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsi extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(1);

    /* JADX INFO: renamed from: a */
    public final int f34722a;

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor f34723b;

    public jsi(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f34722a = i;
        this.f34723b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34722a);
        jiy.m13295v(parcel, 3, this.f34723b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
