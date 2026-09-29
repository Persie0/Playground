package androidx.datastore.preferences;

import androidx.datastore.preferences.protobuf.C0872u0;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InterfaceC0850j0;
import androidx.datastore.preferences.protobuf.InterfaceC0864q0;
import com.android.installreferrer.api.InstallReferrerClient;
import p189j3.C6405a;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesProto$Value extends GeneratedMessageLite<PreferencesProto$Value, C0798a> implements InterfaceC0850j0 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    private static final PreferencesProto$Value DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC0864q0<PreferencesProto$Value> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int bitField0_;
    private int valueCase_ = 0;
    private Object value_;

    public enum ValueCase {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i10) {
            this.value = i10;
        }

        public static ValueCase forNumber(int i10) {
            switch (i10) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    return STRING_SET;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    return DOUBLE;
                default:
                    return null;
            }
        }

        @Deprecated
        public static ValueCase valueOf(int i10) {
            return forNumber(i10);
        }

        public int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.PreferencesProto$Value$a */
    public static final class C0798a extends GeneratedMessageLite.AbstractC0811a<PreferencesProto$Value, C0798a> implements InterfaceC0850j0 {
        public C0798a() {
            super(PreferencesProto$Value.DEFAULT_INSTANCE);
        }
    }

    static {
        PreferencesProto$Value preferencesProto$Value = new PreferencesProto$Value();
        DEFAULT_INSTANCE = preferencesProto$Value;
        GeneratedMessageLite.m3126o(PreferencesProto$Value.class, preferencesProto$Value);
    }

    /* JADX INFO: renamed from: G */
    public static C0798a m3022G() {
        PreferencesProto$Value preferencesProto$Value = DEFAULT_INSTANCE;
        preferencesProto$Value.getClass();
        return (C0798a) ((GeneratedMessageLite.AbstractC0811a) preferencesProto$Value.mo3038k(GeneratedMessageLite.MethodToInvoke.NEW_BUILDER));
    }

    /* JADX INFO: renamed from: p */
    public static void m3023p(PreferencesProto$Value preferencesProto$Value, long j10) {
        preferencesProto$Value.valueCase_ = 4;
        preferencesProto$Value.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: renamed from: q */
    public static void m3024q(PreferencesProto$Value preferencesProto$Value, String str) {
        preferencesProto$Value.getClass();
        str.getClass();
        preferencesProto$Value.valueCase_ = 5;
        preferencesProto$Value.value_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m3025r(PreferencesProto$Value preferencesProto$Value, C0800b.a aVar) {
        preferencesProto$Value.getClass();
        preferencesProto$Value.value_ = aVar.m3136i();
        preferencesProto$Value.valueCase_ = 6;
    }

    /* JADX INFO: renamed from: s */
    public static void m3026s(PreferencesProto$Value preferencesProto$Value, double d10) {
        preferencesProto$Value.valueCase_ = 7;
        preferencesProto$Value.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: renamed from: u */
    public static void m3028u(PreferencesProto$Value preferencesProto$Value, boolean z10) {
        preferencesProto$Value.valueCase_ = 1;
        preferencesProto$Value.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: v */
    public static void m3029v(PreferencesProto$Value preferencesProto$Value, float f3) {
        preferencesProto$Value.valueCase_ = 2;
        preferencesProto$Value.value_ = Float.valueOf(f3);
    }

    /* JADX INFO: renamed from: w */
    public static void m3030w(PreferencesProto$Value preferencesProto$Value, int i10) {
        preferencesProto$Value.valueCase_ = 3;
        preferencesProto$Value.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: renamed from: y */
    public static PreferencesProto$Value m3031y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final float m3032A() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: B */
    public final int m3033B() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public final long m3034C() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: D */
    public final String m3035D() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    /* JADX INFO: renamed from: E */
    public final C0800b m3036E() {
        return this.valueCase_ == 6 ? (C0800b) this.value_ : C0800b.m3046r();
    }

    /* JADX INFO: renamed from: F */
    public final ValueCase m3037F() {
        return ValueCase.forNumber(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.GeneratedMessageLite
    /* JADX INFO: renamed from: k */
    public final Object mo3038k(GeneratedMessageLite.MethodToInvoke methodToInvoke) {
        switch (C6405a.f36869a[methodToInvoke.ordinal()]) {
            case 1:
                return new PreferencesProto$Value();
            case 2:
                return new C0798a();
            case 3:
                return new C0872u0(DEFAULT_INSTANCE, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000", new Object[]{"value_", "valueCase_", "bitField0_", C0800b.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0864q0<PreferencesProto$Value> c0812b = PARSER;
                if (c0812b == null) {
                    synchronized (PreferencesProto$Value.class) {
                        c0812b = PARSER;
                        if (c0812b == null) {
                            c0812b = new GeneratedMessageLite.C0812b<>(DEFAULT_INSTANCE);
                            PARSER = c0812b;
                        }
                        break;
                    }
                }
                return c0812b;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return (byte) 1;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m3039x() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public final double m3040z() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }
}
