package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

/* JADX INFO: renamed from: yu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C1159yu extends C1152yn {

    /* JADX INFO: renamed from: aK */
    public ArrayList f48284aK = new ArrayList();

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: T */
    public final void mo19685T(AmbientDelegate ambientDelegate) {
        super.mo19685T(ambientDelegate);
        int size = this.f48284aK.size();
        for (int i = 0; i < size; i++) {
            ((C1152yn) this.f48284aK.get(i)).mo19685T(ambientDelegate);
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo19711V() {
        ArrayList arrayList = this.f48284aK;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1152yn c1152yn = (C1152yn) this.f48284aK.get(i);
            if (c1152yn instanceof C1159yu) {
                ((C1159yu) c1152yn).mo19711V();
            }
        }
    }

    /* JADX INFO: renamed from: aa */
    public final void m19722aa(C1152yn c1152yn) {
        this.f48284aK.remove(c1152yn);
        c1152yn.mo19701v();
    }

    @Override // p000.C1152yn
    /* JADX INFO: renamed from: v */
    public void mo19701v() {
        this.f48284aK.clear();
        super.mo19701v();
    }
}
