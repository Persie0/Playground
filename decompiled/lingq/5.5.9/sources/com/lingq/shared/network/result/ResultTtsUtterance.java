package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultTtsUtterance;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultTtsUtterance {

    /* JADX INFO: renamed from: a */
    public final int f19021a;

    /* JADX INFO: renamed from: b */
    public final String f19022b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "app_name")
    public final String f19023c;

    /* JADX INFO: renamed from: d */
    public final String f19024d;

    /* JADX INFO: renamed from: e */
    public final String f19025e;

    /* JADX INFO: renamed from: f */
    public final ResultLanguage f19026f;

    public ResultTtsUtterance(int i10, String str, String str2, String str3, String str4, ResultLanguage resultLanguage) {
        this.f19021a = i10;
        this.f19022b = str;
        this.f19023c = str2;
        this.f19024d = str3;
        this.f19025e = str4;
        this.f19026f = resultLanguage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultTtsUtterance)) {
            return false;
        }
        ResultTtsUtterance resultTtsUtterance = (ResultTtsUtterance) obj;
        return this.f19021a == resultTtsUtterance.f19021a && C5207g.m11106a(this.f19022b, resultTtsUtterance.f19022b) && C5207g.m11106a(this.f19023c, resultTtsUtterance.f19023c) && C5207g.m11106a(this.f19024d, resultTtsUtterance.f19024d) && C5207g.m11106a(this.f19025e, resultTtsUtterance.f19025e) && C5207g.m11106a(this.f19026f, resultTtsUtterance.f19026f);
    }

    public final int hashCode() {
        return this.f19026f.hashCode() + C0166e.m758d(this.f19025e, C0166e.m758d(this.f19024d, C0166e.m758d(this.f19023c, C0166e.m758d(this.f19022b, Integer.hashCode(this.f19021a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "ResultTtsUtterance(id=" + this.f19021a + ", audio=" + this.f19022b + ", appName=" + this.f19023c + ", voice=" + this.f19024d + ", text=" + this.f19025e + ", language=" + this.f19026f + ")";
    }
}
