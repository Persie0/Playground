package com.lingq.core.domain.model.token;

import p000.AbstractC3393o1;
import p000.ey8;
import p000.fa4;
import p000.ux5;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class TokenTransliteration {
    public static final C1498n Companion = new C1498n();

    /* JADX INFO: renamed from: a */
    public final String f19619a;

    /* JADX INFO: renamed from: b */
    public final String f19620b;

    /* JADX INFO: renamed from: c */
    public final String f19621c;

    /* JADX INFO: renamed from: d */
    public final String f19622d;

    /* JADX INFO: renamed from: e */
    public final String f19623e;

    /* JADX INFO: renamed from: f */
    public final String f19624f;

    /* JADX INFO: renamed from: g */
    public final TokenFurigana f19625g;

    /* JADX INFO: renamed from: h */
    public final String f19626h;

    public /* synthetic */ TokenTransliteration(int i, String str, String str2, String str3, String str4, String str5, String str6, TokenFurigana tokenFurigana, String str7) {
        if ((i & 1) == 0) {
            this.f19619a = null;
        } else {
            this.f19619a = str;
        }
        if ((i & 2) == 0) {
            this.f19620b = null;
        } else {
            this.f19620b = str2;
        }
        if ((i & 4) == 0) {
            this.f19621c = null;
        } else {
            this.f19621c = str3;
        }
        if ((i & 8) == 0) {
            this.f19622d = null;
        } else {
            this.f19622d = str4;
        }
        if ((i & 16) == 0) {
            this.f19623e = null;
        } else {
            this.f19623e = str5;
        }
        if ((i & 32) == 0) {
            this.f19624f = null;
        } else {
            this.f19624f = str6;
        }
        if ((i & 64) == 0) {
            this.f19625g = null;
        } else {
            this.f19625g = tokenFurigana;
        }
        if ((i & 128) == 0) {
            this.f19626h = null;
        } else {
            this.f19626h = str7;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TokenTransliteration)) {
            return false;
        }
        TokenTransliteration tokenTransliteration = (TokenTransliteration) obj;
        return fa4.m11650l(this.f19619a, tokenTransliteration.f19619a) && fa4.m11650l(this.f19620b, tokenTransliteration.f19620b) && fa4.m11650l(this.f19621c, tokenTransliteration.f19621c) && fa4.m11650l(this.f19622d, tokenTransliteration.f19622d) && fa4.m11650l(this.f19623e, tokenTransliteration.f19623e) && fa4.m11650l(this.f19624f, tokenTransliteration.f19624f) && fa4.m11650l(this.f19625g, tokenTransliteration.f19625g) && fa4.m11650l(this.f19626h, tokenTransliteration.f19626h);
    }

    public final int hashCode() {
        String str = this.f19619a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f19620b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f19621c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19622d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f19623e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f19624f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TokenFurigana tokenFurigana = this.f19625g;
        int iHashCode7 = (iHashCode6 + (tokenFurigana == null ? 0 : tokenFurigana.hashCode())) * 31;
        String str7 = this.f19626h;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TokenTransliteration(hiragana=", this.f19619a, ", romaji=", this.f19620b, ", pinyin=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19621c, ", hant=", this.f19622d, ", hans=");
        AbstractC3393o1.m17725C(sbM23000w, this.f19623e, ", jyutping=", this.f19624f, ", furigana=");
        sbM23000w.append(this.f19625g);
        sbM23000w.append(", latin=");
        sbM23000w.append(this.f19626h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }

    public TokenTransliteration(String str, String str2, String str3, String str4, String str5, String str6, TokenFurigana tokenFurigana, String str7) {
        this.f19619a = str;
        this.f19620b = str2;
        this.f19621c = str3;
        this.f19622d = str4;
        this.f19623e = str5;
        this.f19624f = str6;
        this.f19625g = tokenFurigana;
        this.f19626h = str7;
    }
}
