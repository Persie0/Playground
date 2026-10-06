package p000;

import java.util.ArrayList;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class drv implements Supplier {

    /* JADX INFO: renamed from: k */
    private final /* synthetic */ int f12457k;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ drv f12456j = new drv(9);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ drv f12455i = new drv(8);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ drv f12454h = new drv(7);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ drv f12453g = new drv(6);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ drv f12452f = new drv(5);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ drv f12451e = new drv(4);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ drv f12450d = new drv(3);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ drv f12449c = new drv(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ drv f12448b = new drv(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ drv f12447a = new drv(0);

    private /* synthetic */ drv(int i) {
        this.f12457k = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f12457k) {
            case 0:
                return new ArrayList();
            case 1:
                return new ArrayList();
            case 2:
                return mqu.f41450a;
            case 3:
                return new ArrayList();
            case 4:
                return new ArrayList();
            case 5:
                return new ArrayList();
            case 6:
                return new ArrayList();
            case 7:
                return mws.m17090e();
            case 8:
                return mxk.m17132D();
            default:
                return new lyz(null, null);
        }
    }
}
