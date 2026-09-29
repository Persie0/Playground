package p000;

import android.net.Uri;
import android.text.TextUtils;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r33 {

    /* JADX INFO: renamed from: a */
    public final String f58550a;

    /* JADX INFO: renamed from: b */
    public final HashMap f58551b = new HashMap();

    public r33(String str) {
        this.f58550a = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m20276a(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            C3386nv.m17626m("Name must not be empty");
            return;
        }
        try {
            this.f58551b.put(str, file.getCanonicalFile());
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m20277b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            v63.m23142t(uri, "Unable to find path from root: ");
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f58551b.get(strDecode);
        if (file == null) {
            v63.m23142t(uri, "Unable to find configured root for ");
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (FileProvider.m1990a(canonicalFile.getPath()).startsWith(FileProvider.m1990a(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            v63.m23142t(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final Uri m20278c(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : this.f58551b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (FileProvider.m1990a(canonicalPath).startsWith(FileProvider.m1990a(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                C3386nv.m17626m(AbstractC3393o1.m17734i("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(this.f58550a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            v63.m23142t(file, "Failed to resolve canonical path for ");
            return null;
        }
    }
}
