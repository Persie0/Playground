package p000;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hqb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f42800a = new C0282a(-1918505647, false, new nd1(26));

    /* JADX INFO: renamed from: b */
    public static final C0282a f42801b = new C0282a(1979938929, false, new od1(23));

    /* JADX INFO: renamed from: c */
    public static final C0282a f42802c = new C0282a(1473780014, false, new od1(24));

    /* JADX INFO: renamed from: d */
    public static final C0282a f42803d = new C0282a(279047343, false, new nd1(27));

    /* JADX INFO: renamed from: e */
    public static final C0282a f42804e = new C0282a(2127203138, false, new od1(25));

    /* JADX INFO: renamed from: f */
    public static final C0282a f42805f = new C0282a(-490927957, false, new od1(13));

    /* JADX INFO: renamed from: g */
    public static final C0282a f42806g = new C0282a(-1433652703, false, new od1(14));

    /* JADX INFO: renamed from: h */
    public static final C0282a f42807h = new C0282a(741203338, false, new od1(15));

    /* JADX INFO: renamed from: i */
    public static final C0282a f42808i = new C0282a(-201521408, false, new od1(16));

    /* JADX INFO: renamed from: j */
    public static final C0282a f42809j = new C0282a(1973334633, false, new od1(17));

    /* JADX INFO: renamed from: k */
    public static final C0282a f42810k = new C0282a(-2018078761, false, new od1(18));

    /* JADX INFO: renamed from: l */
    public static final C0282a f42811l = new C0282a(-274623427, false, new od1(19));

    /* JADX INFO: renamed from: m */
    public static final C0282a f42812m = new C0282a(1930740187, false, new od1(20));

    /* JADX INFO: renamed from: n */
    public static final C0282a f42813n = new C0282a(-726095945, false, new od1(21));

    /* JADX INFO: renamed from: o */
    public static final C0282a f42814o = new C0282a(1207310783, false, new od1(22));

    /* JADX INFO: renamed from: a */
    public static long m13435a(MotionEvent motionEvent, int i) {
        float rawX = motionEvent.getRawX(i);
        return (((long) Float.floatToRawIntBits(motionEvent.getRawY(i))) & 4294967295L) | (Float.floatToRawIntBits(rawX) << 32);
    }
}
