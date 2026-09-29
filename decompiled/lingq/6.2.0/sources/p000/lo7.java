package p000;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class lo7 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f49939a;

    static {
        int[] iArr = new int[Protobuf$IntEncoding.values().length];
        f49939a = iArr;
        try {
            iArr[Protobuf$IntEncoding.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f49939a[Protobuf$IntEncoding.SIGNED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f49939a[Protobuf$IntEncoding.FIXED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
