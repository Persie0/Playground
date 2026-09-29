package com.tonyodev.fetch2.database;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.EnqueueAction;
import com.tonyodev.fetch2.Error;
import com.tonyodev.fetch2.NetworkType;
import com.tonyodev.fetch2.Priority;
import com.tonyodev.fetch2.Request;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2core.Extras;
import dm.C5207g;
import java.io.Serializable;
import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.C6753d;
import p099el.C5427b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m13365d2 = {"Lcom/tonyodev/fetch2/database/DownloadInfo;", "Lcom/tonyodev/fetch2/Download;", "<init>", "()V", "CREATOR", "a", "fetch2_release"}, m13366k = 1, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public class DownloadInfo implements Download {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: H */
    public long f32321H;

    /* JADX INFO: renamed from: I */
    public String f32322I;

    /* JADX INFO: renamed from: J */
    public EnqueueAction f32323J;

    /* JADX INFO: renamed from: K */
    public long f32324K;

    /* JADX INFO: renamed from: L */
    public boolean f32325L;

    /* JADX INFO: renamed from: M */
    public Extras f32326M;

    /* JADX INFO: renamed from: N */
    public int f32327N;

    /* JADX INFO: renamed from: O */
    public int f32328O;

    /* JADX INFO: renamed from: P */
    public long f32329P;

    /* JADX INFO: renamed from: Q */
    public long f32330Q;

    /* JADX INFO: renamed from: a */
    public int f32331a;

    /* JADX INFO: renamed from: e */
    public int f32335e;

    /* JADX INFO: renamed from: h */
    public long f32338h;

    /* JADX INFO: renamed from: b */
    public String f32332b = "";

    /* JADX INFO: renamed from: c */
    public String f32333c = "";

    /* JADX INFO: renamed from: d */
    public String f32334d = "";

    /* JADX INFO: renamed from: f */
    public Priority f32336f = C5427b.f33966c;

    /* JADX INFO: renamed from: g */
    public Map<String, String> f32337g = new LinkedHashMap();

    /* JADX INFO: renamed from: i */
    public long f32339i = -1;

    /* JADX INFO: renamed from: j */
    public Status f32340j = C5427b.f33968e;

    /* JADX INFO: renamed from: k */
    public Error f32341k = C5427b.f33967d;

    /* JADX INFO: renamed from: l */
    public NetworkType f32342l = C5427b.f33964a;

    /* JADX INFO: renamed from: com.tonyodev.fetch2.database.DownloadInfo$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<DownloadInfo> {
        @Override // android.os.Parcelable.Creator
        public final DownloadInfo createFromParcel(Parcel parcel) {
            C5207g.m11112g(parcel, "source");
            int i10 = parcel.readInt();
            String string = parcel.readString();
            if (string == null) {
                string = "";
            }
            String string2 = parcel.readString();
            if (string2 == null) {
                string2 = "";
            }
            String string3 = parcel.readString();
            String str = string3 != null ? string3 : "";
            int i11 = parcel.readInt();
            Priority.Companion companion = Priority.INSTANCE;
            int i12 = parcel.readInt();
            companion.getClass();
            Priority priorityM10596a = Priority.Companion.m10596a(i12);
            Serializable serializable = parcel.readSerializable();
            if (serializable == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            Map<String, String> map = (Map) serializable;
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            Status.Companion companion2 = Status.INSTANCE;
            int i13 = parcel.readInt();
            companion2.getClass();
            Status statusM10597a = Status.Companion.m10597a(i13);
            Error.Companion companion3 = Error.INSTANCE;
            int i14 = parcel.readInt();
            companion3.getClass();
            Error errorM10594a = Error.Companion.m10594a(i14);
            NetworkType.Companion companion4 = NetworkType.INSTANCE;
            int i15 = parcel.readInt();
            companion4.getClass();
            NetworkType networkTypeM10595a = NetworkType.Companion.m10595a(i15);
            long j12 = parcel.readLong();
            String string4 = parcel.readString();
            EnqueueAction.Companion companion5 = EnqueueAction.INSTANCE;
            int i16 = parcel.readInt();
            companion5.getClass();
            EnqueueAction enqueueActionM10593a = EnqueueAction.Companion.m10593a(i16);
            long j13 = parcel.readLong();
            boolean z10 = parcel.readInt() == 1;
            long j14 = parcel.readLong();
            long j15 = parcel.readLong();
            Serializable serializable2 = parcel.readSerializable();
            if (serializable2 == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            }
            int i17 = parcel.readInt();
            int i18 = parcel.readInt();
            DownloadInfo downloadInfo = new DownloadInfo();
            downloadInfo.f32331a = i10;
            downloadInfo.f32332b = string;
            downloadInfo.f32333c = string2;
            downloadInfo.f32334d = str;
            downloadInfo.f32335e = i11;
            downloadInfo.m10609q(priorityM10596a);
            downloadInfo.f32337g = map;
            downloadInfo.f32338h = j10;
            downloadInfo.f32339i = j11;
            downloadInfo.m10610r(statusM10597a);
            downloadInfo.m10604h(errorM10594a);
            downloadInfo.m10608n(networkTypeM10595a);
            downloadInfo.f32321H = j12;
            downloadInfo.f32322I = string4;
            downloadInfo.m10603e(enqueueActionM10593a);
            downloadInfo.f32324K = j13;
            downloadInfo.f32325L = z10;
            downloadInfo.f32329P = j14;
            downloadInfo.f32330Q = j15;
            downloadInfo.f32326M = new Extras((Map) serializable2);
            downloadInfo.f32327N = i17;
            downloadInfo.f32328O = i18;
            return downloadInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadInfo[] newArray(int i10) {
            return new DownloadInfo[i10];
        }
    }

    public DownloadInfo() {
        Calendar calendar = Calendar.getInstance();
        C5207g.m11107b(calendar, "Calendar.getInstance()");
        this.f32321H = calendar.getTimeInMillis();
        this.f32323J = EnqueueAction.REPLACE_EXISTING;
        this.f32325L = true;
        Extras.INSTANCE.getClass();
        this.f32326M = Extras.f32540b;
        this.f32329P = -1L;
        this.f32330Q = -1L;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getF32324K() {
        return this.f32324K;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: F */
    public final long mo10574F() {
        return this.f32338h;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: H */
    public final String mo10575H() {
        return this.f32332b;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getF32325L() {
        return this.f32325L;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: L */
    public final String mo10577L() {
        return this.f32333c;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: N */
    public final int mo10578N() {
        return this.f32328O;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: O, reason: from getter */
    public final int getF32335e() {
        return this.f32335e;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: P */
    public final NetworkType mo10580P() {
        return this.f32342l;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: S */
    public final int mo10581S() {
        return this.f32327N;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: V */
    public final String mo10582V() {
        return this.f32334d;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: W, reason: from getter */
    public final EnqueueAction getF32323J() {
        return this.f32323J;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: Z */
    public final long mo10584Z() {
        return this.f32321H;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getF32330Q() {
        return this.f32330Q;
    }

    /* JADX INFO: renamed from: b */
    public final long m10600b() {
        return this.f32329P;
    }

    /* JADX INFO: renamed from: c */
    public final void m10601c(long j10) {
        this.f32338h = j10;
    }

    /* JADX INFO: renamed from: d */
    public final void m10602d(long j10) {
        this.f32330Q = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m10603e(EnqueueAction enqueueAction) {
        C5207g.m11112g(enqueueAction, "<set-?>");
        this.f32323J = enqueueAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type com.tonyodev.fetch2.database.DownloadInfo");
        }
        DownloadInfo downloadInfo = (DownloadInfo) obj;
        return this.f32331a == downloadInfo.f32331a && !(C5207g.m11106a(this.f32332b, downloadInfo.f32332b) ^ true) && !(C5207g.m11106a(this.f32333c, downloadInfo.f32333c) ^ true) && !(C5207g.m11106a(this.f32334d, downloadInfo.f32334d) ^ true) && this.f32335e == downloadInfo.f32335e && this.f32336f == downloadInfo.f32336f && !(C5207g.m11106a(this.f32337g, downloadInfo.f32337g) ^ true) && this.f32338h == downloadInfo.f32338h && this.f32339i == downloadInfo.f32339i && this.f32340j == downloadInfo.f32340j && this.f32341k == downloadInfo.f32341k && this.f32342l == downloadInfo.f32342l && this.f32321H == downloadInfo.f32321H && !(C5207g.m11106a(this.f32322I, downloadInfo.f32322I) ^ true) && this.f32323J == downloadInfo.f32323J && this.f32324K == downloadInfo.f32324K && this.f32325L == downloadInfo.f32325L && !(C5207g.m11106a(this.f32326M, downloadInfo.f32326M) ^ true) && this.f32329P == downloadInfo.f32329P && this.f32330Q == downloadInfo.f32330Q && this.f32327N == downloadInfo.f32327N && this.f32328O == downloadInfo.f32328O;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: f, reason: from getter */
    public final Error getF32341k() {
        return this.f32341k;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: g */
    public final String mo10586g() {
        return this.f32322I;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: getId, reason: from getter */
    public final int getF32331a() {
        return this.f32331a;
    }

    /* JADX INFO: renamed from: h */
    public final void m10604h(Error error) {
        C5207g.m11112g(error, "<set-?>");
        this.f32341k = error;
    }

    public final int hashCode() {
        int iHashCode = (Long.valueOf(this.f32321H).hashCode() + ((this.f32342l.hashCode() + ((this.f32341k.hashCode() + ((this.f32340j.hashCode() + ((Long.valueOf(this.f32339i).hashCode() + ((Long.valueOf(this.f32338h).hashCode() + ((this.f32337g.hashCode() + ((this.f32336f.hashCode() + ((C0166e.m758d(this.f32334d, C0166e.m758d(this.f32333c, C0166e.m758d(this.f32332b, this.f32331a * 31, 31), 31), 31) + this.f32335e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f32322I;
        return Integer.valueOf(this.f32328O).hashCode() + ((Integer.valueOf(this.f32327N).hashCode() + ((Long.valueOf(this.f32330Q).hashCode() + ((Long.valueOf(this.f32329P).hashCode() + ((this.f32326M.hashCode() + ((Boolean.valueOf(this.f32325L).hashCode() + ((Long.valueOf(this.f32324K).hashCode() + ((this.f32323J.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: i */
    public final Map<String, String> mo10587i() {
        return this.f32337g;
    }

    /* JADX INFO: renamed from: j */
    public final void m10605j(long j10) {
        this.f32329P = j10;
    }

    /* JADX INFO: renamed from: k */
    public final void m10606k(String str) {
        C5207g.m11112g(str, "<set-?>");
        this.f32334d = str;
    }

    /* JADX INFO: renamed from: l */
    public final void m10607l(String str) {
        C5207g.m11112g(str, "<set-?>");
        this.f32332b = str;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: m */
    public final Status mo10588m() {
        return this.f32340j;
    }

    /* JADX INFO: renamed from: n */
    public final void m10608n(NetworkType networkType) {
        C5207g.m11112g(networkType, "<set-?>");
        this.f32342l = networkType;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: o */
    public final Extras mo10589o() {
        return this.f32326M;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: p */
    public final Request mo10590p() {
        Request request = new Request(this.f32333c, this.f32334d);
        request.f32310b = this.f32335e;
        request.f32311c.putAll(this.f32337g);
        NetworkType networkType = this.f32342l;
        C5207g.m11112g(networkType, "<set-?>");
        request.f32313e = networkType;
        Priority priority = this.f32336f;
        C5207g.m11112g(priority, "<set-?>");
        request.f32312d = priority;
        EnqueueAction enqueueAction = this.f32323J;
        C5207g.m11112g(enqueueAction, "<set-?>");
        request.f32315g = enqueueAction;
        request.f32309a = this.f32324K;
        request.f32316h = this.f32325L;
        Extras extras = this.f32326M;
        C5207g.m11112g(extras, "value");
        request.f32318j = new Extras(C6753d.m13465R0(extras.f32541a));
        int i10 = this.f32327N;
        if (i10 < 0) {
            throw new IllegalArgumentException("The maximum number of attempts has to be greater than -1");
        }
        request.f32317i = i10;
        return request;
    }

    /* JADX INFO: renamed from: q */
    public final void m10609q(Priority priority) {
        C5207g.m11112g(priority, "<set-?>");
        this.f32336f = priority;
    }

    /* JADX INFO: renamed from: r */
    public final void m10610r(Status status) {
        C5207g.m11112g(status, "<set-?>");
        this.f32340j = status;
    }

    public final String toString() {
        return "DownloadInfo(id=" + this.f32331a + ", namespace='" + this.f32332b + "', url='" + this.f32333c + "', file='" + this.f32334d + "', group=" + this.f32335e + ", priority=" + this.f32336f + ", headers=" + this.f32337g + ", downloaded=" + this.f32338h + ", total=" + this.f32339i + ", status=" + this.f32340j + ", error=" + this.f32341k + ", networkType=" + this.f32342l + ", created=" + this.f32321H + ", tag=" + this.f32322I + ", enqueueAction=" + this.f32323J + ", identifier=" + this.f32324K + ", downloadOnEnqueue=" + this.f32325L + ", extras=" + this.f32326M + ", autoRetryMaxAttempts=" + this.f32327N + ", autoRetryAttempts=" + this.f32328O + ", etaInMilliSeconds=" + this.f32329P + ", downloadedBytesPerSecond=" + this.f32330Q + ')';
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: u */
    public final long mo10591u() {
        return this.f32339i;
    }

    @Override // com.tonyodev.fetch2.Download
    /* JADX INFO: renamed from: v */
    public final Priority mo10592v() {
        return this.f32336f;
    }

    /* JADX INFO: renamed from: w */
    public final void m10611w(long j10) {
        this.f32339i = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11112g(parcel, "dest");
        parcel.writeInt(this.f32331a);
        parcel.writeString(this.f32332b);
        parcel.writeString(this.f32333c);
        parcel.writeString(this.f32334d);
        parcel.writeInt(this.f32335e);
        parcel.writeInt(this.f32336f.getValue());
        parcel.writeSerializable(new HashMap(this.f32337g));
        parcel.writeLong(this.f32338h);
        parcel.writeLong(this.f32339i);
        parcel.writeInt(this.f32340j.getValue());
        parcel.writeInt(this.f32341k.getValue());
        parcel.writeInt(this.f32342l.getValue());
        parcel.writeLong(this.f32321H);
        parcel.writeString(this.f32322I);
        parcel.writeInt(this.f32323J.getValue());
        parcel.writeLong(this.f32324K);
        parcel.writeInt(this.f32325L ? 1 : 0);
        parcel.writeLong(this.f32329P);
        parcel.writeLong(this.f32330Q);
        parcel.writeSerializable(new HashMap(C6753d.m13465R0(this.f32326M.f32541a)));
        parcel.writeInt(this.f32327N);
        parcel.writeInt(this.f32328O);
    }

    /* JADX INFO: renamed from: x */
    public final void m10612x(String str) {
        C5207g.m11112g(str, "<set-?>");
        this.f32333c = str;
    }
}
