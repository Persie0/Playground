package androidx.fragment.app;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.fragment.app.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0944c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f6268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SpecialEffectsController.Operation f6269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0942b f6270c;

    public RunnableC0944c(C0942b c0942b, ArrayList arrayList, SpecialEffectsController.Operation operation) {
        this.f6270c = c0942b;
        this.f6268a = arrayList;
        this.f6269b = operation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.f6268a;
        SpecialEffectsController.Operation operation = this.f6269b;
        if (list.contains(operation)) {
            list.remove(operation);
            this.f6270c.getClass();
            operation.f6235a.applyState(operation.f6237c.f6094c0);
        }
    }
}
