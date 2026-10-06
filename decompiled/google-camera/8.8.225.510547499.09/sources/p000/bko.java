package p000;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.InitParams;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bko {

    /* JADX INFO: renamed from: a */
    public final Object f3652a;

    public bko() {
        this.f3652a = null;
    }

    public bko(Activity activity) {
        this.f3652a = activity;
    }

    public bko(Context context) {
        this.f3652a = context;
    }

    public bko(PointF pointF) {
        this.f3652a = pointF;
    }

    public bko(bkn bknVar) {
        this.f3652a = bknVar;
    }

    public bko(Gcam gcam) {
        this.f3652a = gcam;
    }

    public bko(dhv dhvVar) {
        dhx dhxVar = dhf.f11040a;
        dhvVar.mo6178f();
        dhvVar.mo6177e();
        this.f3652a = new cfq(null);
    }

    public bko(dhv dhvVar, kbn kbnVar) {
        this.f3652a = dhvVar;
        kbnVar.mo6314a("StrictModePolicy");
    }

    public bko(dhv dhvVar, byte[] bArr) {
        this.f3652a = dhvVar;
    }

    public bko(ebv ebvVar) {
        this.f3652a = mvi.m17027c(ebvVar.f13300b);
    }

    public bko(fet fetVar) {
        this.f3652a = fetVar;
    }

    public bko(glk glkVar, byte[] bArr) {
        this.f3652a = glkVar;
    }

    public bko(Object obj) {
        this.f3652a = obj;
    }

    public bko(List list) {
        this.f3652a = list;
    }

    public bko(byte[] bArr) {
        this.f3652a = new HashMap();
    }

    public bko(byte[] bArr, byte[] bArr2) {
        this.f3652a = new HashMap();
    }

    public bko(byte[] bArr, short[] sArr) {
        this.f3652a = new jwf(false);
    }

    public bko(int[] iArr) {
        this.f3652a = new HashMap();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:69:0x0137  */
    /* JADX WARN: Code duplicated, block: B:70:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:80:0x016d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0173  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x019f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    /* JADX INFO: renamed from: A */
    public final boolean m2605A(Context context, chp chpVar) {
        fer ferVar;
        boolean z;
        String path;
        boolean zM8315b;
        int iM8314a;
        int iM8314a2;
        int iM8314a3;
        int iM8314a4;
        boolean z2;
        boolean z3;
        boolean z4;
        BitmapFactory.Options options;
        InputStream inputStreamM8356b;
        int i;
        int i2;
        int i3;
        boolean z5;
        double d;
        double d2;
        double d3;
        fer ferVar2;
        double d4;
        double d5;
        double d6;
        few fewVar;
        fer ferVarM8312a = fes.m8312a();
        if (chpVar.mo3734c().equals(chr.PHOTO)) {
            Uri uriMo3743c = chpVar.mo3733b().mo3743c();
            ContentResolver contentResolver = context.getContentResolver();
            fev fevVar = null;
            if ("content".equals(uriMo3743c.getScheme())) {
                Cursor cursorQuery = contentResolver.query(uriMo3743c, new String[]{"_data"}, null, null, null);
                if (cursorQuery == null) {
                    path = null;
                } else {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_data");
                        if (cursorQuery.moveToFirst()) {
                            String string = cursorQuery.getString(columnIndexOrThrow);
                            cursorQuery.close();
                            path = string;
                        } else {
                            cursorQuery.close();
                            path = null;
                        }
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
            } else {
                path = uriMo3743c.getPath();
            }
            if (path == null) {
                fewVar = fex.f21589a;
                ferVar2 = ferVarM8312a;
            } else {
                InputStream inputStreamM8356b2 = ffp.m8356b(path);
                if (inputStreamM8356b2 == null) {
                    ferVar2 = ferVarM8312a;
                } else {
                    bfd bfdVarM14805k = ksh.m14805k(inputStreamM8356b2);
                    try {
                        inputStreamM8356b2.close();
                    } catch (IOException e) {
                        ((nbe) ((nbe) fev.f21578a.m17251b()).mo17276G((char) 2170)).mo17293r("Failed to close stream: %s", e);
                    }
                    if (bfdVarM14805k != null) {
                        try {
                            fev.m8317d(bfdVarM14805k, "FirstPhotoDate");
                            fev.m8317d(bfdVarM14805k, "LastPhotoDate");
                            fev.m8314a(bfdVarM14805k, "SourcePhotosCount");
                            if (bfdVarM14805k.mo2294e("http://ns.google.com/photos/1.0/panorama/", "ProjectionType")) {
                            }
                            zM8315b = fev.m8315b(bfdVarM14805k, "UsePanoramaViewer");
                            try {
                                iM8314a = fev.m8314a(bfdVarM14805k, "CroppedAreaImageWidthPixels");
                                try {
                                    iM8314a2 = fev.m8314a(bfdVarM14805k, "CroppedAreaImageHeightPixels");
                                    try {
                                        iM8314a3 = fev.m8314a(bfdVarM14805k, "FullPanoWidthPixels");
                                        try {
                                            iM8314a4 = fev.m8314a(bfdVarM14805k, "FullPanoHeightPixels");
                                            try {
                                                fev.m8314a(bfdVarM14805k, "CroppedAreaLeftPixels");
                                                fev.m8314a(bfdVarM14805k, "CroppedAreaTopPixels");
                                                fev.m8314a(bfdVarM14805k, "LargestValidInteriorRectLeft");
                                                fev.m8314a(bfdVarM14805k, "LargestValidInteriorRectTop");
                                                fev.m8314a(bfdVarM14805k, "LargestValidInteriorRectWidth");
                                                fev.m8314a(bfdVarM14805k, "LargestValidInteriorRectHeight");
                                                boolean zM8315b2 = bfdVarM14805k.mo2294e("http://ns.google.com/photos/1.0/panorama/", "IsPhotosphere") ? fev.m8315b(bfdVarM14805k, "IsPhotosphere") : fev.m8315b(bfdVarM14805k, "UsePanoramaViewer");
                                                z3 = iM8314a > 0 && iM8314a2 > 0 && iM8314a3 > 0 && iM8314a4 > 0;
                                                z4 = zM8315b2;
                                                z2 = zM8315b;
                                            } catch (bfc e2) {
                                                z2 = zM8315b;
                                                z3 = false;
                                                z4 = false;
                                            }
                                        } catch (bfc e3) {
                                            iM8314a4 = 0;
                                            z2 = zM8315b;
                                            z3 = false;
                                            z4 = false;
                                            options = new BitmapFactory.Options();
                                            options.inJustDecodeBounds = true;
                                            inputStreamM8356b = ffp.m8356b(path);
                                            if (inputStreamM8356b == null) {
                                                ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2169)).mo17290o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                                ferVar2 = ferVarM8312a;
                                            } else {
                                                BitmapFactory.decodeStream(inputStreamM8356b, null, options);
                                                try {
                                                    inputStreamM8356b.close();
                                                } catch (IOException e4) {
                                                    ((nbe) ((nbe) fev.f21578a.m17251b()).mo17276G((char) 2168)).mo17293r("Failed to close stream: %s", e4);
                                                }
                                                i = options.outWidth;
                                                i2 = options.outHeight;
                                                i3 = i2 + i2;
                                                if (z3) {
                                                    z5 = false;
                                                } else if (i3 == i) {
                                                    z5 = true;
                                                } else {
                                                    ferVar2 = ferVarM8312a;
                                                }
                                                d = i2;
                                                d2 = iM8314a;
                                                d3 = iM8314a2;
                                                if (z5) {
                                                    ferVar2 = ferVarM8312a;
                                                } else {
                                                    ferVar2 = ferVarM8312a;
                                                    d6 = i;
                                                    Double.isNaN(d2);
                                                    Double.isNaN(d3);
                                                    Double.isNaN(d6);
                                                    Double.isNaN(d);
                                                    if (!fev.m8316c(d6 / d, d2 / d3, 0.001d)) {
                                                        ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2166)).mo17290o("Pano metadata does not match file dimensions.");
                                                    }
                                                }
                                                if (!z5) {
                                                    d4 = iM8314a3;
                                                    d5 = iM8314a4;
                                                    Double.isNaN(d4);
                                                    Double.isNaN(d5);
                                                    if (!fev.m8316c(d4 / d5, 2.0d, 0.1d)) {
                                                        ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2165)).mo17290o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                    } else if (z5) {
                                                        fevVar = new fev(i, i2);
                                                    } else {
                                                        fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                                    }
                                                } else if (z5) {
                                                    fevVar = new fev(i, i2);
                                                } else {
                                                    fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                                }
                                            }
                                            if (fevVar == null) {
                                                fewVar = fex.f21589a;
                                            } else {
                                                fewVar = new few(fevVar);
                                            }
                                            if (fewVar == fex.f21589a) {
                                                chpVar.mo3733b().mo3743c();
                                                ferVar = ferVar2;
                                                z = false;
                                            } else {
                                                ferVar = ferVar2;
                                                ferVar.m8305c(true);
                                                ferVar.m8306d(fewVar.f21587b);
                                                ferVar.m8308f(fewVar.f21586a);
                                                ferVar.m8307e(fewVar.f21588c);
                                                z = true;
                                            }
                                            ferVar.m8304b(true);
                                            chpVar.mo3738g(ferVar.m8303a());
                                            return z;
                                        }
                                    } catch (bfc e5) {
                                        iM8314a3 = 0;
                                        iM8314a4 = 0;
                                        z2 = zM8315b;
                                        z3 = false;
                                        z4 = false;
                                        options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        inputStreamM8356b = ffp.m8356b(path);
                                        if (inputStreamM8356b == null) {
                                            ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2169)).mo17290o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                            ferVar2 = ferVarM8312a;
                                        } else {
                                            BitmapFactory.decodeStream(inputStreamM8356b, null, options);
                                            inputStreamM8356b.close();
                                            i = options.outWidth;
                                            i2 = options.outHeight;
                                            i3 = i2 + i2;
                                            if (z3) {
                                                z5 = false;
                                            } else if (i3 == i) {
                                                z5 = true;
                                            } else {
                                                ferVar2 = ferVarM8312a;
                                            }
                                            d = i2;
                                            d2 = iM8314a;
                                            d3 = iM8314a2;
                                            if (z5) {
                                                ferVar2 = ferVarM8312a;
                                                d6 = i;
                                                Double.isNaN(d2);
                                                Double.isNaN(d3);
                                                Double.isNaN(d6);
                                                Double.isNaN(d);
                                                if (!fev.m8316c(d6 / d, d2 / d3, 0.001d)) {
                                                    ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2166)).mo17290o("Pano metadata does not match file dimensions.");
                                                }
                                            } else {
                                                ferVar2 = ferVarM8312a;
                                            }
                                            if (!z5) {
                                                d4 = iM8314a3;
                                                d5 = iM8314a4;
                                                Double.isNaN(d4);
                                                Double.isNaN(d5);
                                                if (!fev.m8316c(d4 / d5, 2.0d, 0.1d)) {
                                                    ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2165)).mo17290o("Pano metadata invalid: Full pano dimension not 2:1.");
                                                } else if (z5) {
                                                    fevVar = new fev(i, i2);
                                                } else {
                                                    fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                                }
                                            } else if (z5) {
                                                fevVar = new fev(i, i2);
                                            } else {
                                                fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                            }
                                        }
                                        if (fevVar == null) {
                                            fewVar = fex.f21589a;
                                        } else {
                                            fewVar = new few(fevVar);
                                        }
                                        if (fewVar == fex.f21589a) {
                                            chpVar.mo3733b().mo3743c();
                                            ferVar = ferVar2;
                                            z = false;
                                        } else {
                                            ferVar = ferVar2;
                                            ferVar.m8305c(true);
                                            ferVar.m8306d(fewVar.f21587b);
                                            ferVar.m8308f(fewVar.f21586a);
                                            ferVar.m8307e(fewVar.f21588c);
                                            z = true;
                                        }
                                        ferVar.m8304b(true);
                                        chpVar.mo3738g(ferVar.m8303a());
                                        return z;
                                    }
                                } catch (bfc e6) {
                                    iM8314a2 = 0;
                                    iM8314a3 = 0;
                                    iM8314a4 = 0;
                                    z2 = zM8315b;
                                    z3 = false;
                                    z4 = false;
                                    options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    inputStreamM8356b = ffp.m8356b(path);
                                    if (inputStreamM8356b == null) {
                                        ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2169)).mo17290o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                        ferVar2 = ferVarM8312a;
                                    } else {
                                        BitmapFactory.decodeStream(inputStreamM8356b, null, options);
                                        inputStreamM8356b.close();
                                        i = options.outWidth;
                                        i2 = options.outHeight;
                                        i3 = i2 + i2;
                                        if (z3) {
                                            z5 = false;
                                        } else if (i3 == i) {
                                            z5 = true;
                                        } else {
                                            ferVar2 = ferVarM8312a;
                                        }
                                        d = i2;
                                        d2 = iM8314a;
                                        d3 = iM8314a2;
                                        if (z5) {
                                            ferVar2 = ferVarM8312a;
                                            d6 = i;
                                            Double.isNaN(d2);
                                            Double.isNaN(d3);
                                            Double.isNaN(d6);
                                            Double.isNaN(d);
                                            if (!fev.m8316c(d6 / d, d2 / d3, 0.001d)) {
                                                ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2166)).mo17290o("Pano metadata does not match file dimensions.");
                                            }
                                        } else {
                                            ferVar2 = ferVarM8312a;
                                        }
                                        if (!z5) {
                                            d4 = iM8314a3;
                                            d5 = iM8314a4;
                                            Double.isNaN(d4);
                                            Double.isNaN(d5);
                                            if (!fev.m8316c(d4 / d5, 2.0d, 0.1d)) {
                                                ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2165)).mo17290o("Pano metadata invalid: Full pano dimension not 2:1.");
                                            } else if (z5) {
                                                fevVar = new fev(i, i2);
                                            } else {
                                                fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                            }
                                        } else if (z5) {
                                            fevVar = new fev(i, i2);
                                        } else {
                                            fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                        }
                                    }
                                    if (fevVar == null) {
                                        fewVar = fex.f21589a;
                                    } else {
                                        fewVar = new few(fevVar);
                                    }
                                    if (fewVar == fex.f21589a) {
                                        chpVar.mo3733b().mo3743c();
                                        ferVar = ferVar2;
                                        z = false;
                                    } else {
                                        ferVar = ferVar2;
                                        ferVar.m8305c(true);
                                        ferVar.m8306d(fewVar.f21587b);
                                        ferVar.m8308f(fewVar.f21586a);
                                        ferVar.m8307e(fewVar.f21588c);
                                        z = true;
                                    }
                                    ferVar.m8304b(true);
                                    chpVar.mo3738g(ferVar.m8303a());
                                    return z;
                                }
                            } catch (bfc e7) {
                                iM8314a = 0;
                                iM8314a2 = 0;
                                iM8314a3 = 0;
                                iM8314a4 = 0;
                                z2 = zM8315b;
                                z3 = false;
                                z4 = false;
                                options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                inputStreamM8356b = ffp.m8356b(path);
                                if (inputStreamM8356b == null) {
                                    ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2169)).mo17290o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                                    ferVar2 = ferVarM8312a;
                                } else {
                                    BitmapFactory.decodeStream(inputStreamM8356b, null, options);
                                    inputStreamM8356b.close();
                                    i = options.outWidth;
                                    i2 = options.outHeight;
                                    i3 = i2 + i2;
                                    if (z3) {
                                        z5 = false;
                                    } else if (i3 == i) {
                                        z5 = true;
                                    } else {
                                        ferVar2 = ferVarM8312a;
                                    }
                                    d = i2;
                                    d2 = iM8314a;
                                    d3 = iM8314a2;
                                    if (z5) {
                                        ferVar2 = ferVarM8312a;
                                        d6 = i;
                                        Double.isNaN(d2);
                                        Double.isNaN(d3);
                                        Double.isNaN(d6);
                                        Double.isNaN(d);
                                        if (!fev.m8316c(d6 / d, d2 / d3, 0.001d)) {
                                            ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2166)).mo17290o("Pano metadata does not match file dimensions.");
                                        }
                                    } else {
                                        ferVar2 = ferVarM8312a;
                                    }
                                    if (!z5) {
                                        d4 = iM8314a3;
                                        d5 = iM8314a4;
                                        Double.isNaN(d4);
                                        Double.isNaN(d5);
                                        if (!fev.m8316c(d4 / d5, 2.0d, 0.1d)) {
                                            ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2165)).mo17290o("Pano metadata invalid: Full pano dimension not 2:1.");
                                        } else if (z5) {
                                            fevVar = new fev(i, i2);
                                        } else {
                                            fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                        }
                                    } else if (z5) {
                                        fevVar = new fev(i, i2);
                                    } else {
                                        fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                                    }
                                }
                                if (fevVar == null) {
                                    fewVar = fex.f21589a;
                                } else {
                                    fewVar = new few(fevVar);
                                }
                                if (fewVar == fex.f21589a) {
                                    chpVar.mo3733b().mo3743c();
                                    ferVar = ferVar2;
                                    z = false;
                                } else {
                                    ferVar = ferVar2;
                                    ferVar.m8305c(true);
                                    ferVar.m8306d(fewVar.f21587b);
                                    ferVar.m8308f(fewVar.f21586a);
                                    ferVar.m8307e(fewVar.f21588c);
                                    z = true;
                                }
                                ferVar.m8304b(true);
                                chpVar.mo3738g(ferVar.m8303a());
                                return z;
                            }
                        } catch (bfc e8) {
                            zM8315b = false;
                        }
                    } else {
                        z3 = false;
                        iM8314a = 0;
                        iM8314a2 = 0;
                        iM8314a3 = 0;
                        iM8314a4 = 0;
                        z2 = false;
                        z4 = false;
                    }
                    options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    inputStreamM8356b = ffp.m8356b(path);
                    if (inputStreamM8356b == null) {
                        ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2169)).mo17290o("Failed to create stream to check image size, perhaps the file was deleted while we were parsing metadata");
                        ferVar2 = ferVarM8312a;
                    } else {
                        BitmapFactory.decodeStream(inputStreamM8356b, null, options);
                        inputStreamM8356b.close();
                        i = options.outWidth;
                        i2 = options.outHeight;
                        i3 = i2 + i2;
                        if (z3) {
                            z5 = false;
                        } else if (i3 == i) {
                            z5 = true;
                        } else {
                            ferVar2 = ferVarM8312a;
                        }
                        d = i2;
                        d2 = iM8314a;
                        d3 = iM8314a2;
                        if (z5) {
                            ferVar2 = ferVarM8312a;
                            d6 = i;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            Double.isNaN(d6);
                            Double.isNaN(d);
                            if (!fev.m8316c(d6 / d, d2 / d3, 0.001d)) {
                                ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2166)).mo17290o("Pano metadata does not match file dimensions.");
                            }
                        } else {
                            ferVar2 = ferVarM8312a;
                        }
                        if (!z5) {
                            d4 = iM8314a3;
                            d5 = iM8314a4;
                            Double.isNaN(d4);
                            Double.isNaN(d5);
                            if (!fev.m8316c(d4 / d5, 2.0d, 0.1d)) {
                                ((nbe) ((nbe) fev.f21578a.m17252c()).mo17276G((char) 2165)).mo17290o("Pano metadata invalid: Full pano dimension not 2:1.");
                            } else if (z5) {
                                fevVar = new fev(i, i2);
                            } else {
                                fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                            }
                        } else if (z5) {
                            fevVar = new fev(i, i2);
                        } else {
                            fevVar = new fev(z2, iM8314a, iM8314a2, iM8314a3, iM8314a4, z4);
                        }
                    }
                }
                if (fevVar == null) {
                    fewVar = fex.f21589a;
                } else {
                    fewVar = new few(fevVar);
                }
            }
            if (fewVar == fex.f21589a) {
                chpVar.mo3733b().mo3743c();
                ferVar = ferVar2;
                z = false;
            } else {
                ferVar = ferVar2;
                ferVar.m8305c(true);
                ferVar.m8306d(fewVar.f21587b);
                ferVar.m8308f(fewVar.f21586a);
                ferVar.m8307e(fewVar.f21588c);
                z = true;
            }
        } else {
            ferVar = ferVarM8312a;
            if (chpVar.mo3734c().equals(chr.VIDEO)) {
                Object obj = this.f3652a;
                Uri uriMo3743c2 = chpVar.mo3733b().mo3743c();
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(((fet) obj).f21574b, uriMo3743c2);
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                            String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
                            if (strExtractMetadata2 == null || strExtractMetadata3 == null) {
                                ((nbe) ((nbe) fet.f21573a.m17252c()).mo17276G(2160)).mo17293r("Size metadata does not exist for the video at %s", uriMo3743c2);
                            } else {
                                ferVar.m8311i(Integer.parseInt(strExtractMetadata2));
                                ferVar.m8310h(Integer.parseInt(strExtractMetadata3));
                            }
                            if (strExtractMetadata != null) {
                                ferVar.f21552b = strExtractMetadata;
                            } else {
                                ((nbe) ((nbe) fet.f21573a.m17252c()).mo17276G(2161)).mo17293r("Orientation metadata does not exist for the video at %s", uriMo3743c2);
                            }
                            if (strExtractMetadata4 != null) {
                                ferVar.m8309g((int) Double.parseDouble(strExtractMetadata4));
                            } else {
                                ((nbe) ((nbe) fet.f21573a.m17252c()).mo17276G(2162)).mo17293r(HRLmc.QzxZ, uriMo3743c2);
                            }
                            if (strExtractMetadata2 == null || strExtractMetadata3 == null || strExtractMetadata == null) {
                                mediaMetadataRetriever.release();
                                mediaMetadataRetriever.close();
                                z = false;
                            } else {
                                try {
                                    mediaMetadataRetriever.release();
                                    mediaMetadataRetriever.close();
                                    z = true;
                                } catch (IOException e9) {
                                    z = true;
                                }
                            }
                        } catch (RuntimeException e10) {
                            ((nbe) ((nbe) ((nbe) fet.f21573a.m17251b()).mo17283h(e10)).mo17276G(2163)).mo17290o("VideoRotationMetadataLoader.loadRotationMetadata() failed!");
                            mediaMetadataRetriever.release();
                            mediaMetadataRetriever.close();
                        }
                    } catch (IOException e11) {
                        z = false;
                    }
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                        mediaMetadataRetriever.close();
                        throw th2;
                    } catch (IOException e12) {
                        throw th2;
                    }
                }
            } else {
                z = false;
            }
        }
        ferVar.m8304b(true);
        chpVar.mo3738g(ferVar.m8303a());
        return z;
    }

    /* JADX INFO: renamed from: B */
    public final gtd m2606B(kpp kppVar, int i) {
        return new gtd(((Gcam) this.f3652a).m4973c(i), kppVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: a */
    public final boolean m2607a(Class cls) {
        return this.f3652a.containsKey(cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: b */
    public final synchronized bqc m2608b(ByteBuffer byteBuffer) {
        bqc bqcVar;
        bqcVar = (bqc) this.f3652a.poll();
        if (bqcVar == null) {
            bqcVar = new bqc();
        }
        bqcVar.f4158b = null;
        Arrays.fill(bqcVar.f4157a, (byte) 0);
        bqcVar.f4159c = new bqb();
        bqcVar.f4160d = 0;
        bqcVar.f4158b = byteBuffer.asReadOnlyBuffer();
        bqcVar.f4158b.position(0);
        bqcVar.f4158b.order(ByteOrder.LITTLE_ENDIAN);
        return bqcVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m2609c(bqc bqcVar) {
        bqcVar.f4158b = null;
        bqcVar.f4159c = null;
        this.f3652a.offer(bqcVar);
    }

    /* JADX INFO: renamed from: d */
    public final cga m2610d() {
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) this.f3652a;
        long jDirtyLensHistory_raw_score_history__get = GcamModuleJNI.DirtyLensHistory_raw_score_history__get(dirtyLensHistory.f8241a, dirtyLensHistory);
        return new cga(jDirtyLensHistory_raw_score_history__get == 0 ? null : new FloatDeque(jDirtyLensHistory_raw_score_history__get, false));
    }

    /* JADX INFO: renamed from: e */
    public final Intent m2611e() {
        return ((Activity) this.f3652a).getIntent();
    }

    /* JADX INFO: renamed from: f */
    public final void m2612f(Intent intent) {
        ((Activity) this.f3652a).startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [bqu, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final synchronized bqu m2613g(Class cls) {
        int size = this.f3652a.size();
        for (int i = 0; i < size; i++) {
            dsx dsxVar = (dsx) this.f3652a.get(i);
            if (((Class) dsxVar.f12522b).isAssignableFrom(cls)) {
                return dsxVar.f12521a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final synchronized void m2614h(Class cls, bqu bquVar) {
        this.f3652a.add(new dsx(cls, bquVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: i */
    public final synchronized List m2615i() {
        return this.f3652a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: j */
    public final synchronized void m2616j(bqh bqhVar) {
        this.f3652a.add(bqhVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [bqf, java.lang.Object] */
    /* JADX INFO: renamed from: k */
    public final synchronized bqf m2617k(Class cls) {
        for (dsx dsxVar : this.f3652a) {
            if (((Class) dsxVar.f12521a).isAssignableFrom(cls)) {
                return dsxVar.f12522b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: l */
    public final synchronized void m2618l(Class cls, bqf bqfVar) {
        this.f3652a.add(new dsx(cls, bqfVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [bys, java.lang.Object] */
    /* JADX INFO: renamed from: m */
    public final synchronized bys m2619m(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return byt.f4785a;
        }
        for (C1058va c1058va : this.f3652a) {
            if (c1058va.m19483k(cls, cls2)) {
                return c1058va.f47803b;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls) + " to " + String.valueOf(cls2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: n */
    public final synchronized List m2620n(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1058va c1058va : this.f3652a) {
            if (c1058va.m19483k(cls, cls2) && !arrayList.contains(c1058va.f47804c)) {
                arrayList.add(c1058va.f47804c);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: o */
    public final synchronized void m2621o(Class cls, Class cls2, bys bysVar) {
        this.f3652a.add(new C1058va(cls, cls2, bysVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: p */
    public final synchronized een m2622p(gyu gyuVar) {
        een eenVarM7227o;
        eenVarM7227o = (een) this.f3652a.get(gyuVar);
        if (eenVarM7227o == null) {
            eenVarM7227o = eeo.m7227o();
            this.f3652a.put(gyuVar, eenVarM7227o);
        }
        return eenVarM7227o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: q */
    public final eeo m2623q(gyu gyuVar) {
        een eenVarM7227o = (een) this.f3652a.remove(gyuVar);
        if (eenVarM7227o == null) {
            eenVarM7227o = eeo.m7227o();
        }
        mxi mxiVar = eenVarM7227o.f13681a;
        if (mxiVar != null) {
            eenVarM7227o.f13682b = mxiVar.mo17127f();
        } else if (eenVarM7227o.f13682b == null) {
            eenVarM7227o.f13682b = mzx.f41874a;
        }
        mxi mxiVar2 = eenVarM7227o.f13684d;
        if (mxiVar2 != null) {
            eenVarM7227o.f13685e = mxiVar2.mo17127f();
        } else if (eenVarM7227o.f13685e == null) {
            eenVarM7227o.f13685e = mzx.f41874a;
        }
        mxi mxiVar3 = eenVarM7227o.f13686f;
        if (mxiVar3 != null) {
            eenVarM7227o.f13687g = mxiVar3.mo17127f();
        } else if (eenVarM7227o.f13687g == null) {
            eenVarM7227o.f13687g = mzx.f41874a;
        }
        mxi mxiVar4 = eenVarM7227o.f13688h;
        if (mxiVar4 != null) {
            eenVarM7227o.f13689i = mxiVar4.mo17127f();
        } else if (eenVarM7227o.f13689i == null) {
            eenVarM7227o.f13689i = mzx.f41874a;
        }
        mxi mxiVar5 = eenVarM7227o.f13690j;
        if (mxiVar5 != null) {
            eenVarM7227o.f13691k = mxiVar5.mo17127f();
        } else if (eenVarM7227o.f13691k == null) {
            eenVarM7227o.f13691k = mzx.f41874a;
        }
        mxi mxiVar6 = eenVarM7227o.f13692l;
        if (mxiVar6 != null) {
            eenVarM7227o.f13693m = mxiVar6.mo17127f();
        } else if (eenVarM7227o.f13693m == null) {
            eenVarM7227o.f13693m = mzx.f41874a;
        }
        mxi mxiVar7 = eenVarM7227o.f13694n;
        if (mxiVar7 != null) {
            eenVarM7227o.f13695o = mxiVar7.mo17127f();
        } else if (eenVarM7227o.f13695o == null) {
            eenVarM7227o.f13695o = mzx.f41874a;
        }
        mxi mxiVar8 = eenVarM7227o.f13696p;
        if (mxiVar8 != null) {
            eenVarM7227o.f13697q = mxiVar8.mo17127f();
        } else if (eenVarM7227o.f13697q == null) {
            eenVarM7227o.f13697q = mzx.f41874a;
        }
        mxi mxiVar9 = eenVarM7227o.f13698r;
        if (mxiVar9 != null) {
            eenVarM7227o.f13699s = mxiVar9.mo17127f();
        } else if (eenVarM7227o.f13699s == null) {
            eenVarM7227o.f13699s = mzx.f41874a;
        }
        mxi mxiVar10 = eenVarM7227o.f13700t;
        if (mxiVar10 != null) {
            eenVarM7227o.f13701u = mxiVar10.mo17127f();
        } else if (eenVarM7227o.f13701u == null) {
            eenVarM7227o.f13701u = mzx.f41874a;
        }
        mxi mxiVar11 = eenVarM7227o.f13702v;
        if (mxiVar11 != null) {
            eenVarM7227o.f13703w = mxiVar11.mo17127f();
        } else if (eenVarM7227o.f13703w == null) {
            eenVarM7227o.f13703w = mzx.f41874a;
        }
        mxi mxiVar12 = eenVarM7227o.f13704x;
        if (mxiVar12 != null) {
            eenVarM7227o.f13705y = mxiVar12.mo17127f();
        } else if (eenVarM7227o.f13705y == null) {
            eenVarM7227o.f13705y = mzx.f41874a;
        }
        mxi mxiVar13 = eenVarM7227o.f13706z;
        if (mxiVar13 != null) {
            eenVarM7227o.f13677A = mxiVar13.mo17127f();
        } else if (eenVarM7227o.f13677A == null) {
            eenVarM7227o.f13677A = mzx.f41874a;
        }
        mxi mxiVar14 = eenVarM7227o.f13679C;
        if (mxiVar14 != null) {
            eenVarM7227o.f13680D = mxiVar14.mo17127f();
        } else if (eenVarM7227o.f13680D == null) {
            eenVarM7227o.f13680D = mzx.f41874a;
        }
        return new eeo(eenVarM7227o.f13682b, eenVarM7227o.f13683c, eenVarM7227o.f13685e, eenVarM7227o.f13687g, eenVarM7227o.f13689i, eenVarM7227o.f13691k, eenVarM7227o.f13693m, eenVarM7227o.f13695o, eenVarM7227o.f13697q, eenVarM7227o.f13699s, eenVarM7227o.f13701u, eenVarM7227o.f13703w, eenVarM7227o.f13705y, eenVarM7227o.f13677A, eenVarM7227o.f13678B, eenVarM7227o.f13680D);
    }

    /* JADX INFO: renamed from: r */
    public final synchronized void m2624r(long j) {
        ((mvl) this.f3652a).add(Long.valueOf(j));
        ((mvl) this.f3652a).toArray();
    }

    /* JADX INFO: renamed from: s */
    public final synchronized boolean m2625s(long j) {
        return ((mvl) this.f3652a).contains(Long.valueOf(j));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: t */
    public final lby m2626t(String str) {
        leb lebVar = leb.f38016a;
        AmbientMode.AmbientController ambientControllerM16243v = lzd.m16243v();
        kzq kzqVarM15095b = kzq.m15095b(str, lqi.m15870o());
        kzqVarM15095b.m15096a();
        lcc lccVarM16233l = lzd.m16233l(kzqVarM15095b);
        kzx kzxVarM15863h = lqi.m15863h(lccVarM16233l, new lcj(lebVar, ambientControllerM16243v, null, null, null, null));
        try {
            lqi.m15869n(kzxVarM15863h);
            lccVarM16233l.m15163m(new ldx(lccVarM16233l, kzxVarM15863h, null, null));
            ?? r0 = this.f3652a;
            dhx dhxVar = dib.f11240a;
            r0.mo6178f();
            lby lbyVarM16231j = lzd.m16231j(lccVarM16233l);
            this.f3652a.mo6178f();
            this.f3652a.mo6177e();
            return new lcx(lbyVarM16231j);
        } catch (kzy e) {
            throw new RuntimeException("Failed to create GLContext!", e.getCause());
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: u */
    public final dth m2627u(dhw dhwVar) {
        return new dtl(this.f3652a.mo6184l(dhwVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: v */
    public final dth m2628v() {
        this.f3652a.mo6177e();
        return new dtm(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX INFO: renamed from: w */
    public final synchronized dsx m2629w() {
        return (dsx) this.f3652a.peekLast();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX INFO: renamed from: x */
    public final synchronized void m2630x() {
        this.f3652a.removeFirst();
        this.f3652a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX INFO: renamed from: y */
    public final synchronized void m2631y(dsx dsxVar) {
        this.f3652a.addLast(dsxVar);
        this.f3652a.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: z */
    public final void m2632z() {
        ?? r0 = this.f3652a;
        dhx dhxVar = dib.f11240a;
        r0.mo6177e();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public bko(bko bkoVar, byte[] bArr, byte[] bArr2) {
        this.f3652a = Collections.unmodifiableMap(new HashMap((Map) bkoVar.f3652a));
    }

    public bko(ByteBuffer byteBuffer) {
        this.f3652a = byteBuffer.duplicate();
    }

    public bko(char[] cArr) {
        this.f3652a = cbi.m3386g(0);
    }

    public bko(char[] cArr, short[] sArr) {
        this.f3652a = new ArrayDeque();
    }

    public bko(ebv ebvVar, File file, dja djaVar, kpb kpbVar) {
        String absolutePath = file.getAbsolutePath();
        boolean z = kpbVar.f36768a;
        InitParams initParams = new InitParams();
        boolean z2 = djaVar == dja.ENG || z;
        GcamModuleJNI.InitParams_allow_unknown_devices_set(initParams.f8291a, initParams, z2);
        initParams.m4997c(nri.f44214b);
        GcamModuleJNI.InitParams_execute_postview_on_set(initParams.f8291a, initParams, nri.f44214b.f44219f);
        if (ebvVar.m7084c()) {
            initParams.m4997c(nri.f44215c);
        } else if (ebvVar.m7083b()) {
            initParams.m4997c(nri.f44216d);
        }
        dhv dhvVar = ebvVar.f13299a;
        dhx dhxVar = did.f11416a;
        dhvVar.mo6179g();
        GcamModuleJNI.InitParams_simultaneous_merge_and_finish_set(initParams.f8291a, initParams, initParams.m4995a() != nri.f44214b);
        GcamModuleJNI.InitParams_serialized_cache_dir_set(initParams.f8291a, initParams, absolutePath);
        GcamModuleJNI.InitParams_wait_for_portrait_brightening_init_set(initParams.f8291a, initParams, false);
        GcamModuleJNI.InitParams_finish_pecan_wait_until_ready_set(initParams.f8291a, initParams, false);
        GcamModuleJNI.InitParams_finish_pecan_initialize_on_gcam_creation_set(initParams.f8291a, initParams, false);
        this.f3652a = initParams;
    }

    public bko(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f3652a = new ArrayList();
    }

    public bko(short[] sArr) {
        this.f3652a = new DirtyLensHistory();
    }

    public bko(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3652a = new bvj();
    }

    public bko(char[] cArr, char[] cArr2) {
        this.f3652a = new ArrayList();
    }

    public bko(byte[] bArr, byte[] bArr2, char[] cArr) {
        this.f3652a = new ArrayList();
    }

    public bko(byte[] bArr, char[] cArr) {
        this.f3652a = new ArrayList();
    }
}
