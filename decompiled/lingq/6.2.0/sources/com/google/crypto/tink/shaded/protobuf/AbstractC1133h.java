package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.h */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1133h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f13593a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f13594b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f13594b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13594b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13594b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[FieldType.Collection.values().length];
        f13593a = iArr2;
        try {
            iArr2[FieldType.Collection.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f13593a[FieldType.Collection.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f13593a[FieldType.Collection.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
