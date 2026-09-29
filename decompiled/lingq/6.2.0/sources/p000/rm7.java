package p000;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class rm7 {

    /* JADX INFO: renamed from: a */
    public final int f59537a;

    /* JADX INFO: renamed from: b */
    public final int f59538b;

    /* JADX INFO: renamed from: c */
    public final long f59539c;

    /* JADX INFO: renamed from: d */
    public final long f59540d;

    public rm7(int i, int i2, long j, long j2) {
        this.f59537a = i;
        this.f59538b = i2;
        this.f59539c = j;
        this.f59540d = j2;
    }

    /* JADX INFO: renamed from: a */
    public static rm7 m20714a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            rm7 rm7Var = new rm7(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return rm7Var;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m20715b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f59537a);
            dataOutputStream.writeInt(this.f59538b);
            dataOutputStream.writeLong(this.f59539c);
            dataOutputStream.writeLong(this.f59540d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof rm7)) {
            rm7 rm7Var = (rm7) obj;
            if (this.f59538b == rm7Var.f59538b && this.f59539c == rm7Var.f59539c && this.f59537a == rm7Var.f59537a && this.f59540d == rm7Var.f59540d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f59538b), Long.valueOf(this.f59539c), Integer.valueOf(this.f59537a), Long.valueOf(this.f59540d));
    }
}
