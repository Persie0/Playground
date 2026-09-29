package androidx.core.content;

import android.annotation.SuppressLint;
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
import androidx.activity.result.C0204c;
import com.kochava.tracker.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import p254m2.C7472a;

/* JADX INFO: loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* JADX INFO: renamed from: b */
    public static final String[] f5575b = {"_display_name", "_size"};

    /* JADX INFO: renamed from: c */
    public static final File f5576c = new File("/");

    /* JADX INFO: renamed from: d */
    public static final HashMap<String, InterfaceC0776b> f5577d = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public InterfaceC0776b f5578a;

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$a */
    public static class C0775a {
        /* JADX INFO: renamed from: a */
        public static File[] m2959a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$b */
    public interface InterfaceC0776b {
        /* JADX INFO: renamed from: a */
        File mo2960a(Uri uri);

        /* JADX INFO: renamed from: b */
        Uri mo2961b(File file);
    }

    /* JADX INFO: renamed from: androidx.core.content.FileProvider$c */
    public static class C0777c implements InterfaceC0776b {

        /* JADX INFO: renamed from: a */
        public final String f5579a;

        /* JADX INFO: renamed from: b */
        public final HashMap<String, File> f5580b = new HashMap<>();

        public C0777c(String str) {
            this.f5579a = str;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.core.content.FileProvider.InterfaceC0776b
        /* JADX INFO: renamed from: a */
        public final File mo2960a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int iIndexOf = encodedPath.indexOf(47, 1);
            String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
            String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
            File file = this.f5580b.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.core.content.FileProvider.InterfaceC0776b
        /* JADX INFO: renamed from: b */
        public final Uri mo2961b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                loop0: while (true) {
                    for (Map.Entry<String, File> entry2 : this.f5580b.entrySet()) {
                        String path = entry2.getValue().getPath();
                        if (!canonicalPath.startsWith(path) || (entry != null && path.length() <= entry.getValue().getPath().length())) {
                        }
                        entry = entry2;
                    }
                    break loop0;
                }
                if (entry == null) {
                    throw new IllegalArgumentException(C0204c.m852k("Failed to find configured root that contains ", canonicalPath));
                }
                String path2 = entry.getValue().getPath();
                return new Uri.Builder().scheme("content").authority(this.f5579a).encodedPath(Uri.encode(entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC0776b m2957a(Context context, String str) {
        InterfaceC0776b interfaceC0776bM2958b;
        HashMap<String, InterfaceC0776b> map = f5577d;
        synchronized (map) {
            interfaceC0776bM2958b = map.get(str);
            if (interfaceC0776bM2958b == null) {
                try {
                    try {
                        interfaceC0776bM2958b = m2958b(context, str);
                        map.put(str, interfaceC0776bM2958b);
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                    }
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return interfaceC0776bM2958b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static C0777c m2958b(Context context, String str) throws XmlPullParserException, IOException {
        C0777c c0777c = new C0777c(str);
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, BuildConfig.SDK_TRUNCATE_LENGTH);
        if (providerInfoResolveContentProvider == null) {
            throw new IllegalArgumentException(C0204c.m852k("Couldn't find meta-data for provider with authority ", str));
        }
        Bundle bundle = providerInfoResolveContentProvider.metaData;
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return c0777c;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                File externalStorageDirectory = null;
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f5576c;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    Object obj = C7472a.f41322a;
                    File[] fileArrM14846b = C7472a.b.m14846b(context, null);
                    if (fileArrM14846b.length > 0) {
                        externalStorageDirectory = fileArrM14846b[0];
                    }
                } else if ("external-cache-path".equals(name)) {
                    Object obj2 = C7472a.f41322a;
                    File[] fileArrM14845a = C7472a.b.m14845a(context);
                    if (fileArrM14845a.length > 0) {
                        externalStorageDirectory = fileArrM14845a[0];
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] fileArrM2959a = C0775a.m2959a(context);
                    if (fileArrM2959a.length > 0) {
                        externalStorageDirectory = fileArrM2959a[0];
                    }
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    if (attributeValue2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, attributeValue2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        throw new IllegalArgumentException("Name must not be empty");
                    }
                    try {
                        c0777c.f5580b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e10) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority.split(";")[0];
        HashMap<String, InterfaceC0776b> map = f5577d;
        synchronized (map) {
            try {
                map.remove(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f5578a = m2957a(context, str);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return this.f5578a.mo2960a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileMo2960a = this.f5578a.mo2960a(uri);
        int iLastIndexOf = fileMo2960a.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileMo2960a.getName().substring(iLastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i10;
        File fileMo2960a = this.f5578a.mo2960a(uri);
        if ("r".equals(str)) {
            i10 = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i10 = 738197504;
        } else if ("wa".equals(str)) {
            i10 = 704643072;
        } else if ("rw".equals(str)) {
            i10 = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new IllegalArgumentException(C0204c.m852k("Invalid mode: ", str));
            }
            i10 = 1006632960;
        }
        return ParcelFileDescriptor.open(fileMo2960a, i10);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i10;
        File fileMo2960a = this.f5578a.mo2960a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f5575b;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? fileMo2960a.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i11] = "_size";
                    i10 = i11 + 1;
                    objArr[i11] = Long.valueOf(fileMo2960a.length());
                }
            }
            i11 = i10;
        }
        String[] strArr4 = new String[i11];
        System.arraycopy(strArr3, 0, strArr4, 0, i11);
        Object[] objArr2 = new Object[i11];
        System.arraycopy(objArr, 0, objArr2, 0, i11);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
