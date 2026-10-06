package p000;

import android.database.sqlite.SQLiteException;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import com.google.googlex.gcam.BurstSpec;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apv implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f2079a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f2080b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f2081c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f2082d;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f2083e;

    public /* synthetic */ apv(cdu cduVar, jww jwwVar, cvy cvyVar, dbr dbrVar, int i, byte[] bArr) {
        this.f2083e = i;
        this.f2081c = cduVar;
        this.f2080b = jwwVar;
        this.f2082d = cvyVar;
        this.f2079a = dbrVar;
    }

    public /* synthetic */ apv(CameraActivityTiming cameraActivityTiming, dhv dhvVar, bko bkoVar, mrm mrmVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f2083e = i;
        this.f2082d = cameraActivityTiming;
        this.f2081c = dhvVar;
        this.f2079a = bkoVar;
        this.f2080b = mrmVar;
    }

    public /* synthetic */ apv(djm djmVar, dug dugVar, Sensor sensor, SensorEventListener sensorEventListener, int i, byte[] bArr, byte[] bArr2) {
        this.f2083e = i;
        this.f2080b = djmVar;
        this.f2082d = dugVar;
        this.f2081c = sensor;
        this.f2079a = sensorEventListener;
    }

    public /* synthetic */ apv(dlx dlxVar, gyv gyvVar, Instant instant, gyw gywVar, int i) {
        this.f2083e = i;
        this.f2081c = dlxVar;
        this.f2079a = gyvVar;
        this.f2080b = instant;
        this.f2082d = gywVar;
    }

    public /* synthetic */ apv(ecl eclVar, ebn ebnVar, eea eeaVar, int i) {
        this.f2083e = i;
        this.f2079a = eclVar;
        this.f2081c = ebnVar;
        this.f2082d = eeaVar;
        this.f2080b = "original";
    }

    public /* synthetic */ apv(ezi eziVar, Runnable runnable, LinkChipResult linkChipResult, kwe kweVar, int i) {
        this.f2083e = i;
        this.f2081c = eziVar;
        this.f2080b = runnable;
        this.f2079a = linkChipResult;
        this.f2082d = kweVar;
    }

    public /* synthetic */ apv(gkd gkdVar, gmc gmcVar, BurstSpec burstSpec, kfo kfoVar, int i) {
        this.f2083e = i;
        this.f2081c = gkdVar;
        this.f2079a = gmcVar;
        this.f2080b = burstSpec;
        this.f2082d = kfoVar;
    }

    public apv(C0218gp c0218gp, lqq lqqVar, MenuItem menuItem, C0225gw c0225gw, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f2083e = i;
        this.f2081c = c0218gp;
        this.f2079a = lqqVar;
        this.f2080b = menuItem;
        this.f2082d = c0225gw;
    }

    public /* synthetic */ apv(gxr gxrVar, byte[] bArr, mrm mrmVar, hln hlnVar, int i) {
        this.f2083e = i;
        this.f2081c = gxrVar;
        this.f2080b = bArr;
        this.f2082d = mrmVar;
        this.f2079a = hlnVar;
    }

    public /* synthetic */ apv(gxu gxuVar, hln hlnVar, mrm mrmVar, byte[] bArr, int i) {
        this.f2083e = i;
        this.f2081c = gxuVar;
        this.f2079a = hlnVar;
        this.f2082d = mrmVar;
        this.f2080b = bArr;
    }

    public /* synthetic */ apv(gxx gxxVar, byte[] bArr, mrm mrmVar, hln hlnVar, int i) {
        this.f2083e = i;
        this.f2081c = gxxVar;
        this.f2080b = bArr;
        this.f2082d = mrmVar;
        this.f2079a = hlnVar;
    }

    public /* synthetic */ apv(List list, bcj bcjVar, axp axpVar, WorkDatabase workDatabase, int i) {
        this.f2083e = i;
        this.f2080b = list;
        this.f2082d = bcjVar;
        this.f2081c = axpVar;
        this.f2079a = workDatabase;
    }

    public /* synthetic */ apv(Executor executor, oju ojuVar, oju ojuVar2, Executor executor2, int i) {
        this.f2083e = i;
        this.f2081c = executor;
        this.f2082d = ojuVar;
        this.f2080b = ojuVar2;
        this.f2079a = executor2;
    }

    public /* synthetic */ apv(jvb jvbVar, mrm mrmVar, oju ojuVar, kan kanVar, int i) {
        this.f2083e = i;
        this.f2081c = jvbVar;
        this.f2082d = mrmVar;
        this.f2080b = ojuVar;
        this.f2079a = kanVar;
    }

    public /* synthetic */ apv(kbz kbzVar, ohb ohbVar, ohb ohbVar2, ohb ohbVar3, int i) {
        this.f2083e = i;
        this.f2081c = kbzVar;
        this.f2079a = ohbVar;
        this.f2082d = ohbVar2;
        this.f2080b = ohbVar3;
    }

    public /* synthetic */ apv(kfk kfkVar, ohb ohbVar, ohb ohbVar2, jvb jvbVar, int i) {
        this.f2083e = i;
        this.f2079a = kfkVar;
        this.f2082d = ohbVar;
        this.f2080b = ohbVar2;
        this.f2081c = jvbVar;
    }

    public apv(oly olyVar, opx opxVar, apt aptVar, onm onmVar, int i) {
        this.f2083e = i;
        this.f2079a = olyVar;
        this.f2080b = opxVar;
        this.f2081c = aptVar;
        this.f2082d = onmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, oly] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.MenuItem, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, opx] */
    /* JADX WARN: Type inference failed for: r2v12, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v27, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r3v28, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.hardware.SensorEventListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, opx] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, onm] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, kfo] */
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
    public final void run() throws IllegalAccessException, InvocationTargetException {
        mrm mrmVarM16829i;
        byte[] bArr = null;
        int i = 2;
        int i2 = 1;
        int i3 = 0;
        switch (this.f2083e) {
            case 0:
                try {
                    ooc.m18745k(this.f2079a.minusKey(olu.f46271a), new apu((apt) this.f2081c, this.f2080b, this.f2082d, null));
                    return;
                } catch (Throwable th) {
                    this.f2080b.mo18876k(th);
                    return;
                }
            case 1:
                Object obj = this.f2079a;
                if (obj != null) {
                    ((C0218gp) this.f2081c).f25909a.f26036f = true;
                    ((C0225gw) ((lqq) obj).f39003c).m9829i(false);
                    ((C0218gp) this.f2081c).f25909a.f26036f = false;
                }
                ?? r0 = this.f2080b;
                if (r0.isEnabled() && r0.hasSubMenu()) {
                    ((C0225gw) this.f2082d).m9846z(r0, 4);
                    return;
                }
                return;
            case 2:
                ?? r1 = this.f2080b;
                Object obj2 = this.f2082d;
                Object obj3 = this.f2081c;
                Object obj4 = this.f2079a;
                int i4 = azf.f2762a;
                Iterator it = r1.iterator();
                while (it.hasNext()) {
                    ((azd) it.next()).mo2117b(((bcj) obj2).f2946a);
                }
                azf.m2120a((axp) obj3, (WorkDatabase) obj4, r1);
                return;
            case 3:
                Object obj5 = this.f2081c;
                Object obj6 = this.f2082d;
                Object obj7 = this.f2080b;
                Object obj8 = this.f2079a;
                jvb jvbVar = (jvb) obj5;
                jvbVar.m13537d(((dmy) ((mrm) obj6).mo16809c()).m6417e());
                jvbVar.m13537d(((fwt) obj7).get().mo3640c((kan) obj8));
                return;
            case 4:
                Object obj9 = this.f2082d;
                ?? r2 = this.f2081c;
                Object obj10 = this.f2079a;
                Object obj11 = this.f2080b;
                CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) obj9;
                long permissionStartupTaskTimeEndNs = 0;
                if (cameraActivityTiming.getShutterButtonFirstEnabledNs() == 0 || cameraActivityTiming.getFirstPreviewFrameRenderedNs() == 0) {
                    mrmVarM16829i = mqu.f41450a;
                } else {
                    long shutterButtonFirstEnabledNs = cameraActivityTiming.getShutterButtonFirstEnabledNs() - cameraActivityTiming.getActivityOnCreateStartNs();
                    long firstPreviewFrameRenderedNs = cameraActivityTiming.getFirstPreviewFrameRenderedNs() - cameraActivityTiming.getActivityOnCreateStartNs();
                    if (cameraActivityTiming.getPermissionStartupTaskTimeStartNs() != 0 && cameraActivityTiming.getPermissionStartupTaskTimeEndNs() != 0) {
                        permissionStartupTaskTimeEndNs = cameraActivityTiming.getPermissionStartupTaskTimeEndNs() - cameraActivityTiming.getPermissionStartupTaskTimeStartNs();
                    }
                    mrmVarM16829i = mrm.m16829i(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(Math.max(shutterButtonFirstEnabledNs, firstPreviewFrameRenderedNs) - permissionStartupTaskTimeEndNs)));
                }
                int iIntValue = ((Integer) r2.mo6173a(dib.f11377s).get()).intValue();
                int iIntValue2 = ((Integer) r2.mo6173a(dib.f11375q).get()).intValue();
                if (cameraActivityTiming.f6963c || !mrmVarM16829i.mo16813g()) {
                    return;
                }
                mrmVarM16829i.mo16809c();
                if (((Long) mrmVarM16829i.mo16809c()).longValue() >= iIntValue2) {
                    ((bko) obj10).m2632z();
                }
                if (r2.mo6184l(dib.f11326bg) || Build.TYPE.equals("user")) {
                    return;
                }
                mrm mrmVar = (mrm) obj11;
                if (!mrmVar.mo16813g() || ((Long) mrmVarM16829i.mo16809c()).longValue() < iIntValue) {
                    return;
                }
                ((dnq) mrmVar.mo16809c()).m6441b();
                return;
            case 5:
                Object obj12 = this.f2081c;
                Object obj13 = this.f2079a;
                Object obj14 = this.f2080b;
                Object obj15 = this.f2082d;
                dmh dmhVar = new dmh();
                gyv gyvVar = (gyv) obj13;
                dmhVar.f12019a = gyvVar.f26876b;
                dmhVar.f12020b = gyvVar.f26877c;
                gyu gyuVar = gyvVar.f26875a;
                gyuVar.getClass();
                dmhVar.f12027i = gyuVar.toString();
                dmhVar.f12028j = gyvVar.f26879e;
                long epochMilli = ((Instant) obj14).toEpochMilli();
                dmhVar.f12021c = epochMilli;
                dmhVar.f12025g = epochMilli;
                dmhVar.f12026h = ((gyw) obj15).name();
                try {
                    dlz dlzVar = ((dlx) obj12).f11999g;
                    ((dmf) dlzVar).f12013a.m1824l();
                    ((dmf) dlzVar).f12013a.m1825m();
                    try {
                        ((dmf) dlzVar).f12014b.m1806a(dmhVar);
                        ((dmf) dlzVar).f12013a.m1829q();
                        ((dmf) dlzVar).f12013a.m1827o();
                        ((dlx) obj12).m6379l(((gyv) obj13).f26876b, (Instant) obj14, obj13.toString() + " " + obj15.toString() + " started at " + String.valueOf(obj14));
                        return;
                    } catch (Throwable th2) {
                        ((dmf) dlzVar).f12013a.m1827o();
                        throw th2;
                    }
                } catch (SQLiteException e) {
                    ((dlx) obj12).f11996d.mo13943e(kfv.m14168E("SQLite error in startedImpl for id=%d '%s' time=%s type=%s", Long.valueOf(gyvVar.f26876b), obj13, obj14, obj15), e);
                    return;
                }
            case 6:
                Object obj16 = this.f2081c;
                ?? r3 = this.f2080b;
                Object obj17 = this.f2082d;
                Object obj18 = this.f2079a;
                cdu cduVar = (cdu) obj16;
                cvy cvyVar = (cvy) obj17;
                cduVar.m3529i().m13537d(r3.mo3830a(new dsu((AtomicReference) cvyVar.f9846c, i2), not.INSTANCE));
                cduVar.m3529i().m13537d(((dbr) obj18).mo3830a(new dsu(cvyVar, i3, bArr), not.INSTANCE));
                return;
            case 7:
                Object obj19 = this.f2080b;
                Object obj20 = this.f2082d;
                Object obj21 = this.f2081c;
                ?? r4 = this.f2079a;
                ((dug) obj20).mo6742g((Sensor) obj21);
                ((SensorManager) ((djm) obj19).f11789c).unregisterListener((SensorEventListener) r4);
                return;
            case 8:
                ((ecl) this.f2079a).m7123c((ebn) this.f2081c, mrm.m16829i(this.f2082d), egl.NONE, false, (String) this.f2080b);
                return;
            case 9:
                Object obj22 = this.f2081c;
                ?? r5 = this.f2080b;
                ?? r6 = this.f2079a;
                Object obj23 = this.f2082d;
                r5.run();
                ezi eziVar = (ezi) obj22;
                eziVar.f21042B.m9748m(r6, (kwe) obj23, 3, eziVar.f21065u);
                return;
            case 10:
                this.f2081c.execute(new epm((oju) this.f2082d, (oju) this.f2080b, (Executor) this.f2079a, 16));
                return;
            case 11:
                ?? r7 = this.f2081c;
                ?? r8 = this.f2079a;
                ?? r9 = this.f2082d;
                ?? r10 = this.f2080b;
                r7.mo13961e("MVCaptureCommand.Warmup");
                r8.get();
                r9.get();
                r10.get();
                r7.mo13962f();
                return;
            case 12:
                Object obj24 = this.f2081c;
                Object obj25 = this.f2079a;
                Object obj26 = this.f2080b;
                ?? r11 = this.f2082d;
                synchronized (((gkd) obj24).f25235a) {
                    ((gkd) obj24).f25236b.mo13961e("startPslAsync");
                    kfk kfkVar = ((gkd) obj24).f25239e;
                    ((gkd) obj24).f25236b.mo13961e("Shasta_frameServer#createFrameStream");
                    ((gkd) obj24).f25246l = kfkVar.mo14135v(((gkd) obj24).f25237c.mo9584a((gmc) obj25), ((kho) ((gkd) obj24).f25238d.mo6051a()).f36068d);
                    mxk mxkVar = ((gkd) obj24).f25246l.f36067c;
                    ((gmc) obj25).m9492a();
                    ((gkd) obj24).f25236b.mo13962f();
                    obj26.getClass();
                    ((gkd) obj24).f25235a.mo14894e(((gkd) obj24).f25244j.m9360a(((gkd) obj24).f25241g, ((gkd) obj24).f25242h, ((gkd) obj24).f25246l, r11, (BurstSpec) obj26));
                    ((gkd) obj24).f25236b.mo13962f();
                    break;
                }
                return;
            case 13:
                ?? r12 = this.f2079a;
                ?? r13 = this.f2082d;
                ?? r14 = this.f2080b;
                Object obj27 = this.f2081c;
                gmz.m9535c(r12, (Set) r13.get());
                Iterator it2 = ((Set) r14.get()).iterator();
                while (it2.hasNext()) {
                    ((jvb) obj27).m13537d(((jwn) it2.next()).mo3830a(new gmd((kfk) r12, i), not.INSTANCE));
                }
                return;
            case 14:
                Object obj28 = this.f2081c;
                Object obj29 = this.f2080b;
                Object obj30 = this.f2082d;
                Object obj31 = this.f2079a;
                try {
                    if (((gxr) obj28).f26748d.mo16813g()) {
                        kxk.m14975U(((gxl) obj28).m9938x(), new djq((gxr) obj28, 12), not.INSTANCE);
                        ((gxl) obj28).m9938x().mo16665f(((fgv) ((gxr) obj28).f26748d.mo16809c()).mo8371b((hln) obj31, new ByteArrayInputStream((byte[]) obj29), ((gxl) obj28).mo9900f(), (mrm) obj30, ((gxl) obj28).mo9898d(), ((gxl) obj28).mo9913s(), ((gxl) obj28).mo9905k()));
                        return;
                    }
                    boolean zMo16813g = ((mrm) obj30).mo16813g();
                    gyj gyjVarMo9900f = ((gxl) obj28).mo9900f();
                    if (zMo16813g) {
                        FileOutputStream fileOutputStreamMo14685e = gyjVarMo9900f.f26832a.mo14685e();
                        try {
                            OutputStream outputStreamM4688m = ((ExifInterface) ((mrm) obj30).mo16809c()).m4688m(fileOutputStreamMo14685e);
                            try {
                                bfd bfdVarM14806l = ksh.m14806l(new kse((byte[]) obj29));
                                bfd bfdVarM2301a = bfdVarM14806l == null ? bff.m2301a() : bfdVarM14806l;
                                ksh.m14804j(bfdVarM2301a, dzk.NIGHT.m6969d());
                                String[] strArr = ksd.f37109a;
                                try {
                                    bff.f3083a.m5628e("http://ns.google.com/photos/1.0/camera/", "GCamera");
                                    while (i3 < 2) {
                                        bfdVarM2301a.mo2296g("DisableSuggestedAction", new bge(512), strArr[i3], new bge());
                                        i3++;
                                    }
                                } catch (bfc e2) {
                                    Log.e("XmpUtil", "exception while appending disable suggested actions ".concat(String.valueOf(e2.getMessage())));
                                }
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                ksh.m14807m((byte[]) obj29, byteArrayOutputStream, bfdVarM2301a, (bfd) ksh.m14797c(((ExifInterface) ((mrm) obj30).mo16809c()).f7918bA).mo16812f());
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                outputStreamM4688m.write(byteArray);
                                mrm mrmVarMo7289a = ((gxr) obj28).f26747c.mo7289a(((gxl) obj28).mo9906l());
                                if (mrmVarMo7289a.mo16813g()) {
                                    egd.m7291a((byte[]) mrmVarMo7289a.mo16809c(), ((gxl) obj28).mo9907m());
                                    int i5 = ((gxl) obj28).mo9902h().f26874a;
                                    outputStreamM4688m.write((byte[]) mrmVarMo7289a.mo16809c());
                                } else {
                                    int i6 = ((gxl) obj28).mo9902h().f26874a;
                                }
                                ((gxl) obj28).mo9905k().mo10402d(byteArray.length);
                                outputStreamM4688m.close();
                                fileOutputStreamMo14685e.close();
                            } catch (Throwable th3) {
                                try {
                                    outputStreamM4688m.close();
                                    throw th3;
                                } catch (Throwable th4) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th5) {
                            try {
                                fileOutputStreamMo14685e.close();
                                throw th5;
                            } catch (Throwable th6) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th5, th6);
                                throw th5;
                            }
                        }
                    } else {
                        ((gxl) obj28).mo9905k().mo10402d(kxk.m15015h((byte[]) obj29, gyjVarMo9900f.f26832a));
                    }
                    gyjVarMo9900f.m9977b();
                    ((gxl) obj28).m9936t().m9987g();
                    ((gxl) obj28).m9938x().mo14894e(obj31);
                    return;
                } catch (IOException e3) {
                    ((gxl) obj28).m9938x().mo8566a(e3);
                    return;
                }
            case 15:
                Object obj32 = this.f2081c;
                Object obj33 = this.f2079a;
                Object obj34 = this.f2082d;
                Object obj35 = this.f2080b;
                gxu gxuVar = (gxu) obj32;
                if (gxuVar.f26758c.mo16813g()) {
                    gxl gxlVar = (gxl) obj32;
                    long jMo9898d = gxlVar.mo9898d();
                    if (gxlVar.mo9903i() == gyw.LONG_SHOT || gxlVar.mo9903i() == gyw.AUTO_LONG_SHOT) {
                        gxlVar.m9938x().mo16665f(((fgv) gxuVar.f26758c.mo16809c()).mo8370a((hln) obj33, gxlVar.mo9900f(), (mrm) obj34, jMo9898d, gxlVar.mo9905k()));
                    } else {
                        gxlVar.m9938x().mo16665f(((fgv) gxuVar.f26758c.mo16809c()).mo8371b((hln) obj33, gxuVar.m9942K(new ByteArrayInputStream(gxuVar.m9943L((byte[]) obj35))), gxlVar.mo9900f(), (mrm) obj34, jMo9898d, gxlVar.mo9913s(), gxlVar.mo9905k()));
                    }
                    gxuVar.f26758c = mqu.f41450a;
                    return;
                }
                try {
                    long jM15018k = kxk.m15018k(((gxu) obj32).m9942K(new ByteArrayInputStream(((gxu) obj32).m9943L((byte[]) obj35))), (ExifInterface) ((mrm) obj34).mo16812f(), ((gxl) obj32).mo9900f().f26832a);
                    ((gxl) obj32).mo9900f().m9977b();
                    ((gxl) obj32).mo9905k().mo10402d(jM15018k);
                    ((gxl) obj32).m9938x().mo14894e(obj33);
                    return;
                } catch (Throwable th7) {
                    gxl gxlVar2 = (gxl) obj32;
                    gxlVar2.m9932I("finish failed: ".concat(th7.toString()));
                    gxlVar2.f26723b.m9918x();
                    gxlVar2.m9938x().mo8566a(th7);
                    return;
                }
            default:
                Object obj36 = this.f2081c;
                Object obj37 = this.f2080b;
                Object obj38 = this.f2082d;
                Object obj39 = this.f2079a;
                try {
                    gyj gyjVarMo9900f2 = ((gxl) obj36).mo9900f();
                    ((gxl) obj36).mo9905k().mo10402d(kxk.m15017j((byte[]) obj37, (ExifInterface) ((mrm) obj38).mo16812f(), gyjVarMo9900f2.f26832a));
                    gyjVarMo9900f2.m9977b();
                    ((gxl) obj36).m9938x().mo14894e(obj39);
                    break;
                } catch (IOException e4) {
                    ((nbe) ((nbe) ((nbe) gxx.f26776c.m17251b()).mo17283h(e4)).mo17276G((char) 3361)).mo17290o("CameraFileUtil.writeFile() throws : ");
                    ((gxl) obj36).m9938x().mo8566a(e4);
                }
                ((gxl) obj36).m9936t().m9987g();
                return;
        }
    }
}
