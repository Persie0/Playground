package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class a48 implements qm5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f243a;

    public a48(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f243a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a48) && this.f243a == ((a48) obj).f243a;
    }

    public final int hashCode() {
        return this.f243a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f243a + ")";
    }
}
