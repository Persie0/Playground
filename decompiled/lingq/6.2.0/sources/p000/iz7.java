package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class iz7 extends jz7 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f44808a;

    /* JADX INFO: renamed from: b */
    public final boolean f44809b;

    public iz7(ViewKeys viewKeys, boolean z) {
        viewKeys.getClass();
        this.f44808a = viewKeys;
        this.f44809b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz7)) {
            return false;
        }
        iz7 iz7Var = (iz7) obj;
        return this.f44808a == iz7Var.f44808a && this.f44809b == iz7Var.f44809b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f44809b) + (this.f44808a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSwitchChanged(key=" + this.f44808a + ", isOn=" + this.f44809b + ")";
    }
}
