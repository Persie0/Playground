package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class i25 implements j25 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f43382a;

    public i25(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f43382a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i25) && this.f43382a == ((i25) obj).f43382a;
    }

    public final int hashCode() {
        return this.f43382a.hashCode();
    }

    public final String toString() {
        return "NetworkError(networkError=" + this.f43382a + ")";
    }
}
