package androidx.lifecycle;

import com.google.android.material.behavior.iWN.zuAgeeF;
import p000.akq;
import p000.aks;
import p000.akt;
import p000.akv;
import p000.alj;
import p000.aqm;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements akt {

    /* JADX INFO: renamed from: a */
    public boolean f1524a = false;

    /* JADX INFO: renamed from: b */
    public final alj f1525b;

    /* JADX INFO: renamed from: c */
    private final String f1526c;

    public SavedStateHandleController(String str, alj aljVar) {
        this.f1526c = str;
        this.f1525b = aljVar;
    }

    @Override // p000.akt
    /* JADX INFO: renamed from: a */
    public final void mo883a(akv akvVar, akq akqVar) {
        if (akqVar == akq.ON_DESTROY) {
            this.f1524a = false;
            akvVar.getLifecycle().m881c(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1463b(aqm aqmVar, aks aksVar) {
        if (this.f1524a) {
            throw new IllegalStateException(zuAgeeF.HOkVlqQBdSfkulk);
        }
        this.f1524a = true;
        aksVar.m879a(this);
        aqmVar.m1859b(this.f1526c, this.f1525b.f640f);
    }
}
