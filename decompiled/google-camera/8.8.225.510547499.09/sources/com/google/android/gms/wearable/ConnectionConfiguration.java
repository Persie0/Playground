package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import java.util.List;
import p000.jib;
import p000.jij;
import p000.jiy;
import p000.jny;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ConnectionConfiguration extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jny(18);

    /* JADX INFO: renamed from: a */
    public final String f7772a;

    /* JADX INFO: renamed from: b */
    public final String f7773b;

    /* JADX INFO: renamed from: c */
    public final int f7774c;

    /* JADX INFO: renamed from: d */
    public final int f7775d;

    /* JADX INFO: renamed from: e */
    public final boolean f7776e;

    /* JADX INFO: renamed from: f */
    public final boolean f7777f;

    /* JADX INFO: renamed from: g */
    public volatile String f7778g;

    /* JADX INFO: renamed from: h */
    public final boolean f7779h;

    /* JADX INFO: renamed from: i */
    public final String f7780i;

    /* JADX INFO: renamed from: j */
    public final String f7781j;

    /* JADX INFO: renamed from: k */
    public final int f7782k;

    /* JADX INFO: renamed from: l */
    public final List f7783l;

    /* JADX INFO: renamed from: m */
    public final boolean f7784m;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, List list, boolean z4) {
        this.f7772a = str;
        this.f7773b = str2;
        this.f7774c = i;
        this.f7775d = i2;
        this.f7776e = z;
        this.f7777f = z2;
        this.f7778g = str3;
        this.f7779h = z3;
        this.f7780i = str4;
        this.f7781j = str5;
        this.f7782k = i3;
        this.f7783l = list;
        this.f7784m = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return jib.m13209n(this.f7772a, connectionConfiguration.f7772a) && jib.m13209n(this.f7773b, connectionConfiguration.f7773b) && jib.m13209n(Integer.valueOf(this.f7774c), Integer.valueOf(connectionConfiguration.f7774c)) && jib.m13209n(Integer.valueOf(this.f7775d), Integer.valueOf(connectionConfiguration.f7775d)) && jib.m13209n(Boolean.valueOf(this.f7776e), Boolean.valueOf(connectionConfiguration.f7776e)) && jib.m13209n(Boolean.valueOf(this.f7779h), Boolean.valueOf(connectionConfiguration.f7779h)) && jib.m13209n(Boolean.valueOf(this.f7784m), Boolean.valueOf(connectionConfiguration.f7784m));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7772a, this.f7773b, Integer.valueOf(this.f7774c), Integer.valueOf(this.f7775d), Boolean.valueOf(this.f7776e), Boolean.valueOf(this.f7779h), Boolean.valueOf(this.f7784m)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.f7772a + ", Address=" + this.f7773b + ", Type=" + this.f7774c + ", Role=" + this.f7775d + ", Enabled=" + this.f7776e + ", IsConnected=" + this.f7777f + ", PeerNodeId=" + this.f7778g + ", BtlePriority=" + this.f7779h + ", NodeId=" + this.f7780i + ", PackageName=" + this.f7781j + ", ConnectionRetryStrategy=" + this.f7782k + ", allowedConfigPackages=" + this.f7783l + ", Migrating=" + this.f7784m + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f7772a);
        jiy.m13296w(parcel, 3, this.f7773b);
        jiy.m13287n(parcel, 4, this.f7774c);
        jiy.m13287n(parcel, 5, this.f7775d);
        jiy.m13284k(parcel, 6, this.f7776e);
        jiy.m13284k(parcel, 7, this.f7777f);
        jiy.m13296w(parcel, 8, this.f7778g);
        jiy.m13284k(parcel, 9, this.f7779h);
        jiy.m13296w(parcel, 10, this.f7780i);
        jiy.m13296w(parcel, 11, this.f7781j);
        jiy.m13287n(parcel, 12, this.f7782k);
        jiy.m13298y(parcel, 13, this.f7783l);
        jiy.m13284k(parcel, 14, this.f7784m);
        jiy.m13283j(parcel, iM13281h);
    }
}
