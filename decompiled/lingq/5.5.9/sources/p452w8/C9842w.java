package p452w8;

import android.content.Context;
import androidx.activity.RunnableC0190i;
import java.util.Collections;
import java.util.Set;
import p030b9.InterfaceC1345d;
import p045c9.C1753g;
import p045c9.C1755i;
import p113f9.InterfaceC5478a;
import p395t8.C9220b;
import p410u8.C9476a;

/* JADX INFO: renamed from: w8.w */
/* JADX INFO: loaded from: classes.dex */
public final class C9842w implements InterfaceC9841v {

    /* JADX INFO: renamed from: e */
    public static volatile C9830k f50052e;

    /* JADX INFO: renamed from: a */
    public final InterfaceC5478a f50053a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5478a f50054b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1345d f50055c;

    /* JADX INFO: renamed from: d */
    public final C1753g f50056d;

    public C9842w(InterfaceC5478a interfaceC5478a, InterfaceC5478a interfaceC5478a2, InterfaceC1345d interfaceC1345d, C1753g c1753g, C1755i c1755i) {
        this.f50053a = interfaceC5478a;
        this.f50054b = interfaceC5478a2;
        this.f50055c = interfaceC1345d;
        this.f50056d = c1753g;
        c1755i.getClass();
        c1755i.f9648a.execute(new RunnableC0190i(10, c1755i));
    }

    /* JADX INFO: renamed from: a */
    public static C9842w m18333a() {
        C9830k c9830k = f50052e;
        if (c9830k != null) {
            return c9830k.f50037g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static void m18334b(Context context) {
        if (f50052e == null) {
            synchronized (C9842w.class) {
                if (f50052e == null) {
                    context.getClass();
                    f50052e = new C9830k(context);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final C9839t m18335c(C9476a c9476a) {
        Set setSingleton;
        if (c9476a instanceof InterfaceC9831l) {
            c9476a.getClass();
            setSingleton = Collections.unmodifiableSet(C9476a.f48586d);
        } else {
            setSingleton = Collections.singleton(new C9220b("proto"));
        }
        C9829j.a aVarM18330a = AbstractC9838s.m18330a();
        c9476a.getClass();
        aVarM18330a.m18323b("cct");
        aVarM18330a.f50029b = c9476a.m17898b();
        return new C9839t(setSingleton, aVarM18330a.m18322a(), this);
    }
}
