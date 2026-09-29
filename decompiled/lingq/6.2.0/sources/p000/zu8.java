package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zu8 {

    /* JADX INFO: renamed from: a */
    public final List f72191a;

    /* JADX INFO: renamed from: b */
    public final String f72192b;

    /* JADX INFO: renamed from: c */
    public final e28 f72193c;

    /* JADX INFO: renamed from: d */
    public final int f72194d;

    /* JADX INFO: renamed from: e */
    public final boolean f72195e;

    /* JADX INFO: renamed from: f */
    public final Integer f72196f;

    public zu8(List list, String str, e28 e28Var, int i, boolean z, Integer num) {
        this.f72191a = list;
        this.f72192b = str;
        this.f72193c = e28Var;
        this.f72194d = i;
        this.f72195e = z;
        this.f72196f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu8)) {
            return false;
        }
        zu8 zu8Var = (zu8) obj;
        return this.f72191a.equals(zu8Var.f72191a) && this.f72192b.equals(zu8Var.f72192b) && this.f72193c.equals(zu8Var.f72193c) && this.f72194d == zu8Var.f72194d && this.f72195e == zu8Var.f72195e && fa4.m11650l(this.f72196f, zu8Var.f72196f);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(wq1.m24106b(this.f72194d, (this.f72193c.hashCode() + ux5.m22980c(this.f72191a.hashCode() * 31, this.f72192b, 31)) * 31, 31), 31, this.f72195e);
        Integer num = this.f72196f;
        return iM12428e + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "SelectionEvaluation(selectedTokens=" + this.f72191a + ", selectedText=" + this.f72192b + ", anchorRect=" + this.f72193c + ", wordsCount=" + this.f72194d + ", areAllFromSameSentence=" + this.f72195e + ", sentenceIndex=" + this.f72196f + ")";
    }
}
