package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.sideline.SidelineInstallerService;
import com.google.android.apps.camera.smarts.SmartsChipView;
import com.google.android.apps.camera.smarts.SmartsUiGleamingView;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gxw implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f26774a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f26775b;

    public /* synthetic */ gxw(gxx gxxVar, int i) {
        this.f26775b = i;
        this.f26774a = gxxVar;
    }

    public /* synthetic */ gxw(hbv hbvVar, int i) {
        this.f26775b = i;
        this.f26774a = hbvVar;
    }

    public /* synthetic */ gxw(hcd hcdVar, int i) {
        this.f26775b = i;
        this.f26774a = hcdVar;
    }

    public /* synthetic */ gxw(hdj hdjVar, int i) {
        this.f26775b = i;
        this.f26774a = hdjVar;
    }

    public /* synthetic */ gxw(hdk hdkVar, int i) {
        this.f26775b = i;
        this.f26774a = hdkVar;
    }

    public /* synthetic */ gxw(hdp hdpVar, int i) {
        this.f26775b = i;
        this.f26774a = hdpVar;
    }

    public /* synthetic */ gxw(hec hecVar, int i) {
        this.f26775b = i;
        this.f26774a = hecVar;
    }

    public /* synthetic */ gxw(hee heeVar, int i) {
        this.f26775b = i;
        this.f26774a = heeVar;
    }

    public /* synthetic */ gxw(heh hehVar, int i) {
        this.f26775b = i;
        this.f26774a = hehVar;
    }

    public /* synthetic */ gxw(hew hewVar, int i) {
        this.f26775b = i;
        this.f26774a = hewVar;
    }

    public /* synthetic */ gxw(hfe hfeVar, int i) {
        this.f26775b = i;
        this.f26774a = hfeVar;
    }

    public /* synthetic */ gxw(hfg hfgVar, int i) {
        this.f26775b = i;
        this.f26774a = hfgVar;
    }

    public /* synthetic */ gxw(hgk hgkVar, int i) {
        this.f26775b = i;
        this.f26774a = hgkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v65, types: [hew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [hfe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v69, types: [hgd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v70, types: [hgd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r7v5, types: [hco, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [ggm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [elx, java.lang.Object] */
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
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        hew hewVar;
        ExifInterface exifInterface = null;
        int i = 0;
        switch (this.f26775b) {
            case 0:
                Object obj = this.f26774a;
                gxx gxxVar = (gxx) obj;
                gxxVar.f26778e.lock();
                try {
                    gyr gyrVar = ((gxx) obj).f26777d;
                    if (gyrVar.m10000b()) {
                        try {
                            byte[] bArrM17394h = nea.m17394h(gyrVar.m9999a());
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(bArrM17394h, 0, bArrM17394h.length, options);
                            int i2 = options.outWidth;
                            int i3 = options.outHeight;
                            try {
                                ExifInterface exifInterface2 = new ExifInterface();
                                exifInterface2.m4691r(bArrM17394h);
                                exifInterface = exifInterface2;
                            } catch (IOException e) {
                                ((gxl) obj).m9932I(VCYBIzY.EWViBGGGulEYI + e.getMessage());
                            }
                            new kbc(i2, i3);
                            hln hlnVar = new hln(krd.JPEG);
                            hlnVar.m10447a(exifInterface);
                            hlnVar.m10448b(kay.CLOCKWISE_0);
                            ((gxl) obj).mo9912r(bArrM17394h, hlnVar);
                            reentrantLock = gxxVar.f26778e;
                        } catch (IOException e2) {
                            reentrantLock = gxxVar.f26778e;
                        }
                    } else {
                        reentrantLock = gxxVar.f26778e;
                    }
                    reentrantLock.unlock();
                    return;
                } catch (Throwable th) {
                    gxxVar.f26778e.unlock();
                    throw th;
                }
            case 1:
                Object obj2 = this.f26774a;
                gxx gxxVar2 = (gxx) obj2;
                gxxVar2.f26778e.lock();
                try {
                    try {
                        File fileM9999a = ((gxx) obj2).f26777d.m9999a();
                        fileM9999a.getClass();
                        BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(nea.m17394h(fileM9999a)));
                        if (bitmapDrawable.getBitmap() == null) {
                            File fileM9999a2 = ((gxx) obj2).f26777d.m9999a();
                            fileM9999a2.getClass();
                            ((gxl) obj2).m9932I("Could not decode preview file: " + fileM9999a2.getAbsolutePath());
                        } else {
                            ((gxl) obj2).mo9893Y(bitmapDrawable.getBitmap());
                        }
                        reentrantLock2 = gxxVar2.f26778e;
                    } catch (IOException e3) {
                        File fileM9999a3 = ((gxx) obj2).f26777d.m9999a();
                        fileM9999a3.getClass();
                        ((gxl) obj2).m9932I("Could not read preview file: " + fileM9999a3.getAbsolutePath() + " " + e3.getMessage());
                        reentrantLock2 = gxxVar2.f26778e;
                    }
                    reentrantLock2.unlock();
                    return;
                } catch (Throwable th2) {
                    gxxVar2.f26778e.unlock();
                    throw th2;
                }
            case 2:
                hbv hbvVar = (hbv) this.f26774a;
                hbvVar.f27190t.m15386c(4);
                hbvVar.f27172b.stopService(new Intent(hbvVar.f27172b, (Class<?>) SidelineInstallerService.class));
                return;
            case 3:
                Object obj3 = ((kon) ((hcd) this.f26774a).f27229a.get()).f36702b;
                if (obj3 != null) {
                    ((DialogC0181ff) obj3).dismiss();
                    return;
                }
                return;
            case 4:
                kon konVar = (kon) ((hcd) this.f26774a).f27229a.get();
                if (konVar.f36702b == null) {
                    mhs mhsVar = new mhs((Context) konVar.f36701a, C0100R.style.Theme_Camera_MaterialAlertDialog_BigTitle_Centered);
                    mhsVar.m16391s(C0100R.string.installing_updates_dialog_title);
                    mhsVar.m16384l(C0100R.string.installing_updates_dialog_message);
                    C0150eb c0150eb = mhsVar.f13785a;
                    c0150eb.f13180r = null;
                    c0150eb.f13179q = C0100R.layout.installing_update_dialog;
                    mhsVar.m16383k(false);
                    konVar.f36702b = mhsVar.mo7256b();
                }
                ((DialogInterfaceC0155eg) konVar.f36702b).show();
                return;
            case 5:
                Object obj4 = this.f26774a;
                jvd.m13538a();
                hee heeVar = (hee) obj4;
                heeVar.f27442f.mo13961e("SmartUiWirer#wire");
                ReplaceableView replaceableView = (ReplaceableView) ((jfs) heeVar.f27444h).m13100f(C0100R.id.smarts_ui_replaceableview);
                Object objM13100f = ((jfs) heeVar.f27444h).m13100f(C0100R.id.smarts_ui_overlay);
                Object objM13100f2 = ((jfs) heeVar.f27444h).m13100f(C0100R.id.smarts_preview_overlay);
                ?? r7 = heeVar.f27437a;
                ?? r8 = heeVar.f27440d;
                ?? r9 = heeVar.f27443g;
                jvd.m13538a();
                hdk hdkVar = (hdk) r7;
                hdkVar.f27349y = r8;
                hdkVar.f27347w = (View) objM13100f;
                hdkVar.f27348x = (View) objM13100f2;
                hdkVar.f27348x.addOnLayoutChangeListener(new hdf(hdkVar, 0));
                try {
                    hec hecVar = ((hdk) r7).f27335k;
                    View viewInflate = LayoutInflater.from(replaceableView.getContext()).inflate(C0100R.layout.smarts_layout, (ViewGroup) replaceableView.getParent(), false);
                    replaceableView.m4509a(viewInflate);
                    FrameLayout frameLayout = (FrameLayout) viewInflate;
                    hecVar.f27425a = (SmartsChipView) frameLayout.findViewById(C0100R.id.smarts_notification_area);
                    hecVar.f27426b = (SmartsUiGleamingView) frameLayout.findViewById(C0100R.id.gleaming_view);
                    hecVar.f27427c = r8;
                    hecVar.f27428d = r9;
                    hecVar.f27429e = new HashMap();
                    hdkVar.f27338n.mo14894e(true);
                    hdj hdjVar = new hdj(hdkVar);
                    hdkVar.f27328d.m9966a(hdjVar);
                    hdkVar.f27337m.m13537d(new gto(hdkVar, hdjVar, 7));
                    hdkVar.f27337m.m13537d(hdkVar.f27323C.m10724b(r7));
                    hdkVar.f27337m.m13537d(hdkVar.f27332h.mo3830a(new gmd(hdkVar, 17), jvh.m13554b()));
                    Object obj5 = heeVar.f27438b;
                    Object obj6 = heeVar.f27439c;
                    Object obj7 = heeVar.f27441e;
                    jvd.m13538a();
                    obj7.getClass();
                    hdt hdtVar = (hdt) obj5;
                    hdtVar.f27384h = new bdv((iht) obj7, 12);
                    hdtVar.f27383g = (dbr) obj6;
                    hdtVar.f27387k = true;
                    heeVar.f27442f.mo13963g(TVkaNXnfP.lQvXSIX);
                    heeVar.f27442f.mo13962f();
                    return;
                } catch (Throwable th3) {
                    hdkVar.f27338n.mo14894e(true);
                    throw th3;
                }
            case 6:
                ((hdk) this.f26774a).f27326b.m13541c(new hde(i));
                return;
            case 7:
                hdk hdkVar2 = (hdk) this.f26774a;
                hdkVar2.f27326b.m13541c(new gxw(hdkVar2, 8));
                return;
            case 8:
                ((hdk) this.f26774a).f27345u--;
                return;
            case 9:
                hdj hdjVar2 = (hdj) this.f26774a;
                hdk hdkVar3 = hdjVar2.f27318a;
                jvd.m13538a();
                hdkVar3.m10122h(hdc.f27295d);
                hdk hdkVar4 = hdjVar2.f27318a;
                hdkVar4.f27343s++;
                hdkVar4.m10123i();
                return;
            case 10:
                hdk hdkVar5 = ((hdj) this.f26774a).f27318a;
                hdkVar5.f27343s--;
                hdkVar5.m10123i();
                return;
            case 11:
                Object obj8 = this.f26774a;
                synchronized (((hdp) obj8).f27368d) {
                    ((hdp) obj8).f27369e--;
                    break;
                }
                return;
            case 12:
                hdp hdpVar = (hdp) this.f26774a;
                hdpVar.f27367c.execute(new gxw(hdpVar, 11));
                return;
            case 13:
                ((hec) this.f26774a).f27426b.m4294a();
                return;
            case 14:
                ((hec) this.f26774a).f27426b.m4294a();
                return;
            case 15:
                heh hehVar = (heh) this.f26774a;
                if (!hehVar.f27459b.compareAndSet(true, false) || (hewVar = hehVar.f27460c) == null) {
                    return;
                }
                hewVar.mo10130a();
                return;
            case 16:
                this.f26774a.mo10130a();
                return;
            case 17:
                this.f26774a.close();
                return;
            case 18:
                hfg hfgVar = (hfg) this.f26774a;
                gyu gyuVar = hfgVar.f27552f;
                boolean zHasCallbacks = hfgVar.f27549c.hasCallbacks(hfgVar.f27550d);
                if (gyuVar == null || zHasCallbacks) {
                    hfgVar.m10195c();
                    return;
                }
                hfgVar.f27552f = null;
                hgd hgdVar = (hgd) hfgVar.f27547a.get();
                hfx hfxVar = hfgVar.f27548b;
                if (hfxVar.m10225i(hfxVar.f27640c.mo3761e(gyuVar)) == 2) {
                    hfgVar.m10195c();
                    hgdVar.mo10201j();
                    return;
                }
                boolean zIsFinishing = hfgVar.f27551e.isFinishing();
                boolean zIsDestroyed = hfgVar.f27551e.isDestroyed();
                if (zIsFinishing || zIsDestroyed) {
                    hfgVar.m10195c();
                    return;
                } else {
                    hfgVar.m10195c();
                    hgdVar.mo10198cb();
                    return;
                }
            case 19:
                this.f26774a.mo10204m();
                return;
            default:
                this.f26774a.mo10206o();
                return;
        }
    }
}
