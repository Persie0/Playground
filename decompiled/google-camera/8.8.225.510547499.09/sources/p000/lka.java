package p000;

import android.app.Application;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lka implements msi {
    @Override // p000.msi
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6051a() {
        String str = lme.f38652a;
        if (str == null) {
            lme.f38652a = Application.getProcessName();
            str = lme.f38652a;
        }
        return mrm.m16828h(str);
    }
}
