package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ako implements aqk {
    ako() {
    }

    @Override // p000.aqk
    /* JADX INFO: renamed from: a */
    public final void mo869a(aqn aqnVar) {
        if (!(aqnVar instanceof alw)) {
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
        bkn viewModelStore$ar$class_merging$ar$class_merging = ((alw) aqnVar).getViewModelStore$ar$class_merging$ar$class_merging();
        aqm savedStateRegistry = aqnVar.getSavedStateRegistry();
        Iterator it = viewModelStore$ar$class_merging$ar$class_merging.m2590k().iterator();
        while (it.hasNext()) {
            abv.m166d(viewModelStore$ar$class_merging$ar$class_merging.m2589j((String) it.next()), savedStateRegistry, aqnVar.getLifecycle());
        }
        if (viewModelStore$ar$class_merging$ar$class_merging.m2590k().isEmpty()) {
            return;
        }
        savedStateRegistry.m1860c(ako.class);
    }
}
