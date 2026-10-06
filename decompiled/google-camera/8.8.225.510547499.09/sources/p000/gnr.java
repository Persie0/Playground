package p000;

import com.google.googlex.gcam.BurstSpec;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gnr extends gnj {

    /* JADX INFO: renamed from: a */
    final nqf f25775a;

    /* JADX INFO: renamed from: b */
    final nqf f25776b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ gns f25777c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnr(gns gnsVar, glk glkVar, ebn ebnVar, BurstSpec burstSpec, kpp kppVar, byte[] bArr, byte[] bArr2) {
        super(glkVar, ebnVar, burstSpec, kppVar, null, null);
        this.f25777c = gnsVar;
        this.f25775a = nqf.m17621g();
        this.f25776b = nqf.m17621g();
    }

    /* JADX INFO: renamed from: a */
    public final void m9564a(ecp ecpVar) {
        this.f25776b.mo14894e(ecpVar);
    }

    @Override // p000.gnj
    /* JADX INFO: renamed from: c */
    public final void mo7644c(key keyVar) {
        if (this.f25777c.f25780c.mo7269a(keyVar)) {
            super.mo7644c(keyVar);
            return;
        }
        ((nbe) ((nbe) gns.f25778a.m17252c()).mo17276G((char) 3063)).mo17293r("Frame %s rejected.", keyVar.mo7041b());
        keyVar.close();
    }
}
