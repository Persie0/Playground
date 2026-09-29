package p000;

import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzafy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class whb extends bhb {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected ojb zzc;

    public whb() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = ojb.f54469f;
    }

    /* JADX INFO: renamed from: d */
    public static whb m23955d(whb whbVar, byte[] bArr, phb phbVar) throws zzaeh {
        int length = bArr.length;
        if (length != 0) {
            whb whbVarM23964h = whbVar.m23964h();
            try {
                fjb fjbVarM4784a = cjb.f10181c.m4784a(whbVarM23964h.getClass());
                fjbVarM4784a.mo11898g(whbVarM23964h, bArr, 0, length, new ehb(phbVar));
                fjbVarM4784a.mo11892a(whbVarM23964h);
                whbVar = whbVarM23964h;
            } catch (zzaeh e) {
                if (e.f11871a) {
                    throw new zzaeh(e.getMessage(), e);
                }
                throw e;
            } catch (zzafy e2) {
                throw e2.m5438a();
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzaeh) {
                    throw ((zzaeh) e3.getCause());
                }
                throw new zzaeh(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                uk9.m22782q("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                return null;
            }
        }
        m23960q(whbVar);
        return whbVar;
    }

    /* JADX INFO: renamed from: m */
    public static whb m23956m(Class cls) {
        Map map = zze;
        whb whbVar = (whb) map.get(cls);
        if (whbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                whbVar = (whb) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (whbVar != null) {
            return whbVar;
        }
        whb whbVar2 = (whb) ((whb) tjb.m22156d(cls)).mo329r(6);
        if (whbVar2 != null) {
            map.put(cls, whbVar2);
            return whbVar2;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static void m23957n(Class cls, whb whbVar) {
        whbVar.m23963g();
        zze.put(cls, whbVar);
    }

    /* JADX INFO: renamed from: o */
    public static Object m23958o(Method method, whb whbVar, Object... objArr) {
        try {
            return method.invoke(whbVar, objArr);
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

    /* JADX INFO: renamed from: p */
    public static final boolean m23959p(whb whbVar, boolean z) {
        byte bByteValue = ((Byte) whbVar.mo329r(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo11896e = cjb.f10181c.m4784a(whbVar.getClass()).mo11896e(whbVar);
        if (z) {
            whbVar.mo329r(2);
        }
        return zMo11896e;
    }

    /* JADX INFO: renamed from: q */
    public static void m23960q(whb whbVar) throws zzaeh {
        if (whbVar != null && !m23959p(whbVar, true)) {
            throw new zzafy().m5438a();
        }
    }

    @Override // p000.bhb
    /* JADX INFO: renamed from: b */
    public final int mo3726b(fjb fjbVar) {
        if (m23962f()) {
            int iMo11895d = fjbVar.mo11895d(this);
            if (iMo11895d >= 0) {
                return iMo11895d;
            }
            uk9.m22781p(String.valueOf(iMo11895d).length() + 42, iMo11895d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo11895d2 = fjbVar.mo11895d(this);
        if (iMo11895d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo11895d2;
            return iMo11895d2;
        }
        uk9.m22781p(String.valueOf(iMo11895d2).length() + 42, iMo11895d2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m23961e(nhb nhbVar) {
        fjb fjbVarM4784a = cjb.f10181c.m4784a(getClass());
        gw9 gw9Var = nhbVar.f52744a;
        if (gw9Var == null) {
            gw9Var = new gw9(nhbVar);
        }
        fjbVarM4784a.mo11894c(this, gw9Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return cjb.f10181c.m4784a(getClass()).mo11900i(this, (whb) obj);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m23962f() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m23963g() {
        this.zzb &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h */
    public final whb m23964h() {
        return (whb) mo329r(4);
    }

    public final int hashCode() {
        if (m23962f()) {
            return cjb.f10181c.m4784a(getClass()).mo11899h(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iMo11899h = cjb.f10181c.m4784a(getClass()).mo11899h(this);
        this.zza = iMo11899h;
        return iMo11899h;
    }

    /* JADX INFO: renamed from: i */
    public final uhb m23965i() {
        return (uhb) mo329r(5);
    }

    /* JADX INFO: renamed from: j */
    public final uhb m23966j() {
        uhb uhbVar = (uhb) mo329r(5);
        uhbVar.m22742e(this);
        return uhbVar;
    }

    /* JADX INFO: renamed from: k */
    public final void m23967k() {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: l */
    public final int m23968l() {
        if (m23962f()) {
            int iMo11895d = cjb.f10181c.m4784a(getClass()).mo11895d(this);
            if (iMo11895d >= 0) {
                return iMo11895d;
            }
            uk9.m22781p(String.valueOf(iMo11895d).length() + 42, iMo11895d);
            return 0;
        }
        int i = this.zzb & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iMo11895d2 = cjb.f10181c.m4784a(getClass()).mo11895d(this);
        if (iMo11895d2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iMo11895d2;
            return iMo11895d2;
        }
        uk9.m22781p(String.valueOf(iMo11895d2).length() + 42, iMo11895d2);
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public abstract Object mo329r(int i);

    public final String toString() {
        return wib.m23989a(this, super.toString());
    }
}
