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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/Shelf;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Shelf {

    /* JADX INFO: renamed from: a */
    public final String f17425a;

    /* JADX INFO: renamed from: b */
    public final String f17426b;

    /* JADX INFO: renamed from: c */
    public final Boolean f17427c;

    /* JADX INFO: renamed from: d */
    public final List<Tab> f17428d;

    /* JADX INFO: renamed from: e */
    public final String f17429e;

    /* JADX INFO: renamed from: f */
    public final int f17430f;

    /* JADX INFO: renamed from: g */
    public final String f17431g;

    /* JADX INFO: renamed from: h */
    public final int f17432h;

    /* JADX INFO: renamed from: i */
    public final String f17433i;

    public Shelf(String str, String str2, Boolean bool, List<Tab> list, String str3, int i10, String str4, int i11, String str5) {
        C5207g.m11111f(str, "codeWithLanguage");
        C5207g.m11111f(str2, "language");
        C5207g.m11111f(list, "tabs");
        C5207g.m11111f(str3, "code");
        C5207g.m11111f(str4, "title");
        C5207g.m11111f(str5, "levels");
        this.f17425a = str;
        this.f17426b = str2;
        this.f17427c = bool;
        this.f17428d = list;
        this.f17429e = str3;
        this.f17430f = i10;
        this.f17431g = str4;
        this.f17432h = i11;
        this.f17433i = str5;
    }

    public Shelf(String str, String str2, Boolean bool, List list, String str3, int i10, String str4, int i11, String str5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, (i12 & 8) != 0 ? EmptyList.f38032a : list, str3, i10, str4, i11, (i12 & 256) != 0 ? "" : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shelf)) {
            return false;
        }
        Shelf shelf = (Shelf) obj;
        return C5207g.m11106a(this.f17425a, shelf.f17425a) && C5207g.m11106a(this.f17426b, shelf.f17426b) && C5207g.m11106a(this.f17427c, shelf.f17427c) && C5207g.m11106a(this.f17428d, shelf.f17428d) && C5207g.m11106a(this.f17429e, shelf.f17429e) && this.f17430f == shelf.f17430f && C5207g.m11106a(this.f17431g, shelf.f17431g) && this.f17432h == shelf.f17432h && C5207g.m11106a(this.f17433i, shelf.f17433i);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f17426b, this.f17425a.hashCode() * 31, 31);
        Boolean bool = this.f17427c;
        return this.f17433i.hashCode() + C0009a.m16d(this.f17432h, C0166e.m758d(this.f17431g, C0009a.m16d(this.f17430f, C0166e.m758d(this.f17429e, C0204c.m848g(this.f17428d, (iM758d + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shelf(codeWithLanguage=");
        sb2.append(this.f17425a);
        sb2.append(", language=");
        sb2.append(this.f17426b);
        sb2.append(", pinned=");
        sb2.append(this.f17427c);
        sb2.append(", tabs=");
        sb2.append(this.f17428d);
        sb2.append(", code=");
        sb2.append(this.f17429e);
        sb2.append(", id=");
        sb2.append(this.f17430f);
        sb2.append(", title=");
        sb2.append(this.f17431g);
        sb2.append(", order=");
        sb2.append(this.f17432h);
        sb2.append(", levels=");
        return C0009a.m23l(sb2, this.f17433i, ")");
    }
}
