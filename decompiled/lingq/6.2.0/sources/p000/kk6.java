package p000;

import com.google.firebase.perf.p010v1.NetworkRequestMetric$HttpMethod;
import com.google.firebase.perf.p010v1.NetworkRequestMetric$NetworkClientErrorReason;
import com.google.protobuf.AbstractC1180a;
import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;
import com.google.protobuf.MapFieldLite;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kk6 extends AbstractC1183d {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final kk6 DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile q47 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private MapFieldLite<String, String> customAttributes_ = MapFieldLite.f13927b;
    private String url_ = "";
    private String responseContentType_ = "";
    private m94 perfSessions_ = jo7.f45918d;

    static {
        kk6 kk6Var = new kk6();
        DEFAULT_INSTANCE = kk6Var;
        AbstractC1183d.m6813q(kk6.class, kk6Var);
    }

    /* JADX INFO: renamed from: A */
    public static void m15293A(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 1024;
        kk6Var.timeToResponseCompletedUs_ = j;
    }

    /* JADX INFO: renamed from: B */
    public static void m15294B(kk6 kk6Var, List list) {
        m94 m94Var = kk6Var.perfSessions_;
        if (!((AbstractC3319m1) m94Var).f50407a) {
            kk6Var.perfSessions_ = AbstractC1183d.m6812p(m94Var);
        }
        AbstractC1180a.m6789g(list, kk6Var.perfSessions_);
    }

    /* JADX INFO: renamed from: C */
    public static void m15295C(kk6 kk6Var, NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethod) {
        kk6Var.getClass();
        kk6Var.httpMethod_ = networkRequestMetric$HttpMethod.getNumber();
        kk6Var.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: D */
    public static void m15296D(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 4;
        kk6Var.requestPayloadBytes_ = j;
    }

    /* JADX INFO: renamed from: E */
    public static void m15297E(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 8;
        kk6Var.responsePayloadBytes_ = j;
    }

    /* JADX INFO: renamed from: G */
    public static kk6 m15298G() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: Y */
    public static ik6 m15299Y() {
        return (ik6) DEFAULT_INSTANCE.m6814j();
    }

    /* JADX INFO: renamed from: s */
    public static void m15300s(kk6 kk6Var, String str) {
        kk6Var.getClass();
        kk6Var.bitField0_ |= 1;
        kk6Var.url_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m15301t(kk6 kk6Var, NetworkRequestMetric$NetworkClientErrorReason networkRequestMetric$NetworkClientErrorReason) {
        kk6Var.getClass();
        kk6Var.networkClientErrorReason_ = networkRequestMetric$NetworkClientErrorReason.getNumber();
        kk6Var.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: u */
    public static void m15302u(kk6 kk6Var, int i) {
        kk6Var.bitField0_ |= 32;
        kk6Var.httpResponseCode_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m15303v(kk6 kk6Var, String str) {
        kk6Var.getClass();
        str.getClass();
        kk6Var.bitField0_ |= 64;
        kk6Var.responseContentType_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m15304w(kk6 kk6Var) {
        kk6Var.bitField0_ &= -65;
        kk6Var.responseContentType_ = DEFAULT_INSTANCE.responseContentType_;
    }

    /* JADX INFO: renamed from: x */
    public static void m15305x(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 128;
        kk6Var.clientStartTimeUs_ = j;
    }

    /* JADX INFO: renamed from: y */
    public static void m15306y(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 256;
        kk6Var.timeToRequestCompletedUs_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m15307z(kk6 kk6Var, long j) {
        kk6Var.bitField0_ |= 512;
        kk6Var.timeToResponseInitiatedUs_ = j;
    }

    /* JADX INFO: renamed from: F */
    public final long m15308F() {
        return this.clientStartTimeUs_;
    }

    /* JADX INFO: renamed from: H */
    public final NetworkRequestMetric$HttpMethod m15309H() {
        NetworkRequestMetric$HttpMethod networkRequestMetric$HttpMethodForNumber = NetworkRequestMetric$HttpMethod.forNumber(this.httpMethod_);
        return networkRequestMetric$HttpMethodForNumber == null ? NetworkRequestMetric$HttpMethod.HTTP_METHOD_UNKNOWN : networkRequestMetric$HttpMethodForNumber;
    }

    /* JADX INFO: renamed from: I */
    public final int m15310I() {
        return this.httpResponseCode_;
    }

    /* JADX INFO: renamed from: J */
    public final m94 m15311J() {
        return this.perfSessions_;
    }

    /* JADX INFO: renamed from: K */
    public final long m15312K() {
        return this.requestPayloadBytes_;
    }

    /* JADX INFO: renamed from: L */
    public final long m15313L() {
        return this.responsePayloadBytes_;
    }

    /* JADX INFO: renamed from: M */
    public final long m15314M() {
        return this.timeToRequestCompletedUs_;
    }

    /* JADX INFO: renamed from: N */
    public final long m15315N() {
        return this.timeToResponseCompletedUs_;
    }

    /* JADX INFO: renamed from: O */
    public final long m15316O() {
        return this.timeToResponseInitiatedUs_;
    }

    /* JADX INFO: renamed from: P */
    public final String m15317P() {
        return this.url_;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m15318Q() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m15319R() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m15320S() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m15321T() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m15322U() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m15323V() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m15324W() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m15325X() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (hk6.f42533a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new kk6();
            case 2:
                return new ik6(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", NetworkRequestMetric$HttpMethod.internalGetVerifier(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", NetworkRequestMetric$NetworkClientErrorReason.internalGetVerifier(), "customAttributes_", jk6.f45652a, "perfSessions_", c77.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (kk6.class) {
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
}
