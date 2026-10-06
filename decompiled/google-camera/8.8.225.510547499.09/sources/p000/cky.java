package p000;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cky extends jxc {

    /* JADX INFO: renamed from: a */
    private final eax f6085a;

    public cky(jwn jwnVar, jwn jwnVar2, eby ebyVar, eax eaxVar) {
        super(jwr.m13632b(ebyVar.f13316b, ebyVar.f13317c, jwnVar, jwnVar2));
        this.f6085a = eaxVar;
    }

    @Override // p000.jxc
    /* JADX INFO: renamed from: d */
    protected final /* synthetic */ Object mo3833d(Object obj) {
        List list = (List) obj;
        boolean zBooleanValue = ((Boolean) list.get(0)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) list.get(1)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) list.get(2)).booleanValue();
        float fFloatValue = ((Float) list.get(3)).floatValue();
        Float fValueOf = Float.valueOf(-2.0f);
        if (!zBooleanValue2) {
            return fValueOf;
        }
        if (!zBooleanValue) {
            return zBooleanValue3 ? Float.valueOf(-1.0f) : fValueOf;
        }
        eax eaxVar = this.f6085a;
        float f = eaxVar.f13148b;
        float f2 = eaxVar.f13149c;
        return Float.valueOf(f2 < f ? aax.m70e((f - fFloatValue) / Math.abs(f2 - f), 1.0f) : 1.0f);
    }
}
