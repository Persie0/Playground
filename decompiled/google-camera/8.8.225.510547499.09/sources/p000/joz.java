package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joz extends jij implements jel {
    public static final Parcelable.Creator CREATOR = new jny(11);

    /* JADX INFO: renamed from: a */
    public final List f34507a;

    /* JADX INFO: renamed from: b */
    public final String f34508b;

    public joz(List list, String str) {
        this.f34507a = list;
        this.f34508b = str;
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        return this.f34508b != null ? Status.f7601a : Status.f7605e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13298y(parcel, 1, this.f34507a);
        jiy.m13296w(parcel, 2, this.f34508b);
        jiy.m13283j(parcel, iM13281h);
    }
}
