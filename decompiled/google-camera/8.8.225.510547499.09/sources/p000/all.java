package p000;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleAttacher;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class all {

    /* JADX INFO: renamed from: a */
    public static final aly f643a = new alk();

    /* JADX INFO: renamed from: b */
    public static final aly f644b = new alk();

    /* JADX INFO: renamed from: c */
    public static final aly f645c = new alk();

    /* JADX INFO: renamed from: a */
    public static final alj m911a(alz alzVar) {
        aqn aqnVar = (aqn) alzVar.mo925a(f643a);
        if (aqnVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        alw alwVar = (alw) alzVar.mo925a(f644b);
        if (alwVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) alzVar.mo925a(f645c);
        String str = (String) alzVar.mo925a(alu.f668d);
        if (str == null) {
            throw new IllegalArgumentException(pIeXJQLZLfgIN.hSaSUPPQFZKum);
        }
        aql aqlVarM1861d = aqnVar.getSavedStateRegistry().m1861d();
        alm almVar = aqlVarM1861d instanceof alm ? (alm) aqlVarM1861d : null;
        if (almVar == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        aln alnVarM912b = m912b(alwVar);
        alj aljVar = (alj) alnVarM912b.f650a.get(str);
        if (aljVar != null) {
            return aljVar;
        }
        Class[] clsArr = alj.f635a;
        almVar.m915b();
        Bundle bundle2 = almVar.f646a;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = almVar.f646a;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = almVar.f646a;
        if (bundle5 != null && bundle5.isEmpty()) {
            almVar.f646a = null;
        }
        alj aljVarM174b = aby.m174b(bundle3, bundle);
        alnVarM912b.f650a.put(str, aljVarM174b);
        return aljVarM174b;
    }

    /* JADX INFO: renamed from: b */
    public static final aln m912b(alw alwVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new bck(((ony) ooj.m18762a(aln.class)).f46343d, axf.f2638b));
        bck[] bckVarArr = (bck[]) arrayList.toArray(new bck[0]);
        ama amaVar = new ama((bck[]) Arrays.copyOf(bckVarArr, bckVarArr.length), null, null);
        bkn viewModelStore$ar$class_merging$ar$class_merging = alwVar.getViewModelStore$ar$class_merging$ar$class_merging();
        viewModelStore$ar$class_merging$ar$class_merging.getClass();
        alz defaultViewModelCreationExtras = alwVar instanceof akn ? ((akn) alwVar).getDefaultViewModelCreationExtras() : alx.f669a;
        defaultViewModelCreationExtras.getClass();
        return (aln) ach.m191d("androidx.lifecycle.internal.SavedStateHandlesVM", aln.class, viewModelStore$ar$class_merging$ar$class_merging, amaVar, defaultViewModelCreationExtras);
    }

    /* JADX INFO: renamed from: c */
    public static final void m913c(aqn aqnVar) {
        aqnVar.getClass();
        akr akrVar = aqnVar.getLifecycle().f598a;
        if (akrVar != akr.f593b && akrVar != akr.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (aqnVar.getSavedStateRegistry().m1861d() == null) {
            alm almVar = new alm(aqnVar.getSavedStateRegistry(), (alw) aqnVar);
            aqnVar.getSavedStateRegistry().m1859b("androidx.lifecycle.internal.SavedStateHandlesProvider", almVar);
            aqnVar.getLifecycle().m879a(new SavedStateHandleAttacher(almVar));
        }
    }
}
