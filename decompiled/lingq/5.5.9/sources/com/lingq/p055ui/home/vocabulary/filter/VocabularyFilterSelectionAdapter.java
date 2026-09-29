package com.lingq.p055ui.home.vocabulary.filter;

import ae.C0062b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.linguist.R;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import p003a2.C0009a;
import p278nh.C7785l;
import ph.C8331n3;
import ph.C8387y2;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
public final class VocabularyFilterSelectionAdapter extends AbstractC1170u<AbstractC4037a, AbstractC4038b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC4040d f26375e;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/home/vocabulary/filter/VocabularyFilterSelectionAdapter$VocabularyFilterListItemType;", "", "(Ljava/lang/String;I)V", "Content", "Search", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum VocabularyFilterListItemType {
        Content,
        Search
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$a */
    public static abstract class AbstractC4037a {

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$a$a */
        public static final class a extends AbstractC4037a {

            /* JADX INFO: renamed from: a */
            public final C7785l f26376a;

            public a(C7785l c7785l) {
                C5207g.m11111f(c7785l, "selectionItem");
                this.f26376a = c7785l;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C5207g.m11106a(this.f26376a, ((a) obj).f26376a);
            }

            public final int hashCode() {
                return this.f26376a.hashCode();
            }

            public final String toString() {
                return "Content(selectionItem=" + this.f26376a + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$a$b */
        public static final class b extends AbstractC4037a {

            /* JADX INFO: renamed from: a */
            public final String f26377a;

            public b(String str) {
                C5207g.m11111f(str, "query");
                this.f26377a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C5207g.m11106a(this.f26377a, ((b) obj).f26377a);
            }

            public final int hashCode() {
                return this.f26377a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Search(query="), this.f26377a, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$b */
    public static abstract class AbstractC4038b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$b$a */
        public static final class a extends AbstractC4038b {

            /* JADX INFO: renamed from: u */
            public final C8387y2 f26378u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8387y2 c8387y2) {
                TextInputLayout textInputLayout = (TextInputLayout) c8387y2.f45479a;
                C5207g.m11110e(textInputLayout, "binding.root");
                super(textInputLayout);
                this.f26378u = c8387y2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$b$b */
        public static final class b extends AbstractC4038b {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f26379u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8331n3 c8331n3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8331n3.f45087a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f26379u = c8331n3;
            }
        }

        public AbstractC4038b(ViewGroup viewGroup) {
            super(viewGroup);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$c */
    public static final class C4039c extends C1162m.e<AbstractC4037a> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC4037a abstractC4037a, AbstractC4037a abstractC4037a2) {
            AbstractC4037a abstractC4037a3 = abstractC4037a;
            AbstractC4037a abstractC4037a4 = abstractC4037a2;
            return !((abstractC4037a3 instanceof AbstractC4037a.a) && (abstractC4037a4 instanceof AbstractC4037a.a)) ? !((abstractC4037a3 instanceof AbstractC4037a.b) && (abstractC4037a4 instanceof AbstractC4037a.b)) : ((AbstractC4037a.a) abstractC4037a3).f26376a.f42736c != ((AbstractC4037a.a) abstractC4037a4).f26376a.f42736c;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC4037a abstractC4037a, AbstractC4037a abstractC4037a2) {
            AbstractC4037a abstractC4037a3 = abstractC4037a;
            AbstractC4037a abstractC4037a4 = abstractC4037a2;
            if ((abstractC4037a3 instanceof AbstractC4037a.a) && (abstractC4037a4 instanceof AbstractC4037a.a)) {
                return C5207g.m11106a(((AbstractC4037a.a) abstractC4037a3).f26376a.f42734a, ((AbstractC4037a.a) abstractC4037a4).f26376a.f42734a);
            }
            return (abstractC4037a3 instanceof AbstractC4037a.b) && (abstractC4037a4 instanceof AbstractC4037a.b);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter$d */
    public interface InterfaceC4040d {
        /* JADX INFO: renamed from: a */
        void mo10068a(String str);

        /* JADX INFO: renamed from: b */
        void mo10069b(String str);
    }

    public VocabularyFilterSelectionAdapter(InterfaceC4040d interfaceC4040d) {
        super(new C4039c());
        this.f26375e = interfaceC4040d;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC4037a abstractC4037aM4528p = m4528p(i10);
        if (abstractC4037aM4528p instanceof AbstractC4037a.a) {
            return VocabularyFilterListItemType.Content.ordinal();
        }
        if (abstractC4037aM4528p instanceof AbstractC4037a.b) {
            return VocabularyFilterListItemType.Search.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        AbstractC4038b abstractC4038b = (AbstractC4038b) abstractC1109b0;
        if (!(abstractC4038b instanceof AbstractC4038b.b)) {
            if (abstractC4038b instanceof AbstractC4038b.a) {
                AbstractC4037a abstractC4037aM4528p = m4528p(i10);
                C5207g.m11109d(abstractC4037aM4528p, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.AdapterItem.Search");
                String str = ((AbstractC4037a.b) abstractC4037aM4528p).f26377a;
                C5207g.m11111f(str, "query");
                C8387y2 c8387y2 = ((AbstractC4038b.a) abstractC4038b).f26378u;
                ((TextInputEditText) c8387y2.f45480b).setText(str);
                ((TextInputEditText) c8387y2.f45480b).setOnEditorActionListener(new C4083e(this));
                return;
            }
            return;
        }
        AbstractC4037a abstractC4037aM4528p2 = m4528p(i10);
        C5207g.m11109d(abstractC4037aM4528p2, "null cannot be cast to non-null type com.lingq.ui.home.vocabulary.filter.VocabularyFilterSelectionAdapter.AdapterItem.Content");
        AbstractC4037a.a aVar = (AbstractC4037a.a) abstractC4037aM4528p2;
        AbstractC4038b.b bVar = (AbstractC4038b.b) abstractC4038b;
        C7785l c7785l = aVar.f26376a;
        C5207g.m11111f(c7785l, "selectionItem");
        C8331n3 c8331n3 = bVar.f26379u;
        ImageView imageView = (ImageView) c8331n3.f45089c;
        C5207g.m11110e(imageView, "isSelected");
        imageView.setVisibility(Boolean.valueOf(c7785l.f42736c).booleanValue() ? 0 : 4);
        Integer num = c7785l.f42734a;
        View view = c8331n3.f45090d;
        if (num != null) {
            ((TextView) view).setText(bVar.f7054a.getContext().getString(num.intValue()));
        } else {
            ((TextView) view).setText(c7785l.f42735b);
        }
        ((ConstraintLayout) c8331n3.f45088b).setOnClickListener(new ViewOnClickListenerC9734i(this, 8, aVar));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == VocabularyFilterListItemType.Content.ordinal()) {
            return new AbstractC4038b.b(C8331n3.m16408a(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 != VocabularyFilterListItemType.Search.ordinal()) {
            throw new IllegalStateException();
        }
        View viewM849h = C0204c.m849h(recyclerView, R.layout.list_vocabulary_tags_search, recyclerView, false);
        TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewM849h, R.id.et_search);
        if (textInputEditText != null) {
            return new AbstractC4038b.a(new C8387y2((TextInputLayout) viewM849h, textInputEditText));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(R.id.et_search)));
    }
}
