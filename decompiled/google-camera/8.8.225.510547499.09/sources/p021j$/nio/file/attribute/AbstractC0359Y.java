package p021j$.nio.file.attribute;

/* JADX INFO: renamed from: j$.nio.file.attribute.Y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0359Y {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ long m12154c(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ long m12155d(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0343H mo12151a(String str);

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0356V mo12152b(String str);
}
