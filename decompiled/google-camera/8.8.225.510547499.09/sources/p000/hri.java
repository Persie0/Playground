package p000;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.transition.Fade;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class hri implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f29291a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f29292b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f29293c;

    public /* synthetic */ hri(DisplayManager displayManager, iha ihaVar, int i) {
        this.f29293c = i;
        this.f29292b = displayManager;
        this.f29291a = ihaVar;
    }

    public /* synthetic */ hri(djq djqVar, lrh lrhVar, int i, byte[] bArr) {
        this.f29293c = i;
        this.f29292b = djqVar;
        this.f29291a = lrhVar;
    }

    public /* synthetic */ hri(hrf hrfVar, hrg hrgVar, int i) {
        this.f29293c = i;
        this.f29292b = hrfVar;
        this.f29291a = hrgVar;
    }

    public /* synthetic */ hri(hrk hrkVar, fba fbaVar, int i) {
        this.f29293c = i;
        this.f29291a = hrkVar;
        this.f29292b = fbaVar;
    }

    public /* synthetic */ hri(hrp hrpVar, kpw kpwVar, int i) {
        this.f29293c = i;
        this.f29292b = hrpVar;
        this.f29291a = kpwVar;
    }

    public /* synthetic */ hri(hst hstVar, fba fbaVar, int i) {
        this.f29293c = i;
        this.f29291a = hstVar;
        this.f29292b = fbaVar;
    }

    public /* synthetic */ hri(hst hstVar, mhc mhcVar, int i) {
        this.f29293c = i;
        this.f29292b = hstVar;
        this.f29291a = mhcVar;
    }

    public /* synthetic */ hri(hwx hwxVar, View view, int i) {
        this.f29293c = i;
        this.f29291a = hwxVar;
        this.f29292b = view;
    }

    public /* synthetic */ hri(idf idfVar, kbg kbgVar, int i) {
        this.f29293c = i;
        this.f29292b = idfVar;
        this.f29291a = kbgVar;
    }

    public /* synthetic */ hri(igt igtVar, igq igqVar, int i) {
        this.f29293c = i;
        this.f29291a = igtVar;
        this.f29292b = igqVar;
    }

    public /* synthetic */ hri(iha ihaVar, igp igpVar, int i) {
        this.f29293c = i;
        this.f29291a = ihaVar;
        this.f29292b = igpVar;
    }

    public /* synthetic */ hri(iha ihaVar, WeakReference weakReference, int i) {
        this.f29293c = i;
        this.f29292b = ihaVar;
        this.f29291a = weakReference;
    }

    public /* synthetic */ hri(ihk ihkVar, Uri uri, int i, byte[] bArr, byte[] bArr2) {
        this.f29293c = i;
        this.f29291a = ihkVar;
        this.f29292b = uri;
    }

    public /* synthetic */ hri(ijz ijzVar, MainActivityLayout mainActivityLayout, int i) {
        this.f29293c = i;
        this.f29291a = ijzVar;
        this.f29292b = mainActivityLayout;
    }

    public hri(jvd jvdVar, Runnable runnable, int i) {
        this.f29293c = i;
        this.f29292b = jvdVar;
        this.f29291a = runnable;
    }

    public /* synthetic */ hri(kbo kboVar, hlv hlvVar, int i) {
        this.f29293c = i;
        this.f29291a = kboVar;
        this.f29292b = hlvVar;
    }

    public /* synthetic */ hri(mrm mrmVar, Runnable runnable, int i) {
        this.f29293c = i;
        this.f29292b = mrmVar;
        this.f29291a = runnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [fbp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v17, types: [hxc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r1v3, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, kbg] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v43, types: [elw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v44, types: [elw, java.lang.Object] */
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
        PopupWindow popupWindow;
        View view;
        switch (this.f29293c) {
            case 0:
                ((fba) this.f29292b).m8097e(this.f29291a);
                return;
            case 1:
                ((hrf) this.f29292b).f29271f.mo7485g(this.f29291a);
                return;
            case 2:
                Object obj = this.f29292b;
                ?? r1 = this.f29291a;
                hrp hrpVar = (hrp) obj;
                hrpVar.f29333d.mo10660f(r1);
                r1.close();
                hrpVar.f29332c = false;
                return;
            case 3:
                Object obj2 = this.f29292b;
                Object obj3 = this.f29291a;
                hst hstVar = (hst) obj2;
                if (!hstVar.f29445i.canScrollVertically(1) || hstVar.f29445i.getContext().getResources().getConfiguration().orientation == 2) {
                    ((mhc) obj3).m16369a().m4808C(3);
                    return;
                }
                return;
            case 4:
                ((fba) this.f29292b).m8097e(this.f29291a);
                return;
            case 5:
                ?? r0 = this.f29291a;
                Object obj4 = this.f29292b;
                r0.mo13946h("pre-initializing indicator cache");
                ((hlv) obj4).m10451a();
                return;
            case 6:
                ?? r2 = this.f29291a;
                hxd hxdVar = new hxd((FrameLayout) jfs.m13066o((View) this.f29292b).m13100f(C0100R.id.module_layout));
                jvh.m13572t(hxdVar);
                hwx hwxVar = (hwx) r2;
                hwxVar.f29753l = hxdVar;
                hwxVar.f29753l.f29781b = r2;
                return;
            case 7:
                Object obj5 = this.f29292b;
                Object obj6 = this.f29291a;
                if (obj6 != lrh.UNSUPPORTED_FOR_USER && obj6 != lrh.UNSUPPORTED_FOR_DEVICE) {
                    djq djqVar = (djq) obj5;
                    if (!((iak) djqVar.f11793a).f30150c.mo6184l(dib.f11361co)) {
                        idq idqVar = ((iak) djqVar.f11793a).f30163p;
                        jvd.m13538a();
                        for (idw idwVar : idqVar.f30488a) {
                            if (idwVar.f30530a == gyx.MARS_STORE) {
                                idwVar.f30535f = true;
                                return;
                            }
                        }
                        return;
                    }
                    idu iduVar = ((iak) djqVar.f11793a).f30160m;
                    iduVar.getClass();
                    gyx gyxVar = gyx.MARS_STORE;
                    idv idvVar = iduVar.f30507b;
                    idw idwVarM11143b = idvVar.getItem(idvVar.m11142a(gyxVar));
                    if (idwVarM11143b.f30535f) {
                        return;
                    }
                    idwVarM11143b.f30535f = true;
                    iduVar.f30507b.notifyDataSetChanged();
                    return;
                }
                djq djqVar2 = (djq) obj5;
                if (!((iak) djqVar2.f11793a).f30150c.mo6184l(dib.f11361co)) {
                    idq idqVar2 = ((iak) djqVar2.f11793a).f30163p;
                    jvd.m13538a();
                    for (idw idwVar2 : idqVar2.f30488a) {
                        if (idwVar2.f30530a == gyx.MARS_STORE) {
                            idwVar2.f30535f = false;
                            idqVar2.m11127c(gyx.MEDIA_STORE);
                            return;
                        }
                    }
                    return;
                }
                idu iduVar2 = ((iak) djqVar2.f11793a).f30160m;
                iduVar2.getClass();
                gyx gyxVar2 = gyx.MARS_STORE;
                gyx gyxVar3 = gyx.MEDIA_STORE;
                idv idvVar2 = iduVar2.f30507b;
                idw idwVarM11143b2 = idvVar2.getItem(idvVar2.m11142a(gyxVar2));
                if (idwVarM11143b2.f30535f) {
                    idwVarM11143b2.f30535f = false;
                    idv idvVar3 = iduVar2.f30507b;
                    if (idvVar3.f30529b == gyxVar2) {
                        iduVar2.m11136b(gyxVar3);
                        return;
                    } else {
                        idvVar3.notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 8:
                Object obj7 = this.f29292b;
                ?? r3 = this.f29291a;
                nbh nbhVar = icc.f30296a;
                mrm mrmVar = (mrm) obj7;
                if (mrmVar.mo16813g()) {
                    ((Runnable) mrmVar.mo16809c()).run();
                }
                r3.run();
                return;
            case 9:
                Object obj8 = this.f29292b;
                ?? r4 = this.f29291a;
                idb idbVar = ((idf) obj8).f30425a;
                idbVar.getClass();
                r4.mo3415bf(idbVar);
                return;
            case 10:
                ((jvd) this.f29292b).execute(this.f29291a);
                return;
            case 11:
                Object obj9 = this.f29291a;
                Object obj10 = this.f29292b;
                PopupWindow popupWindow2 = ((iha) obj9).f30923f;
                if (popupWindow2 == null || !popupWindow2.isShowing()) {
                    return;
                }
                igp igpVar = (igp) obj10;
                igpVar.f30851c.execute(igpVar.f30850b);
                return;
            case 12:
                ((igt) this.f29291a).f30874i.mo7485g(this.f29292b);
                return;
            case 13:
                ((igt) this.f29291a).f30874i.mo7485g(this.f29292b);
                return;
            case 14:
                ((igt) this.f29291a).m11298b((igq) this.f29292b);
                return;
            case 15:
                ((igt) this.f29291a).m11298b((igq) this.f29292b);
                return;
            case 16:
                Object obj11 = this.f29292b;
                Object obj12 = this.f29291a;
                synchronized (((iha) obj11).f30934q) {
                    Activity activity = (Activity) ((WeakReference) obj12).get();
                    if (activity != null && !activity.isFinishing() && (popupWindow = ((iha) obj11).f30923f) != null && (view = ((iha) obj11).f30928k) != null) {
                        popupWindow.showAtLocation(view, 0, 0, 0);
                    }
                    break;
                }
                return;
            case 17:
                Object obj13 = this.f29292b;
                Object obj14 = this.f29291a;
                synchronized (((iha) obj13).f30934q) {
                    PopupWindow popupWindow3 = ((iha) obj13).f30923f;
                    Activity activity2 = (Activity) ((WeakReference) obj14).get();
                    if (activity2 != null && !activity2.isFinishing() && popupWindow3 != null) {
                        Fade fade = new Fade();
                        fade.setDuration(((iha) obj13).f30937t);
                        fade.setInterpolator(new akf());
                        popupWindow3.setExitTransition(fade);
                    }
                    break;
                }
                return;
            case 18:
                ((DisplayManager) this.f29292b).unregisterDisplayListener(((iha) this.f29291a).f30940w);
                return;
            case 19:
                ((MainActivityLayout) this.f29292b).m4478t(((ijz) this.f29291a).f31267a.f31303z);
                return;
            default:
                Object obj15 = this.f29291a;
                Object obj16 = this.f29292b;
                Object obj17 = ((ihk) obj15).f30967b;
                jvd.m13539b();
                ine ineVar = (ine) obj17;
                Uri uri = (Uri) obj16;
                if (ineVar.mo11509a(uri) == null) {
                    DownloadManager.Request request = new DownloadManager.Request(uri);
                    request.setDestinationUri(Uri.fromFile(new File(ineVar.f31583d.getExternalFilesDir(null), UUID.randomUUID().toString())));
                    if (ineVar.f31583d.checkSelfPermission("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0) {
                        request.setNotificationVisibility(2);
                    }
                    long jLongValue = Long.valueOf(ineVar.f31582c.enqueue(request)).longValue();
                    synchronized (((ind) obj17).f31581b) {
                        SharedPreferences.Editor editorEdit = ((ind) obj17).f31580a.edit();
                        editorEdit.putLong(((Uri) obj16).toString(), jLongValue);
                        editorEdit.apply();
                        break;
                    }
                    return;
                }
                return;
        }
    }
}
