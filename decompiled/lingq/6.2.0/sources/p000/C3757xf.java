package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.compose.animation.core.AbstractC0063e;
import androidx.compose.foundation.C0081g;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.FileStorage;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.fragment.app.AbstractC0638f;
import androidx.glance.appwidget.C0660h;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.fragment.R$id;
import androidx.room.AbstractC0746d;
import androidx.room.C0736a;
import androidx.sqlite.p006db.framework.C0762a;
import coil.compose.C0858a;
import coil.decode.C0859a;
import coil.decode.ExifOrientationPolicy;
import coil.size.Scale;
import com.lingq.core.analytics.C1240a;
import com.lingq.feature.onboarding.OnboardingStartFragment;
import com.lingq.feature.onboarding.auth.login.C2177b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: renamed from: xf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3757xf implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68145a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f68146b;

    public /* synthetic */ C3757xf(Object obj, int i) {
        this.f68145a = i;
        this.f68146b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:238:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:244:0x0504  */
    /* JADX WARN: Code duplicated, block: B:246:0x0508  */
    /* JADX WARN: Code duplicated, block: B:247:0x050a  */
    /* JADX WARN: Code duplicated, block: B:248:0x050c  */
    /* JADX WARN: Code duplicated, block: B:249:0x050e  */
    /* JADX WARN: Code duplicated, block: B:251:0x0514  */
    /* JADX WARN: Code duplicated, block: B:254:0x0520  */
    /* JADX WARN: Code duplicated, block: B:256:0x052b  */
    /* JADX WARN: Code duplicated, block: B:259:0x0535 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:260:0x0537 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x0543  */
    /* JADX WARN: Code duplicated, block: B:273:0x0559  */
    /* JADX WARN: Code duplicated, block: B:278:0x0568  */
    /* JADX WARN: Code duplicated, block: B:282:0x058e  */
    /* JADX WARN: Code duplicated, block: B:284:0x0592  */
    /* JADX WARN: Code duplicated, block: B:338:0x0672 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:339:0x0674  */
    /* JADX WARN: Code duplicated, block: B:341:0x0683 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:342:0x0685  */
    /* JADX WARN: Code duplicated, block: B:344:0x069a  */
    /* JADX WARN: Code duplicated, block: B:346:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:349:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:352:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:354:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:361:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:363:0x06fb  */
    /* JADX WARN: Code duplicated, block: B:368:0x071f  */
    /* JADX WARN: Code duplicated, block: B:372:0x0726  */
    /* JADX WARN: Code duplicated, block: B:374:0x072b  */
    /* JADX WARN: Code duplicated, block: B:376:0x0732  */
    /* JADX WARN: Code duplicated, block: B:383:0x073b  */
    /* JADX WARN: Code duplicated, block: B:397:0x04e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x04fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws Exception {
        cv2 cv2Var;
        int i;
        boolean z;
        Exception exc;
        ColorSpace colorSpace;
        Context context;
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        vz1 vz1VarMo315a;
        int i2;
        boolean z2;
        Context context2;
        int i3;
        boolean z3;
        int i4;
        int iMin;
        double dMax;
        Bitmap bitmapDecodeStream;
        Exception exc2;
        Matrix matrix;
        float width;
        float height;
        RectF rectF;
        float f;
        Bitmap.Config config4;
        Bitmap bitmapCreateBitmap;
        boolean z4;
        jv2 jv2Var;
        fv2 fv2VarM14662c;
        int iM12207e;
        boolean z5;
        fv2 fv2VarM14662c2;
        int iM12207e2;
        int i5;
        l7a state;
        C0762a c0762a;
        DataStore dataStore;
        Object value;
        cs4 cs4Var;
        Bundle bundle;
        AbstractC3572sf abstractC3572sfMo256K;
        Object value2;
        Object value3;
        float fM15978a = 0.0f;
        switch (this.f68145a) {
            case 0:
                return Float.valueOf(((fb2) this.f68146b).mo912g0(125.0f));
            case 1:
                AbstractC3489q9.m19789s((C2931dk) this.f68146b);
                return xfa.f68157a;
            case 2:
                return new C3705w0((Object[]) this.f68146b);
            case 3:
                return (e04) ((xc9) ((C0858a) this.f68146b).f10430M).getValue();
            case 4:
                return (C3419on) this.f68146b;
            case 5:
                C0859a c0859a = (C0859a) this.f68146b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                sz6 sz6Var = c0859a.f10446b;
                g04 g04Var = c0859a.f10445a;
                bd0 bd0Var = new bd0(g04Var.mo316b());
                e18 e18Var = new e18(bd0Var);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new yi0(e18Var.m10790e(), 1), null, options);
                Exception exc3 = (Exception) bd0Var.f8358c;
                if (exc3 != null) {
                    throw exc3;
                }
                options.inJustDecodeBounds = false;
                Paint paint = nv2.f53283a;
                String str = options.outMimeType;
                ExifOrientationPolicy exifOrientationPolicy = c0859a.f10448d;
                Set set = pv2.f56851a;
                int i6 = ov2.f55030a[exifOrientationPolicy.ordinal()];
                if (i6 == 1) {
                    if (str != null && pv2.f56851a.contains(str)) {
                        jv2Var = new jv2(new kv2(new yi0(e18Var.m10790e(), 1)));
                        fv2VarM14662c = jv2Var.m14662c("Orientation");
                        if (fv2VarM14662c != null) {
                            iM12207e = fv2VarM14662c.m12207e(jv2Var.f46214f);
                        } else {
                            iM12207e = 1;
                        }
                        if (iM12207e != 2) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        fv2VarM14662c2 = jv2Var.m14662c("Orientation");
                        if (fv2VarM14662c2 != null) {
                            iM12207e2 = fv2VarM14662c2.m12207e(jv2Var.f46214f);
                        } else {
                            iM12207e2 = 1;
                        }
                        switch (iM12207e2) {
                            case 3:
                            case 4:
                                i5 = 180;
                                break;
                            case 5:
                            case 8:
                                i5 = 270;
                                break;
                            case 6:
                            case 7:
                                i5 = 90;
                                break;
                            default:
                                i5 = 0;
                                break;
                        }
                        cv2Var = new cv2(i5, z5);
                        break;
                    } else {
                        cv2Var = cv2.f34602c;
                    }
                    i = cv2Var.f34604b;
                    z = cv2Var.f34603a;
                    exc = (Exception) bd0Var.f8358c;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    colorSpace = sz6Var.f61661c;
                    context = sz6Var.f61659a;
                    w89 w89Var = sz6Var.f61662d;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = sz6Var.f61666h;
                    config = sz6Var.f61660b;
                    if (!z) {
                    }
                    if (sz6Var.f61665g) {
                        config = Bitmap.Config.RGB_565;
                    }
                    config2 = options.outConfig;
                    config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    vz1VarMo315a = g04Var.mo315a();
                    if (vz1VarMo315a instanceof b88) {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                        }
                        z2 = z;
                        context2 = context;
                        i3 = 1;
                        options.inSampleSize = 1;
                        z3 = false;
                        options.inScaled = false;
                    } else {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                        }
                        z2 = z;
                        context2 = context;
                        i3 = 1;
                        options.inSampleSize = 1;
                        z3 = false;
                        options.inScaled = false;
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(new yi0(e18Var, i3), null, options);
                    e18Var.close();
                    exc2 = (Exception) bd0Var.f8358c;
                    if (exc2 == null) {
                        throw exc2;
                    }
                    if (bitmapDecodeStream != null) {
                        C3386nv.m17633t("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context2.getResources().getDisplayMetrics().densityDpi);
                    if (z2) {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i > 0) {
                            matrix.postRotate(i, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i != 90) {
                            int height2 = bitmapDecodeStream.getHeight();
                            int width2 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                        } else {
                            int height3 = bitmapDecodeStream.getHeight();
                            int width3 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height3, width3, config4);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    } else {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i > 0) {
                            matrix.postRotate(i, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i != 90) {
                            int height4 = bitmapDecodeStream.getHeight();
                            int width4 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height4, width4, config4);
                        } else {
                            int height5 = bitmapDecodeStream.getHeight();
                            int width5 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height5, width5, config4);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmapDecodeStream);
                    if (options.inSampleSize <= 1) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    return new i32(bitmapDrawable, z4);
                }
                if (i6 == 2) {
                    cv2Var = cv2.f34602c;
                    i = cv2Var.f34604b;
                    z = cv2Var.f34603a;
                    exc = (Exception) bd0Var.f8358c;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    colorSpace = sz6Var.f61661c;
                    context = sz6Var.f61659a;
                    w89 w89Var2 = sz6Var.f61662d;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = sz6Var.f61666h;
                    config = sz6Var.f61660b;
                    config = !z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.ARGB_8888;
                    if (sz6Var.f61665g) {
                        config = Bitmap.Config.RGB_565;
                    }
                    config2 = options.outConfig;
                    config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    vz1VarMo315a = g04Var.mo315a();
                    if (vz1VarMo315a instanceof b88) {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                        }
                        z2 = z;
                        context2 = context;
                        i3 = 1;
                        options.inSampleSize = 1;
                        z3 = false;
                        options.inScaled = false;
                    } else {
                        i2 = options.outWidth;
                        if (i2 > 0) {
                        }
                        z2 = z;
                        context2 = context;
                        i3 = 1;
                        options.inSampleSize = 1;
                        z3 = false;
                        options.inScaled = false;
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(new yi0(e18Var, i3), null, options);
                    e18Var.close();
                    exc2 = (Exception) bd0Var.f8358c;
                    if (exc2 == null) {
                        throw exc2;
                    }
                    if (bitmapDecodeStream != null) {
                        C3386nv.m17633t("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        return null;
                    }
                    bitmapDecodeStream.setDensity(context2.getResources().getDisplayMetrics().densityDpi);
                    if (z2) {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i > 0) {
                            matrix.postRotate(i, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i != 90) {
                            int height6 = bitmapDecodeStream.getHeight();
                            int width6 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height6, width6, config4);
                        } else {
                            int height7 = bitmapDecodeStream.getHeight();
                            int width7 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height7, width7, config4);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    } else {
                        matrix = new Matrix();
                        width = bitmapDecodeStream.getWidth() / 2.0f;
                        height = bitmapDecodeStream.getHeight() / 2.0f;
                        if (z2) {
                            matrix.postScale(-1.0f, 1.0f, width, height);
                        }
                        if (i > 0) {
                            matrix.postRotate(i, width, height);
                        }
                        rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        matrix.mapRect(rectF);
                        f = rectF.left;
                        if (f == 0.0f) {
                            matrix.postTranslate(-f, -rectF.top);
                        } else {
                            matrix.postTranslate(-f, -rectF.top);
                        }
                        if (i != 90) {
                            int height8 = bitmapDecodeStream.getHeight();
                            int width8 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height8, width8, config4);
                        } else {
                            int height9 = bitmapDecodeStream.getHeight();
                            int width9 = bitmapDecodeStream.getWidth();
                            config4 = bitmapDecodeStream.getConfig();
                            if (config4 == null) {
                                config4 = Bitmap.Config.ARGB_8888;
                            }
                            bitmapCreateBitmap = Bitmap.createBitmap(height9, width9, config4);
                        }
                        new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                        bitmapDecodeStream.recycle();
                        bitmapDecodeStream = bitmapCreateBitmap;
                    }
                    BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context2.getResources(), bitmapDecodeStream);
                    if (options.inSampleSize <= 1) {
                        z4 = true;
                    } else {
                        z4 = true;
                    }
                    return new i32(bitmapDrawable2, z4);
                }
                if (i6 == 3) {
                    jv2Var = new jv2(new kv2(new yi0(e18Var.m10790e(), 1)));
                    fv2VarM14662c = jv2Var.m14662c("Orientation");
                    if (fv2VarM14662c != null) {
                        iM12207e = 1;
                    } else {
                        try {
                            iM12207e = fv2VarM14662c.m12207e(jv2Var.f46214f);
                        } catch (NumberFormatException unused) {
                            iM12207e = 1;
                        }
                    }
                    if (iM12207e != 2 || iM12207e == 7 || iM12207e == 4 || iM12207e == 5) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    fv2VarM14662c2 = jv2Var.m14662c("Orientation");
                    if (fv2VarM14662c2 != null) {
                        iM12207e2 = 1;
                    } else {
                        try {
                            iM12207e2 = fv2VarM14662c2.m12207e(jv2Var.f46214f);
                        } catch (NumberFormatException unused2) {
                            iM12207e2 = 1;
                        }
                    }
                    switch (iM12207e2) {
                        case 3:
                        case 4:
                            i5 = 180;
                            break;
                        case 5:
                        case 8:
                            i5 = 270;
                            break;
                        case 6:
                        case 7:
                            i5 = 90;
                            break;
                        default:
                            i5 = 0;
                            break;
                    }
                    cv2Var = new cv2(i5, z5);
                    i = cv2Var.f34604b;
                    z = cv2Var.f34603a;
                    exc = (Exception) bd0Var.f8358c;
                    if (exc != null) {
                        throw exc;
                    }
                    options.inMutable = false;
                    colorSpace = sz6Var.f61661c;
                    context = sz6Var.f61659a;
                    w89 w89Var3 = sz6Var.f61662d;
                    if (colorSpace != null) {
                        options.inPreferredColorSpace = colorSpace;
                    }
                    options.inPremultiplied = sz6Var.f61666h;
                    config = sz6Var.f61660b;
                    if ((!z || i > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    }
                    if (sz6Var.f61665g && config == Bitmap.Config.ARGB_8888 && fa4.m11650l(options.outMimeType, "image/jpeg")) {
                        config = Bitmap.Config.RGB_565;
                    }
                    config2 = options.outConfig;
                    config3 = Bitmap.Config.RGBA_F16;
                    if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                        config = config3;
                    }
                    options.inPreferredConfig = config;
                    vz1VarMo315a = g04Var.mo315a();
                    try {
                        if ((vz1VarMo315a instanceof b88) || !fa4.m11650l(w89Var3, w89.f66530c)) {
                            i2 = options.outWidth;
                            if (i2 > 0 || (i4 = options.outHeight) <= 0) {
                                z2 = z;
                                context2 = context;
                                i3 = 1;
                                options.inSampleSize = 1;
                                z3 = false;
                                options.inScaled = false;
                            } else {
                                int i7 = (i == 90 || i == 270) ? i4 : i2;
                                if (i != 90 && i != 270) {
                                    i2 = i4;
                                }
                                Scale scale = sz6Var.f61663e;
                                w89 w89Var4 = w89.f66530c;
                                int iM12990e = fa4.m11650l(w89Var3, w89Var4) ? i7 : AbstractC3057h.m12990e(w89Var3.f66531a, scale);
                                int iM12990e2 = fa4.m11650l(w89Var3, w89Var4) ? i2 : AbstractC3057h.m12990e(w89Var3.f66532b, scale);
                                int iHighestOneBit = Integer.highestOneBit(i7 / iM12990e);
                                int iHighestOneBit2 = Integer.highestOneBit(i2 / iM12990e2);
                                int[] iArr = j32.f45001a;
                                int i8 = iArr[scale.ordinal()];
                                z2 = z;
                                if (i8 == 1) {
                                    iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                                } else if (i8 == 2) {
                                    iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                                } else {
                                    gm5.m12750e();
                                }
                                if (iMin < 1) {
                                    iMin = 1;
                                }
                                options.inSampleSize = iMin;
                                context2 = context;
                                double d = iMin;
                                double d2 = ((double) iM12990e) / (((double) i7) / d);
                                double d3 = ((double) iM12990e2) / (((double) i2) / d);
                                int i9 = iArr[scale.ordinal()];
                                if (i9 == 1) {
                                    dMax = Math.max(d2, d3);
                                } else if (i9 == 2) {
                                    dMax = Math.min(d2, d3);
                                } else {
                                    gm5.m12750e();
                                }
                                if (sz6Var.f61664f && dMax > 1.0d) {
                                    dMax = 1.0d;
                                }
                                boolean z6 = dMax == 1.0d;
                                options.inScaled = !z6;
                                if (!z6) {
                                    if (dMax > 1.0d) {
                                        options.inDensity = ss5.m21692S(2.147483647E9d / dMax);
                                        options.inTargetDensity = Integer.MAX_VALUE;
                                    } else {
                                        options.inDensity = Integer.MAX_VALUE;
                                        options.inTargetDensity = ss5.m21692S(2.147483647E9d * dMax);
                                    }
                                }
                            }
                            bitmapDecodeStream = BitmapFactory.decodeStream(new yi0(e18Var, i3), null, options);
                            e18Var.close();
                            exc2 = (Exception) bd0Var.f8358c;
                            if (exc2 == null) {
                                throw exc2;
                            }
                            if (bitmapDecodeStream != null) {
                                C3386nv.m17633t("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                                return null;
                            }
                            bitmapDecodeStream.setDensity(context2.getResources().getDisplayMetrics().densityDpi);
                            if (z2 || i > 0) {
                                matrix = new Matrix();
                                width = bitmapDecodeStream.getWidth() / 2.0f;
                                height = bitmapDecodeStream.getHeight() / 2.0f;
                                if (z2) {
                                    matrix.postScale(-1.0f, 1.0f, width, height);
                                }
                                if (i > 0) {
                                    matrix.postRotate(i, width, height);
                                }
                                rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                                matrix.mapRect(rectF);
                                f = rectF.left;
                                if (f == 0.0f || rectF.top != 0.0f) {
                                    matrix.postTranslate(-f, -rectF.top);
                                }
                                if (i != 90 || i == 270) {
                                    int height10 = bitmapDecodeStream.getHeight();
                                    int width10 = bitmapDecodeStream.getWidth();
                                    config4 = bitmapDecodeStream.getConfig();
                                    if (config4 == null) {
                                        config4 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(height10, width10, config4);
                                } else {
                                    int width11 = bitmapDecodeStream.getWidth();
                                    int height11 = bitmapDecodeStream.getHeight();
                                    Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                                    if (config5 == null) {
                                        config5 = Bitmap.Config.ARGB_8888;
                                    }
                                    bitmapCreateBitmap = Bitmap.createBitmap(width11, height11, config5);
                                }
                                new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                                bitmapDecodeStream.recycle();
                                bitmapDecodeStream = bitmapCreateBitmap;
                            }
                            BitmapDrawable bitmapDrawable3 = new BitmapDrawable(context2.getResources(), bitmapDecodeStream);
                            if (options.inSampleSize <= 1 || options.inScaled) {
                                z4 = true;
                            } else {
                                z4 = z3;
                            }
                            return new i32(bitmapDrawable3, z4);
                        }
                        options.inSampleSize = 1;
                        options.inScaled = true;
                        options.inDensity = ((b88) vz1VarMo315a).f8122l;
                        options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                        z2 = z;
                        context2 = context;
                        bitmapDecodeStream = BitmapFactory.decodeStream(new yi0(e18Var, i3), null, options);
                        e18Var.close();
                        exc2 = (Exception) bd0Var.f8358c;
                        if (exc2 == null) {
                            throw exc2;
                        }
                        if (bitmapDecodeStream != null) {
                            C3386nv.m17633t("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                            return null;
                        }
                        bitmapDecodeStream.setDensity(context2.getResources().getDisplayMetrics().densityDpi);
                        if (z2) {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z2) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i > 0) {
                                matrix.postRotate(i, width, height);
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == 0.0f) {
                                matrix.postTranslate(-f, -rectF.top);
                            } else {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            if (i != 90) {
                                int height12 = bitmapDecodeStream.getHeight();
                                int width12 = bitmapDecodeStream.getWidth();
                                config4 = bitmapDecodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height12, width12, config4);
                            } else {
                                int height13 = bitmapDecodeStream.getHeight();
                                int width13 = bitmapDecodeStream.getWidth();
                                config4 = bitmapDecodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height13, width13, config4);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        } else {
                            matrix = new Matrix();
                            width = bitmapDecodeStream.getWidth() / 2.0f;
                            height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z2) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i > 0) {
                                matrix.postRotate(i, width, height);
                            }
                            rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            f = rectF.left;
                            if (f == 0.0f) {
                                matrix.postTranslate(-f, -rectF.top);
                            } else {
                                matrix.postTranslate(-f, -rectF.top);
                            }
                            if (i != 90) {
                                int height14 = bitmapDecodeStream.getHeight();
                                int width14 = bitmapDecodeStream.getWidth();
                                config4 = bitmapDecodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height14, width14, config4);
                            } else {
                                int height15 = bitmapDecodeStream.getHeight();
                                int width15 = bitmapDecodeStream.getWidth();
                                config4 = bitmapDecodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height15, width15, config4);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nv2.f53283a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                        BitmapDrawable bitmapDrawable4 = new BitmapDrawable(context2.getResources(), bitmapDecodeStream);
                        if (options.inSampleSize <= 1) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        return new i32(bitmapDrawable4, z4);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            AbstractC3584sr.m21646y(e18Var, th);
                            throw th2;
                        }
                    }
                    i3 = 1;
                    z3 = false;
                } else {
                    gm5.m12750e();
                }
                break;
                return null;
            case 6:
                return (e28) this.f68146b;
            case 7:
                ui3 ui3Var = ((C0081g) this.f68146b).f1756g0;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
                return Boolean.TRUE;
            case 8:
                return ((yw4) this.f68146b).m25363d();
            case 9:
                return new mv9((Orientation) this.f68146b, 0.0f);
            case 10:
                k7a k7aVar = ((ida) this.f68146b).f44004r;
                if (k7aVar != null && (state = k7aVar.getState()) != null) {
                    fM15978a = state.m15978a();
                }
                return Float.valueOf(fM15978a);
            case 11:
                return FileStorage.createConnection$lambda$1((File) this.f68146b);
            case 12:
                ((t53) this.f68146b).f61874a.await();
                return xfa.f68157a;
            case 13:
                ah3 ah3Var = (ah3) this.f68146b;
                String str2 = ah3Var.f647b;
                if (str2 == null || !ah3Var.f649d) {
                    c0762a = new C0762a(ah3Var.f646a, ah3Var.f647b, new m58(24), ah3Var.f648c, ah3Var.f650e);
                } else {
                    Context context3 = ah3Var.f646a;
                    context3.getClass();
                    File noBackupFilesDir = context3.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    c0762a = new C0762a(ah3Var.f646a, new File(noBackupFilesDir, str2).getAbsolutePath(), new m58(24), ah3Var.f648c, ah3Var.f650e);
                }
                c0762a.setWriteAheadLoggingEnabled(ah3Var.f652g);
                return c0762a;
            case 14:
                C0660h c0660h = (C0660h) this.f68146b;
                synchronized (C0660h.f6011d) {
                    try {
                        dataStore = C0660h.f6013f;
                        if (dataStore == null) {
                            File filePreferencesDataStoreFile = PreferenceDataStoreFile.preferencesDataStoreFile(c0660h.f6015a, "GlanceAppWidgetManager");
                            File file = filePreferencesDataStoreFile.exists() ? filePreferencesDataStoreFile : null;
                            if (file != null) {
                                file.delete();
                            }
                            dataStore = (DataStore) C0660h.f6012e.getValue(c0660h.f6015a, hn3.f42651a[0]);
                            C0660h.f6013f = dataStore;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return dataStore;
            case 15:
                return (List) this.f68146b;
            case 16:
                return Float.valueOf(AbstractC0063e.m761h(((un1) this.f68146b).mo1309x()));
            case 17:
                AbstractC0746d abstractC0746d = ((C0736a) this.f68146b).f6817a;
                return Boolean.valueOf(!abstractC0746d.m2840m() || abstractC0746d.m2843p());
            case 18:
                wh2 wh2Var = ((C0135d) this.f68146b).f2563j;
                if (wh2Var != null) {
                    AbstractC3489q9.m19789s(wh2Var);
                }
                return xfa.f68157a;
            case 19:
                return Integer.valueOf(((C0127b) this.f68146b).m980j().f42988n);
            case 20:
                return Float.valueOf(((z85) this.f68146b).f71081j);
            case 21:
                C3244l c3244l = (C3244l) ((w41) this.f68146b).f66367c;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, EmptyList.f47638a));
                return xfa.f68157a;
            case 22:
                a86 a86Var = ((y76) this.f68146b).f69415h;
                if (!a86Var.f346i) {
                    C3386nv.m17633t("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                } else {
                    if (a86Var.f347j.f66586d != Lifecycle$State.DESTROYED) {
                        return ((z76) s46.m21061i(a86Var.f338a, (zta) a86Var.f350m.getValue(), 4).m16643g(y38.m24933a(z76.class))).m25485V2();
                    }
                    C3386nv.m17633t("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                return null;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new o86((String) this.f68146b, null, null);
            case 24:
                NavHostFragment navHostFragment = (NavHostFragment) this.f68146b;
                Context contextMo2107i = navHostFragment.mo2107i();
                if (contextMo2107i != null) {
                    ud6 ud6Var = new ud6(contextMo2107i);
                    cs4 cs4Var2 = ud6Var.f63766h;
                    h86 h86Var = ud6Var.f63760b;
                    oe3 oe3Var = h86Var.f41962q;
                    lj6 lj6Var = h86Var.f41963r;
                    ub5 ub5Var = h86Var.f41958m;
                    if (navHostFragment != ub5Var) {
                        if (ub5Var != null && (abstractC3572sfMo256K = ub5Var.mo256K()) != null) {
                            abstractC3572sfMo256K.mo21331x(oe3Var);
                        }
                        h86Var.f41958m = navHostFragment;
                        navHostFragment.f5709m0.mo21323g(oe3Var);
                    }
                    cua cuaVarMo2116r = navHostFragment.mo2116r();
                    if (!fa4.m11650l(h86Var.f41959n, lda.m16140z(cuaVarMo2116r))) {
                        if (h86Var.f41951f.isEmpty()) {
                            h86Var.f41959n = lda.m16140z(cuaVarMo2116r);
                        } else {
                            C3386nv.m17633t("ViewModelStore should be set before setGraph call");
                        }
                    }
                    Context contextM2090R = navHostFragment.m2090R();
                    AbstractC0638f abstractC0638fM2106h = navHostFragment.m2106h();
                    abstractC0638fM2106h.getClass();
                    lj6Var.m16258a(new fe2(contextM2090R, abstractC0638fM2106h));
                    Context contextM2090R2 = navHostFragment.m2090R();
                    AbstractC0638f abstractC0638fM2106h2 = navHostFragment.m2106h();
                    abstractC0638fM2106h2.getClass();
                    int i10 = navHostFragment.f5678T;
                    if (i10 == 0 || i10 == -1) {
                        i10 = R$id.nav_host_fragment_container;
                    }
                    lj6Var.m16258a(new qe3(contextM2090R2, abstractC0638fM2106h2, i10));
                    Bundle bundleM12108m = ((fs6) navHostFragment.f5713q0.f39591c).m12108m("android-support-nav:fragment:navControllerState");
                    if (bundleM12108m != null) {
                        bundleM12108m.setClassLoader(contextMo2107i.getClassLoader());
                        LinkedHashMap linkedHashMap = h86Var.f41957l;
                        if (bundleM12108m.containsKey("android-support-nav:controller:navigatorState")) {
                            Bundle bundle2 = bundleM12108m.getBundle("android-support-nav:controller:navigatorState");
                            if (bundle2 == null) {
                                syc.m21782a("android-support-nav:controller:navigatorState");
                                throw null;
                            }
                            bundle = bundle2;
                        } else {
                            bundle = null;
                        }
                        h86Var.f41949d = bundle;
                        h86Var.f41950e = bundleM12108m.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) te1.m22009w("android-support-nav:controller:backStack", bundleM12108m).toArray(new Bundle[0]) : null;
                        linkedHashMap.clear();
                        if (bundleM12108m.containsKey("android-support-nav:controller:backStackDestIds") && bundleM12108m.containsKey("android-support-nav:controller:backStackIds")) {
                            int[] intArray = bundleM12108m.getIntArray("android-support-nav:controller:backStackDestIds");
                            if (intArray == null) {
                                syc.m21782a("android-support-nav:controller:backStackDestIds");
                                throw null;
                            }
                            ArrayList<String> stringArrayList = bundleM12108m.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList == null) {
                                syc.m21782a("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                            int length = intArray.length;
                            int i11 = 0;
                            int i12 = 0;
                            while (i12 < length) {
                                int i13 = i11 + 1;
                                int[] iArr2 = intArray;
                                cs4 cs4Var3 = cs4Var2;
                                int i14 = length;
                                h86Var.f41956k.put(Integer.valueOf(intArray[i12]), !fa4.m11650l(stringArrayList.get(i11), "") ? stringArrayList.get(i11) : null);
                                i12++;
                                intArray = iArr2;
                                cs4Var2 = cs4Var3;
                                i11 = i13;
                                length = i14;
                            }
                        }
                        cs4Var = cs4Var2;
                        if (bundleM12108m.containsKey("android-support-nav:controller:backStackStates")) {
                            ArrayList<String> stringArrayList2 = bundleM12108m.getStringArrayList("android-support-nav:controller:backStackStates");
                            if (stringArrayList2 == null) {
                                syc.m21782a("android-support-nav:controller:backStackStates");
                                throw null;
                            }
                            for (String str3 : stringArrayList2) {
                                if (bundleM12108m.containsKey("android-support-nav:controller:backStackStates:" + str3)) {
                                    ArrayList arrayListM22009w = te1.m22009w("android-support-nav:controller:backStackStates:" + str3, bundleM12108m);
                                    C0825bv c0825bv = new C0825bv(arrayListM22009w.size());
                                    Iterator it = arrayListM22009w.iterator();
                                    while (it.hasNext()) {
                                        c0825bv.addLast(new b86((Bundle) it.next()));
                                    }
                                    linkedHashMap.put(str3, c0825bv);
                                }
                            }
                        }
                        boolean z7 = bundleM12108m.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                        Boolean boolValueOf = (z7 || !bundleM12108m.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z7) : null;
                        ud6Var.f63763e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                    } else {
                        cs4Var = cs4Var2;
                    }
                    ((fs6) navHostFragment.f5713q0.f39591c).m12094I("android-support-nav:fragment:navControllerState", new mc1(ud6Var, 4));
                    Bundle bundleM12108m2 = ((fs6) navHostFragment.f5713q0.f39591c).m12108m("android-support-nav:fragment:graphId");
                    if (bundleM12108m2 != null) {
                        navHostFragment.f6542y0 = bundleM12108m2.getInt("android-support-nav:fragment:graphId");
                    }
                    ((fs6) navHostFragment.f5713q0.f39591c).m12094I("android-support-nav:fragment:graphId", new mc1(navHostFragment, 5));
                    int i15 = navHostFragment.f6542y0;
                    if (i15 != 0) {
                        h86Var.m13138r(((vd6) cs4Var.getValue()).m23234b(i15), null);
                    } else {
                        Bundle bundle3 = navHostFragment.f5695f;
                        int i16 = bundle3 != null ? bundle3.getInt("android-support-nav:fragment:graphId") : 0;
                        Bundle bundle4 = bundle3 != null ? bundle3.getBundle("android-support-nav:fragment:startDestinationArgs") : null;
                        if (i16 != 0) {
                            h86Var.m13138r(((vd6) cs4Var.getValue()).m23234b(i16), bundle4);
                        }
                    }
                    return ud6Var;
                }
                C3386nv.m17633t("NavController cannot be created before the fragment is attached");
                return null;
            case 25:
                return new nr6((pr6) this.f68146b);
            case 26:
                C2177b c2177b = (C2177b) this.f68146b;
                C3244l c3244l2 = c2177b.f27067k;
                do {
                    value2 = c3244l2.getValue();
                    ((Number) value2).intValue();
                } while (!c3244l2.m15570h(value2, 0));
                C3244l c3244l3 = c2177b.f27065i;
                do {
                    value3 = c3244l3.getValue();
                } while (!c3244l3.m15570h(value3, wm5.f67054a));
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                OnboardingStartFragment onboardingStartFragment = (OnboardingStartFragment) this.f68146b;
                hm5 hm5Var = onboardingStartFragment.f26981B0;
                if (hm5Var == null) {
                    fa4.m11636J("analytics");
                    throw null;
                }
                ((C1240a) hm5Var).m7025f("registration login clicked", null);
                ud6 ud6VarM3244j = b34.m3244j(onboardingStartFragment);
                ac6.Companion.getClass();
                jfa.m14428k(ud6VarM3244j, new yb6(""), null);
                return xfa.f68157a;
            case 28:
                return Integer.valueOf(((lx6) this.f68146b).f50243b.size());
            default:
                return new xj2(AbstractC3423or.m18232Q(24.0f, 16.0f, ((su9) this.f68146b).mo169a()));
        }
    }
}
