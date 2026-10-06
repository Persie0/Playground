package p000;

import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hnc implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Predicate f28387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f28388b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f28389c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jwn f28390d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f28391e;

    public /* synthetic */ hnc(jww jwwVar, jwn jwnVar, Predicate predicate, hmw hmwVar, int i) {
        this.f28391e = i;
        this.f28389c = jwwVar;
        this.f28390d = jwnVar;
        this.f28387a = predicate;
        this.f28388b = hmwVar;
    }

    public /* synthetic */ hnc(jww jwwVar, ohb ohbVar, Predicate predicate, jww jwwVar2, int i) {
        this.f28391e = i;
        this.f28388b = jwwVar;
        this.f28389c = ohbVar;
        this.f28387a = predicate;
        this.f28390d = jwwVar2;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f28391e) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ohb] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f28391e) {
            case 0:
                Object obj2 = this.f28388b;
                ?? r1 = this.f28389c;
                Predicate predicate = this.f28387a;
                jwn jwnVar = this.f28390d;
                gfa gfaVar = (gfa) obj;
                gfaVar.mo9110I().m13537d(jwr.m13632b(obj2, ((dxh) r1.get()).mo4156n()).mo3830a(new gmb(predicate, gfaVar, 10), not.INSTANCE));
                gfaVar.mo9110I().m13537d(jwnVar.mo3830a(new hmv(gfaVar, 2), not.INSTANCE));
                break;
            default:
                ?? r0 = this.f28389c;
                jwn jwnVar2 = this.f28390d;
                Predicate predicate2 = this.f28387a;
                Object obj3 = this.f28388b;
                gfa gfaVar2 = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                jvb jvbVarMo9110I = gfaVar2.mo9110I();
                jvbVarMo9110I.m13537d(r0.mo3830a(new gcu(gfaVar2, 13), not.INSTANCE));
                jvbVarMo9110I.m13537d(jwnVar2.mo3830a(new ecr(predicate2, gfaVar2, 15), not.INSTANCE));
                jvbVarMo9110I.m13537d(((hmw) obj3).m10476a().mo3830a(new ecr(predicate2, gfaVar2, 16), not.INSTANCE));
                break;
        }
    }
}
