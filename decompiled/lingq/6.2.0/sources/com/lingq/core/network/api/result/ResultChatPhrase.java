package com.lingq.core.network.api.result;

import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.hn1;
import p000.m78;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ResultChatPhrase {
    public static final C1721r0 Companion = new C1721r0();

    /* JADX INFO: renamed from: f */
    public static final cs4[] f20742f = {null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new m78(27)), null};

    /* JADX INFO: renamed from: a */
    public final String f20743a;

    /* JADX INFO: renamed from: b */
    public final String f20744b;

    /* JADX INFO: renamed from: c */
    public final String f20745c;

    /* JADX INFO: renamed from: d */
    public final List f20746d;

    /* JADX INFO: renamed from: e */
    public final ResultChatPhraseCard f20747e;

    public /* synthetic */ ResultChatPhrase(int i, String str, String str2, String str3, List list, ResultChatPhraseCard resultChatPhraseCard) {
        if ((i & 1) == 0) {
            this.f20743a = "";
        } else {
            this.f20743a = str;
        }
        if ((i & 2) == 0) {
            this.f20744b = null;
        } else {
            this.f20744b = str2;
        }
        if ((i & 4) == 0) {
            this.f20745c = "";
        } else {
            this.f20745c = str3;
        }
        if ((i & 8) == 0) {
            this.f20746d = EmptyList.f47638a;
        } else {
            this.f20746d = list;
        }
        if ((i & 16) == 0) {
            this.f20747e = null;
        } else {
            this.f20747e = resultChatPhraseCard;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChatPhrase)) {
            return false;
        }
        ResultChatPhrase resultChatPhrase = (ResultChatPhrase) obj;
        return fa4.m11650l(this.f20743a, resultChatPhrase.f20743a) && fa4.m11650l(this.f20744b, resultChatPhrase.f20744b) && fa4.m11650l(this.f20745c, resultChatPhrase.f20745c) && fa4.m11650l(this.f20746d, resultChatPhrase.f20746d) && fa4.m11650l(this.f20747e, resultChatPhrase.f20747e);
    }

    public final int hashCode() {
        int iHashCode = this.f20743a.hashCode() * 31;
        String str = this.f20744b;
        int iM22979b = ux5.m22979b(ux5.m22980c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f20745c, 31), 31, this.f20746d);
        ResultChatPhraseCard resultChatPhraseCard = this.f20747e;
        return iM22979b + (resultChatPhraseCard != null ? resultChatPhraseCard.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ResultChatPhrase(phrase=", this.f20743a, ", fragment=", this.f20744b, ", translation=");
        hn1.m13366p(this.f20745c, ", hints=", ", card=", sbM23000w, this.f20746d);
        sbM23000w.append(this.f20747e);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
