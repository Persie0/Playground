package p000;

import com.pairip.VMRunner;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gor implements goo {

    /* JADX INFO: renamed from: a */
    private final kfk f25893a;

    /* JADX INFO: renamed from: b */
    private final Map f25894b;

    /* JADX INFO: renamed from: c */
    private final mrm f25895c;

    public gor(kfk kfkVar, Map map, mrm mrmVar) {
        this.f25893a = kfkVar;
        this.f25894b = map;
        this.f25895c = mrmVar;
    }

    @Override // p000.goo
    /* JADX INFO: renamed from: a */
    public mxk mo9584a(gmc gmcVar) {
        return (mxk) VMRunner.invoke("x8V4tOxGEdwbLw5g", new Object[]{this, gmcVar});
    }

    @Override // p000.goo
    /* JADX INFO: renamed from: b */
    public final kho mo9585b(kho khoVar) {
        mxk<kgg> mxkVar = khoVar.f36067c;
        if (mxkVar.size() == 1) {
            return khoVar;
        }
        EnumMap enumMap = new EnumMap(gnf.class);
        kgg kggVar = (kgg) (this.f25895c.mo16813g() ? this.f25895c.mo16809c() : this.f25894b.get(gnf.f25701c));
        for (kgg kggVar2 : mxkVar) {
            if (gls.m9445g(kggVar2)) {
                kmg kmgVarMo14193c = kggVar2.mo14193c();
                kggVar.getClass();
                if (kmgVarMo14193c.equals(kggVar.mo14193c())) {
                    enumMap.put(gnf.RAW_HDRPLUS, kggVar2);
                } else if (!enumMap.containsKey(gnf.RAW_HDRPLUS)) {
                    enumMap.put(gnf.RAW_HDRPLUS, kggVar2);
                }
            } else if (gls.m9444f(kggVar2)) {
                enumMap.put(gnf.PD, kggVar2);
            } else {
                long jMo14191a = kggVar2.mo14191a();
                if (jMo14191a == 35 || jMo14191a == 39 || jMo14191a == 40) {
                    enumMap.put(gnf.YUV_ANALYSIS, kggVar2);
                }
            }
        }
        return this.f25893a.mo14135v(new HashSet(enumMap.values()), khoVar.f36068d);
    }
}
