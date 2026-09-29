package p000;

import com.lingq.core.domain.model.challenge.Challenge;

/* JADX INFO: loaded from: classes2.dex */
public final class qr0 implements rr0 {

    /* JADX INFO: renamed from: a */
    public final Challenge f58098a;

    public qr0(Challenge challenge) {
        challenge.getClass();
        this.f58098a = challenge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qr0) && fa4.m11650l(this.f58098a, ((qr0) obj).f58098a);
    }

    @Override // p000.rr0
    public final String getKey() {
        return ux5.m22988k(this.f58098a.f18853a, "challenge-");
    }

    public final int hashCode() {
        return this.f58098a.hashCode();
    }

    public final String toString() {
        return "Standard(challenge=" + this.f58098a + ")";
    }
}
