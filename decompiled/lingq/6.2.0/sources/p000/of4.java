package p000;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class of4 implements zr2 {

    /* JADX INFO: renamed from: f */
    public static final mf4 f54266f;

    /* JADX INFO: renamed from: g */
    public static final mf4 f54267g;

    /* JADX INFO: renamed from: a */
    public final HashMap f54269a;

    /* JADX INFO: renamed from: b */
    public final HashMap f54270b;

    /* JADX INFO: renamed from: c */
    public final lf4 f54271c;

    /* JADX INFO: renamed from: d */
    public boolean f54272d;

    /* JADX INFO: renamed from: e */
    public static final lf4 f54265e = new lf4(0);

    /* JADX INFO: renamed from: h */
    public static final nf4 f54268h = new nf4();

    /* JADX WARN: Type inference failed for: r0v1, types: [mf4] */
    /* JADX WARN: Type inference failed for: r0v2, types: [mf4] */
    static {
        final int i = 0;
        f54266f = new yna() { // from class: mf4
            @Override // p000.yr2
            /* JADX INFO: renamed from: a */
            public final void mo24a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((zna) obj2).mo16390b((String) obj);
                        break;
                    default:
                        ((zna) obj2).mo16391c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        f54267g = new yna() { // from class: mf4
            @Override // p000.yr2
            /* JADX INFO: renamed from: a */
            public final void mo24a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((zna) obj2).mo16390b((String) obj);
                        break;
                    default:
                        ((zna) obj2).mo16391c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public of4() {
        HashMap map = new HashMap();
        this.f54269a = map;
        HashMap map2 = new HashMap();
        this.f54270b = map2;
        this.f54271c = f54265e;
        this.f54272d = false;
        map2.put(String.class, f54266f);
        map.remove(String.class);
        map2.put(Boolean.class, f54267g);
        map.remove(Boolean.class);
        map2.put(Date.class, f54268h);
        map.remove(Date.class);
    }

    @Override // p000.zr2
    /* JADX INFO: renamed from: e */
    public final zr2 mo12901e(Class cls, fp6 fp6Var) {
        this.f54269a.put(cls, fp6Var);
        this.f54270b.remove(cls);
        return this;
    }
}
