package p000;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import androidx.work.Worker;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class baa implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f2837a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f2838b;

    public baa(Worker worker, int i) {
        this.f2838b = i;
        this.f2837a = worker;
    }

    public /* synthetic */ baa(ConstraintTrackingWorker constraintTrackingWorker, int i) {
        this.f2838b = i;
        this.f2837a = constraintTrackingWorker;
    }

    public /* synthetic */ baa(bab babVar, int i) {
        this.f2838b = i;
        this.f2837a = babVar;
    }

    public baa(bhd bhdVar, int i) {
        this.f2838b = i;
        this.f2837a = bhdVar;
    }

    public baa(bms bmsVar, int i) {
        this.f2838b = i;
        this.f2837a = bmsVar;
    }

    public baa(bng bngVar, int i) {
        this.f2838b = i;
        this.f2837a = bngVar;
    }

    public baa(bns bnsVar, int i) {
        this.f2838b = i;
        this.f2837a = bnsVar;
    }

    public baa(bnt bntVar, int i) {
        this.f2838b = i;
        this.f2837a = bntVar;
    }

    public baa(bnu bnuVar, int i) {
        this.f2838b = i;
        this.f2837a = bnuVar;
    }

    public baa(bok bokVar, int i) {
        this.f2838b = i;
        this.f2837a = bokVar;
    }

    public baa(bpp bppVar, int i) {
        this.f2838b = i;
        this.f2837a = bppVar;
    }

    public baa(brw brwVar, int i) {
        this.f2838b = i;
        this.f2837a = brwVar;
    }

    public /* synthetic */ baa(cby cbyVar, int i) {
        this.f2838b = i;
        this.f2837a = cbyVar;
    }

    public /* synthetic */ baa(ccc cccVar, int i) {
        this.f2838b = i;
        this.f2837a = cccVar;
    }

    public /* synthetic */ baa(cdd cddVar, int i) {
        this.f2838b = i;
        this.f2837a = cddVar;
    }

    public /* synthetic */ baa(cdv cdvVar, int i) {
        this.f2838b = i;
        this.f2837a = cdvVar;
    }

    public baa(Runnable runnable, int i) {
        this.f2838b = i;
        this.f2837a = runnable;
    }

    public /* synthetic */ baa(mhs mhsVar, int i) {
        this.f2838b = i;
        this.f2837a = mhsVar;
    }

    public /* synthetic */ baa(C1058va c1058va, int i, byte[] bArr) {
        this.f2838b = i;
        this.f2837a = c1058va;
    }

    /* JADX INFO: Infinite loop detected, blocks: 10, insns: 0 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v76, types: [bza, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v15, types: [ban, java.lang.Object] */
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
        int i;
        int i2;
        Object[] objArr = 0;
        int i3 = 3;
        int i4 = 0;
        int i5 = 1;
        int i6 = 2;
        switch (this.f2838b) {
            case 0:
                bab babVar = (bab) this.f2837a;
                if (babVar.f2844f >= 2) {
                    ayc.m2099a();
                    return;
                }
                babVar.f2844f = 2;
                ayc.m2099a();
                Context context = babVar.f2839a;
                bcj bcjVar = babVar.f2841c;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction(NptsKnlVczSZ.OrPp);
                azx.m2149f(intent, bcjVar);
                babVar.f2846h.execute(new bad(babVar.f2842d, intent, babVar.f2840b));
                if (!babVar.f2842d.f2859d.m2115e(babVar.f2841c.f2946a)) {
                    ayc.m2099a();
                    return;
                } else {
                    ayc.m2099a();
                    babVar.f2846h.execute(new bad(babVar.f2842d, azx.m2147d(babVar.f2839a, babVar.f2841c), babVar.f2840b));
                    return;
                }
            case 1:
                try {
                    ((Worker) this.f2837a).f1795a.m2285h(((Worker) this.f2837a).mo1698b());
                    return;
                } catch (Throwable th) {
                    ((Worker) this.f2837a).f1795a.m2283e(th);
                    return;
                }
            case 2:
                Object obj = this.f2837a;
                bab babVar2 = (bab) obj;
                if (babVar2.f2844f != 0) {
                    ayc.m2099a();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Already started work for ");
                    bcj bcjVar2 = babVar2.f2841c;
                    sb.append(bcjVar2);
                    bcjVar2.toString();
                    return;
                }
                babVar2.f2844f = 1;
                ayc.m2099a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("onAllConstraintsMet for ");
                bcj bcjVar3 = babVar2.f2841c;
                sb2.append(bcjVar3);
                bcjVar3.toString();
                if (!babVar2.f2842d.f2859d.m2116g(babVar2.f2849k)) {
                    babVar2.m2151a();
                    return;
                }
                bel belVar = babVar2.f2842d.f2858c;
                bcj bcjVar4 = babVar2.f2841c;
                synchronized (belVar.f3042c) {
                    ayc.m2099a();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Starting timer for ");
                    sb3.append(bcjVar4);
                    belVar.m2265a(bcjVar4);
                    bek bekVar = new bek(belVar, bcjVar4, 0);
                    belVar.f3040a.put(bcjVar4, bekVar);
                    belVar.f3041b.put(bcjVar4, obj);
                    belVar.f3043d.m2587h(600000L, bekVar);
                    break;
                }
                return;
            case 3:
                ?? r3 = this.f2837a;
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) r3;
                if (constraintTrackingWorker.f1827i.isCancelled()) {
                    return;
                }
                ayb aybVar = (ayb) r3;
                Object obj2 = aybVar.m2094aV().f2691b.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
                String str = obj2 instanceof String ? (String) obj2 : null;
                ayc.m2099a().getClass();
                if (str == null || str.length() == 0) {
                    Log.e(bez.f3077a, hiCTUJiAxf.eAgOVqxrDwmF);
                    bez.m2286a(constraintTrackingWorker.f1827i);
                    return;
                }
                constraintTrackingWorker.f1826h = aybVar.f2706d.f1800e.m2107b(aybVar.f2705c, str, constraintTrackingWorker.f1823a);
                if (constraintTrackingWorker.f1826h == null) {
                    String str2 = bez.f3077a;
                    bez.m2286a(constraintTrackingWorker.f1827i);
                    return;
                }
                azp azpVarM2125e = azp.m2125e(aybVar.f2705c);
                bcw bcwVarMo1700B = azpVarM2125e.f2782d.mo1700B();
                String string = aybVar.m2095aW().toString();
                string.getClass();
                bcv bcvVarMo2232a = bcwVarMo1700B.mo2232a(string);
                if (bcvVarMo2232a == null) {
                    bez.m2286a(constraintTrackingWorker.f1827i);
                    return;
                }
                bap bapVar = new bap(azpVarM2125e.f2787i, r3);
                bapVar.mo2166a(omn.m18666F(bcvVarMo2232a));
                String string2 = aybVar.m2095aW().toString();
                string2.getClass();
                if (!bapVar.m2168c(string2)) {
                    String str3 = bez.f3077a;
                    bez.m2287b(constraintTrackingWorker.f1827i);
                    return;
                }
                String str4 = bez.f3077a;
                try {
                    ayb aybVar2 = ((ConstraintTrackingWorker) r3).f1826h;
                    aybVar2.getClass();
                    nps npsVarMo1695a = aybVar2.mo1695a();
                    npsVarMo1695a.getClass();
                    npsVarMo1695a.mo2282d(new bey((ConstraintTrackingWorker) r3, npsVarMo1695a, i4), ((ayb) r3).m2097g());
                    return;
                } catch (Throwable th2) {
                    synchronized (constraintTrackingWorker.f1824b) {
                        if (((ConstraintTrackingWorker) r3).f1825g) {
                            bez.m2287b(((ConstraintTrackingWorker) r3).f1827i);
                            return;
                        } else {
                            bez.m2286a(((ConstraintTrackingWorker) r3).f1827i);
                            return;
                        }
                    }
                }
            case 4:
                if (((bhd) this.f2837a).f3267b == null) {
                    return;
                }
                bhb bhbVar = ((bhd) this.f2837a).f3267b;
                Object obj3 = bhbVar.f3263a;
                if (obj3 != null) {
                    ((bhd) this.f2837a).m2457b(obj3);
                    return;
                } else {
                    ((bhd) this.f2837a).m2456a(bhbVar.f3264b);
                    return;
                }
            case 5:
                bmk bmkVar = ((bms) this.f2837a).f3829c;
                if (bmkVar.f3785b) {
                    bmkVar.f3786c.f3836f.play(0);
                }
                ((bms) this.f2837a).f3830d.m1656f();
                return;
            case 6:
                ((bng) this.f2837a).f3873a.m1656f();
                return;
            case 7:
                ((bnu) this.f2837a).mo2742a().removeCallbacksAndMessages(null);
                ((bnu) this.f2837a).mo2742a().obtainMessage(2).sendToTarget();
                return;
            case 8:
                ((bns) this.f2837a).f3892a.mo2777a();
                return;
            case 9:
                synchronized (((bnt) this.f2837a).f3895b) {
                    ((bnt) this.f2837a).f3895b.notifyAll();
                    break;
                }
                return;
            case 10:
                synchronized (this.f2837a) {
                    this.f2837a.notifyAll();
                    break;
                }
                return;
            case 11:
                ?? r0 = this.f2837a;
                ((bpp) r0).f4088c.mo3200a(r0);
                return;
            case 12:
                Process.setThreadPriority(10);
                this.f2837a.run();
                return;
            case 13:
                Object obj4 = this.f2837a;
                while (true) {
                    boolean z = ((brw) obj4).f4242c;
                    try {
                        ((brw) obj4).m2963c((brv) ((brw) obj4).f4241b.remove());
                        bru bruVar = ((brw) obj4).f4243d;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 14:
                cby cbyVar = (cby) this.f2837a;
                mrm mrmVar = cbyVar.f4988d;
                if (mrmVar.mo16813g()) {
                    ((hnn) mrmVar.mo16809c()).mo10500i();
                }
                cbyVar.f4985a.mo4157o();
                cbyVar.f4986b.m10698c();
                return;
            case 15:
                ccc cccVar = (ccc) this.f2837a;
                if (cccVar.f5097o || !cccVar.f5098p || cccVar.f5084b.m10792e()) {
                    return;
                }
                kba kbaVar = cccVar.f5100r;
                if (kbaVar != null) {
                    kbaVar.close();
                }
                kba kbaVar2 = cccVar.f5101s;
                if (kbaVar2 != null) {
                    kbaVar2.close();
                }
                cccVar.f5101s = cccVar.f5096n.mo3830a(new cbx(cccVar, i6), jvh.m13554b());
                if (cccVar.f5104v.mo16813g()) {
                    ((ilv) cccVar.f5104v.mo16809c()).mo11451c();
                }
                if (cccVar.f5105w.mo16813g()) {
                    ((ilv) cccVar.f5105w.mo16809c()).mo11451c();
                }
                if (cccVar.f5106x.mo16813g()) {
                    ((ilv) cccVar.f5106x.mo16809c()).mo11451c();
                }
                if (cccVar.f5107y.mo16813g()) {
                    ((ilv) cccVar.f5107y.mo16809c()).mo11451c();
                }
                cccVar.f5099q = new jvb();
                int iIntValue = ((Integer) cccVar.f5093k.mo10031c(gzy.f27059r)).intValue();
                if (iIntValue <= 6) {
                    if (iIntValue % 3 == 0) {
                        cccVar.f5090h.m13537d(cccVar.f5088f.mo7482d(cccVar.f5091i));
                    }
                    cccVar.f5094l.mo10033e(gzy.f27059r, Integer.valueOf(iIntValue + 1));
                }
                cccVar.f5087e.mo4162t(true);
                cccVar.f5108z.m17609f(2);
                mrm mrmVar2 = cccVar.f5089g;
                if (mrmVar2.mo16813g()) {
                    ((hnn) mrmVar2.mo16809c()).mo10503l();
                    ((hnn) cccVar.f5089g.mo16809c()).mo10497f();
                }
                mrm mrmVar3 = cccVar.f5095m;
                if (mrmVar3.mo16813g()) {
                    ((hrx) mrmVar3.mo16809c()).mo10674k(hrw.TOUCH_TO_FOCUS);
                }
                if (((Boolean) cccVar.f5092j.mo3831be()).booleanValue()) {
                    cccVar.f5106x = mrm.m16829i(cccVar.f5087e.mo4150h(mrm.m16829i(cccVar.f5102t)));
                    ((ilv) cccVar.f5106x.mo16809c()).mo11450b(new ccb(cccVar, i5));
                } else {
                    cccVar.f5104v = mrm.m16829i(cccVar.f5087e.mo4148f(cccVar.f5102t));
                    ((ilv) cccVar.f5104v.mo16809c()).mo11450b(new ccb(cccVar, i4));
                }
                cdh cdhVarM10701f = cccVar.f5083a.m10701f();
                cccVar.f5103u = cccVar.f5086d.mo3426a(cccVar.f5099q, cccVar.f5085c, cccVar.f5102t, cdhVarM10701f);
                cccVar.f5100r = cdhVarM10701f.f5299a.mo3830a(new cbx(cccVar, i3), jvh.m13554b());
                return;
            case 16:
                ((cdd) this.f2837a).m3487e();
                return;
            case 17:
                ((C0154ef) this.f2837a).mo7256b().show();
                return;
            case 18:
                C1058va c1058va = (C1058va) this.f2837a;
                mhs mhsVar = new mhs((Context) c1058va.f47803b, C0100R.style.Theme_Camera_MaterialAlertDialog);
                mhsVar.m16383k(false);
                mhsVar.m16391s(C0100R.string.cant_save_photo_dialog_title);
                mhsVar.m16384l(C0100R.string.cant_save_photo_dialog_message);
                mhsVar.m16390r(((Context) c1058va.f47803b).getResources().getString(C0100R.string.dialog_ok), new cdo(c1058va, i6, (byte[]) (objArr == true ? 1 : 0)));
                mhsVar.m7257c();
                return;
            case 19:
                Object obj5 = this.f2837a;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                cdv cdvVar = (cdv) obj5;
                if (jElapsedRealtime - cdvVar.f5341b < 2000) {
                    return;
                }
                cdvVar.f5341b = jElapsedRealtime;
                cdvVar.f5340a.mo8143R();
                Intent intentM2611e = cdvVar.f5345f.m2611e();
                if (intentM2611e != null && intentM2611e.getAction() != null) {
                    switch (intentM2611e.getAction()) {
                        case "android.media.action.IMAGE_CAPTURE":
                            i = 6;
                            break;
                        case "android.media.action.STILL_IMAGE_CAMERA":
                            i = 8;
                            break;
                        case "android.media.action.VIDEO_CAMERA":
                            i = 9;
                            break;
                        case "android.media.action.VIDEO_CAPTURE":
                            i = 7;
                            break;
                        case "android.media.action.STILL_IMAGE_CAMERA_SECURE":
                            i = 10;
                            break;
                        case "android.media.action.IMAGE_CAPTURE_SECURE":
                            i = 3;
                            break;
                        case "android.intent.action.MAIN":
                            i = 2;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                } else {
                    i = 1;
                }
                if (i == 9 || i == 8 || (intentM2611e != null && cds.m3515n(intentM2611e))) {
                    if (intentM2611e.hasExtra("assistant_voice_interaction")) {
                        i2 = 9;
                    } else {
                        i2 = cds.m3513l(intentM2611e) ? 10 : 6;
                    }
                } else if (i == 10) {
                    Bundle extras = intentM2611e.getExtras();
                    if (extras != null && extras.containsKey("com.android.systemui.camera_launch_source")) {
                        String string3 = extras.getString("com.android.systemui.camera_launch_source");
                        int i7 = extras.getInt("com.android.systemui.camera_launch_source");
                        if ("power_double_tap".equals(string3) || i7 == 1) {
                            i2 = 2;
                        } else if ("lockscreen_affordance".equals(string3) || i7 == 3) {
                            i2 = 3;
                        } else {
                            i2 = ("lift_to_launch_ml".equals(string3) || i7 == 2) ? 8 : 7;
                        }
                    } else if (intentM2611e.hasExtra("assistant_voice_interaction")) {
                        i2 = 9;
                    } else {
                        i2 = cds.m3513l(intentM2611e) ? 10 : 7;
                    }
                } else if (i != 2) {
                    i2 = i != 1 ? 6 : 1;
                } else if (cdvVar.f5343d.m10425b() != 3) {
                    i2 = 4;
                } else if (cdvVar.f5342c) {
                    cdvVar.f5342c = false;
                    i2 = 11;
                } else {
                    i2 = 5;
                }
                ikw ikwVarM3505d = ikw.PHOTO;
                if (intentM2611e != null) {
                    ikwVarM3505d = intentM2611e.hasExtra("launch_unknown_mode") ? ikw.UNINITIALIZED : cds.m3505d(intentM2611e);
                }
                int iM11411e = (ikwVarM3505d.equals(ikw.PHOTO) && cds.m3516o(intentM2611e)) ? 30 : iku.m11411e(ikwVarM3505d);
                KeyguardManager keyguardManagerM5647E = cdvVar.f5346g.m5647E();
                cdvVar.f5340a.mo8175at(i, i2, iM11411e, keyguardManagerM5647E.isKeyguardLocked(), keyguardManagerM5647E.isKeyguardSecure(), cdvVar.f5343d.m10425b() == 2);
                return;
            default:
                ((cmk) this.f2837a).mo3538bd();
                return;
        }
    }
}
