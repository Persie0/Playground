package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtv extends jij {
    public static final Parcelable.Creator CREATOR = new jtt(3);

    /* JADX INFO: renamed from: a */
    public final String f34800a;

    public jtv(String str) {
        this.f34800a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34800a);
        jiy.m13283j(parcel, iM13281h);
    }
}
