package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bwb implements bra {

    /* JADX INFO: renamed from: a */
    private static final String[] f4627a = {"_data"};

    /* JADX INFO: renamed from: b */
    private final Context f4628b;

    /* JADX INFO: renamed from: c */
    private final bvl f4629c;

    /* JADX INFO: renamed from: d */
    private final bvl f4630d;

    /* JADX INFO: renamed from: e */
    private final Uri f4631e;

    /* JADX INFO: renamed from: f */
    private final int f4632f;

    /* JADX INFO: renamed from: g */
    private final int f4633g;

    /* JADX INFO: renamed from: h */
    private final bqr f4634h;

    /* JADX INFO: renamed from: i */
    private final Class f4635i;

    /* JADX INFO: renamed from: j */
    private volatile boolean f4636j;

    /* JADX INFO: renamed from: k */
    private volatile bra f4637k;

    public bwb(Context context, bvl bvlVar, bvl bvlVar2, Uri uri, int i, int i2, bqr bqrVar, Class cls) {
        this.f4628b = context.getApplicationContext();
        this.f4629c = bvlVar;
        this.f4630d = bvlVar2;
        this.f4631e = uri;
        this.f4632f = i;
        this.f4633g = i2;
        this.f4634h = bqrVar;
        this.f4635i = cls;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return this.f4635i;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
        this.f4636j = true;
        bra braVar = this.f4637k;
        if (braVar != null) {
            braVar.mo2937aY();
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
        bra braVar = this.f4637k;
        if (braVar != null) {
            braVar.mo2939d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [bra] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) throws Throwable {
        C1058va c1058vaMo3084b;
        try {
            Cursor cursor = null;
            if (Environment.isExternalStorageLegacy()) {
                bvl bvlVar = this.f4629c;
                Uri uri = this.f4631e;
                try {
                    Cursor cursorQuery = this.f4628b.getContentResolver().query(uri, f4627a, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow(DNTdN.AoV));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + String.valueOf(uri));
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                c1058vaMo3084b = bvlVar.mo3084b(file, this.f4632f, this.f4633g, this.f4634h);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + String.valueOf(uri));
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                c1058vaMo3084b = this.f4630d.mo3084b(this.f4628b.checkSelfPermission(BcwGDRhrTsnlj.grVd) == 0 ? MediaStore.setRequireOriginal(this.f4631e) : this.f4631e, this.f4632f, this.f4633g, this.f4634h);
            }
            ?? r1 = c1058vaMo3084b != null ? c1058vaMo3084b.f47802a : 0;
            if (r1 == 0) {
                bqzVar.mo2946e(new IllegalArgumentException("Failed to build fetcher for: " + String.valueOf(this.f4631e)));
                return;
            }
            this.f4637k = r1;
            if (this.f4636j) {
                mo2937aY();
            } else {
                r1.mo2941f(bpeVar, bqzVar);
            }
        } catch (FileNotFoundException e) {
            bqzVar.mo2946e(e);
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}
