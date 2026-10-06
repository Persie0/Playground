package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkr extends jij {
    public static final Parcelable.Creator CREATOR = new jie(12);

    /* JADX INFO: renamed from: a */
    final int f34253a;

    /* JADX INFO: renamed from: b */
    final String f34254b;

    /* JADX INFO: renamed from: c */
    final Intent f34255c;

    public jkr(int i, String str, Intent intent) {
        this.f34253a = i;
        this.f34254b = str;
        this.f34255c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34253a);
        jiy.m13296w(parcel, 3, this.f34254b);
        jiy.m13295v(parcel, 4, this.f34255c, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
