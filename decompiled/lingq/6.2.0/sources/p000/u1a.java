package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class u1a extends w1a {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f63255a;

    public u1a(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f63255a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u1a) && this.f63255a == ((u1a) obj).f63255a;
    }

    public final int hashCode() {
        return this.f63255a.hashCode();
    }

    public final String toString() {
        return "LastActivityBlocked(key=" + this.f63255a + ")";
    }
}
