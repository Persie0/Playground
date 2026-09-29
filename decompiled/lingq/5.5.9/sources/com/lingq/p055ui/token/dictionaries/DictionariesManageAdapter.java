package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1146d;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import bj.ViewOnTouchListenerC1584g;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p278nh.InterfaceC7778e;
import p278nh.InterfaceC7781h;
import ph.C8271d3;
import ph.C8324m2;
import ph.C8330n2;
import si.ViewOnClickListenerC9029m;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class DictionariesManageAdapter extends AbstractC1170u<AbstractC4874b, AbstractC4873a> implements InterfaceC7778e {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7781h f31764e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4875c f31765f;

    /* JADX INFO: renamed from: g */
    public int f31766g;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionariesManageAdapter$DictionaryAdapterItemType;", "", "(Ljava/lang/String;I)V", "ActiveDictionary", "Filter", "AvailableDictionary", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum DictionaryAdapterItemType {
        ActiveDictionary,
        Filter,
        AvailableDictionary
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$a */
    public static abstract class AbstractC4873a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$a$a */
        public static final class a extends AbstractC4873a {

            /* JADX INFO: renamed from: u */
            public final C8324m2 f31767u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8324m2 c8324m2) {
                RelativeLayout relativeLayoutM16404a = c8324m2.m16404a();
                C5207g.m11110e(relativeLayoutM16404a, "binding.root");
                super(relativeLayoutM16404a);
                this.f31767u = c8324m2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$a$b */
        public static final class b extends AbstractC4873a {

            /* JADX INFO: renamed from: u */
            public final C8271d3 f31768u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8271d3 c8271d3) {
                RelativeLayout relativeLayout = (RelativeLayout) c8271d3.f44672c;
                C5207g.m11110e(relativeLayout, "binding.root");
                super(relativeLayout);
                this.f31768u = c8271d3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$a$c */
        public static final class c extends AbstractC4873a {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f31769u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8330n2 c8330n2) {
                RelativeLayout relativeLayout = (RelativeLayout) c8330n2.f45085a;
                C5207g.m11110e(relativeLayout, "binding.root");
                super(relativeLayout);
                this.f31769u = c8330n2;
            }
        }

        public AbstractC4873a(RelativeLayout relativeLayout) {
            super(relativeLayout);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$b */
    public static abstract class AbstractC4874b {

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$b$a */
        public static final class a extends AbstractC4874b {

            /* JADX INFO: renamed from: a */
            public final UserDictionaryData f31770a;

            public a(UserDictionaryData userDictionaryData) {
                C5207g.m11111f(userDictionaryData, "dictionary");
                this.f31770a = userDictionaryData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C5207g.m11106a(this.f31770a, ((a) obj).f31770a);
            }

            public final int hashCode() {
                return this.f31770a.hashCode();
            }

            public final String toString() {
                return "ActiveDictionary(dictionary=" + this.f31770a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$b$b */
        public static final class b extends AbstractC4874b {

            /* JADX INFO: renamed from: a */
            public final UserDictionaryData f31771a;

            public b(UserDictionaryData userDictionaryData) {
                C5207g.m11111f(userDictionaryData, "dictionary");
                this.f31771a = userDictionaryData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && C5207g.m11106a(this.f31771a, ((b) obj).f31771a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f31771a.hashCode();
            }

            public final String toString() {
                return "AvailableDictionary(dictionary=" + this.f31771a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$b$c */
        public static final class c extends AbstractC4874b {

            /* JADX INFO: renamed from: a */
            public final List<UserDictionaryLocale> f31772a;

            /* JADX INFO: renamed from: b */
            public final String f31773b;

            public c(List<UserDictionaryLocale> list, String str) {
                C5207g.m11111f(list, "languages");
                C5207g.m11111f(str, "selectedLocale");
                this.f31772a = list;
                this.f31773b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (C5207g.m11106a(this.f31772a, cVar.f31772a) && C5207g.m11106a(this.f31773b, cVar.f31773b)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f31773b.hashCode() + (this.f31772a.hashCode() * 31);
            }

            public final String toString() {
                return "Filter(languages=" + this.f31772a + ", selectedLocale=" + this.f31773b + ")";
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$c */
    public interface InterfaceC4875c {
        /* JADX INFO: renamed from: a */
        void mo10389a(int i10, int i11);

        /* JADX INFO: renamed from: b */
        void mo10390b(String str);

        /* JADX INFO: renamed from: c */
        void mo10391c(UserDictionaryData userDictionaryData);

        /* JADX INFO: renamed from: d */
        void mo10392d(UserDictionaryData userDictionaryData);
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageAdapter$d */
    public static final class C4876d extends C1162m.e<AbstractC4874b> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC4874b abstractC4874b, AbstractC4874b abstractC4874b2) {
            AbstractC4874b abstractC4874b3 = abstractC4874b;
            AbstractC4874b abstractC4874b4 = abstractC4874b2;
            if ((abstractC4874b3 instanceof AbstractC4874b.a) && (abstractC4874b4 instanceof AbstractC4874b.a)) {
                return C5207g.m11106a(abstractC4874b3, abstractC4874b4);
            }
            if ((abstractC4874b3 instanceof AbstractC4874b.b) && (abstractC4874b4 instanceof AbstractC4874b.b)) {
                return C5207g.m11106a(abstractC4874b3, abstractC4874b4);
            }
            if ((abstractC4874b3 instanceof AbstractC4874b.c) && (abstractC4874b4 instanceof AbstractC4874b.c)) {
                return C5207g.m11106a(abstractC4874b3, abstractC4874b4);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (((com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.AbstractC4874b.b) r6).f31771a.f21703a == ((com.lingq.p055ui.token.dictionaries.DictionariesManageAdapter.AbstractC4874b.b) r7).f31771a.f21703a) goto L21;
         */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo481b(AbstractC4874b abstractC4874b, AbstractC4874b abstractC4874b2) {
            AbstractC4874b abstractC4874b3 = abstractC4874b;
            AbstractC4874b abstractC4874b4 = abstractC4874b2;
            if ((abstractC4874b3 instanceof AbstractC4874b.a) && (abstractC4874b4 instanceof AbstractC4874b.a)) {
                if (((AbstractC4874b.a) abstractC4874b3).f31770a.f21703a == ((AbstractC4874b.a) abstractC4874b4).f31770a.f21703a) {
                    return true;
                }
                return false;
            }
            if (!(abstractC4874b3 instanceof AbstractC4874b.b) || !(abstractC4874b4 instanceof AbstractC4874b.b)) {
                if ((abstractC4874b3 instanceof AbstractC4874b.c) && (abstractC4874b4 instanceof AbstractC4874b.c)) {
                    return true;
                }
                return false;
            }
        }
    }

    public DictionariesManageAdapter(DictionariesManageFragment.C4878b c4878b, DictionariesManageFragment.C4879c c4879c) {
        super(new C4876d());
        this.f31764e = c4878b;
        this.f31765f = c4879c;
    }

    @Override // p278nh.InterfaceC7778e
    /* JADX INFO: renamed from: c */
    public final void mo9972c(int i10) {
    }

    @Override // p278nh.InterfaceC7778e
    /* JADX INFO: renamed from: d */
    public final boolean mo9973d(int i10, int i11) {
        Object next;
        if (i10 != -1 && i11 != -1) {
            C1146d<T> c1146d = this.f7471d;
            if (!(c1146d.f7233f.get(i11) instanceof AbstractC4874b.b) && !(c1146d.f7233f.get(i11) instanceof AbstractC4874b.b) && !(c1146d.f7233f.get(i11) instanceof AbstractC4874b.c) && !(c1146d.f7233f.get(i11) instanceof AbstractC4874b.c)) {
                Collection collection = c1146d.f7233f;
                C5207g.m11110e(collection, "currentList");
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next2 = it.next();
                        if (next2 instanceof AbstractC4874b.a) {
                            arrayList.add(next2);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(((AbstractC4874b.a) next).f31770a.f21703a == this.f31766g));
                if (((AbstractC4874b.a) next) != null) {
                    if (i10 < mo4226e() && i11 < mo4226e()) {
                        if (i10 >= i11) {
                            int i12 = i11 + 1;
                            if (i12 <= i10) {
                                int i13 = i10;
                                while (true) {
                                    int i14 = i13 - 1;
                                    Collections.swap(arrayList, i13, i14);
                                    if (i13 == i12) {
                                        break;
                                    }
                                    i13 = i14;
                                }
                            }
                        } else {
                            int i15 = i10;
                            while (i15 < i11) {
                                int i16 = i15 + 1;
                                Collections.swap(arrayList, i15, i16);
                                i15 = i16;
                            }
                        }
                        this.f31765f.mo10389a(i10, i11);
                    }
                    this.f7040a.m4260c(i10, i11);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC4874b abstractC4874bM4528p = m4528p(i10);
        if (abstractC4874bM4528p instanceof AbstractC4874b.a) {
            return DictionaryAdapterItemType.ActiveDictionary.ordinal();
        }
        if (abstractC4874bM4528p instanceof AbstractC4874b.c) {
            return DictionaryAdapterItemType.Filter.ordinal();
        }
        if (abstractC4874bM4528p instanceof AbstractC4874b.b) {
            return DictionaryAdapterItemType.AvailableDictionary.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String str;
        Object next;
        AbstractC4873a abstractC4873a = (AbstractC4873a) abstractC1109b0;
        if (abstractC4873a instanceof AbstractC4873a.a) {
            AbstractC4874b abstractC4874bM4528p = m4528p(i10);
            C5207g.m11109d(abstractC4874bM4528p, "null cannot be cast to non-null type com.lingq.ui.token.dictionaries.DictionariesManageAdapter.DictionaryAdapterItem.ActiveDictionary");
            AbstractC4874b.a aVar = (AbstractC4874b.a) abstractC4874bM4528p;
            UserDictionaryData userDictionaryData = aVar.f31770a;
            C5207g.m11111f(userDictionaryData, "dictionary");
            C8324m2 c8324m2 = ((AbstractC4873a.a) abstractC4873a).f31767u;
            ((TextView) c8324m2.f45031e).setText(userDictionaryData.m9702a());
            List<Integer> list = C6716m.f37937a;
            C6716m.m13326k((ImageView) c8324m2.f45028b, userDictionaryData.f21709g, 0.0f);
            ((ImageButton) c8324m2.f45030d).setOnClickListener(new ViewOnClickListenerC9029m(this, 22, aVar));
            ((ImageButton) c8324m2.f45029c).setOnTouchListener(new ViewOnTouchListenerC1584g(this, aVar, abstractC4873a, 1));
            return;
        }
        if (!(abstractC4873a instanceof AbstractC4873a.c)) {
            if (abstractC4873a instanceof AbstractC4873a.b) {
                AbstractC4874b abstractC4874bM4528p2 = m4528p(i10);
                C5207g.m11109d(abstractC4874bM4528p2, "null cannot be cast to non-null type com.lingq.ui.token.dictionaries.DictionariesManageAdapter.DictionaryAdapterItem.AvailableDictionary");
                AbstractC4874b.b bVar = (AbstractC4874b.b) abstractC4874bM4528p2;
                UserDictionaryData userDictionaryData2 = bVar.f31771a;
                C5207g.m11111f(userDictionaryData2, "dictionary");
                C8271d3 c8271d3 = ((AbstractC4873a.b) abstractC4873a).f31768u;
                ((TextView) c8271d3.f44671b).setText(userDictionaryData2.m9702a());
                List<Integer> list2 = C6716m.f37937a;
                C6716m.m13326k((ImageView) c8271d3.f44674e, userDictionaryData2.f21709g, 0.0f);
                ((ImageButton) c8271d3.f44673d).setOnClickListener(new ViewOnClickListenerC6464i(this, 23, bVar));
            }
            return;
        }
        AbstractC4874b abstractC4874bM4528p3 = m4528p(i10);
        C5207g.m11109d(abstractC4874bM4528p3, "null cannot be cast to non-null type com.lingq.ui.token.dictionaries.DictionariesManageAdapter.DictionaryAdapterItem.Filter");
        AbstractC4874b.c cVar = (AbstractC4874b.c) abstractC4874bM4528p3;
        List<UserDictionaryLocale> list3 = cVar.f31772a;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((UserDictionaryLocale) it.next()).f21722b);
        }
        List listM13446n0 = C6752c.m13446n0(arrayList);
        ArrayAdapter arrayAdapter = new ArrayAdapter(abstractC4873a.f7054a.getContext(), R.layout.view_spinner_text, listM13446n0);
        arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
        C8330n2 c8330n2 = ((AbstractC4873a.c) abstractC4873a).f31769u;
        ((AppCompatSpinner) c8330n2.f45086b).setAdapter((SpinnerAdapter) arrayAdapter);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8330n2.f45086b;
        C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerContent");
        Iterator<T> it2 = cVar.f31772a.iterator();
        do {
            str = null;
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!C5207g.m11106a(((UserDictionaryLocale) next).f21721a, cVar.f31773b));
        UserDictionaryLocale userDictionaryLocale = (UserDictionaryLocale) next;
        if (userDictionaryLocale != null) {
            str = userDictionaryLocale.f21722b;
        }
        C4924a.m10449a0(appCompatSpinner, str);
        appCompatSpinner.setOnItemSelectedListener(new C4903b(abstractC4873a, cVar, listM13446n0, this));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006a A[PHI: r0
      0x006a: PHI (r0v17 int) = (r0v16 int), (r0v18 int) binds: [B:5:0x0031, B:7:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 bVar;
        C5207g.m11111f(recyclerView, "parent");
        int iOrdinal = DictionaryAdapterItemType.ActiveDictionary.ordinal();
        int i11 = R.id.tvDictionary;
        if (i10 == iOrdinal) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_dictionary_active, recyclerView, false);
            int i12 = R.id.btnHandle;
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnHandle);
            if (imageButton != null) {
                i12 = R.id.btnRemove;
                ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnRemove);
                if (imageButton2 != null) {
                    ImageView imageView = (ImageView) C0062b.m298P0(viewM849h, R.id.ivLocale);
                    if (imageView != null) {
                        TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvDictionary);
                        if (textView != null) {
                            bVar = new AbstractC4873a.a(new C8324m2((RelativeLayout) viewM849h, imageButton, imageButton2, imageView, textView));
                        }
                    } else {
                        i11 = R.id.ivLocale;
                    }
                } else {
                    i11 = i12;
                }
            } else {
                i11 = i12;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != DictionaryAdapterItemType.Filter.ordinal()) {
            if (i10 != DictionaryAdapterItemType.AvailableDictionary.ordinal()) {
                throw new IllegalStateException();
            }
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_available_dictionary, recyclerView, false);
            ImageButton imageButton3 = (ImageButton) C0062b.m298P0(viewM849h2, R.id.btnAdd);
            if (imageButton3 != null) {
                ImageView imageView2 = (ImageView) C0062b.m298P0(viewM849h2, R.id.ivLocale);
                if (imageView2 != null) {
                    TextView textView2 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvDictionary);
                    if (textView2 != null) {
                        bVar = new AbstractC4873a.b(new C8271d3((RelativeLayout) viewM849h2, imageButton3, imageView2, textView2, 0));
                    }
                } else {
                    i11 = R.id.ivLocale;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i11)));
            }
            i11 = R.id.btnAdd;
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i11)));
        }
        View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_item_dictionaries_manage_filter, recyclerView, false);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewM849h3, R.id.spinner_content);
        if (appCompatSpinner == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h3.getResources().getResourceName(R.id.spinner_content)));
        }
        bVar = new AbstractC4873a.c(new C8330n2((RelativeLayout) viewM849h3, appCompatSpinner));
        return bVar;
    }
}
