package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import p000.C0050aw;
import p000.C0139dr;
import p000.C1109wy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* JADX INFO: renamed from: a */
    static final C1109wy f874a;

    /* JADX INFO: renamed from: b */
    final Bundle f875b;

    static {
        C1109wy c1109wy = new C1109wy();
        f874a = c1109wy;
        c1109wy.put("android.media.metadata.TITLE", 1);
        c1109wy.put("android.media.metadata.ARTIST", 1);
        c1109wy.put("android.media.metadata.DURATION", 0);
        c1109wy.put("android.media.metadata.ALBUM", 1);
        c1109wy.put("android.media.metadata.AUTHOR", 1);
        c1109wy.put("android.media.metadata.WRITER", 1);
        c1109wy.put(IuyLAqNmW.WtZ, 1);
        c1109wy.put(DNTdN.lFf, 1);
        c1109wy.put("android.media.metadata.DATE", 1);
        c1109wy.put("android.media.metadata.YEAR", 0);
        c1109wy.put("android.media.metadata.GENRE", 1);
        c1109wy.put("android.media.metadata.TRACK_NUMBER", 0);
        c1109wy.put("android.media.metadata.NUM_TRACKS", 0);
        c1109wy.put("android.media.metadata.DISC_NUMBER", 0);
        c1109wy.put("android.media.metadata.ALBUM_ARTIST", 1);
        c1109wy.put("android.media.metadata.ART", 2);
        c1109wy.put("android.media.metadata.ART_URI", 1);
        c1109wy.put(wUzNh.Izp, 2);
        c1109wy.put("android.media.metadata.ALBUM_ART_URI", 1);
        c1109wy.put("android.media.metadata.USER_RATING", 3);
        c1109wy.put("android.media.metadata.RATING", 3);
        c1109wy.put("android.media.metadata.DISPLAY_TITLE", 1);
        c1109wy.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c1109wy.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c1109wy.put("android.media.metadata.DISPLAY_ICON", 2);
        c1109wy.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c1109wy.put("android.media.metadata.MEDIA_ID", 1);
        c1109wy.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c1109wy.put("android.media.metadata.MEDIA_URI", 1);
        c1109wy.put("android.media.metadata.ADVERTISEMENT", 0);
        c1109wy.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        CREATOR = new C0050aw(7);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f875b = parcel.readBundle(C0139dr.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f875b);
    }
}
