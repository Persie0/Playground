package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Tab;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultShelf;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultShelf {

    /* JADX INFO: renamed from: a */
    public final Boolean f18950a;

    /* JADX INFO: renamed from: b */
    public final List<Tab> f18951b;

    /* JADX INFO: renamed from: c */
    public final String f18952c;

    /* JADX INFO: renamed from: d */
    public final int f18953d;

    /* JADX INFO: renamed from: e */
    public final String f18954e;

    public ResultShelf(Boolean bool, List<Tab> list, String str, int i10, String str2) {
        C5207g.m11111f(list, "tabs");
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        this.f18950a = bool;
        this.f18951b = list;
        this.f18952c = str;
        this.f18953d = i10;
        this.f18954e = str2;
    }

    public ResultShelf(Boolean bool, List list, String str, int i10, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, (i11 & 2) != 0 ? EmptyList.f38032a : list, str, i10, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultShelf)) {
            return false;
        }
        ResultShelf resultShelf = (ResultShelf) obj;
        return C5207g.m11106a(this.f18950a, resultShelf.f18950a) && C5207g.m11106a(this.f18951b, resultShelf.f18951b) && C5207g.m11106a(this.f18952c, resultShelf.f18952c) && this.f18953d == resultShelf.f18953d && C5207g.m11106a(this.f18954e, resultShelf.f18954e);
    }

    public final int hashCode() {
        Boolean bool = this.f18950a;
        return this.f18954e.hashCode() + C0009a.m16d(this.f18953d, C0166e.m758d(this.f18952c, C0204c.m848g(this.f18951b, (bool == null ? 0 : bool.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultShelf(pinned=");
        sb2.append(this.f18950a);
        sb2.append(", tabs=");
        sb2.append(this.f18951b);
        sb2.append(", code=");
        sb2.append(this.f18952c);
        sb2.append(", id=");
        sb2.append(this.f18953d);
        sb2.append(", title=");
        return C0009a.m23l(sb2, this.f18954e, ")");
    }
}
