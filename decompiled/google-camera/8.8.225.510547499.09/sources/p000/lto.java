package p000;

import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lto implements nol {

    /* JADX INFO: renamed from: a */
    public List f39187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ltp f39188b;

    public lto(ltp ltpVar) {
        this.f39188b = ltpVar;
    }

    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() {
        moj mojVarM15580g = lkm.m15580g("Initialize ".concat(String.valueOf(this.f39188b.f39189a)));
        try {
            synchronized (this.f39188b.f39192d) {
                if (this.f39187a == null) {
                    ltp ltpVar = this.f39188b;
                    this.f39187a = ltpVar.f39193e;
                    ltpVar.f39193e = Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(this.f39187a.size());
            AmbientMode.AmbientController ambientController = new AmbientMode.AmbientController(this.f39188b);
            Iterator it = this.f39187a.iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(((nom) it.next()).mo3942a(ambientController));
                } catch (Exception e) {
                    arrayList.add(kxk.m14964J(e));
                }
            }
            nps npsVarM17605a = kxk.m14960F(arrayList).m17605a(new kij(this, 13), not.INSTANCE);
            mojVarM15580g.m16709a(npsVarM17605a);
            mojVarM15580g.close();
            return npsVarM17605a;
        } catch (Throwable th) {
            try {
                mojVarM15580g.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e2) {
                }
            }
            throw th;
        }
    }
}
