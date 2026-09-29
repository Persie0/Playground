package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0158a();

    /* JADX INFO: renamed from: a */
    public final int f400a;

    /* JADX INFO: renamed from: b */
    public final long f401b;

    /* JADX INFO: renamed from: c */
    public final long f402c;

    /* JADX INFO: renamed from: d */
    public final float f403d;

    /* JADX INFO: renamed from: e */
    public final long f404e;

    /* JADX INFO: renamed from: f */
    public final int f405f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f406g;

    /* JADX INFO: renamed from: h */
    public final long f407h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f408i;

    /* JADX INFO: renamed from: j */
    public final long f409j;

    /* JADX INFO: renamed from: k */
    public final Bundle f410k;

    /* JADX INFO: renamed from: l */
    public PlaybackState f411l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0157a();

        /* JADX INFO: renamed from: a */
        public final String f412a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f413b;

        /* JADX INFO: renamed from: c */
        public final int f414c;

        /* JADX INFO: renamed from: d */
        public final Bundle f415d;

        /* JADX INFO: renamed from: e */
        public PlaybackState.CustomAction f416e;

        /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$a */
        public class C0157a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f412a = parcel.readString();
            this.f413b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f414c = parcel.readInt();
            this.f415d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.f412a = str;
            this.f413b = charSequence;
            this.f414c = i10;
            this.f415d = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f413b) + ", mIcon=" + this.f414c + ", mExtras=" + this.f415d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f412a);
            TextUtils.writeToParcel(this.f413b, parcel, i10);
            parcel.writeInt(this.f414c);
            parcel.writeBundle(this.f415d);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$a */
    public class C0158a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$b */
    public static class C0159b {
        /* JADX INFO: renamed from: a */
        public static void m700a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        /* JADX INFO: renamed from: b */
        public static PlaybackState.CustomAction m701b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: c */
        public static PlaybackState m702c(PlaybackState.Builder builder) {
            return builder.build();
        }

        /* JADX INFO: renamed from: d */
        public static PlaybackState.Builder m703d() {
            return new PlaybackState.Builder();
        }

        /* JADX INFO: renamed from: e */
        public static PlaybackState.CustomAction.Builder m704e(String str, CharSequence charSequence, int i10) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i10);
        }

        /* JADX INFO: renamed from: f */
        public static String m705f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        /* JADX INFO: renamed from: g */
        public static long m706g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        /* JADX INFO: renamed from: h */
        public static long m707h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        /* JADX INFO: renamed from: i */
        public static long m708i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        /* JADX INFO: renamed from: j */
        public static List<PlaybackState.CustomAction> m709j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        /* JADX INFO: renamed from: k */
        public static CharSequence m710k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        /* JADX INFO: renamed from: l */
        public static Bundle m711l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        /* JADX INFO: renamed from: m */
        public static int m712m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        /* JADX INFO: renamed from: n */
        public static long m713n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        /* JADX INFO: renamed from: o */
        public static CharSequence m714o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        /* JADX INFO: renamed from: p */
        public static float m715p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        /* JADX INFO: renamed from: q */
        public static long m716q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        /* JADX INFO: renamed from: r */
        public static int m717r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        /* JADX INFO: renamed from: s */
        public static void m718s(PlaybackState.Builder builder, long j10) {
            builder.setActions(j10);
        }

        /* JADX INFO: renamed from: t */
        public static void m719t(PlaybackState.Builder builder, long j10) {
            builder.setActiveQueueItemId(j10);
        }

        /* JADX INFO: renamed from: u */
        public static void m720u(PlaybackState.Builder builder, long j10) {
            builder.setBufferedPosition(j10);
        }

        /* JADX INFO: renamed from: v */
        public static void m721v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        /* JADX INFO: renamed from: w */
        public static void m722w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* JADX INFO: renamed from: x */
        public static void m723x(PlaybackState.Builder builder, int i10, long j10, float f3, long j11) {
            builder.setState(i10, j10, f3, j11);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$c */
    public static class C0160c {
        /* JADX INFO: renamed from: a */
        public static Bundle m724a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        /* JADX INFO: renamed from: b */
        public static void m725b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.session.PlaybackStateCompat$d */
    public static final class C0161d {

        /* JADX INFO: renamed from: b */
        public int f418b;

        /* JADX INFO: renamed from: c */
        public long f419c;

        /* JADX INFO: renamed from: d */
        public float f420d;

        /* JADX INFO: renamed from: e */
        public long f421e;

        /* JADX INFO: renamed from: f */
        public long f422f;

        /* JADX INFO: renamed from: a */
        public final ArrayList f417a = new ArrayList();

        /* JADX INFO: renamed from: g */
        public final long f423g = -1;

        /* JADX INFO: renamed from: a */
        public final PlaybackStateCompat m726a() {
            return new PlaybackStateCompat(this.f418b, this.f419c, 0L, this.f420d, this.f421e, 0, null, this.f422f, this.f417a, this.f423g, null);
        }
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f3, long j12, int i11, CharSequence charSequence, long j13, ArrayList arrayList, long j14, Bundle bundle) {
        this.f400a = i10;
        this.f401b = j10;
        this.f402c = j11;
        this.f403d = f3;
        this.f404e = j12;
        this.f405f = i11;
        this.f406g = charSequence;
        this.f407h = j13;
        this.f408i = new ArrayList(arrayList);
        this.f409j = j14;
        this.f410k = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f400a = parcel.readInt();
        this.f401b = parcel.readLong();
        this.f403d = parcel.readFloat();
        this.f407h = parcel.readLong();
        this.f402c = parcel.readLong();
        this.f404e = parcel.readLong();
        this.f406g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f408i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f409j = parcel.readLong();
        this.f410k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f405f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f400a + ", position=" + this.f401b + ", buffered position=" + this.f402c + ", speed=" + this.f403d + ", updated=" + this.f407h + ", actions=" + this.f404e + ", error code=" + this.f405f + ", error message=" + this.f406g + ", custom actions=" + this.f408i + ", active item id=" + this.f409j + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f400a);
        parcel.writeLong(this.f401b);
        parcel.writeFloat(this.f403d);
        parcel.writeLong(this.f407h);
        parcel.writeLong(this.f402c);
        parcel.writeLong(this.f404e);
        TextUtils.writeToParcel(this.f406g, parcel, i10);
        parcel.writeTypedList(this.f408i);
        parcel.writeLong(this.f409j);
        parcel.writeBundle(this.f410k);
        parcel.writeInt(this.f405f);
    }
}
