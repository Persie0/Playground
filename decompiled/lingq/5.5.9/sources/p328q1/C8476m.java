package p328q1;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import dm.C5207g;
import java.util.List;
import p385sf.C9000b;

/* JADX INFO: renamed from: q1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8476m implements Comparable<C8476m> {

    /* JADX INFO: renamed from: b */
    public static final C8476m f45646b;

    /* JADX INFO: renamed from: c */
    public static final C8476m f45647c;

    /* JADX INFO: renamed from: d */
    public static final C8476m f45648d;

    /* JADX INFO: renamed from: e */
    public static final C8476m f45649e;

    /* JADX INFO: renamed from: f */
    public static final C8476m f45650f;

    /* JADX INFO: renamed from: g */
    public static final C8476m f45651g;

    /* JADX INFO: renamed from: h */
    public static final C8476m f45652h;

    /* JADX INFO: renamed from: i */
    public static final C8476m f45653i;

    /* JADX INFO: renamed from: j */
    public static final List<C8476m> f45654j;

    /* JADX INFO: renamed from: a */
    public final int f45655a;

    static {
        C8476m c8476m = new C8476m(100);
        C8476m c8476m2 = new C8476m(200);
        C8476m c8476m3 = new C8476m(300);
        C8476m c8476m4 = new C8476m(400);
        f45646b = c8476m4;
        C8476m c8476m5 = new C8476m(500);
        f45647c = c8476m5;
        C8476m c8476m6 = new C8476m(600);
        f45648d = c8476m6;
        C8476m c8476m7 = new C8476m(700);
        C8476m c8476m8 = new C8476m(800);
        C8476m c8476m9 = new C8476m(900);
        f45649e = c8476m3;
        f45650f = c8476m4;
        f45651g = c8476m5;
        f45652h = c8476m6;
        f45653i = c8476m7;
        f45654j = C9000b.m17252r(c8476m, c8476m2, c8476m3, c8476m4, c8476m5, c8476m6, c8476m7, c8476m8, c8476m9);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C8476m(int i10) {
        this.f45655a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(C0166e.m761g("Font weight can be in range [1, 1000]. Current value: ", i10).toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C8476m c8476m) {
        C5207g.m11111f(c8476m, "other");
        return C5207g.m11113h(this.f45655a, c8476m.f45655a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8476m) {
            return this.f45655a == ((C8476m) obj).f45655a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45655a;
    }

    public final String toString() {
        return C0204c.m853l(new StringBuilder("FontWeight(weight="), this.f45655a, ')');
    }
}
