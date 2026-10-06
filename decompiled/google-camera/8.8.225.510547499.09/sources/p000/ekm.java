package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ekm {

    /* JADX INFO: renamed from: a */
    public static final nbh f14466a = nbh.m17259h("com/google/android/apps/camera/imax/cyclops/audio/AudioRecorder");

    /* JADX INFO: renamed from: b */
    public final ekn f14467b;

    /* JADX INFO: renamed from: c */
    private final elf f14468c;

    public ekm(elf elfVar, ekn eknVar) {
        this.f14468c = elfVar;
        this.f14467b = eknVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m7415a() {
        this.f14468c.m7446a();
        ekn eknVar = this.f14467b;
        eknVar.f14470b = false;
        try {
            eknVar.join(1000L);
        } catch (InterruptedException e) {
            ((nbe) ((nbe) ((nbe) ekn.f14469a.m17251b()).mo17283h(e)).mo17276G((char) 1547)).mo17293r("%s", e.getMessage());
        }
    }
}
