package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import gb.C5743g;
import p176ib.C6272i;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C5743g();

    /* JADX INFO: renamed from: a */
    public final int f13871a;

    /* JADX INFO: renamed from: b */
    public final String f13872b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public Scope() {
        throw null;
    }

    public Scope(String str, int i10) {
        C6272i.m12913g("scopeUri must not be null or empty", str);
        this.f13871a = i10;
        this.f13872b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f13872b.equals(((Scope) obj).f13872b);
    }

    public final int hashCode() {
        return this.f13872b.hashCode();
    }

    public final String toString() {
        return this.f13872b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, this.f13871a);
        C0987y.m3832n(parcel, 2, this.f13872b);
        C0987y.m3839u(parcel, iM3836r);
    }
}
