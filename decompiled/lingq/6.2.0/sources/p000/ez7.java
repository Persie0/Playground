package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class ez7 extends jz7 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f38110a;

    public ez7(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f38110a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ez7) && this.f38110a == ((ez7) obj).f38110a;
    }

    public final int hashCode() {
        return this.f38110a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(key=" + this.f38110a + ")";
    }
}
