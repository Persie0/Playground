package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class tr4 extends AbstractC0675i {
    private static final tr4 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile r47 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private vr4 layout_;

    static {
        tr4 tr4Var = new tr4();
        DEFAULT_INSTANCE = tr4Var;
        AbstractC0675i.m2381k(tr4.class, tr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m22271n(tr4 tr4Var, vr4 vr4Var) {
        tr4Var.getClass();
        vr4Var.getClass();
        tr4Var.layout_ = vr4Var;
        tr4Var.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m22272o(tr4 tr4Var, int i) {
        tr4Var.layoutIndex_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static sr4 m22273r() {
        return (sr4) DEFAULT_INSTANCE.m2382c();
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new tr4();
            case 2:
                return new sr4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (tr4.class) {
                    try {
                        yk3Var = PARSER;
                        if (yk3Var == null) {
                            yk3Var = new yk3();
                            PARSER = yk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return yk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public final vr4 m22274p() {
        vr4 vr4Var = this.layout_;
        return vr4Var == null ? vr4.m23529z() : vr4Var;
    }

    /* JADX INFO: renamed from: q */
    public final int m22275q() {
        return this.layoutIndex_;
    }
}
