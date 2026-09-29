package p122fl;

import ae.C0062b;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import com.tonyodev.fetch2core.Downloader;
import dm.C5207g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: fl.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C5578a implements InterfaceC5589l {

    /* JADX INFO: renamed from: a */
    public final Context f34386a;

    /* JADX INFO: renamed from: b */
    public final String f34387b;

    public C5578a(Context context, String str) {
        C5207g.m11112g(context, "context");
        C5207g.m11112g(str, "defaultTempDir");
        this.f34386a = context;
        this.f34387b = str;
    }

    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: a */
    public final AbstractC5588k mo11803a(Downloader.C4980b c4980b) {
        ContentResolver contentResolver = this.f34386a.getContentResolver();
        C5207g.m11107b(contentResolver, "context.contentResolver");
        return C0062b.m355i1(c4980b.f32533d, contentResolver);
    }

    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: b */
    public final boolean mo11804b(String str) {
        C5207g.m11112g(str, "file");
        if (str.length() == 0) {
            return false;
        }
        try {
            ContentResolver contentResolver = this.f34386a.getContentResolver();
            C5207g.m11107b(contentResolver, "context.contentResolver");
            C0062b.m355i1(str, contentResolver).close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: c */
    public final void mo11805c(String str, long j10) throws IOException {
        C5207g.m11112g(str, "file");
        if (str.length() == 0) {
            throw new FileNotFoundException(str.concat(" file_not_found"));
        }
        if (j10 < 1) {
            return;
        }
        Context context = this.f34386a;
        C5207g.m11112g(context, "context");
        if (!C5579b.m11827s(str)) {
            C0062b.m285L(new File(str), j10);
            return;
        }
        Uri uri = Uri.parse(str);
        C5207g.m11107b(uri, "uri");
        if (C5207g.m11106a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                str = path;
            }
            C0062b.m285L(new File(str), j10);
            return;
        }
        if (!C5207g.m11106a(uri.getScheme(), "content")) {
            throw new IOException("file_allocation_error");
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "w");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new IOException("file_allocation_error");
        }
        if (j10 > 0) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                if (fileOutputStream.getChannel().size() == j10) {
                    return;
                }
                fileOutputStream.getChannel().position(j10 - 1);
                fileOutputStream.write(1);
            } catch (Exception unused) {
                throw new IOException("file_allocation_error");
            }
        }
    }

    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: d */
    public final boolean mo11806d(String str) {
        C5207g.m11112g(str, "file");
        Context context = this.f34386a;
        C5207g.m11112g(context, "context");
        boolean zDelete = false;
        if (C5579b.m11827s(str)) {
            Uri uri = Uri.parse(str);
            C5207g.m11107b(uri, "uri");
            if (C5207g.m11106a(uri.getScheme(), "file")) {
                File file = new File(uri.getPath());
                if (file.canWrite() && file.exists() && file.exists() && file.canWrite()) {
                    return file.delete();
                }
            } else if (C5207g.m11106a(uri.getScheme(), "content")) {
                if (DocumentsContract.isDocumentUri(context, uri)) {
                    return DocumentsContract.deleteDocument(context.getContentResolver(), uri);
                }
                if (context.getContentResolver().delete(uri, null, null) > 0) {
                    return true;
                }
            }
        } else {
            File file2 = new File(str);
            if (file2.exists() && file2.canWrite()) {
                zDelete = file2.delete();
            }
        }
        return zDelete;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: e */
    public final String mo11807e(String str, boolean z10) throws IOException {
        C5207g.m11112g(str, "file");
        Context context = this.f34386a;
        C5207g.m11112g(context, "context");
        if (!C5579b.m11827s(str)) {
            return C0062b.m265F0(str, z10);
        }
        Uri uri = Uri.parse(str);
        C5207g.m11107b(uri, "uri");
        if (C5207g.m11106a(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                str = path;
            }
            return C0062b.m265F0(str, z10);
        }
        if (!C5207g.m11106a(uri.getScheme(), "content")) {
            throw new IOException("FNC");
        }
        if (context.getContentResolver().openFileDescriptor(uri, "w") != null) {
            return str;
        }
        throw new IOException("FNC");
    }

    @Override // p122fl.InterfaceC5589l
    /* JADX INFO: renamed from: f */
    public final String mo11808f(Downloader.C4980b c4980b) {
        return this.f34387b;
    }
}
