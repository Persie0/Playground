package p000;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gxj implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f26721a;

    public gxj(int i) {
        this.f26721a = i;
    }

    /* JADX INFO: renamed from: a */
    public static gxh m9928a() {
        return new gxh();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f26721a) {
            case 0:
                return m9928a();
            case 1:
                return new bkn((byte[]) null, (short[]) null);
            case 2:
                return new gxz();
            case 3:
                return new jwf(false);
            case 4:
                return new jwf(false);
            case 5:
                return new jwf("");
            case 6:
                return new jwf(false);
            case 7:
                return new jwf(gzn.PHONE);
            case 8:
                return new jwf(false);
            case 9:
                return new djm();
            case 10:
                return new gzc(new jwf(Integer.valueOf(gzp.f26957e.f26960g)));
            case 11:
                return new fvd(new jwf(1));
            case 12:
                return new gop();
            case 13:
                return mqu.f41450a;
            case 14:
                return new lih(null);
            case 15:
                return nqf.m17621g();
            case 16:
                return nqf.m17621g();
            case 17:
                return new htb(null);
            case 18:
                ExecutorService executorServiceM13824l = jzn.m13824l("smz-analysis");
                executorServiceM13824l.getClass();
                return executorServiceM13824l;
            case 19:
                ExecutorService executorServiceM13824l2 = jzn.m13824l("smz-img");
                executorServiceM13824l2.getClass();
                return executorServiceM13824l2;
            default:
                return new jiy();
        }
    }
}
