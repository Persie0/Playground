package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dao extends jxd {
    public dao(jww jwwVar) {
        super(jwwVar);
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo3609b(Object obj) {
        return "torch".equals((String) obj) ? gfc.VIDEO_FLASH_ON : gfc.VIDEO_FLASH_OFF;
    }

    @Override // p000.jxd
    /* JADX INFO: renamed from: c */
    protected final /* bridge */ /* synthetic */ Object mo3610c(Object obj) {
        return true != gfc.VIDEO_FLASH_ON.equals((gfc) obj) ? "off" : "torch";
    }
}
