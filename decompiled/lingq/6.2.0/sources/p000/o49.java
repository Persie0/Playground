package p000;

import com.airbnb.lottie.model.content.ShapeStroke$LineCapType;
import com.airbnb.lottie.model.content.ShapeStroke$LineJoinType;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class o49 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f53842a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f53843b;

    static {
        int[] iArr = new int[ShapeStroke$LineJoinType.values().length];
        f53843b = iArr;
        try {
            iArr[ShapeStroke$LineJoinType.BEVEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f53843b[ShapeStroke$LineJoinType.MITER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f53843b[ShapeStroke$LineJoinType.ROUND.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[ShapeStroke$LineCapType.values().length];
        f53842a = iArr2;
        try {
            iArr2[ShapeStroke$LineCapType.BUTT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f53842a[ShapeStroke$LineCapType.ROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f53842a[ShapeStroke$LineCapType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
