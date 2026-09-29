package p000;

import androidx.glance.appwidget.protobuf.AbstractC0675i;
import androidx.glance.appwidget.protobuf.GeneratedMessageLite$MethodToInvoke;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class or4 extends AbstractC0675i {
    private static final or4 DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile r47 PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        or4 or4Var = new or4();
        DEFAULT_INSTANCE = or4Var;
        AbstractC0675i.m2381k(or4.class, or4Var);
    }

    /* JADX INFO: renamed from: E */
    public static br4 m18311E() {
        return (br4) DEFAULT_INSTANCE.m2382c();
    }

    /* JADX INFO: renamed from: F */
    public static or4 m18312F(byte[] bArr) throws InvalidProtocolBufferException {
        AbstractC0675i abstractC0675i = DEFAULT_INSTANCE;
        int length = bArr.length;
        qx2 qx2VarM20191a = qx2.m20191a();
        if (length != 0) {
            AbstractC0675i abstractC0675iM2386j = abstractC0675i.m2386j();
            try {
                ho7 ho7Var = ho7.f42713c;
                ho7Var.getClass();
                ym8 ym8VarM13412a = ho7Var.m13412a(abstractC0675iM2386j.getClass());
                C0787av c0787av = new C0787av();
                qx2VarM20191a.getClass();
                ym8VarM13412a.mo2419e(abstractC0675iM2386j, bArr, 0, length, c0787av);
                ym8VarM13412a.makeImmutable(abstractC0675iM2386j);
                abstractC0675i = abstractC0675iM2386j;
            } catch (InvalidProtocolBufferException e) {
                if (e.f6044a) {
                    throw new InvalidProtocolBufferException(e.getMessage(), e);
                }
                throw e;
            } catch (UninitializedMessageException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e3.getCause());
                }
                throw new InvalidProtocolBufferException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.m2273g();
            }
        }
        if (abstractC0675i == null || AbstractC0675i.m2380g(abstractC0675i, true)) {
            return (or4) abstractC0675i;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    /* JADX INFO: renamed from: n */
    public static void m18313n(or4 or4Var, nr4 nr4Var) {
        or4Var.getClass();
        or4Var.request_ = nr4Var;
        or4Var.requestCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m18314o(or4 or4Var, jr4 jr4Var) {
        or4Var.getClass();
        or4Var.request_ = jr4Var;
        or4Var.requestCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m18315p(or4 or4Var, dr4 dr4Var) {
        or4Var.getClass();
        or4Var.request_ = dr4Var;
        or4Var.requestCase_ = 3;
    }

    /* JADX INFO: renamed from: q */
    public static void m18316q(or4 or4Var, fr4 fr4Var) {
        or4Var.getClass();
        or4Var.request_ = fr4Var;
        or4Var.requestCase_ = 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m18317r(or4 or4Var, lr4 lr4Var) {
        or4Var.getClass();
        or4Var.request_ = lr4Var;
        or4Var.requestCase_ = 5;
    }

    /* JADX INFO: renamed from: s */
    public static void m18318s(or4 or4Var, hr4 hr4Var) {
        or4Var.getClass();
        or4Var.request_ = hr4Var;
        or4Var.requestCase_ = 6;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18319A() {
        return this.requestCase_ == 6;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m18320B() {
        return this.requestCase_ == 2;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18321C() {
        return this.requestCase_ == 5;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m18322D() {
        return this.requestCase_ == 1;
    }

    @Override // androidx.glance.appwidget.protobuf.AbstractC0675i
    /* JADX INFO: renamed from: d */
    public final Object mo2383d(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        r47 yk3Var;
        switch (ar4.f7386a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new or4();
            case 2:
                return new br4(DEFAULT_INSTANCE);
            case 3:
                return new fr7(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", nr4.class, jr4.class, dr4.class, fr4.class, lr4.class, hr4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                r47 r47Var = PARSER;
                if (r47Var != null) {
                    return r47Var;
                }
                synchronized (or4.class) {
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

    /* JADX INFO: renamed from: t */
    public final dr4 m18323t() {
        return this.requestCase_ == 3 ? (dr4) this.request_ : dr4.m10606q();
    }

    /* JADX INFO: renamed from: u */
    public final fr4 m18324u() {
        return this.requestCase_ == 4 ? (fr4) this.request_ : fr4.m12014s();
    }

    /* JADX INFO: renamed from: v */
    public final jr4 m18325v() {
        return this.requestCase_ == 2 ? (jr4) this.request_ : jr4.m14623s();
    }

    /* JADX INFO: renamed from: w */
    public final lr4 m18326w() {
        return this.requestCase_ == 5 ? (lr4) this.request_ : lr4.m16473t();
    }

    /* JADX INFO: renamed from: x */
    public final nr4 m18327x() {
        return this.requestCase_ == 1 ? (nr4) this.request_ : nr4.m17600q();
    }

    /* JADX INFO: renamed from: y */
    public final boolean m18328y() {
        return this.requestCase_ == 3;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m18329z() {
        return this.requestCase_ == 4;
    }
}
