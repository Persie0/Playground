package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class adw {

    /* JADX INFO: renamed from: a */
    public static final C1116xe f179a = new C1116xe(16);

    /* JADX INFO: renamed from: b */
    public static final ExecutorService f180b;

    /* JADX INFO: renamed from: c */
    public static final Object f181c;

    /* JADX INFO: renamed from: d */
    public static final C1117xf f182d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new kuw(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f180b = threadPoolExecutor;
        f181c = new Object();
        f182d = new C1117xf();
    }

    /* JADX INFO: renamed from: a */
    public static String m310a(adt adtVar, int i) {
        return adtVar.f172e + "-" + i;
    }

    /* JADX INFO: renamed from: b */
    public static kym m311b(String str, Context context, adt adtVar, int i) {
        Cursor cursorM305a;
        ksy[] ksyVarArr;
        boolean z;
        int i2;
        int length;
        Typeface typefaceBuild;
        List list;
        Typeface typeface = (Typeface) f179a.m19553a(str);
        if (typeface != null) {
            return new kym(typeface);
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            context.getResources();
            String str2 = adtVar.f168a;
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str2, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: ".concat(str2));
            }
            if (!providerInfoResolveContentProvider.packageName.equals(adtVar.f169b)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str2 + ", but package was not " + adtVar.f169b);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, ads.f167a);
            List list2 = adtVar.f171d;
            int i3 = 0;
            loop1: while (true) {
                if (i3 >= list2.size()) {
                    providerInfoResolveContentProvider = null;
                    break;
                }
                ArrayList arrayList2 = new ArrayList((Collection) list2.get(i3));
                Collections.sort(arrayList2, ads.f167a);
                if (arrayList.size() == arrayList2.size()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= arrayList.size()) {
                            break loop1;
                        }
                        list = list2;
                        if (!Arrays.equals((byte[]) arrayList.get(i4), (byte[]) arrayList2.get(i4))) {
                            break;
                        }
                        i4++;
                        list2 = list;
                    }
                } else {
                    list = list2;
                }
                i3++;
                list2 = list;
            }
            if (providerInfoResolveContentProvider == null) {
                ksyVarArr = null;
                z = true;
            } else {
                String str3 = providerInfoResolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri uriBuild = new Uri.Builder().scheme("content").authority(str3).build();
                Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str3).appendPath("file").build();
                try {
                    cursorM305a = adr.m305a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{adtVar.f170c}, null, null);
                    if (cursorM305a != null) {
                        try {
                            if (cursorM305a.getCount() > 0) {
                                int columnIndex = cursorM305a.getColumnIndex("result_code");
                                arrayList3 = new ArrayList();
                                int columnIndex2 = cursorM305a.getColumnIndex("_id");
                                int columnIndex3 = cursorM305a.getColumnIndex("file_id");
                                int columnIndex4 = cursorM305a.getColumnIndex("font_ttc_index");
                                int columnIndex5 = cursorM305a.getColumnIndex("font_weight");
                                int columnIndex6 = cursorM305a.getColumnIndex("font_italic");
                                while (cursorM305a.moveToNext()) {
                                    arrayList3.add(new ksy(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM305a.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM305a.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM305a.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM305a.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM305a.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorM305a.getInt(columnIndex) : 0));
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (cursorM305a != null) {
                                cursorM305a.close();
                            }
                            throw th;
                        }
                    }
                    if (cursorM305a != null) {
                        cursorM305a.close();
                    }
                    ksyVarArr = (ksy[]) arrayList3.toArray(new ksy[0]);
                    z = false;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM305a = null;
                }
            }
            if (z) {
                i2 = -2;
            } else if (ksyVarArr == null || (length = ksyVarArr.length) == 0) {
                i2 = 1;
            } else {
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        i2 = 0;
                        break;
                    }
                    int i6 = ksyVarArr[i5].f37148d;
                    if (i6 != 0) {
                        if (i6 >= 0) {
                            i2 = i6;
                            break;
                        }
                        i2 = -3;
                        break;
                    }
                    i5++;
                }
            }
            if (i2 != 0) {
                return new kym(i2, (byte[]) null);
            }
            C1116xe c1116xe = act.f109a;
            ContentResolver contentResolver = context.getContentResolver();
            try {
                FontFamily.Builder builder = null;
                for (ksy ksyVar : ksyVarArr) {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor((Uri) ksyVar.f37149e, VCYBIzY.VJDJH, null);
                        if (parcelFileDescriptorOpenFileDescriptor != null) {
                            try {
                                Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(ksyVar.f37146b).setSlant(ksyVar.f37147c ? 1 : 0).setTtcIndex(ksyVar.f37145a).build();
                                if (builder == null) {
                                    builder = new FontFamily.Builder(fontBuild);
                                } else {
                                    builder.addFont(fontBuild);
                                }
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (IOException e) {
                                }
                            } catch (Throwable th3) {
                                try {
                                    parcelFileDescriptorOpenFileDescriptor.close();
                                } catch (Throwable th4) {
                                    try {
                                        Class[] clsArr = new Class[1];
                                        try {
                                            clsArr[0] = Throwable.class;
                                            Throwable.class.getDeclaredMethod("addSuppressed", clsArr).invoke(th3, th4);
                                        } catch (Exception e2) {
                                        }
                                    } catch (Exception e3) {
                                    }
                                }
                                try {
                                    throw th3;
                                } catch (IOException e4) {
                                }
                            }
                        }
                    } catch (IOException e5) {
                    }
                }
                if (builder == null) {
                    typefaceBuild = null;
                } else {
                    FontFamily fontFamilyBuild = builder.build();
                    typefaceBuild = new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(aav.m63d(fontFamilyBuild, i).getStyle()).build();
                }
            } catch (Exception e6) {
                typefaceBuild = null;
            }
            if (typefaceBuild == null) {
                return new kym(-3, (byte[]) null);
            }
            f179a.m19554b(str, typefaceBuild);
            return new kym(typefaceBuild);
        } catch (PackageManager.NameNotFoundException e7) {
            return new kym(-1, (byte[]) null);
        }
    }
}
