package com.lingq.feature.dictionary;

import android.view.View;
import android.widget.AdapterView;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.DictionaryLocale;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C3244l;
import p000.bh4;
import p000.fa4;
import p000.lda;
import p000.te2;
import p000.vj6;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C2063g implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ te2 f25826a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f25827b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2064h f25828c;

    public C2063g(te2 te2Var, List list, C2064h c2064h) {
        this.f25826a = te2Var;
        this.f25827b = list;
        this.f25828c = c2064h;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Object next;
        if (adapterView != null) {
            adapterView.getChildAt(0);
        }
        Iterator it = this.f25826a.f62188a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fa4.m11650l(((DictionaryLocale) next).f19022b, this.f25827b.get(i)));
        DictionaryLocale dictionaryLocale = (DictionaryLocale) next;
        if (dictionaryLocale != null) {
            vj6 vj6Var = this.f25828c.f25830f;
            String str = dictionaryLocale.f19021a;
            vj6Var.getClass();
            str.getClass();
            DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) vj6Var.f65506b;
            bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
            C2057b c2057bM8963B0 = dictionariesManageFragment.m8963B0();
            C3244l c3244l = c2057bM8963B0.f25796f;
            if (str.equals(c3244l.getValue())) {
                return;
            }
            c3244l.m15572j(null, str);
            AbstractC1263a.m7047b(lda.m16103C(c2057bM8963B0), c2057bM8963B0.f25794d, "observableAvailableDictionaries", new DictManageViewModel$fetchAvailableDictionaries$1(c2057bM8963B0, null));
            wfb.m23926u(lda.m16103C(c2057bM8963B0), null, null, new DictManageViewModel$updateActiveDictionaries$1(c2057bM8963B0, null), 3);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        adapterView.getClass();
    }
}
