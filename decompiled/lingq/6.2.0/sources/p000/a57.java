package p000;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class a57 implements qm5 {

    /* JADX INFO: renamed from: a */
    public final NetworkErrorType f268a;

    public a57(NetworkErrorType networkErrorType) {
        networkErrorType.getClass();
        this.f268a = networkErrorType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a57) && this.f268a == ((a57) obj).f268a;
    }

    public final int hashCode() {
        return this.f268a.hashCode();
    }

    public final String toString() {
        return "NetworkError(error=" + this.f268a + ")";
    }
}
