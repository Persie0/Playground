package p000;

import java.security.MessageDigest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cat implements bqn {

    /* JADX INFO: renamed from: b */
    private final Object f4929b;

    public cat(Object obj) {
        bzq.m3278r(obj);
        this.f4929b = obj;
    }

    @Override // p000.bqn
    /* JADX INFO: renamed from: a */
    public final void mo2922a(MessageDigest messageDigest) {
        messageDigest.update(this.f4929b.toString().getBytes(f4192a));
    }

    @Override // p000.bqn
    public final boolean equals(Object obj) {
        if (obj instanceof cat) {
            return this.f4929b.equals(((cat) obj).f4929b);
        }
        return false;
    }

    @Override // p000.bqn
    public final int hashCode() {
        return this.f4929b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.f4929b.toString() + "}";
    }
}
