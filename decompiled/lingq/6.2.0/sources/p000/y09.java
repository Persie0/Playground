package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class y09 extends g19 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f69060a;

    /* JADX INFO: renamed from: b */
    public final String f69061b;

    public y09(ViewKeys viewKeys, String str) {
        viewKeys.getClass();
        str.getClass();
        this.f69060a = viewKeys;
        this.f69061b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y09)) {
            return false;
        }
        y09 y09Var = (y09) obj;
        return this.f69060a == y09Var.f69060a && fa4.m11650l(this.f69061b, y09Var.f69061b);
    }

    public final int hashCode() {
        return this.f69061b.hashCode() + (this.f69060a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSelectionItemSelected(key=" + this.f69060a + ", value=" + this.f69061b + ")";
    }
}
