package com.lingq.p055ui.home.vocabulary;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.p055ui.home.vocabulary.VocabularyAdapter;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.C4924a;
import com.lingq.util.ViewsUtilsKt;
import com.linguist.R;
import dj.ViewOnTouchListenerC5188f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.jvm.internal.Ref$BooleanRef;
import mo.C7661i;
import p003a2.C0009a;
import p096ei.C5408a;
import p137gj.C5810f;
import p225kk.C6716m;
import p264mi.C7563c;
import p274n8.ViewOnClickListenerC7718c;
import p278nh.InterfaceC7774a;
import p301oh.C8049h;
import p385sf.C9000b;
import p512yi.ViewOnClickListenerC10371b;
import p512yi.ViewOnClickListenerC10380h;
import ph.C8295h3;
import ph.C8324m2;
import ph.C8330n2;
import ph.C8331n3;
import si.ViewOnClickListenerC9029m;

/* JADX INFO: loaded from: classes2.dex */
public final class VocabularyAdapter extends AbstractC1170u<AbstractC3987a, AbstractC3988b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7774a<C7563c> f26076e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7774a<String> f26077f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7774a<SelectedContent> f26078g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3992f f26079h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3991e f26080i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3990d f26081j;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/VocabularyAdapter$SelectedContent;", "", "(Ljava/lang/String;I)V", "All", "Phrases", "SrsDue", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum SelectedContent {
        All,
        Phrases,
        SrsDue
    }

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/VocabularyAdapter$VocabularyListItemType;", "", "(Ljava/lang/String;I)V", "Content", "Search", "Filter", "Empty", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum VocabularyListItemType {
        Content,
        Search,
        Filter,
        Empty
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$a */
    public static abstract class AbstractC3987a {

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$a$a */
        public static final class a extends AbstractC3987a {

            /* JADX INFO: renamed from: a */
            public final C7563c f26082a;

            public a(C7563c c7563c) {
                C5207g.m11111f(c7563c, "card");
                this.f26082a = c7563c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C5207g.m11106a(this.f26082a, ((a) obj).f26082a);
            }

            public final int hashCode() {
                return this.f26082a.hashCode();
            }

            public final String toString() {
                return "Content(card=" + this.f26082a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$a$b */
        public static final class b extends AbstractC3987a {

            /* JADX INFO: renamed from: a */
            public final int f26083a;

            /* JADX INFO: renamed from: b */
            public final int f26084b;

            public b(int i10, int i11) {
                this.f26083a = i10;
                this.f26084b = i11;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f26083a == bVar.f26083a && this.f26084b == bVar.f26084b) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f26084b) + (Integer.hashCode(this.f26083a) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Empty(title=");
                sb2.append(this.f26083a);
                sb2.append(", description=");
                return C0166e.m768o(sb2, this.f26084b, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$a$c */
        public static final class c extends AbstractC3987a {

            /* JADX INFO: renamed from: a */
            public final SelectedContent f26085a;

            /* JADX INFO: renamed from: b */
            public final Pair<CardStatus, CardStatus> f26086b;

            /* JADX INFO: renamed from: c */
            public final int f26087c;

            /* JADX WARN: Multi-variable type inference failed */
            public c(SelectedContent selectedContent, Pair<? extends CardStatus, ? extends CardStatus> pair, int i10) {
                this.f26085a = selectedContent;
                this.f26086b = pair;
                this.f26087c = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.f26085a == cVar.f26085a && C5207g.m11106a(this.f26086b, cVar.f26086b) && this.f26087c == cVar.f26087c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f26087c) + ((this.f26086b.hashCode() + (this.f26085a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Filter(contentType=");
                sb2.append(this.f26085a);
                sb2.append(", statuses=");
                sb2.append(this.f26086b);
                sb2.append(", numberOfCards=");
                return C0166e.m768o(sb2, this.f26087c, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$a$d */
        public static final class d extends AbstractC3987a {

            /* JADX INFO: renamed from: a */
            public final String f26088a;

            public d(String str) {
                C5207g.m11111f(str, "query");
                this.f26088a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C5207g.m11106a(this.f26088a, ((d) obj).f26088a);
            }

            public final int hashCode() {
                return this.f26088a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Search(query="), this.f26088a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$b */
    public static abstract class AbstractC3988b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$b$a */
        public static final class a extends AbstractC3988b {

            /* JADX INFO: renamed from: u */
            public final C8295h3 f26089u;

            /* JADX INFO: renamed from: v */
            public final C5810f f26090v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f26091w;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8295h3 c8295h3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8295h3.f44856f;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f26089u = c8295h3;
                this.f26090v = new C5810f();
                constraintLayout.getContext();
                this.f26091w = new LinearLayoutManager(1);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$b$b */
        public static final class b extends AbstractC3988b {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f26092u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8331n3 c8331n3) {
                LinearLayout linearLayout = (LinearLayout) c8331n3.f45087a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f26092u = c8331n3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$b$c */
        public static final class c extends AbstractC3988b {

            /* JADX INFO: renamed from: u */
            public final C8324m2 f26093u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8324m2 c8324m2) {
                ConstraintLayout constraintLayoutM16405b = c8324m2.m16405b();
                C5207g.m11110e(constraintLayoutM16405b, "binding.root");
                super(constraintLayoutM16405b);
                this.f26093u = c8324m2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$b$d */
        public static final class d extends AbstractC3988b {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f26094u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8330n2 c8330n2) {
                TextInputLayout textInputLayout = (TextInputLayout) c8330n2.f45085a;
                C5207g.m11110e(textInputLayout, "binding.root");
                super(textInputLayout);
                this.f26094u = c8330n2;
            }
        }

        public AbstractC3988b(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$c */
    public static final class C3989c extends C1162m.e<AbstractC3987a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC3987a abstractC3987a, AbstractC3987a abstractC3987a2) {
            AbstractC3987a abstractC3987a3 = abstractC3987a;
            AbstractC3987a abstractC3987a4 = abstractC3987a2;
            if ((abstractC3987a3 instanceof AbstractC3987a.a) && (abstractC3987a4 instanceof AbstractC3987a.a)) {
                C7563c c7563c = ((AbstractC3987a.a) abstractC3987a3).f26082a;
                String str = c7563c.f41680b;
                C7563c c7563c2 = ((AbstractC3987a.a) abstractC3987a4).f26082a;
                if (C5207g.m11106a(str, c7563c2.f41680b) && c7563c.f41681c == c7563c2.f41681c && c7563c.f41682d == c7563c2.f41682d) {
                    TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7563c.f41684f);
                    String str2 = tokenMeaning != null ? tokenMeaning.f22090c : null;
                    TokenMeaning tokenMeaning2 = (TokenMeaning) C6752c.m13425S(c7563c2.f41684f);
                    if (C5207g.m11106a(str2, tokenMeaning2 != null ? tokenMeaning2.f22090c : null)) {
                    }
                }
                return false;
            }
            if (!(abstractC3987a3 instanceof AbstractC3987a.d) || !(abstractC3987a4 instanceof AbstractC3987a.d)) {
                if ((abstractC3987a3 instanceof AbstractC3987a.c) && (abstractC3987a4 instanceof AbstractC3987a.c)) {
                    return C5207g.m11106a(abstractC3987a3, abstractC3987a4);
                }
                if ((abstractC3987a3 instanceof AbstractC3987a.b) && (abstractC3987a4 instanceof AbstractC3987a.b)) {
                    return C5207g.m11106a(abstractC3987a3, abstractC3987a4);
                }
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC3987a abstractC3987a, AbstractC3987a abstractC3987a2) {
            AbstractC3987a abstractC3987a3 = abstractC3987a;
            AbstractC3987a abstractC3987a4 = abstractC3987a2;
            if ((abstractC3987a3 instanceof AbstractC3987a.a) && (abstractC3987a4 instanceof AbstractC3987a.a)) {
                if (((AbstractC3987a.a) abstractC3987a3).f26082a.f41679a == ((AbstractC3987a.a) abstractC3987a4).f26082a.f41679a) {
                    return true;
                }
                return false;
            }
            if (abstractC3987a3 instanceof AbstractC3987a.d) {
                if (!(abstractC3987a4 instanceof AbstractC3987a.d)) {
                }
                return true;
            }
            if (((abstractC3987a3 instanceof AbstractC3987a.c) && (abstractC3987a4 instanceof AbstractC3987a.c)) || ((abstractC3987a3 instanceof AbstractC3987a.b) && (abstractC3987a4 instanceof AbstractC3987a.b) && ((AbstractC3987a.b) abstractC3987a3).f26083a == ((AbstractC3987a.b) abstractC3987a4).f26083a)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$d */
    public interface InterfaceC3990d {
        /* JADX INFO: renamed from: a */
        void mo10015a();
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$e */
    public interface InterfaceC3991e {
        /* JADX INFO: renamed from: a */
        void mo10016a(String str, int i10);
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$f */
    public interface InterfaceC3992f {
        /* JADX INFO: renamed from: a */
        void mo10017a(String str, int i10, Integer num, View view);
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.VocabularyAdapter$g */
    public /* synthetic */ class C3993g {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26095a;

        static {
            int[] iArr = new int[SelectedContent.values().length];
            try {
                iArr[SelectedContent.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelectedContent.Phrases.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelectedContent.SrsDue.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26095a = iArr;
        }
    }

    public VocabularyAdapter(VocabularyFragment.C4000d c4000d, VocabularyFragment.C4001e c4001e, VocabularyFragment.C4002f c4002f, VocabularyFragment$onViewCreated$2$8 vocabularyFragment$onViewCreated$2$8, VocabularyFragment.C4003g c4003g, VocabularyFragment.C3998b c3998b) {
        super(new C3989c());
        this.f26076e = c4000d;
        this.f26077f = c4001e;
        this.f26078g = c4002f;
        this.f26079h = vocabularyFragment$onViewCreated$2$8;
        this.f26080i = c4003g;
        this.f26081j = c3998b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC3987a abstractC3987aM4528p = m4528p(i10);
        if (abstractC3987aM4528p instanceof AbstractC3987a.a) {
            return VocabularyListItemType.Content.ordinal();
        }
        if (abstractC3987aM4528p instanceof AbstractC3987a.d) {
            return VocabularyListItemType.Search.ordinal();
        }
        if (abstractC3987aM4528p instanceof AbstractC3987a.c) {
            return VocabularyListItemType.Filter.ordinal();
        }
        if (abstractC3987aM4528p instanceof AbstractC3987a.b) {
            return VocabularyListItemType.Empty.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:104:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:108:0x0300  */
    /* JADX WARN: Code duplicated, block: B:111:0x0308  */
    /* JADX WARN: Code duplicated, block: B:113:0x0312  */
    /* JADX WARN: Code duplicated, block: B:115:0x031e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0328  */
    /* JADX WARN: Code duplicated, block: B:119:0x0330  */
    /* JADX WARN: Code duplicated, block: B:122:0x033e  */
    /* JADX WARN: Code duplicated, block: B:170:0x02b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x027f  */
    /* JADX WARN: Code duplicated, block: B:83:0x028e  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:92:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:94:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d3  */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        String string;
        String string2;
        String string3;
        String str;
        View view;
        View view2;
        View view3;
        final AbstractC3987a.a aVar;
        ImageButton imageButton;
        TextView textView;
        ArrayList arrayList;
        boolean zIsEmpty;
        View view4;
        RecyclerView recyclerView;
        AbstractC3988b.a aVar2;
        C5810f c5810f;
        final int i11;
        TextView textView2;
        final int i12;
        ImageButton imageButton2;
        ImageButton imageButton3;
        RecyclerView recyclerView2;
        AbstractC3988b abstractC3988b = (AbstractC3988b) abstractC1109b0;
        if (!(abstractC3988b instanceof AbstractC3988b.a)) {
            if (abstractC3988b instanceof AbstractC3988b.d) {
                AbstractC3987a abstractC3987aM4528p = m4528p(i10);
                C5207g.m11109d(abstractC3987aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.VocabularyAdapter.AdapterItem.Search");
                String str2 = ((AbstractC3987a.d) abstractC3987aM4528p).f26088a;
                C5207g.m11111f(str2, "query");
                C8330n2 c8330n2 = ((AbstractC3988b.d) abstractC3988b).f26094u;
                ((TextInputEditText) c8330n2.f45086b).setText(str2);
                ((TextInputEditText) c8330n2.f45086b).setOnEditorActionListener(new C4030b(this));
                return;
            }
            if (!(abstractC3988b instanceof AbstractC3988b.c)) {
                if (abstractC3988b instanceof AbstractC3988b.b) {
                    AbstractC3987a abstractC3987aM4528p2 = m4528p(i10);
                    C5207g.m11109d(abstractC3987aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.VocabularyAdapter.AdapterItem.Empty");
                    AbstractC3987a.b bVar = (AbstractC3987a.b) abstractC3987aM4528p2;
                    AbstractC3988b.b bVar2 = (AbstractC3988b.b) abstractC3988b;
                    C8331n3 c8331n3 = bVar2.f26092u;
                    TextView textView3 = (TextView) c8331n3.f45088b;
                    View view5 = bVar2.f7054a;
                    textView3.setText(view5.getContext().getString(bVar.f26083a));
                    View view6 = c8331n3.f45090d;
                    int i13 = bVar.f26084b;
                    if (i13 != -1) {
                        ((TextView) view6).setText(view5.getContext().getString(i13));
                        return;
                    } else {
                        ((TextView) view6).setText("");
                        return;
                    }
                }
                return;
            }
            AbstractC3987a abstractC3987aM4528p3 = m4528p(i10);
            C5207g.m11109d(abstractC3987aM4528p3, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.VocabularyAdapter.AdapterItem.Filter");
            AbstractC3987a.c cVar = (AbstractC3987a.c) abstractC3987aM4528p3;
            View view7 = abstractC3988b.f7054a;
            int i14 = cVar.f26087c;
            SelectedContent selectedContent = cVar.f26085a;
            if (i14 <= 0 || selectedContent != SelectedContent.All) {
                string = view7.getContext().getString(R.string.search_all);
                C5207g.m11110e(string, "{\n                      …ll)\n                    }");
            } else {
                string = C0166e.m770q(new Object[]{view7.getContext().getString(R.string.search_all), Integer.valueOf(i14)}, 2, "%s (%d)", "format(format, *args)");
            }
            String str3 = string;
            if (i14 <= 0 || selectedContent != SelectedContent.Phrases) {
                string2 = view7.getContext().getString(R.string.card_only_phrases);
                C5207g.m11110e(string2, "{\n                      …es)\n                    }");
            } else {
                string2 = C0166e.m770q(new Object[]{view7.getContext().getString(R.string.card_only_phrases), Integer.valueOf(i14)}, 2, "%s (%d)", "format(format, *args)");
            }
            String str4 = string2;
            if (i14 <= 0 || selectedContent != SelectedContent.SrsDue) {
                string3 = view7.getContext().getString(R.string.card_srs_due);
                C5207g.m11110e(string3, "{\n                      …ue)\n                    }");
            } else {
                string3 = C0166e.m770q(new Object[]{view7.getContext().getString(R.string.card_srs_due), Integer.valueOf(i14)}, 2, "%s (%d)", "format(format, *args)");
            }
            String str5 = string3;
            List listM17252r = C9000b.m17252r(str3, str4, str5);
            ArrayAdapter arrayAdapter = new ArrayAdapter(view7.getContext(), R.layout.view_spinner_text, listM17252r);
            arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
            C8324m2 c8324m2 = ((AbstractC3988b.c) abstractC3988b).f26093u;
            ((AppCompatSpinner) c8324m2.f45028b).setAdapter((SpinnerAdapter) arrayAdapter);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8324m2.f45028b;
            appCompatSpinner.setOnTouchListener(new ViewOnTouchListenerC5188f(0, ref$BooleanRef));
            appCompatSpinner.setOnItemSelectedListener(new C4031c(ref$BooleanRef, abstractC3988b, listM17252r, str3, str4, str5, this));
            C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerContent");
            int i15 = C3993g.f26095a[selectedContent.ordinal()];
            if (i15 == 1) {
                str = str3;
            } else if (i15 == 2) {
                str = str4;
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = str5;
            }
            C4924a.m10449a0(appCompatSpinner, str);
            Pair<CardStatus, CardStatus> pair = cVar.f26086b;
            CardStatus cardStatus = pair.f38012a;
            CardStatus cardStatus2 = pair.f38013b;
            Context context = view7.getContext();
            TextView textView4 = (TextView) c8324m2.f45032f;
            textView4.setText(cardStatus == cardStatus2 ? context.getString(C4924a.m10429H(cardStatus)) : C0166e.m770q(new Object[]{context.getString(C4924a.m10429H(cardStatus)), context.getString(C4924a.m10429H(cardStatus2))}, 2, "%s - %s", "format(format, *args)"));
            textView4.setOnClickListener(new ViewOnClickListenerC7718c(20, this));
            return;
        }
        AbstractC3987a abstractC3987aM4528p4 = m4528p(i10);
        C5207g.m11109d(abstractC3987aM4528p4, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.VocabularyAdapter.AdapterItem.Content");
        AbstractC3987a.a aVar3 = (AbstractC3987a.a) abstractC3987aM4528p4;
        AbstractC3988b.a aVar4 = (AbstractC3988b.a) abstractC3988b;
        C7563c c7563c = aVar3.f26082a;
        C5207g.m11111f(c7563c, "card");
        C8295h3 c8295h3 = aVar4.f26089u;
        TextView textView5 = (TextView) c8295h3.f44865o;
        List<String> list = c7563c.f41686h;
        if (list.isEmpty()) {
            list = c7563c.f41685g;
        }
        textView5.setText(C4924a.m10452c(list, c7563c.f41680b));
        TextView textView6 = (TextView) c8295h3.f44863m;
        TokenMeaning tokenMeaning = (TokenMeaning) C6752c.m13425S(c7563c.f41684f);
        textView6.setText(tokenMeaning != null ? tokenMeaning.f22090c : null);
        int i16 = c7563c.f41682d;
        Integer numValueOf = Integer.valueOf(i16);
        int i17 = c7563c.f41681c;
        int iM11568a = C5408a.m11568a(i17, numValueOf);
        CardStatus cardStatus3 = CardStatus.Ignored;
        int value = cardStatus3.getValue();
        View view8 = c8295h3.f44864n;
        View view9 = c8295h3.f44860j;
        View view10 = aVar4.f7054a;
        if (iM11568a == value || iM11568a == CardStatus.Known.getValue()) {
            TextView textView7 = (TextView) view8;
            if (textView7 != null) {
                C4924a.m10422A(textView7);
            }
            ImageButton imageButton4 = (ImageButton) view9;
            if (imageButton4 != null) {
                C4924a.m10457e0(imageButton4);
            }
            if (imageButton4 != null) {
                List<Integer> list2 = C6716m.f37937a;
                Context context2 = view10.getContext();
                C5207g.m11110e(context2, "itemView.context");
                C6716m.m13323h(context2, iM11568a, imageButton4);
            }
            if (imageButton4 != null) {
                List<Integer> list3 = C6716m.f37937a;
                Context context3 = view10.getContext();
                C5207g.m11110e(context3, "itemView.context");
                C4924a.m10455d0(imageButton4, C6716m.m13333r(ViewsUtilsKt.m10416b(i17, Integer.valueOf(i16)), context3));
            }
            if (imageButton4 != null) {
                imageButton4.setActivated(true);
            }
        } else {
            TextView textView8 = (TextView) view8;
            if (textView8 != null) {
                C4924a.m10457e0(textView8);
            }
            ImageButton imageButton5 = (ImageButton) view9;
            if (imageButton5 != null) {
                C4924a.m10422A(imageButton5);
            }
            if (textView8 != null) {
                List<Integer> list4 = C6716m.f37937a;
                C6716m.m13324i(textView8, iM11568a);
            }
            if (textView8 != null) {
                List<Integer> list5 = C6716m.f37937a;
                Context context4 = view10.getContext();
                C5207g.m11110e(context4, "itemView.context");
                C4924a.m10455d0(textView8, C6716m.m13333r(ViewsUtilsKt.m10416b(i17, Integer.valueOf(i16)), context4));
            }
            if (textView8 != null) {
                textView8.setActivated(true);
            }
        }
        View view11 = c8295h3.f44855e;
        TextView textView9 = c8295h3.f44854d;
        TextView textView10 = c8295h3.f44853c;
        View view12 = c8295h3.f44858h;
        View view13 = c8295h3.f44857g;
        TextView textView11 = c8295h3.f44852b;
        if (textView11 != null) {
            view2 = view9;
            ImageButton imageButton6 = (ImageButton) view13;
            if (imageButton6 != null) {
                view = view13;
                ImageButton imageButton7 = (ImageButton) view12;
                if (imageButton7 != null && textView10 != null && textView9 != null) {
                    view3 = view12;
                    TextView textView12 = (TextView) view11;
                    if (textView12 != null) {
                        List<Integer> list6 = C6716m.f37937a;
                        view11 = view11;
                        Context context5 = view10.getContext();
                        C5207g.m11110e(context5, "itemView.context");
                        aVar3 = aVar3;
                        C6716m.m13323h(context5, cardStatus3.getValue(), imageButton6);
                        Context context6 = view10.getContext();
                        C5207g.m11110e(context6, "itemView.context");
                        C6716m.m13323h(context6, CardStatus.Known.getValue(), imageButton7);
                        Context context7 = view10.getContext();
                        C5207g.m11110e(context7, "itemView.context");
                        C4924a.m10455d0(textView9, C6716m.m13333r(R.attr.yellowWordColor, context7));
                        Context context8 = view10.getContext();
                        C5207g.m11110e(context8, "itemView.context");
                        C4924a.m10455d0(textView12, C6716m.m13333r(R.attr.yellowWordStatus2Color, context8));
                        Context context9 = view10.getContext();
                        C5207g.m11110e(context9, "itemView.context");
                        C4924a.m10455d0(textView11, C6716m.m13333r(R.attr.yellowWordStatus3Color, context9));
                        Context context10 = view10.getContext();
                        C5207g.m11110e(context10, "itemView.context");
                        C4924a.m10455d0(textView10, C6716m.m13333r(R.attr.loadingColor, context10));
                        Context context11 = view10.getContext();
                        C5207g.m11110e(context11, "itemView.context");
                        C4924a.m10455d0(imageButton6, C6716m.m13333r(R.attr.loadingColor, context11));
                        Context context12 = view10.getContext();
                        C5207g.m11110e(context12, "itemView.context");
                        C4924a.m10455d0(imageButton7, C6716m.m13333r(R.attr.greenSelectedTint, context12));
                        if (i17 == CardStatus.New.getValue()) {
                            textView9.setActivated(true);
                            textView12.setActivated(false);
                            textView11.setActivated(false);
                            textView10.setActivated(false);
                            imageButton7.setActivated(false);
                            imageButton6.setActivated(false);
                        } else if (i17 == CardStatus.Recognized.getValue()) {
                            textView12.setActivated(true);
                            textView9.setActivated(false);
                            textView11.setActivated(false);
                            textView10.setActivated(false);
                            imageButton7.setActivated(false);
                            imageButton6.setActivated(false);
                        } else if (i17 == CardStatus.Familiar.getValue()) {
                            textView11.setActivated(true);
                            textView12.setActivated(false);
                            textView9.setActivated(false);
                            textView10.setActivated(false);
                            imageButton7.setActivated(false);
                            imageButton6.setActivated(false);
                        } else {
                            CardStatus cardStatus4 = CardStatus.Learned;
                            if (i17 == cardStatus4.getValue() && i16 == CardExtendedStatus.Known.getValue()) {
                                imageButton7.setActivated(true);
                                textView12.setActivated(false);
                                textView11.setActivated(false);
                                textView9.setActivated(false);
                                textView10.setActivated(false);
                                imageButton6.setActivated(false);
                            } else if (i17 == cardStatus4.getValue()) {
                                textView10.setActivated(true);
                                textView12.setActivated(false);
                                textView11.setActivated(false);
                                textView9.setActivated(false);
                                imageButton7.setActivated(false);
                                imageButton6.setActivated(false);
                            } else if (i17 == cardStatus3.getValue()) {
                                imageButton6.setActivated(true);
                                textView12.setActivated(false);
                                textView11.setActivated(false);
                                textView9.setActivated(false);
                                textView10.setActivated(false);
                                imageButton7.setActivated(false);
                            }
                        }
                    } else {
                        aVar3 = aVar3;
                        view11 = view11;
                    }
                }
                aVar = aVar3;
                ((ConstraintLayout) c8295h3.f44856f).setOnClickListener(new ViewOnClickListenerC10371b(3, abstractC3988b, this, aVar));
                imageButton = (ImageButton) view2;
                if (imageButton != null) {
                    imageButton.setOnClickListener(new ViewOnClickListenerC10380h(abstractC3988b, this, aVar, 1));
                }
                textView = (TextView) view8;
                if (textView != null) {
                    final int i18 = 0;
                    textView.setOnClickListener(new View.OnClickListener(this) { // from class: dj.c

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33219b;

                        {
                            this.f33219b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i18;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33219b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3992f interfaceC3992f = vocabularyAdapter.f26079h;
                                    if (interfaceC3992f != null) {
                                        C7563c c7563c2 = aVar5.f26082a;
                                        String str6 = c7563c2.f41680b;
                                        Integer numValueOf2 = Integer.valueOf(c7563c2.f41682d);
                                        C5207g.m11110e(view14, "it");
                                        interfaceC3992f.mo10017a(str6, c7563c2.f41681c, numValueOf2, view14);
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Learned.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                }
                List<String> list7 = aVar.f26082a.f41685g;
                arrayList = new ArrayList();
                for (Object obj : list7) {
                    if (!C7661i.m15250P2((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                zIsEmpty = arrayList.isEmpty();
                view4 = c8295h3.f44862l;
                if (zIsEmpty) {
                    recyclerView2 = (RecyclerView) view4;
                    if (recyclerView2 != null) {
                        C4924a.m10442U(recyclerView2);
                    }
                } else {
                    recyclerView = (RecyclerView) view4;
                    if (recyclerView == null) {
                        aVar2 = aVar4;
                    } else {
                        aVar2 = aVar4;
                        recyclerView.setLayoutManager(aVar2.f26091w);
                    }
                    if (recyclerView != null) {
                        recyclerView.m4199g(new C8049h(10));
                    }
                    c5810f = aVar2.f26090v;
                    if (recyclerView != null) {
                        recyclerView.setAdapter(c5810f);
                    }
                    c5810f.m4529q(arrayList);
                }
                if (textView9 != null) {
                    i11 = 0;
                    textView9.setOnClickListener(new View.OnClickListener(this) { // from class: dj.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33222b;

                        {
                            this.f33222b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i11;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33222b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.New.getValue());
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e2 != null) {
                                        interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Known.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    i11 = 0;
                }
                textView2 = (TextView) view11;
                if (textView2 != null) {
                    textView2.setOnClickListener(new View.OnClickListener(this) { // from class: dj.e

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33225b;

                        {
                            this.f33225b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i11;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33225b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Recognized.getValue());
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e2 != null) {
                                        interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Ignored.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                }
                if (textView11 != null) {
                    textView11.setOnClickListener(new ViewOnClickListenerC9029m(this, 9, aVar));
                }
                if (textView10 != null) {
                    i12 = 1;
                    textView10.setOnClickListener(new View.OnClickListener(this) { // from class: dj.c

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33219b;

                        {
                            this.f33219b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i12;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33219b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3992f interfaceC3992f = vocabularyAdapter.f26079h;
                                    if (interfaceC3992f != null) {
                                        C7563c c7563c2 = aVar5.f26082a;
                                        String str6 = c7563c2.f41680b;
                                        Integer numValueOf2 = Integer.valueOf(c7563c2.f41682d);
                                        C5207g.m11110e(view14, "it");
                                        interfaceC3992f.mo10017a(str6, c7563c2.f41681c, numValueOf2, view14);
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Learned.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                } else {
                    i12 = 1;
                }
                imageButton2 = (ImageButton) view3;
                if (imageButton2 != null) {
                    imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: dj.d

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33222b;

                        {
                            this.f33222b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i12;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33222b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.New.getValue());
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e2 != null) {
                                        interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Known.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                }
                imageButton3 = (ImageButton) view;
                if (imageButton3 != null) {
                    imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: dj.e

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ VocabularyAdapter f33225b;

                        {
                            this.f33225b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view14) {
                            int i19 = i12;
                            VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                            VocabularyAdapter vocabularyAdapter = this.f33225b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e != null) {
                                        interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Recognized.getValue());
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(vocabularyAdapter, "this$0");
                                    C5207g.m11111f(aVar5, "$item");
                                    VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                                    if (interfaceC3991e2 != null) {
                                        interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Ignored.getValue());
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
            view = view13;
        } else {
            aVar3 = aVar3;
            view = view13;
            view2 = view9;
        }
        view3 = view12;
        aVar = aVar3;
        ((ConstraintLayout) c8295h3.f44856f).setOnClickListener(new ViewOnClickListenerC10371b(3, abstractC3988b, this, aVar));
        imageButton = (ImageButton) view2;
        if (imageButton != null) {
            imageButton.setOnClickListener(new ViewOnClickListenerC10380h(abstractC3988b, this, aVar, 1));
        }
        textView = (TextView) view8;
        if (textView != null) {
            final int i19 = 0;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: dj.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33219b;

                {
                    this.f33219b = this;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i19;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33219b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3992f interfaceC3992f = vocabularyAdapter.f26079h;
                            if (interfaceC3992f != null) {
                                C7563c c7563c2 = aVar5.f26082a;
                                String str6 = c7563c2.f41680b;
                                Integer numValueOf2 = Integer.valueOf(c7563c2.f41682d);
                                C5207g.m11110e(view14, "it");
                                interfaceC3992f.mo10017a(str6, c7563c2.f41681c, numValueOf2, view14);
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Learned.getValue());
                            }
                            break;
                    }
                }
            });
        }
        List<String> list8 = aVar.f26082a.f41685g;
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            if (!C7661i.m15250P2((String) obj)) {
                arrayList.add(obj);
            }
        }
        zIsEmpty = arrayList.isEmpty();
        view4 = c8295h3.f44862l;
        if (zIsEmpty) {
            recyclerView2 = (RecyclerView) view4;
            if (recyclerView2 != null) {
                C4924a.m10442U(recyclerView2);
            }
        } else {
            recyclerView = (RecyclerView) view4;
            if (recyclerView == null) {
                aVar2 = aVar4;
            } else {
                aVar2 = aVar4;
                recyclerView.setLayoutManager(aVar2.f26091w);
            }
            if (recyclerView != null) {
                recyclerView.m4199g(new C8049h(10));
            }
            c5810f = aVar2.f26090v;
            if (recyclerView != null) {
                recyclerView.setAdapter(c5810f);
            }
            c5810f.m4529q(arrayList);
        }
        if (textView9 != null) {
            i11 = 0;
            textView9.setOnClickListener(new View.OnClickListener(this) { // from class: dj.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33222b;

                {
                    this.f33222b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i11;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33222b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.New.getValue());
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                            if (interfaceC3991e2 != null) {
                                interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Known.getValue());
                            }
                            break;
                    }
                }
            });
        } else {
            i11 = 0;
        }
        textView2 = (TextView) view11;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener(this) { // from class: dj.e

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33225b;

                {
                    this.f33225b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i11;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33225b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Recognized.getValue());
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                            if (interfaceC3991e2 != null) {
                                interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Ignored.getValue());
                            }
                            break;
                    }
                }
            });
        }
        if (textView11 != null) {
            textView11.setOnClickListener(new ViewOnClickListenerC9029m(this, 9, aVar));
        }
        if (textView10 != null) {
            i12 = 1;
            textView10.setOnClickListener(new View.OnClickListener(this) { // from class: dj.c

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33219b;

                {
                    this.f33219b = this;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i12;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33219b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3992f interfaceC3992f = vocabularyAdapter.f26079h;
                            if (interfaceC3992f != null) {
                                C7563c c7563c2 = aVar5.f26082a;
                                String str6 = c7563c2.f41680b;
                                Integer numValueOf2 = Integer.valueOf(c7563c2.f41682d);
                                C5207g.m11110e(view14, "it");
                                interfaceC3992f.mo10017a(str6, c7563c2.f41681c, numValueOf2, view14);
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Learned.getValue());
                            }
                            break;
                    }
                }
            });
        } else {
            i12 = 1;
        }
        imageButton2 = (ImageButton) view3;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new View.OnClickListener(this) { // from class: dj.d

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33222b;

                {
                    this.f33222b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i12;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33222b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.New.getValue());
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                            if (interfaceC3991e2 != null) {
                                interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Known.getValue());
                            }
                            break;
                    }
                }
            });
        }
        imageButton3 = (ImageButton) view;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new View.OnClickListener(this) { // from class: dj.e

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ VocabularyAdapter f33225b;

                {
                    this.f33225b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view14) {
                    int i110 = i12;
                    VocabularyAdapter.AbstractC3987a.a aVar5 = aVar;
                    VocabularyAdapter vocabularyAdapter = this.f33225b;
                    switch (i110) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e = vocabularyAdapter.f26080i;
                            if (interfaceC3991e != null) {
                                interfaceC3991e.mo10016a(aVar5.f26082a.f41680b, CardStatus.Recognized.getValue());
                            }
                            break;
                        default:
                            C5207g.m11111f(vocabularyAdapter, "this$0");
                            C5207g.m11111f(aVar5, "$item");
                            VocabularyAdapter.InterfaceC3991e interfaceC3991e2 = vocabularyAdapter.f26080i;
                            if (interfaceC3991e2 != null) {
                                interfaceC3991e2.mo10016a(aVar5.f26082a.f41680b, CardStatus.Ignored.getValue());
                            }
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 bVar;
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == VocabularyListItemType.Content.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_item_vocabulary, recyclerView, false);
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.btnProgressFamiliar);
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnProgressIgnore);
            ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewM849h, R.id.btnProgressKnown);
            TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.btnProgressLearned);
            TextView textView3 = (TextView) C0062b.m298P0(viewM849h, R.id.btnProgressNew);
            TextView textView4 = (TextView) C0062b.m298P0(viewM849h, R.id.btnProgressRecognized);
            Guideline guideline = (Guideline) C0062b.m298P0(viewM849h, R.id.gdMeaning);
            ImageButton imageButton3 = (ImageButton) C0062b.m298P0(viewM849h, R.id.ibStatus);
            LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM849h, R.id.llStatus);
            RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(viewM849h, R.id.rvTags);
            int i11 = R.id.tvMeaning;
            TextView textView5 = (TextView) C0062b.m298P0(viewM849h, R.id.tvMeaning);
            if (textView5 != null) {
                TextView textView6 = (TextView) C0062b.m298P0(viewM849h, R.id.tvStatus);
                i11 = R.id.tvTerm;
                TextView textView7 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTerm);
                if (textView7 != null) {
                    bVar = new AbstractC3988b.a(new C8295h3((ConstraintLayout) viewM849h, textView, imageButton, imageButton2, textView2, textView3, textView4, guideline, imageButton3, linearLayout, recyclerView2, textView5, textView6, textView7));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 != VocabularyListItemType.Search.ordinal()) {
            if (i10 != VocabularyListItemType.Filter.ordinal()) {
                if (i10 != VocabularyListItemType.Empty.ordinal()) {
                    throw new IllegalStateException();
                }
                View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_vocabulary_empty, recyclerView, false);
                int i12 = R.id.tvEmptyDescription;
                TextView textView8 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvEmptyDescription);
                if (textView8 != null) {
                    i12 = R.id.tvEmptyTitle;
                    TextView textView9 = (TextView) C0062b.m298P0(viewM849h2, R.id.tvEmptyTitle);
                    if (textView9 != null) {
                        LinearLayout linearLayout2 = (LinearLayout) viewM849h2;
                        bVar = new AbstractC3988b.b(new C8331n3(linearLayout2, textView8, textView9, linearLayout2));
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(i12)));
            }
            View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_header_home_vocabulary_search_filter, recyclerView, false);
            int i13 = R.id.guideline;
            Guideline guideline2 = (Guideline) C0062b.m298P0(viewM849h3, R.id.guideline);
            if (guideline2 != null) {
                i13 = R.id.spinner_content;
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewM849h3, R.id.spinner_content);
                if (appCompatSpinner != null) {
                    i13 = R.id.tv_sort_by;
                    TextView textView10 = (TextView) C0062b.m298P0(viewM849h3, R.id.tv_sort_by);
                    if (textView10 != null) {
                        i13 = R.id.view_select_collection_type;
                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewM849h3, R.id.view_select_collection_type);
                        if (linearLayout3 != null) {
                            bVar = new AbstractC3988b.c(new C8324m2((ConstraintLayout) viewM849h3, guideline2, appCompatSpinner, textView10, linearLayout3));
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h3.getResources().getResourceName(i13)));
        }
        View viewM849h4 = C0204c.m849h(recyclerView, R.layout.list_header_home_vocabulary_search, recyclerView, false);
        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewM849h4, R.id.et_search);
        if (textInputEditText == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h4.getResources().getResourceName(R.id.et_search)));
        }
        bVar = new AbstractC3988b.d(new C8330n2((TextInputLayout) viewM849h4, textInputEditText));
        return bVar;
    }
}
