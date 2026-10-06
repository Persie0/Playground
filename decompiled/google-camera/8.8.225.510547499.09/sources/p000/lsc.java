package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsc extends lsy {

    /* JADX INFO: renamed from: a */
    private final Context f39118a;

    /* JADX INFO: renamed from: d */
    private String f39121d;

    /* JADX INFO: renamed from: c */
    private final Object f39120c = new Object();

    /* JADX INFO: renamed from: b */
    private final lsx f39119b = new lsf(null);

    public lsc(lhz lhzVar, byte[] bArr, byte[] bArr2) {
        this.f39118a = (Context) lhzVar.f38277a;
    }

    /* JADX INFO: renamed from: g */
    public static lhz m15930g(Context context) {
        return new lhz(context, (byte[]) null);
    }

    /* JADX INFO: renamed from: h */
    private final boolean m15931h(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f39118a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    private static final void m15932i() throws lsi {
        throw new lsi("Android backend cannot perform remote operations without a remote backend");
    }

    @Override // p000.lsy
    /* JADX INFO: renamed from: a */
    protected final Uri mo15933a(Uri uri) throws lsj {
        if (m15931h(uri)) {
            throw new lsj("Operation across authorities is not allowed.");
        }
        File fileMo15935c = mo15935c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        mwn mwnVarM17090e = mws.m17090e();
        builderPath.path(fileMo15935c.getAbsolutePath());
        return builderPath.encodedFragment(lsq.m15949a(mwnVarM17090e.m17081f())).build();
    }

    @Override // p000.lsy
    /* JADX INFO: renamed from: b */
    protected final lsx mo15934b() {
        return this.f39119b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    @Override // p000.lsy, p000.lsx
    /* JADX INFO: renamed from: c */
    public final File mo15935c(Uri uri) throws IOException {
        byte b;
        File filesDir;
        Account account;
        String str;
        if (m15931h(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        Context context = this.f39118a;
        if (!uri.getScheme().equals("android")) {
            throw new lsj("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new lsj(String.format(PMZiHihxLGEy.aFsZBKFMlEuDh, uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new lsj("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (!str2.equals("external")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 94416770:
                if (!str2.equals(YmzeHXaMYOLk.mMDIjeDCSQKnzWq)) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 97434231:
                if (!str2.equals("files")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 835260319:
                if (!str2.equals("managed")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 988548496:
                if (!str2.equals("directboot-cache")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 991565957:
                if (!str2.equals("directboot-files")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                filesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                break;
            case 1:
                filesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                break;
            case 2:
                filesDir = lij.m15450t(context);
                break;
            case 3:
                filesDir = context.getCacheDir();
                break;
            case 4:
                File file = new File(lij.m15450t(context), "managed");
                if (arrayList.size() >= 3) {
                    try {
                        String str3 = (String) arrayList.get(2);
                        Account account2 = lsb.f39117a;
                        if ("shared".equals(str3)) {
                            account = lsb.f39117a;
                        } else {
                            int iIndexOf = str3.indexOf(58);
                            lij.m15448r(iIndexOf >= 0, "Malformed account", new Object[0]);
                            account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                        }
                        if (!lsb.m15929a(account)) {
                            throw new lsj("AccountManager cannot be null");
                        }
                    } catch (IllegalArgumentException e) {
                        throw new lsj(e);
                    }
                }
                filesDir = file;
                break;
            case 5:
                filesDir = context.getExternalFilesDir(null);
                break;
            default:
                throw new lsj(String.format("Path must start with a valid logical location: %s", uri));
        }
        File file2 = new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
        if (!kuh.m14889d(this.f39118a)) {
            synchronized (this.f39120c) {
                if (this.f39121d == null) {
                    this.f39121d = lij.m15450t(this.f39118a.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                }
                str = this.f39121d;
            }
            if (!file2.getAbsolutePath().startsWith(str)) {
                throw new lsi("Cannot access credential-protected data from direct boot");
            }
        }
        return file2;
    }

    @Override // p000.lsy, p000.lsx
    /* JADX INFO: renamed from: d */
    public final InputStream mo15936d(Uri uri) throws lsi {
        if (!m15931h(uri)) {
            return this.f39119b.mo15936d(mo15933a(uri));
        }
        m15932i();
        throw null;
    }

    @Override // p000.lsx
    /* JADX INFO: renamed from: e */
    public final String mo15937e() {
        return "android";
    }

    @Override // p000.lsy, p000.lsx
    /* JADX INFO: renamed from: f */
    public final boolean mo15938f(Uri uri) throws lsi {
        if (!m15931h(uri)) {
            return this.f39119b.mo15938f(mo15933a(uri));
        }
        m15932i();
        throw null;
    }
}
