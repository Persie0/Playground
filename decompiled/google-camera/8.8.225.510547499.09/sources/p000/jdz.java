package p000;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class jdz implements jed, jqh {

    /* JADX INFO: renamed from: c */
    public final Context f33820c;

    /* JADX INFO: renamed from: d */
    public final String f33821d;

    /* JADX INFO: renamed from: e */
    public final jdt f33822e;

    /* JADX INFO: renamed from: f */
    public final jev f33823f;

    /* JADX INFO: renamed from: g */
    public final Looper f33824g;

    /* JADX INFO: renamed from: h */
    public final int f33825h;

    /* JADX INFO: renamed from: i */
    public final jec f33826i;

    /* JADX INFO: renamed from: j */
    protected final jfm f33827j;

    /* JADX INFO: renamed from: k */
    public final ihk f33828k;

    public jdz(Context context, Activity activity, ihk ihkVar, jdt jdtVar, jdy jdyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String str;
        jfu jfuVar;
        jfu jfuVar2;
        jft jftVar;
        jgf jgfVar;
        jgf jgfVar2;
        jib.m13206k(context, "Null context is not permitted.");
        jib.m13206k(jdyVar, KMNlNMe.BsKBBklyJfZuW);
        Context applicationContext = context.getApplicationContext();
        jib.m13206k(applicationContext, "The provided context did not have an application context.");
        this.f33820c = applicationContext;
        try {
            str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            str = null;
        }
        this.f33821d = str;
        this.f33828k = ihkVar;
        this.f33822e = jdtVar;
        this.f33824g = jdyVar.f33818b;
        jev jevVar = new jev(ihkVar, jdtVar, str, null, null, null);
        this.f33823f = jevVar;
        this.f33826i = new jfn(this);
        jfm jfmVarM13041c = jfm.m13041c(this.f33820c);
        this.f33827j = jfmVarM13041c;
        this.f33825h = jfmVarM13041c.f33898i.getAndIncrement();
        jeu jeuVar = jdyVar.f33819c;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            Object obj = new jfs(activity).f33914a;
            if (obj instanceof ActivityC0080bz) {
                ActivityC0080bz activityC0080bz = (ActivityC0080bz) obj;
                WeakReference weakReference = (WeakReference) jgf.f33952a.get(activityC0080bz);
                if (weakReference == null || (jgfVar2 = (jgf) weakReference.get()) == null) {
                    try {
                        jftVar = jgfVar2;
                        jgf jgfVar3 = (jgf) activityC0080bz.m3206bA().m5325e("SupportLifecycleFragmentImpl");
                        if (jgfVar3 == null || jgfVar3.f4616r) {
                            jgfVar = jgfVar3;
                            jgf jgfVar4 = new jgf();
                            AbstractC0118cx abstractC0118cxM5327i = activityC0080bz.m3206bA().m5327i();
                            abstractC0118cxM5327i.m5699o(jgfVar4, "SupportLifecycleFragmentImpl");
                            abstractC0118cxM5327i.mo2022i();
                            jgfVar = jgfVar4;
                        }
                        jgfVar = jgfVar3;
                        jgf.f33952a.put(activityC0080bz, new WeakReference(jgfVar));
                        jftVar = jgfVar;
                    } catch (ClassCastException e2) {
                        throw new IllegalStateException(YmzeHXaMYOLk.fAnRGLXhuwORR, e2);
                    }
                }
            } else {
                WeakReference weakReference2 = (WeakReference) jfu.f33915a.get(obj);
                if (weakReference2 == null || (jfuVar2 = (jfu) weakReference2.get()) == null) {
                    try {
                        jftVar = jfuVar2;
                        jfu jfuVar3 = (jfu) ((Activity) obj).getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                        if (jfuVar3 == null || jfuVar3.isRemoving()) {
                            jfuVar = jfuVar3;
                            jfu jfuVar4 = new jfu();
                            ((Activity) obj).getFragmentManager().beginTransaction().add(jfuVar4, "LifecycleFragmentImpl").commitAllowingStateLoss();
                            jfuVar = jfuVar4;
                        }
                        jfuVar = jfuVar3;
                        jfu.f33915a.put(obj, new WeakReference(jfuVar));
                        jftVar = jfuVar;
                    } catch (ClassCastException e3) {
                        throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e3);
                    }
                }
            }
            jftVar = jfuVar2;
            jftVar = jgfVar2;
            jfh jfhVar = (jfh) jftVar.mo13119c(jfh.class);
            jfhVar = jfhVar == null ? new jfh(jftVar, jfmVarM13041c) : jfhVar;
            jfhVar.f33867e.add(jevVar);
            jfmVarM13041c.m13048f(jfhVar);
        }
        Handler handler = jfmVarM13041c.f33903n;
        handler.sendMessage(handler.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    private final jpp m12956a(int i, jgh jghVar) {
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        jfm jfmVar = this.f33827j;
        jfmVar.m13051i(khbVar, jghVar.f33962c, this);
        jer jerVar = new jer(i, jghVar, khbVar, null, null);
        Handler handler = jfmVar.f33903n;
        handler.sendMessage(handler.obtainMessage(4, new lqq(jerVar, jfmVar.f33899j.get(), this)));
        return (jpp) khbVar.f36008a;
    }

    /* JADX INFO: renamed from: i */
    public static void m12957i(jrt jrtVar) {
        jib.m13206k(jrtVar, "channel must not be null");
    }

    @Override // p000.jed
    /* JADX INFO: renamed from: c */
    public final jev mo12958c() {
        return this.f33823f;
    }

    /* JADX INFO: renamed from: d */
    public final jgy m12959d() {
        GoogleSignInAccount googleSignInAccountM12937a;
        GoogleSignInAccount googleSignInAccountM12937a2;
        jgy jgyVar = new jgy();
        jdt jdtVar = this.f33822e;
        Account accountM12936a = null;
        if (!(jdtVar instanceof jdr) || (googleSignInAccountM12937a2 = ((jdr) jdtVar).m12937a()) == null) {
            jdt jdtVar2 = this.f33822e;
            if (jdtVar2 instanceof jdq) {
                accountM12936a = ((jdq) jdtVar2).m12936a();
            }
        } else {
            String str = googleSignInAccountM12937a2.f7560d;
            if (str != null) {
                accountM12936a = new Account(str, "com.google");
            }
        }
        jgyVar.f34009a = accountM12936a;
        jdt jdtVar3 = this.f33822e;
        Set setEmptySet = (!(jdtVar3 instanceof jdr) || (googleSignInAccountM12937a = ((jdr) jdtVar3).m12937a()) == null) ? Collections.emptySet() : googleSignInAccountM12937a.m4636a();
        if (jgyVar.f34010b == null) {
            jgyVar.f34010b = new C1112xa();
        }
        ((C1112xa) jgyVar.f34010b).addAll(setEmptySet);
        jgyVar.f34012d = this.f33820c.getClass().getName();
        jgyVar.f34011c = this.f33820c.getPackageName();
        return jgyVar;
    }

    /* JADX INFO: renamed from: e */
    public final jpp m12960e(jgh jghVar) {
        return m12956a(0, jghVar);
    }

    /* JADX INFO: renamed from: f */
    public final jpp m12961f(jfv jfvVar, int i) {
        jfm jfmVar = this.f33827j;
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        jfmVar.m13051i(khbVar, i, this);
        jes jesVar = new jes(jfvVar, khbVar, null, null);
        Handler handler = jfmVar.f33903n;
        handler.sendMessage(handler.obtainMessage(13, new lqq(jesVar, jfmVar.f33899j.get(), this)));
        return (jpp) khbVar.f36008a;
    }

    /* JADX INFO: renamed from: g */
    public final void m12962g(int i, jey jeyVar) {
        boolean z = true;
        if (!jeyVar.f7615e && !((Boolean) BasePendingResult.f7611c.get()).booleanValue()) {
            z = false;
        }
        jeyVar.f7615e = z;
        jfm jfmVar = this.f33827j;
        jep jepVar = new jep(i, jeyVar);
        Handler handler = jfmVar.f33903n;
        handler.sendMessage(handler.obtainMessage(4, new lqq(jepVar, jfmVar.f33899j.get(), this)));
    }

    @Override // p000.jqh
    /* JADX INFO: renamed from: h */
    public final jpp mo12963h() {
        jgg jggVarM13132a = jgh.m13132a();
        jggVarM13132a.f33956a = new jpy(0);
        jggVarM13132a.f33958c = 4501;
        return m12960e(jggVarM13132a.m13130a());
    }

    /* JADX INFO: renamed from: j */
    public final void m12964j(jgh jghVar) {
        m12956a(2, jghVar);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX INFO: renamed from: k */
    public final void m12965k(djm djmVar) {
        jib.m13206k(((kyl) djmVar.f11789c).m15062a(), "Listener has already been released.");
        jfm jfmVar = this.f33827j;
        Object obj = djmVar.f11789c;
        Object obj2 = djmVar.f11787a;
        ?? r6 = djmVar.f11788b;
        khb khbVar = new khb((byte[]) null, (byte[]) null);
        kyl kylVar = (kyl) obj;
        jfmVar.m13051i(khbVar, kylVar.f37729a, this);
        jeq jeqVar = new jeq(new djm(kylVar, (AmbientMode.AmbientController) obj2, (Runnable) r6, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null), khbVar, null, null, null, null);
        Handler handler = jfmVar.f33903n;
        handler.sendMessage(handler.obtainMessage(8, new lqq(jeqVar, jfmVar.f33899j.get(), this)));
    }

    public jdz(Context context, ihk ihkVar, jdt jdtVar, jdy jdyVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(context, null, ihkVar, jdtVar, jdyVar, null, null, null);
    }

    @Deprecated
    public jdz(Context context, ihk ihkVar, jdt jdtVar, jeu jeuVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        jdx jdxVar = new jdx();
        jdxVar.f33816b = jeuVar;
        this(context, ihkVar, jdtVar, jdxVar.m12952a(), (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public jdz(Context context) {
        this(context, jjv.f34188a, jdt.f33812r, jdy.f33817a, (byte[]) null, (byte[]) null, (byte[]) null);
        jup.m13521b(context.getApplicationContext());
    }

    public jdz(Context context, jqe jqeVar) {
        this(context, jqf.f34589a, jqeVar, jdy.f33817a, (byte[]) null, (byte[]) null, (byte[]) null);
    }
}
