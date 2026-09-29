package p000;

import com.google.crypto.tink.shaded.protobuf.AbstractC1134i;
import com.google.crypto.tink.shaded.protobuf.C1129d;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xj4 extends AbstractC1134i {
    private static final xj4 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile p47 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private l94 key_ = io7.f44360d;
    private int primaryKeyId_;

    static {
        xj4 xj4Var = new xj4();
        DEFAULT_INSTANCE = xj4Var;
        AbstractC1134i.m6544s(xj4.class, xj4Var);
    }

    /* JADX INFO: renamed from: B */
    public static uj4 m24562B() {
        return (uj4) DEFAULT_INSTANCE.m6545g();
    }

    /* JADX INFO: renamed from: C */
    public static xj4 m24563C(ByteArrayInputStream byteArrayInputStream, ox2 ox2Var) throws InvalidProtocolBufferException {
        AbstractC1134i abstractC1134iM6543r = AbstractC1134i.m6543r(DEFAULT_INSTANCE, new C1129d(byteArrayInputStream), ox2Var);
        AbstractC1134i.m6538f(abstractC1134iM6543r);
        return (xj4) abstractC1134iM6543r;
    }

    /* JADX INFO: renamed from: D */
    public static xj4 m24564D(byte[] bArr, ox2 ox2Var) {
        xj4 xj4Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        AbstractC1134i abstractC1134iM6550p = xj4Var.m6550p();
        try {
            eo7 eo7Var = eo7.f37616c;
            eo7Var.getClass();
            wm8 wm8VarM11280a = eo7Var.m11280a(abstractC1134iM6550p.getClass());
            C3846zu c3846zu = new C3846zu();
            ox2Var.getClass();
            wm8VarM11280a.mo6591f(abstractC1134iM6550p, bArr, 0, length, c3846zu);
            wm8VarM11280a.makeImmutable(abstractC1134iM6550p);
            AbstractC1134i.m6538f(abstractC1134iM6550p);
            return (xj4) abstractC1134iM6550p;
        } catch (InvalidProtocolBufferException e) {
            if (e.f13562a) {
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
            throw InvalidProtocolBufferException.m6421g();
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m24565v(xj4 xj4Var, int i) {
        xj4Var.primaryKeyId_ = i;
    }

    /* JADX INFO: renamed from: w */
    public static void m24566w(xj4 xj4Var, wj4 wj4Var) {
        xj4Var.getClass();
        l94 l94Var = xj4Var.key_;
        if (!((AbstractC3282l1) l94Var).f48878a) {
            int size = l94Var.size();
            xj4Var.key_ = l94Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        xj4Var.key_.add(wj4Var);
    }

    /* JADX INFO: renamed from: A */
    public final int m24567A() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC1134i
    /* JADX INFO: renamed from: h */
    public final Object mo441h(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        p47 wk3Var;
        switch (tj4.f62413a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new xj4();
            case 2:
                return new uj4(DEFAULT_INSTANCE);
            case 3:
                return new dr7(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", wj4.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                p47 p47Var = PARSER;
                if (p47Var != null) {
                    return p47Var;
                }
                synchronized (xj4.class) {
                    try {
                        wk3Var = PARSER;
                        if (wk3Var == null) {
                            wk3Var = new wk3();
                            PARSER = wk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: x */
    public final wj4 m24568x(int i) {
        return (wj4) this.key_.get(i);
    }

    /* JADX INFO: renamed from: y */
    public final int m24569y() {
        return this.key_.size();
    }

    /* JADX INFO: renamed from: z */
    public final List m24570z() {
        return this.key_;
    }
}
