package androidx.glance.appwidget.proto;

import p000.C3386nv;
import p000.b94;
import p000.e94;
import p000.h94;
import p000.my5;
import p000.pr4;

/* JADX INFO: loaded from: classes2.dex */
public enum LayoutProto$NodeIdentity implements b94 {
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_NODE_VALUE = 1;
    public static final int DEFAULT_IDENTITY_VALUE = 0;
    private static final e94 internalValueMap = new my5(9);
    private final int value;

    LayoutProto$NodeIdentity(int i) {
        this.value = i;
    }

    public static LayoutProto$NodeIdentity forNumber(int i) {
        if (i == 0) {
            return DEFAULT_IDENTITY;
        }
        if (i != 1) {
            return null;
        }
        return BACKGROUND_NODE;
    }

    public static e94 internalGetValueMap() {
        return internalValueMap;
    }

    public static h94 internalGetVerifier() {
        return pr4.f56723f;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static LayoutProto$NodeIdentity valueOf(int i) {
        return forNumber(i);
    }
}
