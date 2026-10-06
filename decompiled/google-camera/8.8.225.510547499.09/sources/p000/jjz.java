package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jjz extends jij {
    public static final Parcelable.Creator CREATOR = new jie(5);

    /* JADX INFO: renamed from: a */
    ParcelFileDescriptor f34214a;

    /* JADX INFO: renamed from: b */
    final String f34215b;

    /* JADX INFO: renamed from: c */
    final String f34216c;

    /* JADX INFO: renamed from: d */
    public File f34217d;

    public jjz(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f34214a = parcelFileDescriptor;
        this.f34215b = str;
        this.f34216c = str2;
    }

    /* JADX INFO: renamed from: a */
    static final void m13323a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f34214a != null) {
            int iM13281h = jiy.m13281h(parcel);
            jiy.m13295v(parcel, 2, this.f34214a, i);
            jiy.m13296w(parcel, 3, this.f34215b);
            jiy.m13296w(parcel, 4, this.f34216c);
            jiy.m13283j(parcel, iM13281h);
            return;
        }
        File file = this.f34217d;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                this.f34214a = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                fileCreateTempFile.delete();
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                try {
                    try {
                        throw null;
                    } catch (IOException e) {
                        throw new IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (Throwable th) {
                    m13323a(dataOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (IOException e3) {
            throw new IllegalStateException("Could not create temporary file:", e3);
        }
    }
}
