package p000;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.HardwareBuffer;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import com.google.lens.sdk.LensApi;
import com.google.lens.sdk.PendingIntentConsumer;
import com.google.p020vr.ndk.base.DaydreamApi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kha implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f36004a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36005b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f36006c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f36007d;

    public /* synthetic */ kha(LensApi lensApi, Activity activity, nvn nvnVar, int i) {
        this.f36007d = i;
        this.f36004a = lensApi;
        this.f36006c = activity;
        this.f36005b = nvnVar;
    }

    public /* synthetic */ kha(LensApi lensApi, Bitmap bitmap, nvn nvnVar, int i) {
        this.f36007d = i;
        this.f36004a = lensApi;
        this.f36006c = bitmap;
        this.f36005b = nvnVar;
    }

    public kha(DaydreamApi daydreamApi, PendingIntent pendingIntent, ComponentName componentName, int i) {
        this.f36007d = i;
        this.f36005b = daydreamApi;
        this.f36006c = pendingIntent;
        this.f36004a = componentName;
    }

    public kha(DaydreamApi daydreamApi, Runnable runnable, PendingIntent pendingIntent, int i) {
        this.f36007d = i;
        this.f36004a = daydreamApi;
        this.f36005b = runnable;
        this.f36006c = pendingIntent;
    }

    public /* synthetic */ kha(AtomicBoolean atomicBoolean, Context context, BroadcastReceiver broadcastReceiver, int i) {
        this.f36007d = i;
        this.f36005b = atomicBoolean;
        this.f36004a = context;
        this.f36006c = broadcastReceiver;
    }

    public /* synthetic */ kha(kbo kboVar, khg khgVar, jvb jvbVar, int i) {
        this.f36007d = i;
        this.f36004a = kboVar;
        this.f36005b = khgVar;
        this.f36006c = jvbVar;
    }

    public /* synthetic */ kha(kbw kbwVar, String str, Runnable runnable, int i) {
        this.f36007d = i;
        this.f36006c = kbwVar;
        this.f36005b = str;
        this.f36004a = runnable;
    }

    public /* synthetic */ kha(khj khjVar, kex kexVar, kge kgeVar, int i) {
        this.f36007d = i;
        this.f36005b = khjVar;
        this.f36006c = kexVar;
        this.f36004a = kgeVar;
    }

    public /* synthetic */ kha(kuz kuzVar, byte[] bArr, iva ivaVar, int i) {
        this.f36007d = i;
        this.f36004a = kuzVar;
        this.f36005b = bArr;
        this.f36006c = ivaVar;
    }

    public /* synthetic */ kha(kxz kxzVar, String str, Object obj, int i) {
        this.f36007d = i;
        this.f36006c = kxzVar;
        this.f36005b = str;
        this.f36004a = obj;
    }

    public /* synthetic */ kha(kyb kybVar, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i) {
        this.f36007d = i;
        this.f36004a = kybVar;
        this.f36005b = byteBuffer;
        this.f36006c = bufferInfo;
    }

    public kha(ldn ldnVar, lgb lgbVar, kzh kzhVar, int i) {
        this.f36007d = i;
        this.f36004a = ldnVar;
        this.f36005b = lgbVar;
        this.f36006c = kzhVar;
    }

    public /* synthetic */ kha(lnt lntVar, ohb ohbVar, Executor executor, int i) {
        this.f36007d = i;
        this.f36006c = lntVar;
        this.f36004a = ohbVar;
        this.f36005b = executor;
    }

    public /* synthetic */ kha(npm npmVar, String str, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f36007d = i;
        this.f36004a = npmVar;
        this.f36005b = str;
        this.f36006c = pendingResult;
    }

    public /* synthetic */ kha(nsy nsyVar, kpw kpwVar, HardwareBuffer hardwareBuffer, int i) {
        this.f36007d = i;
        this.f36005b = nsyVar;
        this.f36004a = kpwVar;
        this.f36006c = hardwareBuffer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0304, code lost:
    
        throw r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v76, types: [android.os.Bundle, android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, ohb] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.lang.Object, kpw] */
    /* JADX WARN: Type inference failed for: r1v46, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kex] */
    /* JADX WARN: Type inference failed for: r2v36, types: [java.lang.Object, lgb] */
    /* JADX WARN: Type inference failed for: r2v38, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v43, types: [android.content.BroadcastReceiver$PendingResult] */
    /* JADX WARN: Type inference failed for: r2v57, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v61, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r9v0, types: [ktz] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kex kexVarM14856h;
        laa laaVar;
        int i = 2;
        boolean z = false;
        switch (this.f36007d) {
            case 0:
                ?? r0 = this.f36004a;
                Object obj = this.f36005b;
                Object obj2 = this.f36006c;
                r0.mo13940b("Shutdown " + String.valueOf(obj) + " started.");
                ((jvb) obj2).close();
                r0.mo13944f("Shutdown ".concat(String.valueOf(String.valueOf(obj))));
                return;
            case 1:
                kfv.m14166C(this.f36006c, (String) this.f36005b, this.f36004a);
                return;
            case 2:
                Object obj3 = this.f36005b;
                ?? r1 = this.f36006c;
                Object obj4 = this.f36004a;
                try {
                    khf khfVar = ((khj) obj3).f36024b;
                    boolean zM14190d = ((kge) obj4).m14190d();
                    boolean zM14188b = ((kge) obj4).m14188b();
                    boolean zM14189c = ((kge) obj4).m14189c();
                    synchronized (khfVar) {
                        kexVarM14856h = khfVar.f36015c.m14856h(r1, khfVar.f36013a);
                        break;
                    }
                    try {
                        kic kicVarM14322a = khfVar.f36014b.m14322a();
                        try {
                            synchronized (khfVar) {
                                kicVarM14322a.m14311e(kexVarM14856h, true);
                                break;
                            }
                            kicVarM14322a.m14309c((kge) obj4, true);
                            kicVarM14322a.close();
                            synchronized (khfVar) {
                                kir kirVarM14363b = kir.m14363b(kexVarM14856h);
                                boolean z2 = zM14190d || khfVar.f36013a.f36206a.booleanValue();
                                kirVarM14363b.f36200f = Boolean.valueOf(z2);
                                boolean z3 = zM14188b || khfVar.f36013a.f36207b.booleanValue();
                                kirVarM14363b.f36201g = Boolean.valueOf(z3);
                                if (zM14189c || khfVar.f36013a.f36208c.booleanValue()) {
                                    z = true;
                                }
                                kirVarM14363b.f36202h = Boolean.valueOf(z);
                                khfVar.m14261c(kirVarM14363b.m14365d());
                                break;
                            }
                            return;
                        } catch (Throwable th) {
                            try {
                                kicVarM14322a.close();
                                break;
                            } catch (Throwable th2) {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        synchronized (khfVar) {
                            kir kirVarM14363b2 = kir.m14363b(kexVarM14856h);
                            boolean z4 = zM14190d || khfVar.f36013a.f36206a.booleanValue();
                            kirVarM14363b2.f36200f = Boolean.valueOf(z4);
                            boolean z5 = zM14188b || khfVar.f36013a.f36207b.booleanValue();
                            kirVarM14363b2.f36201g = Boolean.valueOf(z5);
                            if (zM14189c || khfVar.f36013a.f36208c.booleanValue()) {
                                z = true;
                            }
                            kirVarM14363b2.f36202h = Boolean.valueOf(z);
                            khfVar.m14261c(kirVarM14363b2.m14365d());
                            throw th3;
                        }
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    ((khj) obj3).f36023a.mo13941c("Interrupted when calling trigger3A.", e);
                    return;
                } catch (kec e2) {
                    ((khj) obj3).f36023a.mo13941c("FrameServer was closed when calling trigger3A.", e2);
                    return;
                }
            case 3:
                Object obj5 = this.f36005b;
                Object obj6 = this.f36004a;
                Object obj7 = this.f36006c;
                int i2 = kuh.f37221a;
                if (((AtomicBoolean) obj5).compareAndSet(false, true)) {
                    ((Context) obj6).unregisterReceiver((BroadcastReceiver) obj7);
                    return;
                }
                return;
            case 4:
                Object obj8 = this.f36004a;
                Object obj9 = this.f36005b;
                Object obj10 = this.f36006c;
                kuz kuzVar = (kuz) obj8;
                int i3 = kuzVar.f37269d;
                if (i3 != 4 && i3 != 5) {
                    Log.w(hiCTUJiAxf.BuErHBKKOXVY, "ServiceEvent received after connection disposed.");
                    return;
                }
                try {
                    nxq nxqVarM18123Q = nxq.m18123Q(ivo.f32297b, (byte[]) obj9, 0, ((byte[]) obj9).length, nxf.m18011a());
                    nxq.m18132ae(nxqVarM18123Q);
                    ivo ivoVar = (ivo) nxqVarM18123Q;
                    int i4 = ivoVar.f32299a;
                    int iM13830r = jzn.m13830r(i4);
                    if (iM13830r != 0 && iM13830r == 240) {
                        ktz ktzVar = ivf.f32264a;
                        ivoVar.m18121e(ktzVar);
                        Object objM18028k = ivoVar.f44976l.m18028k((nxp) ktzVar.f37201d);
                        if (objM18028k == null) {
                            objM18028k = ktzVar.f37199b;
                        } else {
                            ktzVar.m14855g(objM18028k);
                        }
                        ivl ivlVar = (ivl) objM18028k;
                        ((kuz) obj8).f37270e = ivlVar.f32287a;
                        ivk ivkVar = ivlVar.f32288b;
                        if (ivkVar == null) {
                            ivkVar = ivk.f32278f;
                        }
                        ((kuz) obj8).f37271f = ivkVar;
                        ivj ivjVar = ivlVar.f32289c;
                        if (ivjVar == null) {
                            ivjVar = ivj.f32272c;
                        }
                        ((kuz) obj8).f37272g = ivjVar;
                        int i5 = ivlVar.f32290d;
                        ((kuz) obj8).f37273h = 2;
                        ((kuz) obj8).m14921i(5);
                        return;
                    }
                    int iM13830r2 = jzn.m13830r(i4);
                    if (iM13830r2 != 0 && iM13830r2 == 310) {
                        ((Bundle) ((iva) obj10).f32252a).getLong("session_id");
                        return;
                    }
                    kuu kuuVar = ((kuz) obj8).f37268c;
                    int iM13830r3 = jzn.m13830r(i4);
                    if (iM13830r3 != 0 && iM13830r3 == 268) {
                        Parcelable parcelable = ((iva) obj10).f32252a;
                        if (parcelable instanceof PendingIntent) {
                            PendingIntent pendingIntent = (PendingIntent) parcelable;
                            ((kut) kuuVar).f37257a.mo14914d();
                            PendingIntentConsumer pendingIntentConsumer = ((kut) kuuVar).f37258b;
                            if (pendingIntentConsumer == null) {
                                Log.e("LensServiceBridge", "PendingIntentConsumer cannot be null");
                                return;
                            } else {
                                pendingIntentConsumer.onReceivedPendingIntent(pendingIntent);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (nyb e3) {
                    Log.e(WIxTIdUIdfb.LLQPEXrmBkPU, "Unable to parse the protobuf.", e3);
                    kuzVar.f37273h = 11;
                    kuzVar.m14921i(8);
                    return;
                }
            case 5:
                ((kxz) this.f36006c).f37691b.mo14518b((String) this.f36005b, this.f36004a);
                return;
            case 6:
                Object obj11 = this.f36004a;
                Object obj12 = this.f36005b;
                Object obj13 = this.f36006c;
                kyb kybVar = (kyb) obj11;
                lku.m15613H(kybVar.f37708b.mo16813g());
                try {
                    ((kyb) obj11).f37709c.f37715f.m979g((amy) ((kyb) obj11).f37708b.mo16809c(), (ByteBuffer) obj12, (MediaCodec.BufferInfo) obj13);
                    return;
                } catch (IOException e4) {
                    kybVar.f37709c.f37712c.mo8566a(e4);
                    return;
                }
            case 7:
                ((ldn) this.f36004a).f37990a.m15187j();
                ldn ldnVar = (ldn) this.f36004a;
                lcw lcwVar = ldnVar.f37990a;
                ldi ldiVarM15205b = ldp.m15205b(ldnVar.f37991b, this.f36005b, (kzh) this.f36006c);
                synchronized (lcwVar.f37768a) {
                    laaVar = lcwVar.f37769b;
                    break;
                }
                if (laaVar != null) {
                    throw new IllegalStateException("RawCanvas was already closed");
                }
                lcwVar.f37959c.m15091a(ldiVarM15205b);
                return;
            case 8:
                kxk.m14968N(new lll((lnt) this.f36006c, (ohb) this.f36004a, 3), this.f36005b);
                return;
            case 9:
                ?? r2 = this.f36004a;
                Object obj14 = this.f36005b;
                ?? r3 = this.f36006c;
                try {
                    try {
                        kxk.m14973S(r2);
                        r3 = (BroadcastReceiver.PendingResult) r3;
                    } catch (Throwable th4) {
                        ((BroadcastReceiver.PendingResult) r3).finish();
                        throw th4;
                    }
                } catch (ExecutionException e5) {
                    Log.w(EArqVBjecl.JoXYqmbDFj, "Failed to update local snapshot for " + ((String) obj14), e5);
                    r3 = (BroadcastReceiver.PendingResult) r3;
                }
                r3.finish();
                return;
            case 10:
                Object obj15 = this.f36005b;
                ?? r4 = this.f36004a;
                Object obj16 = this.f36006c;
                synchronized (((nsy) obj15).f44456a) {
                    if (!((nsy) obj15).f44459d) {
                        ((HardwareBuffer) obj16).close();
                        ((nsy) obj15).f44459d = true;
                    }
                    if (((nsy) obj15).f44457b) {
                        r4.close();
                        ((nsy) obj15).f44458c = true;
                    }
                    break;
                }
                return;
            case 11:
                Object obj17 = this.f36004a;
                Object obj18 = this.f36006c;
                Object obj19 = this.f36005b;
                final long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                final LensApi lensApi = (LensApi) obj17;
                kut kutVar = lensApi.f8408b;
                final nvn nvnVar = (nvn) obj19;
                final Activity activity = (Activity) obj18;
                kus kusVar = new kus() { // from class: nvj
                    @Override // p000.kus
                    /* JADX INFO: renamed from: a */
                    public final void mo14904a(int i6) {
                        LensApi lensApi2 = lensApi;
                        nvn nvnVarM18465b = nvnVar;
                        long j = jElapsedRealtimeNanos;
                        Activity activity2 = activity;
                        if (i6 != 2) {
                            LensApi.m5163h(activity2);
                            return;
                        }
                        if (nvnVarM18465b.f44761c == null) {
                            ofk ofkVarM17746d = nvnVarM18465b.m17746d();
                            ofkVarM17746d.f45855c = Long.valueOf(j);
                            nvnVarM18465b = ofkVarM17746d.m18465b();
                        }
                        lensApi2.m5169d(nvnVarM18465b);
                    }
                };
                lle.m15692l();
                kutVar.m14909d(new kur(kutVar, kusVar, i));
                return;
            case 12:
                ((LensApi) this.f36004a).m5167b((Bitmap) this.f36006c, (nvn) this.f36005b);
                return;
            case 13:
                ogb ogbVar = ((DaydreamApi) this.f36005b).f8454f;
                if (ogbVar == null) {
                    Log.w("DaydreamApi", "Can't launch PendingIntent via DaydreamManager: not available.");
                    try {
                        ((PendingIntent) this.f36006c).send();
                        return;
                    } catch (Exception e6) {
                        Log.e("DaydreamApi", "Couldn't launch PendingIntent: ", e6);
                        return;
                    }
                }
                try {
                    ?? r5 = this.f36006c;
                    ?? r6 = this.f36004a;
                    Parcel parcelM3398a = ogbVar.m3398a();
                    cbs.m3404c(parcelM3398a, r5);
                    cbs.m3404c(parcelM3398a, r6);
                    Parcel parcelM3399y = ogbVar.m3399y(7, parcelM3398a);
                    cbs.m3406e(parcelM3399y);
                    parcelM3399y.recycle();
                    return;
                } catch (RemoteException e7) {
                    Log.e("DaydreamApi", "RemoteException while launching PendingIntent in VR.", e7);
                    return;
                }
            default:
                Object obj20 = this.f36004a;
                ogb ogbVar2 = ((DaydreamApi) obj20).f8454f;
                if (ogbVar2 == null) {
                    Log.w("DaydreamApi", "Failed to exit VR: Daydream service unavailable.");
                    this.f36005b.run();
                    return;
                }
                try {
                    if (((DaydreamApi) obj20).f8451c < 23) {
                        ?? r7 = this.f36006c;
                        Parcel parcelM3398a2 = ogbVar2.m3398a();
                        cbs.m3404c(parcelM3398a2, r7);
                        Parcel parcelM3399y2 = ogbVar2.m3399y(10, parcelM3398a2);
                        boolean zM3406e = cbs.m3406e(parcelM3399y2);
                        parcelM3399y2.recycle();
                        if (zM3406e) {
                            return;
                        }
                        Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                        this.f36005b.run();
                        return;
                    }
                    ?? bundle = new Bundle();
                    bundle.putParcelable("EXIT_VR_INTENT_KEY", this.f36006c);
                    bundle.putString("EXIT_VR_TEXT_KEY", null);
                    ogb ogbVar3 = ((DaydreamApi) this.f36004a).f8454f;
                    Parcel parcelM3398a3 = ogbVar3.m3398a();
                    cbs.m3404c(parcelM3398a3, bundle);
                    Parcel parcelM3399y3 = ogbVar3.m3399y(17, parcelM3398a3);
                    boolean zM3406e2 = cbs.m3406e(parcelM3399y3);
                    parcelM3399y3.recycle();
                    if (zM3406e2) {
                        return;
                    }
                    Log.w("DaydreamApi", "Failed to exit VR: Invalid request.");
                    this.f36005b.run();
                    return;
                } catch (RemoteException e8) {
                    Log.e("DaydreamApi", "Failed to exit VR: RemoteException while exiting:".concat(e8.toString()));
                    this.f36005b.run();
                    return;
                }
        }
    }
}
