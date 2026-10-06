package p000;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.android.apps.camera.legacy.lightcycle.storage.LocalSessionStorage;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.android.material.behavior.iWN.zuAgeeF;
import com.google.android.material.snackbar.VMX.rgoX;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class eyb implements gqs {

    /* JADX INFO: renamed from: c */
    private static final nbh f20940c = nbh.m17259h("com/google/android/apps/camera/legacy/lightcycle/panorama/processing/LightCycleStitchTask");

    /* JADX INFO: renamed from: a */
    public final LocalSessionStorage f20941a;

    /* JADX INFO: renamed from: d */
    private final String f20943d;

    /* JADX INFO: renamed from: e */
    private final File f20944e;

    /* JADX INFO: renamed from: h */
    private final List f20947h;

    /* JADX INFO: renamed from: i */
    private final fcp f20948i;

    /* JADX INFO: renamed from: j */
    private final dzr f20949j;

    /* JADX INFO: renamed from: k */
    private final int f20950k;

    /* JADX INFO: renamed from: l */
    private final dyy f20951l;

    /* JADX INFO: renamed from: f */
    private final Semaphore f20945f = new Semaphore(0);

    /* JADX INFO: renamed from: g */
    private volatile boolean f20946g = false;

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f20942b = new AtomicBoolean();

    public eyb(LocalSessionStorage localSessionStorage, fcp fcpVar, dzr dzrVar, dyy dyyVar) {
        this.f20941a = localSessionStorage;
        this.f20948i = fcpVar;
        this.f20943d = localSessionStorage.f6804e;
        gxx gxxVar = localSessionStorage.f6801b;
        this.f20944e = gxxVar.f26777d.m9999a();
        gxxVar.mo9913s();
        this.f20950k = localSessionStorage.f6809j;
        this.f20949j = dzrVar;
        this.f20951l = dyyVar;
        this.f20947h = new ArrayList();
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ gqr mo7363a() {
        return this.f20941a.f6801b;
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: b */
    public final String mo7364b() {
        return zuAgeeF.nXyOUMs.concat(String.valueOf(String.valueOf(this.f20941a.f6801b.mo9902h())));
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: c */
    public final void mo7365c(kao kaoVar) {
        kaoVar.getClass();
        this.f20947h.add(kaoVar);
    }

    /* JADX WARN: Code duplicated, block: B:220:0x05af A[Catch: bfc -> 0x061f, all -> 0x0625, TryCatch #8 {bfc -> 0x061f, blocks: (B:160:0x03a3, B:162:0x03bb, B:163:0x03cf, B:165:0x03d5, B:167:0x03ed, B:168:0x03f6, B:170:0x0404, B:171:0x040d, B:173:0x041b, B:174:0x0424, B:176:0x0432, B:177:0x043b, B:179:0x0449, B:180:0x0453, B:182:0x0461, B:183:0x046b, B:185:0x0479, B:186:0x0483, B:188:0x0491, B:189:0x049b, B:191:0x04a9, B:192:0x04b3, B:194:0x04c1, B:195:0x04cb, B:197:0x04d9, B:201:0x04ed, B:204:0x0503, B:207:0x051a, B:209:0x052e, B:211:0x0542, B:213:0x055a, B:216:0x0567, B:217:0x0585, B:218:0x05a9, B:220:0x05af, B:221:0x05b8, B:223:0x05be, B:226:0x05d3, B:229:0x05da, B:230:0x05dd, B:232:0x05e5, B:241:0x05f4, B:240:0x05f1, B:251:0x0602, B:250:0x05ff, B:254:0x0605, B:256:0x0612), top: B:302:0x03a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x05d3 A[Catch: IOException -> 0x0603, FileNotFoundException -> 0x0611, bfc -> 0x061f, all -> 0x0625, TRY_ENTER, TRY_LEAVE, TryCatch #8 {bfc -> 0x061f, blocks: (B:160:0x03a3, B:162:0x03bb, B:163:0x03cf, B:165:0x03d5, B:167:0x03ed, B:168:0x03f6, B:170:0x0404, B:171:0x040d, B:173:0x041b, B:174:0x0424, B:176:0x0432, B:177:0x043b, B:179:0x0449, B:180:0x0453, B:182:0x0461, B:183:0x046b, B:185:0x0479, B:186:0x0483, B:188:0x0491, B:189:0x049b, B:191:0x04a9, B:192:0x04b3, B:194:0x04c1, B:195:0x04cb, B:197:0x04d9, B:201:0x04ed, B:204:0x0503, B:207:0x051a, B:209:0x052e, B:211:0x0542, B:213:0x055a, B:216:0x0567, B:217:0x0585, B:218:0x05a9, B:220:0x05af, B:221:0x05b8, B:223:0x05be, B:226:0x05d3, B:229:0x05da, B:230:0x05dd, B:232:0x05e5, B:241:0x05f4, B:240:0x05f1, B:251:0x0602, B:250:0x05ff, B:254:0x0605, B:256:0x0612), top: B:302:0x03a3, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x05d7 A[Catch: all -> 0x05f7, TRY_ENTER, TRY_LEAVE, TryCatch #17 {all -> 0x05f7, blocks: (B:224:0x05c3, B:228:0x05d7), top: B:311:0x05c3 }] */
    /* JADX WARN: Code duplicated, block: B:321:0x05be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.gqs
    /* JADX INFO: renamed from: d */
    public final void mo7366d(Context context) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        HashMap map;
        boolean z;
        boolean z2;
        boolean z3;
        FileInputStream fileInputStream;
        List listM14800f;
        byte[] bArrM14803i;
        FileOutputStream fileOutputStream;
        eyb eybVar = this;
        eybVar.f20942b.set(false);
        try {
            m8039h();
            Object obj = exh.f20734a;
            int iCreateNewStitchingSession = LightCycleNative.CreateNewStitchingSession();
            File file = eybVar.f20944e;
            long length = file.length();
            eybVar.f20941a.f6801b.mo9652b(kbb.f35513b);
            exh.f20736c.put(Integer.valueOf(iCreateNewStitchingSession), new eya(eybVar, length, file));
            long jUptimeMillis = SystemClock.uptimeMillis();
            LightCycleNative.RenderNextSession(iCreateNewStitchingSession);
            String str = eybVar.f20941a.f6807h;
            int i = eyr.f21002a;
            int i2 = 2;
            try {
                bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                try {
                    map = new HashMap();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            String[] strArrSplit = line.split(",", 2);
                            if (strArrSplit.length == 2) {
                                map.put(strArrSplit[0], strArrSplit[1].trim());
                            }
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                            }
                        }
                    }
                    bufferedReader2.close();
                } catch (IOException e2) {
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                            map = null;
                        } catch (IOException e3) {
                            map = null;
                        }
                    } else {
                        map = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader == null) {
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (IOException e4) {
                        throw th;
                    }
                }
            } catch (IOException e5) {
                bufferedReader2 = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
            }
            float f = 0.0f;
            if (map != null) {
                try {
                    f = (Integer.parseInt((String) map.get("cropped_area_width")) / Integer.parseInt((String) map.get("full_pano_width"))) * 360.0f;
                } catch (NumberFormatException e6) {
                }
            }
            int i3 = eybVar.f20950k;
            if (i3 != 2) {
                z = false;
            } else if (f == 360.0f) {
                z = true;
                i3 = 2;
            } else {
                z = false;
                i3 = 2;
            }
            if (i3 != 1 || f < 70.0f) {
                z2 = z;
            } else {
                z2 = true;
            }
            long jUptimeMillis2 = SystemClock.uptimeMillis() - jUptimeMillis;
            int i4 = eybVar.f20950k;
            int i5 = 12;
            if (i4 != 2) {
                i2 = 3;
                if (i4 != 3) {
                    i2 = 5;
                    if (i4 != 5) {
                        i2 = 4;
                        if (i4 != 4) {
                            i5 = 6;
                            i2 = 1;
                        }
                    }
                }
            }
            eybVar.f20948i.mo8176au(i5, i2, jUptimeMillis2 * 0.001f, f);
            boolean z4 = eybVar.f20950k == 1 || z;
            gyu gyuVarMo9902h = eybVar.f20941a.f6801b.mo9902h();
            mrm mrmVarM6953b = eybVar.f20951l.m6953b(gyuVarMo9902h);
            mrm mrmVarM16829i = mqu.f41450a;
            if (mrmVarM6953b.mo16813g()) {
                long j = ((dyw) mrmVarM6953b.mo16809c()).f12937a.f26865a;
                mrm mrmVarMo6972a = eybVar.f20949j.mo6972a(j);
                if (mrmVarMo6972a.mo16813g()) {
                    mrmVarM16829i = mrm.m16829i(((dzk) mrmVarMo6972a.mo16809c()).m6969d());
                } else {
                    ((nbe) ((nbe) f20940c.m17251b()).mo17276G(2048)).mo17292q("special type not found for mediastore id = %d", j);
                }
            } else {
                ((nbe) ((nbe) f20940c.m17251b()).mo17276G((char) 2047)).mo17293r("no processing media found for shot %s", gyuVarMo9902h);
            }
            long jMo9898d = eybVar.f20941a.f6801b.mo9898d();
            String path = eybVar.f20944e.getPath();
            String str2 = eybVar.f20943d;
            boolean z5 = eybVar.f20950k == 1;
            if (path != null) {
                try {
                    if (new File(path).exists()) {
                        File[] fileArrListFiles = new File(str2).listFiles(new FilenameFilter() { // from class: eyq
                            @Override // java.io.FilenameFilter
                            public final boolean accept(File file2, String str3) {
                                int i6 = eyr.f21002a;
                                return str3.toLowerCase().endsWith(".jpg");
                            }
                        });
                        String absolutePath = fileArrListFiles.length > 0 ? fileArrListFiles[0].getAbsolutePath() : null;
                        try {
                            ExifInterface exifInterface = new ExifInterface(path);
                            if (absolutePath != null) {
                                exifInterface.setAttribute("Make", new ExifInterface(absolutePath).getAttribute("Make"));
                            } else {
                                exifInterface.setAttribute("Make", Build.MANUFACTURER);
                            }
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(path, options);
                            exifInterface.setAttribute("ImageWidth", String.valueOf(options.outWidth));
                            exifInterface.setAttribute("ImageLength", String.valueOf(options.outHeight));
                            TimeZone timeZone = TimeZone.getDefault();
                            Date date = new Date(jMo9898d);
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
                            simpleDateFormat.setTimeZone(timeZone);
                            String str3 = simpleDateFormat.format(date);
                            String strM14164A = kfv.m14164A(jMo9898d);
                            int offset = timeZone.getOffset(jMo9898d);
                            int iAbs = Math.abs(offset);
                            StringBuilder sb = new StringBuilder();
                            String str4 = "-";
                            if (offset >= 0) {
                                str4 = "+";
                            }
                            sb.append(str4);
                            z3 = z5;
                            long j2 = iAbs;
                            try {
                                sb.append(kfv.m14165B(TimeUnit.MILLISECONDS.toHours(j2)));
                                sb.append(":");
                                sb.append(kfv.m14165B(TimeUnit.MILLISECONDS.toMinutes(j2) % 60));
                                String string = sb.toString();
                                exifInterface.setAttribute("DateTime", str3);
                                exifInterface.setAttribute("DateTimeOriginal", str3);
                                exifInterface.setAttribute("DateTimeDigitized", str3);
                                exifInterface.setAttribute(KMNlNMe.WaHlOyhRqEIIHpM, strM14164A);
                                exifInterface.setAttribute("SubSecTimeOriginal", strM14164A);
                                exifInterface.setAttribute("SubSecTimeDigitized", strM14164A);
                                exifInterface.setAttribute("OffsetTime", string);
                                exifInterface.setAttribute("OffsetTimeOriginal", string);
                                exifInterface.setAttribute("OffsetTimeDigitized", string);
                                exifInterface.setAttribute("Model", Build.MODEL);
                                if (map != null) {
                                    Iterator it = map.entrySet().iterator();
                                    Double dM8052a = null;
                                    Double dM8052a2 = null;
                                    Double dM8052a3 = null;
                                    Date dateM8056e = null;
                                    while (it.hasNext()) {
                                        Map.Entry entry = (Map.Entry) it.next();
                                        it = it;
                                        if (((String) entry.getKey()).equals("location_altitude")) {
                                            dM8052a = eyr.m8052a(entry);
                                        } else if (((String) entry.getKey()).equals("location_latitude")) {
                                            dM8052a2 = eyr.m8052a(entry);
                                        } else if (((String) entry.getKey()).equals("location_longitude")) {
                                            dM8052a3 = eyr.m8052a(entry);
                                        } else if (((String) entry.getKey()).equals("location_provider")) {
                                            exifInterface.setAttribute("GPSProcessingMethod", (String) entry.getValue());
                                        } else if (((String) entry.getKey()).equals("location_time")) {
                                            dateM8056e = eyr.m8056e(entry);
                                        }
                                    }
                                    if (dM8052a != null) {
                                        exifInterface.setAttribute("GPSAltitudeRef", dM8052a.doubleValue() < 0.0d ? wUzNh.tuhTnCkq : "0");
                                    }
                                    if (dM8052a2 != null && dM8052a3 != null) {
                                        String strM8054c = eyr.m8054c(dM8052a2.doubleValue());
                                        String str5 = dM8052a2.doubleValue() >= 0.0d ? "N" : "S";
                                        String strM8054c2 = eyr.m8054c(dM8052a3.doubleValue());
                                        String str6 = dM8052a3.doubleValue() >= 0.0d ? "E" : "W";
                                        if (strM8054c != null && strM8054c2 != null) {
                                            exifInterface.setAttribute(xRFdVyfdeve.nIRGzk, strM8054c);
                                            exifInterface.setAttribute("GPSLatitudeRef", str5);
                                            exifInterface.setAttribute("GPSLongitude", strM8054c2);
                                            exifInterface.setAttribute("GPSLongitudeRef", str6);
                                        }
                                    }
                                    if (dateM8056e != null) {
                                        TimeZone timeZone2 = DesugarTimeZone.getTimeZone("UTC");
                                        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy:MM:dd", Locale.US);
                                        simpleDateFormat2.setTimeZone(timeZone2);
                                        exifInterface.setAttribute("GPSDateStamp", simpleDateFormat2.format(dateM8056e));
                                        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("HH:mm:ss", Locale.US);
                                        simpleDateFormat3.setTimeZone(timeZone2);
                                        exifInterface.setAttribute("GPSTimeStamp", simpleDateFormat3.format(dateM8056e));
                                    }
                                }
                                exifInterface.saveAttributes();
                            } catch (IOException e7) {
                            }
                        } catch (IOException e8) {
                            z3 = z5;
                        }
                        if (z4 || mrmVarM16829i.mo16813g()) {
                            int i6 = ksh.f37114a;
                            bfd bfdVarM2301a = bff.m2301a();
                            if (z4) {
                                try {
                                    bfdVarM2301a.mo2299j("UsePanoramaViewer", z2);
                                    bfdVarM2301a.mo2299j("IsPhotosphere", z3);
                                    bfdVarM2301a.mo2292c("http://ns.google.com/photos/1.0/panorama/", HEePJw.CnQAoOetGbh, HRLmc.UftIvGoUo);
                                    if (map != null) {
                                        Iterator it2 = map.entrySet().iterator();
                                        Integer numM8053b = null;
                                        Integer numM8053b2 = null;
                                        Integer numM8053b3 = null;
                                        Integer numM8053b4 = null;
                                        Integer numM8053b5 = null;
                                        Integer numM8053b6 = null;
                                        Date dateM8056e2 = null;
                                        Date dateM8056e3 = null;
                                        Integer numM8053b7 = null;
                                        Integer numM8053b8 = null;
                                        Integer numM8053b9 = null;
                                        while (it2.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                            it2 = it2;
                                            if (((String) entry2.getKey()).equals("full_pano_width")) {
                                                numM8053b3 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("full_pano_height")) {
                                                numM8053b4 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("cropped_area_width")) {
                                                numM8053b = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("cropped_area_height")) {
                                                numM8053b2 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("cropped_area_top")) {
                                                numM8053b5 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("cropped_area_left")) {
                                                numM8053b6 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("first_photo_time")) {
                                                dateM8056e2 = eyr.m8056e(entry2);
                                            } else if (((String) entry2.getKey()).equals("last_photo_time")) {
                                                dateM8056e3 = eyr.m8056e(entry2);
                                            } else if (((String) entry2.getKey()).equals("source_photos_count")) {
                                                numM8053b7 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("pose_heading")) {
                                                numM8053b8 = eyr.m8053b(entry2);
                                            } else if (((String) entry2.getKey()).equals("yaw_correction_deg")) {
                                                numM8053b9 = eyr.m8053b(entry2);
                                            }
                                        }
                                        if (numM8053b != null && numM8053b2 != null) {
                                            bfdVarM2301a.mo2300k("CroppedAreaImageHeightPixels", numM8053b2.intValue());
                                            bfdVarM2301a.mo2300k("CroppedAreaImageWidthPixels", numM8053b.intValue());
                                        }
                                        if (numM8053b3 != null && numM8053b4 != null) {
                                            bfdVarM2301a.mo2300k("FullPanoHeightPixels", numM8053b4.intValue());
                                            bfdVarM2301a.mo2300k(rgoX.qEngdlzyIwgYa, numM8053b3.intValue());
                                        }
                                        if (numM8053b5 != null && numM8053b6 != null) {
                                            bfdVarM2301a.mo2300k("CroppedAreaTopPixels", numM8053b5.intValue());
                                            bfdVarM2301a.mo2300k("CroppedAreaLeftPixels", numM8053b6.intValue());
                                        }
                                        if (dateM8056e2 != null) {
                                            bfdVarM2301a.mo2292c("http://ns.google.com/photos/1.0/panorama/", "FirstPhotoDate", new bfl(dateM8056e2, DesugarTimeZone.getTimeZone("GMT")));
                                        }
                                        if (dateM8056e3 != null) {
                                            ((bfr) bfdVarM2301a).mo2293d("http://ns.google.com/photos/1.0/panorama/", "LastPhotoDate", new bfl(dateM8056e3, DesugarTimeZone.getTimeZone("GMT")), null);
                                        }
                                        if (numM8053b7 != null) {
                                            bfdVarM2301a.mo2300k("SourcePhotosCount", numM8053b7.intValue());
                                        }
                                        if (numM8053b8 != null && numM8053b9 != null) {
                                            ((bfr) bfdVarM2301a).mo2293d("http://ns.google.com/photos/1.0/panorama/", "PoseHeadingDegrees", new Double(((numM8053b8.intValue() + numM8053b9.intValue()) + 720) % 360), null);
                                        }
                                    }
                                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                                    options2.inJustDecodeBounds = true;
                                    BitmapFactory.decodeFile(path, options2);
                                    int i7 = options2.outWidth;
                                    int i8 = options2.outHeight;
                                    bfdVarM2301a.mo2300k("LargestValidInteriorRectLeft", 0);
                                    bfdVarM2301a.mo2300k("LargestValidInteriorRectTop", 0);
                                    bfdVarM2301a.mo2300k("LargestValidInteriorRectWidth", i7);
                                    bfdVarM2301a.mo2300k("LargestValidInteriorRectHeight", i8);
                                    if (mrmVarM16829i.mo16813g()) {
                                        ksh.m14804j(bfdVarM2301a, (String) mrmVarM16829i.mo16809c());
                                    }
                                    if (ksh.m14802h(path)) {
                                        try {
                                            fileInputStream = new FileInputStream(path);
                                            try {
                                                listM14800f = ksh.m14800f(new ksf(fileInputStream), false, false);
                                                bArrM14803i = ksh.m14803i(bfdVarM2301a);
                                                if (bArrM14803i == null) {
                                                    fileInputStream.close();
                                                } else {
                                                    ksh.m14795a(listM14800f, bArrM14803i);
                                                    fileInputStream.close();
                                                    try {
                                                        fileOutputStream = new FileOutputStream(path);
                                                        try {
                                                            ksh.m14801g(fileOutputStream, listM14800f);
                                                            fileOutputStream.close();
                                                        } catch (Throwable th4) {
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th4, th5);
                                                                throw th4;
                                                            }
                                                        }
                                                    } catch (IOException e9) {
                                                    }
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    fileInputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th6, th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (FileNotFoundException e10) {
                                            Log.e("XmpUtil", "Could not find file: ".concat(path), e10);
                                        } catch (IOException e11) {
                                            Log.e("XmpUtil", "Could not read file: ".concat(path), e11);
                                        }
                                    }
                                } catch (bfc e12) {
                                    e12.getLocalizedMessage();
                                }
                            } else {
                                if (mrmVarM16829i.mo16813g()) {
                                    ksh.m14804j(bfdVarM2301a, (String) mrmVarM16829i.mo16809c());
                                }
                                if (ksh.m14802h(path)) {
                                    fileInputStream = new FileInputStream(path);
                                    listM14800f = ksh.m14800f(new ksf(fileInputStream), false, false);
                                    bArrM14803i = ksh.m14803i(bfdVarM2301a);
                                    if (bArrM14803i == null) {
                                        fileInputStream.close();
                                    } else {
                                        ksh.m14795a(listM14800f, bArrM14803i);
                                        fileInputStream.close();
                                        fileOutputStream = new FileOutputStream(path);
                                        ksh.m14801g(fileOutputStream, listM14800f);
                                        fileOutputStream.close();
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    eybVar = this;
                    Throwable th9 = th;
                    synchronized (eybVar.f20942b) {
                        eybVar.f20942b.set(true);
                        eybVar.f20941a.f6801b.mo9869A();
                        eybVar.f20941a.f6801b.m9930G();
                        Iterator it3 = mws.m17095j(eybVar.f20947h).iterator();
                        while (it3.hasNext()) {
                            ((kao) it3.next()).mo3483a(eybVar);
                        }
                    }
                    throw th9;
                }
            }
            synchronized (this.f20942b) {
                this.f20942b.set(true);
                this.f20941a.f6801b.mo9869A();
                this.f20941a.f6801b.m9930G();
                Iterator it4 = mws.m17095j(this.f20947h).iterator();
                while (it4.hasNext()) {
                    ((kao) it4.next()).mo3483a(this);
                }
            }
        } catch (Throwable th10) {
            th = th10;
        }
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: e */
    public final void mo7367e(kao kaoVar) {
        kaoVar.getClass();
        this.f20947h.remove(kaoVar);
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: f */
    public final synchronized void mo7368f() {
        this.f20946g = false;
        this.f20945f.release();
    }

    @Override // p000.gqs
    /* JADX INFO: renamed from: g */
    public final synchronized void mo7369g() {
        this.f20945f.drainPermits();
        this.f20946g = true;
    }

    /* JADX INFO: renamed from: h */
    public final void m8039h() {
        if (this.f20946g) {
            try {
                this.f20945f.acquire();
            } catch (InterruptedException e) {
                ((nbe) ((nbe) ((nbe) f20940c.m17252c()).mo17283h(e)).mo17276G((char) 2049)).mo17290o("Failed to acquire waitLock.");
            }
        }
    }
}
