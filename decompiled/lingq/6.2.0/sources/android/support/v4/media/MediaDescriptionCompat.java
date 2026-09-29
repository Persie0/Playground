package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;
import p000.hu5;
import p000.iu5;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new hfb(18);

    /* JADX INFO: renamed from: a */
    public final String f940a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f941b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f942c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f943d;

    /* JADX INFO: renamed from: e */
    public final Bitmap f944e;

    /* JADX INFO: renamed from: f */
    public final Uri f945f;

    /* JADX INFO: renamed from: g */
    public final Bundle f946g;

    /* JADX INFO: renamed from: h */
    public final Uri f947h;

    /* JADX INFO: renamed from: i */
    public MediaDescription f948i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f940a = str;
        this.f941b = charSequence;
        this.f942c = charSequence2;
        this.f943d = charSequence3;
        this.f944e = bitmap;
        this.f945f = uri;
        this.f946g = bundle;
        this.f947h = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f941b) + ", " + ((Object) this.f942c) + ", " + ((Object) this.f943d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM13465a = this.f948i;
        if (mediaDescriptionM13465a == null) {
            MediaDescription.Builder builderM13466b = hu5.m13466b();
            hu5.m13478n(builderM13466b, this.f940a);
            hu5.m13480p(builderM13466b, this.f941b);
            hu5.m13479o(builderM13466b, this.f942c);
            hu5.m13474j(builderM13466b, this.f943d);
            hu5.m13476l(builderM13466b, this.f944e);
            hu5.m13477m(builderM13466b, this.f945f);
            hu5.m13475k(builderM13466b, this.f946g);
            iu5.m14153b(builderM13466b, this.f947h);
            mediaDescriptionM13465a = hu5.m13465a(builderM13466b);
            this.f948i = mediaDescriptionM13465a;
        }
        mediaDescriptionM13465a.writeToParcel(parcel, i);
    }
}
