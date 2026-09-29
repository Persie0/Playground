package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;
import p000.npa;
import p000.xx3;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new hfb(21);

    /* JADX INFO: renamed from: b */
    public final Object f959b;

    /* JADX INFO: renamed from: c */
    public xx3 f960c;

    /* JADX INFO: renamed from: a */
    public final Object f958a = new Object();

    /* JADX INFO: renamed from: d */
    public npa f961d = null;

    public MediaSessionCompat$Token(Parcelable parcelable, BinderC0028b binderC0028b) {
        this.f959b = parcelable;
        this.f960c = binderC0028b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).f959b;
        Object obj3 = this.f959b;
        if (obj3 == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f959b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.f959b, i);
    }
}
