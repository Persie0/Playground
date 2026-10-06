package p000;

import java.util.concurrent.ExecutorService;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dvb implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12625a;

    public dvb(int i) {
        this.f12625a = i;
    }

    /* JADX INFO: renamed from: a */
    public static dja m6761a() {
        dja djaVar = dja.RELEASE;
        djaVar.getClass();
        return djaVar;
    }

    /* JADX INFO: renamed from: b */
    public static final dzz m6762b() {
        return new dzz(0);
    }

    /* JADX INFO: renamed from: c */
    public static final dzz m6763c() {
        return new dzz(1);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        int i = 1;
        switch (this.f12625a) {
            case 0:
                return dtj.m6731b("feature.acmi.image.subject-motion");
            case 1:
                return dtj.m6731b("feature.acmi.image.face-quality");
            case 2:
                return m6761a();
            case 3:
                return jzn.m13828p("audio-frame-enc");
            case 4:
                ExecutorService executorServiceM13824l = jzn.m13824l("frame-store-resource-manager-exec");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 5:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("meta-store-exec");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
            case 6:
                return new dxr();
            case 7:
                return ivv.f32392a != null ? fxo.m8928b(ivv.f32392a, true) : fxo.m8931e();
            case 8:
                return new dyq();
            case 9:
                return new bko((byte[]) null, (short[]) null);
            case 10:
                return new ebr();
            case 11:
                return new dyy();
            case 12:
                return m6763c();
            case 13:
                return m6762b();
            case 14:
                return ebr.m7076b();
            case 15:
                ExecutorService executorServiceM13824l3 = jzn.m13824l("ois-exec");
                executorServiceM13824l3.getClass();
                return executorServiceM13824l3;
            case 16:
                return new jwf(Duration.ofMillis(-1L));
            case 17:
                return new ebr();
            case 18:
                return ecd.m7108b();
            case 19:
                enc.m7546b();
                return new nsz();
            default:
                return new gbv(i);
        }
    }
}
