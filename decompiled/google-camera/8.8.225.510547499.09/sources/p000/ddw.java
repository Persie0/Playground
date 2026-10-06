package p000;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ddw {

    /* JADX INFO: renamed from: a */
    public nqf f10606a;

    /* JADX INFO: renamed from: b */
    public final iad f10607b;

    /* JADX INFO: renamed from: c */
    public final Executor f10608c;

    /* JADX INFO: renamed from: d */
    public final oju f10609d;

    /* JADX INFO: renamed from: e */
    public boolean f10610e = false;

    /* JADX INFO: renamed from: f */
    private final Context f10611f;

    /* JADX INFO: renamed from: g */
    private File f10612g;

    /* JADX INFO: renamed from: h */
    private final dsx f10613h;

    public ddw(Context context, iad iadVar, dsx dsxVar, Executor executor, oju ojuVar, byte[] bArr, byte[] bArr2) {
        this.f10611f = context;
        this.f10607b = iadVar;
        this.f10613h = dsxVar;
        this.f10608c = executor;
        this.f10609d = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized Uri m5958a(Bitmap bitmap) {
        aie aieVarM175a;
        String canonicalPath;
        Map.Entry entry;
        String path;
        File file = new File(this.f10611f.getFilesDir(), "docs/");
        this.f10612g = file;
        if (!file.exists() && !this.f10612g.mkdir()) {
            throw new IllegalStateException("Unable to create directory for sharing frame");
        }
        File[] fileArrListFiles = this.f10612g.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        File file3 = new File(this.f10612g, String.valueOf(String.valueOf(UUID.randomUUID())).concat(".jpeg"));
        file3.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file3);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            Context context = this.f10611f;
            aieVarM175a = abz.m175a(context, String.valueOf(context.getPackageName()).concat(".fileprovider"), 0);
            try {
                canonicalPath = file3.getCanonicalPath();
                entry = null;
                for (Map.Entry entry2 : ((HashMap) aieVarM175a.f426a).entrySet()) {
                    String path2 = ((File) entry2.getValue()).getPath();
                    if (canonicalPath.startsWith(path2) && (entry == null || path2.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(canonicalPath)));
                }
                path = ((File) entry.getValue()).getPath();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to resolve canonical path for ");
                sb.append(file3);
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(file3.toString()));
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                } catch (Exception e2) {
                }
            }
            throw th;
        }
        return new Uri.Builder().scheme("content").authority((String) aieVarM175a.f427b).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path.endsWith(TVkaNXnfP.xQiFtDR) ? canonicalPath.substring(path.length()) : canonicalPath.substring(path.length() + 1), "/")).build();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5959b() {
        if (this.f10612g != null) {
            return;
        }
        File file = new File(this.f10611f.getFilesDir(), "docs/");
        this.f10612g = file;
        if (file.exists()) {
            File[] fileArrListFiles = this.f10612g.listFiles();
            if (fileArrListFiles != null && (fileArrListFiles.length) > 0) {
                for (File file2 : fileArrListFiles) {
                    file2.delete();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m5960c(Uri uri) {
        Intent intent = new Intent("com.google.android.apps.docs.SCAN_DOCUMENT");
        intent.setDataAndType(uri, BcwGDRhrTsnlj.DlJQ);
        intent.addFlags(3);
        try {
            this.f10611f.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            this.f10613h.m6700o();
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m5961d() {
        this.f10610e = false;
    }
}
