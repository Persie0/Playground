package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gb3 {

    /* JADX INFO: renamed from: a */
    public static final ab9 f40486a = new ab9(2);

    /* JADX INFO: renamed from: b */
    public static final C3166k f40487b = new C3166k(12);

    /* JADX INFO: renamed from: a */
    public static ztb m12460a(Context context, List list) {
        String str;
        Typeface typefaceM17939e;
        pvc.m19517m("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                hb3 hb3Var = (hb3) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceM17939e = oda.m17939e((str = hb3Var.f42130e))) == null || oda.m17940f(typefaceM17939e) == null) {
                    ProviderInfo providerInfoM12461b = m12461b(context.getPackageManager(), hb3Var, context.getResources());
                    if (providerInfoM12461b == null) {
                        return new ztb(4, (byte) 0);
                    }
                    arrayList.add(m12462c(context, hb3Var, providerInfoM12461b.authority));
                } else {
                    arrayList.add(new dc3[]{new dc3(str, hb3Var.f42131f)});
                }
            }
            return new ztb(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m12461b(PackageManager packageManager, hb3 hb3Var, Resources resources) {
        C3166k c3166k = f40487b;
        ab9 ab9Var = f40486a;
        pvc.m19517m("FontProvider.getProvider");
        try {
            List listM17100S = hb3Var.f42129d;
            String str = hb3Var.f42126a;
            String str2 = hb3Var.f42127b;
            if (listM17100S == null) {
                listM17100S = AbstractC3352my.m17100S(resources, 0);
            }
            fb3 fb3Var = new fb3();
            fb3Var.f38766a = str;
            fb3Var.f38767b = str2;
            fb3Var.f38768c = listM17100S;
            ProviderInfo providerInfo = (ProviderInfo) ab9Var.m238d(fb3Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c3166k);
            for (int i = 0; i < listM17100S.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM17100S.get(i));
                Collections.sort(arrayList2, c3166k);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            ab9Var.m240f(fb3Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static dc3[] m12462c(Context context, hb3 hb3Var, String str) {
        pvc.m19517m("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                pvc.m19517m("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {hb3Var.f42128c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new dc3(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, hb3Var.f42131f, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    dc3[] dc3VarArr = (dc3[]) arrayList.toArray(new dc3[0]);
                    Trace.endSection();
                    return dc3VarArr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}
