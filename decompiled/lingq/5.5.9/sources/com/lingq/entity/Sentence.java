package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Sentence;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Sentence {

    /* JADX INFO: renamed from: a */
    public final int f17394a;

    /* JADX INFO: renamed from: b */
    public final List<TextToken> f17395b;

    /* JADX INFO: renamed from: c */
    public final String f17396c;

    /* JADX INFO: renamed from: d */
    public final String f17397d;

    /* JADX INFO: renamed from: e */
    public final int f17398e;

    /* JADX INFO: renamed from: f */
    public final List<Float> f17399f;

    /* JADX INFO: renamed from: g */
    public final boolean f17400g;

    public Sentence(int i10, List<TextToken> list, String str, String str2, int i11, List<Float> list2, boolean z10) {
        C5207g.m11111f(list, "tokens");
        this.f17394a = i10;
        this.f17395b = list;
        this.f17396c = str;
        this.f17397d = str2;
        this.f17398e = i11;
        this.f17399f = list2;
        this.f17400g = z10;
    }

    public Sentence(int i10, List list, String str, String str2, int i11, List list2, boolean z10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? EmptyList.f38032a : list, str, str2, i11, (i12 & 32) != 0 ? EmptyList.f38032a : list2, (i12 & 64) != 0 ? false : z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Sentence)) {
            return false;
        }
        Sentence sentence = (Sentence) obj;
        return this.f17394a == sentence.f17394a && C5207g.m11106a(this.f17395b, sentence.f17395b) && C5207g.m11106a(this.f17396c, sentence.f17396c) && C5207g.m11106a(this.f17397d, sentence.f17397d) && this.f17398e == sentence.f17398e && C5207g.m11106a(this.f17399f, sentence.f17399f) && this.f17400g == sentence.f17400g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f17395b, Integer.hashCode(this.f17394a) * 31, 31);
        int iHashCode = 0;
        String str = this.f17396c;
        int iHashCode2 = (iM848g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17397d;
        int iM16d = C0009a.m16d(this.f17398e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        List<Float> list = this.f17399f;
        if (list != null) {
            iHashCode = list.hashCode();
        }
        int i10 = (iM16d + iHashCode) * 31;
        boolean z10 = this.f17400g;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return i10 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Sentence(lessonId=");
        sb2.append(this.f17394a);
        sb2.append(", tokens=");
        sb2.append(this.f17395b);
        sb2.append(", text=");
        sb2.append(this.f17396c);
        sb2.append(", normalizedText=");
        sb2.append(this.f17397d);
        sb2.append(", index=");
        sb2.append(this.f17398e);
        sb2.append(", timestamp=");
        sb2.append(this.f17399f);
        sb2.append(", startParagraph=");
        return C0166e.m769p(sb2, this.f17400g, ")");
    }
}
