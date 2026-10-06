package p000;

import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class coo implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f8477a;

    /* JADX INFO: renamed from: b */
    private final oju f8478b;

    /* JADX INFO: renamed from: c */
    private final oju f8479c;

    /* JADX INFO: renamed from: d */
    private final oju f8480d;

    /* JADX INFO: renamed from: e */
    private final oju f8481e;

    /* JADX INFO: renamed from: f */
    private final oju f8482f;

    /* JADX INFO: renamed from: g */
    private final oju f8483g;

    /* JADX INFO: renamed from: h */
    private final oju f8484h;

    public coo(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, oju ojuVar7, oju ojuVar8) {
        this.f8477a = ojuVar;
        this.f8478b = ojuVar2;
        this.f8479c = ojuVar3;
        this.f8480d = ojuVar4;
        this.f8481e = ojuVar5;
        this.f8482f = ojuVar6;
        this.f8483g = ojuVar7;
        this.f8484h = ojuVar8;
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final con get() {
        return new con(((dws) this.f8477a).m6830a(), (Executor) this.f8478b.get(), (dhv) this.f8479c.get(), ((cmy) this.f8480d).get(), (jww) this.f8481e.get(), (jvd) this.f8482f.get(), ((erq) this.f8483g).get(), ((djn) this.f8484h).m6251a(), new BeholderExampleStoreDataTtlService());
    }
}
