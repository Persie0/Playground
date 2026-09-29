package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import p326q.C8446b;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final C8446b<String, Integer> f350c;

    /* JADX INFO: renamed from: a */
    public final Bundle f351a;

    /* JADX INFO: renamed from: b */
    public MediaMetadata f352b;

    /* JADX INFO: renamed from: android.support.v4.media.MediaMetadataCompat$a */
    public class C0136a implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0137b {

        /* JADX INFO: renamed from: a */
        public final Bundle f353a = new Bundle();

        /* JADX INFO: renamed from: a */
        public final void m554a(String str, String str2) {
            C8446b<String, Integer> c8446b = MediaMetadataCompat.f350c;
            if (c8446b.containsKey(str) && c8446b.getOrDefault(str, null).intValue() != 1) {
                throw new IllegalArgumentException(C0141b.m611g("The ", str, " key cannot be used to put a String"));
            }
            this.f353a.putCharSequence(str, str2);
        }
    }

    static {
        C8446b<String, Integer> c8446b = new C8446b<>();
        f350c = c8446b;
        c8446b.put("android.media.metadata.TITLE", 1);
        c8446b.put("android.media.metadata.ARTIST", 1);
        c8446b.put("android.media.metadata.DURATION", 0);
        c8446b.put("android.media.metadata.ALBUM", 1);
        c8446b.put("android.media.metadata.AUTHOR", 1);
        c8446b.put("android.media.metadata.WRITER", 1);
        c8446b.put("android.media.metadata.COMPOSER", 1);
        c8446b.put("android.media.metadata.COMPILATION", 1);
        c8446b.put("android.media.metadata.DATE", 1);
        c8446b.put("android.media.metadata.YEAR", 0);
        c8446b.put("android.media.metadata.GENRE", 1);
        c8446b.put("android.media.metadata.TRACK_NUMBER", 0);
        c8446b.put("android.media.metadata.NUM_TRACKS", 0);
        c8446b.put("android.media.metadata.DISC_NUMBER", 0);
        c8446b.put("android.media.metadata.ALBUM_ARTIST", 1);
        c8446b.put("android.media.metadata.ART", 2);
        c8446b.put("android.media.metadata.ART_URI", 1);
        c8446b.put("android.media.metadata.ALBUM_ART", 2);
        c8446b.put("android.media.metadata.ALBUM_ART_URI", 1);
        c8446b.put("android.media.metadata.USER_RATING", 3);
        c8446b.put("android.media.metadata.RATING", 3);
        c8446b.put("android.media.metadata.DISPLAY_TITLE", 1);
        c8446b.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c8446b.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c8446b.put("android.media.metadata.DISPLAY_ICON", 2);
        c8446b.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c8446b.put("android.media.metadata.MEDIA_ID", 1);
        c8446b.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c8446b.put("android.media.metadata.MEDIA_URI", 1);
        c8446b.put("android.media.metadata.ADVERTISEMENT", 0);
        c8446b.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0136a();
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f351a = bundle2;
        MediaSessionCompat.m633a(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f351a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f351a);
    }
}
