package p000;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ned implements Comparator {

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f42090c;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ned f42089b = new ned(3);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ned f42088a = new ned(1);

    public ned(int i) {
        this.f42090c = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f42090c) {
            case 0:
                neh nehVarM17415a = neh.m17415a(obj);
                neh nehVarM17415a2 = neh.m17415a(obj2);
                if (nehVarM17415a != nehVarM17415a2) {
                    return nehVarM17415a.compareTo(nehVarM17415a2);
                }
                switch (nehVarM17415a.ordinal()) {
                    case 0:
                        return ((Boolean) obj).compareTo((Boolean) obj2);
                    case 1:
                        return ((String) obj).compareTo((String) obj2);
                    case 2:
                        return ((Long) obj).compareTo((Long) obj2);
                    case 3:
                        return ((Double) obj).compareTo((Double) obj2);
                    default:
                        throw null;
                }
            case 1:
                log logVar = (log) obj;
                log logVar2 = (log) obj2;
                logVar.mo15347b();
                int i = logVar.mo15347b().f46847a;
                logVar2.mo15347b();
                int i2 = logVar2.mo15347b().f46847a;
                if (i == i2) {
                    return 0;
                }
                return i <= i2 ? 1 : -1;
            case 2:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            case 3:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                return omn.m18711p(Integer.valueOf(((Constructor) obj2).getParameterTypes().length), Integer.valueOf(((Constructor) obj).getParameterTypes().length));
        }
    }
}
