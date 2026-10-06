package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mrw extends mqv {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mrx f41488f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrw(mrx mrxVar, msa msaVar, CharSequence charSequence) {
        super(msaVar, charSequence);
        this.f41488f = mrxVar;
    }

    @Override // p000.mqv
    /* JADX INFO: renamed from: a */
    public final int mo16814a(int i) {
        return i + ((String) this.f41488f.f41489a).length();
    }

    @Override // p000.mqv
    /* JADX INFO: renamed from: b */
    public final int mo16815b(int i) {
        int length = ((String) this.f41488f.f41489a).length();
        int length2 = this.f41452b.length() - length;
        while (i <= length2) {
            for (int i2 = 0; i2 < length; i2++) {
                if (this.f41452b.charAt(i2 + i) != ((String) this.f41488f.f41489a).charAt(i2)) {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }
}
