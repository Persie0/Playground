package p000;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class grx extends grs {

    /* JADX INFO: renamed from: i */
    private final grv f26195i;

    /* JADX INFO: renamed from: j */
    private final kbz f26196j;

    public grx(grm grmVar, Executor executor, grk grkVar, gyh gyhVar, kbc kbcVar, mrm mrmVar, kbz kbzVar) {
        super(grmVar, executor, grkVar, 4, gyhVar, kbcVar, 5, kbzVar);
        this.f26196j = kbzVar;
        if (!mrmVar.mo16813g()) {
            this.f26195i = null;
            return;
        }
        grv grvVar = (grv) mrmVar.mo16809c();
        this.f26195i = grvVar;
        lku.m15669w(grvVar.f26188f == this.f26188f);
        lku.m15669w(grvVar.f26185c == this.f26185c);
    }

    @Override // p000.grs, java.lang.Runnable
    public final void run() {
        int i;
        gtd gtdVar;
        this.f26196j.mo13961e("PreviewChained");
        grm grmVar = this.f26188f;
        Rect rectI = m9688i(grmVar.f26152a, grmVar.f26156e);
        m9681f(grmVar);
        int iM9724a = gsz.m9724a(new kbc(rectI.width(), rectI.height()), this.f26176a);
        grt grtVarM9684b = m9684b(grmVar, iM9724a);
        try {
            m9689j(this.f26187e, grtVarM9684b, 2);
            grmVar.f26152a.mo7247c();
            grmVar.f26152a.mo7246b();
            m9686e(grtVarM9684b, m9685c(grmVar.f26152a, rectI, iM9724a), 2);
            grv grvVar = this.f26195i;
            if (grvVar != null) {
                grk grkVar = this.f26185c;
                HashSet hashSet = new HashSet(1);
                hashSet.add(grvVar);
                Iterator it = hashSet.iterator();
                while (true) {
                    i = 0;
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((grv) it.next()).f26188f == this.f26188f) {
                        z = true;
                    }
                    lku.m15613H(z);
                }
                grm grmVar2 = this.f26188f;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    if (((grv) it2.next()).f26188f != grmVar2) {
                        throw new RuntimeException("ERROR:  Spawned tasks cannot reference new images!");
                    }
                    i++;
                }
                grm grmVar3 = this.f26188f;
                if (i != 0) {
                    synchronized (((grc) grkVar).f26112e) {
                        gra graVar = (gra) ((grc) grkVar).f26112e.get(grmVar3.f26152a);
                        graVar.getClass();
                        if (((grc) grkVar).f26112e.get(grmVar3.f26152a) == null) {
                            throw new RuntimeException("Image Reference has already been released or has never been held.");
                        }
                        graVar.m9637a(i);
                        ((grc) grkVar).f26112e.put(grmVar3.f26152a, graVar);
                        ((grc) grkVar).f26115h += i;
                    }
                }
                synchronized (((grc) grkVar).f26113f) {
                    gtdVar = (gtd) ((grc) grkVar).f26113f.get(this);
                    gtdVar.getClass();
                    lku.m15614I(true, "Task NOT previously registered. ImageShadowTask booking-keeping is incorrect.");
                    ((grj) gtdVar.f26334a).f26140b.m9637a(hashSet.size());
                }
                ((grc) grkVar).m9665e(hashSet, gtdVar);
            }
            this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
            this.f26196j.mo13962f();
        } catch (Throwable th) {
            this.f26185c.mo9662b(grmVar.f26152a, this.f26186d);
            throw th;
        }
    }
}
