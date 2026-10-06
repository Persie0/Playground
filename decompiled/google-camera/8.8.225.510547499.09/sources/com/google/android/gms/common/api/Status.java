package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import p000.jbt;
import p000.jcu;
import p000.jel;
import p000.jeu;
import p000.jib;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends jij implements ReflectedParcelable, jel {

    /* JADX INFO: renamed from: f */
    final int f7606f;

    /* JADX INFO: renamed from: g */
    public final int f7607g;

    /* JADX INFO: renamed from: h */
    public final String f7608h;

    /* JADX INFO: renamed from: i */
    public final PendingIntent f7609i;

    /* JADX INFO: renamed from: j */
    public final jcu f7610j;

    /* JADX INFO: renamed from: a */
    public static final Status f7601a = new Status(0);

    /* JADX INFO: renamed from: b */
    public static final Status f7602b = new Status(14);

    /* JADX INFO: renamed from: c */
    public static final Status f7603c = new Status(8);

    /* JADX INFO: renamed from: d */
    public static final Status f7604d = new Status(15);

    /* JADX INFO: renamed from: e */
    public static final Status f7605e = new Status(16);
    public static final Parcelable.Creator CREATOR = new jbt(13);

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent, jcu jcuVar) {
        this.f7606f = i;
        this.f7607g = i2;
        this.f7608h = str;
        this.f7609i = pendingIntent;
        this.f7610j = jcuVar;
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4645b() {
        return this.f7607g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7606f == status.f7606f && this.f7607g == status.f7607g && jib.m13209n(this.f7608h, status.f7608h) && jib.m13209n(this.f7609i, status.f7609i) && jib.m13209n(this.f7610j, status.f7610j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7606f), Integer.valueOf(this.f7607g), this.f7608h, this.f7609i, this.f7610j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String strM12980c = this.f7608h;
        if (strM12980c == null) {
            strM12980c = jeu.m12980c(this.f7607g);
        }
        jib.m13211p("statusCode", strM12980c, arrayList);
        jib.m13211p("resolution", this.f7609i, arrayList);
        return jib.m13210o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7607g);
        jiy.m13296w(parcel, 2, this.f7608h);
        jiy.m13295v(parcel, 3, this.f7609i, i);
        jiy.m13295v(parcel, 4, this.f7610j, i);
        jiy.m13287n(parcel, 1000, this.f7606f);
        jiy.m13283j(parcel, iM13281h);
    }

    public Status(int i, String str, byte[] bArr) {
        this(1, i, str, null, null);
    }
}
