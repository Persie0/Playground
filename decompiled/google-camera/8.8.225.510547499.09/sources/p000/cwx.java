package p000;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.Display;
import android.view.View;
import android.view.ViewOverlay;
import androidx.wear.ambient.AmbientMode;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwx implements nph {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f9905a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f9906b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9907c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f9908d;

    public cwx(con conVar, String str, String str2, int i) {
        this.f9908d = i;
        this.f9907c = conVar;
        this.f9906b = str;
        this.f9905a = str2;
    }

    public cwx(cwy cwyVar, kmq kmqVar, gyv gyvVar, int i) {
        this.f9908d = i;
        this.f9907c = cwyVar;
        this.f9905a = kmqVar;
        this.f9906b = gyvVar;
    }

    public cwx(eqb eqbVar, Runnable runnable, Runnable runnable2, int i) {
        this.f9908d = i;
        this.f9907c = eqbVar;
        this.f9905a = runnable;
        this.f9906b = runnable2;
    }

    public cwx(String str, Runnable runnable, gyu gyuVar, int i) {
        this.f9908d = i;
        this.f9905a = str;
        this.f9906b = runnable;
        this.f9907c = gyuVar;
    }

    public cwx(khx khxVar, Set set, Set set2, int i) {
        this.f9908d = i;
        this.f9907c = khxVar;
        this.f9905a = set;
        this.f9906b = set2;
    }

    public cwx(lud ludVar, View view, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.f9908d = i;
        this.f9905a = ludVar;
        this.f9906b = view;
        this.f9907c = pendingResult;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.nph
    /* JADX INFO: renamed from: a */
    public final void mo3810a(Throwable th) {
        switch (this.f9908d) {
            case 0:
                ((cwy) this.f9907c).m5694c((gyv) this.f9906b, th);
                return;
            case 1:
                ((nbe) ((nbe) ((nbe) con.f8470a.m17252c()).mo17283h(th)).mo17276G((char) 359)).mo17290o("Retrieving user opt in failed.");
                return;
            case 2:
                ((eqb) this.f9907c).m7675e();
                this.f9906b.run();
                ((nbe) ((nbe) ((nbe) eqc.f15099a.m17252c()).mo17283h(th)).mo17276G(1772)).mo17291p("Error executing first stage for task %s", ((eqb) this.f9907c).f15095d);
                return;
            case 3:
                ((nbe) ((nbe) ((nbe) gye.f26821a.m17252c()).mo17283h(th)).mo17276G(3368)).mo17301z("Ignoring %s for %s", this.f9905a, this.f9907c);
                return;
            case 4:
                ((khx) this.f9907c).f36107a.mo13942d("Failed to allocate pending " + this.f9906b.toString() + " this may leak");
                synchronized (this.f9907c) {
                    ((khx) this.f9907c).f36111e = false;
                    ((khx) this.f9907c).m14303e();
                    break;
                }
                return;
            default:
                Log.e(lua.f39207a, "Failed to snapshot hierarchy: ", th);
                lua.m15982a((BroadcastReceiver.PendingResult) this.f9907c);
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.Object, java.lang.Runnable] */
    @Override // p000.nph
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo3811b(Object obj) {
        int iIntValue;
        con conVar;
        BroadcastReceiver.PendingResult pendingResult;
        Method declaredMethod;
        JobInfo jobInfo = null;
        switch (this.f9908d) {
            case 0:
                kpw kpwVar = (kpw) obj;
                try {
                    Object obj2 = this.f9907c;
                    nqf nqfVar = ((cwy) obj2).f9916g;
                    cxd cxdVar = ((cwy) obj2).f9912c;
                    kay kayVar = (kay) ((jwf) ((cwy) obj2).f9910a.f9285o).f34942d;
                    Object obj3 = this.f9905a;
                    try {
                        ByteBuffer buffer = ((kpv) kpwVar.mo7251g().get(0)).getBuffer();
                        byte[] bArr = new byte[buffer.capacity()];
                        buffer.get(bArr);
                        kpwVar.close();
                        cth cthVarM5704a = cxdVar.m5704a(bArr, kayVar, (kmq) obj3);
                        cthVarM5704a.m5494c(((cwy) this.f9907c).f9914e);
                        cthVarM5704a.m5493b(System.currentTimeMillis() - ((cwy) this.f9907c).f9915f);
                        cthVarM5704a.f9434j = (gyv) this.f9906b;
                        nqfVar.mo14894e(cthVarM5704a.m5492a());
                        return;
                    } catch (Throwable th) {
                        kpwVar.close();
                        throw th;
                    }
                } catch (Exception e) {
                    ((cwy) this.f9907c).m5694c((gyv) this.f9906b, e);
                    return;
                }
            case 1:
                ((con) this.f9907c).f8473d = ((nax) obj).m17236g();
                Object obj4 = this.f9907c;
                con conVar2 = (con) obj4;
                if (!conVar2.f8473d) {
                    ((cor) obj4).m5212c();
                    return;
                }
                Context context = conVar2.f8493f;
                Class<?> cls = conVar2.f8472c.getClass();
                JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
                if (jobScheduler != null) {
                    for (JobInfo jobInfo2 : jobScheduler.getAllPendingJobs()) {
                        if (jobInfo2.getId() == 216934020) {
                            jobInfo = jobInfo2;
                            JobInfo jobInfoBuild = new JobInfo.Builder(216934020, new ComponentName(context, cls)).setPersisted(true).setRequiresCharging(true).setPeriodic(cni.f6345e).build();
                            if ((jobInfo == null && jobInfo.isRequireCharging() == jobInfoBuild.isRequireCharging() && jobInfo.getIntervalMillis() == cni.f6345e) || jobScheduler.schedule(jobInfoBuild) == 1) {
                                ((con) this.f9907c).m5208a((String) this.f9906b, 351853807);
                                iIntValue = ((con) this.f9907c).f8471b.intValue();
                                conVar = (con) this.f9907c;
                                if (iIntValue < conVar.f8474e) {
                                    conVar.m5208a((String) this.f9905a, 10281993);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    JobInfo jobInfoBuild2 = new JobInfo.Builder(216934020, new ComponentName(context, cls)).setPersisted(true).setRequiresCharging(true).setPeriodic(cni.f6345e).build();
                    if (jobInfo == null) {
                    }
                    ((con) this.f9907c).m5208a((String) this.f9906b, 351853807);
                    iIntValue = ((con) this.f9907c).f8471b.intValue();
                    conVar = (con) this.f9907c;
                    if (iIntValue < conVar.f8474e) {
                        conVar.m5208a((String) this.f9905a, 10281993);
                        return;
                    }
                    return;
                }
                ((nbe) ((nbe) con.f8470a.m17251b()).mo17276G((char) 360)).mo17290o("Fails to schedule beholder Ttl Service.");
                chz.m3792a(((con) this.f9907c).f8493f, new com());
                return;
            case 2:
                ((eqb) this.f9907c).f15098g.f15102d.execute(new epm(this, (Runnable) this.f9905a, (Runnable) this.f9906b, 2, (byte[]) null));
                return;
            case 3:
                this.f9906b.run();
                return;
            case 4:
                Set set = (Set) obj;
                synchronized (this.f9907c) {
                    ((khx) this.f9907c).f36111e = false;
                    ((khx) this.f9907c).m14300b(this.f9905a, set);
                    break;
                }
                return;
            default:
                try {
                    try {
                        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                        lpe lpeVar = new lpe((byte[]) null);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                        try {
                            xmlSerializerNewSerializer.setOutput(gZIPOutputStream, "UTF-8");
                            Object obj5 = this.f9905a;
                            Object obj6 = this.f9906b;
                            obj6.getClass();
                            xmlSerializerNewSerializer.getClass();
                            long jNanoTime = System.nanoTime();
                            try {
                                declaredMethod = ViewOverlay.class.getDeclaredMethod("getOverlayView", new Class[0]);
                                declaredMethod.setAccessible(true);
                                break;
                            } catch (NoSuchMethodException e2) {
                                Log.w(lud.f39212a, "Can't access ViewOverlay, run \"adb shell settings put global hidden_api_policy 0\" to access more view properties, see https://developer.android.com/guide/app-compatibility/restrictions-non-sdk-interfaces#how_can_i_enable_access_to_non-sdk_interfaces");
                                declaredMethod = null;
                            }
                            ((lud) obj5).f39214c = declaredMethod;
                            for (AmbientMode.AmbientController ambientController : ((lud) obj5).f39213b) {
                            }
                            lul lulVar = new lul();
                            xmlSerializerNewSerializer.startDocument("UTF-8", true);
                            xmlSerializerNewSerializer.startTag("", "hierarchy");
                            lulVar.m16007a(WIxTIdUIdfb.YdtWxdQhjChMwy, Build.VERSION.RELEASE);
                            lulVar.m16007a("os_version_incremental", Build.VERSION.INCREMENTAL);
                            lulVar.m16010d("api_level", Build.VERSION.SDK_INT);
                            lulVar.m16007a("device", Build.DEVICE);
                            lulVar.m16007a("model", Build.MODEL);
                            lulVar.m16007a("product", Build.PRODUCT);
                            Display displayM445f = afc.m445f((View) obj6);
                            if (displayM445f != null) {
                                Point point = new Point();
                                displayM445f.getSize(point);
                                lulVar.m16010d(BcwGDRhrTsnlj.eGwXumUD, point.x);
                                lulVar.m16010d("display_height", point.y);
                                lulVar.m16010d("rotation", displayM445f.getRotation());
                            }
                            String packageName = ((View) obj6).getContext().getApplicationContext().getPackageName();
                            lulVar.m16007a("package", packageName);
                            try {
                                lulVar.m16007a("app_version", ((View) obj6).getContext().getPackageManager().getPackageInfo(packageName, 0).versionName);
                                break;
                            } catch (PackageManager.NameNotFoundException e3) {
                            }
                            lulVar.m16011e(xmlSerializerNewSerializer, null);
                            HashMap map = new HashMap();
                            ((lud) obj5).m15990b((View) obj6, map);
                            C1058va c1058va = new C1058va((short[]) null);
                            ((lud) obj5).m15991c(c1058va, (View) obj6, 0, 0, map);
                            c1058va.m19470I(xmlSerializerNewSerializer, lpeVar);
                            xmlSerializerNewSerializer.startTag("", "attributeNameMap");
                            ?? r0 = lpeVar.f38884c;
                            int size = r0.size();
                            for (int i = 0; i < size; i++) {
                                String str = (String) r0.get(i);
                                xmlSerializerNewSerializer.attribute("", (String) lpeVar.f38883b.get(str), str);
                            }
                            xmlSerializerNewSerializer.endTag("", "attributeNameMap");
                            xmlSerializerNewSerializer.endTag("", "hierarchy");
                            xmlSerializerNewSerializer.endDocument();
                            TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
                            gZIPOutputStream.close();
                            String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                            ((BroadcastReceiver.PendingResult) this.f9907c).setResultData(strEncodeToString);
                            ((BroadcastReceiver.PendingResult) this.f9907c).setResultCode(-1);
                            String str2 = lua.f39207a;
                            strEncodeToString.length();
                            pendingResult = (BroadcastReceiver.PendingResult) this.f9907c;
                            lua.m15982a(pendingResult);
                            return;
                        } catch (Throwable th2) {
                            gZIPOutputStream.close();
                            throw th2;
                        }
                    } catch (IOException e4) {
                        Log.e(lua.f39207a, "Failed to snapshot hierarchy", e4);
                        pendingResult = (BroadcastReceiver.PendingResult) this.f9907c;
                    }
                } catch (Throwable th3) {
                    lua.m15982a((BroadcastReceiver.PendingResult) this.f9907c);
                    throw th3;
                }
                break;
        }
    }
}
