package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mrv extends mqv {

    /* JADX INFO: renamed from: f */
    final /* synthetic */ mrx f41487f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mrv(mrx mrxVar, msa msaVar, CharSequence charSequence, byte[] bArr) {
        super(msaVar, charSequence);
        this.f41487f = mrxVar;
    }

    @Override // p000.mqv
    /* JADX INFO: renamed from: a */
    public final int mo16814a(int i) {
        return i + 1;
    }

    @Override // p000.mqv
    /* JADX INFO: renamed from: b */
    public final int mo16815b(int i) {
        Object obj = this.f41487f.f41489a;
        CharSequence charSequence = this.f41452b;
        int length = charSequence.length();
        lku.m15621P(i, length);
        while (i < length) {
            if (((mrc) obj).mo16816b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
