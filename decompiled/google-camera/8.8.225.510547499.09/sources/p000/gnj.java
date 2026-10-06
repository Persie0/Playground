package p000;

import com.google.googlex.gcam.BurstSpec;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gnj {

    /* JADX INFO: renamed from: n */
    public final kpp f25739n;

    /* JADX INFO: renamed from: o */
    public final BurstSpec f25740o;

    /* JADX INFO: renamed from: p */
    List f25741p;

    /* JADX INFO: renamed from: q */
    boolean f25742q;

    /* JADX INFO: renamed from: s */
    public final ebn f25744s;

    /* JADX INFO: renamed from: t */
    public final glk f25745t;

    /* JADX INFO: renamed from: k */
    final mwn f25736k = mws.m17090e();

    /* JADX INFO: renamed from: l */
    public final nqf f25737l = nqf.m17621g();

    /* JADX INFO: renamed from: m */
    final nqf f25738m = nqf.m17621g();

    /* JADX INFO: renamed from: r */
    public int f25743r = 0;

    public gnj(glk glkVar, ebn ebnVar, BurstSpec burstSpec, kpp kppVar, byte[] bArr, byte[] bArr2) {
        this.f25745t = glkVar;
        this.f25744s = ebnVar;
        this.f25740o = burstSpec;
        this.f25739n = kppVar;
    }

    /* JADX INFO: renamed from: b */
    public void mo7643b() {
        if (this.f25742q) {
            return;
        }
        this.f25742q = true;
        this.f25737l.cancel(true);
        m9554g();
    }

    /* JADX INFO: renamed from: c */
    public void mo7644c(key keyVar) {
        this.f25736k.m17082g(keyVar);
        this.f25743r++;
    }

    /* JADX INFO: renamed from: f */
    public final List m9553f() {
        List list = this.f25741p;
        if (list != null && this.f25743r == ((mzr) list).f41859c) {
            return list;
        }
        mws mwsVarM17081f = this.f25736k.m17081f();
        this.f25741p = mwsVarM17081f;
        return mwsVarM17081f;
    }

    /* JADX INFO: renamed from: g */
    public final void m9554g() {
        nba it = ((mws) m9553f()).iterator();
        while (it.hasNext()) {
            ((key) it.next()).close();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m9555h(int i) {
        this.f25737l.mo14894e(Integer.valueOf(i));
    }
}
