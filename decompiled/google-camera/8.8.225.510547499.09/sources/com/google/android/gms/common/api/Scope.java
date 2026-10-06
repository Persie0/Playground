package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jbt;
import p000.jib;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new jbt(12);

    /* JADX INFO: renamed from: a */
    final int f7599a;

    /* JADX INFO: renamed from: b */
    public final String f7600b;

    public Scope(int i, String str) {
        jib.m13204i(str, "scopeUri must not be null or empty");
        this.f7599a = i;
        this.f7600b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f7600b.equals(((Scope) obj).f7600b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7600b.hashCode();
    }

    public final String toString() {
        return this.f7600b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7599a);
        jiy.m13296w(parcel, 2, this.f7600b);
        jiy.m13283j(parcel, iM13281h);
    }

    public Scope(String str) {
        this(1, str);
    }
}
