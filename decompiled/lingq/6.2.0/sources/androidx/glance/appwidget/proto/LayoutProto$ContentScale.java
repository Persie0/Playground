package androidx.glance.appwidget.proto;

import p000.C3386nv;
import p000.b94;
import p000.e94;
import p000.h94;
import p000.pr4;
import p000.wkd;

/* JADX INFO: loaded from: classes2.dex */
public enum LayoutProto$ContentScale implements b94 {
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);

    public static final int CROP_VALUE = 2;
    public static final int FILL_BOUNDS_VALUE = 3;
    public static final int FIT_VALUE = 1;
    public static final int UNSPECIFIED_CONTENT_SCALE_VALUE = 0;
    private static final e94 internalValueMap = new wkd();
    private final int value;

    LayoutProto$ContentScale(int i) {
        this.value = i;
    }

    public static LayoutProto$ContentScale forNumber(int i) {
        if (i == 0) {
            return UNSPECIFIED_CONTENT_SCALE;
        }
        if (i == 1) {
            return FIT;
        }
        if (i == 2) {
            return CROP;
        }
        if (i != 3) {
            return null;
        }
        return FILL_BOUNDS;
    }

    public static e94 internalGetValueMap() {
        return internalValueMap;
    }

    public static h94 internalGetVerifier() {
        return pr4.f56719b;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LayoutProto$ContentScale valueOf(int i) {
        return forNumber(i);
    }
}
