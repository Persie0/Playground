package p000;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class ga3 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final Rect f40451a = new Rect();

    /* JADX INFO: renamed from: b */
    public final Rect f40452b = new Rect();

    /* JADX INFO: renamed from: c */
    public final boolean f40453c;

    /* JADX INFO: renamed from: d */
    public final to2 f40454d;

    public ga3(boolean z, to2 to2Var) {
        this.f40453c = z;
        this.f40454d = to2Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f40454d.getClass();
        Rect rect = this.f40451a;
        ((C0797b4) obj).m3275f(rect);
        Rect rect2 = this.f40452b;
        ((C0797b4) obj2).m3275f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.f40453c;
        if (i3 < i4) {
            return z ? 1 : -1;
        }
        if (i3 > i4) {
            return z ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z ? 1 : -1;
        }
        if (i7 > i8) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
