package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.AbstractC0875a;
import com.airbnb.lottie.parser.moshi.C0877c;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ll5 {

    /* JADX INFO: renamed from: a */
    public static final HashMap f49797a = new HashMap();

    /* JADX INFO: renamed from: b */
    public static final HashSet f49798b = new HashSet();

    /* JADX INFO: renamed from: c */
    public static final byte[] f49799c = {80, 75, 3, 4};

    /* JADX INFO: renamed from: d */
    public static final byte[] f49800d = {31, -117, 8};

    /* JADX INFO: renamed from: a */
    public static bm5 m16348a(final String str, Callable callable, Runnable runnable) {
        gl5 gl5VarM13324a = str == null ? null : hl5.f42577b.m13324a(str);
        bm5 bm5Var = gl5VarM13324a != null ? new bm5(gl5VarM13324a) : null;
        HashMap map = f49797a;
        if (str != null && map.containsKey(str)) {
            bm5Var = (bm5) map.get(str);
        }
        if (bm5Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return bm5Var;
        }
        final int i = 0;
        bm5 bm5Var2 = new bm5(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            bm5Var2.m3874b(new xl5() { // from class: jl5
                @Override // p000.xl5
                public final void onResult(Object obj) {
                    int i2 = i;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i2) {
                        case 0:
                            HashMap map2 = ll5.f49797a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                ll5.m16359l();
                            }
                            break;
                        default:
                            HashMap map3 = ll5.f49797a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                ll5.m16359l();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            bm5Var2.m3873a(new xl5() { // from class: jl5
                @Override // p000.xl5
                public final void onResult(Object obj) {
                    int i3 = i2;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    String str2 = str;
                    switch (i3) {
                        case 0:
                            HashMap map2 = ll5.f49797a;
                            map2.remove(str2);
                            atomicBoolean2.set(true);
                            if (map2.size() == 0) {
                                ll5.m16359l();
                            }
                            break;
                        default:
                            HashMap map3 = ll5.f49797a;
                            map3.remove(str2);
                            atomicBoolean2.set(true);
                            if (map3.size() == 0) {
                                ll5.m16359l();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, bm5Var2);
                if (map.size() == 1) {
                    m16359l();
                }
            }
        }
        return bm5Var2;
    }

    /* JADX INFO: renamed from: b */
    public static zl5 m16349b(Context context, String str, String str2) {
        gl5 gl5VarM13324a = str2 == null ? null : hl5.f42577b.m13324a(str2);
        if (gl5VarM13324a != null) {
            return new zl5(gl5VarM13324a);
        }
        try {
            return m16350c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new zl5(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static zl5 m16350c(Context context, InputStream inputStream, String str) {
        gl5 gl5VarM13324a = str == null ? null : hl5.f42577b.m13324a(str);
        if (gl5VarM13324a != null) {
            return new zl5(gl5VarM13324a);
        }
        try {
            e18 e18Var = new e18(r46.m20369L(inputStream));
            int i = 1;
            if (m16358k(e18Var, f49799c).booleanValue()) {
                return m16356i(context, new ZipInputStream(new yi0(e18Var, i)), str);
            }
            if (m16358k(e18Var, f49800d).booleanValue()) {
                return m16352e(r46.m20369L(new GZIPInputStream(new yi0(e18Var, i))), str);
            }
            String[] strArr = AbstractC0875a.f10735e;
            return m16351d(new C0877c(e18Var), str, true);
        } catch (IOException e) {
            return new zl5(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static zl5 m16351d(C0877c c0877c, String str, boolean z) {
        try {
            gl5 gl5VarM13324a = str == null ? null : hl5.f42577b.m13324a(str);
            if (gl5VarM13324a != null) {
                return new zl5(gl5VarM13324a);
            }
            gl5 gl5VarM16917a = ml5.m16917a(c0877c);
            if (str != null) {
                hl5.f42577b.f42578a.m240f(str, gl5VarM16917a);
            }
            return new zl5(gl5VarM16917a);
        } catch (Exception e) {
            return new zl5(e);
        } finally {
            if (z) {
                fna.m11956b(c0877c);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static zl5 m16352e(f64 f64Var, String str) {
        e18 e18Var = new e18(f64Var);
        String[] strArr = AbstractC0875a.f10735e;
        return m16351d(new C0877c(e18Var), str, true);
    }

    /* JADX INFO: renamed from: f */
    public static bm5 m16353f(final int i, Context context, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return m16348a(str, new Callable() { // from class: kl5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return ll5.m16355h(i, context2, str);
            }
        }, null);
    }

    /* JADX INFO: renamed from: g */
    public static bm5 m16354g(Context context, int i) {
        return m16353f(i, context, m16360m(context, i));
    }

    /* JADX INFO: renamed from: h */
    public static zl5 m16355h(int i, Context context, String str) {
        gl5 gl5VarM13324a = str == null ? null : hl5.f42577b.m13324a(str);
        if (gl5VarM13324a != null) {
            return new zl5(gl5VarM13324a);
        }
        try {
            e18 e18Var = new e18(r46.m20369L(context.getResources().openRawResource(i)));
            int i2 = 1;
            if (m16358k(e18Var, f49799c).booleanValue()) {
                return m16356i(context, new ZipInputStream(new yi0(e18Var, i2)), str);
            }
            if (!m16358k(e18Var, f49800d).booleanValue()) {
                String[] strArr = AbstractC0875a.f10735e;
                return m16351d(new C0877c(e18Var), str, true);
            }
            try {
                return m16352e(r46.m20369L(new GZIPInputStream(new yi0(e18Var, i2))), str);
            } catch (IOException e) {
                return new zl5(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new zl5(e2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static zl5 m16356i(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return m16357j(context, zipInputStream, str);
        } finally {
            fna.m11956b(zipInputStream);
        }
    }

    /* JADX INFO: renamed from: j */
    public static zl5 m16357j(Context context, ZipInputStream zipInputStream, String str) {
        gl5 gl5VarM13324a;
        wl5 wl5Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            gl5VarM13324a = null;
        } else {
            try {
                gl5VarM13324a = hl5.f42577b.m13324a(str);
            } catch (IOException e) {
                return new zl5(e);
            }
        }
        if (gl5VarM13324a != null) {
            return new zl5(gl5VarM13324a);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        gl5 gl5Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                e18 e18Var = new e18(r46.m20369L(zipInputStream));
                String[] strArr = AbstractC0875a.f10735e;
                gl5Var = m16351d(new C0877c(e18Var), null, false).f71701a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new zl5(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    tj5.m22152d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    tj5.m22151c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (gl5Var == null) {
            return new zl5(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) gl5Var.m12732f()).values().iterator();
            do {
                if (!it.hasNext()) {
                    wl5Var = null;
                    break;
                }
                wl5Var = (wl5) it.next();
            } while (!wl5Var.f67010d.equals(str4));
            if (wl5Var != null) {
                wl5Var.f67012f = fna.m11959e((Bitmap) entry.getValue(), wl5Var.f67007a, wl5Var.f67008b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (qa3 qa3Var : gl5Var.f40962f.values()) {
                if (qa3Var.f57488a.equals(entry2.getKey())) {
                    qa3Var.f57491d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                tj5.m22151c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) gl5Var.m12732f()).entrySet().iterator();
            while (it2.hasNext()) {
                wl5 wl5Var2 = (wl5) ((Map.Entry) it2.next()).getValue();
                if (wl5Var2 == null) {
                    return null;
                }
                String str5 = wl5Var2.f67010d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            wl5Var2.f67012f = fna.m11959e(bitmapDecodeByteArray, wl5Var2.f67007a, wl5Var2.f67008b);
                        }
                    } catch (IllegalArgumentException e2) {
                        tj5.m22152d("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            hl5.f42577b.f42578a.m240f(str, gl5Var);
        }
        return new zl5(gl5Var);
    }

    /* JADX INFO: renamed from: k */
    public static Boolean m16358k(e18 e18Var, byte[] bArr) {
        try {
            e18 e18VarM10790e = e18Var.m10790e();
            for (byte b : bArr) {
                if (e18VarM10790e.readByte() != b) {
                    return Boolean.FALSE;
                }
            }
            e18VarM10790e.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            tj5.m22150b();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m16359l() {
        ArrayList arrayList = new ArrayList(f49798b);
        if (arrayList.size() <= 0) {
            return;
        }
        arrayList.get(0).getClass();
        ho2.m13383c();
    }

    /* JADX INFO: renamed from: m */
    public static String m16360m(Context context, int i) {
        return wq1.m24124t(new StringBuilder("rawRes"), (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", i);
    }
}
