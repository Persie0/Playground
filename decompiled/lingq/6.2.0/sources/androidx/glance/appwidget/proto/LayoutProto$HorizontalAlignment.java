package androidx.glance.appwidget.proto;

import p000.C3386nv;
import p000.b94;
import p000.e94;
import p000.h94;
import p000.j13;
import p000.pr4;

/* JADX INFO: loaded from: classes2.dex */
public enum LayoutProto$HorizontalAlignment implements b94 {
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);

    public static final int CENTER_HORIZONTALLY_VALUE = 2;
    public static final int END_VALUE = 3;
    public static final int START_VALUE = 1;
    public static final int UNSPECIFIED_HORIZONTAL_ALIGNMENT_VALUE = 0;
    private static final e94 internalValueMap = new j13();
    private final int value;

    LayoutProto$HorizontalAlignment(int i) {
        this.value = i;
    }

    public static LayoutProto$HorizontalAlignment forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED_HORIZONTAL_ALIGNMENT;
        }
        if (i == 1) {
            return START;
        }
        if (i == 2) {
            return CENTER_HORIZONTALLY;
        }
        if (i != 3) {
            return null;
        }
        return END;
    }

    public static e94 internalGetValueMap() {
        return internalValueMap;
    }

    public static h94 internalGetVerifier() {
        return pr4.f56721d;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LayoutProto$HorizontalAlignment valueOf(int i) {
        return forNumber(i);
    }
}
