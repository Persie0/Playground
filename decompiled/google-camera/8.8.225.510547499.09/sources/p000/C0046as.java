package p000;

import androidx.wear.ambient.AmbientDelegate;
import java.util.ArrayList;

/* JADX INFO: renamed from: as */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0046as extends C0014an {

    /* JADX INFO: renamed from: al */
    public final ArrayList f2221al = new ArrayList();

    /* JADX INFO: renamed from: D */
    public void mo1746D() {
        mo1003q();
        ArrayList arrayList = this.f2221al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0014an c0014an = (C0014an) this.f2221al.get(i);
            if (c0014an instanceof C0046as) {
                ((C0046as) c0014an).mo1746D();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1908F(C0014an c0014an) {
        this.f2221al.remove(c0014an);
        c0014an.f828r = null;
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: i */
    public void mo995i() {
        this.f2221al.clear();
        super.mo995i();
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: n */
    public final void mo1000n(int i, int i2) {
        super.mo1000n(i, i2);
        int size = this.f2221al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((C0014an) this.f2221al.get(i3)).mo1000n(this.f833w + this.f778A, this.f834x + this.f779B);
        }
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: q */
    public final void mo1003q() {
        super.mo1003q();
        ArrayList arrayList = this.f2221al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0014an c0014an = (C0014an) this.f2221al.get(i);
            c0014an.mo1000n(m988b(), m989c());
            if (!(c0014an instanceof C0042ao)) {
                c0014an.mo1003q();
            }
        }
    }

    @Override // p000.C0014an
    /* JADX INFO: renamed from: z */
    public final void mo1012z(AmbientDelegate ambientDelegate) {
        super.mo1012z(ambientDelegate);
        int size = this.f2221al.size();
        for (int i = 0; i < size; i++) {
            ((C0014an) this.f2221al.get(i)).mo1012z(ambientDelegate);
        }
    }
}
