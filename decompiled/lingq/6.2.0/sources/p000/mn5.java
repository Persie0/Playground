package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes2.dex */
public final class mn5 {
    public static final ln5 Companion = new ln5();

    /* JADX INFO: renamed from: a */
    public final boolean f51559a;

    /* JADX INFO: renamed from: b */
    public final boolean f51560b;

    /* JADX INFO: renamed from: c */
    public final boolean f51561c;

    /* JADX INFO: renamed from: d */
    public final boolean f51562d;

    /* JADX INFO: renamed from: e */
    public final boolean f51563e;

    /* JADX INFO: renamed from: f */
    public final String f51564f;

    /* JADX INFO: renamed from: g */
    public final String f51565g;

    /* JADX INFO: renamed from: h */
    public final boolean f51566h;

    /* JADX INFO: renamed from: i */
    public final int f51567i;

    /* JADX INFO: renamed from: j */
    public final int f51568j;

    /* JADX INFO: renamed from: k */
    public final String f51569k;

    /* JADX INFO: renamed from: l */
    public final String f51570l;

    /* JADX INFO: renamed from: m */
    public final List f51571m;

    /* JADX INFO: renamed from: n */
    public final List f51572n;

    /* JADX INFO: renamed from: o */
    public final Integer f51573o;

    /* JADX INFO: renamed from: p */
    public final kn5 f51574p;

    public mn5(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, boolean z5, int i, int i2, String str3, String str4, List list, List list2, Integer num, kn5 kn5Var, int i3) {
        boolean z6 = (i3 & 1) != 0 ? false : z;
        boolean z7 = (i3 & 2) != 0 ? false : z2;
        boolean z8 = (i3 & 4) == 0;
        boolean z9 = (i3 & 8) != 0 ? false : z3;
        boolean z10 = (i3 & 16) != 0 ? false : z4;
        String str5 = (i3 & 32) != 0 ? "" : str;
        String str6 = (i3 & 64) != 0 ? null : str2;
        boolean z11 = (i3 & 128) != 0 ? false : z5;
        int i4 = (i3 & 256) != 0 ? -1 : i;
        int i5 = (i3 & 512) == 0 ? i2 : 0;
        String str7 = (i3 & 1024) != 0 ? "" : str3;
        String str8 = (i3 & 2048) == 0 ? str4 : "";
        int i6 = i3 & 4096;
        EmptyList emptyList = EmptyList.f47638a;
        List list3 = i6 != 0 ? emptyList : list;
        List list4 = (i3 & 8192) != 0 ? emptyList : list2;
        Integer num2 = (i3 & 16384) != 0 ? null : num;
        kn5 kn5Var2 = (i3 & 32768) != 0 ? null : kn5Var;
        str5.getClass();
        str7.getClass();
        str8.getClass();
        list3.getClass();
        list4.getClass();
        this.f51559a = z6;
        this.f51560b = z7;
        this.f51561c = z8;
        this.f51562d = z9;
        this.f51563e = z10;
        this.f51564f = str5;
        this.f51565g = str6;
        this.f51566h = z11;
        this.f51567i = i4;
        this.f51568j = i5;
        this.f51569k = str7;
        this.f51570l = str8;
        this.f51571m = list3;
        this.f51572n = list4;
        this.f51573o = num2;
        this.f51574p = kn5Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn5)) {
            return false;
        }
        mn5 mn5Var = (mn5) obj;
        return this.f51559a == mn5Var.f51559a && this.f51560b == mn5Var.f51560b && this.f51561c == mn5Var.f51561c && this.f51562d == mn5Var.f51562d && this.f51563e == mn5Var.f51563e && this.f51564f.equals(mn5Var.f51564f) && fa4.m11650l(this.f51565g, mn5Var.f51565g) && this.f51566h == mn5Var.f51566h && this.f51567i == mn5Var.f51567i && this.f51568j == mn5Var.f51568j && this.f51569k.equals(mn5Var.f51569k) && this.f51570l.equals(mn5Var.f51570l) && this.f51571m.equals(mn5Var.f51571m) && this.f51572n.equals(mn5Var.f51572n) && fa4.m11650l(this.f51573o, mn5Var.f51573o) && fa4.m11650l(this.f51574p, mn5Var.f51574p);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f51559a) * 31, 31, this.f51560b), 31, this.f51561c), 31, this.f51562d), 31, this.f51563e), this.f51564f, 31);
        String str = this.f51565g;
        int iM22979b = ux5.m22979b(ux5.m22979b(ux5.m22980c(ux5.m22980c(wq1.m24106b(this.f51568j, wq1.m24106b(this.f51567i, g9a.m12428e((iM22980c + (str == null ? 0 : str.hashCode())) * 31, 31, this.f51566h), 31), 31), this.f51569k, 31), this.f51570l, 31), 31, this.f51571m), 31, this.f51572n);
        Integer num = this.f51573o;
        int iHashCode = (iM22979b + (num == null ? 0 : num.hashCode())) * 31;
        kn5 kn5Var = this.f51574p;
        return iHashCode + (kn5Var != null ? kn5Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("LynxCoachUiState(isVisible=", ", isLoading=", ", isStreaming=", this.f51559a, this.f51560b);
        wq1.m24101A(sbM13357g, this.f51561c, ", isTranslationLoading=", this.f51562d, ", isOutOfCredits=");
        hn1.m13367q(", message=", this.f51564f, ", translation=", sbM13357g, this.f51563e);
        ux5.m22976C(this.f51565g, ", showTranslation=", ", chatId=", sbM13357g, this.f51566h);
        hn1.m13360j(this.f51567i, this.f51568j, ", messageIndex=", ", language=", sbM13357g);
        AbstractC3393o1.m17725C(sbM13357g, this.f51569k, ", tokenizedText=", this.f51570l, ", highlights=");
        hn1.m13372v(sbM13357g, this.f51571m, ", phraseHighlights=", this.f51572n, ", activeTappedWordIndex=");
        sbM13357g.append(this.f51573o);
        sbM13357g.append(", textStyle=");
        sbM13357g.append(this.f51574p);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
