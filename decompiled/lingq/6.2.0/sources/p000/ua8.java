package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class ua8 extends cb8 {

    /* JADX INFO: renamed from: a */
    public final xz7 f63644a;

    public ua8(xz7 xz7Var) {
        this.f63644a = xz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ua8) && this.f63644a.equals(((ua8) obj).f63644a);
    }

    public final int hashCode() {
        return this.f63644a.hashCode();
    }

    public final String toString() {
        return "OnSpeakingTokenClicked(token=" + this.f63644a + ")";
    }
}
