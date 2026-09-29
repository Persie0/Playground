package com.lingq.shared.domain;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/domain/Login;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class Login {

    /* JADX INFO: renamed from: a */
    public final String f17772a;

    /* JADX INFO: renamed from: b */
    public final String f17773b;

    /* JADX INFO: renamed from: c */
    public final String f17774c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "is_free")
    public final boolean f17775d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "new_user")
    public final boolean f17776e;

    public Login() {
        this(null, null, null, false, false, 31, null);
    }

    public Login(String str, String str2, String str3, boolean z10, boolean z11) {
        this.f17772a = str;
        this.f17773b = str2;
        this.f17774c = str3;
        this.f17775d = z10;
        this.f17776e = z11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Login(String str, String str2, String str3, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        String str4 = null;
        String str5 = (i10 & 1) != 0 ? null : str;
        String str6 = (i10 & 2) != 0 ? null : str2;
        if ((i10 & 4) == 0) {
            str4 = str3;
        }
        this(str5, str6, str4, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Login)) {
            return false;
        }
        Login login = (Login) obj;
        if (C5207g.m11106a(this.f17772a, login.f17772a) && C5207g.m11106a(this.f17773b, login.f17773b) && C5207g.m11106a(this.f17774c, login.f17774c) && this.f17775d == login.f17775d && this.f17776e == login.f17776e) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f17772a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f17773b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17774c;
        if (str3 != null) {
            iHashCode = str3.hashCode();
        }
        int i10 = (iHashCode3 + iHashCode) * 31;
        boolean z10 = this.f17775d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i11 = (i10 + r10) * 31;
        boolean z11 = this.f17776e;
        return i11 + (z11 ? 1 : z11);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Login(keyIdentifier=");
        sb2.append(this.f17772a);
        sb2.append(", token=");
        sb2.append(this.f17773b);
        sb2.append(", key=");
        sb2.append(this.f17774c);
        sb2.append(", isFree=");
        sb2.append(this.f17775d);
        sb2.append(", isNewUser=");
        return C0166e.m769p(sb2, this.f17776e, ")");
    }
}
