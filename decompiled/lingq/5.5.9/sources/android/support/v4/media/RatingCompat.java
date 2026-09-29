package android.support.v4.media;

import android.annotation.SuppressLint;
import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0138a();

    /* JADX INFO: renamed from: a */
    public final int f354a;

    /* JADX INFO: renamed from: b */
    public final float f355b;

    /* JADX INFO: renamed from: c */
    public Object f356c;

    /* JADX INFO: renamed from: android.support.v4.media.RatingCompat$a */
    public class C0138a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.RatingCompat$b */
    public static class C0139b {
        /* JADX INFO: renamed from: a */
        public static float m556a(Rating rating) {
            return rating.getPercentRating();
        }

        /* JADX INFO: renamed from: b */
        public static int m557b(Rating rating) {
            return rating.getRatingStyle();
        }

        /* JADX INFO: renamed from: c */
        public static float m558c(Rating rating) {
            return rating.getStarRating();
        }

        /* JADX INFO: renamed from: d */
        public static boolean m559d(Rating rating) {
            return rating.hasHeart();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m560e(Rating rating) {
            return rating.isRated();
        }

        /* JADX INFO: renamed from: f */
        public static boolean m561f(Rating rating) {
            return rating.isThumbUp();
        }

        /* JADX INFO: renamed from: g */
        public static Rating m562g(boolean z10) {
            return Rating.newHeartRating(z10);
        }

        /* JADX INFO: renamed from: h */
        public static Rating m563h(float f3) {
            return Rating.newPercentageRating(f3);
        }

        /* JADX INFO: renamed from: i */
        public static Rating m564i(int i10, float f3) {
            return Rating.newStarRating(i10, f3);
        }

        /* JADX INFO: renamed from: j */
        public static Rating m565j(boolean z10) {
            return Rating.newThumbRating(z10);
        }

        /* JADX INFO: renamed from: k */
        public static Rating m566k(int i10) {
            return Rating.newUnratedRating(i10);
        }
    }

    public RatingCompat(int i10, float f3) {
        this.f354a = i10;
        this.f355b = f3;
    }

    /* JADX INFO: renamed from: a */
    public static RatingCompat m555a(Object obj) {
        RatingCompat ratingCompat;
        float f3;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int iM557b = C0139b.m557b(rating);
            if (!C0139b.m560e(rating)) {
                switch (iM557b) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        ratingCompat2 = new RatingCompat(iM557b, -1.0f);
                        break;
                }
            } else {
                switch (iM557b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, C0139b.m559d(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, C0139b.m561f(rating) ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float fM558c = C0139b.m558c(rating);
                        if (iM557b == 3) {
                            f3 = 3.0f;
                        } else if (iM557b == 4) {
                            f3 = 4.0f;
                        } else if (iM557b != 5) {
                            Log.e("Rating", "Invalid rating style (" + iM557b + ") for a star rating");
                        } else {
                            f3 = 5.0f;
                        }
                        if (fM558c >= 0.0f && fM558c <= f3) {
                            ratingCompat2 = new RatingCompat(iM557b, fM558c);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        float fM556a = C0139b.m556a(rating);
                        if (fM556a >= 0.0f && fM556a <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, fM556a);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f356c = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f354a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Rating:style=");
        sb2.append(this.f354a);
        sb2.append(" rating=");
        float f3 = this.f355b;
        sb2.append(f3 < 0.0f ? "unrated" : String.valueOf(f3));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f354a);
        parcel.writeFloat(this.f355b);
    }
}
