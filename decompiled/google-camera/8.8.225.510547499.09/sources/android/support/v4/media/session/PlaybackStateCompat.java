package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.List;
import p000.C0050aw;
import p000.C0139dr;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(13);

    /* JADX INFO: renamed from: a */
    final int f887a;

    /* JADX INFO: renamed from: b */
    final long f888b;

    /* JADX INFO: renamed from: c */
    final long f889c;

    /* JADX INFO: renamed from: d */
    final float f890d;

    /* JADX INFO: renamed from: e */
    final long f891e;

    /* JADX INFO: renamed from: f */
    final int f892f;

    /* JADX INFO: renamed from: g */
    final CharSequence f893g;

    /* JADX INFO: renamed from: h */
    final long f894h;

    /* JADX INFO: renamed from: i */
    final List f895i;

    /* JADX INFO: renamed from: j */
    final long f896j;

    /* JADX INFO: renamed from: k */
    final Bundle f897k;

    /* JADX INFO: compiled from: PG */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = new C0050aw(14);

        /* JADX INFO: renamed from: a */
        private final String f898a;

        /* JADX INFO: renamed from: b */
        private final CharSequence f899b;

        /* JADX INFO: renamed from: c */
        private final int f900c;

        /* JADX INFO: renamed from: d */
        private final Bundle f901d;

        public CustomAction(Parcel parcel) {
            this.f898a = parcel.readString();
            this.f899b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f900c = parcel.readInt();
            this.f901d = parcel.readBundle(C0139dr.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f899b) + ", mIcon=" + this.f900c + ", mExtras=" + this.f901d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f898a);
            TextUtils.writeToParcel(this.f899b, parcel, i);
            parcel.writeInt(this.f900c);
            parcel.writeBundle(this.f901d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f887a = parcel.readInt();
        this.f888b = parcel.readLong();
        this.f890d = parcel.readFloat();
        this.f894h = parcel.readLong();
        this.f889c = parcel.readLong();
        this.f891e = parcel.readLong();
        this.f893g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f895i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f896j = parcel.readLong();
        this.f897k = parcel.readBundle(C0139dr.class.getClassLoader());
        this.f892f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f887a + ", position=" + this.f888b + ", buffered position=" + this.f889c + ", speed=" + this.f890d + ", updated=" + this.f894h + ", actions=" + this.f891e + ", error code=" + this.f892f + rgoX.eGOJD + this.f893g + ", custom actions=" + this.f895i + ", active item id=" + this.f896j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f887a);
        parcel.writeLong(this.f888b);
        parcel.writeFloat(this.f890d);
        parcel.writeLong(this.f894h);
        parcel.writeLong(this.f889c);
        parcel.writeLong(this.f891e);
        TextUtils.writeToParcel(this.f893g, parcel, i);
        parcel.writeTypedList(this.f895i);
        parcel.writeLong(this.f896j);
        parcel.writeBundle(this.f897k);
        parcel.writeInt(this.f892f);
    }
}
