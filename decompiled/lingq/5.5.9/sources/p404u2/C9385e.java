package p404u2;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.activity.result.C0204c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p286o2.C7904d;

/* JADX INFO: renamed from: u2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9385e {

    /* JADX INFO: renamed from: a */
    public static final C9384d f48178a = new C9384d(0);

    /* JADX INFO: renamed from: u2.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static Cursor m17754a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C9392l m17753a(Context context, C9386f c9386f) throws PackageManager.NameNotFoundException {
        Cursor cursorM17754a;
        boolean z10;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c9386f.f48179a;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(C0204c.m852k("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = c9386f.f48180b;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C9384d c9384d = f48178a;
        Collections.sort(arrayList, c9384d);
        List<List<byte[]>> listM15671b = c9386f.f48182d;
        if (listM15671b == null) {
            listM15671b = C7904d.m15671b(resources, 0);
        }
        int i10 = 0;
        while (true) {
            cursorM17754a = null;
            if (i10 >= listM15671b.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listM15671b.get(i10));
            Collections.sort(arrayList2, c9384d);
            if (arrayList.size() != arrayList2.size()) {
                z10 = false;
                break;
            }
            int i11 = 0;
            while (true) {
                if (i11 >= arrayList.size()) {
                    z10 = true;
                    break;
                }
                if (!Arrays.equals((byte[]) arrayList.get(i11), (byte[]) arrayList2.get(i11))) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                break;
            }
            i10++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C9392l(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        try {
            cursorM17754a = a.m17754a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{c9386f.f48181c}, null, null);
            if (cursorM17754a != null && cursorM17754a.getCount() > 0) {
                int columnIndex = cursorM17754a.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorM17754a.getColumnIndex("_id");
                int columnIndex3 = cursorM17754a.getColumnIndex("file_id");
                int columnIndex4 = cursorM17754a.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorM17754a.getColumnIndex("font_weight");
                int columnIndex6 = cursorM17754a.getColumnIndex("font_italic");
                while (cursorM17754a.moveToNext()) {
                    arrayList3.add(new C9393m(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorM17754a.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorM17754a.getLong(columnIndex3)), columnIndex4 != -1 ? cursorM17754a.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorM17754a.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorM17754a.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorM17754a.getInt(columnIndex) : 0));
                }
            }
            return new C9392l(0, (C9393m[]) arrayList3.toArray(new C9393m[0]));
        } finally {
            if (cursorM17754a != null) {
                cursorM17754a.close();
            }
        }
    }
}
