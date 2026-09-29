package com.google.crypto.tink.proto;

import p000.C3386nv;
import p000.c94;
import p000.f94;
import p000.hr3;
import p000.u06;
import p000.z84;

/* JADX INFO: loaded from: classes.dex */
public enum KeyData$KeyMaterialType implements z84 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final int REMOTE_VALUE = 4;
    public static final int SYMMETRIC_VALUE = 1;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    private static final c94 internalValueMap = new u06(12);
    private final int value;

    KeyData$KeyMaterialType(int i) {
        this.value = i;
    }

    public static KeyData$KeyMaterialType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
    }

    public static c94 internalGetValueMap() {
        return internalValueMap;
    }

    public static f94 internalGetVerifier() {
        return hr3.f42825c;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static KeyData$KeyMaterialType valueOf(int i) {
        return forNumber(i);
    }
}
