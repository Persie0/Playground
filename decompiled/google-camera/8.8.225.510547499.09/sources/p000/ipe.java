package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ipe implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f31690a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f31691b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f31692c;

    public /* synthetic */ ipe(Activity activity, Intent intent, int i) {
        this.f31692c = i;
        this.f31690a = activity;
        this.f31691b = intent;
    }

    public /* synthetic */ ipe(ihk ihkVar, Intent intent, int i, byte[] bArr, byte[] bArr2) {
        this.f31692c = i;
        this.f31691b = ihkVar;
        this.f31690a = intent;
    }

    public /* synthetic */ ipe(ihk ihkVar, Uri uri, int i, byte[] bArr, byte[] bArr2) {
        this.f31692c = i;
        this.f31691b = ihkVar;
        this.f31690a = uri;
    }

    public /* synthetic */ ipe(ipg ipgVar, key keyVar, int i) {
        this.f31692c = i;
        this.f31690a = ipgVar;
        this.f31691b = keyVar;
    }

    public /* synthetic */ ipe(irg irgVar, String str, int i) {
        this.f31692c = i;
        this.f31690a = irgVar;
        this.f31691b = str;
    }

    public /* synthetic */ ipe(ite iteVar, MotionEvent motionEvent, int i) {
        this.f31692c = i;
        this.f31691b = iteVar;
        this.f31690a = motionEvent;
    }

    public /* synthetic */ ipe(ite iteVar, mrm mrmVar, int i) {
        this.f31692c = i;
        this.f31690a = iteVar;
        this.f31691b = mrmVar;
    }

    public ipe(ixl ixlVar, ArrayList arrayList, int i) {
        this.f31692c = i;
        this.f31690a = ixlVar;
        this.f31691b = arrayList;
    }

    public ipe(izq izqVar, jal jalVar, int i) {
        this.f31692c = i;
        this.f31690a = izqVar;
        this.f31691b = jalVar;
    }

    public ipe(izx izxVar, ComponentName componentName, int i) {
        this.f31692c = i;
        this.f31691b = izxVar;
        this.f31690a = componentName;
    }

    public ipe(izx izxVar, jap japVar, int i) {
        this.f31692c = i;
        this.f31690a = izxVar;
        this.f31691b = japVar;
    }

    public ipe(jfl jflVar, jcu jcuVar, int i) {
        this.f31692c = i;
        this.f31691b = jflVar;
        this.f31690a = jcuVar;
    }

    public /* synthetic */ ipe(jfx jfxVar, jfw jfwVar, int i) {
        this.f31692c = i;
        this.f31691b = jfxVar;
        this.f31690a = jfwVar;
    }

    public ipe(jgd jgdVar, jpc jpcVar, int i) {
        this.f31692c = i;
        this.f31690a = jgdVar;
        this.f31691b = jpcVar;
    }

    public ipe(jph jphVar, jpp jppVar, int i, byte[] bArr) {
        this.f31692c = i;
        this.f31690a = jphVar;
        this.f31691b = jppVar;
    }

    public ipe(jph jphVar, jpp jppVar, int i, char[] cArr) {
        this.f31692c = i;
        this.f31690a = jphVar;
        this.f31691b = jppVar;
    }

    public ipe(jph jphVar, jpp jppVar, int i, short[] sArr) {
        this.f31692c = i;
        this.f31690a = jphVar;
        this.f31691b = jppVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object, jpf] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r1v20, types: [jal, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.Object, jfw] */
    /* JADX WARN: Type inference failed for: r1v71, types: [java.lang.Object, jpj] */
    /* JADX WARN: Type inference failed for: r1v75, types: [java.lang.Object, jpk] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f31692c) {
            case 0:
                Object obj = this.f31690a;
                ?? r1 = this.f31691b;
                ipg ipgVar = (ipg) obj;
                mws mwsVar = ipgVar.f31707k;
                int size = mwsVar.size();
                int i = 0;
                while (i < size) {
                    boolean zMo3662k = ((ipk) mwsVar.get(i)).mo3662k();
                    i++;
                    if (zMo3662k) {
                        z = true;
                        r1.mo7050k(new ipf(ipgVar, r1, z));
                        return;
                    }
                }
                r1.mo7050k(new ipf(ipgVar, r1, z));
                return;
            case 1:
                Object obj2 = this.f31691b;
                Object obj3 = this.f31690a;
                Object obj4 = ((ihk) obj2).f30967b;
                jvd.m13539b();
                ine ineVar = (ine) obj4;
                Long lMo11509a = ineVar.mo11509a((Uri) obj3);
                if (lMo11509a != null) {
                    ineVar.f31582c.remove(lMo11509a.longValue());
                    synchronized (((ind) obj4).f31581b) {
                        SharedPreferences.Editor editorEdit = ((ind) obj4).f31580a.edit();
                        editorEdit.remove(((Uri) obj3).toString());
                        editorEdit.apply();
                        break;
                    }
                    return;
                }
                return;
            case 2:
                ((irg) this.f31690a).f31886j.m11615d((String) this.f31691b, null);
                return;
            case 3:
                ((ite) this.f31691b).f32061L.dispatchTouchEvent((MotionEvent) this.f31690a);
                return;
            case 4:
                ite iteVar = (ite) this.f31690a;
                iteVar.f32054E.f32174J = (mrm) this.f31691b;
                if (!iteVar.f32099d.mo6184l(dib.f11276aj)) {
                    iteVar.mo11765p();
                }
                iteVar.f32054E.mo11680j();
                return;
            case 5:
                ((ite) this.f31691b).f32062M.dispatchTouchEvent((MotionEvent) this.f31690a);
                return;
            case 6:
                ((ite) this.f31691b).f32062M.dispatchTouchEvent((MotionEvent) this.f31690a);
                return;
            case 7:
                ?? r0 = this.f31691b;
                int size2 = r0.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ixk ixkVar = (ixk) r0.get(i2);
                    Object obj5 = this.f31690a;
                    C0829mo c0829mo = ixkVar.f32566a;
                    int i3 = ixkVar.f32567b;
                    int i4 = ixkVar.f32568c;
                    int i5 = ixkVar.f32569d;
                    int i6 = ixkVar.f32570e;
                    ixl ixlVar = (ixl) obj5;
                    ViewPropertyAnimator viewPropertyAnimatorMo11842w = ixlVar.mo11842w(c0829mo, i3, i4, i5, i6);
                    ixlVar.f32580p.add(c0829mo);
                    viewPropertyAnimatorMo11842w.setDuration(((AbstractC0809lv) obj5).f39373j).setListener(new ixg(ixlVar, c0829mo, viewPropertyAnimatorMo11842w)).start();
                }
                ((ArrayList) this.f31691b).clear();
                ((ixl) this.f31690a).f32577m.remove(this.f31691b);
                return;
            case 8:
                ?? r2 = this.f31691b;
                int size3 = r2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    ixj ixjVar = (ixj) r2.get(i7);
                    Object obj6 = this.f31690a;
                    C0829mo c0829mo2 = ixjVar.f32560a;
                    View view = c0829mo2 == null ? null : c0829mo2.f41155a;
                    C0829mo c0829mo3 = ixjVar.f32561b;
                    View view2 = c0829mo3 != null ? c0829mo3.f41155a : null;
                    if (view != null) {
                        ixl ixlVar2 = (ixl) obj6;
                        ViewPropertyAnimator viewPropertyAnimatorMo11841v = ixlVar2.mo11841v(c0829mo2);
                        viewPropertyAnimatorMo11841v.setDuration(((AbstractC0809lv) obj6).f39374k);
                        ixlVar2.f32582r.add(c0829mo2);
                        viewPropertyAnimatorMo11841v.translationX(ixjVar.f32564e - ixjVar.f32562c);
                        viewPropertyAnimatorMo11841v.translationY(ixjVar.f32565f - ixjVar.f32563d);
                        viewPropertyAnimatorMo11841v.setListener(new ixh(ixlVar2, c0829mo2, viewPropertyAnimatorMo11841v, view)).start();
                    }
                    if (view2 != null) {
                        ixl ixlVar3 = (ixl) obj6;
                        ViewPropertyAnimator viewPropertyAnimatorMo11840k = ixlVar3.mo11840k(c0829mo3);
                        ixlVar3.f32582r.add(c0829mo3);
                        viewPropertyAnimatorMo11840k.translationX(0.0f).translationY(0.0f);
                        viewPropertyAnimatorMo11840k.setDuration(((AbstractC0809lv) obj6).f39374k);
                        viewPropertyAnimatorMo11840k.setListener(new ixi(ixlVar3, c0829mo3, viewPropertyAnimatorMo11840k)).start();
                    }
                }
                ((ArrayList) this.f31691b).clear();
                ((ixl) this.f31690a).f32578n.remove(this.f31691b);
                return;
            case 9:
                ?? r3 = this.f31691b;
                int size4 = r3.size();
                for (int i8 = 0; i8 < size4; i8++) {
                    C0829mo c0829mo4 = (C0829mo) r3.get(i8);
                    Object obj7 = this.f31690a;
                    ixl ixlVar4 = (ixl) obj7;
                    ViewPropertyAnimator viewPropertyAnimatorMo11835a = ixlVar4.mo11835a(c0829mo4);
                    ixlVar4.f32579o.add(c0829mo4);
                    viewPropertyAnimatorMo11835a.setDuration(((AbstractC0809lv) obj7).f39371h).setListener(new ixf(ixlVar4, c0829mo4, viewPropertyAnimatorMo11835a)).start();
                }
                ((ArrayList) this.f31691b).clear();
                ((ixl) this.f31690a).f32576g.remove(this.f31691b);
                return;
            case 10:
                ((izq) this.f31690a).f32722a.m12770c(this.f31691b);
                return;
            case 11:
                if (((izx) this.f31690a).f32740b.m11955D()) {
                    return;
                }
                ((izx) this.f31690a).f32740b.m11942w(3, "Connected to service after a timeout", null, null, null);
                izy izyVar = ((izx) this.f31690a).f32740b;
                Object obj8 = this.f31691b;
                izo.m11916a();
                izyVar.f32743c = (jap) obj8;
                izyVar.m11954C();
                izq izqVarM11926f = izyVar.m11926f();
                izo.m11916a();
                izqVarM11926f.f32722a.m12765D();
                return;
            case 12:
                izy izyVar2 = ((izx) this.f31691b).f32740b;
                Object obj9 = this.f31690a;
                izo.m11916a();
                if (izyVar2.f32743c != null) {
                    izyVar2.f32743c = null;
                    izyVar2.m11937r("Disconnected from device AnalyticsService", obj9);
                    izyVar2.m11958c();
                    return;
                }
                return;
            case 13:
                jfl jflVar = (jfl) this.f31691b;
                jfj jfjVar = (jfj) jflVar.f33888e.f33900k.get(jflVar.f33885b);
                if (jfjVar == null) {
                    return;
                }
                jcu jcuVar = (jcu) this.f31690a;
                if (!jcuVar.m12895b()) {
                    jfjVar.mo13030i(jcuVar);
                    return;
                }
                jfl jflVar2 = (jfl) this.f31691b;
                jflVar2.f33887d = true;
                if (jflVar2.f33884a.mo12947o()) {
                    ((jfl) this.f31691b).m13039c();
                    return;
                }
                try {
                    jdu jduVar = ((jfl) this.f31691b).f33884a;
                    jduVar.m12949q(null, jduVar.mo12940h());
                    return;
                } catch (SecurityException e) {
                    Log.e("GoogleApiManager", IuyLAqNmW.mqshBPUOb, e);
                    ((jfl) this.f31691b).f33884a.m12943k("Failed to get service from broker.");
                    jfjVar.mo13030i(new jcu(10));
                    return;
                }
            case 14:
                Object obj10 = this.f31691b;
                ?? r4 = this.f31690a;
                Object obj11 = ((jfx) obj10).f33921a;
                if (obj11 == null) {
                    r4.mo13121b();
                    return;
                }
                try {
                    r4.mo13120a(obj11);
                    return;
                } catch (RuntimeException e2) {
                    r4.mo13121b();
                    throw e2;
                }
            case 15:
                Object obj12 = this.f31690a;
                jpc jpcVar = (jpc) this.f31691b;
                jcu jcuVar2 = jpcVar.f34528b;
                if (jcuVar2.m12895b()) {
                    jid jidVar = jpcVar.f34529c;
                    jib.m13205j(jidVar);
                    jcu jcuVar3 = jidVar.f34115c;
                    if (!jcuVar3.m12895b()) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(String.valueOf(jcuVar3))), new Exception());
                        jgd jgdVar = (jgd) obj12;
                        jgdVar.f33950f.m13038b(jcuVar3);
                        jgdVar.f33949e.mo12942j();
                        return;
                    }
                    jgd jgdVar2 = (jgd) obj12;
                    jfl jflVar3 = jgdVar2.f33950f;
                    jhp jhpVarM13222a = jidVar.m13222a();
                    Set set = jgdVar2.f33947c;
                    if (jhpVarM13222a == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        jflVar3.m13038b(new jcu(4));
                    } else {
                        jflVar3.f33889f = jhpVarM13222a;
                        jflVar3.f33886c = set;
                        jflVar3.m13039c();
                    }
                } else {
                    ((jgd) obj12).f33950f.m13038b(jcuVar2);
                }
                ((jgd) obj12).f33949e.mo12942j();
                return;
            case 16:
                ((Activity) ((ihk) this.f31691b).f30967b).startActivity((Intent) this.f31690a);
                return;
            case 17:
                ((Activity) this.f31690a).startActivityForResult((Intent) this.f31691b, 123);
                return;
            case 18:
                if (((jpt) this.f31691b).f34565c) {
                    ((jpt) ((jph) this.f31690a).f34550a).m13464p();
                    return;
                }
                try {
                    ((jpt) ((jph) this.f31690a).f34550a).m13463o(((jph) this.f31690a).f34551b.mo13389a((jpp) this.f31691b));
                    return;
                } catch (jpo e3) {
                    if (e3.getCause() instanceof Exception) {
                        ((jpt) ((jph) this.f31690a).f34550a).m13462n((Exception) e3.getCause());
                        return;
                    } else {
                        ((jpt) ((jph) this.f31690a).f34550a).m13462n(e3);
                        return;
                    }
                } catch (Exception e4) {
                    ((jpt) ((jph) this.f31690a).f34550a).m13462n(e4);
                    return;
                }
            case 19:
                synchronized (((jph) this.f31690a).f34550a) {
                    ?? r5 = ((jph) this.f31690a).f34551b;
                    if (r5 != 0) {
                        r5.mo8108a((jpp) this.f31691b);
                    }
                    break;
                }
                return;
            default:
                synchronized (((jph) this.f31690a).f34550a) {
                    ?? r6 = ((jph) this.f31690a).f34551b;
                    if (r6 != 0) {
                        Exception excMo13449b = ((jpp) this.f31691b).mo13449b();
                        jib.m13205j(excMo13449b);
                        r6.mo11475c(excMo13449b);
                    }
                    break;
                }
                return;
        }
    }
}
