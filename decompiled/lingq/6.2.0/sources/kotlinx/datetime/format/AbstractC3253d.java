package kotlinx.datetime.format;

import p000.bha;
import p000.cl3;
import p000.g32;
import p000.vn7;

/* JADX INFO: renamed from: kotlinx.datetime.format.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3253d {

    /* JADX INFO: renamed from: a */
    public static final bha f48218a = new bha(new vn7(TimeFields$hour$1.f48207i), 23, null, 56);

    /* JADX INFO: renamed from: b */
    public static final bha f48219b = new bha(new vn7(TimeFields$minute$1.f48209i), 59, null, 56);

    /* JADX INFO: renamed from: c */
    public static final bha f48220c = new bha(new vn7(TimeFields$second$1.f48210i), 59, null, 40);

    /* JADX INFO: renamed from: d */
    public static final cl3 f48221d = new cl3(new vn7(TimeFields$fractionOfSecond$1.f48206i, "nanosecond"), new g32(0, 9), 10);

    static {
        int i = TimeFields$amPm$1.f48205i;
        int i2 = TimeFields$hourOfAmPm$1.f48208i;
    }
}
