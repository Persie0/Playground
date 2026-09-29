package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class xj5 implements yj5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f68288a;

    public xj5(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f68288a = networkErrorType;
    }

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType m24571a() {
        return this.f68288a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xj5) && this.f68288a == ((xj5) obj).f68288a;
    }

    public final int hashCode() {
        return this.f68288a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f68288a + ")";
    }
}
