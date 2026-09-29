package p000;

import coil.memory.MemoryCache$Key;
import com.google.android.gms.measurement.internal.C1045d;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class s18 extends ab9 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f60157j = 0;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f60158k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s18(shc shcVar) {
        super(20);
        this.f60158k = shcVar;
    }

    @Override // p000.ab9
    /* JADX INFO: renamed from: b */
    public Object mo236b(Object obj) throws Throwable {
        LinkedHashMap linkedHashMap;
        switch (this.f60157j) {
            case 1:
                String str = (String) obj;
                lda.m16127m(str);
                shc shcVar = (shc) this.f60158k;
                shcVar.m13144E();
                lda.m16127m(str);
                nnb nnbVar = shcVar.f55716b.f12360c;
                C1045d.m5885T(nnbVar);
                sq5 sq5VarM17525L0 = nnbVar.m17525L0(str);
                if (sq5VarM17525L0 == null) {
                    return null;
                }
                xcc xccVar = ((kjc) shcVar.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68076I.m17924b(str, "Populate EES config from database on cache miss. appId");
                shcVar.m21378L(str, shcVar.m21379M(str, (byte[]) sq5VarM17525L0.f61249c));
                s18 s18Var = shcVar.f60881k;
                synchronized (((p84) s18Var.f474g)) {
                    Set setEntrySet = ((bn5) s18Var.f473f).f8715a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = ((bn5) s18Var.f473f).f8715a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return (orb) linkedHashMap.get(str);
            default:
                return super.mo236b(obj);
        }
    }

    @Override // p000.ab9
    /* JADX INFO: renamed from: c */
    public void mo237c(Object obj, Object obj2, Object obj3) {
        switch (this.f60157j) {
            case 0:
                r18 r18Var = (r18) obj2;
                ((C3126ix) ((fs6) this.f60158k).f39590b).m14177m((MemoryCache$Key) obj, r18Var.f58493a, r18Var.f58494b, r18Var.f58495c);
                break;
            default:
                super.mo237c(obj, obj2, obj3);
                break;
        }
    }

    @Override // p000.ab9
    /* JADX INFO: renamed from: i */
    public int mo243i(Object obj, Object obj2) {
        switch (this.f60157j) {
            case 0:
                return ((r18) obj2).f58495c;
            default:
                return super.mo243i(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s18(int i, fs6 fs6Var) {
        super(i);
        this.f60158k = fs6Var;
    }
}
