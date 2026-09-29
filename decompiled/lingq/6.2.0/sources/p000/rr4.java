package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.C0668b;
import androidx.glance.appwidget.protobuf.C0669c;
import androidx.glance.appwidget.protobuf.C0670d;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class rr4 extends AbstractC0675i {
    private static final rr4 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile r47 PARSER;
    private n94 layout_ = ko7.f47602d;
    private int nextIndex_;

    static {
        rr4 rr4Var = new rr4();
        DEFAULT_INSTANCE = rr4Var;
        AbstractC0675i.m2381k(rr4.class, rr4Var);
    }

    /* JADX INFO: renamed from: n */
    public static void m20760n(rr4 rr4Var, tr4 tr4Var) {
        rr4Var.getClass();
        n94 n94Var = rr4Var.layout_;
        if (!((AbstractC3356n1) n94Var).f52152a) {
            int size = n94Var.size();
            rr4Var.layout_ = n94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        rr4Var.layout_.add(tr4Var);
    }

    /* JADX INFO: renamed from: o */
    public static void m20761o(rr4 rr4Var) {
        rr4Var.getClass();
        rr4Var.layout_ = ko7.f47602d;
    }

    /* JADX INFO: renamed from: p */
    public static void m20762p(rr4 rr4Var, int i) {
        rr4Var.nextIndex_ = i;
    }

    /* JADX INFO: renamed from: q */
    public static rr4 m20763q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static rr4 m20764t(InputStream inputStream) throws InvalidProtocolBufferException {
        n41 c0669c;
        rr4 rr4Var = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = q94.f57450b;
            int length = bArr.length;
            c0669c = new C0668b(bArr, 0, length, false);
            try {
                c0669c.mo2292k(length);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c0669c = new C0669c(inputStream);
        }
        qx2 qx2VarM20191a = qx2.m20191a();
        AbstractC0675i abstractC0675iM2386j = rr4Var.m2386j();
        try {
            ho7 ho7Var = ho7.f42713c;
            ho7Var.getClass();
            ym8 ym8VarM13412a = ho7Var.m13412a(abstractC0675iM2386j.getClass());
            C0670d c0670d = (C0670d) c0669c.f52311b;
            if (c0670d == null) {
                c0670d = new C0670d(c0669c);
            }
            ym8VarM13412a.mo2417c(abstractC0675iM2386j, c0670d, qx2VarM20191a);
            ym8VarM13412a.makeImmutable(abstractC0675iM2386j);
            if (AbstractC0675i.m2380g(abstractC0675iM2386j, true)) {
                return (rr4) abstractC0675iM2386j;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e2) {
            if (e2.f6044a) {
                throw new InvalidProtocolBufferException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (UninitializedMessageException e3) {
            throw new InvalidProtocolBufferException(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new rr4();
            case 2:
                return new qr4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", tr4.class, "nextIndex_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (rr4.class) {
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

    /* JADX INFO: renamed from: r */
    public final n94 m20765r() {
        return this.layout_;
    }

    /* JADX INFO: renamed from: s */
    public final int m20766s() {
        return this.nextIndex_;
    }
}
