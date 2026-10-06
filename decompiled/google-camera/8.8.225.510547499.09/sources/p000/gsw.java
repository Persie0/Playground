package p000;

import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsw implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f26298a;

    public gsw(int i) {
        this.f26298a = i;
    }

    /* JADX INFO: renamed from: a */
    public static grq m9718a() {
        return new grq();
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f26298a) {
            case 0:
                return new gsz();
            case 1:
                return m9718a();
            case 2:
                return new gsz();
            case 3:
                return new gtf();
            case 4:
                return new gtf();
            case 5:
                return new gtd();
            case 6:
                return new gtf();
            case 7:
                return new gtf();
            case 8:
                return new exg();
            case 9:
                return new gtl();
            case 10:
                return new exg();
            case 11:
                return new guh();
            case 12:
                return new gtx();
            case 13:
                jww jwwVar = guc.f26427a;
                jwwVar.getClass();
                return jwwVar;
            case 14:
                jww jwwVar2 = guc.f26427a;
                jwwVar2.getClass();
                return jwwVar2;
            case 15:
                jww jwwVar3 = guc.f26428b;
                jwwVar3.getClass();
                return jwwVar3;
            case 16:
                return new guk();
            case 17:
                ExecutorService executorServiceM13821i = jzn.m13821i("mcfly-buffer");
                executorServiceM13821i.getClass();
                return executorServiceM13821i;
            case 18:
                return new guq();
            case 19:
                return new gus();
            default:
                return new jvi(jzn.m13824l("med-res-save"));
        }
    }
}
