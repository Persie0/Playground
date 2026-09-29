package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class i3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenStatus f43453a;

    public i3a(TokenStatus tokenStatus) {
        tokenStatus.getClass();
        this.f43453a = tokenStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i3a) && this.f43453a == ((i3a) obj).f43453a;
    }

    public final int hashCode() {
        return this.f43453a.hashCode();
    }

    public final String toString() {
        return "UpdateStatus(newStatus=" + this.f43453a + ")";
    }
}
