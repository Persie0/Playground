package p021j$.util;

import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.U */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0517U {

    /* JADX INFO: renamed from: a */
    private static final Spliterator f33168a = new C0513P();

    /* JADX INFO: renamed from: b */
    private static final InterfaceC0728u f33169b = new C0511N();

    /* JADX INFO: renamed from: c */
    private static final InterfaceC0731x f33170c = new C0512O();

    /* JADX INFO: renamed from: d */
    private static final InterfaceC0569r f33171d = new C0510M();

    /* JADX INFO: renamed from: a */
    private static void m12511a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0569r m12512b() {
        return f33171d;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0728u m12513c() {
        return f33169b;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC0731x m12514d() {
        return f33170c;
    }

    /* JADX INFO: renamed from: e */
    public static Spliterator m12515e() {
        return f33168a;
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC0561j m12516f(InterfaceC0569r interfaceC0569r) {
        return new C0504G(interfaceC0569r);
    }

    /* JADX INFO: renamed from: g */
    public static InterfaceC0563l m12517g(InterfaceC0728u interfaceC0728u) {
        interfaceC0728u.getClass();
        return new C0502E(interfaceC0728u);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC0565n m12518h(InterfaceC0731x interfaceC0731x) {
        interfaceC0731x.getClass();
        return new C0503F(interfaceC0731x);
    }

    /* JADX INFO: renamed from: i */
    public static Iterator m12519i(Spliterator spliterator) {
        spliterator.getClass();
        return new C0501D(spliterator);
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceC0569r m12520j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m12511a(dArr.length, i, i2);
        return new C0509L(dArr, i, i2, 1040);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC0728u m12521k(int[] iArr, int i, int i2) {
        iArr.getClass();
        m12511a(iArr.length, i, i2);
        return new C0514Q(iArr, i, i2, 1040);
    }

    /* JADX INFO: renamed from: l */
    public static InterfaceC0731x m12522l(long[] jArr, int i, int i2) {
        jArr.getClass();
        m12511a(jArr.length, i, i2);
        return new C0516T(jArr, i, i2, 1040);
    }

    /* JADX INFO: renamed from: m */
    public static Spliterator m12523m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m12511a(objArr.length, i, i2);
        return new C0508K(objArr, i, i2, 1040);
    }

    /* JADX INFO: renamed from: n */
    public static Spliterator m12524n(Iterator it) {
        it.getClass();
        return new C0515S(it);
    }
}
