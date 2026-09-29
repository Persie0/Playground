package p000;

/* JADX INFO: loaded from: classes.dex */
public interface b73 extends InterfaceC0025an {
    @Override // p000.InterfaceC0025an
    /* JADX INFO: renamed from: a */
    default voa mo589a(jda jdaVar) {
        return new ny8(this);
    }

    /* JADX INFO: renamed from: b */
    float mo3395b(long j, float f, float f2, float f3);

    /* JADX INFO: renamed from: c */
    long mo3396c(float f, float f2, float f3);

    /* JADX INFO: renamed from: d */
    default float mo3397d(float f, float f2, float f3) {
        return mo3395b(mo3396c(f, f2, f3), f, f2, f3);
    }

    /* JADX INFO: renamed from: e */
    float mo3398e(long j, float f, float f2, float f3);
}
