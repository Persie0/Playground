package p000;

import com.lingq.core.p012ui.UpgradeReason;

/* JADX INFO: loaded from: classes.dex */
public final class rha implements sha {

    /* JADX INFO: renamed from: a */
    public final UpgradeReason f59324a;

    public rha(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f59324a = upgradeReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rha) && this.f59324a == ((rha) obj).f59324a;
    }

    public final int hashCode() {
        return this.f59324a.hashCode();
    }

    public final String toString() {
        return "Visible(reason=" + this.f59324a + ")";
    }
}
