package com.google.crypto.tink.proto;

import p000.C3386nv;
import p000.c94;
import p000.f94;
import p000.gr7;
import p000.hr3;
import p000.z84;

/* JADX INFO: loaded from: classes.dex */
public enum HashType implements z84 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    public static final int SHA1_VALUE = 1;
    public static final int SHA224_VALUE = 5;
    public static final int SHA256_VALUE = 3;
    public static final int SHA384_VALUE = 2;
    public static final int SHA512_VALUE = 4;
    public static final int UNKNOWN_HASH_VALUE = 0;
    private static final c94 internalValueMap = new gr7(11);
    private final int value;

    HashType(int i) {
        this.value = i;
    }

    public static HashType forNumber(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public static c94 internalGetValueMap() {
        return internalValueMap;
    }

    public static f94 internalGetVerifier() {
        return hr3.f42824b;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        C3386nv.m17626m("Can't get the number of an unknown enum value.");
        return 0;
    }

    @Deprecated
    public static HashType valueOf(int i) {
        return forNumber(i);
    }
}
