package p000;

import android.media.MediaRecorder;
import java.text.NumberFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hyu implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f29981a;

    public hyu(int i) {
        this.f29981a = i;
    }

    /* JADX INFO: renamed from: a */
    public static inu m10886a() {
        return new inu();
    }

    /* JADX INFO: renamed from: b */
    public static final jzw m10887b() {
        return new jzw(new MediaRecorder());
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        int i = this.f29981a;
        Float fValueOf = Float.valueOf(1.0f);
        switch (i) {
            case 0:
                return new jwf(new hyx[0]);
            case 1:
                return new hyo();
            case 2:
                return new AtomicReference();
            case 3:
                return nqf.m17621g();
            case 4:
                NumberFormat numberFormat = NumberFormat.getInstance();
                numberFormat.setMinimumFractionDigits(1);
                numberFormat.setMaximumFractionDigits(1);
                numberFormat.getClass();
                return numberFormat;
            case 5:
                return new inm();
            case 6:
                return m10886a();
            case 7:
                ExecutorService executorServiceM13824l = jzn.m13824l("VfeExecutor");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 8:
                return new ipt();
            case 9:
                return new ipv();
            case 10:
                return new iqz();
            case 11:
                return new ihk((byte[]) null, (byte[]) null);
            case 12:
                return new jwf((byte) 0);
            case 13:
                return new jwf(fValueOf);
            case 14:
                return new jwf(fValueOf);
            case 15:
                return new khb();
            case 16:
                return new jzn();
            case 17:
                return new jzn();
            case 18:
                throw null;
            case 19:
                return new kbd();
            default:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("Camera-Ex");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
        }
    }
}
