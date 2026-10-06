package p000;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class egw implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f14014a;

    /* JADX INFO: renamed from: b */
    private final oju f14015b;

    /* JADX INFO: renamed from: c */
    private final oju f14016c;

    /* JADX INFO: renamed from: d */
    private final oju f14017d;

    /* JADX INFO: renamed from: e */
    private final oju f14018e;

    /* JADX INFO: renamed from: f */
    private final oju f14019f;

    public egw(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        this.f14014a = ojuVar;
        this.f14015b = ojuVar2;
        this.f14016c = ojuVar3;
        this.f14017d = ojuVar4;
        this.f14018e = ojuVar5;
        this.f14019f = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static egw m7313a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new egw(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6);
    }

    @Override // p000.oju
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final jwn get() {
        jwn jwnVarM13637g;
        boolean zBooleanValue = ((egx) this.f14014a).m7318b().booleanValue();
        oju ojuVar = this.f14015b;
        oju ojuVar2 = this.f14016c;
        oju ojuVar3 = this.f14017d;
        oju ojuVar4 = this.f14018e;
        oju ojuVar5 = this.f14019f;
        if (zBooleanValue) {
            final float fFloatValue = ((Float) ((dhv) ojuVar5.get()).mo6180h(dht.f11193u).orElse(Float.valueOf(2.45f))).floatValue();
            final float fFloatValue2 = ((Float) ((dhv) ojuVar5.get()).mo6180h(dht.f11194v).orElse(Float.valueOf(4.9f))).floatValue();
            ArrayList arrayList = new ArrayList();
            kmg kmgVar = (kmg) ((Map) ojuVar3.get()).get(gnf.f25701c);
            kmgVar.getClass();
            arrayList.add(kmgVar.f36540a);
            if (((Map) ojuVar3.get()).containsKey(gnf.RAW_WIDE_ZOOM)) {
                kmg kmgVar2 = (kmg) ((Map) ojuVar3.get()).get(gnf.RAW_WIDE_ZOOM);
                kmgVar2.getClass();
                arrayList.add(kmgVar2.f36540a);
            }
            jwnVarM13637g = jwj.m13624c(jwr.m13634d((jwn) ojuVar.get(), jwr.m13640j((jwn) ojuVar2.get(), new mrf() { // from class: egv
                @Override // p000.mrf
                public final Object apply(Object obj) {
                    float f = fFloatValue;
                    float f2 = fFloatValue2;
                    Float f3 = (Float) obj;
                    boolean z = false;
                    if (f3.floatValue() >= f && f3.floatValue() <= f2) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            }), jwr.m13640j((jwn) ojuVar4.get(), new ceg(arrayList, 15))));
        } else {
            jwnVarM13637g = jwr.m13637g(false);
        }
        jwnVarM13637g.getClass();
        return jwnVarM13637g;
    }
}
