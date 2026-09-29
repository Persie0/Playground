package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class cy5 {

    /* JADX INFO: renamed from: a */
    public static final sq5 f34709a;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f34709a = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "MetaUtil");
    }

    /* JADX INFO: renamed from: a */
    public static ay5 m9935a(Context context, String str, String str2) {
        Cursor cursor = null;
        try {
            if (context.getPackageManager().resolveContentProvider(str, 0) == null) {
                throw new Exception("Failed to find Content Provider");
            }
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://" + str + "/" + str2), new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                throw new Exception("Failed to query Content Provider, no data");
            }
            int columnIndex = cursorQuery.getColumnIndex("install_referrer");
            int columnIndex2 = cursorQuery.getColumnIndex("actual_timestamp");
            int columnIndex3 = cursorQuery.getColumnIndex("is_ct");
            if (columnIndex <= -1 || columnIndex2 <= -1 || columnIndex3 <= -1) {
                throw new Exception("Failed to read from Cursor");
            }
            dg4 dg4VarM10329d = dg4.m10329d(cursorQuery.getString(columnIndex), false);
            long j = cursorQuery.getLong(columnIndex2);
            int i = cursorQuery.getInt(columnIndex3);
            if (dg4VarM10329d == null) {
                throw new Exception("Failed to read from Cursor, value null");
            }
            ay5 ay5VarM3120b = ay5.m3120b(i, j, dg4VarM10329d);
            cursorQuery.close();
            return ay5VarM3120b;
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033 A[Catch: all -> 0x0055, TRY_ENTER, TryCatch #1 {all -> 0x0055, blocks: (B:13:0x0035, B:16:0x003a, B:18:0x0040, B:20:0x0044, B:12:0x0033), top: B:29:0x0035 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:29:0x0035). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    public static boolean m9936b(Context context) {
        Signature[] signingCertificateHistory;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                SigningInfo signingInfo = context.getPackageManager().getPackageInfo("com.facebook.lite", PackageManager.PackageInfoFlags.of(134217728L)).signingInfo;
                if (signingInfo != null) {
                    signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                } else {
                    signingCertificateHistory = new Signature[0];
                }
            } else {
                SigningInfo signingInfo2 = context.getPackageManager().getPackageInfo("com.facebook.lite", 134217728).signingInfo;
                if (signingInfo2 != null) {
                    signingCertificateHistory = signingInfo2.getSigningCertificateHistory();
                } else {
                    signingCertificateHistory = new Signature[0];
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (signingCertificateHistory.length < 1) {
                return false;
            }
            if (!b34.m3255w("30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) {
                for (Signature signature : signingCertificateHistory) {
                    if (!"30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2".equals(signature.toCharsString())) {
                    }
                }
                return false;
            }
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9937c(Context context) {
        Cursor cursor = null;
        try {
            if (!t9a.m21914d(context, "com.facebook.katana", "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) {
                throw new Exception("Facebook app is not installed");
            }
            if (context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0) == null) {
                throw new Exception("Failed to find Content Provider");
            }
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                throw new Exception("Failed to query Content Provider, no data");
            }
            int columnIndex = cursorQuery.getColumnIndex("aid");
            if (columnIndex <= -1) {
                throw new Exception("Failed to read from Cursor");
            }
            String string = cursorQuery.getString(columnIndex);
            if (string == null) {
                throw new Exception("Failed to read from Cursor, value null");
            }
            cursorQuery.close();
            return string;
        } catch (Throwable th) {
            try {
                throw new Exception("Cannot retrieve Meta Attribution ID. " + th.getMessage());
            } catch (Throwable th2) {
                if (0 == 0) {
                    throw th2;
                }
                cursor.close();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static ay5 m9938d(Context context, String[] strArr, String str) throws Exception {
        String str2;
        if (b34.m3255w(str)) {
            throw new Exception("Cannot retrieve Meta Referrer, missing required App ID");
        }
        for (String str3 : strArr) {
            if ((!"facebook".equals(str3) || t9a.m21914d(context, "com.facebook.katana", "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2")) && ((!"instagram".equals(str3) || t9a.m21914d(context, "com.instagram.android", "3082024d308201b6a00302010202044f31d2cb300d06092a864886f70d0101050500306a310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d53616e204672616e636973636f31163014060355040a130d496e7374616772616d20496e63311630140603550403130d4b6576696e2053797374726f6d3020170d3132303230383031343133315a180f32313132303131353031343133315a306a310b3009060355040613025553311330110603550408130a43616c69666f726e6961311630140603550407130d53616e204672616e636973636f31163014060355040a130d496e7374616772616d20496e63311630140603550403130d4b6576696e2053797374726f6d30819f300d06092a864886f70d010101050003818d003081890281810089ebcac015660b42a5c080bf694c52e29e9df83a4c94964b022ca38d2ba2157d8e4650955c787906ac344bdb8b7d202a92231403d48e9e2f0df3cb917cfa9b9741314c85052673d42ad00f2c251be4a6b012fb9d5b33131b0e5ca0b9193856dc311dc65dc45f97d2632e72bec2b4964adfd5d30675d5d372fbaf11359a7afb550203010001300d06092a864886f70d0101050500038181002aefd84526b570192967b679a685bcdc12cf40030589594d04d885cfa8a311372fb93f2c1c8ba636f061aeb87207f5a1ad26fe58747c30714f1e9b918ab2e090d5250307655eeab5fede1e6409316c5d29779c037b550f29bcad40fa70c947b616cc05daa5532c0ecc3ece773a71f37287a4ac32f2bd7feede847cbac5671969")) && (!"facebooklite".equals(str3) || m9936b(context)))) {
                str3.getClass();
                switch (str3) {
                    case "facebooklite":
                        str2 = "com.facebook.lite.provider.InstallReferrerProvider";
                        break;
                    case "instagram":
                        str2 = "com.instagram.contentprovider.InstallReferrerProvider";
                        break;
                    case "facebook":
                        str2 = "com.facebook.katana.provider.InstallReferrerProvider";
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (str2 == null) {
                    continue;
                } else {
                    try {
                        ay5 ay5VarM9935a = m9935a(context, str2, str);
                        if (ay5VarM9935a.m3124e()) {
                            return ay5VarM9935a;
                        }
                    } catch (Throwable th) {
                        StringBuilder sbM17742q = AbstractC3393o1.m17742q("Cannot retrieve Meta Referrer from source ", str3, ", ");
                        sbM17742q.append(th.getMessage());
                        f34709a.m21555D(sbM17742q.toString());
                    }
                }
            }
        }
        throw new Exception("Cannot retrieve Meta Referrer.");
    }
}
