package com.google.crypto.tink.proto;

import p000.C3386nv;
import p000.c94;
import p000.f94;
import p000.g9c;
import p000.hr3;
import p000.z84;

/* JADX INFO: loaded from: classes.dex */
public enum KeyStatusType implements z84 {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);

    public static final int DESTROYED_VALUE = 3;
    public static final int DISABLED_VALUE = 2;
    public static final int ENABLED_VALUE = 1;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    private static final c94 internalValueMap = new g9c(12);
    private final int value;

    KeyStatusType(int i) {
        this.value = i;
    }

    public static KeyStatusType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_STATUS;
        }
        if (i == 1) {
            return ENABLED;
        }
        if (i == 2) {
            return DISABLED;
        }
        if (i != 3) {
            return null;
        }
        return DESTROYED;
    }

    public static c94 internalGetValueMap() {
        return internalValueMap;
    }

    public static f94 internalGetVerifier() {
        return hr3.f42826d;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static KeyStatusType valueOf(int i) {
        return forNumber(i);
    }
}
