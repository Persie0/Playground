package p000;

import android.widget.ImageView;
import coil.decode.DataSource;
import coil.size.Scale;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3020g {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f39978a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int[] f39979b;

    static {
        int[] iArr = new int[DataSource.values().length];
        try {
            iArr[DataSource.MEMORY_CACHE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DataSource.MEMORY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DataSource.DISK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DataSource.NETWORK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ImageView.ScaleType.values().length];
        try {
            iArr2[ImageView.ScaleType.FIT_START.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ImageView.ScaleType.FIT_END.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        f39978a = iArr2;
        int[] iArr3 = new int[Scale.values().length];
        try {
            iArr3[Scale.FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[Scale.FIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        f39979b = iArr3;
    }
}
