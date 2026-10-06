package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class bvh implements bra {

    /* JADX INFO: renamed from: a */
    private static final String[] f4532a = {"_data"};

    /* JADX INFO: renamed from: b */
    private final Context f4533b;

    /* JADX INFO: renamed from: c */
    private final Uri f4534c;

    public bvh(Context context, Uri uri) {
        this.f4533b = context;
        this.f4534c = uri;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: a */
    public final Class mo2934a() {
        return File.class;
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: aY */
    public final void mo2937aY() {
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: d */
    public final void mo2939d() {
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: f */
    public final void mo2941f(bpe bpeVar, bqz bqzVar) {
        Cursor cursorQuery = this.f4533b.getContentResolver().query(this.f4534c, f4532a, null, null, null);
        String string = null;
        if (cursorQuery != null) {
            try {
                string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                cursorQuery.close();
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (TextUtils.isEmpty(string)) {
            bqzVar.mo2946e(new FileNotFoundException("Failed to find file path for: ".concat(String.valueOf(String.valueOf(this.f4534c)))));
        } else {
            bqzVar.mo2945b(new File(string));
        }
    }

    @Override // p000.bra
    /* JADX INFO: renamed from: g */
    public final int mo2942g() {
        return 1;
    }
}
