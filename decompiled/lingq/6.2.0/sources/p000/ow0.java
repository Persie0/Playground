package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ow0 {

    /* JADX INFO: renamed from: a */
    public final int f55051a;

    /* JADX INFO: renamed from: b */
    public final int f55052b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f55053c;

    public ow0(ArrayList arrayList, int i, int i2) {
        this.f55051a = i;
        this.f55052b = i2;
        this.f55053c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final int m18527a() {
        return this.f55051a;
    }

    /* JADX INFO: renamed from: b */
    public final int m18528b() {
        return this.f55052b;
    }

    /* JADX INFO: renamed from: c */
    public final List m18529c() {
        return this.f55053c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow0)) {
            return false;
        }
        ow0 ow0Var = (ow0) obj;
        return this.f55051a == ow0Var.f55051a && this.f55052b == ow0Var.f55052b && this.f55053c.equals(ow0Var.f55053c);
    }

    public final int hashCode() {
        return this.f55053c.hashCode() + wq1.m24106b(this.f55052b, Integer.hashCode(this.f55051a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f55051a, this.f55052b, "ChatMessagePhrasesEntity(chatId=", ", messageIndex=", ", phrases=");
        sbM22994q.append(this.f55053c);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
