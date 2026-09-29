package androidx.compose.foundation.layout;

import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p338qd.C8573r0;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0438a {

    /* JADX INFO: renamed from: a */
    public static final f f2429a = new f();

    /* JADX INFO: renamed from: b */
    public static final g f2430b = new g();

    /* JADX INFO: renamed from: c */
    public static final a f2431c = new a();

    /* JADX INFO: renamed from: d */
    public static final d f2432d;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$a */
    public static final class a implements b, h {

        /* JADX INFO: renamed from: a */
        public final float f2433a = 0;

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: a */
        public final float mo1522a() {
            return this.f2433a;
        }

        @Override // androidx.compose.foundation.layout.C0438a.h
        /* JADX INFO: renamed from: b */
        public final void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(iArr2, "outPositions");
            C0438a.m1516a(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: c */
        public final void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0438a.m1516a(i10, iArr, iArr2, false);
            } else {
                C0438a.m1516a(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        default float mo1522a() {
            return 0;
        }

        /* JADX INFO: renamed from: c */
        void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2);
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$c */
    public static final class c implements b, h {

        /* JADX INFO: renamed from: a */
        public final float f2434a = 0;

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: a */
        public final float mo1522a() {
            return this.f2434a;
        }

        @Override // androidx.compose.foundation.layout.C0438a.h
        /* JADX INFO: renamed from: b */
        public final void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(iArr2, "outPositions");
            C0438a.m1519d(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: c */
        public final void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0438a.m1519d(i10, iArr, iArr2, false);
            } else {
                C0438a.m1519d(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$d */
    public static final class d implements b, h {

        /* JADX INFO: renamed from: a */
        public final float f2435a = 0;

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: a */
        public final float mo1522a() {
            return this.f2435a;
        }

        @Override // androidx.compose.foundation.layout.C0438a.h
        /* JADX INFO: renamed from: b */
        public final void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(iArr2, "outPositions");
            C0438a.m1520e(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: c */
        public final void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0438a.m1520e(i10, iArr, iArr2, false);
            } else {
                C0438a.m1520e(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$e */
    public static final class e implements b, h {

        /* JADX INFO: renamed from: a */
        public final float f2436a = 0;

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: a */
        public final float mo1522a() {
            return this.f2436a;
        }

        @Override // androidx.compose.foundation.layout.C0438a.h
        /* JADX INFO: renamed from: b */
        public final void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(iArr2, "outPositions");
            C0438a.m1521f(i10, iArr, iArr2, false);
        }

        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: c */
        public final void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0438a.m1521f(i10, iArr, iArr2, false);
            } else {
                C0438a.m1521f(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$f */
    public static final class f implements b {
        @Override // androidx.compose.foundation.layout.C0438a.b
        /* JADX INFO: renamed from: c */
        public final void mo1524c(int i10, InterfaceC10015c interfaceC10015c, LayoutDirection layoutDirection, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(layoutDirection, "layoutDirection");
            C5207g.m11111f(iArr2, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                C0438a.m1517b(iArr, iArr2, false);
            } else {
                C0438a.m1518c(i10, iArr, iArr2, true);
            }
        }

        public final String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$g */
    public static final class g implements h {
        @Override // androidx.compose.foundation.layout.C0438a.h
        /* JADX INFO: renamed from: b */
        public final void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2) {
            C5207g.m11111f(interfaceC10015c, "<this>");
            C5207g.m11111f(iArr, "sizes");
            C5207g.m11111f(iArr2, "outPositions");
            C0438a.m1517b(iArr, iArr2, false);
        }

        public final String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.a$h */
    public interface h {
        /* JADX INFO: renamed from: b */
        void mo1523b(InterfaceC10015c interfaceC10015c, int i10, int[] iArr, int[] iArr2);
    }

    static {
        new e();
        f2432d = new d();
        new c();
    }

    /* JADX INFO: renamed from: a */
    public static void m1516a(int i10, int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f3 = (i10 - i12) / 2;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i14 = iArr[length];
                iArr2[length] = C8573r0.m16710Y0(f3);
                f3 += i14;
            }
        } else {
            int length2 = iArr.length;
            int i15 = 0;
            while (i11 < length2) {
                int i16 = iArr[i11];
                iArr2[i15] = C8573r0.m16710Y0(f3);
                f3 += i16;
                i11++;
                i15++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1517b(int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i10 = 0;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i11 = iArr[length];
                iArr2[length] = i10;
                i10 += i11;
            }
        } else {
            int length2 = iArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i10 < length2) {
                int i14 = iArr[i10];
                iArr2[i12] = i13;
                i13 += i14;
                i10++;
                i12++;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1518c(int i10, int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (z10) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i15 = iArr[length];
                iArr2[length] = i14;
                i14 += i15;
            }
            return;
        }
        int length2 = iArr.length;
        int i16 = 0;
        while (i11 < length2) {
            int i17 = iArr[i11];
            iArr2[i16] = i14;
            i14 += i17;
            i11++;
            i16++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1519d(int i10, int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (iArr.length == 0) ^ true ? (i10 - i12) / iArr.length : 0.0f;
        float f3 = length / 2;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = C8573r0.m16710Y0(f3);
                f3 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = C8573r0.m16710Y0(f3);
            f3 += i16 + length;
            i11++;
            i15++;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1520e(int i10, int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float f3 = 0.0f;
        float length = iArr.length > 1 ? (i10 - i12) / (iArr.length - 1) : 0.0f;
        if (z10) {
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = C8573r0.m16710Y0(f3);
                f3 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = C8573r0.m16710Y0(f3);
            f3 += i16 + length;
            i11++;
            i15++;
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1521f(int i10, int[] iArr, int[] iArr2, boolean z10) {
        C5207g.m11111f(iArr, "size");
        C5207g.m11111f(iArr2, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArr) {
            i12 += i13;
        }
        float length = (i10 - i12) / (iArr.length + 1);
        if (z10) {
            float f3 = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i14 = iArr[length2];
                iArr2[length2] = C8573r0.m16710Y0(f3);
                f3 += i14 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f10 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = iArr[i11];
            iArr2[i15] = C8573r0.m16710Y0(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }
}
