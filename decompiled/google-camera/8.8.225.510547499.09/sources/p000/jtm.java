package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtm extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(16);

    /* JADX INFO: renamed from: a */
    public final String f34781a;

    /* JADX INFO: renamed from: b */
    public final DataHolder f34782b;

    public jtm(String str, DataHolder dataHolder) {
        this.f34781a = str;
        this.f34782b = dataHolder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34781a);
        jiy.m13295v(parcel, 2, this.f34782b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
