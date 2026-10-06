package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C0050aw;
import p000.C0137dp;
import p000.C0138dq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(6);

    /* JADX INFO: renamed from: a */
    public MediaDescription f865a;

    /* JADX INFO: renamed from: b */
    private final String f866b;

    /* JADX INFO: renamed from: c */
    private final CharSequence f867c;

    /* JADX INFO: renamed from: d */
    private final CharSequence f868d;

    /* JADX INFO: renamed from: e */
    private final CharSequence f869e;

    /* JADX INFO: renamed from: f */
    private final Bitmap f870f;

    /* JADX INFO: renamed from: g */
    private final Uri f871g;

    /* JADX INFO: renamed from: h */
    private final Bundle f872h;

    /* JADX INFO: renamed from: i */
    private final Uri f873i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f866b = str;
        this.f867c = charSequence;
        this.f868d = charSequence2;
        this.f869e = charSequence3;
        this.f870f = bitmap;
        this.f871g = uri;
        this.f872h = bundle;
        this.f873i = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f867c) + ", " + ((Object) this.f868d) + ", " + ((Object) this.f869e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescriptionM6506c = this.f865a;
        if (mediaDescriptionM6506c == null) {
            MediaDescription.Builder builderM6505b = C0137dp.m6505b();
            C0137dp.m6517n(builderM6505b, this.f866b);
            C0137dp.m6519p(builderM6505b, this.f867c);
            C0137dp.m6518o(builderM6505b, this.f868d);
            C0137dp.m6513j(builderM6505b, this.f869e);
            C0137dp.m6515l(builderM6505b, this.f870f);
            C0137dp.m6516m(builderM6505b, this.f871g);
            C0137dp.m6514k(builderM6505b, this.f872h);
            C0138dq.m6566b(builderM6505b, this.f873i);
            mediaDescriptionM6506c = C0137dp.m6506c(builderM6505b);
            this.f865a = mediaDescriptionM6506c;
        }
        mediaDescriptionM6506c.writeToParcel(parcel, i);
    }
}
