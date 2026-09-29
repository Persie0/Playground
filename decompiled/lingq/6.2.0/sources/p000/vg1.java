package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.concurrent.futures.C0464b;
import androidx.media3.common.C0713b;
import androidx.media3.common.PlaybackException;
import androidx.work.DirectExecutor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.tooltips.R$string;
import com.lingq.p020ui.AbstractC2891g;
import com.lingq.p020ui.MainActivity;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vg1 implements bm1, sg5, tr6, zt5, kk1, i33, h90, gr6, em0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65340a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f65341b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f65342c;

    public /* synthetic */ vg1(C3496qf c3496qf, Object obj, long j) {
        this.f65340a = 9;
        this.f65341b = c3496qf;
        this.f65342c = obj;
    }

    @Override // p000.h90
    /* JADX INFO: renamed from: a */
    public void mo10699a(Object obj) {
        v48 v48Var = (v48) this.f65341b;
        b6a b6aVar = (b6a) this.f65342c;
        ((xfa) obj).getClass();
        TooltipStep tooltipStep = b6aVar.f8022a.f69328a;
        v48Var.getClass();
        tooltipStep.getClass();
        MainActivity mainActivity = (MainActivity) v48Var.f64845b;
        fr5 fr5Var = new fr5(mainActivity, 0);
        fr5Var.m12027j(mainActivity.getString(R$string.tooltips_warning_title));
        String strM17735j = AbstractC3393o1.m17735j(mainActivity.getString(R$string.tooltips_warning_title_desc), "\n\n", mainActivity.getString(R$string.tooltips_restart_tutorial_instructions));
        C3681vd c3681vd = fr5Var.f71376a;
        c3681vd.f65209g = strM17735j;
        fr5Var.m12023f(mainActivity.getString(R$string.welcome_skip_this_step), new o5a(v48Var, tooltipStep, 0));
        fr5Var.m12026i(mainActivity.getString(com.lingq.core.p012ui.R$string.ui_continue), null);
        String string = mainActivity.getString(com.lingq.core.p012ui.R$string.ui_quit);
        o5a o5aVar = new o5a(v48Var, tooltipStep, 1);
        c3681vd.f65214l = string;
        c3681vd.f65215m = o5aVar;
        fr5Var.m25557a();
    }

    @Override // p000.kk1
    public void accept(Object obj) {
        fm2 fm2Var = (fm2) this.f65341b;
        ((ov5) obj).mo11807c(fm2Var.f39277a, fm2Var.f39278b, (ru5) this.f65342c);
    }

    @Override // p000.i33
    /* JADX INFO: renamed from: b */
    public void mo13636b(File file) {
        w06 w06Var = (w06) this.f65341b;
        t06 t06Var = (t06) this.f65342c;
        file.getClass();
        w06Var.f66178g = t06Var;
        w06Var.f66177f = file;
        Runnable runnable = w06Var.f66179h;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // p000.em0
    /* JADX INFO: renamed from: c */
    public Object mo392c(C0464b c0464b) {
        Executor executor = (Executor) this.f65341b;
        ui3 ui3Var = (ui3) this.f65342c;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jg5 jg5Var = new jg5(atomicBoolean, 1);
        DirectExecutor directExecutor = DirectExecutor.INSTANCE;
        r78 r78Var = c0464b.f5330c;
        if (r78Var != null) {
            r78Var.mo52a(jg5Var, directExecutor);
        }
        executor.execute(new kg5(atomicBoolean, c0464b, ui3Var, 1));
        return xfa.f68157a;
    }

    @Override // p000.zt5
    /* JADX INFO: renamed from: d */
    public int mo11825d(Object obj) {
        Context context = (Context) this.f65341b;
        C0713b c0713b = (C0713b) this.f65342c;
        vt5 vt5Var = (vt5) obj;
        String str = vt5Var.f65882b;
        return ((str.equals(c0713b.f6406o) || str.equals(au5.m3052c(c0713b))) && vt5Var.m23537e(context, c0713b, false) && vt5Var.m23538f(c0713b)) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0161  */
    /* JADX WARN: Code duplicated, block: B:110:0x0164  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:126:0x00e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d6 A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #6 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d2, B:64:0x00d6, B:66:0x00d9, B:70:0x00dd, B:71:0x00de, B:65:0x00d7), top: B:132:0x001b, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00de A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #6 {all -> 0x0056, blocks: (B:11:0x003f, B:13:0x0042, B:14:0x0043, B:22:0x005f, B:62:0x00d2, B:64:0x00d6, B:66:0x00d9, B:70:0x00dd, B:71:0x00de, B:65:0x00d7), top: B:132:0x001b, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [ch1] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v39, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r13v50 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // p000.bm1
    /* JADX INFO: renamed from: e */
    public Object mo393e(Task task) throws Throwable {
        InputStream errorStream;
        ?? r10;
        ?? ValueOf;
        switch (this.f65340a) {
            case 0:
                return ((xg1) this.f65341b).m24490b(task, 0L, (HashMap) this.f65342c);
            default:
                ?? r0 = (ch1) this.f65341b;
                ?? inputStream = (Task) this.f65342c;
                gr7 gr7Var = r0.f10079p;
                boolean z = true;
                ?? r7 = 0;
                try {
                    try {
                        if (!inputStream.mo5971m()) {
                            throw new IOException(inputStream.mo5966h());
                        }
                        HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.mo5967i();
                        r0.f10069f = httpURLConnection;
                        inputStream = httpURLConnection.getInputStream();
                        try {
                            errorStream = r0.f10069f.getErrorStream();
                            try {
                                int responseCode = r0.f10069f.getResponseCode();
                                ValueOf = Integer.valueOf(responseCode);
                                if (responseCode == 200) {
                                    try {
                                        synchronized (r0) {
                                            r0.f10066c = 8;
                                        }
                                        r0.f10080q.m11150e(0, eh1.f37249f);
                                        mg1 mg1VarM4657j = r0.m4657j(r0.f10069f);
                                        r0.f10070g = mg1VarM4657j;
                                        mg1VarM4657j.m16821c();
                                    } catch (IOException e) {
                                        e = e;
                                        if (r0.f10068e) {
                                            synchronized (r0) {
                                                r0.f10066c = 8;
                                            }
                                        } else {
                                            Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                        }
                                        r0.m4651b(inputStream, errorStream);
                                        synchronized (r0) {
                                            r0.f10065b = false;
                                        }
                                        if (r0.f10068e || (ValueOf != 0 && !ch1.m4648d(ValueOf.intValue()))) {
                                            z = false;
                                        }
                                        if (z) {
                                            gr7Var.getClass();
                                            r0.m4658k(new Date(System.currentTimeMillis()));
                                        }
                                        if (!z || ValueOf.intValue() == 200) {
                                            r0.m4655h();
                                        } else {
                                            String strM4649f = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                            if (ValueOf.intValue() == 403) {
                                                strM4649f = ch1.m4649f(r0.f10069f.getErrorStream());
                                            }
                                            int iIntValue = ValueOf.intValue();
                                            FirebaseRemoteConfigException.Code code = FirebaseRemoteConfigException.Code.UNKNOWN;
                                            new FirebaseRemoteConfigServerException(iIntValue, strM4649f, 0);
                                        }
                                        r0.f10069f = null;
                                        r0.f10070g = null;
                                        return Tasks.m5975c(null);
                                    }
                                }
                                r0.m4651b(inputStream, errorStream);
                                synchronized (r0) {
                                    r0.f10065b = false;
                                }
                                z = !r0.f10068e && ch1.m4648d(responseCode);
                                if (z) {
                                    gr7Var.getClass();
                                    r0.m4658k(new Date(System.currentTimeMillis()));
                                }
                                if (z || responseCode == 200) {
                                    r0.m4655h();
                                } else {
                                    String strM4649f2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (responseCode == 403) {
                                        strM4649f2 = ch1.m4649f(r0.f10069f.getErrorStream());
                                    }
                                    FirebaseRemoteConfigException.Code code2 = FirebaseRemoteConfigException.Code.UNKNOWN;
                                    new FirebaseRemoteConfigServerException(responseCode, strM4649f2, 0);
                                    r0.m4654g();
                                }
                            } catch (IOException e2) {
                                e = e2;
                                ValueOf = 0;
                            } catch (Throwable th) {
                                th = th;
                                ValueOf = 0;
                                r7 = inputStream;
                                r10 = ValueOf;
                                r0.m4651b(r7, errorStream);
                                synchronized (r0) {
                                    r0.f10065b = false;
                                    if (r0.f10068e || (r10 != 0 && !ch1.m4648d(r10.intValue()))) {
                                        z = false;
                                    }
                                    if (z) {
                                        gr7Var.getClass();
                                        r0.m4658k(new Date(System.currentTimeMillis()));
                                    }
                                    if (!z || r10.intValue() == 200) {
                                        r0.m4655h();
                                    } else {
                                        String strM4649f3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r10);
                                        if (r10.intValue() == 403) {
                                            strM4649f3 = ch1.m4649f(r0.f10069f.getErrorStream());
                                        }
                                        int iIntValue2 = r10.intValue();
                                        FirebaseRemoteConfigException.Code code3 = FirebaseRemoteConfigException.Code.UNKNOWN;
                                        new FirebaseRemoteConfigServerException(iIntValue2, strM4649f3, 0);
                                        r0.m4654g();
                                    }
                                    throw th;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            errorStream = null;
                            inputStream = inputStream;
                            ValueOf = errorStream;
                            if (r0.f10068e) {
                                synchronized (r0) {
                                    r0.f10066c = 8;
                                }
                            } else {
                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                            }
                            r0.m4651b(inputStream, errorStream);
                            synchronized (r0) {
                                r0.f10065b = false;
                                if (r0.f10068e) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    gr7Var.getClass();
                                    r0.m4658k(new Date(System.currentTimeMillis()));
                                }
                                if (z) {
                                }
                                r0.m4655h();
                                r0.f10069f = null;
                                r0.f10070g = null;
                                return Tasks.m5975c(null);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            errorStream = null;
                            ValueOf = 0;
                        }
                        r0.f10069f = null;
                        r0.f10070g = null;
                        return Tasks.m5975c(null);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    inputStream = 0;
                    errorStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    errorStream = null;
                    r10 = 0;
                    r0.m4651b(r7, errorStream);
                    synchronized (r0) {
                        r0.f10065b = false;
                        if (r0.f10068e) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            gr7Var.getClass();
                            r0.m4658k(new Date(System.currentTimeMillis()));
                        }
                        if (z) {
                            r0.m4655h();
                        } else {
                            r0.m4655h();
                        }
                        throw th;
                    }
                }
                break;
        }
    }

    @Override // p000.tr6
    /* JADX INFO: renamed from: f */
    public void mo4558f(Task task) {
        String strM22989l;
        int i = this.f65340a;
        Object obj = this.f65342c;
        Object obj2 = this.f65341b;
        switch (i) {
            case 10:
                ((FirebaseMessagingService) obj2).m6713a((Intent) obj);
                break;
            default:
                kd8 kd8Var = (kd8) obj2;
                Activity activity = (Activity) obj;
                task.getClass();
                if (!task.mo5971m()) {
                    Exception excMo5966h = task.mo5966h();
                    ReviewException reviewException = excMo5966h instanceof ReviewException ? (ReviewException) excMo5966h : null;
                    Integer numValueOf = reviewException != null ? Integer.valueOf(reviewException.f11645a.f11662a) : null;
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        if (iIntValue == -100) {
                            strM22989l = "INTERNAL_ERROR";
                        } else if (iIntValue == -2) {
                            strM22989l = "INVALID_REQUEST";
                        } else if (iIntValue != -1) {
                            strM22989l = iIntValue != 0 ? ux5.m22989l("UNKNOWN(", iIntValue, ")") : "NO_ERROR";
                        } else {
                            strM22989l = "PLAY_STORE_NOT_FOUND";
                        }
                    } else {
                        strM22989l = "n/a";
                    }
                    AbstractC2891g.m9818b("requestReviewFlow FAILED (errorCode=" + strM22989l + ") -> opening Play Store listing", excMo5966h);
                    AbstractC2891g.m9819c(activity);
                } else {
                    AbstractC2891g.m9818b("requestReviewFlow SUCCESS -> launching in-app review flow", null);
                    tld tldVarMo6255b = kd8Var.mo6255b(activity, (ReviewInfo) task.mo5967i());
                    tldVarMo6255b.m22200o(new fg2(13));
                    tldVarMo6255b.mo5961c(new dw6(activity, 4));
                }
                break;
        }
    }

    @Override // p000.sg5
    public void invoke(Object obj) {
        int i = this.f65340a;
        Object obj2 = this.f65342c;
        C3496qf c3496qf = (C3496qf) this.f65341b;
        switch (i) {
            case 2:
                ((InterfaceC3534rf) obj).mo20622g(c3496qf, (ey5) obj2);
                break;
            case 3:
                ((InterfaceC3534rf) obj).mo20620e(c3496qf, (n97) obj2);
                break;
            case 4:
                ((InterfaceC3534rf) obj).mo20604C(c3496qf, (PlaybackException) obj2);
                break;
            case 5:
                ((InterfaceC3534rf) obj).mo20614M(c3496qf, (a9a) obj2);
                break;
            case 6:
                ((InterfaceC3534rf) obj).mo20609H(c3496qf, (ru5) obj2);
                break;
            case 7:
                ((InterfaceC3534rf) obj).mo20607F(c3496qf, (l32) obj2);
                break;
            case 8:
                lsa lsaVar = (lsa) obj2;
                ((InterfaceC3534rf) obj).mo20632q(c3496qf, lsaVar);
                int i2 = lsaVar.f50085a;
                break;
            default:
                ((InterfaceC3534rf) obj).mo20625j(c3496qf, obj2);
                break;
        }
    }

    @Override // p000.gr6
    /* JADX INFO: renamed from: s */
    public f6b mo1889s(View view, f6b f6bVar) {
        iz4 iz4Var = (iz4) this.f65341b;
        mua muaVar = (mua) this.f65342c;
        view.getClass();
        iz4Var.invoke(view, f6bVar, muaVar);
        return f6bVar;
    }

    public /* synthetic */ vg1(int i, Object obj, Object obj2) {
        this.f65340a = i;
        this.f65341b = obj;
        this.f65342c = obj2;
    }
}
