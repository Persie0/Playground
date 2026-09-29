package p290o6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import cc.C1834h4;
import cc.C1971w6;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.internal.measurement.C2587a4;
import com.google.android.gms.internal.measurement.C2615c4;
import com.google.android.gms.internal.measurement.C2684h3;
import com.google.android.gms.internal.measurement.C2727k4;
import com.google.android.gms.internal.measurement.InterfaceC2597b0;
import com.google.android.gms.internal.measurement.InterfaceC2790p;
import dm.C5207g;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.HashMap;
import p450w6.C9815b;
import p450w6.InterfaceC9814a;

/* JADX INFO: renamed from: o6.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7968m implements InterfaceC9814a, InterfaceC2597b0 {

    /* JADX INFO: renamed from: a */
    public Object f43383a;

    /* JADX INFO: renamed from: b */
    public Object f43384b;

    public C7968m() {
    }

    public C7968m(Context context, int... iArr) {
        this.f43383a = context;
        int length = iArr.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String string = ((Context) this.f43383a).getString(iArr[i10]);
            C5207g.m11110e(string, "context.getString(sRID[it])");
            strArr[i10] = string;
        }
        this.f43384b = strArr;
    }

    public C7968m(C1834h4 c1834h4, String str) {
        this.f43384b = c1834h4;
        this.f43383a = str;
    }

    public C7968m(C1971w6 c1971w6) {
        this.f43384b = c1971w6;
    }

    public C7968m(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f43384b = cleverTapInstanceConfig;
        this.f43383a = new C9815b(InterfaceC7984w.f43429b);
        ((CleverTapInstanceConfig) this.f43384b).m6434c("ON_USER_LOGIN", "LegacyIdentityRepo Setting the default IdentitySet[" + ((C9815b) this.f43383a) + "]");
    }

    public C7968m(Object obj) {
        this.f43383a = obj;
        this.f43384b = Thread.currentThread();
    }

    public /* synthetic */ C7968m(Object obj, Object obj2) {
        this.f43383a = obj;
        this.f43384b = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0049  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX INFO: renamed from: d */
    public static C7968m m15816d(Context context) {
        Throwable e10;
        FileChannel channel;
        FileLock fileLockLock;
        try {
            channel = new RandomAccessFile(new File(context.getFilesDir(), "generatefid.lock"), "rw").getChannel();
            try {
                fileLockLock = channel.lock();
                try {
                    return new C7968m(channel, fileLockLock);
                } catch (IOException e11) {
                    e10 = e11;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        try {
                            fileLockLock.release();
                        } catch (IOException unused) {
                        }
                    }
                    if (channel != null) {
                        try {
                            channel.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                } catch (Error e12) {
                    e10 = e12;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                } catch (OverlappingFileLockException e13) {
                    e10 = e13;
                    Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", e10);
                    if (fileLockLock != null) {
                        fileLockLock.release();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                    return null;
                }
            } catch (IOException | Error | OverlappingFileLockException e14) {
                e10 = e14;
                fileLockLock = null;
            }
        } catch (IOException | Error | OverlappingFileLockException e15) {
            e10 = e15;
            channel = null;
            fileLockLock = null;
        }
    }

    @Override // p450w6.InterfaceC9814a
    /* JADX INFO: renamed from: a */
    public final boolean mo4794a(String str) {
        boolean zM15834a = C7979r0.m15834a(str, ((C9815b) this.f43383a).f49959a);
        ((CleverTapInstanceConfig) this.f43384b).m6434c("ON_USER_LOGIN", "isIdentity [Key: " + str + " , Value: " + zM15834a + "]");
        return zM15834a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2597b0
    /* JADX INFO: renamed from: b */
    public final C2684h3 mo1214b(InterfaceC2790p interfaceC2790p) {
        ((C2684h3) this.f43383a).m7866e((String) this.f43384b, interfaceC2790p);
        return (C2684h3) this.f43383a;
    }

    @Override // p450w6.InterfaceC9814a
    /* JADX INFO: renamed from: c */
    public final C9815b mo4796c() {
        return (C9815b) this.f43383a;
    }

    /* JADX INFO: renamed from: e */
    public final void m15817e() {
        this.f43383a = null;
        this.f43384b = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m15818f() {
        try {
            ((FileLock) this.f43384b).release();
            ((FileChannel) this.f43383a).close();
        } catch (IOException e10) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: g */
    public final Object m15819g() {
        C2727k4 c2727k4 = (C2727k4) this.f43383a;
        String str = (String) this.f43384b;
        ContentResolver contentResolver = c2727k4.f14289a.getContentResolver();
        Uri uri = C2615c4.f14080a;
        synchronized (C2615c4.class) {
            try {
                if (C2615c4.f14084e == null) {
                    C2615c4.f14083d.set(false);
                    C2615c4.f14084e = new HashMap(16, 1.0f);
                    C2615c4.f14089j = new Object();
                    contentResolver.registerContentObserver(C2615c4.f14080a, true, new C2587a4());
                } else if (C2615c4.f14083d.getAndSet(false)) {
                    C2615c4.f14084e.clear();
                    C2615c4.f14085f.clear();
                    C2615c4.f14086g.clear();
                    C2615c4.f14087h.clear();
                    C2615c4.f14088i.clear();
                    C2615c4.f14089j = new Object();
                }
                Object obj = C2615c4.f14089j;
                String str2 = null;
                if (C2615c4.f14084e.containsKey(str)) {
                    String str3 = (String) C2615c4.f14084e.get(str);
                    if (str3 != null) {
                        str2 = str3;
                    }
                    return str2;
                }
                int length = C2615c4.f14090k.length;
                Cursor cursorQuery = contentResolver.query(C2615c4.f14080a, null, null, new String[]{str}, null);
                if (cursorQuery == null) {
                    return null;
                }
                try {
                    if (!cursorQuery.moveToFirst()) {
                        synchronized (C2615c4.class) {
                            if (obj == C2615c4.f14089j) {
                                C2615c4.f14084e.put(str, null);
                            }
                        }
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(1);
                    cursorQuery.close();
                    if (string != null && string.equals(null)) {
                        string = null;
                    }
                    synchronized (C2615c4.class) {
                        if (obj == C2615c4.f14089j) {
                            C2615c4.f14084e.put(str, string);
                        }
                    }
                    if (string != null) {
                        return string;
                    }
                    return null;
                } catch (Throwable th2) {
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
