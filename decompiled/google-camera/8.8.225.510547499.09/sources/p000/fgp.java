package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgp implements hjk {

    /* JADX INFO: renamed from: a */
    private static final nbh f21923a = nbh.m17259h("com/google/android/apps/camera/microvideo/ScanAndPublishPendingVideosBehavior");

    /* JADX INFO: renamed from: c */
    private final Context f21925c;

    /* JADX INFO: renamed from: d */
    private final kqv f21926d;

    /* JADX INFO: renamed from: e */
    private final fcp f21927e;

    /* JADX INFO: renamed from: g */
    private final boolean f21929g;

    /* JADX INFO: renamed from: b */
    private final AtomicBoolean f21924b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    private final long f21928f = (System.currentTimeMillis() / 1000) - 5;

    public fgp(Context context, kqv kqvVar, dhv dhvVar, fcp fcpVar) {
        this.f21925c = context;
        this.f21926d = kqvVar;
        this.f21927e = fcpVar;
        this.f21929g = dhvVar.mo6184l(dii.f11550z);
    }

    /* JADX WARN: Code duplicated, block: B:114:? A[Catch: all -> 0x021d, SYNTHETIC, TRY_LEAVE, TryCatch #8 {all -> 0x021d, blocks: (B:3:0x0002, B:6:0x000c, B:66:0x01f4, B:78:0x021c, B:77:0x0219, B:73:0x0213, B:8:0x0059, B:10:0x005f, B:12:0x006b, B:13:0x0071, B:19:0x00b6, B:27:0x00f1, B:48:0x012b, B:47:0x0128, B:50:0x012d, B:51:0x014a, B:52:0x014e, B:55:0x015e, B:57:0x01c3, B:58:0x01c6, B:60:0x01d8, B:61:0x01db, B:65:0x01f3, B:70:0x01fb, B:53:0x014f, B:54:0x015d), top: B:97:0x0002, inners: #3, #4 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0213 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            if (this.f21924b.getAndSet(true)) {
                return;
            }
            ContentResolver contentResolver = this.f21925c.getContentResolver();
            String packageName = this.f21925c.getPackageName();
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-match-pending", 3);
            bundle.putString("android:query-arg-sql-selection", "owner_package_name = ? AND date_added < " + this.f21928f);
            bundle.putStringArray("android:query-arg-sql-selection-args", new String[]{packageName});
            Cursor cursorQuery = contentResolver.query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "date_added"}, bundle, null);
            try {
                if (cursorQuery == null) {
                    ((nbe) ((nbe) f21923a.m17252c()).mo17276G(2237)).mo17290o("Got null cursor while restoring videos");
                    return;
                }
                while (cursorQuery.moveToNext()) {
                    int i = cursorQuery.getInt(0);
                    long j = cursorQuery.getLong(1);
                    if (this.f21929g) {
                        try {
                            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f21925c.getContentResolver().openFileDescriptor(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), "r", null);
                            if (parcelFileDescriptorOpenFileDescriptor == null) {
                                try {
                                    ((nbe) ((nbe) f21923a.m17252c()).mo17276G(2242)).mo17291p("Could not inspect video id %d as openFileDescriptor returned null", i);
                                } catch (Throwable th) {
                                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                                        try {
                                            parcelFileDescriptorOpenFileDescriptor.close();
                                        } catch (Throwable th2) {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                                if (statSize >= 200000) {
                                    try {
                                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                                        try {
                                            if (kyg.m15050c(fileInputStream).m15054f("mdat").f37721a.mo16813g()) {
                                                fileInputStream.close();
                                                parcelFileDescriptorOpenFileDescriptor.close();
                                            } else {
                                                ((nbe) ((nbe) f21923a.m17252c()).mo17276G(2240)).mo17291p("Not restoring video id %d since it does not have an mdat box", i);
                                                fileInputStream.close();
                                            }
                                        } catch (Throwable th3) {
                                            try {
                                                fileInputStream.close();
                                            } catch (Throwable th4) {
                                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                            }
                                            throw th3;
                                        }
                                    } catch (kyf e) {
                                        ((nbe) ((nbe) ((nbe) f21923a.m17252c()).mo17283h(e)).mo17276G(2239)).mo17291p("Not restoring video id %d due to invalid boxes", i);
                                    }
                                    if (cursorQuery != null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th5) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th5);
                                        throw th;
                                    }
                                }
                                ((nbe) ((nbe) f21923a.m17252c()).mo17276G(2241)).mo17295t("Not restoring video id %d since it is too small (size: %d)", i, statSize);
                                parcelFileDescriptorOpenFileDescriptor.close();
                            }
                        } catch (FileNotFoundException e2) {
                            ((nbe) ((nbe) ((nbe) f21923a.m17252c()).mo17283h(e2)).mo17276G(2238)).mo17291p("Could not inspect video id %d as the file is not found", i);
                        }
                    }
                    DateFormat dateFormat = this.f21926d.f36966k;
                    synchronized (dateFormat) {
                        str = dateFormat.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j)));
                    }
                    String str2 = this.f21926d.f36958c + str + ".RESTORED";
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("is_pending", (Integer) 0);
                    contentValues.put("_display_name", str2);
                    contentResolver.update(ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, i), contentValues, null, null);
                    ((nbe) ((nbe) f21923a.m17252c()).mo17276G(2236)).mo17291p("Published still-pending video id %s", i);
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - j;
                    fcp fcpVar = this.f21927e;
                    nxl nxlVarM18137O = njp.f43055d.m18137O();
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar = nxlVarM18137O.f44974b;
                    njp njpVar = (njp) nxqVar;
                    njpVar.f43057a |= 1;
                    njpVar.f43058b = seconds;
                    if (!nxqVar.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    njp njpVar2 = (njp) nxlVarM18137O.f44974b;
                    njpVar2.f43059c = 3;
                    njpVar2.f43057a |= 2;
                    fcpVar.mo8189i((njp) nxlVarM18137O.mo18103l());
                }
                cursorQuery.close();
                return;
            } catch (Throwable th6) {
                if (cursorQuery != null) {
                    throw th6;
                }
                cursorQuery.close();
                throw th6;
            }
            ((nbe) ((nbe) ((nbe) f21923a.m17251b()).mo17283h(th)).mo17276G((char) 2235)).mo17290o(xRFdVyfdeve.yqytahIH);
        } catch (Throwable th7) {
            ((nbe) ((nbe) ((nbe) f21923a.m17251b()).mo17283h(th7)).mo17276G((char) 2235)).mo17290o(xRFdVyfdeve.yqytahIH);
        }
    }
}
