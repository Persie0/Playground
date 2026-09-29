package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ab9 {

    /* JADX INFO: renamed from: h */
    public static final C3835zj f466h = new C3835zj(11);

    /* JADX INFO: renamed from: i */
    public static final C3835zj f467i = new C3835zj(12);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f468a;

    /* JADX INFO: renamed from: b */
    public int f469b;

    /* JADX INFO: renamed from: c */
    public int f470c;

    /* JADX INFO: renamed from: d */
    public int f471d;

    /* JADX INFO: renamed from: e */
    public int f472e;

    /* JADX INFO: renamed from: f */
    public final Object f473f;

    /* JADX INFO: renamed from: g */
    public final Object f474g;

    public ab9(int i) {
        this.f468a = 1;
        this.f469b = i;
        if (i <= 0) {
            C3386nv.m17626m("maxSize <= 0");
            throw null;
        }
        this.f473f = new bn5();
        this.f474g = new p84(13);
    }

    /* JADX INFO: renamed from: a */
    public void m235a(int i, float f) {
        za9 za9Var;
        za9[] za9VarArr = (za9[]) this.f474g;
        ArrayList arrayList = (ArrayList) this.f473f;
        if (this.f469b != 1) {
            Collections.sort(arrayList, f466h);
            this.f469b = 1;
        }
        int i2 = this.f472e;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.f472e = i3;
            za9Var = za9VarArr[i3];
        } else {
            za9Var = new za9();
        }
        int i4 = this.f470c;
        this.f470c = i4 + 1;
        za9Var.f71291a = i4;
        za9Var.f71292b = i;
        za9Var.f71293c = f;
        arrayList.add(za9Var);
        this.f471d += i;
        while (true) {
            int i5 = this.f471d;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            za9 za9Var2 = (za9) arrayList.get(0);
            int i7 = za9Var2.f71292b;
            if (i7 <= i6) {
                this.f471d -= i7;
                arrayList.remove(0);
                int i8 = this.f472e;
                if (i8 < 5) {
                    this.f472e = i8 + 1;
                    za9VarArr[i8] = za9Var2;
                }
            } else {
                za9Var2.f71292b = i7 - i6;
                this.f471d -= i6;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public Object mo236b(Object obj) {
        obj.getClass();
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo237c(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX INFO: renamed from: d */
    public Object m238d(Object obj) {
        Object objPut;
        obj.getClass();
        synchronized (((p84) this.f474g)) {
            bn5 bn5Var = (bn5) this.f473f;
            bn5Var.getClass();
            Object obj2 = bn5Var.f8715a.get(obj);
            if (obj2 != null) {
                this.f471d++;
                return obj2;
            }
            this.f472e++;
            Object objMo236b = mo236b(obj);
            if (objMo236b == null) {
                return null;
            }
            synchronized (((p84) this.f474g)) {
                bn5 bn5Var2 = (bn5) this.f473f;
                bn5Var2.getClass();
                objPut = bn5Var2.f8715a.put(obj, objMo236b);
                if (objPut != null) {
                    bn5 bn5Var3 = (bn5) this.f473f;
                    bn5Var3.getClass();
                    bn5Var3.f8715a.put(obj, objPut);
                } else {
                    this.f470c += m242h(obj, objMo236b);
                }
            }
            if (objPut != null) {
                mo237c(obj, objMo236b, objPut);
                return objPut;
            }
            m244j(this.f469b);
            return objMo236b;
        }
    }

    /* JADX INFO: renamed from: e */
    public float m239e() {
        ArrayList arrayList = (ArrayList) this.f473f;
        if (this.f469b != 0) {
            Collections.sort(arrayList, f467i);
            this.f469b = 0;
        }
        float f = 0.5f * this.f471d;
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            za9 za9Var = (za9) arrayList.get(i2);
            i += za9Var.f71292b;
            if (i >= f) {
                return za9Var.f71293c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((za9) AbstractC3393o1.m17731f(1, arrayList)).f71293c;
    }

    /* JADX INFO: renamed from: f */
    public Object m240f(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        obj2.getClass();
        synchronized (((p84) this.f474g)) {
            this.f470c += m242h(obj, obj2);
            bn5 bn5Var = (bn5) this.f473f;
            bn5Var.getClass();
            objPut = bn5Var.f8715a.put(obj, obj2);
            if (objPut != null) {
                this.f470c -= m242h(obj, objPut);
            }
        }
        if (objPut != null) {
            mo237c(obj, objPut, obj2);
        }
        m244j(this.f469b);
        return objPut;
    }

    /* JADX INFO: renamed from: g */
    public Object m241g(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (((p84) this.f474g)) {
            bn5 bn5Var = (bn5) this.f473f;
            bn5Var.getClass();
            objRemove = bn5Var.f8715a.remove(obj);
            if (objRemove != null) {
                this.f470c -= m242h(obj, objRemove);
            }
        }
        if (objRemove != null) {
            mo237c(obj, objRemove, null);
        }
        return objRemove;
    }

    /* JADX INFO: renamed from: h */
    public int m242h(Object obj, Object obj2) {
        int iMo243i = mo243i(obj, obj2);
        if (iMo243i >= 0) {
            return iMo243i;
        }
        throw new IllegalStateException("Negative size: " + obj + '=' + obj2);
    }

    /* JADX INFO: renamed from: i */
    public int mo243i(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX INFO: renamed from: j */
    public void m244j(int i) {
        Object key;
        Object value;
        while (true) {
            synchronized (((p84) this.f474g)) {
                try {
                    if (this.f470c < 0 || (((bn5) this.f473f).f8715a.isEmpty() && this.f470c != 0)) {
                        break;
                    }
                    if (this.f470c > i && !((bn5) this.f473f).f8715a.isEmpty()) {
                        Set setEntrySet = ((bn5) this.f473f).f8715a.entrySet();
                        setEntrySet.getClass();
                        Map.Entry entry = (Map.Entry) u91.m22590H0(setEntrySet);
                        if (entry == null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        bn5 bn5Var = (bn5) this.f473f;
                        bn5Var.getClass();
                        key.getClass();
                        bn5Var.f8715a.remove(key);
                        this.f470c -= m242h(key, value);
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
            mo237c(key, value, null);
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public String toString() {
        String str;
        switch (this.f468a) {
            case 1:
                synchronized (((p84) this.f474g)) {
                    try {
                        int i = this.f471d;
                        int i2 = this.f472e + i;
                        str = "LruCache[maxSize=" + this.f469b + ",hits=" + this.f471d + ",misses=" + this.f472e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public ab9() {
        this.f468a = 0;
        this.f474g = new za9[5];
        this.f473f = new ArrayList();
        this.f469b = -1;
    }
}
