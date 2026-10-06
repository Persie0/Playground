package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jki extends jij {
    public static final Parcelable.Creator CREATOR = new jie(9);

    /* JADX INFO: renamed from: a */
    public GoogleHelp f34235a;

    /* JADX INFO: renamed from: b */
    public final String f34236b;

    /* JADX INFO: renamed from: c */
    public final String f34237c;

    /* JADX INFO: renamed from: d */
    public final int f34238d;

    /* JADX INFO: renamed from: e */
    public final String f34239e;

    /* JADX INFO: renamed from: f */
    public final int f34240f;

    public jki(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2) {
        this.f34235a = googleHelp;
        this.f34236b = str;
        this.f34237c = str2;
        this.f34238d = i;
        this.f34239e = str3;
        this.f34240f = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        jie.m13224b(this, parcel, i);
    }
}
