package p000;

import com.google.android.gms.internal.measurement.zzyv;

/* JADX INFO: loaded from: classes.dex */
public abstract class umd {

    /* JADX INFO: renamed from: f */
    public static final tmd f64097f;

    /* JADX INFO: renamed from: h */
    public static final tmd f64099h;

    /* JADX INFO: renamed from: a */
    public static final end f64092a = new end("cause", Throwable.class, false, false);

    /* JADX INFO: renamed from: b */
    public static final end f64093b = new end("ratelimit_count", Integer.class, false, false);

    /* JADX INFO: renamed from: c */
    public static final end f64094c = new end("sampling_count", Integer.class, false, false);

    /* JADX INFO: renamed from: d */
    public static final end f64095d = new end("ratelimit_period", omd.class, false, false);

    /* JADX INFO: renamed from: e */
    public static final end f64096e = new end("skipped", Integer.class, false, false);

    /* JADX INFO: renamed from: g */
    public static final end f64098g = new end("forced", Boolean.class, false, false);

    /* JADX INFO: renamed from: i */
    public static final end f64100i = new end("stack_size", zzyv.class, false, false);

    static {
        boolean z = true;
        f64097f = new tmd("group_by", Object.class, z, z, 0);
        f64099h = new tmd("tags", ngb.class, false, z, 1);
    }
}
