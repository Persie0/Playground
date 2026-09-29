package p231l1;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.AndroidParagraph;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: l1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7208b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7207a f40548a;

    /* JADX INFO: renamed from: b */
    public final int f40549b;

    /* JADX INFO: renamed from: c */
    public final int f40550c;

    /* JADX INFO: renamed from: d */
    public final int f40551d;

    /* JADX INFO: renamed from: e */
    public final int f40552e;

    /* JADX INFO: renamed from: f */
    public final float f40553f;

    /* JADX INFO: renamed from: g */
    public final float f40554g;

    public C7208b(AndroidParagraph androidParagraph, int i10, int i11, int i12, int i13, float f3, float f10) {
        this.f40548a = androidParagraph;
        this.f40549b = i10;
        this.f40550c = i11;
        this.f40551d = i12;
        this.f40552e = i13;
        this.f40553f = f3;
        this.f40554g = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7208b)) {
            return false;
        }
        C7208b c7208b = (C7208b) obj;
        if (C5207g.m11106a(this.f40548a, c7208b.f40548a) && this.f40549b == c7208b.f40549b && this.f40550c == c7208b.f40550c && this.f40551d == c7208b.f40551d && this.f40552e == c7208b.f40552e && Float.compare(this.f40553f, c7208b.f40553f) == 0 && Float.compare(this.f40554g, c7208b.f40554g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f40554g) + C0204c.m846e(this.f40553f, C0009a.m16d(this.f40552e, C0009a.m16d(this.f40551d, C0009a.m16d(this.f40550c, C0009a.m16d(this.f40549b, this.f40548a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphInfo(paragraph=");
        sb2.append(this.f40548a);
        sb2.append(", startIndex=");
        sb2.append(this.f40549b);
        sb2.append(", endIndex=");
        sb2.append(this.f40550c);
        sb2.append(", startLineIndex=");
        sb2.append(this.f40551d);
        sb2.append(", endLineIndex=");
        sb2.append(this.f40552e);
        sb2.append(", top=");
        sb2.append(this.f40553f);
        sb2.append(", bottom=");
        return C0141b.m612h(sb2, this.f40554g, ')');
    }
}
