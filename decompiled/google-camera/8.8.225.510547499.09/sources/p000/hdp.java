package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hdp implements hco {

    /* JADX INFO: renamed from: a */
    public static final nbh f27365a = nbh.m17259h(DNTdN.euBPpAOwK);

    /* JADX INFO: renamed from: b */
    public static final hdo f27366b = new hdn();

    /* JADX INFO: renamed from: c */
    public final Executor f27367c;

    /* JADX INFO: renamed from: e */
    public int f27369e;

    /* JADX INFO: renamed from: g */
    public final htb f27371g;

    /* JADX INFO: renamed from: d */
    public final Object f27368d = new Object();

    /* JADX INFO: renamed from: h */
    private kmq f27372h = kmq.BACK;

    /* JADX INFO: renamed from: f */
    public hdo f27370f = f27366b;

    public hdp(htb htbVar, Executor executor, byte[] bArr) {
        this.f27371g = htbVar;
        this.f27367c = executor;
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: e */
    public final void mo10113e(kmd kmdVar) {
        this.f27372h = kmdVar.mo14558k();
        this.f27370f.mo6011g(kmdVar);
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: f */
    public final void mo10114f(kpp kppVar) {
        this.f27370f.mo6017m();
    }

    @Override // p000.hco
    /* JADX INFO: renamed from: g */
    public final void mo10115g(kiq kiqVar, kgg kggVar) {
        if (this.f27372h.equals(kmq.BACK)) {
            kfv.m14174w(kiqVar, new cts(this, kggVar, 6));
        }
    }
}
