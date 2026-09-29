package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Language;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Language {

    /* JADX INFO: renamed from: a */
    public final String f16981a;

    /* JADX INFO: renamed from: b */
    public final Boolean f16982b;

    /* JADX INFO: renamed from: c */
    public final String f16983c;

    /* JADX INFO: renamed from: d */
    public final String f16984d;

    /* JADX INFO: renamed from: e */
    public final Integer f16985e;

    /* JADX INFO: renamed from: f */
    public final String f16986f;

    /* JADX INFO: renamed from: g */
    public final String f16987g;

    public Language(String str, Boolean bool, String str2, String str3, Integer num, String str4, String str5) {
        this.f16981a = str;
        this.f16982b = bool;
        this.f16983c = str2;
        this.f16984d = str3;
        this.f16985e = num;
        this.f16986f = str4;
        this.f16987g = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Language)) {
            return false;
        }
        Language language = (Language) obj;
        return C5207g.m11106a(this.f16981a, language.f16981a) && C5207g.m11106a(this.f16982b, language.f16982b) && C5207g.m11106a(this.f16983c, language.f16983c) && C5207g.m11106a(this.f16984d, language.f16984d) && C5207g.m11106a(this.f16985e, language.f16985e) && C5207g.m11106a(this.f16986f, language.f16986f) && C5207g.m11106a(this.f16987g, language.f16987g);
    }

    public final int hashCode() {
        int iHashCode = this.f16981a.hashCode() * 31;
        int iHashCode2 = 0;
        Boolean bool = this.f16982b;
        int iHashCode3 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f16983c;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16984d;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f16985e;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.f16986f;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16987g;
        if (str4 != null) {
            iHashCode2 = str4.hashCode();
        }
        return iHashCode7 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Language(code=");
        sb2.append(this.f16981a);
        sb2.append(", supported=");
        sb2.append(this.f16982b);
        sb2.append(", title=");
        sb2.append(this.f16983c);
        sb2.append(", lastUsed=");
        sb2.append(this.f16984d);
        sb2.append(", knownWords=");
        sb2.append(this.f16985e);
        sb2.append(", dictionaryLocaleActive=");
        sb2.append(this.f16986f);
        sb2.append(", grammarResourceSlug=");
        return C0009a.m23l(sb2, this.f16987g, ")");
    }
}
