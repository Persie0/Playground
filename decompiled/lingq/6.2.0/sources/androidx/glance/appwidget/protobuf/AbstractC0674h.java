package androidx.glance.appwidget.protobuf;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.h */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC0674h {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f6076a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f6077b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f6077b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f6077b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f6077b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[FieldType.Collection.values().length];
        f6076a = iArr2;
        try {
            iArr2[FieldType.Collection.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f6076a[FieldType.Collection.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f6076a[FieldType.Collection.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
