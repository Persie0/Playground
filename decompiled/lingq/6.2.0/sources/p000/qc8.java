package p000;

import com.lingq.feature.review.data.ReviewActivityResult;
import com.lingq.feature.review.data.ReviewCardLayoutStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class qc8 {

    /* JADX INFO: renamed from: a */
    public final ReviewCardLayoutStyle f57567a;

    /* JADX INFO: renamed from: b */
    public final Integer f57568b;

    /* JADX INFO: renamed from: c */
    public final String f57569c;

    /* JADX INFO: renamed from: d */
    public final String f57570d;

    /* JADX INFO: renamed from: e */
    public final String f57571e;

    /* JADX INFO: renamed from: f */
    public final String f57572f;

    /* JADX INFO: renamed from: g */
    public final String f57573g;

    /* JADX INFO: renamed from: h */
    public final List f57574h;

    /* JADX INFO: renamed from: i */
    public final List f57575i;

    /* JADX INFO: renamed from: j */
    public final boolean f57576j;

    /* JADX INFO: renamed from: k */
    public final boolean f57577k;

    /* JADX INFO: renamed from: l */
    public final boolean f57578l;

    /* JADX INFO: renamed from: m */
    public final boolean f57579m;

    /* JADX INFO: renamed from: n */
    public final ReviewActivityResult f57580n;

    /* JADX INFO: renamed from: o */
    public final String f57581o;

    /* JADX INFO: renamed from: p */
    public final vs3 f57582p;

    /* JADX INFO: renamed from: q */
    public final int f57583q;

    /* JADX INFO: renamed from: r */
    public final Integer f57584r;

    public qc8(ReviewCardLayoutStyle reviewCardLayoutStyle, Integer num, String str, String str2, String str3, String str4, String str5, List list, ArrayList arrayList, boolean z, boolean z2, ReviewActivityResult reviewActivityResult, String str6, vs3 vs3Var, int i, Integer num2, int i2) {
        Integer num3 = (i2 & 2) != 0 ? null : num;
        String str7 = (i2 & 8) != 0 ? null : str2;
        String str8 = (i2 & 16) != 0 ? null : str3;
        String str9 = (i2 & 32) != 0 ? null : str4;
        String str10 = (i2 & 64) != 0 ? null : str5;
        int i3 = i2 & 128;
        List list2 = EmptyList.f47638a;
        List list3 = i3 != 0 ? list2 : list;
        list2 = (i2 & 256) == 0 ? arrayList : list2;
        boolean z3 = (i2 & 512) != 0 ? false : z;
        boolean z4 = (i2 & 1024) != 0 ? false : z2;
        boolean z5 = (i2 & 2048) == 0;
        boolean z6 = (i2 & 4096) == 0;
        ReviewActivityResult reviewActivityResult2 = (i2 & 8192) != 0 ? ReviewActivityResult.None : reviewActivityResult;
        String str11 = (i2 & 16384) != 0 ? null : str6;
        vs3 vs3Var2 = (i2 & 32768) != 0 ? null : vs3Var;
        int i4 = (i2 & 65536) != 0 ? 0 : i;
        Integer num4 = (i2 & 131072) != 0 ? null : num2;
        reviewCardLayoutStyle.getClass();
        str.getClass();
        list3.getClass();
        reviewActivityResult2.getClass();
        this.f57567a = reviewCardLayoutStyle;
        this.f57568b = num3;
        this.f57569c = str;
        this.f57570d = str7;
        this.f57571e = str8;
        this.f57572f = str9;
        this.f57573g = str10;
        this.f57574h = list3;
        this.f57575i = list2;
        this.f57576j = z3;
        this.f57577k = z4;
        this.f57578l = z5;
        this.f57579m = z6;
        this.f57580n = reviewActivityResult2;
        this.f57581o = str11;
        this.f57582p = vs3Var2;
        this.f57583q = i4;
        this.f57584r = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qc8)) {
            return false;
        }
        qc8 qc8Var = (qc8) obj;
        return this.f57567a == qc8Var.f57567a && fa4.m11650l(this.f57568b, qc8Var.f57568b) && fa4.m11650l(this.f57569c, qc8Var.f57569c) && fa4.m11650l(this.f57570d, qc8Var.f57570d) && fa4.m11650l(this.f57571e, qc8Var.f57571e) && fa4.m11650l(this.f57572f, qc8Var.f57572f) && fa4.m11650l(this.f57573g, qc8Var.f57573g) && fa4.m11650l(this.f57574h, qc8Var.f57574h) && fa4.m11650l(this.f57575i, qc8Var.f57575i) && this.f57576j == qc8Var.f57576j && this.f57577k == qc8Var.f57577k && this.f57578l == qc8Var.f57578l && this.f57579m == qc8Var.f57579m && this.f57580n == qc8Var.f57580n && fa4.m11650l(this.f57581o, qc8Var.f57581o) && fa4.m11650l(this.f57582p, qc8Var.f57582p) && this.f57583q == qc8Var.f57583q && fa4.m11650l(this.f57584r, qc8Var.f57584r);
    }

    public final int hashCode() {
        int iHashCode = this.f57567a.hashCode() * 31;
        Integer num = this.f57568b;
        int iM22980c = ux5.m22980c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, this.f57569c, 31);
        String str = this.f57570d;
        int iHashCode2 = (iM22980c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57571e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57572f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f57573g;
        int iHashCode5 = (this.f57580n.hashCode() + g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(ux5.m22979b(ux5.m22979b((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f57574h), 31, this.f57575i), 31, this.f57576j), 31, this.f57577k), 31, this.f57578l), 31, this.f57579m)) * 31;
        String str5 = this.f57581o;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        vs3 vs3Var = this.f57582p;
        int iM24106b = wq1.m24106b(this.f57583q, (iHashCode6 + (vs3Var == null ? 0 : vs3Var.hashCode())) * 31, 31);
        Integer num2 = this.f57584r;
        return iM24106b + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewCardState(layoutStyle=");
        sb.append(this.f57567a);
        sb.append(", descriptionRes=");
        sb.append(this.f57568b);
        sb.append(", title=");
        AbstractC3393o1.m17725C(sb, this.f57569c, ", altScript=", this.f57570d, ", translation=");
        AbstractC3393o1.m17725C(sb, this.f57571e, ", phrase=", this.f57572f, ", notes=");
        hn1.m13366p(this.f57573g, ", tags=", ", answerOptions=", sb, this.f57574h);
        sb.append(this.f57575i);
        sb.append(", showTts=");
        sb.append(this.f57576j);
        sb.append(", showStatus=");
        wq1.m24101A(sb, this.f57577k, ", showEdit=", this.f57578l, ", showResultLabel=");
        sb.append(this.f57579m);
        sb.append(", result=");
        sb.append(this.f57580n);
        sb.append(", answeredText=");
        sb.append(this.f57581o);
        sb.append(", colorScheme=");
        sb.append(this.f57582p);
        sb.append(", status=");
        sb.append(this.f57583q);
        sb.append(", extendedStatus=");
        sb.append(this.f57584r);
        sb.append(")");
        return sb.toString();
    }
}
