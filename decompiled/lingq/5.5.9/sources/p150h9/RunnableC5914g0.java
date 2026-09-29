package p150h9;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import java.util.concurrent.CopyOnWriteArraySet;
import p479xa.C10144m;

/* JADX INFO: renamed from: h9.g0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5914g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35297a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f35298b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35299c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35300d;

    public /* synthetic */ RunnableC5914g0(C2469s.a aVar, Pair pair, int i10) {
        this.f35299c = aVar;
        this.f35300d = pair;
        this.f35298b = i10;
    }

    public /* synthetic */ RunnableC5914g0(CopyOnWriteArraySet copyOnWriteArraySet, int i10, C10144m.a aVar) {
        this.f35299c = copyOnWriteArraySet;
        this.f35298b = i10;
        this.f35300d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35297a;
        int i11 = this.f35298b;
        Object obj = this.f35300d;
        Object obj2 = this.f35299c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Pair pair = (Pair) obj;
                ((C2469s.a) obj2).f12999b.f12993h.mo6963o0(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, i11);
                break;
            default:
                C10144m.a aVar = (C10144m.a) obj;
                while (true) {
                    for (C10144m.c cVar : (CopyOnWriteArraySet) obj2) {
                        if (!cVar.f51396d) {
                            if (i11 != -1) {
                                cVar.f51394b.m19073a(i11);
                            }
                            cVar.f51395c = true;
                            aVar.mo780n(cVar.f51393a);
                        }
                    }
                    break;
                }
                break;
        }
    }
}
