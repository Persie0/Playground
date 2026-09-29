package p000;

import java.util.Map;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
@ey8
public final class uy8 {
    public static final ty8 Companion = new ty8();

    /* JADX INFO: renamed from: d */
    public static final cs4[] f64542d = {null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new b98(16))};

    /* JADX INFO: renamed from: a */
    public final zy8 f64543a;

    /* JADX INFO: renamed from: b */
    public final k0a f64544b;

    /* JADX INFO: renamed from: c */
    public final Map f64545c;

    public /* synthetic */ uy8(int i, zy8 zy8Var, k0a k0aVar, Map map) {
        if (1 != (i & 1)) {
            n3c.m17204b(i, 1, sy8.f61631a.getDescriptor());
            throw null;
        }
        this.f64543a = zy8Var;
        if ((i & 2) == 0) {
            this.f64544b = null;
        } else {
            this.f64544b = k0aVar;
        }
        if ((i & 4) == 0) {
            this.f64545c = null;
        } else {
            this.f64545c = map;
        }
    }

    /* JADX INFO: renamed from: a */
    public static uy8 m23014a(uy8 uy8Var, zy8 zy8Var, k0a k0aVar, Map map, int i) {
        if ((i & 1) != 0) {
            zy8Var = uy8Var.f64543a;
        }
        if ((i & 2) != 0) {
            k0aVar = uy8Var.f64544b;
        }
        if ((i & 4) != 0) {
            map = uy8Var.f64545c;
        }
        uy8Var.getClass();
        zy8Var.getClass();
        return new uy8(zy8Var, k0aVar, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy8)) {
            return false;
        }
        uy8 uy8Var = (uy8) obj;
        return fa4.m11650l(this.f64543a, uy8Var.f64543a) && fa4.m11650l(this.f64544b, uy8Var.f64544b) && fa4.m11650l(this.f64545c, uy8Var.f64545c);
    }

    public final int hashCode() {
        int iHashCode = this.f64543a.hashCode() * 31;
        k0a k0aVar = this.f64544b;
        int iHashCode2 = (iHashCode + (k0aVar == null ? 0 : Long.hashCode(k0aVar.f46519a))) * 31;
        Map map = this.f64545c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f64543a + ", backgroundTime=" + this.f64544b + ", processDataMap=" + this.f64545c + ')';
    }

    public uy8(zy8 zy8Var, k0a k0aVar, Map map) {
        zy8Var.getClass();
        this.f64543a = zy8Var;
        this.f64544b = k0aVar;
        this.f64545c = map;
    }
}
