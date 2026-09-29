package com.lingq.feature.dictionary;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.feature.dictionary.C2064h;
import com.lingq.feature.dictionary.DictionariesManageFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3663uw;
import p000.abd;
import p000.bh4;
import p000.ef5;
import p000.fa4;
import p000.ff5;
import p000.gm5;
import p000.hi8;
import p000.if5;
import p000.lda;
import p000.lfa;
import p000.ne2;
import p000.o38;
import p000.oe2;
import p000.pe2;
import p000.qe2;
import p000.re2;
import p000.se2;
import p000.se5;
import p000.te2;
import p000.u91;
import p000.ue2;
import p000.uk9;
import p000.v91;
import p000.ve2;
import p000.vj6;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C2064h extends se5 {

    /* JADX INFO: renamed from: e */
    public final hi8 f25829e;

    /* JADX INFO: renamed from: f */
    public final vj6 f25830f;

    /* JADX INFO: renamed from: g */
    public int f25831g;

    public C2064h(hi8 hi8Var, vj6 vj6Var) {
        super(new ve2(0));
        this.f25829e = hi8Var;
        this.f25830f = vj6Var;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: c */
    public final int mo8978c(int i) {
        ue2 ue2Var = (ue2) m21308k(i);
        if (ue2Var instanceof re2) {
            return DictionariesManageAdapter$DictionaryAdapterItemType.ActiveDictionary.ordinal();
        }
        if (ue2Var instanceof te2) {
            return DictionariesManageAdapter$DictionaryAdapterItemType.Filter.ordinal();
        }
        if (ue2Var instanceof se2) {
            return DictionariesManageAdapter$DictionaryAdapterItemType.AvailableDictionary.ordinal();
        }
        gm5.m12750e();
        return 0;
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: e */
    public final void mo6135e(o38 o38Var, int i) {
        Object next;
        final qe2 qe2Var = (qe2) o38Var;
        final int i2 = 0;
        if (qe2Var instanceof ne2) {
            Object objM21308k = m21308k(i);
            objM21308k.getClass();
            final re2 re2Var = (re2) objM21308k;
            if5 if5Var = ((ne2) qe2Var).f52634u;
            DictionaryData dictionaryData = re2Var.f59155a;
            dictionaryData.getClass();
            if5Var.f44046b.setText(dictionaryData.m8022a());
            abd.m251g((ImageView) if5Var.f44049e, dictionaryData.f19014g, 0.0f);
            ((ImageButton) if5Var.f44048d).setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.feature.dictionary.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2064h f25824b;

                {
                    this.f25824b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    ue2 ue2Var = re2Var;
                    C2064h c2064h = this.f25824b;
                    switch (i3) {
                        case 0:
                            vj6 vj6Var = c2064h.f25830f;
                            DictionaryData dictionaryData2 = ((re2) ue2Var).f59155a;
                            vj6Var.getClass();
                            dictionaryData2.getClass();
                            DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) vj6Var.f65506b;
                            bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
                            C2057b c2057bM8963B0 = dictionariesManageFragment.m8963B0();
                            wfb.m23926u(lda.m16103C(c2057bM8963B0), c2057bM8963B0.f25794d, null, new DictManageViewModel$removeDictionaryFromActive$1(c2057bM8963B0, dictionaryData2, null), 2);
                            break;
                        default:
                            vj6 vj6Var2 = c2064h.f25830f;
                            DictionaryData dictionaryData3 = ((se2) ue2Var).f60732a;
                            vj6Var2.getClass();
                            dictionaryData3.getClass();
                            DictionariesManageFragment dictionariesManageFragment2 = (DictionariesManageFragment) vj6Var2.f65506b;
                            bh4[] bh4VarArr2 = DictionariesManageFragment.f25721W0;
                            C2057b c2057bM8963B1 = dictionariesManageFragment2.m8963B0();
                            wfb.m23926u(lda.m16103C(c2057bM8963B1), c2057bM8963B1.f25794d, null, new DictManageViewModel$addDictionaryToActive$1(c2057bM8963B1, dictionaryData3, null), 2);
                            break;
                    }
                }
            });
            if5Var.f44045a.setOnTouchListener(new View.OnTouchListener() { // from class: me2
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    int i3 = re2Var.f59155a.f19008a;
                    C2064h c2064h = this.f51196a;
                    c2064h.f25831g = i3;
                    hi8 hi8Var = c2064h.f25829e;
                    hi8Var.getClass();
                    DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) hi8Var.f42410b;
                    za4 za4Var = dictionariesManageFragment.f25723T0;
                    if (za4Var == null) {
                        fa4.m11636J("itemTouchHelper");
                        throw null;
                    }
                    gld gldVar = za4Var.f71273m;
                    RecyclerView recyclerView = za4Var.f71277q;
                    qe2 qe2Var2 = qe2Var;
                    if ((gld.m12736b(gldVar.m12741d(recyclerView, qe2Var2), recyclerView.getLayoutDirection()) & 16711680) == 0) {
                        Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
                    } else if (qe2Var2.f53781a.getParent() != za4Var.f71277q) {
                        Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
                    } else {
                        VelocityTracker velocityTracker = za4Var.f71279s;
                        if (velocityTracker != null) {
                            velocityTracker.recycle();
                        }
                        za4Var.f71279s = VelocityTracker.obtain();
                        za4Var.f71269i = 0.0f;
                        za4Var.f71268h = 0.0f;
                        za4Var.m25526p(qe2Var2, 2);
                    }
                    C3244l c3244l = dictionariesManageFragment.m8963B0().f25795e;
                    Boolean bool = Boolean.TRUE;
                    c3244l.getClass();
                    c3244l.m15572j(null, bool);
                    return false;
                }
            });
            return;
        }
        if (!(qe2Var instanceof pe2)) {
            if (!(qe2Var instanceof oe2)) {
                gm5.m12750e();
                return;
            }
            Object objM21308k2 = m21308k(i);
            objM21308k2.getClass();
            final se2 se2Var = (se2) objM21308k2;
            ff5 ff5Var = ((oe2) qe2Var).f54238u;
            DictionaryData dictionaryData2 = se2Var.f60732a;
            dictionaryData2.getClass();
            ((TextView) ff5Var.f38996b).setText(dictionaryData2.m8022a());
            abd.m251g((ImageView) ff5Var.f38998d, dictionaryData2.f19014g, 0.0f);
            final int i3 = 1;
            ((ImageButton) ff5Var.f38995a).setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.feature.dictionary.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C2064h f25824b;

                {
                    this.f25824b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    ue2 ue2Var = se2Var;
                    C2064h c2064h = this.f25824b;
                    switch (i4) {
                        case 0:
                            vj6 vj6Var = c2064h.f25830f;
                            DictionaryData dictionaryData3 = ((re2) ue2Var).f59155a;
                            vj6Var.getClass();
                            dictionaryData3.getClass();
                            DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) vj6Var.f65506b;
                            bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
                            C2057b c2057bM8963B0 = dictionariesManageFragment.m8963B0();
                            wfb.m23926u(lda.m16103C(c2057bM8963B0), c2057bM8963B0.f25794d, null, new DictManageViewModel$removeDictionaryFromActive$1(c2057bM8963B0, dictionaryData3, null), 2);
                            break;
                        default:
                            vj6 vj6Var2 = c2064h.f25830f;
                            DictionaryData dictionaryData4 = ((se2) ue2Var).f60732a;
                            vj6Var2.getClass();
                            dictionaryData4.getClass();
                            DictionariesManageFragment dictionariesManageFragment2 = (DictionariesManageFragment) vj6Var2.f65506b;
                            bh4[] bh4VarArr2 = DictionariesManageFragment.f25721W0;
                            C2057b c2057bM8963B1 = dictionariesManageFragment2.m8963B0();
                            wfb.m23926u(lda.m16103C(c2057bM8963B1), c2057bM8963B1.f25794d, null, new DictManageViewModel$addDictionaryToActive$1(c2057bM8963B1, dictionaryData4, null), 2);
                            break;
                    }
                }
            });
            return;
        }
        Object objM21308k3 = m21308k(i);
        objM21308k3.getClass();
        te2 te2Var = (te2) objM21308k3;
        List list = te2Var.f62188a;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DictionaryLocale) it.next()).f19022b);
        }
        List listM22613e1 = u91.m22613e1(arrayList);
        ArrayAdapter arrayAdapter = new ArrayAdapter(qe2Var.f53781a.getContext(), com.lingq.core.p012ui.R$layout.view_spinner_text, listM22613e1);
        arrayAdapter.setDropDownViewResource(com.lingq.core.p012ui.R$layout.view_spinner_dropdown_text);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) ((pe2) qe2Var).f55997u.f37183b;
        appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
        Iterator it2 = list.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!fa4.m11650l(((DictionaryLocale) next).f19021a, te2Var.f62189b));
        DictionaryLocale dictionaryLocale = (DictionaryLocale) next;
        String str = dictionaryLocale != null ? dictionaryLocale.f19022b : null;
        SpinnerAdapter adapter = appCompatSpinner.getAdapter();
        adapter.getClass();
        ArrayAdapter arrayAdapter2 = (ArrayAdapter) adapter;
        int count = arrayAdapter2.getCount();
        while (i2 < count) {
            String str2 = (String) arrayAdapter2.getItem(i2);
            if (str2 != null && str2.equals(str)) {
                appCompatSpinner.setSelection(i2);
                break;
            }
            i2++;
        }
        appCompatSpinner.setOnItemSelectedListener(new C2063g(te2Var, listM22613e1, this));
    }

    @Override // p000.p28
    /* JADX INFO: renamed from: f */
    public final o38 mo6136f(ViewGroup viewGroup, int i) {
        if (i == DictionariesManageAdapter$DictionaryAdapterItemType.ActiveDictionary.ordinal()) {
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_dictionary_active, viewGroup, false);
            int i2 = R$id.btnHandle;
            ImageButton imageButton = (ImageButton) lfa.m16159c(viewInflate, i2);
            if (imageButton != null) {
                i2 = R$id.btnRemove;
                ImageButton imageButton2 = (ImageButton) lfa.m16159c(viewInflate, i2);
                if (imageButton2 != null) {
                    i2 = R$id.ivLocale;
                    ImageView imageView = (ImageView) lfa.m16159c(viewInflate, i2);
                    if (imageView != null) {
                        i2 = R$id.tvDictionary;
                        TextView textView = (TextView) lfa.m16159c(viewInflate, i2);
                        if (textView != null) {
                            return new ne2(new if5((RelativeLayout) viewInflate, imageButton, imageButton2, imageView, textView));
                        }
                    }
                }
            }
            C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
            return null;
        }
        if (i == DictionariesManageAdapter$DictionaryAdapterItemType.Filter.ordinal()) {
            View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_dictionaries_manage_filter, viewGroup, false);
            int i3 = R$id.spinner_content;
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) lfa.m16159c(viewInflate2, i3);
            if (appCompatSpinner != null) {
                return new pe2(new ef5(appCompatSpinner, (RelativeLayout) viewInflate2));
            }
            C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i3)));
            return null;
        }
        if (i != DictionariesManageAdapter$DictionaryAdapterItemType.AvailableDictionary.ordinal()) {
            uk9.m22770c();
            return null;
        }
        View viewInflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R$layout.list_item_available_dictionary, viewGroup, false);
        int i4 = R$id.btnAdd;
        ImageButton imageButton3 = (ImageButton) lfa.m16159c(viewInflate3, i4);
        if (imageButton3 != null) {
            i4 = R$id.ivLocale;
            ImageView imageView2 = (ImageView) lfa.m16159c(viewInflate3, i4);
            if (imageView2 != null) {
                i4 = R$id.tvDictionary;
                TextView textView2 = (TextView) lfa.m16159c(viewInflate3, i4);
                if (textView2 != null) {
                    return new oe2(new ff5((RelativeLayout) viewInflate3, imageButton3, imageView2, textView2));
                }
            }
        }
        C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i4)));
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final void m8979m(int i, int i2) {
        Object next;
        if (i == -1 || i2 == -1) {
            return;
        }
        C3663uw c3663uw = this.f60762d;
        if ((c3663uw.f64454f.get(i2) instanceof se2) || (c3663uw.f64454f.get(i2) instanceof se2) || (c3663uw.f64454f.get(i2) instanceof te2) || (c3663uw.f64454f.get(i2) instanceof te2)) {
            return;
        }
        List list = c3663uw.f64454f;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof re2) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((re2) next).f59155a.f19008a != this.f25831g);
        if (((re2) next) != null) {
            if (i < mo6133a() && i2 < mo6133a()) {
                if (i >= i2) {
                    int i3 = i2 + 1;
                    if (i3 <= i) {
                        int i4 = i;
                        while (true) {
                            Collections.swap(arrayList, i4, i4 - 1);
                            if (i4 == i3) {
                                break;
                            } else {
                                i4--;
                            }
                        }
                    }
                } else {
                    int i5 = i;
                    while (i5 < i2) {
                        int i6 = i5 + 1;
                        Collections.swap(arrayList, i5, i6);
                        i5 = i6;
                    }
                }
                DictionariesManageFragment dictionariesManageFragment = (DictionariesManageFragment) this.f25830f.f65506b;
                bh4[] bh4VarArr = DictionariesManageFragment.f25721W0;
                C2057b c2057bM8963B0 = dictionariesManageFragment.m8963B0();
                wfb.m23926u(lda.m16103C(c2057bM8963B0), c2057bM8963B0.f25794d, null, new DictManageViewModel$changePosition$1(c2057bM8963B0, i, i2, null), 2);
            }
            this.f55486a.m19619c(i, i2);
        }
    }
}
