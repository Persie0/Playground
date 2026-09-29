package th;

import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import com.lingq.shared.network.requests.RequestReport;
import com.lingq.shared.network.workers.CourseReportWorker;
import com.lingq.shared.network.workers.LessonReportWorker;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p460wh.InterfaceC9946n;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: th.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9285b implements InterfaceC9284a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9946n f47982a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1317j f47983b;

    public C9285b(InterfaceC9946n interfaceC9946n, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(interfaceC9946n, "reportService");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f47982a = interfaceC9946n;
        this.f47983b = abstractC1317j;
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: W */
    public final Object mo9830W(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        RequestReport requestReport = new RequestReport();
        requestReport.f18185a = str2;
        requestReport.f18186b = str3;
        Object objM18521a = this.f47982a.m18521a(str, new Integer(i10), requestReport, interfaceC9968c);
        return objM18521a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18521a : C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: a0 */
    public final void mo9831a0(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LessonReportWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("lessonId", Integer.valueOf(i10)), new Pair("scope", str2), new Pair("reason", str3)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 4; i11++) {
            Pair pair = pairArr[i11];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f47983b.m4877b(aVar.m4879a());
    }

    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: f */
    public final Object mo9832f(String str, int i10, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        RequestReport requestReport = new RequestReport();
        requestReport.f18185a = str2;
        requestReport.f18186b = str3;
        Object objM18522b = this.f47982a.m18522b(str, new Integer(i10), requestReport, interfaceC9968c);
        return objM18522b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18522b : C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // th.InterfaceC9284a
    /* JADX INFO: renamed from: n */
    public final void mo9834n(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "scope");
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(CourseReportWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("coursePk", Integer.valueOf(i10)), new Pair("scope", str2), new Pair("reason", str3)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 4; i11++) {
            Pair pair = pairArr[i11];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f47983b.m4877b(aVar.m4879a());
    }
}
