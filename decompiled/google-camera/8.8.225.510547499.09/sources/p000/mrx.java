package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mrx implements mrz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f41489a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f41490b;

    public mrx(String str, int i) {
        this.f41490b = i;
        this.f41489a = str;
    }

    public mrx(mrc mrcVar, int i) {
        this.f41490b = i;
        this.f41489a = mrcVar;
    }

    @Override // p000.mrz
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Iterator mo16835a(msa msaVar, CharSequence charSequence) {
        switch (this.f41490b) {
            case 0:
                return new mrw(this, msaVar, charSequence);
            default:
                return new mrv(this, msaVar, charSequence, null);
        }
    }
}
