package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum zzob {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzka.f14563b),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzob(Object obj) {
        this.zzk = obj;
    }
}
