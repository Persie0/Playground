package p000;

import com.google.protobuf.AbstractC1183d;
import com.google.protobuf.GeneratedMessageLite$MethodToInvoke;

/* JADX INFO: loaded from: classes2.dex */
public final class fk3 extends AbstractC1183d {
    public static final int CPU_CLOCK_RATE_KHZ_FIELD_NUMBER = 2;
    public static final int CPU_PROCESSOR_COUNT_FIELD_NUMBER = 6;
    private static final fk3 DEFAULT_INSTANCE;
    public static final int DEVICE_RAM_SIZE_KB_FIELD_NUMBER = 3;
    public static final int MAX_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 4;
    public static final int MAX_ENCOURAGED_APP_JAVA_HEAP_MEMORY_KB_FIELD_NUMBER = 5;
    private static volatile q47 PARSER = null;
    public static final int PROCESS_NAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private int cpuClockRateKhz_;
    private int cpuProcessorCount_;
    private int deviceRamSizeKb_;
    private int maxAppJavaHeapMemoryKb_;
    private int maxEncouragedAppJavaHeapMemoryKb_;
    private String processName_ = "";

    static {
        fk3 fk3Var = new fk3();
        DEFAULT_INSTANCE = fk3Var;
        AbstractC1183d.m6813q(fk3.class, fk3Var);
    }

    /* JADX INFO: renamed from: s */
    public static void m11920s(fk3 fk3Var, int i) {
        fk3Var.bitField0_ |= 16;
        fk3Var.maxAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static void m11921t(fk3 fk3Var, int i) {
        fk3Var.bitField0_ |= 32;
        fk3Var.maxEncouragedAppJavaHeapMemoryKb_ = i;
    }

    /* JADX INFO: renamed from: u */
    public static void m11922u(fk3 fk3Var, int i) {
        fk3Var.bitField0_ |= 8;
        fk3Var.deviceRamSizeKb_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static fk3 m11923v() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static ek3 m11924x() {
        return (ek3) DEFAULT_INSTANCE.m6814j();
    }

    @Override // com.google.protobuf.AbstractC1183d
    /* JADX INFO: renamed from: k */
    public final Object mo454k(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke) {
        q47 xk3Var;
        switch (dk3.f35742a[generatedMessageLite$MethodToInvoke.ordinal()]) {
            case 1:
                return new fk3();
            case 2:
                return new ek3(DEFAULT_INSTANCE);
            case 3:
                return new er7(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0004\u0005င\u0005\u0006င\u0002", new Object[]{"bitField0_", "processName_", "cpuClockRateKhz_", "deviceRamSizeKb_", "maxAppJavaHeapMemoryKb_", "maxEncouragedAppJavaHeapMemoryKb_", "cpuProcessorCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                q47 q47Var = PARSER;
                if (q47Var != null) {
                    return q47Var;
                }
                synchronized (fk3.class) {
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
    public final boolean m11925w() {
        return (this.bitField0_ & 16) != 0;
    }
}
