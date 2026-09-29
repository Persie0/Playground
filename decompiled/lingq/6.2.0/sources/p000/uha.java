package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class uha implements qm5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f63948a;

    public uha(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f63948a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uha) && this.f63948a == ((uha) obj).f63948a;
    }

    public final int hashCode() {
        return this.f63948a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f63948a + ")";
    }
}
