package p000;

import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.google.common.util.concurrent.C1117g;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wjd implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66952a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ubd f66953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ArrayList f66954c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f66955d;

    public /* synthetic */ wjd(ubd ubdVar, int i, ArrayList arrayList) {
        this.f66953b = ubdVar;
        this.f66955d = i;
        this.f66954c = arrayList;
    }

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) {
        int i = this.f66952a;
        int i2 = this.f66955d;
        ArrayList arrayList = this.f66954c;
        ubd ubdVar = this.f66953b;
        switch (i) {
            case 0:
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Boolean) AbstractC1118h.m6398b((Future) arrayList.get(i3))).booleanValue()) {
                        ((List) ubdVar.f63687b).get(i3).getClass();
                        ho2.m13383c();
                        return null;
                    }
                }
                return new C1117g(true, ImmutableList.m6286o(arrayList2)).m6395a(new zl0(), AbstractC1120j.m6404a());
            default:
                return new C1117g(false, ImmutableList.m6286o(arrayList)).m6396b(jmd.m14556a(new gld(ubdVar, (bhb) obj, i2, arrayList)), (Executor) ubdVar.f63688c);
        }
    }

    public /* synthetic */ wjd(ubd ubdVar, ArrayList arrayList, int i) {
        this.f66953b = ubdVar;
        this.f66954c = arrayList;
        this.f66955d = i;
    }
}
