package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class tl7 implements qm5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f62484a;

    public tl7(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f62484a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tl7) && this.f62484a == ((tl7) obj).f62484a;
    }

    public final int hashCode() {
        return this.f62484a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f62484a + ")";
    }
}
