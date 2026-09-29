package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import com.google.firebase.sessions.C1166b;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.Regex;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.C3248a;
import p000.AbstractC3352my;
import p000.C3384nt;
import p000.C3386nv;
import p000.c74;
import p000.c76;
import p000.cn2;
import p000.iy5;
import p000.q58;
import p000.r0a;
import p000.r29;
import p000.wfb;
import p000.x43;
import p000.xfa;

/* JADX INFO: renamed from: com.google.firebase.sessions.settings.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1169a implements r29 {

    /* JADX INFO: renamed from: g */
    public static final int f13893g;

    /* JADX INFO: renamed from: h */
    public static final Regex f13894h;

    /* JADX INFO: renamed from: a */
    public final r0a f13895a;

    /* JADX INFO: renamed from: b */
    public final x43 f13896b;

    /* JADX INFO: renamed from: c */
    public final C3384nt f13897c;

    /* JADX INFO: renamed from: d */
    public final q58 f13898d;

    /* JADX INFO: renamed from: e */
    public final C1171c f13899e;

    /* JADX INFO: renamed from: f */
    public final C3248a f13900f;

    static {
        iy5 iy5Var = cn2.f10315b;
        f13893g = (int) cn2.m4890h(AbstractC3352my.m17117e0(24, DurationUnit.HOURS), DurationUnit.SECONDS);
        f13894h = new Regex("com/google/firebase/sessions//");
    }

    public C1169a(r0a r0aVar, x43 x43Var, C3384nt c3384nt, q58 q58Var, C1171c c1171c) {
        r0aVar.getClass();
        x43Var.getClass();
        c3384nt.getClass();
        q58Var.getClass();
        c1171c.getClass();
        this.f13895a = r0aVar;
        this.f13896b = x43Var;
        this.f13897c = c3384nt;
        this.f13898d = q58Var;
        this.f13899e = c1171c;
        this.f13900f = new C3248a();
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: a */
    public final Boolean mo6761a() {
        return this.f13899e.m6767a().f60044a;
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: b */
    public final cn2 mo6762b() {
        Integer num = this.f13899e.m6767a().f60046c;
        if (num == null) {
            return null;
        }
        iy5 iy5Var = cn2.f10315b;
        return new cn2(AbstractC3352my.m17117e0(num.intValue(), DurationUnit.SECONDS));
    }

    @Override // p000.r29
    /* JADX INFO: renamed from: c */
    public final Double mo6763c() {
        return this.f13899e.m6767a().f60045b;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00a9 A[Catch: all -> 0x004e, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2 A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004e, blocks: (B:21:0x004a, B:45:0x009f, B:47:0x00a9, B:50:0x00b2), top: B:62:0x004a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x00b2, please report this as an issue */
    @Override // p000.r29
    /* JADX INFO: renamed from: d */
    public final Object mo6764d(Continuation continuation) throws Throwable {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        c76 c76Var;
        c76 c76Var2;
        c76 c76Var3;
        String str;
        Object objM23905G;
        c76 c76Var4;
        if (continuation instanceof RemoteSettings$updateSettings$1) {
            remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
            int i = remoteSettings$updateSettings$1.f13872d;
            if ((i & Integer.MIN_VALUE) != 0) {
                remoteSettings$updateSettings$1.f13872d = i - Integer.MIN_VALUE;
            } else {
                remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) continuation);
            }
        } else {
            remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) continuation);
        }
        Object obj = remoteSettings$updateSettings$1.f13870b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = remoteSettings$updateSettings$1.f13872d;
        C1171c c1171c = this.f13899e;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                C3248a c3248a = this.f13900f;
                if (!c3248a.m15596i() && !c1171c.m6768b()) {
                    return xfaVar;
                }
                remoteSettings$updateSettings$1.f13869a = c3248a;
                remoteSettings$updateSettings$1.f13872d = 1;
                Object objMo4388c = c3248a.mo4388c(remoteSettings$updateSettings$1);
                c76Var = c3248a;
                if (objMo4388c != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    c76 c76Var5 = remoteSettings$updateSettings$1.f13869a;
                    try {
                        AbstractC3193b.m15359b(obj);
                        c76Var3 = c76Var5;
                        str = ((c74) obj).f9659a;
                        if (str.equals("")) {
                            Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                            c76Var3.mo4387b(null);
                            return xfaVar;
                        }
                        Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                        String str2 = Build.MANUFACTURER + Build.MODEL;
                        Regex regex = f13894h;
                        Pair pair2 = new Pair("X-Crashlytics-Device-Model", regex.m15428g(str2, ""));
                        String str3 = Build.VERSION.INCREMENTAL;
                        str3.getClass();
                        Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", regex.m15428g(str3, ""));
                        String str4 = Build.VERSION.RELEASE;
                        str4.getClass();
                        Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", regex.m15428g(str4, ""));
                        this.f13897c.getClass();
                        Map mapM15365R = AbstractC3194a.m15365R(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "3.0.6"));
                        Log.d("FirebaseSessions", "Fetching settings from server.");
                        q58 q58Var = this.f13898d;
                        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(this, null);
                        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                        remoteSettings$updateSettings$1.f13869a = c76Var3;
                        remoteSettings$updateSettings$1.f13872d = 3;
                        objM23905G = wfb.m23905G(new RemoteSettingsFetcher$doConfigFetch$2(q58Var, mapM15365R, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, null), q58Var.f57297b, remoteSettings$updateSettings$1);
                        if (objM23905G != coroutineSingletons) {
                            objM23905G = xfaVar;
                        }
                        if (objM23905G != coroutineSingletons) {
                            c76Var4 = c76Var3;
                            c76Var4.mo4387b(null);
                            return xfaVar;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th) {
                        th = th;
                        c76Var2 = c76Var5;
                    }
                } else {
                    if (i2 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c76Var2 = remoteSettings$updateSettings$1.f13869a;
                    try {
                        AbstractC3193b.m15359b(obj);
                        c76Var4 = c76Var2;
                        c76Var4.mo4387b(null);
                        return xfaVar;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                c76Var2.mo4387b(null);
                throw th;
            }
            c76 c76Var6 = remoteSettings$updateSettings$1.f13869a;
            AbstractC3193b.m15359b(obj);
            c76Var = c76Var6;
            if (!c1171c.m6768b()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                c76Var.mo4387b(null);
                return xfaVar;
            }
            C1166b c1166b = c74.f9658c;
            x43 x43Var = this.f13896b;
            remoteSettings$updateSettings$1.f13869a = c76Var;
            remoteSettings$updateSettings$1.f13872d = 2;
            Object objM6754a = c1166b.m6754a(x43Var, remoteSettings$updateSettings$1);
            if (objM6754a != coroutineSingletons) {
                c76Var3 = c76Var;
                obj = objM6754a;
                str = ((c74) obj).f9659a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    c76Var3.mo4387b(null);
                    return xfaVar;
                }
                Pair pair5 = new Pair("X-Crashlytics-Installation-ID", str);
                String str5 = Build.MANUFACTURER + Build.MODEL;
                Regex regex2 = f13894h;
                Pair pair6 = new Pair("X-Crashlytics-Device-Model", regex2.m15428g(str5, ""));
                String str6 = Build.VERSION.INCREMENTAL;
                str6.getClass();
                Pair pair7 = new Pair("X-Crashlytics-OS-Build-Version", regex2.m15428g(str6, ""));
                String str7 = Build.VERSION.RELEASE;
                str7.getClass();
                Pair pair8 = new Pair("X-Crashlytics-OS-Display-Version", regex2.m15428g(str7, ""));
                this.f13897c.getClass();
                Map mapM15365R2 = AbstractC3194a.m15365R(pair5, pair6, pair7, pair8, new Pair("X-Crashlytics-API-Client-Version", "3.0.6"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                q58 q58Var2 = this.f13898d;
                RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$3 = new RemoteSettings$updateSettings$2$1(this, null);
                RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$4 = new RemoteSettings$updateSettings$2$2(2, null);
                remoteSettings$updateSettings$1.f13869a = c76Var3;
                remoteSettings$updateSettings$1.f13872d = 3;
                objM23905G = wfb.m23905G(new RemoteSettingsFetcher$doConfigFetch$2(q58Var2, mapM15365R2, remoteSettings$updateSettings$2$3, remoteSettings$updateSettings$2$4, null), q58Var2.f57297b, remoteSettings$updateSettings$1);
                if (objM23905G != coroutineSingletons) {
                    objM23905G = xfaVar;
                }
                if (objM23905G != coroutineSingletons) {
                    c76Var4 = c76Var3;
                    c76Var4.mo4387b(null);
                    return xfaVar;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            th = th3;
            c76Var2 = c76Var;
        }
    }
}
