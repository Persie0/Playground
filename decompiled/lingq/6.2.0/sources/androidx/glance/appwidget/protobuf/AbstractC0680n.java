package androidx.glance.appwidget.protobuf;

import p000.n41;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0680n {
    /* JADX INFO: renamed from: a */
    public abstract C0681o mo2466a(Object obj);

    /* JADX INFO: renamed from: b */
    public final boolean m2467b(int i, C0670d c0670d, Object obj) throws InvalidProtocolBufferException {
        int i2 = c0670d.f6063b;
        n41 n41Var = c0670d.f6062a;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            c0670d.m2343v(0);
            ((C0681o) obj).m2471d(i3 << 3, Long.valueOf(n41Var.mo2301t()));
            return true;
        }
        if (i4 == 1) {
            c0670d.m2343v(1);
            ((C0681o) obj).m2471d((i3 << 3) | 1, Long.valueOf(n41Var.mo2298q()));
            return true;
        }
        if (i4 == 2) {
            ((C0681o) obj).m2471d((i3 << 3) | 2, c0670d.m2326e());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw InvalidProtocolBufferException.m2269c();
            }
            c0670d.m2343v(5);
            ((C0681o) obj).m2471d(5 | (i3 << 3), Integer.valueOf(n41Var.mo2297p()));
            return true;
        }
        C0681o c0681oM2468c = C0681o.m2468c();
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (c0670d.m2322a() != Integer.MAX_VALUE && m2467b(i7, c0670d, c0681oM2468c)) {
        }
        if (i6 != c0670d.f6063b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (c0681oM2468c.f6105e) {
            c0681oM2468c.f6105e = false;
        }
        ((C0681o) obj).m2471d(i5 | 3, c0681oM2468c);
        return true;
    }
}
