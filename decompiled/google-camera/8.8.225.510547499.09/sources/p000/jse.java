package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jse extends jij {
    public static final Parcelable.Creator CREATOR = new jri(17);

    /* JADX INFO: renamed from: a */
    public final int f34714a;

    /* JADX INFO: renamed from: b */
    public final AppTheme f34715b;

    public jse(int i, AppTheme appTheme) {
        this.f34714a = i;
        this.f34715b = appTheme;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34714a);
        jiy.m13295v(parcel, 3, this.f34715b, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
