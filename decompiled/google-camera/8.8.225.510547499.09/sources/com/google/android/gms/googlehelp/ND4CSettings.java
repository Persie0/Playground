package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jie;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ND4CSettings extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jie(10);

    /* JADX INFO: renamed from: a */
    boolean f7748a;

    /* JADX INFO: renamed from: b */
    String f7749b;

    public ND4CSettings() {
        this(true, "");
    }

    public ND4CSettings(boolean z, String str) {
        this.f7748a = z;
        this.f7749b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13284k(parcel, 2, this.f7748a);
        jiy.m13296w(parcel, 3, this.f7749b);
        jiy.m13283j(parcel, iM13281h);
    }
}
