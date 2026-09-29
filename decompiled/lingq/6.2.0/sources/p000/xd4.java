package p000;

import com.kochava.core.job.job.internal.JobType;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class xd4 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f68098a;

    static {
        int[] iArr = new int[JobType.values().length];
        f68098a = iArr;
        try {
            iArr[JobType.Persistent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f68098a[JobType.OneShot.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
