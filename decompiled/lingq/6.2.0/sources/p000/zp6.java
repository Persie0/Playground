package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes.dex */
public final class zp6 implements qm5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f71939a;

    public zp6(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f71939a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zp6) && this.f71939a == ((zp6) obj).f71939a;
    }

    public final int hashCode() {
        return this.f71939a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f71939a + ")";
    }
}
