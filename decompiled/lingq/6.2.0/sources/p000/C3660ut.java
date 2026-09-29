package p000;

import com.lingq.core.domain.model.user.Login;

/* JADX INFO: renamed from: ut */
/* JADX INFO: loaded from: classes.dex */
public final class C3660ut implements InterfaceC3808yt {

    /* JADX INFO: renamed from: a */
    public final Login f64315a;

    public C3660ut(Login login) {
        login.getClass();
        this.f64315a = login;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3660ut) && fa4.m11650l(this.f64315a, ((C3660ut) obj).f64315a);
    }

    public final int hashCode() {
        return this.f64315a.hashCode();
    }

    public final String toString() {
        return "Authenticated(login=" + this.f64315a + ")";
    }
}
