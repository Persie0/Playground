package p000;

import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fdg implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f21427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f21428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f21429c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f21430d;

    public /* synthetic */ fdg(gyu gyuVar, gyp gypVar, gyx gyxVar, int i) {
        this.f21430d = i;
        this.f21427a = gyuVar;
        this.f21429c = gypVar;
        this.f21428b = gyxVar;
    }

    public /* synthetic */ fdg(hfx hfxVar, ArrayList arrayList, hzv hzvVar, int i, byte[] bArr) {
        this.f21430d = i;
        this.f21429c = hfxVar;
        this.f21428b = arrayList;
        this.f21427a = hzvVar;
    }

    public /* synthetic */ fdg(jwn jwnVar, Predicate predicate, gev gevVar, int i) {
        this.f21430d = i;
        this.f21427a = jwnVar;
        this.f21428b = predicate;
        this.f21429c = gevVar;
    }

    public /* synthetic */ fdg(jwn jwnVar, Predicate predicate, jwn jwnVar2, int i) {
        this.f21430d = i;
        this.f21429c = jwnVar;
        this.f21428b = predicate;
        this.f21427a = jwnVar2;
    }

    public /* synthetic */ fdg(jww jwwVar, jww jwwVar2, jww jwwVar3, int i) {
        this.f21430d = i;
        this.f21429c = jwwVar;
        this.f21427a = jwwVar2;
        this.f21428b = jwwVar3;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f21430d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.function.Predicate] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, jww] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f21430d) {
            case 0:
                gfa gfaVar = (gfa) obj;
                gfaVar.mo9110I().m13537d(this.f21427a.mo3830a(new ctz((Predicate) this.f21428b, gfaVar, (gev) this.f21429c, 3), not.INSTANCE));
                break;
            case 1:
                ?? r0 = this.f21429c;
                ?? r1 = this.f21428b;
                ?? r2 = this.f21427a;
                gfa gfaVar2 = (gfa) obj;
                jvb jvbVarMo9110I = gfaVar2.mo9110I();
                jvbVarMo9110I.m13537d(r0.mo3830a(new cdb((Predicate) r1, gfaVar2, 18), not.INSTANCE));
                jvbVarMo9110I.m13537d(r2.mo3830a(new czq(gfaVar2, 10), not.INSTANCE));
                break;
            case 2:
                ?? r3 = this.f21429c;
                ?? r4 = this.f21427a;
                ?? r5 = this.f21428b;
                gfa gfaVar3 = (gfa) obj;
                nbh nbhVar = gfy.f24631a;
                jvb jvbVarMo9110I2 = gfaVar3.mo9110I();
                jvbVarMo9110I2.m13537d(r3.mo3830a(new gcu(gfaVar3, 12), not.INSTANCE));
                jvbVarMo9110I2.m13537d(r4.mo3830a(new gcu(gfaVar3, 15), not.INSTANCE));
                jvbVarMo9110I2.m13537d(r5.mo3830a(new gcu(gfaVar3, 16), not.INSTANCE));
                break;
            case 3:
                Object obj2 = this.f21427a;
                Object obj3 = this.f21429c;
                Object obj4 = this.f21428b;
                obj3.getClass();
                gyu gyuVar = (gyu) obj2;
                ((gyi) obj).mo3964q(gyuVar, (gyp) obj3, (gyx) obj4);
                break;
            case 4:
                Object obj5 = this.f21429c;
                Object obj6 = this.f21428b;
                ResolveInfo resolveInfo = (ResolveInfo) obj;
                hzv hzvVar = (hzv) this.f21427a;
                hzvVar.m10970h(resolveInfo);
                hzvVar.m10971i(((hfx) obj5).m10223f(resolveInfo.activityInfo.packageName));
                ((ArrayList) obj6).add(hzvVar.m10968f());
                break;
            default:
                Object obj7 = this.f21429c;
                Object obj8 = this.f21428b;
                ResolveInfo resolveInfo2 = (ResolveInfo) obj;
                hzv hzvVar2 = (hzv) this.f21427a;
                hzvVar2.m10970h(resolveInfo2);
                hzvVar2.m10971i(((hfx) obj7).m10223f(resolveInfo2.activityInfo.packageName));
                ((ArrayList) obj8).add(hzvVar2.m10968f());
                break;
        }
    }
}
