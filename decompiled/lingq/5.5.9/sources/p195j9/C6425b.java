package p195j9;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: renamed from: j9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6425b {

    /* JADX INFO: renamed from: a */
    public static final int[] f36906a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b */
    public static final int[] f36907b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f36908c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d */
    public static final int[] f36909d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e */
    public static final int[] f36910e = {32, 40, 48, 56, 64, 80, 96, 112, BuildConfig.SDK_TRUNCATE_LENGTH, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f */
    public static final int[] f36911f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: renamed from: a */
    public static int m13047a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0) {
            if (i12 < 19) {
                int i13 = f36907b[i10];
                if (i13 == 44100) {
                    return ((i11 % 2) + f36911f[i12]) * 2;
                }
                int i14 = f36910e[i12];
                return i13 == 32000 ? i14 * 6 : i14 * 4;
            }
        }
        return -1;
    }
}
