package p000;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentProvider;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ProviderInfo;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.CamcorderProfile;
import android.util.ArrayMap;
import android.util.Range;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camerafatalerror.CameraFatalErrorTrackerDatabase;
import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djm {

    /* JADX INFO: renamed from: a */
    public final Object f11787a;

    /* JADX INFO: renamed from: b */
    public final Object f11788b;

    /* JADX INFO: renamed from: c */
    public final Object f11789c;

    public djm(Activity activity, ggm ggmVar, jwn jwnVar) {
        this.f11787a = activity;
        this.f11789c = ggmVar;
        this.f11788b = jwnVar;
    }

    public djm(ContentProvider contentProvider, ProviderInfo providerInfo) {
        this.f11787a = contentProvider;
        this.f11788b = providerInfo;
        Context context = contentProvider.getContext();
        context.getClass();
        this.f11789c = context;
    }

    public djm(Context context, bko bkoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f11789c = context;
        this.f11788b = (NotificationManager) context.getSystemService(NotificationManager.class);
        this.f11787a = bkoVar;
    }

    public djm(Context context, kbz kbzVar, dhv dhvVar) {
        this.f11787a = context;
        this.f11788b = kbzVar;
        this.f11789c = dhvVar;
    }

    public djm(SharedPreferences sharedPreferences, CameraFatalErrorTrackerDatabase cameraFatalErrorTrackerDatabase, cwd cwdVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f11788b = sharedPreferences;
        this.f11787a = cameraFatalErrorTrackerDatabase;
        this.f11789c = cwdVar;
    }

    public djm(SQLiteDatabase sQLiteDatabase, ksi ksiVar, Random random) {
        this.f11789c = sQLiteDatabase;
        this.f11787a = ksiVar;
        this.f11788b = random;
    }

    public djm(SQLiteDatabase sQLiteDatabase, ksi ksiVar, Random random, byte[] bArr) {
        this.f11787a = sQLiteDatabase;
        this.f11788b = ksiVar;
        this.f11789c = random;
    }

    public djm(View view) {
        this.f11788b = (ImageView) view.findViewById(C0100R.id.menu_item_icon);
        this.f11789c = (TextView) view.findViewById(C0100R.id.menu_item_title);
        this.f11787a = (TextView) view.findViewById(C0100R.id.menu_item_description);
    }

    public djm(AmbientDelegate ambientDelegate, ihk ihkVar, khb khbVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f11789c = ambientDelegate;
        this.f11788b = ihkVar;
        this.f11787a = khbVar;
    }

    public djm(dhv dhvVar, jww jwwVar, hnw hnwVar) {
        this.f11788b = dhvVar;
        this.f11787a = jwwVar;
        this.f11789c = hnwVar;
    }

    public djm(djm djmVar, cvy cvyVar, cux cuxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f11787a = djmVar;
        this.f11789c = cvyVar;
        this.f11788b = cuxVar;
    }

    public djm(fcp fcpVar, jwn jwnVar, crh crhVar) {
        this.f11788b = fcpVar;
        this.f11787a = jwnVar;
        this.f11789c = crhVar;
    }

    public djm(hah hahVar, khb khbVar, dhv dhvVar, byte[] bArr) {
        this.f11789c = hahVar;
        this.f11788b = khbVar;
        this.f11787a = dhvVar;
    }

    public djm(Class cls, Class cls2, bqt bqtVar) {
        this.f11787a = cls;
        this.f11788b = cls2;
        this.f11789c = bqtVar;
    }

    public djm(jww jwwVar, jww jwwVar2, jww jwwVar3) {
        this.f11787a = jwwVar;
        this.f11789c = jwwVar2;
        this.f11788b = jwwVar3;
    }

    public djm(jxt jxtVar, kms kmsVar) {
        this.f11787a = new HashMap();
        this.f11789c = jxtVar;
        this.f11788b = kmsVar;
    }

    public djm(kyl kylVar, AmbientMode.AmbientController ambientController, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f11789c = kylVar;
        this.f11787a = ambientController;
        this.f11788b = runnable;
    }

    public djm(kyl kylVar, AmbientMode.AmbientController ambientController, Runnable runnable, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f11789c = kylVar;
        this.f11787a = ambientController;
        this.f11788b = runnable;
    }

    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, ojy] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, our] */
    public djm(mbb mbbVar, C1058va c1058va, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        new AtomicInteger(0);
        new jwf("");
        new HashSet();
        mxk mxkVarM17137I = mxk.m17137I(lvi.IN_AIRLOCK, lvi.ENTERING_AIRLOCK);
        this.f11789c = mxkVarM17137I;
        mxk mxkVarM17136H = mxk.m17136H(new lvj(mxkVarM17137I));
        this.f11788b = mxkVarM17136H;
        new HashSet();
        this.f11787a = mbbVar;
        ooc.m18746l(oqv.m18926g((oly) ((mrm) c1058va.f47803b).mo16811e(ord.f46447b)), null, new ouw(new ovd((our) ((mav) c1058va.f47802a).f39742a, new lwn(c1058va, null, null, null, null), 3), null), 3);
        lku.m15669w(mbbVar != null);
        lku.m15669w(true);
        ooc.m18746l((oqs) mbbVar.f39760a.mo18586a(), null, new lwm(mbbVar, mxkVarM17136H, lwb.f39424a, coy.f8508a, new coy(), null, null), 3);
    }

    public djm(mrm mrmVar, dhv dhvVar, crh crhVar) {
        this.f11787a = mrmVar;
        this.f11789c = dhvVar;
        this.f11788b = crhVar;
    }

    public djm(byte[] bArr) {
        this.f11787a = new AtomicInteger(0);
        this.f11788b = new AtomicInteger(0);
        this.f11789c = new AtomicInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    private static ehu m6215H(Context context) {
        if (context instanceof eht) {
            return ((eht) context).mo4192d();
        }
        if (context instanceof ContextWrapper) {
            return m6215H(((ContextWrapper) context).getBaseContext());
        }
        throw new IllegalArgumentException("Context does not provide a Hexagon path.");
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, jxt] */
    /* JADX INFO: renamed from: I */
    private final List m6216I(kmg kmgVar, jxn jxnVar) {
        LinkedList linkedList = new LinkedList();
        for (jyd jydVar : jyd.values()) {
            jxp jxpVar = jydVar.f35144l;
            if (CamcorderProfile.hasProfile(Integer.parseInt(kmgVar.f36540a), jydVar.f35143k)) {
                if (this.f11789c.mo13668e(jzn.m13817e(kmgVar, jydVar), jxnVar, jxpVar)) {
                    linkedList.addFirst(jxpVar);
                }
            }
        }
        return linkedList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: J */
    private final boolean m6217J() {
        return ((Boolean) this.f11787a.mo3831be()).booleanValue() || this.f11788b.mo6184l(dib.f11339bt);
    }

    /* JADX INFO: renamed from: f */
    public static void m6218f(Context context) {
        File file = new File(context.getNoBackupFilesDir(), "/ff.pb");
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(context.getNoBackupFilesDir(), "/ff.pb_tmp");
        if (file2.exists()) {
            file2.delete();
        }
    }

    /* JADX INFO: renamed from: x */
    public static jgb m6219x() {
        return new jgb();
    }

    /* JADX INFO: renamed from: A */
    public final void m6220A() {
        NotificationChannel notificationChannelM6250z = m6250z();
        Notification.Builder builder = new Notification.Builder((Context) this.f11789c, notificationChannelM6250z.getId());
        String string = ((Context) this.f11789c).getString(C0100R.string.update_failed_notification_title);
        Notification.Builder contentText = builder.setSmallIcon(C0100R.drawable.ic_notification).setColor(((Context) this.f11789c).getColor(C0100R.color.update_notification_icon_color)).setContentTitle(string).setContentText(((Context) this.f11789c).getString(C0100R.string.update_failed_notification_text));
        Object obj = this.f11787a;
        contentText.setContentIntent(PendingIntent.getActivity((Context) ((bko) obj).f3652a, 0, new Intent("com.google.android.apps.betterbug.intent.FILE_BUG_DEEPLINK").addFlags(268435456).putExtra("EXTRA_DEEPLINK", true).putExtra("EXTRA_ISSUE_TITLE", string).putExtra("EXTRA_COMPONENT_ID", 43059L).putExtra("EXTRA_HAPPENED_TIME", System.currentTimeMillis()).putExtra("EXTRA_REQUIRE_BUGREPORT", true), 1140850688)).setAutoCancel(true);
        ((NotificationManager) this.f11788b).notify(70207, builder.build());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [hnw, java.lang.Object] */
    /* JADX INFO: renamed from: B */
    public final boolean m6221B() {
        return this.f11788b.mo6184l(dib.f11338bs) && m6217J() && !this.f11789c.mo10518e().m10520a(hnv.HEAT_CRITICAL);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: C */
    public final boolean m6222C() {
        return this.f11788b.mo6184l(dib.f11337br) && m6217J();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: D */
    public final void m6223D() {
        ?? r0 = this.f11788b;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: E */
    public final void m6224E(SensorEventListener sensorEventListener) {
        if (this.f11787a != null) {
            this.f11789c.execute(new gqn(this, sensorEventListener, 7, null, null, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: F */
    public final void m6225F(SensorEventListener sensorEventListener) {
        if (this.f11787a != null) {
            this.f11789c.execute(new gqn(this, sensorEventListener, 8, null, null, null));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: G */
    public final gmy m6226G() {
        dhv dhvVar = (dhv) this.f11788b.get();
        dhvVar.getClass();
        return new gmy(dhvVar, ((ikv) this.f11787a).m11415a(), ((fxj) this.f11789c).m8922a());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m6227a(dor dorVar) {
        this.f11788b.mo13948j(CswIK.TOCETET, dorVar);
        chz.m3792a((Context) this.f11787a, dorVar);
        ?? r3 = this.f11789c;
        dhx dhxVar = dib.f11240a;
        r3.mo6177e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m6228b() {
        if (this.f11788b.getBoolean("pref_key_reboot_completed", false)) {
            Object obj = this.f11787a;
            czx czxVar = new czx(this, 7, (byte[]) null);
            apt aptVar = (apt) obj;
            aptVar.m1825m();
            try {
                czxVar.run();
                ((apt) obj).m1829q();
                aptVar.m1827o();
                this.f11788b.edit().putBoolean("pref_key_reboot_completed", false).apply();
            } catch (Throwable th) {
                aptVar.m1827o();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final boolean m6229c(csn csnVar) {
        if (!((mrm) this.f11787a).mo16813g()) {
            return false;
        }
        m6230d();
        if (csnVar.f9359x != kmq.BACK || !this.f11788b.mo5398d()) {
            return false;
        }
        jxp jxpVar = csnVar.f9339d;
        jxn jxnVar = csnVar.f9338c;
        if (this.f11789c.mo6184l(dhh.f11056I) && jxpVar.m13663d() && jxnVar.f35058i == 60) {
            return false;
        }
        return (this.f11789c.mo6184l(dhh.f11082ah) && jxpVar.m13662c() && jxnVar.f35058i == 60) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m6230d() {
        ?? r0 = this.f11789c;
        dhx dhxVar = dhh.f11074a;
        r0.mo6176d();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kbo] */
    /* JADX INFO: renamed from: e */
    public final void m6231e() {
        try {
            try {
                this.f11789c.mo13944f("Loading libhalide_hexagon_host.so.");
                System.loadLibrary("halide_hexagon_host");
                String str = m6215H((Context) this.f11787a).f14104a;
                this.f11788b.mo13961e("HexagonEnvironment#copyHexagonRemoteToDisk");
                String strConcat = String.valueOf(str).concat("/libhalide_hexagon_remote_skel.so");
                this.f11789c.mo13944f("Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ".concat(strConcat));
                InputStream inputStreamOpenRawResource = ((Context) this.f11787a).getResources().openRawResource(C0100R.raw.libhalide_hexagon_remote_skel_signed_by_testsig);
                FileOutputStream fileOutputStream = new FileOutputStream(strConcat);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStreamOpenRawResource.read(bArr);
                    if (i == -1) {
                        fileOutputStream.flush();
                        inputStreamOpenRawResource.close();
                        fileOutputStream.close();
                        this.f11788b.mo13962f();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i);
                }
            } catch (UnsatisfiedLinkError e) {
                this.f11789c.mo13948j("Failed to load Hexagon library", e);
            }
        } catch (Exception e2) {
            this.f11789c.mo13948j("Error initializing Hexagon", e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: g */
    public final synchronized void m6232g() {
        duh.m6757c("sensor", this.f11787a);
        for (dug dugVar : this.f11787a) {
            if (dugVar.mo6726e()) {
                for (Sensor sensor : dugVar.mo6741f()) {
                    dugVar.mo6743h(sensor);
                    dvd dvdVar = new dvd(dugVar, 0);
                    ((SensorManager) this.f11789c).registerListener(dvdVar, sensor, 3);
                    this.f11788b.add(new apv(this, dugVar, sensor, dvdVar, 7, null, null));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m6233h() {
        Iterator it = this.f11788b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f11788b.clear();
    }

    /* JADX INFO: renamed from: i */
    public final int m6234i() {
        return ((AtomicInteger) this.f11787a).get();
    }

    /* JADX INFO: renamed from: j */
    public final int m6235j() {
        return ((AtomicInteger) this.f11788b).get();
    }

    /* JADX INFO: renamed from: k */
    public final int m6236k() {
        return ((AtomicInteger) this.f11789c).incrementAndGet();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final jxp m6237l(kmq kmqVar) {
        dhx dhxVar = kmqVar == kmq.f36557a ? dhh.f11093f : dhh.f11094g;
        mrm mrmVarM16828h = mrm.m16828h((Integer) this.f11787a.mo6173a(dhxVar).orElse(null));
        if (!mrmVarM16828h.mo16813g()) {
            if (kmqVar == kmq.f36557a) {
                return jxp.RES_1080P;
            }
            return ((Boolean) this.f11789c.mo10031c(gzy.f26992D)).booleanValue() ? jxp.RES_2160P : jxp.RES_1080P;
        }
        switch (((Integer) mrmVarM16828h.mo16809c()).intValue()) {
            case 144:
                return jxp.RES_QCIF;
            case 240:
                return jxp.RES_QVGA;
            case 288:
                return jxp.RES_CIF;
            case 480:
                return jxp.RES_480P;
            case 720:
                return jxp.RES_720P;
            case 1080:
                return jxp.RES_1080P;
            case 2160:
                return jxp.RES_2160P;
            default:
                throw new IllegalArgumentException("Value " + mrmVarM16828h.mo16809c().toString() + " for ADB flag " + dhxVar.f11210a + " not supported.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final boolean m6238m(Context context, kmq kmqVar) {
        if (kmqVar.equals(kmq.BACK)) {
            return true;
        }
        if (!this.f11787a.mo6184l(dib.f11316bW)) {
            return this.f11787a.mo6184l(dhh.f11083ai);
        }
        Display display = context.getDisplay();
        display.getClass();
        if (jpd.m13428i(context, display).getWidth() < 600) {
            return this.f11787a.mo6184l(dhh.f11083ai);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: n */
    public final boolean m6239n() {
        ?? r0 = this.f11787a;
        dhx dhxVar = dhh.f11074a;
        r0.mo6175c();
        return ((Boolean) this.f11789c.mo10031c(gzy.f26990B)).booleanValue() && this.f11787a.mo6184l(dhh.f11102o) && ((khb) this.f11788b).m14239d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hah, java.lang.Object] */
    /* JADX INFO: renamed from: o */
    public final boolean m6240o() {
        return ((Boolean) this.f11789c.mo10031c(gzy.f26989A)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final boolean m6241p() {
        return this.f11787a.mo6183k(dhh.f11105r);
    }

    /* JADX INFO: renamed from: q */
    public final void m6242q(String str, String str2) {
        long jQueryNumEntries = DatabaseUtils.queryNumEntries((SQLiteDatabase) this.f11789c, str) - 10000;
        if (jQueryNumEntries > 0) {
            ((SQLiteDatabase) this.f11789c).delete(str, str2 + " IN (SELECT " + str2 + " FROM " + str + " ORDER BY " + str2 + " ASC LIMIT " + jQueryNumEntries + ")", new String[0]);
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6243r(Class cls, Class cls2) {
        return ((Class) this.f11787a).isAssignableFrom(cls) && cls2.isAssignableFrom((Class) this.f11788b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, jxt] */
    /* JADX INFO: renamed from: s */
    public final dsx m6244s(kmg kmgVar) {
        if (this.f11787a.containsKey(kmgVar)) {
            return (dsx) this.f11787a.get(kmgVar);
        }
        fvu fvuVarM14581f = ((kms) this.f11788b).m14581f(kmgVar);
        HashMap map = new HashMap();
        map.put(jxn.FPS_30, m6216I(kmgVar, jxn.FPS_30));
        jxn jxnVar = jxn.FPS_60;
        map.put(jxnVar, m6216I(kmgVar, jxnVar));
        jxn jxnVar2 = jxn.FPS_AUTO;
        map.put(jxnVar2, m6216I(kmgVar, jxnVar2));
        jxn jxnVar3 = jxn.f35050b;
        map.put(jxnVar3, m6216I(kmgVar, jxnVar3));
        jxn jxnVar4 = jxn.f35054f;
        map.put(jxnVar4, m6216I(kmgVar, jxnVar4));
        jxn jxnVar5 = jxn.FPS_60C_24E;
        map.put(jxnVar5, m6216I(kmgVar, jxnVar5));
        HashMap map2 = new HashMap();
        Iterator it = jxn.m13654c().iterator();
        while (it.hasNext()) {
            map2.put((jxn) it.next(), new ArrayList());
        }
        if (fvuVarM14581f.mo14543L()) {
            ArrayList<jxp> arrayList = new ArrayList();
            Iterator it2 = fvuVarM14581f.mo14570w().iterator();
            while (it2.hasNext()) {
                jxp jxpVar = (jxp) jxp.f35080m.get((kbc) it2.next());
                if (jxpVar != null) {
                    arrayList.add(jxpVar);
                }
            }
            for (jxp jxpVar2 : arrayList) {
                jyb jybVarM13698a = jyb.m13698a(jxpVar2);
                if (jybVarM13698a != null && jzn.m13815c(kmgVar, jybVarM13698a)) {
                    List listMo14569v = fvuVarM14581f.mo14569v(jxpVar2.m13661b());
                    for (jxn jxnVar6 : jxn.m13654c()) {
                        if (jzn.m13815c(kmgVar, jybVarM13698a)) {
                            if (this.f11789c.mo13668e(jzn.m13816d(kmgVar, jybVarM13698a), jxnVar6, jxpVar2)) {
                                Iterator it3 = listMo14569v.iterator();
                                while (it3.hasNext()) {
                                    if (jxnVar6.f35058i == ((Integer) ((Range) it3.next()).getUpper()).intValue()) {
                                        List list = (List) map2.get(jxnVar6);
                                        list.getClass();
                                        list.add(jxpVar2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            jyb[] jybVarArrValues = jyb.values();
            int length = jybVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    map2.put(jxn.FPS_240_HFR_8X, new ArrayList());
                    break;
                }
                jyb jybVar = jybVarArrValues[i];
                if (jzn.m13815c(kmgVar, jybVar) && jzn.m13816d(kmgVar, jybVar).f35171l == 240) {
                    break;
                }
                i++;
            }
        }
        map.putAll(map2);
        Iterator it4 = map.keySet().iterator();
        while (it4.hasNext()) {
            Collections.sort((List) map.get((jxn) it4.next()), new C1143ye(8));
        }
        dsx dsxVar = new dsx(fvuVarM14581f, map);
        this.f11787a.put(kmgVar, dsxVar);
        return dsxVar;
    }

    /* JADX INFO: renamed from: t */
    public final kba m6245t() {
        return ((AmbientDelegate) this.f11789c).m1593Y();
    }

    /* JADX INFO: renamed from: u */
    public final synchronized nps m6246u(Set set) {
        nps npsVarM17553i;
        int i;
        nps npsVarM13559g;
        try {
            jvb jvbVar = new jvb();
            try {
                jvbVar.m13537d(m6245t());
                kgr kgrVar = new kgr(this, null);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    kho khoVar = (kho) it.next();
                    Iterator it2 = khoVar.f36065a.iterator();
                    while (true) {
                        i = 10;
                        if (!it2.hasNext()) {
                            break;
                        }
                        final kkq kkqVar = (kkq) it2.next();
                        if (!kgrVar.f35948b.contains(kkqVar)) {
                            Object obj = kgrVar.f35950d.f11788b;
                            knw knwVarM11353u = ((ihk) obj).m11353u(kkqVar);
                            nps npsVarM1597ab = knwVarM11353u == null ? ((AmbientDelegate) kkqVar.f36402e.f36008a).m1597ab(1L) : null;
                            lku.m15657k(kkqVar.f36400c > 0);
                            knw knwVarM11352t = ((ihk) obj).m11352t(kkqVar.f36400c);
                            nps npsVarM1597ab2 = knwVarM11352t == null ? ((AmbientDelegate) ((ihk) obj).f30966a).m1597ab(kkqVar.f36400c) : null;
                            if (knwVarM11353u == null || knwVarM11352t == null) {
                                if (npsVarM1597ab == null) {
                                    knwVarM11353u.getClass();
                                    npsVarM1597ab = kxk.m14965K(knwVarM11353u);
                                }
                                if (npsVarM1597ab2 == null) {
                                    knwVarM11352t.getClass();
                                    npsVarM1597ab2 = kxk.m14965K(knwVarM11352t);
                                }
                                npsVarM13559g = jvh.m13559g(npsVarM1597ab, npsVarM1597ab2, new kas() { // from class: kip
                                    @Override // p000.kas
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo8971a(Object obj2, Object obj3) {
                                        return kle.m14476f((knw) obj3, (knw) obj2, kkqVar.mo14454i());
                                    }
                                });
                            } else {
                                npsVarM13559g = kxk.m14965K(kle.m14476f(knwVarM11352t, knwVarM11353u, kkqVar.mo14454i()));
                            }
                            kgrVar.f35947a.add(nod.m17553i(npsVarM13559g, new hgv(kkqVar, i), not.INSTANCE));
                            kgrVar.f35948b.add(kkqVar);
                            it = it;
                        }
                    }
                    Iterator it3 = it;
                    for (kkr kkrVar : khoVar.f36066b) {
                        if (!kgrVar.f35948b.contains(kkrVar)) {
                            if (kkrVar.f36404b > 0) {
                                Object obj2 = kgrVar.f35950d.f11788b;
                                lku.m15657k(true);
                                knw knwVarM11352t2 = ((ihk) obj2).m11352t(kkrVar.f36404b);
                                kgrVar.f35947a.add(nod.m17553i(knwVarM11352t2 == null ? nod.m17553i(((AmbientDelegate) ((ihk) obj2).f30966a).m1597ab(kkrVar.f36404b), new hnk(i), not.INSTANCE) : kxk.m14965K(kle.m14476f(knwVarM11352t2, null, true)), new hgv(kkrVar, 11), not.INSTANCE));
                            } else {
                                kgrVar.f35947a.add(kxk.m14965K(kks.m14457g(kkrVar)));
                            }
                            kgrVar.f35948b.add(kkrVar);
                        }
                    }
                    kgrVar.f35949c.add(khoVar);
                    it = it3;
                }
                npsVarM17553i = nod.m17553i(kxk.m14961G(kgrVar.f35947a), new hgv(kgrVar, 12), not.INSTANCE);
                jvbVar.close();
            } catch (Throwable th) {
                try {
                    jvbVar.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return npsVarM17553i;
    }

    /* JADX INFO: renamed from: v */
    public final synchronized Set m6247v(Set set) {
        return m6248w(set, mzx.f41874a);
    }

    /* JADX INFO: renamed from: w */
    public final synchronized Set m6248w(Set set, Set set2) {
        mxk mxkVarMo17127f;
        kle kleVarM14476f;
        try {
            jvb jvbVar = new jvb();
            try {
                jvbVar.m13537d(m6245t());
                ArrayList<klc> arrayList = new ArrayList();
                ArrayList<khq> arrayList2 = new ArrayList();
                ArrayList<kho> arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    khq khqVar = (khq) it.next();
                    for (klc klcVar : khqVar.f36077a) {
                        kgg kggVarMo14461d = klcVar.mo14461d();
                        if (arrayList4.contains(kggVarMo14461d)) {
                            lku.m15669w(arrayList.contains(klcVar));
                        } else {
                            arrayList4.add(kggVarMo14461d);
                            arrayList.add(klcVar);
                        }
                    }
                    kho khoVar = khqVar.f36079c;
                    lku.m15613H(true ^ arrayList3.contains(khoVar));
                    arrayList3.add(khoVar);
                    arrayList2.add(khqVar);
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    kho khoVar2 = (kho) it2.next();
                    if (!arrayList3.contains(khoVar2)) {
                        arrayList3.add(khoVar2);
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = khoVar2.f36065a.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                kkq kkqVar = (kkq) it3.next();
                                if (!arrayList4.contains(kkqVar)) {
                                    jvbVar.m13537d(kkqVar.f36402e.m14252r());
                                    Object obj = this.f11788b;
                                    knw knwVarM11353u = ((ihk) obj).m11353u(kkqVar);
                                    if (knwVarM11353u == null) {
                                        kleVarM14476f = null;
                                    } else {
                                        lku.m15657k(kkqVar.f36400c > 0);
                                        knw knwVarM11352t = ((ihk) obj).m11352t(kkqVar.f36400c);
                                        if (knwVarM11352t == null && kkqVar.mo14454i()) {
                                            knwVarM11352t = ((AmbientDelegate) ((ihk) obj).f30966a).m1594Z(kkqVar.f36400c);
                                        }
                                        if (knwVarM11352t == null) {
                                            knwVarM11353u.close();
                                            kleVarM14476f = null;
                                        } else {
                                            kleVarM14476f = kle.m14476f(knwVarM11352t, knwVarM11353u, kkqVar.mo14454i());
                                        }
                                    }
                                    if (kleVarM14476f != null) {
                                        arrayList5.add(kkx.m14472e(kkqVar, kleVarM14476f));
                                    }
                                }
                            } else {
                                Iterator it4 = khoVar2.f36066b.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        kkr kkrVar = (kkr) it4.next();
                                        if (!arrayList4.contains(kkrVar)) {
                                            if (kkrVar.f36404b > 0) {
                                                Object obj2 = this.f11788b;
                                                lku.m15669w(true);
                                                knw knwVarM11352t2 = ((ihk) obj2).m11352t(kkrVar.f36404b);
                                                kle kleVarM14476f2 = knwVarM11352t2 == null ? null : kle.m14476f(knwVarM11352t2, null, true);
                                                if (kleVarM14476f2 != null) {
                                                    arrayList5.add(kks.m14455e(kkrVar, kleVarM14476f2));
                                                }
                                            } else {
                                                arrayList5.add(kks.m14457g(kkrVar));
                                            }
                                        }
                                    } else {
                                        int size = arrayList5.size();
                                        for (int i = 0; i < size; i++) {
                                            klc klcVar2 = (klc) arrayList5.get(i);
                                            lku.m15613H(!arrayList.contains(klcVar2));
                                            arrayList4.add(klcVar2.mo14461d());
                                            arrayList.add(klcVar2);
                                        }
                                    }
                                }
                            }
                            int size2 = arrayList5.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                kba kbaVarMo14458a = ((klc) arrayList5.get(i2)).mo14458a();
                                if (kbaVarMo14458a != null) {
                                    kbaVarMo14458a.close();
                                }
                            }
                        }
                    }
                }
                Object obj3 = this.f11787a;
                ArrayMap arrayMap = new ArrayMap();
                for (klc klcVar3 : arrayList) {
                    arrayMap.put(klcVar3.mo14461d(), klcVar3);
                }
                mxi mxiVarM17132D = mxk.m17132D();
                for (kho khoVar3 : arrayList3) {
                    khq khqVar2 = null;
                    for (khq khqVar3 : arrayList2) {
                        if (khqVar3.f36079c == khoVar3) {
                            khqVar2 = khqVar3;
                        }
                    }
                    if (khqVar2 != null) {
                        mxiVarM17132D.mo17072d(khqVar2);
                    } else {
                        mxi mxiVarM17132D2 = mxk.m17132D();
                        naz nazVarListIterator = khoVar3.f36067c.listIterator();
                        while (nazVarListIterator.hasNext()) {
                            kgg kggVar = (kgg) nazVarListIterator.next();
                            klc klcVarM14456f = (klc) arrayMap.get(kggVar);
                            if (klcVarM14456f == null) {
                                if (kggVar instanceof kkq) {
                                    kle kleVarM14477g = kle.m14477g();
                                    kkx kkxVar = new kkx(kggVar, kleVarM14477g);
                                    kleVarM14477g.m14482e(kkxVar);
                                    klcVarM14456f = kkxVar;
                                } else {
                                    lku.m15657k(kggVar instanceof kkr);
                                    klcVarM14456f = kks.m14456f(kggVar);
                                }
                                arrayMap.put(kggVar, klcVarM14456f);
                            }
                            mxiVarM17132D2.mo17072d(klcVarM14456f);
                        }
                        mxiVarM17132D.mo17072d(khq.m14274p((khb) obj3, khoVar3, mxiVarM17132D2.mo17127f()));
                    }
                }
                mxkVarMo17127f = mxiVarM17132D.mo17127f();
                jvbVar.close();
            } catch (Throwable th) {
                try {
                    jvbVar.close();
                    throw th;
                } catch (Throwable th2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return mxkVarMo17127f;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [ggm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: y */
    public final nim m6249y() {
        nxl nxlVarM18137O = nim.f42730e.m18137O();
        boolean zIsInMultiWindowMode = ((Activity) this.f11787a).isInMultiWindowMode();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nim nimVar = (nim) nxlVarM18137O.f44974b;
        int i = 2;
        nimVar.f42732a |= 2;
        nimVar.f42734c = zIsInMultiWindowMode;
        int i2 = this.f11789c.mo9215c().f35503e;
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nim nimVar2 = (nim) nxlVarM18137O.f44974b;
        nimVar2.f42732a |= 4;
        nimVar2.f42735d = i2;
        hye hyeVar = hye.UNKNOWN;
        switch (((hyd) this.f11788b.mo3831be()).f29901a.ordinal()) {
            case 1:
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 5;
                break;
            default:
                i = 1;
                break;
        }
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nim nimVar3 = (nim) nxlVarM18137O.f44974b;
        nimVar3.f42733b = i - 1;
        nimVar3.f42732a = 1 | nimVar3.f42732a;
        return (nim) nxlVarM18137O.mo18103l();
    }

    /* JADX INFO: renamed from: z */
    public final NotificationChannel m6250z() {
        NotificationChannel notificationChannel = ((NotificationManager) this.f11788b).getNotificationChannel("Sideline");
        if (notificationChannel != null) {
            return notificationChannel;
        }
        NotificationChannel notificationChannel2 = new NotificationChannel("Sideline", ((Context) this.f11789c).getString(C0100R.string.notification_update_channel_name), 3);
        notificationChannel2.setSound(null, null);
        ((NotificationManager) this.f11788b).createNotificationChannel(notificationChannel2);
        return notificationChannel2;
    }

    public djm(Context context, dhv dhvVar, kbn kbnVar) {
        this.f11787a = context;
        this.f11789c = dhvVar;
        this.f11788b = kbnVar.mo6314a("ShotFailureHdlr");
    }

    public djm() {
        this.f11788b = new jwf(false);
        this.f11787a = new jwf(false);
        this.f11789c = new jwf(false);
    }

    public djm(jfs jfsVar, byte[] bArr, byte[] bArr2) {
        jvd.m13538a();
        this.f11789c = jfsVar;
        this.f11787a = (ConstraintLayout) jfsVar.m13100f(C0100R.id.camera_app_root);
        this.f11788b = jfsVar.m13100f(C0100R.id.preview_overlay);
    }

    public djm(SensorManager sensorManager, Set set) {
        this.f11788b = new ArrayList();
        this.f11789c = sensorManager;
        this.f11787a = duh.m6755a(set);
    }

    public djm(Context context, jww jwwVar, fcp fcpVar, dhv dhvVar) {
        this.f11787a = context;
        this.f11788b = jwwVar;
        this.f11789c = fcpVar;
        if (((Boolean) jwwVar.mo3831be()).booleanValue()) {
            return;
        }
        dhx dhxVar = dhs.f11163a;
        dhvVar.mo6177e();
        m6218f(context);
    }

    public djm(kbo kboVar, kbz kbzVar, Context context) {
        this.f11789c = kboVar.mo6314a("HexagonEnv");
        this.f11787a = context;
        this.f11788b = kbzVar;
    }

    public djm(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4) {
        ojuVar.getClass();
        this.f11788b = ojuVar;
        this.f11787a = ojuVar2;
        this.f11789c = ojuVar3;
        ojuVar4.getClass();
    }

    public djm(oju ojuVar, oju ojuVar2, oju ojuVar3, byte[] bArr) {
        ojuVar.getClass();
        this.f11789c = ojuVar;
        ojuVar2.getClass();
        this.f11787a = ojuVar2;
        ojuVar3.getClass();
        this.f11788b = ojuVar3;
    }

    public djm(guq guqVar) {
        this.f11788b = new Object();
        this.f11789c = new ArrayList();
        this.f11787a = guqVar;
    }

    public djm(SensorManager sensorManager, Executor executor) {
        this.f11788b = sensorManager;
        this.f11789c = executor;
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            if ("com.google.sensor.double_twist".equals(sensor.getStringType()) && "Google".equals(sensor.getVendor())) {
                this.f11787a = sensor;
            }
        }
        sensor = null;
        this.f11787a = sensor;
    }

    public djm(oju ojuVar, oju ojuVar2, oju ojuVar3) {
        ojuVar.getClass();
        this.f11787a = ojuVar;
        ojuVar2.getClass();
        this.f11789c = ojuVar2;
        ojuVar3.getClass();
        this.f11788b = ojuVar3;
    }
}
