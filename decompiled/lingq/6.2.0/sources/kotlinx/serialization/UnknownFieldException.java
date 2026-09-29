package kotlinx.serialization;

import p000.ux5;

/* JADX INFO: loaded from: classes3.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(ux5.m22988k(i, "An unknown field for index "));
    }
}
