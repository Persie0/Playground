package p000;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.PointF;
import android.hardware.SensorEvent;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Range;
import com.google.android.libraries.lens.lenslite.api.LinkChipResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ewo implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20657b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f20658c;

    public /* synthetic */ ewo(aea aeaVar, key keyVar, int i) {
        this.f20658c = i;
        this.f20657b = aeaVar;
        this.f20656a = keyVar;
    }

    public /* synthetic */ ewo(ewj ewjVar, Intent intent, int i) {
        this.f20658c = i;
        this.f20656a = ewjVar;
        this.f20657b = intent;
    }

    public /* synthetic */ ewo(ewp ewpVar, Intent intent, int i) {
        this.f20658c = i;
        this.f20656a = ewpVar;
        this.f20657b = intent;
    }

    public ewo(exm exmVar, byte[] bArr, int i) {
        this.f20658c = i;
        this.f20657b = exmVar;
        this.f20656a = bArr;
    }

    public /* synthetic */ ewo(ezi eziVar, Point point, int i) {
        this.f20658c = i;
        this.f20656a = eziVar;
        this.f20657b = point;
    }

    public /* synthetic */ ewo(ezi eziVar, LinkChipResult linkChipResult, int i) {
        this.f20658c = i;
        this.f20657b = eziVar;
        this.f20656a = linkChipResult;
    }

    public /* synthetic */ ewo(fdk fdkVar, idb idbVar, int i) {
        this.f20658c = i;
        this.f20657b = fdkVar;
        this.f20656a = idbVar;
    }

    public /* synthetic */ ewo(fgh fghVar, fgg fggVar, int i) {
        this.f20658c = i;
        this.f20656a = fghVar;
        this.f20657b = fggVar;
    }

    public /* synthetic */ ewo(fgs fgsVar, Range range, int i) {
        this.f20658c = i;
        this.f20656a = fgsVar;
        this.f20657b = range;
    }

    public /* synthetic */ ewo(fhh fhhVar, C1058va c1058va, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f20658c = i;
        this.f20656a = fhhVar;
        this.f20657b = c1058va;
    }

    public /* synthetic */ ewo(fkj fkjVar, SensorEvent sensorEvent, int i) {
        this.f20658c = i;
        this.f20656a = fkjVar;
        this.f20657b = sensorEvent;
    }

    public /* synthetic */ ewo(fme fmeVar, jwn jwnVar, int i) {
        this.f20658c = i;
        this.f20657b = fmeVar;
        this.f20656a = jwnVar;
    }

    public /* synthetic */ ewo(fpa fpaVar, ikw ikwVar, int i) {
        this.f20658c = i;
        this.f20657b = fpaVar;
        this.f20656a = ikwVar;
    }

    public /* synthetic */ ewo(fpj fpjVar, Uri uri, int i) {
        this.f20658c = i;
        this.f20656a = fpjVar;
        this.f20657b = uri;
    }

    public /* synthetic */ ewo(fto ftoVar, gyu gyuVar, int i) {
        this.f20658c = i;
        this.f20657b = ftoVar;
        this.f20656a = gyuVar;
    }

    public /* synthetic */ ewo(glk glkVar, fmy fmyVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f20658c = i;
        this.f20657b = glkVar;
        this.f20656a = fmyVar;
    }

    public /* synthetic */ ewo(nps npsVar, String str, int i) {
        this.f20658c = i;
        this.f20657b = npsVar;
        this.f20656a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.google.android.libraries.lens.lenslite.dynamicloading.DLEngineApi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v60, types: [aea, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v64, types: [fto, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r1v36, types: [com.google.android.libraries.lens.lenslite.api.LinkChipResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [idb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, key] */
    /* JADX WARN: Type inference failed for: r1v40, types: [fmy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, lex] */
    /* JADX WARN: Type inference failed for: r1v83, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r1v85, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r2v12, types: [fuc, java.lang.Object] */
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
        double d;
        switch (this.f20658c) {
            case 0:
                ((ewp) this.f20656a).startActivity((Intent) this.f20657b);
                return;
            case 1:
                Object obj = this.f20656a;
                Object obj2 = this.f20657b;
                C0086ce c0086ce = ((ComponentCallbacksC0077bw) obj).f4624z;
                if (c0086ce != null) {
                    c0086ce.m3536h((Intent) obj2, -1, null);
                    return;
                }
                throw new IllegalStateException("Fragment " + obj + " not attached to Activity");
            case 2:
                try {
                    try {
                        String str = (String) ((exm) this.f20657b).f20748E.remove(0);
                        FileOutputStream fileOutputStream = new FileOutputStream(str);
                        File file = new File(str);
                        file.toString();
                        if (Build.MODEL.startsWith("GalaxySZ")) {
                            Object obj3 = this.f20656a;
                            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray((byte[]) obj3, 0, ((byte[]) obj3).length);
                            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            bitmapDecodeByteArray.recycle();
                        } else {
                            fileOutputStream.write((byte[]) this.f20656a);
                        }
                        fileOutputStream.close();
                        Object obj4 = this.f20657b;
                        if (((exm) obj4).f20772n < ((exm) obj4).f20746C.size()) {
                            Object obj5 = this.f20657b;
                            ((eys) ((exm) obj5).f20746C.get(((exm) obj5).f20772n)).f21006b = file.getAbsolutePath();
                        }
                        int length = ((byte[]) this.f20656a).length;
                        Object obj6 = this.f20657b;
                        ((exm) obj6).f20771m.get(((exm) obj6).f20772n);
                        ((exm) this.f20657b).f20747D.remove(0);
                        try {
                            ((exm) this.f20657b).f20744A.f20729a.put(file.getAbsolutePath());
                            Object obj7 = this.f20657b;
                            ((exm) obj7).f20772n++;
                            exr exrVar = ((exm) obj7).f20749F;
                            try {
                                String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("ExposureTime");
                                if (attribute != null) {
                                    try {
                                        d = Double.parseDouble(attribute);
                                    } catch (NumberFormatException e) {
                                        d = -2.0d;
                                    }
                                } else {
                                    d = -1.0d;
                                }
                                break;
                            } catch (IOException e2) {
                                d = -3.0d;
                            }
                            exrVar.f20866b = d;
                            exrVar.m8023a();
                            return;
                        } catch (InterruptedException e3) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException("Unexpected interruption");
                        }
                    } catch (IndexOutOfBoundsException e4) {
                        e4.printStackTrace();
                        return;
                    }
                } catch (FileNotFoundException e5) {
                    e5.printStackTrace();
                    return;
                } catch (IOException e6) {
                    e6.printStackTrace();
                    return;
                }
            case 3:
                Object obj8 = this.f20656a;
                Object obj9 = this.f20657b;
                ezi eziVar = (ezi) obj8;
                if (!eziVar.f21061q || !eziVar.f21062r || eziVar.f21063s <= 0 || eziVar.f21064t <= 0) {
                    return;
                }
                Point point = (Point) obj9;
                eziVar.f21043C.f47803b.setPointOfInterest(new PointF(point.x / eziVar.f21063s, point.y / eziVar.f21064t));
                return;
            case 4:
                Object obj10 = this.f20657b;
                this.f20656a.getId();
                ((ezi) obj10).f21067w = mqu.f41450a;
                return;
            case 5:
                ((fdk) this.f20657b).f21441c.m11105g(this.f20656a);
                return;
            case 6:
                ?? r0 = this.f20657b;
                ?? r1 = this.f20656a;
                r0.mo309a(r1);
                r1.close();
                return;
            case 7:
                glk glkVar = (glk) this.f20657b;
                this.f20656a.mo8590c(glkVar.f25501b, (flz) glkVar.f25500a, new fug(), (fvu) glkVar.f25502c, false, false, new hkz(ffn.f21702a, new kbx()));
                return;
            case 8:
                ?? r2 = this.f20657b;
                Object obj11 = this.f20656a;
                nbh nbhVar = fgh.f21843a;
                r2.mo8736f((gyu) obj11);
                return;
            case 9:
                Object obj12 = this.f20656a;
                fgg fggVar = (fgg) this.f20657b;
                if (fggVar.f21831k.get()) {
                    return;
                }
                ((nbe) ((nbe) fgh.f21843a.m17251b()).mo17276G(2213)).mo17293r("Long Shot with uri %s timed out.", fggVar.f21821a);
                ((fgh) obj12).f21858j.mo8423b();
                return;
            case 10:
                ((fgs) this.f20656a).m8403c((Range) this.f20657b);
                return;
            case 11:
                ((fgs) this.f20656a).m8403c((Range) this.f20657b);
                return;
            case 12:
                Object obj13 = this.f20656a;
                Object obj14 = this.f20657b;
                fhh fhhVar = (fhh) obj13;
                if (fhhVar.f21976a.mo16813g()) {
                    ((dyc) fhhVar.f21976a.mo16809c()).m6919b();
                    fhhVar.f21980e.set(0L);
                }
                nps npsVarMo15275a = obj14 != null ? ((C1058va) obj14).f47804c.mo15275a() : kxk.m14965K(null);
                flu.m8558a("AudioTrackSampler", npsVarMo15275a);
                npsVarMo15275a.mo2282d(new fdo(fhhVar, 16), not.INSTANCE);
                return;
            case 13:
                ?? r3 = this.f20657b;
                Object obj15 = this.f20656a;
                try {
                    kxk.m14973S(r3);
                    return;
                } catch (Throwable th) {
                    if (th instanceof CancellationException) {
                        return;
                    }
                    ((nbe) ((nbe) ((nbe) fhx.f22082a.m17252c()).mo17283h(th)).mo17276G((char) 2312)).mo17293r("%s: muxer result failed", obj15);
                    return;
                }
            case 14:
                Object obj16 = this.f20656a;
                Object obj17 = this.f20657b;
                synchronized (obj16) {
                    if (((fkj) obj16).f22376b.m11529e((SensorEvent) obj17)) {
                        ((fkj) obj16).f22377c = mrm.m16829i(Long.valueOf(((SensorEvent) obj17).timestamp));
                    }
                    if (((fkj) obj16).f22377c.mo16813g()) {
                        if (((Long) ((fkj) obj16).f22377c.mo16809c()).longValue() - ((fkj) obj16).f22380f.mo6735b() > 33333333) {
                            ((fkj) obj16).m8509b();
                        }
                        if (((Long) ((fkj) obj16).f22377c.mo16809c()).longValue() - ((fkj) obj16).f22379e.mo6735b() > 33333333) {
                            ((fkj) obj16).m8510e();
                        }
                        return;
                    }
                    return;
                }
            case 15:
                Object obj18 = this.f20657b;
                ?? r4 = this.f20656a;
                fme fmeVar = (fme) obj18;
                if (fmeVar.f22551g) {
                    return;
                }
                r4.getClass();
                fmeVar.f22548d = r4;
                kba kbaVar = fmeVar.f22550f;
                if (kbaVar != null) {
                    kbaVar.close();
                }
                fmeVar.f22550f = r4.mo3830a(new euz(fmeVar, 18), fmeVar.f22546b);
                return;
            case 16:
                Object obj19 = this.f20657b;
                ?? r5 = this.f20656a;
                fme fmeVar2 = (fme) obj19;
                if (fmeVar2.f22551g) {
                    return;
                }
                r5.getClass();
                fmeVar2.f22547c = r5;
                kba kbaVar2 = fmeVar2.f22549e;
                if (kbaVar2 != null) {
                    kbaVar2.close();
                }
                fmeVar2.f22549e = r5.mo3830a(new euz(fmeVar2, 17), fmeVar2.f22546b);
                return;
            case 17:
                fpa fpaVar = (fpa) this.f20657b;
                fpaVar.m8658w((chw) fpaVar.f23003e.get(), (ikw) this.f20656a);
                return;
            case 18:
                fpa fpaVar2 = (fpa) this.f20657b;
                fpaVar2.m8658w((chw) fpaVar2.f23002d.get(), (ikw) this.f20656a);
                return;
            case 19:
                fpa fpaVar3 = (fpa) this.f20657b;
                fpaVar3.m8658w((chw) fpaVar3.f23001c.get(), (ikw) this.f20656a);
                return;
            default:
                Object obj20 = this.f20656a;
                Object obj21 = this.f20657b;
                try {
                    ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(lro.m15916a((Context) ((fpj) obj20).f23090j.f23774k, (Uri) obj21, "wt").getParcelFileDescriptor());
                    try {
                        autoCloseOutputStream.flush();
                        autoCloseOutputStream.close();
                    } catch (Throwable th2) {
                        try {
                            autoCloseOutputStream.close();
                            break;
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                                break;
                            } catch (Exception e7) {
                            }
                        }
                        throw th2;
                    }
                } catch (IOException e8) {
                    ((nbe) ((nbe) ((nbe) fpj.f23082b.m17251b()).mo17283h(e8)).mo17276G((char) 2457)).mo17293r("Failed to truncate contents of %s", obj21);
                }
                ((fpj) obj20).f23087g = mqu.f41450a;
                return;
        }
    }
}
