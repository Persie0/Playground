package p000;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnu extends jhh {

    /* JADX INFO: renamed from: a */
    public final C1117xf f34419a;

    /* JADX INFO: renamed from: t */
    private final C1117xf f34420t;

    /* JADX INFO: renamed from: u */
    private final C1117xf f34421u;

    public jnu(Context context, Looper looper, jgz jgzVar, jfe jfeVar, jga jgaVar) {
        super(context, looper, 23, jgzVar, jfeVar, jgaVar);
        this.f34419a = new C1117xf();
        this.f34420t = new C1117xf();
        this.f34421u = new C1117xf();
    }

    /* JADX INFO: renamed from: J */
    public static final jfr m13393J(khb khbVar, Object obj) {
        return new jnq(obj, khbVar, null, null);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: C */
    public final boolean mo13154C() {
        return true;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: G */
    public final void mo13157G() {
        System.currentTimeMillis();
        synchronized (this.f34419a) {
            this.f34419a.clear();
        }
        synchronized (this.f34420t) {
            this.f34420t.clear();
        }
        synchronized (this.f34421u) {
            this.f34421u.clear();
        }
    }

    /* JADX INFO: renamed from: I */
    public final boolean m13394I(jcw jcwVar) {
        jcw jcwVar2;
        jcw[] jcwVarArrM13164p = m13164p();
        if (jcwVarArrM13164p != null) {
            int i = 0;
            while (true) {
                if (i >= jcwVarArrM13164p.length) {
                    jcwVar2 = null;
                    break;
                }
                jcwVar2 = jcwVarArrM13164p[i];
                if (jcwVar.f33761a.equals(jcwVar2.f33761a)) {
                    break;
                }
                i++;
            }
            if (jcwVar2 != null && jcwVar2.m12896a() >= jcwVar.m12896a()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.jhh, p000.jgw, p000.jdu
    /* JADX INFO: renamed from: a */
    public final int mo12833a() {
        return 11717000;
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: b */
    protected final /* synthetic */ IInterface mo12834b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof jnk ? (jnk) iInterfaceQueryLocalInterface : new jnk(iBinder);
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: c */
    protected final String mo12835c() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: d */
    protected final String mo12836d() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // p000.jgw
    /* JADX INFO: renamed from: e */
    public final jcw[] mo12893e() {
        return jmy.f34392l;
    }
}
