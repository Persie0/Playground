package p000;

import java.util.Random;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class lnw {

    /* JADX INFO: renamed from: a */
    static final lnx f38787a = new lnu(pas.f47269d, true);

    /* JADX INFO: renamed from: b */
    private final Random f38788b;

    /* JADX INFO: renamed from: c */
    private final ksi f38789c;

    /* JADX INFO: renamed from: d */
    private final lnm f38790d;

    public lnw(Random random, lnm lnmVar, ksi ksiVar) {
        this.f38788b = random;
        this.f38789c = ksiVar;
        this.f38790d = lnmVar;
    }

    /* JADX INFO: renamed from: a */
    public final lnx m15777a(pas pasVar) {
        int iM15629Y = lku.m15629Y(pasVar.f47273c);
        if (iM15629Y == 0) {
            iM15629Y = 1;
        }
        switch (iM15629Y - 1) {
            case 1:
                return new lnu(pasVar, pasVar.f47272b == 1000);
            case 3:
                return new lnu(pasVar, this.f38788b.nextDouble() * 1000.0d < ((double) pasVar.f47272b));
            case 4:
                return new lnv(pasVar, this.f38788b, this.f38790d, this.f38789c);
            case 5:
                pasVar = pas.f47269d;
                break;
        }
        return new lnu(pasVar, true);
    }
}
