package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.FetchedAppSettingsManager;
import dm.C5207g;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import p067d8.C5069i;
import p067d8.C5074n;
import p291o7.C8004n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/facebook/FacebookRequestError;", "Landroid/os/Parcelable;", "Category", "b", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1})
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final int f11438a;

    /* JADX INFO: renamed from: b */
    public final int f11439b;

    /* JADX INFO: renamed from: c */
    public final int f11440c;

    /* JADX INFO: renamed from: d */
    public final String f11441d;

    /* JADX INFO: renamed from: e */
    public final String f11442e;

    /* JADX INFO: renamed from: f */
    public final String f11443f;

    /* JADX INFO: renamed from: g */
    public final Object f11444g;

    /* JADX INFO: renamed from: h */
    public final String f11445h;

    /* JADX INFO: renamed from: i */
    public final FacebookException f11446i;

    /* JADX INFO: renamed from: j */
    public static final C2275b f11437j = new C2275b();
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C2274a();

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/facebook/FacebookRequestError$Category;", "", "(Ljava/lang/String;I)V", "LOGIN_RECOVERABLE", "OTHER", "TRANSIENT", "facebook-core_release"}, m13366k = 1, m13367mv = {1, 5, 1}, m13369xi = 48)
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT;

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Category[] valuesCustom() {
            Category[] categoryArrValuesCustom = values();
            return (Category[]) Arrays.copyOf(categoryArrValuesCustom, categoryArrValuesCustom.length);
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$a */
    public static final class C2274a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), null, null, false);
        }

        @Override // android.os.Parcelable.Creator
        public final FacebookRequestError[] newArray(int i10) {
            return new FacebookRequestError[i10];
        }
    }

    /* JADX INFO: renamed from: com.facebook.FacebookRequestError$b */
    public static final class C2275b {
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public FacebookRequestError(int i10, int i11, int i12, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z10) {
        boolean z11;
        C5069i c5069iM10765a;
        Category category;
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        C5069i c5069iM10765a2;
        this.f11438a = i10;
        this.f11439b = i11;
        this.f11440c = i12;
        this.f11441d = str;
        this.f11442e = str3;
        this.f11443f = str4;
        this.f11444g = obj;
        this.f11445h = str2;
        if (facebookException != null) {
            this.f11446i = facebookException;
            z11 = true;
        } else {
            this.f11446i = new FacebookServiceException(this, m6602a());
            z11 = false;
        }
        C2275b c2275b = f11437j;
        if (z11) {
            category = Category.OTHER;
        } else {
            synchronized (c2275b) {
                try {
                    FetchedAppSettingsManager fetchedAppSettingsManager = FetchedAppSettingsManager.f11550a;
                    C5074n c5074nM6670b = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
                    c5069iM10765a = c5074nM6670b == null ? C5069i.f32950d.m10765a() : c5074nM6670b.f32974h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z10) {
                c5069iM10765a.getClass();
                category = Category.TRANSIENT;
            } else {
                Map<Integer, Set<Integer>> map = c5069iM10765a.f32952a;
                if (map != null && map.containsKey(Integer.valueOf(i11)) && ((set3 = map.get(Integer.valueOf(i11))) == null || set3.contains(Integer.valueOf(i12)))) {
                    category = Category.OTHER;
                } else {
                    Map<Integer, Set<Integer>> map2 = c5069iM10765a.f32954c;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i11)) && ((set2 = map2.get(Integer.valueOf(i11))) == null || set2.contains(Integer.valueOf(i12)))) {
                        category = Category.LOGIN_RECOVERABLE;
                    } else {
                        Map<Integer, Set<Integer>> map3 = c5069iM10765a.f32953b;
                        category = (map3 != null && map3.containsKey(Integer.valueOf(i11)) && ((set = map3.get(Integer.valueOf(i11))) == null || set.contains(Integer.valueOf(i12)))) ? Category.TRANSIENT : Category.OTHER;
                    }
                }
            }
        }
        synchronized (c2275b) {
            FetchedAppSettingsManager fetchedAppSettingsManager2 = FetchedAppSettingsManager.f11550a;
            C5074n c5074nM6670b2 = FetchedAppSettingsManager.m6670b(C8004n.m15872b());
            c5069iM10765a2 = c5074nM6670b2 == null ? C5069i.f32950d.m10765a() : c5074nM6670b2.f32974h;
        }
        c5069iM10765a2.getClass();
        if (category == null) {
            return;
        }
        int i13 = C5069i.b.f32955a[category.ordinal()];
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(String str, int i10, String str2) {
        this(-1, i10, -1, str, str2, null, null, null, null, false);
    }

    /* JADX INFO: renamed from: a */
    public final String m6602a() {
        String localizedMessage = this.f11445h;
        if (localizedMessage == null) {
            FacebookException facebookException = this.f11446i;
            if (facebookException == null) {
                return null;
            }
            localizedMessage = facebookException.getLocalizedMessage();
        }
        return localizedMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f11438a + ", errorCode: " + this.f11439b + ", subErrorCode: " + this.f11440c + ", errorType: " + this.f11441d + ", errorMessage: " + m6602a() + "}";
        C5207g.m11110e(str, "StringBuilder(\"{HttpStatus: \")\n        .append(requestStatusCode)\n        .append(\", errorCode: \")\n        .append(errorCode)\n        .append(\", subErrorCode: \")\n        .append(subErrorCode)\n        .append(\", errorType: \")\n        .append(errorType)\n        .append(\", errorMessage: \")\n        .append(errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "out");
        parcel.writeInt(this.f11438a);
        parcel.writeInt(this.f11439b);
        parcel.writeInt(this.f11440c);
        parcel.writeString(this.f11441d);
        parcel.writeString(m6602a());
        parcel.writeString(this.f11442e);
        parcel.writeString(this.f11443f);
    }
}
