package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: renamed from: mg */
/* JADX INFO: loaded from: classes.dex */
public final class C3334mg extends AbstractC1183d {
    private static final C3334mg DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
    private static volatile q47 PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public static final int VERSION_NAME_FIELD_NUMBER = 3;
    private int bitField0_;
    private String packageName_ = "";
    private String sdkVersion_ = "";
    private String versionName_ = "";

    static {
        C3334mg c3334mg = new C3334mg();
        DEFAULT_INSTANCE = c3334mg;
        AbstractC1183d.m6813q(C3334mg.class, c3334mg);
    }

    /* JADX INFO: renamed from: s */
    public static void m16812s(C3334mg c3334mg, String str) {
        c3334mg.getClass();
        str.getClass();
        c3334mg.bitField0_ |= 1;
        c3334mg.packageName_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m16813t(C3334mg c3334mg) {
        c3334mg.getClass();
        c3334mg.bitField0_ |= 2;
        c3334mg.sdkVersion_ = "22.0.5";
    }

    /* JADX INFO: renamed from: u */
    public static void m16814u(C3334mg c3334mg, String str) {
        c3334mg.getClass();
        c3334mg.bitField0_ |= 4;
        c3334mg.versionName_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static C3334mg m16815v() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static C3183kg m16816y() {
        return (C3183kg) DEFAULT_INSTANCE.m6814j();
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (AbstractC3146jg.f45511a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3334mg();
            case 2:
                return new C3183kg(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "packageName_", "sdkVersion_", "versionName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (C3334mg.class) {
                    try {
                        xk3Var = PARSER;
                        if (xk3Var == null) {
                            xk3Var = new xk3();
                            PARSER = xk3Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return xk3Var;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m16817w() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m16818x() {
        return (this.bitField0_ & 2) != 0;
    }
}
