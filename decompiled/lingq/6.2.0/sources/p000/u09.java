package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class u09 extends g19 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f63219a;

    public u09(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f63219a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u09) && this.f63219a == ((u09) obj).f63219a;
    }

    public final int hashCode() {
        return this.f63219a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(key=" + this.f63219a + ")";
    }
}
