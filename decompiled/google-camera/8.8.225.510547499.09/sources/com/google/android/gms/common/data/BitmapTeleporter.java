package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jbt;
import p000.jib;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BitmapTeleporter extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jbt(14);

    /* JADX INFO: renamed from: a */
    final int f7623a;

    /* JADX INFO: renamed from: b */
    ParcelFileDescriptor f7624b;

    /* JADX INFO: renamed from: c */
    final int f7625c;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f7623a = i;
        this.f7624b = parcelFileDescriptor;
        this.f7625c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f7624b == null) {
            jib.m13205j(null);
            throw null;
        }
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7623a);
        jiy.m13295v(parcel, 2, this.f7624b, i | 1);
        jiy.m13287n(parcel, 3, this.f7625c);
        jiy.m13283j(parcel, iM13281h);
        this.f7624b = null;
    }
}
