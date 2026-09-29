package com.lingq.core.analytics.data;

import android.os.Parcel;
import android.os.Parcelable;
import p000.fa4;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes.dex */
public interface LqAnalyticsValues$LessonPath extends Parcelable {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Deeplink implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Deeplink f14306a = new Deeplink();
        public static final Parcelable.Creator<Deeplink> CREATOR = new C1241a();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public static final class Feed implements LqAnalyticsValues$LessonPath, Parcelable {
        public static final Parcelable.Creator<Feed> CREATOR = new C1242b();

        /* JADX INFO: renamed from: a */
        public final String f14307a;

        public Feed(String str) {
            str.getClass();
            this.f14307a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Feed) && fa4.m11650l(this.f14307a, ((Feed) obj).f14307a);
        }

        public final int hashCode() {
            return this.f14307a.hashCode();
        }

        public final String toString() {
            return wq1.m24118n("Feed(shelf=", this.f14307a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f14307a);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LessonComplete implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final LessonComplete f14308a = new LessonComplete();
        public static final Parcelable.Creator<LessonComplete> CREATOR = new C1243c();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class LessonInfo implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final LessonInfo f14309a = new LessonInfo();
        public static final Parcelable.Creator<LessonInfo> CREATOR = new C1244d();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Playlist implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Playlist f14310a = new Playlist();
        public static final Parcelable.Creator<Playlist> CREATOR = new C1245e();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Search implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Search f14311a = new Search();
        public static final Parcelable.Creator<Search> CREATOR = new C1246f();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class SearchShelf implements LqAnalyticsValues$LessonPath, Parcelable {
        public static final Parcelable.Creator<SearchShelf> CREATOR = new C1247g();

        /* JADX INFO: renamed from: a */
        public final String f14312a;

        public SearchShelf(String str) {
            str.getClass();
            this.f14312a = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m7029a() {
            return this.f14312a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchShelf) && fa4.m11650l(this.f14312a, ((SearchShelf) obj).f14312a);
        }

        public final int hashCode() {
            return this.f14312a.hashCode();
        }

        public final String toString() {
            return wq1.m24118n("SearchShelf(shelf=", this.f14312a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f14312a);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class URL implements LqAnalyticsValues$LessonPath, Parcelable {
        public static final Parcelable.Creator<URL> CREATOR = new C1248h();

        /* JADX INFO: renamed from: a */
        public final String f14313a;

        /* JADX INFO: renamed from: b */
        public final String f14314b;

        public URL(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f14313a = str;
            this.f14314b = str2;
        }

        /* JADX INFO: renamed from: a */
        public final String m7030a() {
            return this.f14313a;
        }

        /* JADX INFO: renamed from: b */
        public final String m7031b() {
            return this.f14314b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof URL)) {
                return false;
            }
            URL url = (URL) obj;
            return fa4.m11650l(this.f14313a, url.f14313a) && fa4.m11650l(this.f14314b, url.f14314b);
        }

        public final int hashCode() {
            return this.f14314b.hashCode() + (this.f14313a.hashCode() * 31);
        }

        public final String toString() {
            return ux5.m22991n("URL(medium=", this.f14313a, ", source=", this.f14314b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.f14313a);
            parcel.writeString(this.f14314b);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Unknown implements LqAnalyticsValues$LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Unknown f14315a = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C1249i();

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
