package p469x0;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: x0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10003d {

    /* JADX INFO: renamed from: a */
    public final boolean f50864a;

    /* JADX INFO: renamed from: b */
    public final boolean f50865b;

    /* JADX INFO: renamed from: x0.d$a */
    public static final class a extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50866c;

        /* JADX INFO: renamed from: d */
        public final float f50867d;

        /* JADX INFO: renamed from: e */
        public final float f50868e;

        /* JADX INFO: renamed from: f */
        public final boolean f50869f;

        /* JADX INFO: renamed from: g */
        public final boolean f50870g;

        /* JADX INFO: renamed from: h */
        public final float f50871h;

        /* JADX INFO: renamed from: i */
        public final float f50872i;

        public a(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            super(false, false, 3);
            this.f50866c = f3;
            this.f50867d = f10;
            this.f50868e = f11;
            this.f50869f = z10;
            this.f50870g = z11;
            this.f50871h = f12;
            this.f50872i = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f50866c, aVar.f50866c) == 0 && Float.compare(this.f50867d, aVar.f50867d) == 0 && Float.compare(this.f50868e, aVar.f50868e) == 0 && this.f50869f == aVar.f50869f && this.f50870g == aVar.f50870g && Float.compare(this.f50871h, aVar.f50871h) == 0 && Float.compare(this.f50872i, aVar.f50872i) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final int hashCode() {
            int iM846e = C0204c.m846e(this.f50868e, C0204c.m846e(this.f50867d, Float.hashCode(this.f50866c) * 31, 31), 31);
            ?? r10 = 1;
            boolean z10 = this.f50869f;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iM846e + r11) * 31;
            boolean z11 = this.f50870g;
            if (!z11) {
                r10 = z11;
            }
            return Float.hashCode(this.f50872i) + C0204c.m846e(this.f50871h, (i10 + r10) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
            sb2.append(this.f50866c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f50867d);
            sb2.append(", theta=");
            sb2.append(this.f50868e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f50869f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f50870g);
            sb2.append(", arcStartX=");
            sb2.append(this.f50871h);
            sb2.append(", arcStartY=");
            return C0141b.m612h(sb2, this.f50872i, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$b */
    public static final class b extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public static final b f50873c = new b();

        public b() {
            super(false, false, 3);
        }
    }

    /* JADX INFO: renamed from: x0.d$c */
    public static final class c extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50874c;

        /* JADX INFO: renamed from: d */
        public final float f50875d;

        /* JADX INFO: renamed from: e */
        public final float f50876e;

        /* JADX INFO: renamed from: f */
        public final float f50877f;

        /* JADX INFO: renamed from: g */
        public final float f50878g;

        /* JADX INFO: renamed from: h */
        public final float f50879h;

        public c(float f3, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2);
            this.f50874c = f3;
            this.f50875d = f10;
            this.f50876e = f11;
            this.f50877f = f12;
            this.f50878g = f13;
            this.f50879h = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (Float.compare(this.f50874c, cVar.f50874c) == 0 && Float.compare(this.f50875d, cVar.f50875d) == 0 && Float.compare(this.f50876e, cVar.f50876e) == 0 && Float.compare(this.f50877f, cVar.f50877f) == 0 && Float.compare(this.f50878g, cVar.f50878g) == 0 && Float.compare(this.f50879h, cVar.f50879h) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50879h) + C0204c.m846e(this.f50878g, C0204c.m846e(this.f50877f, C0204c.m846e(this.f50876e, C0204c.m846e(this.f50875d, Float.hashCode(this.f50874c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
            sb2.append(this.f50874c);
            sb2.append(", y1=");
            sb2.append(this.f50875d);
            sb2.append(", x2=");
            sb2.append(this.f50876e);
            sb2.append(", y2=");
            sb2.append(this.f50877f);
            sb2.append(", x3=");
            sb2.append(this.f50878g);
            sb2.append(", y3=");
            return C0141b.m612h(sb2, this.f50879h, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$d */
    public static final class d extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50880c;

        public d(float f3) {
            super(false, false, 3);
            this.f50880c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f50880c, ((d) obj).f50880c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50880c);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("HorizontalTo(x="), this.f50880c, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$e */
    public static final class e extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50881c;

        /* JADX INFO: renamed from: d */
        public final float f50882d;

        public e(float f3, float f10) {
            super(false, false, 3);
            this.f50881c = f3;
            this.f50882d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f50881c, eVar.f50881c) == 0 && Float.compare(this.f50882d, eVar.f50882d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50882d) + (Float.hashCode(this.f50881c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LineTo(x=");
            sb2.append(this.f50881c);
            sb2.append(", y=");
            return C0141b.m612h(sb2, this.f50882d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$f */
    public static final class f extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50883c;

        /* JADX INFO: renamed from: d */
        public final float f50884d;

        public f(float f3, float f10) {
            super(false, false, 3);
            this.f50883c = f3;
            this.f50884d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f50883c, fVar.f50883c) == 0 && Float.compare(this.f50884d, fVar.f50884d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50884d) + (Float.hashCode(this.f50883c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MoveTo(x=");
            sb2.append(this.f50883c);
            sb2.append(", y=");
            return C0141b.m612h(sb2, this.f50884d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$g */
    public static final class g extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50885c;

        /* JADX INFO: renamed from: d */
        public final float f50886d;

        /* JADX INFO: renamed from: e */
        public final float f50887e;

        /* JADX INFO: renamed from: f */
        public final float f50888f;

        public g(float f3, float f10, float f11, float f12) {
            super(false, true, 1);
            this.f50885c = f3;
            this.f50886d = f10;
            this.f50887e = f11;
            this.f50888f = f12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f50885c, gVar.f50885c) == 0 && Float.compare(this.f50886d, gVar.f50886d) == 0 && Float.compare(this.f50887e, gVar.f50887e) == 0 && Float.compare(this.f50888f, gVar.f50888f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50888f) + C0204c.m846e(this.f50887e, C0204c.m846e(this.f50886d, Float.hashCode(this.f50885c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QuadTo(x1=");
            sb2.append(this.f50885c);
            sb2.append(", y1=");
            sb2.append(this.f50886d);
            sb2.append(", x2=");
            sb2.append(this.f50887e);
            sb2.append(", y2=");
            return C0141b.m612h(sb2, this.f50888f, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$h */
    public static final class h extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50889c;

        /* JADX INFO: renamed from: d */
        public final float f50890d;

        /* JADX INFO: renamed from: e */
        public final float f50891e;

        /* JADX INFO: renamed from: f */
        public final float f50892f;

        public h(float f3, float f10, float f11, float f12) {
            super(true, false, 2);
            this.f50889c = f3;
            this.f50890d = f10;
            this.f50891e = f11;
            this.f50892f = f12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Float.compare(this.f50889c, hVar.f50889c) == 0 && Float.compare(this.f50890d, hVar.f50890d) == 0 && Float.compare(this.f50891e, hVar.f50891e) == 0 && Float.compare(this.f50892f, hVar.f50892f) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50892f) + C0204c.m846e(this.f50891e, C0204c.m846e(this.f50890d, Float.hashCode(this.f50889c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
            sb2.append(this.f50889c);
            sb2.append(", y1=");
            sb2.append(this.f50890d);
            sb2.append(", x2=");
            sb2.append(this.f50891e);
            sb2.append(", y2=");
            return C0141b.m612h(sb2, this.f50892f, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$i */
    public static final class i extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50893c;

        /* JADX INFO: renamed from: d */
        public final float f50894d;

        public i(float f3, float f10) {
            super(false, true, 1);
            this.f50893c = f3;
            this.f50894d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f50893c, iVar.f50893c) == 0 && Float.compare(this.f50894d, iVar.f50894d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50894d) + (Float.hashCode(this.f50893c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
            sb2.append(this.f50893c);
            sb2.append(", y=");
            return C0141b.m612h(sb2, this.f50894d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$j */
    public static final class j extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50895c;

        /* JADX INFO: renamed from: d */
        public final float f50896d;

        /* JADX INFO: renamed from: e */
        public final float f50897e;

        /* JADX INFO: renamed from: f */
        public final boolean f50898f;

        /* JADX INFO: renamed from: g */
        public final boolean f50899g;

        /* JADX INFO: renamed from: h */
        public final float f50900h;

        /* JADX INFO: renamed from: i */
        public final float f50901i;

        public j(float f3, float f10, float f11, boolean z10, boolean z11, float f12, float f13) {
            super(false, false, 3);
            this.f50895c = f3;
            this.f50896d = f10;
            this.f50897e = f11;
            this.f50898f = z10;
            this.f50899g = z11;
            this.f50900h = f12;
            this.f50901i = f13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f50895c, jVar.f50895c) == 0 && Float.compare(this.f50896d, jVar.f50896d) == 0 && Float.compare(this.f50897e, jVar.f50897e) == 0 && this.f50898f == jVar.f50898f && this.f50899g == jVar.f50899g && Float.compare(this.f50900h, jVar.f50900h) == 0 && Float.compare(this.f50901i, jVar.f50901i) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r2v2, types: [int] */
        /* JADX WARN: Type inference failed for: r2v5 */
        /* JADX WARN: Type inference failed for: r2v6 */
        public final int hashCode() {
            int iM846e = C0204c.m846e(this.f50897e, C0204c.m846e(this.f50896d, Float.hashCode(this.f50895c) * 31, 31), 31);
            ?? r10 = 1;
            boolean z10 = this.f50898f;
            ?? r11 = z10;
            if (z10) {
                r11 = 1;
            }
            int i10 = (iM846e + r11) * 31;
            boolean z11 = this.f50899g;
            if (!z11) {
                r10 = z11;
            }
            return Float.hashCode(this.f50901i) + C0204c.m846e(this.f50900h, (i10 + r10) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeArcTo(horizontalEllipseRadius=");
            sb2.append(this.f50895c);
            sb2.append(", verticalEllipseRadius=");
            sb2.append(this.f50896d);
            sb2.append(", theta=");
            sb2.append(this.f50897e);
            sb2.append(", isMoreThanHalf=");
            sb2.append(this.f50898f);
            sb2.append(", isPositiveArc=");
            sb2.append(this.f50899g);
            sb2.append(", arcStartDx=");
            sb2.append(this.f50900h);
            sb2.append(", arcStartDy=");
            return C0141b.m612h(sb2, this.f50901i, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$k */
    public static final class k extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50902c;

        /* JADX INFO: renamed from: d */
        public final float f50903d;

        /* JADX INFO: renamed from: e */
        public final float f50904e;

        /* JADX INFO: renamed from: f */
        public final float f50905f;

        /* JADX INFO: renamed from: g */
        public final float f50906g;

        /* JADX INFO: renamed from: h */
        public final float f50907h;

        public k(float f3, float f10, float f11, float f12, float f13, float f14) {
            super(true, false, 2);
            this.f50902c = f3;
            this.f50903d = f10;
            this.f50904e = f11;
            this.f50905f = f12;
            this.f50906g = f13;
            this.f50907h = f14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f50902c, kVar.f50902c) == 0 && Float.compare(this.f50903d, kVar.f50903d) == 0 && Float.compare(this.f50904e, kVar.f50904e) == 0 && Float.compare(this.f50905f, kVar.f50905f) == 0 && Float.compare(this.f50906g, kVar.f50906g) == 0 && Float.compare(this.f50907h, kVar.f50907h) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50907h) + C0204c.m846e(this.f50906g, C0204c.m846e(this.f50905f, C0204c.m846e(this.f50904e, C0204c.m846e(this.f50903d, Float.hashCode(this.f50902c) * 31, 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeCurveTo(dx1=");
            sb2.append(this.f50902c);
            sb2.append(", dy1=");
            sb2.append(this.f50903d);
            sb2.append(", dx2=");
            sb2.append(this.f50904e);
            sb2.append(", dy2=");
            sb2.append(this.f50905f);
            sb2.append(", dx3=");
            sb2.append(this.f50906g);
            sb2.append(", dy3=");
            return C0141b.m612h(sb2, this.f50907h, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$l */
    public static final class l extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50908c;

        public l(float f3) {
            super(false, false, 3);
            this.f50908c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f50908c, ((l) obj).f50908c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50908c);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("RelativeHorizontalTo(dx="), this.f50908c, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$m */
    public static final class m extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50909c;

        /* JADX INFO: renamed from: d */
        public final float f50910d;

        public m(float f3, float f10) {
            super(false, false, 3);
            this.f50909c = f3;
            this.f50910d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f50909c, mVar.f50909c) == 0 && Float.compare(this.f50910d, mVar.f50910d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50910d) + (Float.hashCode(this.f50909c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeLineTo(dx=");
            sb2.append(this.f50909c);
            sb2.append(", dy=");
            return C0141b.m612h(sb2, this.f50910d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$n */
    public static final class n extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50911c;

        /* JADX INFO: renamed from: d */
        public final float f50912d;

        public n(float f3, float f10) {
            super(false, false, 3);
            this.f50911c = f3;
            this.f50912d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f50911c, nVar.f50911c) == 0 && Float.compare(this.f50912d, nVar.f50912d) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50912d) + (Float.hashCode(this.f50911c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
            sb2.append(this.f50911c);
            sb2.append(", dy=");
            return C0141b.m612h(sb2, this.f50912d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$o */
    public static final class o extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50913c;

        /* JADX INFO: renamed from: d */
        public final float f50914d;

        /* JADX INFO: renamed from: e */
        public final float f50915e;

        /* JADX INFO: renamed from: f */
        public final float f50916f;

        public o(float f3, float f10, float f11, float f12) {
            super(false, true, 1);
            this.f50913c = f3;
            this.f50914d = f10;
            this.f50915e = f11;
            this.f50916f = f12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f50913c, oVar.f50913c) == 0 && Float.compare(this.f50914d, oVar.f50914d) == 0 && Float.compare(this.f50915e, oVar.f50915e) == 0 && Float.compare(this.f50916f, oVar.f50916f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50916f) + C0204c.m846e(this.f50915e, C0204c.m846e(this.f50914d, Float.hashCode(this.f50913c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
            sb2.append(this.f50913c);
            sb2.append(", dy1=");
            sb2.append(this.f50914d);
            sb2.append(", dx2=");
            sb2.append(this.f50915e);
            sb2.append(", dy2=");
            return C0141b.m612h(sb2, this.f50916f, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$p */
    public static final class p extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50917c;

        /* JADX INFO: renamed from: d */
        public final float f50918d;

        /* JADX INFO: renamed from: e */
        public final float f50919e;

        /* JADX INFO: renamed from: f */
        public final float f50920f;

        public p(float f3, float f10, float f11, float f12) {
            super(true, false, 2);
            this.f50917c = f3;
            this.f50918d = f10;
            this.f50919e = f11;
            this.f50920f = f12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f50917c, pVar.f50917c) == 0 && Float.compare(this.f50918d, pVar.f50918d) == 0 && Float.compare(this.f50919e, pVar.f50919e) == 0 && Float.compare(this.f50920f, pVar.f50920f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50920f) + C0204c.m846e(this.f50919e, C0204c.m846e(this.f50918d, Float.hashCode(this.f50917c) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveCurveTo(dx1=");
            sb2.append(this.f50917c);
            sb2.append(", dy1=");
            sb2.append(this.f50918d);
            sb2.append(", dx2=");
            sb2.append(this.f50919e);
            sb2.append(", dy2=");
            return C0141b.m612h(sb2, this.f50920f, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$q */
    public static final class q extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50921c;

        /* JADX INFO: renamed from: d */
        public final float f50922d;

        public q(float f3, float f10) {
            super(false, true, 1);
            this.f50921c = f3;
            this.f50922d = f10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            if (Float.compare(this.f50921c, qVar.f50921c) == 0 && Float.compare(this.f50922d, qVar.f50922d) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50922d) + (Float.hashCode(this.f50921c) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
            sb2.append(this.f50921c);
            sb2.append(", dy=");
            return C0141b.m612h(sb2, this.f50922d, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$r */
    public static final class r extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50923c;

        public r(float f3) {
            super(false, false, 3);
            this.f50923c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f50923c, ((r) obj).f50923c) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50923c);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("RelativeVerticalTo(dy="), this.f50923c, ')');
        }
    }

    /* JADX INFO: renamed from: x0.d$s */
    public static final class s extends AbstractC10003d {

        /* JADX INFO: renamed from: c */
        public final float f50924c;

        public s(float f3) {
            super(false, false, 3);
            this.f50924c = f3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof s) && Float.compare(this.f50924c, ((s) obj).f50924c) == 0) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(this.f50924c);
        }

        public final String toString() {
            return C0141b.m612h(new StringBuilder("VerticalTo(y="), this.f50924c, ')');
        }
    }

    public AbstractC10003d(boolean z10, boolean z11, int i10) {
        z10 = (i10 & 1) != 0 ? false : z10;
        z11 = (i10 & 2) != 0 ? false : z11;
        this.f50864a = z10;
        this.f50865b = z11;
    }
}
