package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class hz7 extends jz7 {

    /* JADX INFO: renamed from: a */
    public final ViewKeys f43243a;

    /* JADX INFO: renamed from: b */
    public final String f43244b;

    public hz7(ViewKeys viewKeys, String str) {
        viewKeys.getClass();
        str.getClass();
        this.f43243a = viewKeys;
        this.f43244b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz7)) {
            return false;
        }
        hz7 hz7Var = (hz7) obj;
        return this.f43243a == hz7Var.f43243a && fa4.m11650l(this.f43244b, hz7Var.f43244b);
    }

    public final int hashCode() {
        return this.f43244b.hashCode() + (this.f43243a.hashCode() * 31);
    }

    public final String toString() {
        return "OnSelectionItemSelected(key=" + this.f43243a + ", value=" + this.f43244b + ")";
    }
}
