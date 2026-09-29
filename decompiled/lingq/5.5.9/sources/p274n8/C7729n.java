package p274n8;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import dm.C5207g;
import java.util.Set;

/* JADX INFO: renamed from: n8.n */
/* JADX INFO: loaded from: classes.dex */
public final class C7729n {

    /* JADX INFO: renamed from: a */
    public final AccessToken f42295a;

    /* JADX INFO: renamed from: b */
    public final AuthenticationToken f42296b;

    /* JADX INFO: renamed from: c */
    public final Set<String> f42297c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f42298d;

    public C7729n(AccessToken accessToken, AuthenticationToken authenticationToken, Set<String> set, Set<String> set2) {
        this.f42295a = accessToken;
        this.f42296b = authenticationToken;
        this.f42297c = set;
        this.f42298d = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7729n)) {
            return false;
        }
        C7729n c7729n = (C7729n) obj;
        if (C5207g.m11106a(this.f42295a, c7729n.f42295a) && C5207g.m11106a(this.f42296b, c7729n.f42296b) && C5207g.m11106a(this.f42297c, c7729n.f42297c) && C5207g.m11106a(this.f42298d, c7729n.f42298d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f42295a.hashCode() * 31;
        AuthenticationToken authenticationToken = this.f42296b;
        return this.f42298d.hashCode() + ((this.f42297c.hashCode() + ((iHashCode + (authenticationToken == null ? 0 : authenticationToken.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        return "LoginResult(accessToken=" + this.f42295a + ", authenticationToken=" + this.f42296b + ", recentlyGrantedPermissions=" + this.f42297c + ", recentlyDeniedPermissions=" + this.f42298d + ')';
    }
}
