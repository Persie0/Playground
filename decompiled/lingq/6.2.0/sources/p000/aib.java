package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class aib {

    /* JADX INFO: renamed from: f */
    public static final Object f713f = new Object();

    /* JADX INFO: renamed from: g */
    public static Context f714g;

    /* JADX INFO: renamed from: h */
    public static volatile Boolean f715h;

    /* JADX INFO: renamed from: a */
    public final k58 f716a;

    /* JADX INFO: renamed from: b */
    public final String f717b;

    /* JADX INFO: renamed from: c */
    public final String f718c;

    /* JADX INFO: renamed from: d */
    public final Object f719d;

    /* JADX INFO: renamed from: e */
    public volatile jgb f720e = null;

    public aib(k58 k58Var, String str, Object obj) {
        k58Var.getClass();
        if (k58Var.f46729a == null) {
            C3386nv.m17626m("Must pass a valid SharedPreferences file name or ContentProvider URI");
            throw null;
        }
        this.f716a = k58Var;
        String strValueOf = String.valueOf(k58Var.f46730b);
        this.f718c = str.length() != 0 ? strValueOf.concat(str) : new String(strValueOf);
        String strValueOf2 = String.valueOf(k58Var.f46731c);
        this.f717b = str.length() != 0 ? strValueOf2.concat(str) : new String(strValueOf2);
        this.f719d = obj;
    }

    /* JADX INFO: renamed from: b */
    public static Object m444b(fmb fmbVar) {
        try {
            return fmbVar.mo4555a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return fmbVar.mo4555a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m445d() {
        if (f715h == null) {
            Context context = f714g;
            if (context == null) {
                return false;
            }
            f715h = Boolean.valueOf(q0c.m19593a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0);
        }
        return f715h.booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final Object m446a() {
        boolean zBooleanValue;
        Object objMo447c;
        String str;
        String strM24616b;
        Object objMo447c2 = null;
        if (f714g == null) {
            C3386nv.m17633t("Must call PhenotypeFlag.init() first");
            return null;
        }
        this.f716a.getClass();
        boolean z = false;
        if (m445d()) {
            zBooleanValue = ((Boolean) m444b(new C3404oc("gms:phenotype:phenotype_flag:debug_bypass_phenotype", 5))).booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (!zBooleanValue) {
            if (this.f716a.f46729a != null) {
                if (this.f720e == null) {
                    ContentResolver contentResolver = f714g.getContentResolver();
                    Uri uri = this.f716a.f46729a;
                    ConcurrentHashMap concurrentHashMap = jgb.f45524h;
                    jgb jgbVar = (jgb) concurrentHashMap.get(uri);
                    if (jgbVar == null) {
                        jgbVar = new jgb(contentResolver, uri);
                        jgb jgbVar2 = (jgb) concurrentHashMap.putIfAbsent(uri, jgbVar);
                        if (jgbVar2 == null) {
                            jgbVar.f45526a.registerContentObserver(jgbVar.f45527b, false, jgbVar.f45528c);
                        } else {
                            jgbVar = jgbVar2;
                        }
                    }
                    this.f720e = jgbVar;
                }
                String str2 = (String) m444b(new cdb(this, this.f720e, z, 6));
                if (str2 != null) {
                    objMo447c = mo447c(str2);
                }
            }
            if (objMo447c != null) {
                return objMo447c;
            }
            str = this.f718c;
            this.f716a.getClass();
            if (m445d()) {
                try {
                    strM24616b = xmd.m24616b(f714g.getContentResolver(), str);
                } catch (SecurityException unused) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        strM24616b = xmd.m24616b(f714g.getContentResolver(), str);
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
                if (strM24616b != null) {
                    objMo447c2 = mo447c(strM24616b);
                }
            }
            if (objMo447c2 != null) {
                return objMo447c2;
            }
            return this.f719d;
        }
        String strValueOf = String.valueOf(this.f717b);
        Log.w("PhenotypeFlag", strValueOf.length() != 0 ? "Bypass reading Phenotype values for flag: ".concat(strValueOf) : new String("Bypass reading Phenotype values for flag: "));
        objMo447c = null;
        if (objMo447c != null) {
            return objMo447c;
        }
        str = this.f718c;
        this.f716a.getClass();
        if (m445d()) {
            strM24616b = xmd.m24616b(f714g.getContentResolver(), str);
            if (strM24616b != null) {
                objMo447c2 = mo447c(strM24616b);
            }
        }
        if (objMo447c2 != null) {
            return objMo447c2;
        }
        return this.f719d;
    }

    /* JADX INFO: renamed from: c */
    public abstract Object mo447c(String str);
}
