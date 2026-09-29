package p000;

import com.google.firebase.perf.p010v1.ApplicationProcessState;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;

/* JADX INFO: renamed from: ot */
/* JADX INFO: loaded from: classes.dex */
public final class C3435ot extends AbstractC1183d {
    public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
    public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
    public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
    private static final C3435ot DEFAULT_INSTANCE;
    public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
    private static volatile q47 PARSER;
    private C3334mg androidAppInfo_;
    private int applicationProcessState_;
    private int bitField0_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f13927b;
    private String googleAppId_ = "";
    private String appInstanceId_ = "";

    static {
        C3435ot c3435ot = new C3435ot();
        DEFAULT_INSTANCE = c3435ot;
        AbstractC1183d.m6813q(C3435ot.class, c3435ot);
    }

    /* JADX INFO: renamed from: D */
    public static C3310lt m18464D() {
        return (C3310lt) DEFAULT_INSTANCE.m6814j();
    }

    /* JADX INFO: renamed from: s */
    public static void m18465s(C3435ot c3435ot, String str) {
        c3435ot.getClass();
        str.getClass();
        c3435ot.bitField0_ |= 1;
        c3435ot.googleAppId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m18466t(C3435ot c3435ot, ApplicationProcessState applicationProcessState) {
        c3435ot.getClass();
        c3435ot.applicationProcessState_ = applicationProcessState.getNumber();
        c3435ot.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: u */
    public static MapFieldLite m18467u(C3435ot c3435ot) {
        MapFieldLite<String, String> mapFieldLite = c3435ot.customAttributes_;
        if (!mapFieldLite.f13928a) {
            c3435ot.customAttributes_ = mapFieldLite.m6788c();
        }
        return c3435ot.customAttributes_;
    }

    /* JADX INFO: renamed from: v */
    public static void m18468v(C3435ot c3435ot, String str) {
        c3435ot.getClass();
        str.getClass();
        c3435ot.bitField0_ |= 2;
        c3435ot.appInstanceId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m18469w(C3435ot c3435ot, C3334mg c3334mg) {
        c3435ot.getClass();
        c3435ot.androidAppInfo_ = c3334mg;
        c3435ot.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: y */
    public static C3435ot m18470y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18471A() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m18472B() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18473C() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (AbstractC3273kt.f48395a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new C3435ot();
            case 2:
                return new C3310lt(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0005᠌\u0003\u00062", new Object[]{"bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", ApplicationProcessState.internalGetVerifier(), "customAttributes_", AbstractC3347mt.f51817a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (C3435ot.class) {
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

    /* JADX INFO: renamed from: x */
    public final C3334mg m18474x() {
        C3334mg c3334mg = this.androidAppInfo_;
        return c3334mg == null ? C3334mg.m16815v() : c3334mg;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m18475z() {
        return (this.bitField0_ & 4) != 0;
    }
}
