package androidx.glance.appwidget.proto;

import p000.C3386nv;
import p000.b94;
import p000.e94;
import p000.h94;
import p000.pr4;
import p000.q41;

/* JADX INFO: loaded from: classes2.dex */
public enum LayoutProto$DimensionType implements b94 {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public static final int EXACT_VALUE = 1;
    public static final int EXPAND_VALUE = 4;
    public static final int FILL_VALUE = 3;
    public static final int UNKNOWN_DIMENSION_TYPE_VALUE = 0;
    public static final int WRAP_VALUE = 2;
    private static final e94 internalValueMap = new q41(9);
    private final int value;

    LayoutProto$DimensionType(int i) {
        this.value = i;
    }

    public static LayoutProto$DimensionType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_DIMENSION_TYPE;
        }
        if (i == 1) {
            return EXACT;
        }
        if (i == 2) {
            return WRAP;
        }
        if (i == 3) {
            return FILL;
        }
        if (i != 4) {
            return null;
        }
        return EXPAND;
    }

    public static e94 internalGetValueMap() {
        return internalValueMap;
    }

    public static h94 internalGetVerifier() {
        return pr4.f56720c;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LayoutProto$DimensionType valueOf(int i) {
        return forNumber(i);
    }
}
