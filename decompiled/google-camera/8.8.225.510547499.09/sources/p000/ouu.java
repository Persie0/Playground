package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ouu implements our {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f46599a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f46600b;

    public ouu(Iterable iterable, int i) {
        this.f46600b = i;
        this.f46599a = iterable;
    }

    public ouu(Object obj, int i) {
        this.f46600b = i;
        this.f46599a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p000.our
    /* JADX INFO: renamed from: da */
    public final Object mo16104da(ous ousVar, ols olsVar) {
        out outVar;
        ous ousVar2;
        Iterator it;
        switch (this.f46600b) {
            case 0:
                Object objMo16103a = ousVar.mo16103a(this.f46599a, olsVar);
                return objMo16103a == oma.COROUTINE_SUSPENDED ? objMo16103a : oki.f46196a;
            default:
                if (olsVar instanceof out) {
                    outVar = (out) olsVar;
                    int i = outVar.f46595b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        outVar.f46595b = i - Integer.MIN_VALUE;
                    } else {
                        outVar = new out(this, olsVar, null);
                    }
                } else {
                    outVar = new out(this, olsVar, null);
                }
                Object obj = outVar.f46594a;
                oma omaVar = oma.COROUTINE_SUSPENDED;
                switch (outVar.f46595b) {
                    case 0:
                        lkm.m15592s(obj);
                        ousVar2 = ousVar;
                        it = this.f46599a.iterator();
                        break;
                    case 1:
                        it = outVar.f46597d;
                        ousVar2 = outVar.f46596c;
                        lkm.m15592s(obj);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    outVar.f46596c = ousVar2;
                    outVar.f46597d = it;
                    outVar.f46595b = 1;
                    if (ousVar2.mo16103a(next, outVar) == omaVar) {
                        return omaVar;
                    }
                }
                return oki.f46196a;
        }
    }
}
