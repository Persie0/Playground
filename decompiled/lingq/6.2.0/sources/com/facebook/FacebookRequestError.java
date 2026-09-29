package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import p000.C3670v2;
import p000.nj0;
import p000.py2;
import p000.qy2;

/* JADX INFO: loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final int f11357a;

    /* JADX INFO: renamed from: b */
    public final int f11358b;

    /* JADX INFO: renamed from: c */
    public final int f11359c;

    /* JADX INFO: renamed from: d */
    public final String f11360d;

    /* JADX INFO: renamed from: e */
    public final String f11361e;

    /* JADX INFO: renamed from: f */
    public final String f11362f;

    /* JADX INFO: renamed from: g */
    public final Object f11363g;

    /* JADX INFO: renamed from: h */
    public final String f11364h;

    /* JADX INFO: renamed from: i */
    public final FacebookException f11365i;

    /* JADX INFO: renamed from: j */
    public static final nj0 f11356j = new nj0(11);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new C3670v2(2);

    /* JADX INFO: loaded from: classes2.dex */
    public enum Category {
        LOGIN_RECOVERABLE,
        OTHER,
        TRANSIENT
    }

    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z) {
        Set set;
        Set set2;
        Set set3;
        Category category;
        this.f11357a = i;
        this.f11358b = i2;
        this.f11359c = i3;
        this.f11360d = str;
        this.f11361e = str3;
        this.f11362f = str4;
        this.f11363g = obj;
        this.f11364h = str2;
        nj0 nj0Var = f11356j;
        if (facebookException != null) {
            this.f11365i = facebookException;
            category = Category.OTHER;
        } else {
            this.f11365i = new FacebookServiceException(this, m5184a());
            qy2 qy2VarM17455m = nj0Var.m17455m();
            Map map = qy2VarM17455m.f58372b;
            Map map2 = qy2VarM17455m.f58373c;
            Map map3 = qy2VarM17455m.f58371a;
            category = z ? Category.TRANSIENT : (map3 != null && map3.containsKey(Integer.valueOf(i2)) && ((set3 = (Set) map3.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) ? Category.OTHER : (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = (Set) map2.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) ? Category.LOGIN_RECOVERABLE : (map != null && map.containsKey(Integer.valueOf(i2)) && ((set = (Set) map.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) ? Category.TRANSIENT : Category.OTHER;
        }
        nj0Var.m17455m();
        if (category == null) {
            return;
        }
        int i4 = py2.f56976a[category.ordinal()];
    }

    /* JADX INFO: renamed from: a */
    public final String m5184a() {
        String str = this.f11364h;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.f11365i;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.f11357a + ", errorCode: " + this.f11358b + ", subErrorCode: " + this.f11359c + ", errorType: " + this.f11360d + ", errorMessage: " + m5184a() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f11357a);
        parcel.writeInt(this.f11358b);
        parcel.writeInt(this.f11359c);
        parcel.writeString(this.f11360d);
        parcel.writeString(m5184a());
        parcel.writeString(this.f11361e);
        parcel.writeString(this.f11362f);
    }

    public FacebookRequestError(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public FacebookRequestError(String str, int i, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
