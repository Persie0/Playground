package p000;

import com.google.android.apps.camera.p014ui.modeswitcher.ModeSwitcher;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class avj implements aiq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f2521a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2522b;

    public /* synthetic */ avj(avm avmVar, int i) {
        this.f2522b = i;
        this.f2521a = avmVar;
    }

    public /* synthetic */ avj(icm icmVar, int i) {
        this.f2522b = i;
        this.f2521a = icmVar;
    }

    @Override // p000.aiq
    /* JADX INFO: renamed from: a */
    public final void mo776a(float f) {
        aiv aivVar;
        aiv aivVar2;
        switch (this.f2522b) {
            case 0:
                Object obj = this.f2521a;
                if (Math.max(0.0f, f + 0.0f) <= 5.0f && (aivVar = ((avm) obj).f2539m) != null) {
                    aivVar.m788k();
                }
                ((avm) obj).m2058c(f);
                break;
            case 1:
                avm avmVar = (avm) this.f2521a;
                if (Math.max(0.0f, avmVar.f2528b - f) <= 5.0f && (aivVar2 = avmVar.f2538l) != null) {
                    aivVar2.m788k();
                }
                avmVar.m2058c(f);
                break;
            default:
                icm icmVar = (icm) this.f2521a;
                icmVar.f30361c.setScrollX((int) f);
                ikw ikwVarM4388b = icmVar.f30361c.m4388b();
                ModeSwitcher modeSwitcher = icmVar.f30361c;
                if (modeSwitcher.f7070k != ikwVarM4388b) {
                    modeSwitcher.f7070k = ikwVarM4388b;
                    npk.m17604h(modeSwitcher);
                    modeSwitcher.f7062c.m11066d(ikwVarM4388b);
                    icmVar.f30362d = 4;
                    break;
                }
                break;
        }
    }
}
