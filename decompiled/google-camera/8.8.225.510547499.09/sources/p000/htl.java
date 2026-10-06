package p000;

import p021j$.util.Collection$EL;
import p021j$.util.stream.Stream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class htl implements ikg {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f29531a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29532b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f29533c;

    public /* synthetic */ htl(ohb ohbVar, hto htoVar, int i) {
        this.f29533c = i;
        this.f29531a = ohbVar;
        this.f29532b = htoVar;
    }

    public /* synthetic */ htl(oju ojuVar, oju ojuVar2, int i) {
        this.f29533c = i;
        this.f29532b = ojuVar;
        this.f29531a = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v0, types: [chn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    @Override // p000.ikg
    /* JADX INFO: renamed from: a */
    public final void mo6340a() {
        switch (this.f29533c) {
            case 0:
                ?? r0 = this.f29531a;
                ((chv) r0.get()).mo3730c(this.f29532b);
                break;
            default:
                Object obj = this.f29532b;
                ?? r1 = this.f29531a;
                Stream stream = Collection$EL.stream(((ohm) obj).get());
                dbr dbrVar = (dbr) r1.get();
                dbrVar.getClass();
                stream.forEach(new dco(dbrVar, 0));
                break;
        }
    }
}
