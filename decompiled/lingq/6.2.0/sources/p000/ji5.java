package p000;

import android.content.Context;
import android.os.Bundle;
import kotlin.coroutines.Continuation;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ji5 implements r29 {

    /* JADX INFO: renamed from: a */
    public final Bundle f45579a;

    public ji5(Context context) {
        context.getClass();
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f45579a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: a */
    public final Boolean mo6761a() {
        Bundle bundle = this.f45579a;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: b */
    public final cn2 mo6762b() {
        Bundle bundle = this.f45579a;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new cn2(AbstractC3352my.m17117e0(bundle.getInt("firebase_sessions_sessions_restart_timeout"), DurationUnit.SECONDS));
        }
        return null;
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: c */
    public final Double mo6763c() {
        Bundle bundle = this.f45579a;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: d */
    public final Object mo6764d(Continuation continuation) {
        return xfa.f68157a;
    }
}
