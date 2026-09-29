package com.lingq.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "Deeplink", "Feed", "LessonComplete", "LessonInfo", "Playlist", "Search", "SearchShelf", "URL", "Unknown", "Lcom/lingq/shared/util/LessonPath$Deeplink;", "Lcom/lingq/shared/util/LessonPath$Feed;", "Lcom/lingq/shared/util/LessonPath$LessonComplete;", "Lcom/lingq/shared/util/LessonPath$LessonInfo;", "Lcom/lingq/shared/util/LessonPath$Playlist;", "Lcom/lingq/shared/util/LessonPath$Search;", "Lcom/lingq/shared/util/LessonPath$SearchShelf;", "Lcom/lingq/shared/util/LessonPath$URL;", "Lcom/lingq/shared/util/LessonPath$Unknown;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
public interface LessonPath extends Parcelable {

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$Deeplink;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Deeplink implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Deeplink f22158a = new Deeplink();
        public static final Parcelable.Creator<Deeplink> CREATOR = new C3411a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$Deeplink$a */
        public static final class C3411a implements Parcelable.Creator<Deeplink> {
            @Override // android.os.Parcelable.Creator
            public final Deeplink createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Deeplink.f22158a;
            }

            @Override // android.os.Parcelable.Creator
            public final Deeplink[] newArray(int i10) {
                return new Deeplink[i10];
            }
        }

        private Deeplink() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$Feed;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final /* data */ class Feed implements LessonPath, Parcelable {
        public static final Parcelable.Creator<Feed> CREATOR = new C3412a();

        /* JADX INFO: renamed from: a */
        public final String f22159a;

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$Feed$a */
        public static final class C3412a implements Parcelable.Creator<Feed> {
            @Override // android.os.Parcelable.Creator
            public final Feed createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                return new Feed(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Feed[] newArray(int i10) {
                return new Feed[i10];
            }
        }

        public Feed(String str) {
            C5207g.m11111f(str, "shelf");
            this.f22159a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Feed) && C5207g.m11106a(this.f22159a, ((Feed) obj).f22159a);
        }

        public final int hashCode() {
            return this.f22159a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("Feed(shelf="), this.f22159a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeString(this.f22159a);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$LessonComplete;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class LessonComplete implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final LessonComplete f22160a = new LessonComplete();
        public static final Parcelable.Creator<LessonComplete> CREATOR = new C3413a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$LessonComplete$a */
        public static final class C3413a implements Parcelable.Creator<LessonComplete> {
            @Override // android.os.Parcelable.Creator
            public final LessonComplete createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return LessonComplete.f22160a;
            }

            @Override // android.os.Parcelable.Creator
            public final LessonComplete[] newArray(int i10) {
                return new LessonComplete[i10];
            }
        }

        private LessonComplete() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$LessonInfo;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class LessonInfo implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final LessonInfo f22161a = new LessonInfo();
        public static final Parcelable.Creator<LessonInfo> CREATOR = new C3414a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$LessonInfo$a */
        public static final class C3414a implements Parcelable.Creator<LessonInfo> {
            @Override // android.os.Parcelable.Creator
            public final LessonInfo createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return LessonInfo.f22161a;
            }

            @Override // android.os.Parcelable.Creator
            public final LessonInfo[] newArray(int i10) {
                return new LessonInfo[i10];
            }
        }

        private LessonInfo() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$Playlist;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Playlist implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Playlist f22162a = new Playlist();
        public static final Parcelable.Creator<Playlist> CREATOR = new C3415a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$Playlist$a */
        public static final class C3415a implements Parcelable.Creator<Playlist> {
            @Override // android.os.Parcelable.Creator
            public final Playlist createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Playlist.f22162a;
            }

            @Override // android.os.Parcelable.Creator
            public final Playlist[] newArray(int i10) {
                return new Playlist[i10];
            }
        }

        private Playlist() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$Search;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Search implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Search f22163a = new Search();
        public static final Parcelable.Creator<Search> CREATOR = new C3416a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$Search$a */
        public static final class C3416a implements Parcelable.Creator<Search> {
            @Override // android.os.Parcelable.Creator
            public final Search createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Search.f22163a;
            }

            @Override // android.os.Parcelable.Creator
            public final Search[] newArray(int i10) {
                return new Search[i10];
            }
        }

        private Search() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$SearchShelf;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final /* data */ class SearchShelf implements LessonPath, Parcelable {
        public static final Parcelable.Creator<SearchShelf> CREATOR = new C3417a();

        /* JADX INFO: renamed from: a */
        public final String f22164a;

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$SearchShelf$a */
        public static final class C3417a implements Parcelable.Creator<SearchShelf> {
            @Override // android.os.Parcelable.Creator
            public final SearchShelf createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                return new SearchShelf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SearchShelf[] newArray(int i10) {
                return new SearchShelf[i10];
            }
        }

        public SearchShelf(String str) {
            C5207g.m11111f(str, "shelf");
            this.f22164a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SearchShelf) && C5207g.m11106a(this.f22164a, ((SearchShelf) obj).f22164a);
        }

        public final int hashCode() {
            return this.f22164a.hashCode();
        }

        public final String toString() {
            return C0009a.m23l(new StringBuilder("SearchShelf(shelf="), this.f22164a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeString(this.f22164a);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$URL;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final /* data */ class URL implements LessonPath, Parcelable {
        public static final Parcelable.Creator<URL> CREATOR = new C3418a();

        /* JADX INFO: renamed from: a */
        public final String f22165a;

        /* JADX INFO: renamed from: b */
        public final String f22166b;

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$URL$a */
        public static final class C3418a implements Parcelable.Creator<URL> {
            @Override // android.os.Parcelable.Creator
            public final URL createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                return new URL(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final URL[] newArray(int i10) {
                return new URL[i10];
            }
        }

        public URL(String str, String str2) {
            C5207g.m11111f(str, "medium");
            C5207g.m11111f(str2, "source");
            this.f22165a = str;
            this.f22166b = str2;
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
            return C5207g.m11106a(this.f22165a, url.f22165a) && C5207g.m11106a(this.f22166b, url.f22166b);
        }

        public final int hashCode() {
            return this.f22166b.hashCode() + (this.f22165a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("URL(medium=");
            sb2.append(this.f22165a);
            sb2.append(", source=");
            return C0009a.m23l(sb2, this.f22166b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeString(this.f22165a);
            parcel.writeString(this.f22166b);
        }
    }

    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/shared/util/LessonPath$Unknown;", "Lcom/lingq/shared/util/LessonPath;", "Landroid/os/Parcelable;", "<init>", "()V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    public static final class Unknown implements LessonPath, Parcelable {

        /* JADX INFO: renamed from: a */
        public static final Unknown f22167a = new Unknown();
        public static final Parcelable.Creator<Unknown> CREATOR = new C3419a();

        /* JADX INFO: renamed from: com.lingq.shared.util.LessonPath$Unknown$a */
        public static final class C3419a implements Parcelable.Creator<Unknown> {
            @Override // android.os.Parcelable.Creator
            public final Unknown createFromParcel(Parcel parcel) {
                C5207g.m11111f(parcel, "parcel");
                parcel.readInt();
                return Unknown.f22167a;
            }

            @Override // android.os.Parcelable.Creator
            public final Unknown[] newArray(int i10) {
                return new Unknown[i10];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            C5207g.m11111f(parcel, "out");
            parcel.writeInt(1);
        }
    }
}
