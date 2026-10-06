package p000;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cmz implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f6329a;

    /* JADX INFO: renamed from: b */
    private final oju f6330b;

    /* JADX INFO: renamed from: c */
    private final oju f6331c;

    /* JADX INFO: renamed from: d */
    private final oju f6332d;

    public cmz(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        this.f6329a = ojuVar;
        this.f6330b = ojuVar2;
        this.f6331c = ojuVar3;
        this.f6332d = ojuVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.oju
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cnr get() {
        Context contextM6830a = ((dws) this.f6329a).m6830a();
        mws mwsVarM3920b = clm.m3920b();
        ksi ksiVar = (ksi) this.f6330b.get();
        ExecutorService executorServiceM3824a = ((cjj) this.f6331c).m3824a();
        dhv dhvVar = (dhv) this.f6332d.get();
        Random random = new Random();
        boolean zMo6184l = dhvVar.mo6184l(dib.f11295bB);
        mxi mxiVarM17132D = mxk.m17132D();
        mwt mwtVarM17115i = mwx.m17115i();
        mwn mwnVarM17090e = mws.m17090e();
        mwn mwnVarM17090e2 = mws.m17090e();
        mxiVarM17132D.mo17072d("CREATE TABLE media_record(media_id INTEGER PRIMARY KEY, session_id INTEGER,source_id STRING NOT NULL,selection_key INTEGER NOT NULL,time INTEGER NOT NULL)");
        mwnVarM17090e2.m17082g("media_record");
        nba it = mwsVarM3920b.iterator();
        while (it.hasNext()) {
            cnq cnqVar = (cnq) it.next();
            mwnVarM17090e2.m17082g(cnqVar.f6366a);
            mwtVarM17115i.mo17110e(cnqVar.f6366a, cnqVar.f6368c);
            int i = 1;
            int i2 = 0;
            mxiVarM17132D.mo17072d(String.format("CREATE TABLE %s(media_id INTEGER PRIMARY KEY, time INTEGER NOT NULL,value BLOB NOT NULL)", cnqVar.f6366a));
            mws mwsVar = cnqVar.f6367b;
            int i3 = ((mzr) mwsVar).f41859c;
            while (i2 < i3) {
                cnp cnpVar = (cnp) mwsVar.get(i2);
                nba nbaVar = it;
                Object[] objArr = new Object[i];
                objArr[0] = cnqVar.f6366a;
                mxiVarM17132D.mo17072d(String.format("ALTER TABLE %s ADD ", objArr) + cnpVar.f6364a + " " + cnpVar.f6365b);
                i2++;
                it = nbaVar;
                cnqVar = cnqVar;
                i = 1;
            }
        }
        mwnVarM17090e.m17083h(mwnVarM17090e2.m17081f());
        if (zMo6184l) {
            mwnVarM17090e.m17082g("session");
            mxiVarM17132D.mo17072d("CREATE TABLE session(session_id INTEGER PRIMARY KEY, time INTEGER NOT NULL,value BLOB)");
        }
        return new cnr(contextM6830a, ksiVar, random, executorServiceM3824a, mwnVarM17090e.m17081f(), mwnVarM17090e2.m17081f(), mxiVarM17132D.mo17127f(), mwtVarM17115i.mo17059b());
    }
}
