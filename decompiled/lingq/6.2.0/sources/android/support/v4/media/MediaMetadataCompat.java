package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p000.C3275kv;
import p000.gv5;
import p000.hfb;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: c */
    public static final C3275kv f949c;

    /* JADX INFO: renamed from: a */
    public final Bundle f950a;

    /* JADX INFO: renamed from: b */
    public MediaMetadata f951b;

    static {
        C3275kv c3275kv = new C3275kv(0);
        f949c = c3275kv;
        c3275kv.put("android.media.metadata.TITLE", 1);
        c3275kv.put("android.media.metadata.ARTIST", 1);
        c3275kv.put("android.media.metadata.DURATION", 0);
        c3275kv.put("android.media.metadata.ALBUM", 1);
        c3275kv.put("android.media.metadata.AUTHOR", 1);
        c3275kv.put("android.media.metadata.WRITER", 1);
        c3275kv.put("android.media.metadata.COMPOSER", 1);
        c3275kv.put("android.media.metadata.COMPILATION", 1);
        c3275kv.put("android.media.metadata.DATE", 1);
        c3275kv.put("android.media.metadata.YEAR", 0);
        c3275kv.put("android.media.metadata.GENRE", 1);
        c3275kv.put("android.media.metadata.TRACK_NUMBER", 0);
        c3275kv.put("android.media.metadata.NUM_TRACKS", 0);
        c3275kv.put("android.media.metadata.DISC_NUMBER", 0);
        c3275kv.put("android.media.metadata.ALBUM_ARTIST", 1);
        c3275kv.put("android.media.metadata.ART", 2);
        c3275kv.put("android.media.metadata.ART_URI", 1);
        c3275kv.put("android.media.metadata.ALBUM_ART", 2);
        c3275kv.put("android.media.metadata.ALBUM_ART_URI", 1);
        c3275kv.put("android.media.metadata.USER_RATING", 3);
        c3275kv.put("android.media.metadata.RATING", 3);
        c3275kv.put("android.media.metadata.DISPLAY_TITLE", 1);
        c3275kv.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c3275kv.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c3275kv.put("android.media.metadata.DISPLAY_ICON", 2);
        c3275kv.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c3275kv.put("android.media.metadata.MEDIA_ID", 1);
        c3275kv.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c3275kv.put("android.media.metadata.MEDIA_URI", 1);
        c3275kv.put("android.media.metadata.ADVERTISEMENT", 0);
        c3275kv.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new hfb(19);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f950a = parcel.readBundle(gv5.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f950a);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f950a = bundle2;
        gv5.m12871x(bundle2);
    }
}
