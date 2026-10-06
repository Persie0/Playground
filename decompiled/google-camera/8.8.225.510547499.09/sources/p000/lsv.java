package p000;

import android.net.Uri;
import android.os.Process;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lsv implements lsa {

    /* JADX INFO: renamed from: a */
    public lsg[] f39144a;

    /* JADX INFO: renamed from: b */
    private final nyw f39145b;

    public lsv(nyw nywVar) {
        this.f39145b = nywVar;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Object, lsx] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, lsx] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, lsx] */
    @Override // p000.lsa
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object mo15928a(lie lieVar) throws IOException {
        Object obj = lieVar.f38294a;
        Uri uri = (Uri) obj;
        Uri uriBuild = uri.buildUpon().path(String.valueOf(uri.getPath()).concat(".mobstore_tmp-" + Process.myPid() + "-" + Thread.currentThread().getId() + "-" + System.currentTimeMillis() + "-" + lsu.f39143a.getAndIncrement())).build();
        List listM15382a = lieVar.m15382a(lieVar.f38295b.mo15943j(uriBuild));
        lsg[] lsgVarArr = this.f39144a;
        if (lsgVarArr != null) {
            lsgVarArr[0].m15946a(listM15382a);
        }
        try {
            OutputStream outputStream = (OutputStream) listM15382a.get(0);
            try {
                this.f39145b.mo17759I(outputStream);
                lsg[] lsgVarArr2 = this.f39144a;
                if (lsgVarArr2 != null) {
                    lsgVarArr2[0].m15947b();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                lieVar.f38295b.mo15945l(uriBuild, (Uri) lieVar.f38294a);
                return null;
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e) {
                        }
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            try {
                lieVar.f38295b.mo15944k(uriBuild);
            } catch (FileNotFoundException e3) {
            }
            if (e2 instanceof IOException) {
                throw ((IOException) e2);
            }
            throw new IOException(e2);
        }
    }
}
