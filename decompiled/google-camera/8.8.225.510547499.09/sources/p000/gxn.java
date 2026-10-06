package p000;

import android.app.Activity;
import android.app.job.JobParameters;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.views.CutoutBar;
import com.google.android.apps.camera.p014ui.views.FrontLensIndicatorOverlay;
import com.google.android.apps.camera.p014ui.views.MainActivityLayout;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.lens.sdk.LensApi;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gxn implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f26732a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f26733b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f26734c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f26735d;

    public /* synthetic */ gxn(Bitmap bitmap, File file, gyh gyhVar, int i) {
        this.f26735d = i;
        this.f26732a = bitmap;
        this.f26733b = file;
        this.f26734c = gyhVar;
    }

    public /* synthetic */ gxn(MainActivityLayout mainActivityLayout, Size size, Integer num, int i) {
        this.f26735d = i;
        this.f26734c = mainActivityLayout;
        this.f26732a = size;
        this.f26733b = num;
    }

    public /* synthetic */ gxn(MainActivityLayout mainActivityLayout, ilf ilfVar, ilk ilkVar, int i) {
        this.f26735d = i;
        this.f26732a = mainActivityLayout;
        this.f26734c = ilfVar;
        this.f26733b = ilkVar;
    }

    public /* synthetic */ gxn(dsx dsxVar, htb htbVar, fvu fvuVar, int i, byte[] bArr, byte[] bArr2) {
        this.f26735d = i;
        this.f26732a = dsxVar;
        this.f26733b = htbVar;
        this.f26734c = fvuVar;
    }

    public /* synthetic */ gxn(gxo gxoVar, byte[] bArr, gyj gyjVar, int i) {
        this.f26735d = i;
        this.f26732a = gxoVar;
        this.f26733b = bArr;
        this.f26734c = gyjVar;
    }

    public /* synthetic */ gxn(gye gyeVar, gyu gyuVar, kbb kbbVar, int i) {
        this.f26735d = i;
        this.f26732a = gyeVar;
        this.f26734c = gyuVar;
        this.f26733b = kbbVar;
    }

    public /* synthetic */ gxn(gye gyeVar, Consumer consumer, gyu gyuVar, int i) {
        this.f26735d = i;
        this.f26732a = gyeVar;
        this.f26733b = consumer;
        this.f26734c = gyuVar;
    }

    public /* synthetic */ gxn(hdk hdkVar, hes hesVar, het hetVar, int i) {
        this.f26735d = i;
        this.f26732a = hdkVar;
        this.f26734c = hesVar;
        this.f26733b = hetVar;
    }

    public /* synthetic */ gxn(hsq hsqVar, View view, jvb jvbVar, int i, byte[] bArr) {
        this.f26735d = i;
        this.f26734c = hsqVar;
        this.f26732a = view;
        this.f26733b = jvbVar;
    }

    public /* synthetic */ gxn(hst hstVar, View view, View view2, int i) {
        this.f26735d = i;
        this.f26733b = hstVar;
        this.f26732a = view;
        this.f26734c = view2;
    }

    public /* synthetic */ gxn(iad iadVar, Bitmap bitmap, ofk ofkVar, int i, byte[] bArr) {
        this.f26735d = i;
        this.f26734c = iadVar;
        this.f26732a = bitmap;
        this.f26733b = ofkVar;
    }

    public /* synthetic */ gxn(ihk ihkVar, jar jarVar, JobParameters jobParameters, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f26735d = i;
        this.f26733b = ihkVar;
        this.f26734c = jarVar;
        this.f26732a = jobParameters;
    }

    public /* synthetic */ gxn(ijm ijmVar, View view, jfs jfsVar, int i, byte[] bArr, byte[] bArr2) {
        this.f26735d = i;
        this.f26734c = ijmVar;
        this.f26732a = view;
        this.f26733b = jfsVar;
    }

    public /* synthetic */ gxn(iqu iquVar, String str, Runnable runnable, int i) {
        this.f26735d = i;
        this.f26732a = iquVar;
        this.f26733b = str;
        this.f26734c = runnable;
    }

    public gxn(jfu jfuVar, LifecycleCallback lifecycleCallback, int i) {
        this.f26735d = i;
        this.f26734c = jfuVar;
        this.f26732a = lifecycleCallback;
        this.f26733b = "ConnectionlessLifecycleHelper";
    }

    public gxn(jgf jgfVar, LifecycleCallback lifecycleCallback, int i) {
        this.f26735d = i;
        this.f26734c = jgfVar;
        this.f26732a = lifecycleCallback;
        this.f26733b = "ConnectionlessLifecycleHelper";
    }

    public /* synthetic */ gxn(jwf jwfVar, hsg hsgVar, List list, int i) {
        this.f26735d = i;
        this.f26734c = jwfVar;
        this.f26732a = hsgVar;
        this.f26733b = list;
    }

    public /* synthetic */ gxn(jww jwwVar, jww jwwVar2, jww jwwVar3, int i) {
        this.f26735d = i;
        this.f26732a = jwwVar;
        this.f26734c = jwwVar2;
        this.f26733b = jwwVar3;
    }

    public /* synthetic */ gxn(oju ojuVar, jvd jvdVar, fba fbaVar, int i) {
        this.f26735d = i;
        this.f26733b = ojuVar;
        this.f26734c = jvdVar;
        this.f26732a = fbaVar;
    }

    public /* synthetic */ gxn(oju ojuVar, mrm mrmVar, oju ojuVar2, int i) {
        this.f26735d = i;
        this.f26734c = ojuVar;
        this.f26732a = mrmVar;
        this.f26733b = ojuVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v29, types: [hes, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v72, types: [ilf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [gyh, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        int i = 3;
        int i2 = 4;
        switch (this.f26735d) {
            case 0:
                Object obj = this.f26732a;
                Object obj2 = this.f26733b;
                Object obj3 = this.f26734c;
                try {
                    kxk.m15015h((byte[]) obj2, ((gyj) obj3).f26832a);
                    break;
                } catch (IOException e) {
                    ((gxl) obj).m9932I("finish failed: ".concat(e.toString()));
                }
                ((gyj) obj3).m9977b();
                ((gxl) obj).m9936t().m9987g();
                return;
            case 1:
                fdh.m8265e((jvd) this.f26734c, (fba) this.f26732a, (gvm) this.f26733b.get());
                return;
            case 2:
                Object obj4 = this.f26732a;
                Object obj5 = this.f26733b;
                ?? r2 = this.f26734c;
                try {
                    File parentFile = ((File) obj5).getParentFile();
                    parentFile.getClass();
                    if (!parentFile.mkdirs() && !parentFile.isDirectory()) {
                        ((nbe) ((nbe) gxq.f26739a.m17251b()).mo17276G((char) 3343)).mo17293r("Could not create directory %s", parentFile);
                        return;
                    }
                    kep kepVarM14064b = kep.m14064b();
                    kepVarM14064b.m14071g(r2.mo9898d());
                    FileOutputStream fileOutputStream = new FileOutputStream((File) obj5);
                    try {
                        ExifInterface exifInterface = kepVarM14064b.f35783a;
                        if (obj4 == null) {
                            throw new IllegalArgumentException("Argument is null");
                        }
                        ngc ngcVar = new ngc(fileOutputStream);
                        try {
                            OutputStream outputStreamM4688m = exifInterface.m4688m(ngcVar);
                            try {
                                ((Bitmap) obj4).compress(Bitmap.CompressFormat.JPEG, 90, outputStreamM4688m);
                                outputStreamM4688m.close();
                                ngcVar.flush();
                                ngcVar.close();
                                fileOutputStream.close();
                                return;
                            } catch (Throwable th) {
                                try {
                                    outputStreamM4688m.close();
                                    break;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                ngcVar.close();
                                break;
                            } catch (Throwable th4) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            fileOutputStream.close();
                            break;
                        } catch (Throwable th6) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                        }
                        throw th5;
                    }
                } catch (IOException e2) {
                    ((nbe) ((nbe) ((nbe) gxq.f26739a.m17251b()).mo17283h(e2)).mo17276G((char) 3340)).mo17293r("Couldn't save medium-res thumbnail fallback for %s", r2.mo9913s());
                    return;
                }
                ((nbe) ((nbe) ((nbe) gxq.f26739a.m17251b()).mo17283h(e2)).mo17276G((char) 3340)).mo17293r("Couldn't save medium-res thumbnail fallback for %s", r2.mo9913s());
                return;
            case 3:
                ((gye) this.f26732a).m9969d(new cwu((gyu) this.f26734c, (kbb) this.f26733b, i2));
                return;
            case 4:
                Object obj6 = this.f26732a;
                ?? r1 = this.f26733b;
                Object obj7 = this.f26734c;
                gye gyeVar = (gye) obj6;
                synchronized (gyeVar.f26822b) {
                    ((gye) obj6).m9968c(r1);
                    break;
                }
                gyeVar.f26823c.mo9924d((gyu) obj7);
                gyeVar.f26824d.remove(obj7);
                return;
            case 5:
                ?? r0 = this.f26732a;
                ?? r3 = this.f26734c;
                ?? r4 = this.f26733b;
                r0.mo3415bf(gzn.PHONE);
                r3.mo3415bf(false);
                r4.mo3415bf("");
                return;
            case 6:
                Object obj8 = this.f26732a;
                Object obj9 = this.f26733b;
                ?? r5 = this.f26734c;
                ((dsx) obj8).m6695j();
                ((htb) obj9).m10727e(r5);
                return;
            case 7:
                Object obj10 = this.f26732a;
                Object obj11 = this.f26733b;
                ?? r6 = this.f26734c;
                ((dsx) obj10).m6695j();
                ((htb) obj11).m10727e(r6);
                return;
            case 8:
                Object obj12 = this.f26732a;
                ?? r7 = this.f26734c;
                Object obj13 = this.f26733b;
                hdk hdkVar = (hdk) obj12;
                if (hdkVar.f27333i.containsKey(r7)) {
                    ((nbe) ((nbe) hdk.f27320a.m17251b()).mo17276G((char) 3480)).mo17293r("Trying to add previously added Smarts Processor %s", r7);
                    return;
                }
                het hetVar = (het) obj13;
                hdz hdzVar = new hdz(r7, hetVar);
                hdkVar.f27333i.put(r7, hdzVar);
                hdkVar.f27334j.mo13961e("smartsProcessor#init-".concat(String.valueOf(hetVar.f27483a)));
                hdzVar.f27412c = new hdx(hdzVar, new heb(hdkVar.f27335k, hetVar, r7));
                hdzVar.f27410a.mo3951b(hdzVar.f27412c);
                hdzVar.f27413d = true;
                hdzVar.f27415f.m13537d(hdzVar.f27411b.f27488f.mo3830a(new gmd(hdzVar, 18), jvh.m13554b()));
                hdkVar.f27334j.mo13962f();
                hdzVar.m10136d(hdkVar.f27339o);
                hdzVar.m10137e(hdkVar.f27340p);
                hdzVar.m10138f(hdkVar.f27342r);
                hdzVar.m10135c(hdkVar.f27344t);
                hdzVar.m10139g(hdk.m10120k((gzp) hdkVar.f27330f.mo3831be()));
                hdzVar.m10140h(((Boolean) hdkVar.f27331g.mo3831be()).booleanValue());
                kmd kmdVar = hdkVar.f27341q;
                if (kmdVar != null) {
                    hdzVar.m10133a(kmdVar);
                    return;
                }
                return;
            case 9:
                ?? r8 = this.f26734c;
                Object obj14 = this.f26732a;
                Object obj15 = this.f26733b;
                jfs jfsVar = (jfs) ((djm) r8.get()).f11789c;
                mrm mrmVar = (mrm) obj14;
                ((hgo) mrmVar.mo16809c()).mo10211f((ViewStub) jfsVar.m13100f(C0100R.id.social_root_stub), (ViewStub) jfsVar.m13100f(C0100R.id.social_share_menu_layout_stub));
                MainActivityLayout mainActivityLayout = ((iig) obj15).get().f31066c;
                hze hzeVar = (hze) mrmVar.mo16809c();
                hzd hzdVar = hzd.NONE;
                mainActivityLayout.f7253c.put(hzeVar, hzdVar);
                jvd.m13538a();
                MainActivityLayout.m4454r(mainActivityLayout.m4461a(), hzeVar, hzdVar);
                return;
            case 10:
                Object obj16 = this.f26734c;
                Object obj17 = this.f26732a;
                ?? r9 = this.f26733b;
                ((jwf) obj16).mo3415bf(obj17);
                Iterator it = r9.iterator();
                while (it.hasNext()) {
                    hsg hsgVar = (hsg) obj17;
                    ((hsh) it.next()).mo3968u(hsgVar.f29404b, hsgVar.f29405c, hsgVar.f29403a);
                }
                return;
            case 11:
                Object obj18 = this.f26733b;
                Object obj19 = this.f26732a;
                View view = (View) this.f26734c;
                hst hstVar = (hst) obj18;
                ViewGroup viewGroupM10705d = hstVar.m10705d((View) obj19, view.getContext());
                viewGroupM10705d.addView(view);
                hstVar.m10707f(viewGroupM10705d);
                mhc mhcVar = hstVar.f29440d;
                if (mhcVar != null) {
                    mhcVar.setOnDismissListener(new csq(hstVar, i));
                    hstVar.f29440d.show();
                    return;
                }
                return;
            case 12:
                Object obj20 = this.f26734c;
                Object obj21 = this.f26732a;
                Object obj22 = this.f26733b;
                iad iadVar = (iad) obj20;
                LensApi lensApiM10979e = iadVar.m10979e();
                Activity activity = iadVar.f30124b;
                nvn nvnVarM18465b = ((ofk) obj22).m18465b();
                if (lensApiM10979e.f8409c.isKeyguardLocked()) {
                    lensApiM10979e.m5168c(activity, null, new kha(lensApiM10979e, (Bitmap) obj21, nvnVarM18465b, 12));
                } else {
                    lensApiM10979e.m5167b((Bitmap) obj21, nvnVarM18465b);
                }
                System.currentTimeMillis();
                iadVar.m10979e().onPause();
                return;
            case 13:
                Object obj23 = this.f26734c;
                Object obj24 = this.f26732a;
                Object obj25 = this.f26733b;
                icp icpVar = icp.f30365a;
                hsq hsqVar = (hsq) obj23;
                Object obj26 = hsqVar.f29435b;
                igt igtVar = new igt(icpVar);
                igtVar.m11313q((View) obj24);
                igtVar.mo11305i();
                igtVar.mo11307k();
                igtVar.f30869d = 300;
                igtVar.mo11301e(new huh(hsqVar, 20, null));
                igtVar.mo11303g(new idd((icr) hsqVar.f29435b, 1), not.INSTANCE);
                igtVar.mo11300d(new fff((icr) hsqVar.f29435b, 6));
                igtVar.f30878m = 11;
                igtVar.f30874i = ((icr) hsqVar.f29435b).f30383l;
                igtVar.mo11308l();
                igtVar.f30872g = true;
                igtVar.mo11311o();
                igtVar.f30871f = true;
                ((icr) obj26).f30380i = igtVar.mo11297a();
                ((jvb) obj25).m13537d(((icr) hsqVar.f29435b).f30380i);
                return;
            case 14:
                this.f26734c.mo4159q((ilk) this.f26733b, ((MainActivityLayout) this.f26732a).m4461a().f30073i);
                return;
            case 15:
                ((MainActivityLayout) this.f26734c).m4476q((Size) this.f26732a, (Integer) this.f26733b);
                return;
            case 16:
                Object obj27 = this.f26734c;
                Object obj28 = this.f26732a;
                Object obj29 = this.f26733b;
                if (ill.m11433d((View) obj28)) {
                    jfs jfsVar2 = (jfs) obj29;
                    CutoutBar cutoutBar = (CutoutBar) jfsVar2.m13100f(C0100R.id.cutout_bar);
                    FrontLensIndicatorOverlay frontLensIndicatorOverlay = (FrontLensIndicatorOverlay) jfsVar2.m13100f(C0100R.id.front_lens_indicator_overlay);
                    gvu gvuVar = (gvu) ((ijm) obj27).f31179a.get();
                    gvuVar.f26529b = cutoutBar;
                    gvuVar.f26537j = frontLensIndicatorOverlay;
                    gvuVar.f26539l.m3529i().m13537d(gvuVar.f26535h.mo3830a(new gmd(gvuVar, i), gvuVar.f26533f));
                    gvuVar.f26539l.m3529i().m13537d(gvuVar.f26536i.mo3830a(new gmd(gvuVar, i2), not.INSTANCE));
                    return;
                }
                return;
            case 17:
                Object obj30 = this.f26732a;
                Object obj31 = this.f26733b;
                ?? r10 = this.f26734c;
                try {
                    ((iqu) obj30).f31828a = ((iqu) obj30).m11612a();
                    String str = ((iqu) obj30).f31828a;
                    if (TextUtils.isEmpty(str)) {
                        ((iqu) obj30).f31829b.mo13947i("sendMessageAsync failed because can't find node!");
                        if (r10 == 0) {
                            return;
                        }
                    } else {
                        ((iqu) obj30).m11616e(str, (String) obj31, null);
                        if (r10 == 0) {
                            return;
                        }
                    }
                    return;
                } finally {
                    if (r10 != 0) {
                        r10.run();
                    }
                }
            case 18:
                Object obj32 = this.f26733b;
                Object obj33 = this.f26734c;
                Object obj34 = this.f26732a;
                ((izr) obj33).m11936q("AnalyticsJobService processed last dispatch request");
                ((jax) ((ihk) obj32).f30967b).mo4634b((JobParameters) obj34);
                return;
            case 19:
                jfu jfuVar = (jfu) this.f26734c;
                if (jfuVar.f33916b > 0) {
                    Object obj35 = this.f26732a;
                    Bundle bundle = jfuVar.f33917c;
                    ((LifecycleCallback) obj35).mo4654d(bundle != null ? bundle.getBundle((String) this.f26733b) : null);
                }
                if (((jfu) this.f26734c).f33916b >= 2) {
                    ((LifecycleCallback) this.f26732a).mo4657i();
                }
                if (((jfu) this.f26734c).f33916b >= 3) {
                    ((jfh) this.f26732a).m13016k();
                }
                if (((jfu) this.f26734c).f33916b >= 4) {
                    ((LifecycleCallback) this.f26732a).mo4658j();
                    return;
                }
                return;
            default:
                jgf jgfVar = (jgf) this.f26734c;
                if (jgfVar.f33953b > 0) {
                    Object obj36 = this.f26732a;
                    Bundle bundle2 = jgfVar.f33954c;
                    ((LifecycleCallback) obj36).mo4654d(bundle2 != null ? bundle2.getBundle((String) this.f26733b) : null);
                }
                if (((jgf) this.f26734c).f33953b >= 2) {
                    ((LifecycleCallback) this.f26732a).mo4657i();
                }
                if (((jgf) this.f26734c).f33953b >= 3) {
                    ((jfh) this.f26732a).m13016k();
                }
                if (((jgf) this.f26734c).f33953b >= 4) {
                    ((LifecycleCallback) this.f26732a).mo4658j();
                    return;
                }
                return;
        }
    }
}
