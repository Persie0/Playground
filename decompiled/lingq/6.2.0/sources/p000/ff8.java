package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class ff8 extends if8 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f39010a;

    public ff8(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f39010a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff8) && this.f39010a == ((ff8) obj).f39010a;
    }

    public final int hashCode() {
        return this.f39010a.hashCode();
    }

    public final String toString() {
        return "OnItemSelected(key=" + this.f39010a + ")";
    }
}
