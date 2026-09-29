package com.lingq.shared.uimodel.library;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LibraryItemCounter {

    /* JADX INFO: renamed from: a */
    public final int f22004a;

    /* JADX INFO: renamed from: b */
    public final boolean f22005b;

    /* JADX INFO: renamed from: c */
    public final Float f22006c;

    /* JADX INFO: renamed from: d */
    public final Double f22007d;

    /* JADX INFO: renamed from: e */
    public final Double f22008e;

    /* JADX INFO: renamed from: f */
    public final boolean f22009f;

    /* JADX INFO: renamed from: g */
    public final float f22010g;

    /* JADX INFO: renamed from: h */
    public final int f22011h;

    /* JADX INFO: renamed from: i */
    public final int f22012i;

    /* JADX INFO: renamed from: j */
    public final int f22013j;

    /* JADX INFO: renamed from: k */
    public final int f22014k;

    /* JADX INFO: renamed from: l */
    public final int f22015l;

    /* JADX INFO: renamed from: m */
    public final boolean f22016m;

    public LibraryItemCounter(int i10, boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i11, int i12, int i13, int i14, int i15, boolean z12) {
        this.f22004a = i10;
        this.f22005b = z10;
        this.f22006c = f3;
        this.f22007d = d10;
        this.f22008e = d11;
        this.f22009f = z11;
        this.f22010g = f10;
        this.f22011h = i11;
        this.f22012i = i12;
        this.f22013j = i13;
        this.f22014k = i14;
        this.f22015l = i15;
        this.f22016m = z12;
    }

    public /* synthetic */ LibraryItemCounter(int i10, boolean z10, Float f3, Double d10, Double d11, boolean z11, float f10, int i11, int i12, int i13, int i14, int i15, boolean z12, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i16 & 2) != 0 ? false : z10, (i16 & 4) != 0 ? null : f3, (i16 & 8) != 0 ? Double.valueOf(0.0d) : d10, (i16 & 16) != 0 ? Double.valueOf(0.0d) : d11, (i16 & 32) != 0 ? false : z11, (i16 & 64) != 0 ? 0.0f : f10, (i16 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i16 & 256) != 0 ? 0 : i12, (i16 & 512) != 0 ? 0 : i13, (i16 & 1024) != 0 ? 0 : i14, (i16 & 2048) != 0 ? 0 : i15, (i16 & 4096) == 0 ? z12 : false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LibraryItemCounter)) {
            return false;
        }
        LibraryItemCounter libraryItemCounter = (LibraryItemCounter) obj;
        return this.f22004a == libraryItemCounter.f22004a && this.f22005b == libraryItemCounter.f22005b && C5207g.m11106a(this.f22006c, libraryItemCounter.f22006c) && C5207g.m11106a(this.f22007d, libraryItemCounter.f22007d) && C5207g.m11106a(this.f22008e, libraryItemCounter.f22008e) && this.f22009f == libraryItemCounter.f22009f && Float.compare(this.f22010g, libraryItemCounter.f22010g) == 0 && this.f22011h == libraryItemCounter.f22011h && this.f22012i == libraryItemCounter.f22012i && this.f22013j == libraryItemCounter.f22013j && this.f22014k == libraryItemCounter.f22014k && this.f22015l == libraryItemCounter.f22015l && this.f22016m == libraryItemCounter.f22016m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v19, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f22004a) * 31;
        ?? r10 = 1;
        boolean z10 = this.f22005b;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iHashCode + r11) * 31;
        Float f3 = this.f22006c;
        int iHashCode2 = (i10 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Double d10 = this.f22007d;
        int iHashCode3 = (iHashCode2 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f22008e;
        int iHashCode4 = (iHashCode3 + (d11 != null ? d11.hashCode() : 0)) * 31;
        boolean z11 = this.f22009f;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int iM16d = C0009a.m16d(this.f22015l, C0009a.m16d(this.f22014k, C0009a.m16d(this.f22013j, C0009a.m16d(this.f22012i, C0009a.m16d(this.f22011h, C0204c.m846e(this.f22010g, (iHashCode4 + r12) * 31, 31), 31), 31), 31), 31), 31);
        boolean z12 = this.f22016m;
        if (!z12) {
            r10 = z12;
        }
        return iM16d + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryItemCounter(id=");
        sb2.append(this.f22004a);
        sb2.append(", roseGiven=");
        sb2.append(this.f22005b);
        sb2.append(", progress=");
        sb2.append(this.f22006c);
        sb2.append(", listenTimes=");
        sb2.append(this.f22007d);
        sb2.append(", readTimes=");
        sb2.append(this.f22008e);
        sb2.append(", isTaken=");
        sb2.append(this.f22009f);
        sb2.append(", difficulty=");
        sb2.append(this.f22010g);
        sb2.append(", rosesCount=");
        sb2.append(this.f22011h);
        sb2.append(", lessonsCount=");
        sb2.append(this.f22012i);
        sb2.append(", newWordsCount=");
        sb2.append(this.f22013j);
        sb2.append(", knownWordsCount=");
        sb2.append(this.f22014k);
        sb2.append(", cardsCount=");
        sb2.append(this.f22015l);
        sb2.append(", isCompletelyTaken=");
        return C0166e.m769p(sb2, this.f22016m, ")");
    }
}
