package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.c */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1182c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f13935a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f13936b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f13936b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f13936b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f13936b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[FieldType.Collection.values().length];
        f13935a = iArr2;
        try {
            iArr2[FieldType.Collection.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f13935a[FieldType.Collection.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f13935a[FieldType.Collection.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
