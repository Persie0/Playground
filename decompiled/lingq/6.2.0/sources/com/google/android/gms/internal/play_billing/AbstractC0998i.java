package com.google.android.gms.internal.play_billing;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.C3386nv;
import p000.gw9;
import p000.ij6;
import p000.jjc;
import p000.lgc;
import p000.lkc;
import p000.p7c;
import p000.uk9;
import p000.ux5;
import p000.vfc;
import p000.z3c;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0998i extends AbstractC0997h {
    private static final Map zzb = new ConcurrentHashMap();
    protected jjc zzc;
    private int zzd;

    public AbstractC0998i() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = jjc.f45639f;
    }

    /* JADX INFO: renamed from: f */
    public static void m5533f(Class cls, AbstractC0998i abstractC0998i) {
        abstractC0998i.m5537e();
        zzb.put(cls, abstractC0998i);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m5534i(AbstractC0998i abstractC0998i, boolean z) {
        byte bByteValue = ((Byte) abstractC0998i.mo5511j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo5557a = vfc.f65328c.m23265a(abstractC0998i.getClass()).mo5557a(abstractC0998i);
        if (z) {
            abstractC0998i.mo5511j(2);
        }
        return zMo5557a;
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC0998i m5535m(Class cls) {
        Map map = zzb;
        AbstractC0998i abstractC0998i = (AbstractC0998i) map.get(cls);
        if (abstractC0998i == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0998i = (AbstractC0998i) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0998i != null) {
            return abstractC0998i;
        }
        AbstractC0998i abstractC0998i2 = (AbstractC0998i) ((AbstractC0998i) lkc.m16338g(cls)).mo5511j(6);
        if (abstractC0998i2 != null) {
            map.put(cls, abstractC0998i2);
            return abstractC0998i2;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static Object m5536o(Method method, AbstractC0998i abstractC0998i, Object... objArr) {
        try {
            return method.invoke(abstractC0998i, objArr);
        } catch (IllegalAccessException e) {
            ij6.m13958p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ij6.m13958p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0997h
    /* JADX INFO: renamed from: a */
    public final void mo5529a(z3c z3cVar) {
        lgc lgcVarM23265a = vfc.f65328c.m23265a(getClass());
        gw9 gw9Var = z3cVar.f70845a;
        if (gw9Var == null) {
            gw9Var = new gw9(z3cVar);
        }
        lgcVarM23265a.mo5564h(this, gw9Var);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0997h
    /* JADX INFO: renamed from: c */
    public final int mo5531c(lgc lgcVar) {
        if (m5539h()) {
            int iMo5560d = lgcVar.mo5560d(this);
            if (iMo5560d >= 0) {
                return iMo5560d;
            }
            C3386nv.m17633t(ux5.m22988k(iMo5560d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo5560d2 = lgcVar.mo5560d(this);
        if (iMo5560d2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo5560d2;
            return iMo5560d2;
        }
        C3386nv.m17633t(ux5.m22988k(iMo5560d2, "serialized size must be non-negative, was "));
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0997h
    /* JADX INFO: renamed from: d */
    public final int mo5532d() {
        if (m5539h()) {
            int iMo5560d = vfc.f65328c.m23265a(getClass()).mo5560d(this);
            if (iMo5560d >= 0) {
                return iMo5560d;
            }
            C3386nv.m17633t(ux5.m22988k(iMo5560d, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo5560d2 = vfc.f65328c.m23265a(getClass()).mo5560d(this);
        if (iMo5560d2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iMo5560d2;
            return iMo5560d2;
        }
        C3386nv.m17633t(ux5.m22988k(iMo5560d2, "serialized size must be non-negative, was "));
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m5537e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return vfc.f65328c.m23265a(getClass()).mo5565i(this, (AbstractC0998i) obj);
    }

    /* JADX INFO: renamed from: g */
    public final void m5538g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m5539h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (m5539h()) {
            return vfc.f65328c.m23265a(getClass()).mo5562f(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo5562f = vfc.f65328c.m23265a(getClass()).mo5562f(this);
        this.zza = iMo5562f;
        return iMo5562f;
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo5511j(int i);

    /* JADX INFO: renamed from: k */
    public final p7c m5540k() {
        return (p7c) mo5511j(5);
    }

    /* JADX INFO: renamed from: l */
    public final p7c m5541l() {
        p7c p7cVar = (p7c) mo5511j(5);
        if (!p7cVar.f55714a.equals(this)) {
            if (!p7cVar.f55715b.m5539h()) {
                AbstractC0998i abstractC0998iM5542n = p7cVar.f55714a.m5542n();
                vfc.f65328c.m23265a(abstractC0998iM5542n.getClass()).mo5563g(abstractC0998iM5542n, p7cVar.f55715b);
                p7cVar.f55715b = abstractC0998iM5542n;
            }
            AbstractC0998i abstractC0998i = p7cVar.f55715b;
            vfc.f65328c.m23265a(abstractC0998i.getClass()).mo5563g(abstractC0998i, this);
        }
        return p7cVar;
    }

    /* JADX INFO: renamed from: n */
    public final AbstractC0998i m5542n() {
        return (AbstractC0998i) mo5511j(4);
    }

    public final String toString() {
        return AbstractC1000k.m5543a(this, super.toString());
    }
}
