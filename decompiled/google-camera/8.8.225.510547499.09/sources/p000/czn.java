package p000;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class czn implements ciw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f10119a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f10120b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f10121c;

    public /* synthetic */ czn(csn csnVar, oju ojuVar, int i) {
        this.f10121c = i;
        this.f10119a = csnVar;
        this.f10120b = ojuVar;
    }

    public /* synthetic */ czn(String str, Runnable runnable, int i) {
        this.f10121c = i;
        this.f10120b = str;
        this.f10119a = runnable;
    }

    public /* synthetic */ czn(jvb jvbVar, oju ojuVar, int i) {
        this.f10121c = i;
        this.f10119a = jvbVar;
        this.f10120b = ojuVar;
    }

    @Override // p000.ciw
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String mo3539c() {
        switch (this.f10121c) {
            case 0:
                break;
            case 1:
                break;
        }
        return dez.m6039i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [hnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // p000.ciw
    /* JADX INFO: renamed from: bd */
    public final nps mo3538bd() {
        switch (this.f10121c) {
            case 0:
                ((jvb) this.f10119a).m13537d(new cft(((C1058va) this.f10120b.get()).m19464C(), 16, null, null, null));
                break;
            case 1:
                String strConcat = "task:".concat((String) this.f10120b);
                ?? r1 = this.f10119a;
                Trace.beginSection(strConcat);
                r1.run();
                Trace.endSection();
                break;
            default:
                Object obj = this.f10119a;
                ?? r3 = this.f10120b;
                if (((csn) obj).f9330B) {
                    dfn dfnVar = (dfn) r3.get();
                    if (!((AtomicBoolean) dfnVar.f10790c).getAndSet(true)) {
                        ?? r2 = dfnVar.f10793f;
                        hny hnyVarM10529a = hnz.m10529a();
                        hnyVarM10529a.m10524c(dfnVar.f10788a);
                        hnyVarM10529a.m10525d("CamcorderTS");
                        hnyVarM10529a.m10526e(new cui(dfnVar, 10, null));
                        hnyVarM10529a.m10527f(new cui(dfnVar, 11, null));
                        hnyVarM10529a.m10528g((hnv) dfnVar.f10789b);
                        r2.mo10519f(hnyVarM10529a.m10522a());
                    }
                }
                break;
        }
        return kxk.m14965K(true);
    }
}
