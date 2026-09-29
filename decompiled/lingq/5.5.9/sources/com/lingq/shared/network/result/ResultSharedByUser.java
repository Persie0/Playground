package com.lingq.shared.network.result;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJG\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¨\u0006\r"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultSharedByUser;", "", "", "id", "", "firstName", "lastName", "photo", "username", "role", "copy", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultSharedByUser {

    /* JADX INFO: renamed from: a */
    public final int f18939a;

    /* JADX INFO: renamed from: b */
    public final String f18940b;

    /* JADX INFO: renamed from: c */
    public final String f18941c;

    /* JADX INFO: renamed from: d */
    public final String f18942d;

    /* JADX INFO: renamed from: e */
    public final String f18943e;

    /* JADX INFO: renamed from: f */
    public final String f18944f;

    public ResultSharedByUser(int i10, @InterfaceC9303g(name = "first_name") String str, @InterfaceC9303g(name = "last_name") String str2, String str3, String str4, String str5) {
        C5207g.m11111f(str, "firstName");
        C5207g.m11111f(str2, "lastName");
        C5207g.m11111f(str3, "photo");
        C5207g.m11111f(str4, "username");
        this.f18939a = i10;
        this.f18940b = str;
        this.f18941c = str2;
        this.f18942d = str3;
        this.f18943e = str4;
        this.f18944f = str5;
    }

    public /* synthetic */ ResultSharedByUser(int i10, String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, str2, str3, str4, (i11 & 32) != 0 ? null : str5);
    }

    public final ResultSharedByUser copy(int id2, @InterfaceC9303g(name = "first_name") String firstName, @InterfaceC9303g(name = "last_name") String lastName, String photo, String username, String role) {
        C5207g.m11111f(firstName, "firstName");
        C5207g.m11111f(lastName, "lastName");
        C5207g.m11111f(photo, "photo");
        C5207g.m11111f(username, "username");
        return new ResultSharedByUser(id2, firstName, lastName, photo, username, role);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultSharedByUser)) {
            return false;
        }
        ResultSharedByUser resultSharedByUser = (ResultSharedByUser) obj;
        if (this.f18939a == resultSharedByUser.f18939a && C5207g.m11106a(this.f18940b, resultSharedByUser.f18940b) && C5207g.m11106a(this.f18941c, resultSharedByUser.f18941c) && C5207g.m11106a(this.f18942d, resultSharedByUser.f18942d) && C5207g.m11106a(this.f18943e, resultSharedByUser.f18943e) && C5207g.m11106a(this.f18944f, resultSharedByUser.f18944f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f18943e, C0166e.m758d(this.f18942d, C0166e.m758d(this.f18941c, C0166e.m758d(this.f18940b, Integer.hashCode(this.f18939a) * 31, 31), 31), 31), 31);
        String str = this.f18944f;
        return iM758d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultSharedByUser(id=");
        sb2.append(this.f18939a);
        sb2.append(", firstName=");
        sb2.append(this.f18940b);
        sb2.append(", lastName=");
        sb2.append(this.f18941c);
        sb2.append(", photo=");
        sb2.append(this.f18942d);
        sb2.append(", username=");
        sb2.append(this.f18943e);
        sb2.append(", role=");
        return C0009a.m23l(sb2, this.f18944f, ")");
    }
}
