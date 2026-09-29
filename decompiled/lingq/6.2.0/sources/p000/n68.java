package p000;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.CourseReportWorker;
import com.lingq.core.data.workers.LessonReportWorker;
import com.lingq.core.network.api.requests.RequestReport;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class n68 implements m68 {

    /* JADX INFO: renamed from: a */
    public final w68 f52413a;

    /* JADX INFO: renamed from: b */
    public final C0773b f52414b;

    public n68(w68 w68Var, C0773b c0773b) {
        w68Var.getClass();
        c0773b.getClass();
        this.f52413a = w68Var;
        this.f52414b = c0773b;
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: V */
    public final Object mo8941V(String str, int i, String str2, String str3, Continuation continuation) {
        RequestReport requestReport = new RequestReport();
        requestReport.m8274b(str2);
        requestReport.m8273a(str3);
        Object objM23778b = this.f52413a.m23778b(str, new Integer(i), requestReport, continuation);
        return objM23778b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23778b : xfa.f68157a;
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: f0 */
    public final void mo8951f0(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LessonReportWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i)), new Pair("scope", str2), new Pair("reason", str3)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f52414b.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: m */
    public final Object mo8953m(String str, int i, String str2, String str3, Continuation continuation) {
        RequestReport requestReport = new RequestReport();
        requestReport.m8274b(str2);
        requestReport.m8273a(str3);
        Object objM23777a = this.f52413a.m23777a(str, new Integer(i), requestReport, continuation);
        return objM23777a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23777a : xfa.f68157a;
    }

    @Override // p000.m68
    /* JADX INFO: renamed from: p */
    public final void mo8954p(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(CourseReportWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("coursePk", Integer.valueOf(i)), new Pair("scope", str2), new Pair("reason", str3)};
        hi8 hi8Var = new hi8(10);
        for (int i2 = 0; i2 < 4; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f52414b.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }
}
