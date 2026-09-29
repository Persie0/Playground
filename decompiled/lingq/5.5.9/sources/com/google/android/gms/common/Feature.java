package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p176ib.C6268g;

/* JADX INFO: loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new C2558j();

    /* JADX INFO: renamed from: a */
    public final String f13860a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final int f13861b;

    /* JADX INFO: renamed from: c */
    public final long f13862c;

    public Feature() {
        this.f13860a = "CLIENT_TELEMETRY";
        this.f13862c = 1L;
        this.f13861b = -1;
    }

    public Feature(String str, int i10, long j10) {
        this.f13860a = str;
        this.f13861b = i10;
        this.f13862c = j10;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.f13860a;
            if (str == null || !str.equals(feature.f13860a)) {
                if (str == null && feature.f13860a == null) {
                    if (m7531q() == feature.m7531q()) {
                        return true;
                    }
                }
            } else if (m7531q() == feature.m7531q()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13860a, Long.valueOf(m7531q())});
    }

    /* JADX INFO: renamed from: q */
    public final long m7531q() {
        long j10 = this.f13862c;
        return j10 == -1 ? this.f13861b : j10;
    }

    public final String toString() {
        C6268g.a aVar = new C6268g.a(this);
        aVar.m12906a(this.f13860a, "name");
        aVar.m12906a(Long.valueOf(m7531q()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 1, this.f13860a);
        C0987y.m3829k(parcel, 2, this.f13861b);
        C0987y.m3830l(parcel, 3, m7531q());
        C0987y.m3839u(parcel, iM3836r);
    }
}
