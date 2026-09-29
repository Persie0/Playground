package p290o6;

import android.content.Context;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.C2181a;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import dm.C5207g;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import me.C7546d;
import me.C7547e;
import me.C7550h;

/* JADX INFO: renamed from: o6.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC7964k implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43357b;

    public /* synthetic */ CallableC7964k(int i10, Object obj) {
        this.f43356a = i10;
        this.f43357b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        boolean z10;
        String reference;
        BufferedWriter bufferedWriter;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f43356a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Context context = (Context) this.f43357b;
                C5207g.m11111f(context, "$context");
                try {
                    C7977q0.m15827e(context, null).edit().putBoolean("firstTimeRequest", C7966l.f43364c).commit();
                    break;
                } catch (Throwable th2) {
                    C2181a.m6457j("CRITICAL: Failed to persist shared preferences!", th2);
                }
                return null;
            default:
                C7550h c7550h = (C7550h) this.f43357b;
                synchronized (c7550h.f41653f) {
                    z10 = false;
                    if (c7550h.f41653f.isMarked()) {
                        reference = c7550h.f41653f.getReference();
                        c7550h.f41653f.set(reference, false);
                        z10 = true;
                    } else {
                        reference = null;
                    }
                    break;
                }
                if (z10) {
                    File fileM16819b = c7550h.f41648a.f41628a.m16819b(c7550h.f41650c, "user-data");
                    try {
                        String string = new C7546d(reference).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM16819b), C7547e.f41627b));
                        try {
                            bufferedWriter.write(string);
                            bufferedWriter.flush();
                        } catch (Exception e10) {
                            e = e10;
                            try {
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter2 = bufferedWriter;
                                bufferedWriter = bufferedWriter2;
                                CommonUtils.m9149a(bufferedWriter, "Failed to close user metadata file.");
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            CommonUtils.m9149a(bufferedWriter, "Failed to close user metadata file.");
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        bufferedWriter = null;
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedWriter = bufferedWriter2;
                        CommonUtils.m9149a(bufferedWriter, "Failed to close user metadata file.");
                        throw th;
                    }
                    CommonUtils.m9149a(bufferedWriter, "Failed to close user metadata file.");
                    break;
                }
                return null;
        }
    }
}
