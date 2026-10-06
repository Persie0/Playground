package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class gzw {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f26975c = 0;

    /* JADX INFO: renamed from: d */
    private static final Map f26976d = new HashMap();

    /* JADX INFO: renamed from: a */
    public final String f26977a;

    /* JADX INFO: renamed from: b */
    final gzv f26978b;

    public gzw(String str, gzv gzvVar) {
        this.f26977a = str;
        this.f26978b = gzvVar;
        m10024e();
    }

    /* JADX INFO: renamed from: a */
    public static gzw m10023a(String str) {
        return (gzw) f26976d.get(str);
    }

    /* JADX INFO: renamed from: e */
    private final synchronized void m10024e() {
        Map map = f26976d;
        if (map.containsKey(this.f26977a)) {
            throw new IllegalArgumentException("Duplicate setting key for: ".concat(this.f26977a));
        }
        map.put(this.f26977a, this);
    }

    /* JADX INFO: renamed from: b */
    public abstract Object mo10025b(String str);

    /* JADX INFO: renamed from: c */
    public final Object m10026c(dhv dhvVar) {
        return this.f26978b.mo10022a(dhvVar);
    }

    /* JADX INFO: renamed from: d */
    public String mo10027d(Object obj) {
        return obj.toString();
    }

    public gzw(String str, final Object obj) {
        this(str, new gzv() { // from class: gzu
            @Override // p000.gzv
            /* JADX INFO: renamed from: a */
            public final Object mo10022a(dhv dhvVar) {
                Object obj2 = obj;
                int i = gzw.f26975c;
                return obj2;
            }
        });
    }
}
