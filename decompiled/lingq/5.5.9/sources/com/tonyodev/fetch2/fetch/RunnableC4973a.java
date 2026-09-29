package com.tonyodev.fetch2.fetch;

import com.tonyodev.fetch2.Download;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p122fl.InterfaceC5585h;
import tl.C9325m;

/* JADX INFO: renamed from: com.tonyodev.fetch2.fetch.a */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC4973a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1 f32506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f32507b;

    public RunnableC4973a(FetchImpl$enqueueRequest$$inlined$synchronized$lambda$1 fetchImpl$enqueueRequest$$inlined$synchronized$lambda$1, List list) {
        this.f32506a = fetchImpl$enqueueRequest$$inlined$synchronized$lambda$1;
        this.f32507b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5585h interfaceC5585h = this.f32506a.f32432d;
        if (interfaceC5585h != null) {
            List<Pair> list = this.f32507b;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (Pair pair : list) {
                arrayList.add(new Pair(((Download) pair.f38012a).mo10590p(), pair.f38013b));
            }
            interfaceC5585h.mo520d(arrayList);
        }
    }
}
