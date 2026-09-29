package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Looper;
import androidx.compose.p002ui.layout.C0345l;
import coil.disk.C0860a;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: rx */
/* JADX INFO: loaded from: classes.dex */
public final class C3552rx {

    /* JADX INFO: renamed from: a */
    public boolean f59986a;

    /* JADX INFO: renamed from: b */
    public final Object f59987b;

    /* JADX INFO: renamed from: c */
    public Object f59988c;

    /* JADX INFO: renamed from: d */
    public Object f59989d;

    public C3552rx(t33 t33Var, boolean z) {
        this.f59989d = t33Var;
        this.f59988c = new AtomicReference(null);
        this.f59986a = z;
        this.f59987b = new AtomicMarkableReference(new sj4(z ? 8192 : 1024), false);
    }

    /* JADX INFO: renamed from: b */
    public static IOException m20966b(C3552rx c3552rx, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            c3552rx.m20978m(iOException);
        }
        return ((i18) c3552rx.f59987b).m13624g(c3552rx, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    /* JADX INFO: renamed from: a */
    public void m20967a() {
        gh2 gh2Var = (gh2) this.f59989d;
        synchronized (gh2Var) {
            try {
                if (this.f59986a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (fa4.m11650l(((zg2) this.f59987b).f71527g, this)) {
                    gh2Var.m12645b(this, false);
                }
                this.f59986a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m20968c() {
        gh2 gh2Var = (gh2) this.f59989d;
        synchronized (gh2Var) {
            try {
                if (this.f59986a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (fa4.m11650l(((zg2) this.f59987b).f71527g, this)) {
                    gh2Var.m12645b(this, true);
                }
                this.f59986a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m20969d(boolean z) {
        C0860a c0860a = (C0860a) this.f59989d;
        synchronized (c0860a) {
            try {
                if (this.f59986a) {
                    throw new IllegalStateException("editor is closed");
                }
                if (fa4.m11650l(((ah2) this.f59987b).f643g, this)) {
                    C0860a.m4956a(c0860a, this, z);
                }
                this.f59986a = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m20970e() {
        zg2 zg2Var = (zg2) this.f59987b;
        if (fa4.m11650l(zg2Var.f71527g, this)) {
            gh2 gh2Var = (gh2) this.f59989d;
            if (gh2Var.f40817l) {
                gh2Var.m12645b(this, false);
            } else {
                zg2Var.f71526f = true;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public d57 m20971f(int i) {
        d57 d57Var;
        C0860a c0860a = (C0860a) this.f59989d;
        synchronized (c0860a) {
            if (this.f59986a) {
                throw new IllegalStateException("editor is closed");
            }
            ((boolean[]) this.f59988c)[i] = true;
            Object obj = ((ah2) this.f59987b).f640d.get(i);
            fh2 fh2Var = c0860a.f10454K;
            d57 d57Var2 = (d57) obj;
            if (!fh2Var.m22434q(d57Var2)) {
                AbstractC3057h.m12986a(fh2Var.mo260J(d57Var2));
            }
            d57Var = (d57) obj;
        }
        return d57Var;
    }

    /* JADX INFO: renamed from: g */
    public j18 m20972g() {
        qu2 qu2VarMo12228h = ((ru2) this.f59989d).mo12228h();
        j18 j18Var = qu2VarMo12228h instanceof j18 ? (j18) qu2VarMo12228h : null;
        if (j18Var != null) {
            return j18Var;
        }
        C3386nv.m17633t("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized void m20973h() {
        try {
            if (this.f59986a) {
                return;
            }
            Boolean boolM20976k = m20976k();
            this.f59988c = boolM20976k;
            if (boolM20976k == null) {
                ho2 ho2Var = new ho2(24);
                qt2 qt2Var = (qt2) ((um9) this.f59987b);
                qt2Var.m20144a(qt2Var.f58183c, ho2Var);
            }
            this.f59986a = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public synchronized boolean m20974i() {
        Boolean bool;
        try {
            m20973h();
            bool = (Boolean) this.f59988c;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.f59989d).f13721a.m19648h();
    }

    /* JADX INFO: renamed from: j */
    public t89 m20975j(int i) {
        gh2 gh2Var = (gh2) this.f59989d;
        synchronized (gh2Var) {
            try {
                if (this.f59986a) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!fa4.m11650l(((zg2) this.f59987b).f71527g, this)) {
                    return new id0();
                }
                if (!((zg2) this.f59987b).f71525e) {
                    boolean[] zArr = (boolean[]) this.f59988c;
                    zArr.getClass();
                    zArr[i] = true;
                }
                d57 d57Var = (d57) ((zg2) this.f59987b).f71524d.get(i);
                try {
                    eh2 eh2Var = gh2Var.f40807b;
                    eh2Var.getClass();
                    d57Var.getClass();
                    return new d13(eh2Var.mo260J(d57Var), new C3704w(13, gh2Var, this));
                } catch (FileNotFoundException unused) {
                    return new id0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public Boolean m20976k() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        q43 q43Var = ((FirebaseMessaging) this.f59989d).f13721a;
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public h88 m20977l(boolean z) throws IOException {
        try {
            h88 h88VarMo12225e = ((ru2) this.f59989d).mo12225e(z);
            if (h88VarMo12225e == null) {
                return h88VarMo12225e;
            }
            h88VarMo12225e.f41992n = this;
            return h88VarMo12225e;
        } catch (IOException e) {
            m20978m(e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m20978m(IOException iOException) {
        this.f59986a = true;
        ((ru2) this.f59989d).mo12228h().mo11848f((i18) this.f59987b, iOException);
    }

    /* JADX INFO: renamed from: n */
    public C3156jq m20979n() throws SocketException {
        i18 i18Var = (i18) this.f59987b;
        if (i18Var.f43350i) {
            C3386nv.m17633t("Check failed.");
            return null;
        }
        i18Var.f43350i = true;
        i18Var.f43345d.m24715i();
        synchronized (i18Var) {
            if (i18Var.f43340L == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (i18Var.f43336H || i18Var.f43337I) {
                throw new IllegalStateException("Check failed.");
            }
            if (i18Var.f43352k) {
                throw new IllegalStateException("Check failed.");
            }
            if (!i18Var.f43353l) {
                throw new IllegalStateException("Check failed.");
            }
            i18Var.f43353l = false;
            i18Var.f43336H = true;
            i18Var.f43337I = true;
        }
        qu2 qu2VarMo12228h = ((ru2) this.f59989d).mo12228h();
        qu2VarMo12228h.getClass();
        j18 j18Var = (j18) qu2VarMo12228h;
        j18Var.f44900e.setSoTimeout(0);
        j18Var.mo11847e();
        return new C3156jq(this);
    }

    /* JADX INFO: renamed from: o */
    public String m20980o() {
        if (!this.f59986a) {
            this.f59986a = true;
            qfc qfcVar = (qfc) this.f59989d;
            this.f59988c = qfcVar.m19930H().getString((String) this.f59987b, null);
        }
        return (String) this.f59988c;
    }

    /* JADX INFO: renamed from: p */
    public void m20981p(String str) {
        SharedPreferences.Editor editorEdit = ((qfc) this.f59989d).m19930H().edit();
        editorEdit.putString((String) this.f59987b, str);
        editorEdit.apply();
        this.f59988c = str;
    }

    public C3552rx() {
        this.f59987b = new Object();
        this.f59988c = new ArrayList();
        this.f59989d = new ArrayList();
        this.f59986a = true;
    }

    public C3552rx(i18 i18Var, su2 su2Var, ru2 ru2Var) {
        su2Var.getClass();
        this.f59987b = i18Var;
        this.f59988c = su2Var;
        this.f59989d = ru2Var;
    }

    public C3552rx(Context context, Looper looper, Looper looper2, ew2 ew2Var, mp9 mp9Var) {
        this.f59987b = context.getApplicationContext();
        this.f59989d = mp9Var.m16990a(looper, null);
        this.f59988c = new C3514qx(this, mp9Var.m16990a(looper2, null), ew2Var);
    }

    public C3552rx(qfc qfcVar, String str) {
        this.f59989d = qfcVar;
        lda.m16127m(str);
        this.f59987b = str;
    }

    public C3552rx(xt4 xt4Var, C0345l c0345l, fj7 fj7Var) {
        this.f59987b = xt4Var;
        this.f59988c = c0345l;
        this.f59989d = fj7Var;
        this.f59986a = true;
    }

    public C3552rx(C0860a c0860a, ah2 ah2Var) {
        this.f59989d = c0860a;
        this.f59987b = ah2Var;
        this.f59988c = new boolean[2];
    }

    public C3552rx(FirebaseMessaging firebaseMessaging, um9 um9Var) {
        this.f59989d = firebaseMessaging;
        this.f59987b = um9Var;
    }

    public C3552rx(gh2 gh2Var, zg2 zg2Var) {
        boolean[] zArr;
        this.f59989d = gh2Var;
        this.f59987b = zg2Var;
        if (zg2Var.f71525e) {
            zArr = null;
        } else {
            gh2Var.getClass();
            zArr = new boolean[2];
        }
        this.f59988c = zArr;
    }
}
