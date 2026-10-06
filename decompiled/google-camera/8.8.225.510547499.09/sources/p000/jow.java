package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jow extends jij implements jel {
    public static final Parcelable.Creator CREATOR = new jny(10);

    /* JADX INFO: renamed from: a */
    final int f34504a;

    /* JADX INFO: renamed from: b */
    public int f34505b;

    /* JADX INFO: renamed from: c */
    public Intent f34506c;

    public jow() {
        this(2, 0, null);
    }

    public jow(int i, int i2, Intent intent) {
        this.f34504a = i;
        this.f34505b = i2;
        this.f34506c = intent;
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        return this.f34505b == 0 ? Status.f7601a : Status.f7605e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34504a);
        jiy.m13287n(parcel, 2, this.f34505b);
        jiy.m13295v(parcel, 3, this.f34506c, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
