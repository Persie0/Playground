package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gmw extends jxc {
    public gmw(jwn jwnVar) {
        super(jwnVar);
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* bridge */ /* synthetic */ Object mo3833d(Object obj) {
        fxg fxgVar = (fxg) obj;
        boolean z = true;
        if (fxgVar != fxg.NORMAL_WITH_FLASH && fxgVar != fxg.HDR_PLUS_WITH_TORCH) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
