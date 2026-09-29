package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzsg;
import com.google.android.gms.internal.measurement.zzsi;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class jgd implements uid {

    /* JADX INFO: renamed from: a */
    public final Context f45534a;

    /* JADX INFO: renamed from: d */
    public String f45537d;

    /* JADX INFO: renamed from: c */
    public final Object f45536c = new Object();

    /* JADX INFO: renamed from: b */
    public final wgd f45535b = new wgd();

    public jgd(C3002fi c3002fi) {
        this.f45534a = c3002fi.f39115a;
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: a */
    public final ohd mo14447a(Uri uri) throws zzsg, zzsi {
        if (m14455i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File fileM19856h = qba.m19856h(m14454h(uri));
        return new ohd(new FileInputStream(fileM19856h), fileM19856h);
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: b */
    public final boolean mo14448b(Uri uri) throws zzsg {
        if (m14455i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        return qba.m19856h(m14454h(uri)).exists();
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: c */
    public final String mo14449c() {
        return "android";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:53:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:55:0x0112, B:57:0x0116, B:60:0x012b, B:61:0x012d), top: B:80:0x0112 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:80:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.uid
    /* JADX INFO: renamed from: d */
    public final File mo14450d(Uri uri) throws IOException {
        File externalFilesDir;
        Account account;
        File file;
        String str;
        if (m14455i(uri)) {
            v63.m23133k("operation is not permitted in other authorities.");
            return null;
        }
        Context context = this.f45534a;
        if (!uri.getScheme().equals("android")) {
            throw new zzsi("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new zzsi("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str2 = (String) arrayList.get(0);
        switch (str2.hashCode()) {
            case -1820761141:
                if (str2.equals("external")) {
                    externalFilesDir = context.getExternalFilesDir(null);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            try {
                                if (this.f45537d == null) {
                                    this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                                }
                                str = this.f45537d;
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                        if (!file.getAbsolutePath().startsWith(str)) {
                            throw new zzsg("Cannot access credential-protected data from direct boot");
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 94416770:
                if (str2.equals("cache")) {
                    externalFilesDir = context.getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            if (this.f45537d == null) {
                                this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f45537d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new zzsg("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 97434231:
                if (str2.equals("files")) {
                    externalFilesDir = kaa.m15047i(context);
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            if (this.f45537d == null) {
                                this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f45537d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new zzsg("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 835260319:
                if (str2.equals("managed")) {
                    File file2 = new File(kaa.m15047i(context), "managed");
                    if (arrayList.size() >= 3) {
                        try {
                            String str3 = (String) arrayList.get(2);
                            Account account2 = fgd.f39096a;
                            if ("shared".equals(str3)) {
                                account = fgd.f39096a;
                            } else {
                                int iIndexOf = str3.indexOf(58);
                                bca.m3614j(iIndexOf >= 0, "Malformed account", new Object[0]);
                                account = new Account(str3.substring(iIndexOf + 1), str3.substring(0, iIndexOf));
                            }
                            if (!fgd.f39096a.equals(account)) {
                                throw new zzsi("AccountManager cannot be null");
                            }
                        } catch (IllegalArgumentException e) {
                            throw new zzsi(e);
                        }
                    }
                    externalFilesDir = file2;
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            if (this.f45537d == null) {
                                this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f45537d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new zzsg("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 988548496:
                if (str2.equals("directboot-cache")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getCacheDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            if (this.f45537d == null) {
                                this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f45537d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new zzsg("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            case 991565957:
                if (str2.equals("directboot-files")) {
                    externalFilesDir = context.createDeviceProtectedStorageContext().getFilesDir();
                    file = new File(externalFilesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
                    if (!pvc.m19504L(context)) {
                        synchronized (this.f45536c) {
                            if (this.f45537d == null) {
                                this.f45537d = kaa.m15047i(context.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                            }
                            str = this.f45537d;
                            if (!file.getAbsolutePath().startsWith(str)) {
                                throw new zzsg("Cannot access credential-protected data from direct boot");
                            }
                        }
                    }
                    return file;
                }
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
            default:
                throw new zzsi(String.format("Path must start with a valid logical location: %s", uri));
        }
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: e */
    public final OutputStream mo14451e(Uri uri) {
        return this.f45535b.mo14451e(m14454h(uri));
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: f */
    public final void mo14452f(Uri uri) {
        this.f45535b.mo14452f(m14454h(uri));
    }

    @Override // p000.uid
    /* JADX INFO: renamed from: g */
    public final void mo14453g(Uri uri, Uri uri2) throws IOException {
        this.f45535b.mo14453g(m14454h(uri), m14454h(uri2));
    }

    /* JADX INFO: renamed from: h */
    public final Uri m14454h(Uri uri) throws IOException {
        if (m14455i(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File fileMo14450d = mo14450d(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path("/");
        c14 c14VarM6284m = ImmutableList.m6284m();
        builderPath.path(fileMo14450d.getAbsolutePath());
        ImmutableList immutableListM4280g = c14VarM6284m.m4280g();
        Pattern pattern = aid.f721a;
        return builderPath.encodedFragment(immutableListM4280g.isEmpty() ? null : "transform=".concat(new si4("+", 1).m21395b(immutableListM4280g))).build();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14455i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f45534a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
