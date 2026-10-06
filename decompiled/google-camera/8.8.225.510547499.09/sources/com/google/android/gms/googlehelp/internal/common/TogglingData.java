package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jie;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TogglingData extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jie(13);

    /* JADX INFO: renamed from: a */
    String f7750a;

    /* JADX INFO: renamed from: b */
    String f7751b;

    /* JADX INFO: renamed from: c */
    public String f7752c;

    private TogglingData() {
    }

    public TogglingData(String str, String str2, String str3) {
        this.f7750a = str;
        this.f7751b = str2;
        this.f7752c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f7750a);
        jiy.m13296w(parcel, 3, this.f7751b);
        jiy.m13296w(parcel, 4, this.f7752c);
        jiy.m13283j(parcel, iM13281h);
    }
}
