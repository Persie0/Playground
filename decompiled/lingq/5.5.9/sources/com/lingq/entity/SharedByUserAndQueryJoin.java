package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/SharedByUserAndQueryJoin;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SharedByUserAndQueryJoin {

    /* JADX INFO: renamed from: a */
    public final String f17415a;

    /* JADX INFO: renamed from: b */
    public final String f17416b;

    /* JADX INFO: renamed from: c */
    public final int f17417c;

    public SharedByUserAndQueryJoin(String str, int i10, String str2) {
        this.f17415a = str;
        this.f17416b = str2;
        this.f17417c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedByUserAndQueryJoin)) {
            return false;
        }
        SharedByUserAndQueryJoin sharedByUserAndQueryJoin = (SharedByUserAndQueryJoin) obj;
        return C5207g.m11106a(this.f17415a, sharedByUserAndQueryJoin.f17415a) && C5207g.m11106a(this.f17416b, sharedByUserAndQueryJoin.f17416b) && this.f17417c == sharedByUserAndQueryJoin.f17417c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17417c) + C0166e.m758d(this.f17416b, this.f17415a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SharedByUserAndQueryJoin(language=");
        sb2.append(this.f17415a);
        sb2.append(", query=");
        sb2.append(this.f17416b);
        sb2.append(", userId=");
        return C0166e.m768o(sb2, this.f17417c, ")");
    }
}
