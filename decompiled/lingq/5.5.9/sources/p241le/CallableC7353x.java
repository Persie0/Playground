package p241le;

import android.util.Log;
import androidx.appcompat.widget.C0322j;
import com.google.firebase.crashlytics.internal.common.C3213b;
import java.io.File;
import java.util.concurrent.Callable;
import p339qe.C8597b;

/* JADX INFO: renamed from: le.x */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7353x implements Callable<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7352w f41109a;

    public CallableC7353x(C7352w c7352w) {
        this.f41109a = c7352w;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        C3213b c3213b = this.f41109a.f41100g;
        C0322j c0322j = c3213b.f16207c;
        C8597b c8597b = (C8597b) c0322j.f1239c;
        String str = (String) c0322j.f1238b;
        c8597b.getClass();
        if (!new File(c8597b.f46076b, str).exists()) {
            String strM9166e = c3213b.m9166e();
            boolean z10 = strM9166e != null && c3213b.f16214j.mo12947c(strM9166e);
            return Boolean.valueOf(z10);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
        }
        C8597b c8597b2 = (C8597b) c0322j.f1239c;
        String str2 = (String) c0322j.f1238b;
        c8597b2.getClass();
        new File(c8597b2.f46076b, str2).delete();
        return Boolean.valueOf(z10);
    }
}
