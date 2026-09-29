package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class j48 implements k48 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f45046a;

    public j48(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f45046a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j48) && this.f45046a == ((j48) obj).f45046a;
    }

    public final int hashCode() {
        return this.f45046a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f45046a + ")";
    }
}
