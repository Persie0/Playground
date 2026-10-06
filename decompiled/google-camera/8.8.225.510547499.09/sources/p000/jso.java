package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class jso extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(5);

    /* JADX INFO: renamed from: a */
    public final int f34734a;

    /* JADX INFO: renamed from: b */
    public final ConnectionConfiguration f34735b;

    public jso(int i, ConnectionConfiguration connectionConfiguration) {
        this.f34734a = i;
        this.f34735b = connectionConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34734a);
        jiy.m13295v(parcel, 3, this.f34735b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
