package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes3.dex */
public final class rf8 extends sf8 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f59207a;

    public rf8(ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f59207a = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf8) && this.f59207a == ((rf8) obj).f59207a;
    }

    public final int hashCode() {
        return this.f59207a.hashCode();
    }

    public final String toString() {
        return "OpenActivityDetail(key=" + this.f59207a + ")";
    }
}
