package p000;

import android.content.Context;
import android.database.Cursor;
import android.media.MediaFormat;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bdv implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f3016a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f3017b;

    public bdv(amm ammVar, int i) {
        this.f3017b = i;
        this.f3016a = ammVar;
    }

    public /* synthetic */ bdv(Context context, int i) {
        this.f3017b = i;
        this.f3016a = context;
    }

    public /* synthetic */ bdv(bkn bknVar, int i, byte[] bArr, byte[] bArr2) {
        this.f3017b = i;
        this.f3016a = bknVar;
    }

    public /* synthetic */ bdv(cpw cpwVar, int i) {
        this.f3017b = i;
        this.f3016a = cpwVar;
    }

    public /* synthetic */ bdv(dlx dlxVar, int i) {
        this.f3017b = i;
        this.f3016a = dlxVar;
    }

    public /* synthetic */ bdv(esl eslVar, int i) {
        this.f3017b = i;
        this.f3016a = eslVar;
    }

    public /* synthetic */ bdv(fvh fvhVar, int i) {
        this.f3017b = i;
        this.f3016a = fvhVar;
    }

    public /* synthetic */ bdv(glu gluVar, int i) {
        this.f3017b = i;
        this.f3016a = gluVar;
    }

    public /* synthetic */ bdv(gwy gwyVar, int i) {
        this.f3017b = i;
        this.f3016a = gwyVar;
    }

    public /* synthetic */ bdv(hbr hbrVar, int i) {
        this.f3017b = i;
        this.f3016a = hbrVar;
    }

    public /* synthetic */ bdv(hbv hbvVar, int i) {
        this.f3017b = i;
        this.f3016a = hbvVar;
    }

    public /* synthetic */ bdv(hmr hmrVar, int i) {
        this.f3017b = i;
        this.f3016a = hmrVar;
    }

    public /* synthetic */ bdv(iht ihtVar, int i) {
        this.f3017b = i;
        this.f3016a = ihtVar;
    }

    public /* synthetic */ bdv(jzd jzdVar, int i) {
        this.f3017b = i;
        this.f3016a = jzdVar;
    }

    public /* synthetic */ bdv(jzu jzuVar, int i) {
        this.f3017b = i;
        this.f3016a = jzuVar;
    }

    public /* synthetic */ bdv(kae kaeVar, int i) {
        this.f3017b = i;
        this.f3016a = kaeVar;
    }

    public /* synthetic */ bdv(mrm mrmVar, int i) {
        this.f3017b = i;
        this.f3016a = mrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:151:0x03af A[Catch: all -> 0x0454, TRY_ENTER, TryCatch #13 {all -> 0x0454, blocks: (B:138:0x031e, B:140:0x0335, B:143:0x0355, B:145:0x0364, B:147:0x037b, B:149:0x038a, B:151:0x03af, B:153:0x03be, B:155:0x03e4, B:157:0x040e, B:159:0x0439), top: B:344:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:153:0x03be A[Catch: all -> 0x0454, TRY_LEAVE, TryCatch #13 {all -> 0x0454, blocks: (B:138:0x031e, B:140:0x0335, B:143:0x0355, B:145:0x0364, B:147:0x037b, B:149:0x038a, B:151:0x03af, B:153:0x03be, B:155:0x03e4, B:157:0x040e, B:159:0x0439), top: B:344:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:155:0x03e4 A[Catch: all -> 0x0454, TRY_ENTER, TryCatch #13 {all -> 0x0454, blocks: (B:138:0x031e, B:140:0x0335, B:143:0x0355, B:145:0x0364, B:147:0x037b, B:149:0x038a, B:151:0x03af, B:153:0x03be, B:155:0x03e4, B:157:0x040e, B:159:0x0439), top: B:344:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:157:0x040e A[Catch: all -> 0x0454, TRY_LEAVE, TryCatch #13 {all -> 0x0454, blocks: (B:138:0x031e, B:140:0x0335, B:143:0x0355, B:145:0x0364, B:147:0x037b, B:149:0x038a, B:151:0x03af, B:153:0x03be, B:155:0x03e4, B:157:0x040e, B:159:0x0439), top: B:344:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0439 A[Catch: all -> 0x0454, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0454, blocks: (B:138:0x031e, B:140:0x0335, B:143:0x0355, B:145:0x0364, B:147:0x037b, B:149:0x038a, B:151:0x03af, B:153:0x03be, B:155:0x03e4, B:157:0x040e, B:159:0x0439), top: B:344:0x031e }] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        gyp gypVarM9990a;
        kbz kbzVar;
        int i;
        StatFs statFs;
        long totalBytes;
        hmq hmqVarM10465a;
        kbz kbzVar2;
        String str;
        int i2 = 10;
        Object objMo945a = null;
        boolean z = true;
        int i3 = 0;
        switch (this.f3017b) {
            case 0:
                return Integer.valueOf(C0166er.m7717h((WorkDatabase) ((bkn) this.f3016a).f3651a, "next_alarm_manager_id"));
            case 1:
                ((amm) this.f3016a).f710e.set(true);
                try {
                    Process.setThreadPriority(10);
                    objMo945a = ((amm) this.f3016a).mo945a();
                    try {
                        Binder.flushPendingCommands();
                        ((amm) this.f3016a).m958d(objMo945a);
                        return objMo945a;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            ((amm) this.f3016a).f709d.set(true);
                            throw th;
                        } catch (Throwable th2) {
                            ((amm) this.f3016a).m958d(objMo945a);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                break;
            case 2:
                bkn bknVar = (bkn) this.f3016a;
                int iM7717h = C0166er.m7717h((WorkDatabase) bknVar.f3651a, "next_job_scheduler_id");
                if (iM7717h >= 0) {
                    i3 = iM7717h;
                } else {
                    C0166er.m7718i((WorkDatabase) bknVar.f3651a, "next_job_scheduler_id", 1);
                }
                return Integer.valueOf(i3);
            case 3:
                ((cpw) this.f3016a).m5263e();
                return null;
            case 4:
                dlz dlzVar = ((dlx) this.f3016a).f11999g;
                apy apyVarM1841a = apy.m1841a("SELECT shot_id FROM shots WHERE NOT failed AND  persisted_millis = 0 AND canceled_millis = 0 AND deleted_millis = 0", 0);
                dmf dmfVar = (dmf) dlzVar;
                dmfVar.f12013a.m1824l();
                Cursor cursorM409e = aey.m409e(dmfVar.f12013a, apyVarM1841a, false);
                try {
                    ArrayList arrayList = new ArrayList(cursorM409e.getCount());
                    while (cursorM409e.moveToNext()) {
                        arrayList.add(cursorM409e.isNull(0) ? null : Long.valueOf(cursorM409e.getLong(0)));
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorM409e.close();
                    apyVarM1841a.m1850j();
                }
            case 5:
                esl eslVar = (esl) this.f3016a;
                chw chwVar = eslVar.f15412p;
                if (chwVar == null) {
                    return eslVar.f15411o.mo3711a();
                }
                mrm mrmVarMo3766bL = chwVar.mo3766bL();
                return (!mrmVarMo3766bL.mo16813g() || ((ihy) mrmVarMo3766bL.mo16809c()).f31026d) ? mrmVarMo3766bL.mo16807a(eslVar.f15411o.mo3711a()) : mqu.f41450a;
            case 6:
                return mrm.m16829i((kfa) ((oju) ((mrm) this.f3016a).mo16809c()).get());
            case 7:
                fvh fvhVar = (fvh) this.f3016a;
                return kmg.m14575b((String) Collection$EL.stream((mxk) Collection$EL.stream(fvhVar.f23627a.keySet()).filter(new dam(fvhVar, i2)).collect(muc.f41627b)).iterator().next());
            case 8:
                Object obj = this.f3016a;
                glu gluVar = (glu) obj;
                if (gluVar.f25537b > 0) {
                    gluVar.m9464h();
                    synchronized (obj) {
                        ((glu) obj).f25538c = new CountDownLatch(12);
                        break;
                    }
                    try {
                        if (!((glu) obj).f25538c.await(500L, TimeUnit.MILLISECONDS)) {
                            ((glu) obj).f25536a.mo13940b("CountDownLatch timed out before getting 12 Gcam AE results.");
                        }
                    } catch (InterruptedException e) {
                        gluVar.f25536a.mo13947i("CountDownLatch for Gcam AE results interrupted.");
                        Thread.currentThread().interrupt();
                    }
                    synchronized (obj) {
                        ((glu) obj).f25538c = null;
                        break;
                    }
                }
                return gluVar.m9458b();
            case 9:
                Object obj2 = this.f3016a;
                synchronized (((gwy) obj2).f26674j) {
                    ((gwy) obj2).f26680p.f26832a.mo14689i();
                    gyo gyoVarM9998a = gyp.m9998a();
                    gyoVarM9998a.m9992c(((gwy) obj2).f26667c);
                    gyoVarM9998a.m9993d(((gwy) obj2).f26680p.f26832a.mo14682b());
                    gypVarM9990a = gyoVarM9998a.m9990a();
                    ((gwy) obj2).m9891W("Touched " + ((gwy) obj2).f26680p.f26832a.toString());
                    break;
                }
                return gypVarM9990a;
            case 10:
                return Boolean.valueOf(((hbr) this.f3016a).f27157a.m19591a(true));
            case 11:
                Object obj3 = this.f3016a;
                hbv hbvVar = (hbv) obj3;
                String str2 = hbvVar.f27174d;
                hbvVar.f27186p.mo13961e("SidelineInstaller#shouldStartUpdate");
                long jM10102b = hcf.m10102b(hbvVar.f27172b);
                if (jM10102b != -1) {
                    hbvVar.f27181k.f27219b = jM10102b;
                    SystemClock.uptimeMillis();
                    try {
                        try {
                            InputStream inputStreamOpen = ((hbv) obj3).f27172b.getAssets().open(str2);
                            try {
                                long integer = ((hbv) obj3).f27172b.getResources().getInteger(C0100R.integer.apex_hal_version);
                                ((hbv) obj3).f27188r = integer;
                                if (integer != -1) {
                                    ((hbv) obj3).f27181k.f27220c = integer;
                                    SystemClock.uptimeMillis();
                                    if (((hbv) obj3).f27188r > jM10102b) {
                                        String str3 = Build.VERSION.INCREMENTAL;
                                        try {
                                            i = Integer.parseInt(str3);
                                        } catch (NumberFormatException e2) {
                                            ((nbe) ((nbe) ((nbe) hcc.f27228a.m17251b()).mo17283h(e2)).mo17276G((char) 3468)).mo17293r("VERSION.INCREMENTAL is not an integer (%s). Return -1.", str3);
                                            i = -1;
                                        }
                                        if (i == -1 || !Build.ID.startsWith(((hbv) obj3).f27172b.getString(C0100R.string.apex_target_os_prefix))) {
                                            ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G(3450)).mo17293r("Sideline is not compatible with OS build: %s. Skipping", Build.ID);
                                            ((hbv) obj3).f27181k.m10099b(-2, 5);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } else {
                                            int integer2 = ((hbv) obj3).f27172b.getResources().getInteger(C0100R.integer.apex_minimum_os_version_incremental);
                                            if (i < integer2) {
                                                ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G(3453)).mo17294s("Current OS version (%d) is smaller than minimum OS version required (%d). Skipping.", i, integer2);
                                                ((hbv) obj3).f27181k.m10099b(-3, 6);
                                                if (inputStreamOpen != null) {
                                                    inputStreamOpen.close();
                                                }
                                            } else {
                                                if (inputStreamOpen != null) {
                                                    inputStreamOpen.close();
                                                }
                                                hbvVar.f27186p.mo13962f();
                                            }
                                        }
                                    } else if (inputStreamOpen != null) {
                                        inputStreamOpen.close();
                                    }
                                } else if (inputStreamOpen != null) {
                                    inputStreamOpen.close();
                                }
                                kbzVar = hbvVar.f27186p;
                            } catch (Throwable th4) {
                                if (inputStreamOpen != null) {
                                    try {
                                        inputStreamOpen.close();
                                    } catch (Throwable th5) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                    }
                                    break;
                                }
                                throw th4;
                            }
                        } catch (Throwable th6) {
                            hbvVar.f27186p.mo13962f();
                            throw th6;
                        }
                    } catch (IOException e3) {
                        ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G(3451)).mo17293r("Apex asset file not found: %s", str2);
                        kbzVar = hbvVar.f27186p;
                    }
                    kbzVar.mo13962f();
                    z = false;
                    break;
                } else {
                    hbvVar.f27186p.mo13962f();
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                return ((iht) this.f3016a).m11365d();
            case 13:
                Object obj4 = this.f3016a;
                try {
                    ((hmr) obj4).f28357b.mo13961e("checkSpace");
                    String externalStorageState = Environment.getExternalStorageState();
                    if (!BEeWZPor.JLAEVOiFgWT.equals(externalStorageState)) {
                        ((nbe) ((nbe) hmr.f28356a.m17252c()).mo17276G(3744)).mo17293r("the current state of the primary shared/external storage media: %s", externalStorageState);
                        hmqVarM10465a = hmq.f28351a;
                        kbzVar2 = ((hmr) obj4).f28357b;
                    } else if (!((hmr) obj4).f28360e.m10452a().exists()) {
                        ((hmr) obj4).f28360e.m10452a();
                        if (!((hmr) obj4).f28360e.m10452a().mkdirs() && !((hmr) obj4).f28360e.m10452a().exists()) {
                            ((nbe) ((nbe) hmr.f28356a.m17252c()).mo17276G(3743)).mo17293r("failed to create the media folder: %s", ((hmr) obj4).f28360e.m10452a());
                            hmqVarM10465a = hmq.f28351a;
                            kbzVar2 = ((hmr) obj4).f28357b;
                        } else if (((hmr) obj4).f28360e.m10452a().isDirectory()) {
                            boolean z2 = ((hmr) obj4).f28358c.f36760c;
                            statFs = new StatFs(((hmr) obj4).f28360e.m10453b());
                            totalBytes = statFs.getTotalBytes();
                            if (((hmr) obj4).f28359d.mo6173a(dib.f11214A).isPresent()) {
                                hmqVarM10465a = hmq.m10465a(1048576 * ((long) ((Integer) ((hmr) obj4).f28359d.mo6173a(dib.f11214A).get()).intValue()), totalBytes, 419430400L, 52428800L);
                                kbzVar2 = ((hmr) obj4).f28357b;
                            } else {
                                hmqVarM10465a = hmq.m10465a(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), totalBytes, 419430400L, 52428800L);
                                kbzVar2 = ((hmr) obj4).f28357b;
                            }
                        } else {
                            ((nbe) ((nbe) hmr.f28356a.m17252c()).mo17276G(3741)).mo17293r("the media folder is not a folder: %s", ((hmr) obj4).f28360e.m10452a());
                            hmqVarM10465a = hmq.f28351a;
                            kbzVar2 = ((hmr) obj4).f28357b;
                        }
                    } else if (((hmr) obj4).f28360e.m10452a().isDirectory()) {
                        ((nbe) ((nbe) hmr.f28356a.m17252c()).mo17276G(3741)).mo17293r("the media folder is not a folder: %s", ((hmr) obj4).f28360e.m10452a());
                        hmqVarM10465a = hmq.f28351a;
                        kbzVar2 = ((hmr) obj4).f28357b;
                    } else {
                        boolean z3 = ((hmr) obj4).f28358c.f36760c;
                        statFs = new StatFs(((hmr) obj4).f28360e.m10453b());
                        totalBytes = statFs.getTotalBytes();
                        if (((hmr) obj4).f28359d.mo6173a(dib.f11214A).isPresent()) {
                            hmqVarM10465a = hmq.m10465a(1048576 * ((long) ((Integer) ((hmr) obj4).f28359d.mo6173a(dib.f11214A).get()).intValue()), totalBytes, 419430400L, 52428800L);
                            kbzVar2 = ((hmr) obj4).f28357b;
                        } else {
                            hmqVarM10465a = hmq.m10465a(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), totalBytes, 419430400L, 52428800L);
                            kbzVar2 = ((hmr) obj4).f28357b;
                        }
                    }
                    kbzVar2.mo13962f();
                    return hmqVarM10465a;
                } catch (Throwable th7) {
                    ((hmr) obj4).f28357b.mo13962f();
                    throw th7;
                }
            case 14:
                Object obj5 = this.f3016a;
                lrh lrhVar = lrh.DISABLED;
                try {
                    Cursor cursorQuery = ((Context) obj5).getContentResolver().query(lri.f39086a, null, null, null, null);
                    try {
                        if (cursorQuery == null) {
                            ((nbe) ((nbe) iak.f30148a.m17252c()).mo17276G(4066)).mo17290o("Empty Mars status -- Photos may be disabled.");
                            return lrh.DISABLED;
                        }
                        cursorQuery.moveToFirst();
                        int i4 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(xRFdVyfdeve.RxX));
                        int i5 = cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("state"));
                        if (i4 > 0) {
                            if (lrh.values().length <= i5) {
                                ((nbe) ((nbe) iak.f30148a.m17252c()).mo17276G(4065)).mo17291p("Received unknown Mars status: %d", i5);
                                lrhVar = lrh.DISABLED;
                            } else {
                                lrhVar = lrh.values()[i5];
                            }
                        }
                        cursorQuery.close();
                        return lrhVar;
                    } catch (Throwable th8) {
                        if (cursorQuery != null) {
                            try {
                                cursorQuery.close();
                                break;
                            } catch (Throwable th9) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th8, th9);
                                    break;
                                } catch (Exception e4) {
                                }
                            }
                        }
                        throw th8;
                    }
                } catch (SecurityException e5) {
                    ((nbe) ((nbe) ((nbe) iak.f30148a.m17252c()).mo17283h(e5)).mo17276G((char) 4064)).mo17290o("Failed to query Mars status.");
                    return lrh.ACCESS_DENIED;
                }
            case 15:
                return Boolean.valueOf(((jzd) this.f3016a).f35231O.mo14894e(null));
            case 16:
                jyw jywVar = ((jzu) this.f3016a).f35392d;
                if (jywVar != null) {
                    synchronized (((jzs) jywVar).f35359a) {
                        int i6 = ((jzs) jywVar).f35382x;
                        if (i6 != 1 && i6 != 5) {
                            Log.e("VideoEncoder", "illegal state as " + kbd.m13921j(i6));
                        } else if (((jzs) jywVar).f35378t) {
                            ((jzs) jywVar).close();
                            ((jzs) jywVar).f35363e.m13792a(jzf.MEDIA_CODEC_ERROR_VIDEO);
                        } else {
                            if (((jzs) jywVar).f35370l) {
                                synchronized (((jzs) jywVar).f35360b) {
                                    ((jzs) jywVar).f35380v = true;
                                    MediaFormat mediaFormat = ((jzs) jywVar).f35381w;
                                    if (mediaFormat != null) {
                                        ((jzs) jywVar).m13847c(mediaFormat);
                                    }
                                    Iterator it = ((jzs) jywVar).f35379u.iterator();
                                    while (it.hasNext()) {
                                        ((jzs) jywVar).f35361c.releaseOutputBuffer(((Integer) it.next()).intValue(), false);
                                    }
                                }
                            } else {
                                ((jzs) jywVar).f35361c.start();
                            }
                            ((jzs) jywVar).m13848d(false);
                            ((jzs) jywVar).f35382x = 2;
                        }
                        break;
                    }
                }
                return null;
            case 17:
                jzu jzuVar = (jzu) this.f3016a;
                jza jzaVar = jzuVar.f35393e;
                if (jzaVar != null) {
                    synchronized (((jzd) jzaVar).f35243e) {
                        int i7 = ((jzd) jzaVar).f35232P;
                        if (i7 != 1) {
                            switch (i7) {
                                case 1:
                                    str = "READY";
                                    break;
                                case 2:
                                    str = "STARTED";
                                    break;
                                case 3:
                                    str = "STOPPED";
                                    break;
                                case 4:
                                    str = "CLOSED";
                                    break;
                                case 5:
                                    str = "PAUSED";
                                    break;
                                default:
                                    str = "null";
                                    break;
                            }
                            Log.e("AudioEncoder", "illegal state as " + str);
                        } else if (((jzd) jzaVar).f35219C) {
                            ((jzd) jzaVar).close();
                            ((jzd) jzaVar).f35252n.m13792a(jzf.MEDIA_CODEC_ERROR_AUDIO);
                        } else {
                            ((jzd) jzaVar).f35259u = 0L;
                            ((jzd) jzaVar).f35220D = ((jzd) jzaVar).f35250l.mo3830a(new ijp((jzd) jzaVar, 16), ((jzd) jzaVar).f35241c);
                            ((jzd) jzaVar).f35221E = ((jzd) jzaVar).f35260v.mo3830a(new ijp((jzd) jzaVar, 17), ((jzd) jzaVar).f35241c);
                            ((jzd) jzaVar).f35247i.mo5428c();
                            String.valueOf(((jzd) jzaVar).f35247i.getRoutedDevice());
                            ((jzd) jzaVar).f35247i.mo5426a();
                            if (((jzd) jzaVar).f35247i.mo5426a() != 3) {
                                ((jzd) jzaVar).f35249k.mo13725f();
                                ((jzd) jzaVar).f35249k.mo13730k();
                                ((jzd) jzaVar).f35252n.m13792a(jzf.AUDIO_TRACK_FAIL_TO_START);
                                ((jzd) jzaVar).close();
                            } else {
                                ((jzd) jzaVar).f35232P = 2;
                                if (((jzd) jzaVar).f35253o) {
                                    synchronized (((jzd) jzaVar).f35244f) {
                                        ((jzd) jzaVar).f35222F = true;
                                        Iterator it2 = ((jzd) jzaVar).f35224H.iterator();
                                        while (it2.hasNext()) {
                                            ((jzd) jzaVar).m13783e(((jzd) jzaVar).f35248j, ((Integer) it2.next()).intValue());
                                        }
                                        Iterator it3 = ((jzd) jzaVar).f35225I.iterator();
                                        while (it3.hasNext()) {
                                            ((jzd) jzaVar).f35248j.releaseOutputBuffer(((Integer) it3.next()).intValue(), false);
                                        }
                                        ((jzd) jzaVar).m13784f(((jzd) jzaVar).f35223G);
                                    }
                                } else {
                                    ((jzd) jzaVar).f35248j.start();
                                }
                            }
                        }
                        break;
                    }
                    jyz jyzVar = jzuVar.f35399k;
                    if (jyzVar != null) {
                        jyzVar.mo5566b(jzuVar.f35398j);
                    }
                }
                return null;
            case 18:
                Iterator it4 = ((jzu) this.f3016a).f35394f.values().iterator();
                while (it4.hasNext()) {
                    ((jyr) it4.next()).mo5579j();
                }
                return null;
            case 19:
                Iterator it5 = ((jzu) this.f3016a).f35394f.values().iterator();
                while (it5.hasNext()) {
                    ((jyr) it5.next()).mo5580k();
                }
                return null;
            default:
                Object obj6 = this.f3016a;
                synchronized (((kae) obj6).f35459a) {
                    int i8 = ((kae) obj6).f35462d;
                    if (i8 != 2) {
                        Log.e("VidRecMedRec", "STARTED is expected but we get " + kbd.m13919h(i8));
                    } else {
                        ((kae) obj6).f35460b.mo5590c();
                        ((kae) obj6).f35462d = 4;
                    }
                }
                return null;
        }
    }
}
