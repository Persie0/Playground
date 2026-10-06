package p000;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ghf implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f24736a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f24737b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f24738c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f24739d;

    public /* synthetic */ ghf(azb azbVar, ArrayList arrayList, String str, int i) {
        this.f24739d = i;
        this.f24736a = azbVar;
        this.f24738c = arrayList;
        this.f24737b = str;
    }

    public /* synthetic */ ghf(ghg ghgVar, kfo kfoVar, kge kgeVar, int i) {
        this.f24739d = i;
        this.f24736a = ghgVar;
        this.f24737b = kfoVar;
        this.f24738c = kgeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kfo] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f24739d) {
            case 0:
                return ((ghg) this.f24736a).m9251b(this.f24737b, (kge) this.f24738c);
            default:
                Object obj = this.f24736a;
                Object obj2 = this.f24738c;
                azb azbVar = (azb) obj;
                String str = (String) this.f24737b;
                ((ArrayList) obj2).addAll(azbVar.f2747a.mo1701C().mo2245a(str));
                return azbVar.f2747a.mo1700B().mo2232a(str);
        }
    }
}
