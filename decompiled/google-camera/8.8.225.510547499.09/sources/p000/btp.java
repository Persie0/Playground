package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class btp implements btg {

    /* JADX INFO: renamed from: a */
    private final btl f4438a;

    /* JADX INFO: renamed from: b */
    private final bto f4439b;

    /* JADX INFO: renamed from: c */
    private final Map f4440c;

    /* JADX INFO: renamed from: d */
    private final Map f4441d;

    /* JADX INFO: renamed from: e */
    private final int f4442e;

    /* JADX INFO: renamed from: f */
    private int f4443f;

    public btp() {
        this.f4438a = new btl();
        this.f4439b = new bto();
        this.f4440c = new HashMap();
        this.f4441d = new HashMap();
        this.f4442e = 4194304;
    }

    /* JADX INFO: renamed from: f */
    private final btf m3056f(Class cls) {
        btf btmVar = (btf) this.f4441d.get(cls);
        if (btmVar == null) {
            if (cls.equals(int[].class)) {
                btmVar = new btm(0);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(String.valueOf(cls.getSimpleName())));
                }
                btmVar = new btm(1);
            }
            this.f4441d.put(cls, btmVar);
        }
        return btmVar;
    }

    /* JADX INFO: renamed from: g */
    private final Object m3057g(btn btnVar, Class cls) {
        btf btfVarM3056f = m3056f(cls);
        Object objM3051a = this.f4438a.m3051a(btnVar);
        if (objM3051a != null) {
            this.f4443f -= btfVarM3056f.mo3031a(objM3051a) * btfVarM3056f.mo3032b();
            m3059i(btfVarM3056f.mo3031a(objM3051a), cls);
        }
        return objM3051a == null ? btfVarM3056f.mo3033c(btnVar.f4435a) : objM3051a;
    }

    /* JADX INFO: renamed from: h */
    private final NavigableMap m3058h(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f4440c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f4440c.put(cls, treeMap);
        return treeMap;
    }

    /* JADX INFO: renamed from: i */
    private final void m3059i(int i, Class cls) {
        NavigableMap navigableMapM3058h = m3058h(cls);
        Integer numValueOf = Integer.valueOf(i);
        Integer num = (Integer) navigableMapM3058h.get(numValueOf);
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapM3058h.remove(numValueOf);
                return;
            } else {
                navigableMapM3058h.put(numValueOf, Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + toString());
    }

    /* JADX INFO: renamed from: j */
    private final void m3060j(int i) {
        while (this.f4443f > i) {
            Object objM3052b = this.f4438a.m3052b();
            bzq.m3278r(objM3052b);
            btf btfVarM3056f = m3056f(objM3052b.getClass());
            this.f4443f -= btfVarM3056f.mo3031a(objM3052b) * btfVarM3056f.mo3032b();
            m3059i(btfVarM3056f.mo3031a(objM3052b), objM3052b.getClass());
        }
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: a */
    public final synchronized Object mo3034a(int i, Class cls) {
        Integer num;
        int i2;
        num = (Integer) m3058h(cls).ceilingKey(Integer.valueOf(i));
        return m3057g((num == null || ((i2 = this.f4443f) != 0 && this.f4442e / i2 < 2 && num.intValue() > i * 8)) ? this.f4439b.m3055d(i, cls) : this.f4439b.m3055d(num.intValue(), cls), cls);
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: b */
    public final synchronized void mo3035b() {
        m3060j(0);
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: c */
    public final synchronized void mo3036c(Object obj) {
        Class<?> cls = obj.getClass();
        btf btfVarM3056f = m3056f(cls);
        int iMo3031a = btfVarM3056f.mo3031a(obj);
        int iMo3032b = btfVarM3056f.mo3032b() * iMo3031a;
        int iIntValue = 1;
        if (iMo3032b <= (this.f4442e >> 1)) {
            btn btnVarM3055d = this.f4439b.m3055d(iMo3031a, cls);
            this.f4438a.m3053c(btnVarM3055d, obj);
            NavigableMap navigableMapM3058h = m3058h(cls);
            Integer num = (Integer) navigableMapM3058h.get(Integer.valueOf(btnVarM3055d.f4435a));
            Integer numValueOf = Integer.valueOf(btnVarM3055d.f4435a);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapM3058h.put(numValueOf, Integer.valueOf(iIntValue));
            this.f4443f += iMo3032b;
            m3060j(this.f4442e);
        }
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: d */
    public final synchronized void mo3037d(int i) {
        try {
            if (i >= 40) {
                mo3035b();
                return;
            }
            if (i >= 20 || i == 15) {
                m3060j(this.f4442e >> 1);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: e */
    public final synchronized Object mo3038e(Class cls) {
        return m3057g(this.f4439b.m3055d(8, cls), cls);
    }

    public btp(int i) {
        this.f4438a = new btl();
        this.f4439b = new bto();
        this.f4440c = new HashMap();
        this.f4441d = new HashMap();
        this.f4442e = i;
    }
}
