package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ox8 {

    /* JADX INFO: renamed from: a */
    public final String f55141a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f55142b;

    /* JADX INFO: renamed from: c */
    public final int f55143c;

    public ox8(int i, String str, ArrayList arrayList) {
        this.f55141a = str;
        this.f55142b = arrayList;
        this.f55143c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ox8)) {
            return false;
        }
        ox8 ox8Var = (ox8) obj;
        return this.f55141a.equals(ox8Var.f55141a) && this.f55142b.equals(ox8Var.f55142b) && this.f55143c == ox8Var.f55143c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55143c) + ((this.f55142b.hashCode() + (this.f55141a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SentenceTokenResult(text=");
        sb.append(this.f55141a);
        sb.append(", tokens=");
        sb.append(this.f55142b);
        sb.append(", textLength=");
        return wq1.m24123s(sb, this.f55143c, ")");
    }
}
