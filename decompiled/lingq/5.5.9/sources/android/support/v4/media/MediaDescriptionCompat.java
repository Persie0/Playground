package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0133a();

    /* JADX INFO: renamed from: a */
    public final String f341a;

    /* JADX INFO: renamed from: b */
    public final CharSequence f342b;

    /* JADX INFO: renamed from: c */
    public final CharSequence f343c;

    /* JADX INFO: renamed from: d */
    public final CharSequence f344d;

    /* JADX INFO: renamed from: e */
    public final Bitmap f345e;

    /* JADX INFO: renamed from: f */
    public final Uri f346f;

    /* JADX INFO: renamed from: g */
    public final Bundle f347g;

    /* JADX INFO: renamed from: h */
    public final Uri f348h;

    /* JADX INFO: renamed from: i */
    public MediaDescription f349i;

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0133a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m535a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    public static class C0134b {
        /* JADX INFO: renamed from: a */
        public static MediaDescription m536a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: b */
        public static MediaDescription.Builder m537b() {
            return new MediaDescription.Builder();
        }

        /* JADX INFO: renamed from: c */
        public static CharSequence m538c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* JADX INFO: renamed from: d */
        public static Bundle m539d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* JADX INFO: renamed from: e */
        public static Bitmap m540e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* JADX INFO: renamed from: f */
        public static Uri m541f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* JADX INFO: renamed from: g */
        public static String m542g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* JADX INFO: renamed from: h */
        public static CharSequence m543h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* JADX INFO: renamed from: i */
        public static CharSequence m544i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* JADX INFO: renamed from: j */
        public static void m545j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* JADX INFO: renamed from: k */
        public static void m546k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* JADX INFO: renamed from: l */
        public static void m547l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* JADX INFO: renamed from: m */
        public static void m548m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* JADX INFO: renamed from: n */
        public static void m549n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* JADX INFO: renamed from: o */
        public static void m550o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* JADX INFO: renamed from: p */
        public static void m551p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    public static class C0135c {
        /* JADX INFO: renamed from: a */
        public static Uri m552a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* JADX INFO: renamed from: b */
        public static void m553b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    public MediaDescriptionCompat() {
        throw null;
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f341a = str;
        this.f342b = charSequence;
        this.f343c = charSequence2;
        this.f344d = charSequence3;
        this.f345e = bitmap;
        this.f346f = uri;
        this.f347g = bundle;
        this.f348h = uri2;
    }

    /* JADX INFO: renamed from: a */
    public static MediaDescriptionCompat m535a(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strM542g = C0134b.m542g(mediaDescription);
        CharSequence charSequenceM544i = C0134b.m544i(mediaDescription);
        CharSequence charSequenceM543h = C0134b.m543h(mediaDescription);
        CharSequence charSequenceM538c = C0134b.m538c(mediaDescription);
        Bitmap bitmapM540e = C0134b.m540e(mediaDescription);
        Uri uriM541f = C0134b.m541f(mediaDescription);
        Bundle bundleM539d = C0134b.m539d(mediaDescription);
        if (bundleM539d != null) {
            bundleM539d = MediaSessionCompat.m635e(bundleM539d);
        }
        Uri uriM552a = bundleM539d != null ? (Uri) bundleM539d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriM552a == null) {
            bundle = bundleM539d;
        } else if (bundleM539d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM539d.size() == 2) {
            bundle = null;
        } else {
            bundleM539d.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM539d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM539d;
        }
        if (uriM552a == null) {
            uriM552a = C0135c.m552a(mediaDescription);
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM542g, charSequenceM544i, charSequenceM543h, charSequenceM538c, bitmapM540e, uriM541f, bundle, uriM552a);
        mediaDescriptionCompat.f349i = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f342b) + ", " + ((Object) this.f343c) + ", " + ((Object) this.f344d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescriptionM536a = this.f349i;
        if (mediaDescriptionM536a == null) {
            MediaDescription.Builder builderM537b = C0134b.m537b();
            C0134b.m549n(builderM537b, this.f341a);
            C0134b.m551p(builderM537b, this.f342b);
            C0134b.m550o(builderM537b, this.f343c);
            C0134b.m545j(builderM537b, this.f344d);
            C0134b.m547l(builderM537b, this.f345e);
            C0134b.m548m(builderM537b, this.f346f);
            C0134b.m546k(builderM537b, this.f347g);
            C0135c.m553b(builderM537b, this.f348h);
            mediaDescriptionM536a = C0134b.m536a(builderM537b);
            this.f349i = mediaDescriptionM536a;
        }
        mediaDescriptionM536a.writeToParcel(parcel, i10);
    }
}
