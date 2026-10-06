package p000;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oex {

    /* JADX INFO: renamed from: a */
    public static final String f45816a = oex.class.getSimpleName();

    /* JADX INFO: renamed from: a */
    public static nyw m18446a(nyv nyvVar, String str, int i, boolean z, Context context) throws Throwable {
        BufferedInputStream bufferedInputStream;
        byte[] bArr;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(m18447b(str, context)));
            try {
                try {
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    if (bufferedInputStream.read(byteBufferAllocate.array(), 0, byteBufferAllocate.array().length) == -1) {
                        Log.e(f45816a, "Error parsing param record: end of stream.");
                        bArr = null;
                    } else {
                        int i2 = byteBufferAllocate.getInt();
                        int i3 = byteBufferAllocate.getInt();
                        if (i2 != i) {
                            Log.e(f45816a, "Error parsing param record: incorrect sentinel.");
                            bArr = null;
                        } else {
                            bArr = new byte[i3];
                            if (bufferedInputStream.read(bArr, 0, i3) == -1) {
                                Log.e(f45816a, "Error parsing param record: end of stream.");
                                bArr = null;
                            }
                        }
                    }
                } catch (IOException e) {
                    Log.w(f45816a, "Error reading parameters: ".concat(String.valueOf(e.toString())));
                    bArr = null;
                }
                try {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                    }
                } catch (FileNotFoundException e3) {
                    if (z) {
                        e3.toString();
                        bArr = null;
                    } else {
                        bArr = null;
                    }
                } catch (IllegalStateException e4) {
                    Log.w(f45816a, "Error reading parameters: ".concat(e4.toString()));
                    bArr = null;
                }
                if (bArr == null) {
                    return null;
                }
                try {
                    return nyvVar.mo17753d(bArr).mo18103l();
                } catch (nyb e5) {
                    Log.e(f45816a, "Error reading params from ContentProvider", e5);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e6) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static File m18447b(String str, Context context) {
        File file = new File(context.getFilesDir(), "Cardboard");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.isDirectory()) {
            throw new IllegalStateException(file.toString().concat(" already exists as a file, but is expected to be a directory."));
        }
        return new File(file, str);
    }
}
