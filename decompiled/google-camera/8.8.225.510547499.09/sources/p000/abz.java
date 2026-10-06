package p000;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class abz extends ContentProvider {

    /* JADX INFO: renamed from: a */
    private static final String[] f65a = {"_display_name", "_size"};

    /* JADX INFO: renamed from: b */
    private static final File f66b = new File(PMZiHihxLGEy.ESANQjF);

    /* JADX INFO: renamed from: c */
    private static final HashMap f67c = new HashMap();

    /* JADX INFO: renamed from: d */
    private final int f68d = 0;

    /* JADX INFO: renamed from: e */
    private aie f69e;

    public abz() {
    }

    /* JADX INFO: renamed from: a */
    public static aie m175a(Context context, String str, int i) {
        aie aieVar;
        HashMap map = f67c;
        synchronized (map) {
            aieVar = (aie) map.get(str);
            if (aieVar == null) {
                try {
                    try {
                        aieVar = new aie(str);
                        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (providerInfoResolveContentProvider == null) {
                            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(String.valueOf(str)));
                        }
                        if (providerInfoResolveContentProvider.metaData == null && i != 0) {
                            providerInfoResolveContentProvider.metaData = new Bundle(1);
                            providerInfoResolveContentProvider.metaData.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (xmlResourceParserLoadXmlMetaData == null) {
                            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        while (true) {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                f67c.put(str, aieVar);
                                break;
                            }
                            if (next == 2) {
                                String name = xmlResourceParserLoadXmlMetaData.getName();
                                File externalStorageDirectory = null;
                                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, pIeXJQLZLfgIN.FGBbLpcqqt);
                                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    externalStorageDirectory = f66b;
                                } else if ("files-path".equals(name)) {
                                    externalStorageDirectory = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    externalStorageDirectory = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    File[] fileArrM172d = abx.m172d(context);
                                    externalStorageDirectory = fileArrM172d.length > 0 ? fileArrM172d[0] : null;
                                } else if ("external-cache-path".equals(name)) {
                                    File[] fileArrM151a = abs.m151a(context);
                                    externalStorageDirectory = fileArrM151a.length > 0 ? fileArrM151a[0] : null;
                                } else if ("external-media-path".equals(name)) {
                                    File[] fileArrM173a = aby.m173a(context);
                                    if (fileArrM173a.length > 0) {
                                        externalStorageDirectory = fileArrM173a[0];
                                    }
                                }
                                if (externalStorageDirectory != null) {
                                    String[] strArr = {attributeValue2};
                                    for (int i2 = 0; i2 <= 0; i2++) {
                                        String str2 = strArr[i2];
                                        if (str2 != null) {
                                            externalStorageDirectory = new File(externalStorageDirectory, str2);
                                        }
                                    }
                                    if (TextUtils.isEmpty(attributeValue)) {
                                        throw new IllegalArgumentException("Name must not be empty");
                                    }
                                    try {
                                        ((HashMap) aieVar.f426a).put(attributeValue, externalStorageDirectory.getCanonicalFile());
                                    } catch (IOException e) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("Failed to resolve canonical path for ");
                                        sb.append(externalStorageDirectory);
                                        throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(externalStorageDirectory.toString()), e);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (XmlPullParserException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (IOException e3) {
                    throw new IllegalArgumentException(VCYBIzY.CPcW, e3);
                }
            }
        }
        return aieVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException(hIAHJKEnGsNbz.WmbwoYRQwORunF);
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap map = f67c;
        synchronized (map) {
            map.remove(str);
        }
        this.f69e = m175a(context, str, this.f68d);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f69e.m757b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileM757b = this.f69e.m757b(uri);
        int iLastIndexOf = fileM757b.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM757b.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileM757b = this.f69e.m757b(uri);
        if (xRFdVyfdeve.OCn.equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!IuyLAqNmW.FtymrmjxXYk.equals(str)) {
                throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(str)));
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileM757b, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File fileM757b = this.f69e.m757b(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f65a;
        }
        int length = strArr.length;
        String[] strArr3 = new String[length];
        Object[] objArr = new Object[length];
        int i = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i] = "_display_name";
                int i2 = i + 1;
                objArr[i] = queryParameter == null ? fileM757b.getName() : queryParameter;
                i = i2;
            } else if ("_size".equals(str3)) {
                strArr3[i] = "_size";
                objArr[i] = Long.valueOf(fileM757b.length());
                i++;
            }
        }
        String[] strArr4 = new String[i];
        System.arraycopy(strArr3, 0, strArr4, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    protected abz(byte[] bArr) {
    }
}
