package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/MilestoneMet;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class MilestoneMet {

    /* JADX INFO: renamed from: a */
    public final String f17311a;

    /* JADX INFO: renamed from: b */
    public final String f17312b;

    public MilestoneMet(String str, String str2) {
        C5207g.m11111f(str, "languageAndSlug");
        C5207g.m11111f(str2, "metAt");
        this.f17311a = str;
        this.f17312b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MilestoneMet)) {
            return false;
        }
        MilestoneMet milestoneMet = (MilestoneMet) obj;
        if (C5207g.m11106a(this.f17311a, milestoneMet.f17311a) && C5207g.m11106a(this.f17312b, milestoneMet.f17312b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f17312b.hashCode() + (this.f17311a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MilestoneMet(languageAndSlug=");
        sb2.append(this.f17311a);
        sb2.append(", metAt=");
        return C0009a.m23l(sb2, this.f17312b, ")");
    }
}
