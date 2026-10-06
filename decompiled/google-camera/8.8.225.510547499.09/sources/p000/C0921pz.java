package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: renamed from: pz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class C0921pz extends AbstractC0919px {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f47457a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractC0927qe f47458b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C0923qa f47459c;

    public C0921pz(C0923qa c0923qa, String str, AbstractC0927qe abstractC0927qe) {
        this.f47459c = c0923qa;
        this.f47457a = str;
        this.f47458b = abstractC0927qe;
    }

    @Override // p000.AbstractC0919px
    /* JADX INFO: renamed from: a */
    public final void mo2761a() {
        this.f47459c.m19335d(this.f47457a);
    }

    @Override // p000.AbstractC0919px
    /* JADX INFO: renamed from: b */
    public final void mo2762b(Object obj) throws Exception {
        Integer num = (Integer) this.f47459c.f47464c.get(this.f47457a);
        if (num != null) {
            this.f47459c.f47466e.add(this.f47457a);
            try {
                this.f47459c.m19337f(num.intValue(), this.f47458b, obj);
                return;
            } catch (Exception e) {
                this.f47459c.f47466e.remove(this.f47457a);
                throw e;
            }
        }
        throw new IllegalStateException(JrxsYuVZZqnFC.RzGo + this.f47458b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
    }
}
