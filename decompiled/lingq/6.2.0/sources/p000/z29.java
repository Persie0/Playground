package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class z29 extends c39 {

    /* JADX INFO: renamed from: e */
    public final ViewKeys f70803e;

    /* JADX INFO: renamed from: f */
    public final int f70804f;

    /* JADX INFO: renamed from: g */
    public final boolean f70805g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z29(int i, ViewKeys viewKeys, boolean z) {
        super(viewKeys, "", "", z);
        viewKeys.getClass();
        this.f70803e = viewKeys;
        this.f70804f = i;
        this.f70805g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z29)) {
            return false;
        }
        z29 z29Var = (z29) obj;
        return this.f70803e == z29Var.f70803e && this.f70804f == z29Var.f70804f && this.f70805g == z29Var.f70805g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f70805g) + wq1.m24106b(this.f70804f, this.f70803e.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Switch(selectionKey=");
        sb.append(this.f70803e);
        sb.append(", idText=");
        sb.append(this.f70804f);
        sb.append(", isChecked=");
        return AbstractC3393o1.m17740o(sb, this.f70805g, ")");
    }
}
