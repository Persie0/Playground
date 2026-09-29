package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import p000.hfb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new hfb(20);

    /* JADX INFO: renamed from: a */
    public final MediaDescriptionCompat f955a;

    /* JADX INFO: renamed from: b */
    public final long f956b;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.f955a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.f956b = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f955a);
        sb.append(", Id=");
        return wq1.m24113i(this.f956b, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f955a.writeToParcel(parcel, i);
        parcel.writeLong(this.f956b);
    }
}
