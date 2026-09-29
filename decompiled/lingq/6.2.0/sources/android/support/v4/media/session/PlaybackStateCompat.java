package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p000.gv5;
import p000.hfb;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new hfb(25);

    /* JADX INFO: renamed from: a */
    public final int f967a;

    /* JADX INFO: renamed from: b */
    public final long f968b;

    /* JADX INFO: renamed from: c */
    public final long f969c;

    /* JADX INFO: renamed from: d */
    public final float f970d;

    /* JADX INFO: renamed from: e */
    public final long f971e;

    /* JADX INFO: renamed from: f */
    public final int f972f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f973g;

    /* JADX INFO: renamed from: h */
    public final long f974h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f975i;

    /* JADX INFO: renamed from: j */
    public final long f976j;

    /* JADX INFO: renamed from: k */
    public final Bundle f977k;

    /* JADX INFO: renamed from: l */
    public PlaybackState f978l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0031e();

        /* JADX INFO: renamed from: a */
        public final String f979a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f980b;

        /* JADX INFO: renamed from: c */
        public final int f981c;

        /* JADX INFO: renamed from: d */
        public final Bundle f982d;

        public CustomAction(Parcel parcel) {
            this.f979a = parcel.readString();
            this.f980b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f981c = parcel.readInt();
            this.f982d = parcel.readBundle(gv5.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f980b) + ", mIcon=" + this.f981c + ", mExtras=" + this.f982d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f979a);
            TextUtils.writeToParcel(this.f980b, parcel, i);
            parcel.writeInt(this.f981c);
            parcel.writeBundle(this.f982d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f967a = parcel.readInt();
        this.f968b = parcel.readLong();
        this.f970d = parcel.readFloat();
        this.f974h = parcel.readLong();
        this.f969c = parcel.readLong();
        this.f971e = parcel.readLong();
        this.f973g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f975i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f976j = parcel.readLong();
        this.f977k = parcel.readBundle(gv5.class.getClassLoader());
        this.f972f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f967a);
        sb.append(", position=");
        sb.append(this.f968b);
        sb.append(", buffered position=");
        sb.append(this.f969c);
        sb.append(", speed=");
        sb.append(this.f970d);
        sb.append(", updated=");
        sb.append(this.f974h);
        sb.append(", actions=");
        sb.append(this.f971e);
        sb.append(", error code=");
        sb.append(this.f972f);
        sb.append(", error message=");
        sb.append(this.f973g);
        sb.append(", custom actions=");
        sb.append(this.f975i);
        sb.append(", active item id=");
        return wq1.m24113i(this.f976j, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f967a);
        parcel.writeLong(this.f968b);
        parcel.writeFloat(this.f970d);
        parcel.writeLong(this.f974h);
        parcel.writeLong(this.f969c);
        parcel.writeLong(this.f971e);
        TextUtils.writeToParcel(this.f973g, parcel, i);
        parcel.writeTypedList(this.f975i);
        parcel.writeLong(this.f976j);
        parcel.writeBundle(this.f977k);
        parcel.writeInt(this.f972f);
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f967a = i;
        this.f968b = j;
        this.f969c = j2;
        this.f970d = f;
        this.f971e = j3;
        this.f972f = i2;
        this.f973g = charSequence;
        this.f974h = j4;
        this.f975i = new ArrayList(arrayList);
        this.f976j = j5;
        this.f977k = bundle;
    }
}
