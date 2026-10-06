package p000;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.wearable.complications.ComplicationData;
import p000.C0050aw;

/* JADX INFO: renamed from: aw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0050aw implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f2570a;

    public C0050aw(int i) {
        this.f2570a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(final Parcel parcel) {
        switch (this.f2570a) {
            case 0:
                return new C0051ax(parcel);
            case 1:
                return new C0049av(parcel);
            case 2:
                return new C0095cn(parcel);
            case 3:
                return new C0112cr(parcel);
            case 4:
                return new C0115cu(parcel);
            case 5:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator CREATOR = new C0050aw(5);

                    /* JADX INFO: renamed from: a */
                    private final int f863a;

                    /* JADX INFO: renamed from: b */
                    private final MediaDescriptionCompat f864b;

                    {
                        this.f863a = parcel.readInt();
                        this.f864b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f863a + ", mDescription=" + this.f864b + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeInt(this.f863a);
                        this.f864b.writeToParcel(parcel2, i);
                    }
                };
            case 6:
                Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
                if (objCreateFromParcel == null) {
                    return null;
                }
                MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
                String strM6512i = C0137dp.m6512i(mediaDescription);
                CharSequence charSequenceM6511h = C0137dp.m6511h(mediaDescription);
                CharSequence charSequenceM6510g = C0137dp.m6510g(mediaDescription);
                CharSequence charSequenceM6509f = C0137dp.m6509f(mediaDescription);
                Bitmap bitmapM6504a = C0137dp.m6504a(mediaDescription);
                Uri uriM6507d = C0137dp.m6507d(mediaDescription);
                Bundle bundleM6508e = C0137dp.m6508e(mediaDescription);
                if (bundleM6508e != null) {
                    bundleM6508e = C0139dr.m6612a(bundleM6508e);
                }
                Uri uri = bundleM6508e != null ? (Uri) bundleM6508e.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
                if (uri != null) {
                    if (bundleM6508e.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM6508e.size() == 2) {
                        bundleM6508e = null;
                    } else {
                        bundleM6508e.remove("android.support.v4.media.description.MEDIA_URI");
                        bundleM6508e.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                    }
                }
                MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM6512i, charSequenceM6511h, charSequenceM6510g, charSequenceM6509f, bitmapM6504a, uriM6507d, bundleM6508e, uri == null ? C0138dq.m6565a(mediaDescription) : uri);
                mediaDescriptionCompat.f865a = mediaDescription;
                return mediaDescriptionCompat;
            case 7:
                return new MediaMetadataCompat(parcel);
            case 8:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 9:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator CREATOR = new C0050aw(9);

                    /* JADX INFO: renamed from: a */
                    private final MediaDescriptionCompat f878a;

                    /* JADX INFO: renamed from: b */
                    private final long f879b;

                    {
                        this.f878a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f879b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f878a + ", Id=" + this.f879b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f878a.writeToParcel(parcel2, i);
                        parcel2.writeLong(this.f879b);
                    }
                };
            case 10:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    public static final Parcelable.Creator CREATOR = new C0050aw(10);

                    /* JADX INFO: renamed from: a */
                    final ResultReceiver f880a;

                    {
                        this.f880a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        this.f880a.writeToParcel(parcel2, i);
                    }
                };
            case 11:
                final Parcelable parcelable = parcel.readParcelable(null);
                return new Parcelable(parcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator CREATOR = new C0050aw(11);

                    /* JADX INFO: renamed from: a */
                    private final Object f881a;

                    {
                        this.f881a = parcelable;
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
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.f881a;
                        if (obj2 == null) {
                            return mediaSessionCompat$Token.f881a == null;
                        }
                        Object obj3 = mediaSessionCompat$Token.f881a;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.f881a;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, java.lang.Object] */
                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i) {
                        parcel2.writeParcelable(this.f881a, i);
                    }
                };
            case 12:
                return new ParcelableVolumeInfo(parcel);
            case 13:
                return new PlaybackStateCompat(parcel);
            case 14:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 15:
                return new C0143dv(parcel);
            case 16:
                return new C0741jh(parcel);
            case 17:
                return new C0788la(parcel);
            case 18:
                return new C0842na(parcel);
            case 19:
                return new C0843nb(parcel);
            default:
                return new ComplicationData(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f2570a) {
            case 0:
                return new C0051ax[i];
            case 1:
                return new C0049av[i];
            case 2:
                return new C0095cn[i];
            case 3:
                return new C0112cr[i];
            case 4:
                return new C0115cu[i];
            case 5:
                return new MediaBrowserCompat$MediaItem[i];
            case 6:
                return new MediaDescriptionCompat[i];
            case 7:
                return new MediaMetadataCompat[i];
            case 8:
                return new RatingCompat[i];
            case 9:
                return new MediaSessionCompat$QueueItem[i];
            case 10:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 11:
                return new MediaSessionCompat$Token[i];
            case 12:
                return new ParcelableVolumeInfo[i];
            case 13:
                return new PlaybackStateCompat[i];
            case 14:
                return new PlaybackStateCompat.CustomAction[i];
            case 15:
                return new C0143dv[i];
            case 16:
                return new C0741jh[i];
            case 17:
                return new C0788la[i];
            case 18:
                return new C0842na[i];
            case 19:
                return new C0843nb[i];
            default:
                return new ComplicationData[i];
        }
    }
}
