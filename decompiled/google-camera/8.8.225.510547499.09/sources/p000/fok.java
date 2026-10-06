package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import p021j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fok implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f22945a;

    public fok(int i) {
        this.f22945a = i;
    }

    /* JADX INFO: renamed from: a */
    public static ftr m8624a() {
        return new ftr();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22945a) {
            case 0:
                return new gtd(ikw.MORE_MODES);
            case 1:
                Optional.empty();
                Optional.empty();
                Optional.empty();
                Optional.empty();
                return new fnm(Optional.ofNullable(ivx.f32440c), Optional.ofNullable(ivw.f32430p), Optional.ofNullable(ivw.f32417c), Optional.ofNullable(ivx.f32439b));
            case 2:
                Set setSynchronizedSet = Collections.synchronizedSet(new HashSet());
                setSynchronizedSet.getClass();
                return setSynchronizedSet;
            case 3:
                return new gtd(ikw.PHOTO_SPHERE);
            case 4:
                return new gtd(ikw.SLOW_MOTION);
            case 5:
                return new gtd(ikw.TIME_LAPSE);
            case 6:
                return new gtd(ikw.VIDEO);
            case 7:
                return new gtd(ikw.VIDEO_INTENT);
            case 8:
                return new gtd(ikw.AMBER);
            case 9:
                ExecutorService executorServiceM13821i = jzn.m13821i("mts-fast-hdr");
                executorServiceM13821i.getClass();
                return executorServiceM13821i;
            case 10:
                return ged.m9087a("ls-highres-encoder");
            case 11:
                ExecutorService executorServiceM13824l = jzn.m13824l("mts-analysis");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 12:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("mts-launcher");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
            case 13:
                return ged.m9087a("mv-main-loop");
            case 14:
                return ged.m9087a("mv-highres-encoder");
            case 15:
                return new fso();
            default:
                return m8624a();
        }
    }
}
