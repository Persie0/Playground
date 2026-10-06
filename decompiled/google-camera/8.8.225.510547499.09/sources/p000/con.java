package p000;

import android.content.Context;
import com.google.android.apps.camera.brella.examplestore.beholder.BeholderExampleStoreDataTtlService;
import com.google.android.apps.camera.brella.mediastore.MediaListeningService;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class con extends cor implements ezy {

    /* JADX INFO: renamed from: a */
    public static final nbh f8470a = nbh.m17259h("com/google/android/apps/camera/brella/inapptrainer/BrellaInAppTrainerImpl");

    /* JADX INFO: renamed from: b */
    public final Integer f8471b;

    /* JADX INFO: renamed from: c */
    public final BeholderExampleStoreDataTtlService f8472c;

    /* JADX INFO: renamed from: d */
    public boolean f8473d;

    /* JADX INFO: renamed from: e */
    public int f8474e;

    /* JADX INFO: renamed from: j */
    private final dhv f8475j;

    /* JADX INFO: renamed from: k */
    private final jqh f8476k;

    public con(Context context, Executor executor, dhv dhvVar, jqh jqhVar, jww jwwVar, jvd jvdVar, fan fanVar, String str, BeholderExampleStoreDataTtlService beholderExampleStoreDataTtlService) {
        super(context, executor, jvdVar, fanVar, str);
        this.f8475j = dhvVar;
        this.f8476k = jqhVar;
        this.f8471b = (Integer) jwwVar.mo3831be();
        this.f8474e = 80;
        this.f8472c = beholderExampleStoreDataTtlService;
    }

    /* JADX INFO: renamed from: a */
    public final void m5208a(String str, int i) {
        Context context = this.f8493f;
        Executor executor = this.f8494g;
        jld jldVarM13339a = jle.m13339a();
        jldVarM13339a.m13338d(str);
        jldVarM13339a.m13337c(i);
        jldVarM13339a.m13336b(str);
        jpp jppVarMo13448a = jmr.m13372c(context, executor, jldVarM13339a.m13335a()).mo13448a(this.f8494g, jnm.f34403b);
        jppVarMo13448a.mo13459l(new jpl() { // from class: col
            @Override // p000.jpl
            /* JADX INFO: renamed from: d */
            public final void mo4011d(Object obj) {
            }
        });
        jppVarMo13448a.mo13456i(new iml(str, 1));
    }

    @Override // p000.ezy
    /* JADX INFO: renamed from: b */
    public final void mo5209b() {
        if (!MediaListeningService.m4069a(this.f8493f)) {
            ((nbe) ((nbe) f8470a.m17251b()).mo17276G((char) 365)).mo17290o("Fails to schedule media listener service.");
        }
        String str = this.f8495h;
        dhv dhvVar = this.f8475j;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        if (this.f8475j.mo6173a(dib.f11384z).isPresent()) {
            this.f8474e = ((Integer) this.f8475j.mo6173a(dib.f11384z).get()).intValue();
        }
        String strConcat = str.concat("/train");
        kxk.m14975U(lle.m15695o(this.f8476k.mo12963h()), new cwx(this, str.concat("/analytics"), strConcat, 1), not.INSTANCE);
    }
}
