package p000;

import com.lingq.core.domain.model.challenge.Challenge;

/* JADX INFO: loaded from: classes2.dex */
public final class qs0 implements rs0 {

    /* JADX INFO: renamed from: a */
    public final Challenge f58119a;

    public qs0(Challenge challenge) {
        challenge.getClass();
        this.f58119a = challenge;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qs0) && fa4.m11650l(this.f58119a, ((qs0) obj).f58119a);
    }

    public final int hashCode() {
        return this.f58119a.hashCode();
    }

    public final String toString() {
        return "Success(challenge=" + this.f58119a + ")";
    }
}
