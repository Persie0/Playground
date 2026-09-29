package com.lingq.shared.network.requests;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/requests/SentenceFragment;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SentenceFragment {

    /* JADX INFO: renamed from: a */
    public final String f18240a;

    /* JADX INFO: renamed from: b */
    @InterfaceC9303g(name = "is_occurrence")
    public final boolean f18241b;

    /* JADX WARN: Multi-variable type inference failed */
    public SentenceFragment() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public SentenceFragment(String str, boolean z10) {
        this.f18240a = str;
        this.f18241b = z10;
    }

    public /* synthetic */ SentenceFragment(String str, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SentenceFragment)) {
            return false;
        }
        SentenceFragment sentenceFragment = (SentenceFragment) obj;
        return C5207g.m11106a(this.f18240a, sentenceFragment.f18240a) && this.f18241b == sentenceFragment.f18241b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final int hashCode() {
        String str = this.f18240a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z10 = this.f18241b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public final String toString() {
        return "SentenceFragment(text=" + this.f18240a + ", isOccurrence=" + this.f18241b + ")";
    }
}
