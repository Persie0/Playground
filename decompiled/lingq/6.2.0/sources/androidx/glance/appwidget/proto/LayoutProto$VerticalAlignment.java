package androidx.glance.appwidget.proto;

import p000.C3386nv;
import p000.b94;
import p000.e94;
import p000.h94;
import p000.n58;
import p000.pr4;

/* JADX INFO: loaded from: classes2.dex */
public enum LayoutProto$VerticalAlignment implements b94 {
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);

    public static final int BOTTOM_VALUE = 3;
    public static final int CENTER_VERTICALLY_VALUE = 2;
    public static final int TOP_VALUE = 1;
    public static final int UNSPECIFIED_VERTICAL_ALIGNMENT_VALUE = 0;
    private static final e94 internalValueMap = new n58(9);
    private final int value;

    LayoutProto$VerticalAlignment(int i) {
        this.value = i;
    }

    public static LayoutProto$VerticalAlignment forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED_VERTICAL_ALIGNMENT;
        }
        if (i == 1) {
            return TOP;
        }
        if (i == 2) {
            return CENTER_VERTICALLY;
        }
        if (i != 3) {
            return null;
        }
        return BOTTOM;
    }

    public static e94 internalGetValueMap() {
        return internalValueMap;
    }

    public static h94 internalGetVerifier() {
        return pr4.f56724g;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LayoutProto$VerticalAlignment valueOf(int i) {
        return forNumber(i);
    }
}
