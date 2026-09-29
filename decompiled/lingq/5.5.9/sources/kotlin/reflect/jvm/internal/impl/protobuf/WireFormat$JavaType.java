package kotlin.reflect.jvm.internal.impl.protobuf;

import p282nn.AbstractC7803a;

/* JADX INFO: loaded from: classes2.dex */
public enum WireFormat$JavaType {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(AbstractC7803a.f42882a),
    ENUM(null),
    MESSAGE(null);

    private final Object defaultDefault;

    WireFormat$JavaType(Object obj) {
        this.defaultDefault = obj;
    }
}
