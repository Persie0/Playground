package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTranslationSentence;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultTranslationSentence {

    /* JADX INFO: renamed from: a */
    public final int f18993a;

    /* JADX INFO: renamed from: b */
    public final List<Double> f18994b;

    /* JADX INFO: renamed from: c */
    public final String f18995c;

    /* JADX INFO: renamed from: d */
    public final List<ResultTranslation> f18996d;

    public ResultTranslationSentence(int i10, List<Double> list, String str, List<ResultTranslation> list2) {
        C5207g.m11111f(list, "timestamp");
        C5207g.m11111f(str, "text");
        C5207g.m11111f(list2, "translations");
        this.f18993a = i10;
        this.f18994b = list;
        this.f18995c = str;
        this.f18996d = list2;
    }

    public ResultTranslationSentence(int i10, List list, String str, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, list, (i11 & 4) != 0 ? "" : str, (i11 & 8) != 0 ? EmptyList.f38032a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTranslationSentence)) {
            return false;
        }
        ResultTranslationSentence resultTranslationSentence = (ResultTranslationSentence) obj;
        return this.f18993a == resultTranslationSentence.f18993a && C5207g.m11106a(this.f18994b, resultTranslationSentence.f18994b) && C5207g.m11106a(this.f18995c, resultTranslationSentence.f18995c) && C5207g.m11106a(this.f18996d, resultTranslationSentence.f18996d);
    }

    public final int hashCode() {
        return this.f18996d.hashCode() + C0166e.m758d(this.f18995c, C0204c.m848g(this.f18994b, Integer.hashCode(this.f18993a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResultTranslationSentence(index=" + this.f18993a + ", timestamp=" + this.f18994b + ", text=" + this.f18995c + ", translations=" + this.f18996d + ")";
    }
}
