package p000;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zj5 {

    /* JADX INFO: renamed from: a */
    public final AccessToken f71649a;

    /* JADX INFO: renamed from: b */
    public final AuthenticationToken f71650b;

    /* JADX INFO: renamed from: c */
    public final Set f71651c;

    /* JADX INFO: renamed from: d */
    public final Set f71652d;

    public zj5(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2) {
        this.f71649a = accessToken;
        this.f71650b = authenticationToken;
        this.f71651c = set;
        this.f71652d = set2;
    }

    /* JADX INFO: renamed from: a */
    public final Set m25678a() {
        return this.f71651c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj5)) {
            return false;
        }
        zj5 zj5Var = (zj5) obj;
        return this.f71649a.equals(zj5Var.f71649a) && fa4.m11650l(this.f71650b, zj5Var.f71650b) && this.f71651c.equals(zj5Var.f71651c) && this.f71652d.equals(zj5Var.f71652d);
    }

    public final int hashCode() {
        int iHashCode = this.f71649a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f71650b;
        return this.f71652d.hashCode() + ((this.f71651c.hashCode() + ((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f71649a + ", authenticationToken=" + this.f71650b + ", recentlyGrantedPermissions=" + this.f71651c + ", recentlyDeniedPermissions=" + this.f71652d + ')';
    }
}
