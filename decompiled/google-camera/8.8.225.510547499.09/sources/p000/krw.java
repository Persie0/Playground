package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class krw implements krl {

    /* JADX INFO: renamed from: a */
    private final ContentResolver f37090a;

    /* JADX INFO: renamed from: b */
    private final krt f37091b;

    /* JADX INFO: renamed from: c */
    private Uri f37092c = Uri.EMPTY;

    /* JADX INFO: renamed from: d */
    private final ContentValues f37093d;

    /* JADX INFO: renamed from: e */
    private final krj f37094e;

    public krw(krt krtVar, ContentResolver contentResolver, ContentValues contentValues, krj krjVar) {
        this.f37091b = krtVar;
        this.f37090a = contentResolver;
        this.f37093d = contentValues;
        this.f37094e = krjVar;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: a */
    public final long mo14760a() {
        if (Uri.EMPTY.equals(this.f37092c)) {
            return -1L;
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f37090a.openFileDescriptor(this.f37092c, "r");
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                return -1L;
            }
            try {
                long statSize = parcelFileDescriptorOpenFileDescriptor.getStatSize();
                parcelFileDescriptorOpenFileDescriptor.close();
                return statSize;
            } catch (Throwable th) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th2) {
                    try {
                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                    } catch (Exception e) {
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            return -1L;
        }
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: b */
    public final FileInputStream mo14761b() throws FileNotFoundException {
        m14787l();
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f37090a.openFileDescriptor(this.f37092c, "r");
        parcelFileDescriptorOpenFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for reading for %s", Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: c */
    public final FileOutputStream mo14762c() {
        throw null;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: d */
    public final void mo14763d() throws IOException {
        m14787l();
        if (Uri.EMPTY.equals(this.f37092c)) {
            return;
        }
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f37090a.openFileDescriptor(this.f37092c, "w");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            Log.w(hiCTUJiAxf.eSTq, "MediaStore URI created but failed to open fd for " + String.valueOf(this.f37092c));
        }
        if (parcelFileDescriptorOpenFileDescriptor != null) {
            parcelFileDescriptorOpenFileDescriptor.close();
        }
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: e */
    public final boolean mo14764e() {
        return true;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: f */
    public final boolean mo14765f() {
        return true;
    }

    @Override // p000.krk
    /* JADX INFO: renamed from: g */
    public final FileOutputStream mo14766g() throws FileNotFoundException {
        m14787l();
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = this.f37090a.openFileDescriptor(this.f37092c, EArqVBjecl.XOHDqsfOjFt);
        parcelFileDescriptorOpenFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for writing for %s", Integer.valueOf(parcelFileDescriptorOpenFileDescriptor.getFd()), this);
        return new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor);
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: h */
    public final Uri mo14767h() {
        return this.f37092c;
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: i */
    public final krt mo14768i() {
        return this.f37091b;
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: j */
    public final void mo14769j() {
    }

    @Override // p000.krl
    /* JADX INFO: renamed from: k */
    public final boolean mo14770k() {
        return true;
    }

    /* JADX INFO: renamed from: l */
    final void m14787l() {
        Uri uri;
        if (Uri.EMPTY.equals(this.f37092c)) {
            if (kxk.m15012e(this.f37091b.f37089e)) {
                uri = this.f37094e.f37053c;
            } else {
                if (!kxk.m15013f(this.f37091b.f37089e)) {
                    throw new IllegalArgumentException("Trying to insert non-media file: ".concat(this.f37091b.toString()));
                }
                uri = this.f37094e.f37054d;
            }
            Uri uriInsert = this.f37090a.insert(uri, this.f37093d);
            uriInsert.getClass();
            this.f37092c = uriInsert;
        }
    }

    public final String toString() {
        return this.f37091b.toString();
    }
}
