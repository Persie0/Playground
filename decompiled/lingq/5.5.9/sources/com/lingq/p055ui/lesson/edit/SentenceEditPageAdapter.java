package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.C0204c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import mo.C7662j;
import p003a2.C0009a;
import p204jj.C6490k;
import p204jj.C6496q;
import p204jj.C6500u;
import p204jj.C6501v;
import p204jj.C6502w;
import p225kk.C6716m;
import ph.C8254a4;
import ph.C8259b3;
import ph.C8265c3;
import ph.C8330n2;
import ph.C8362t2;
import ph.C8383x3;

/* JADX INFO: loaded from: classes2.dex */
public final class SentenceEditPageAdapter extends AbstractC1170u<AbstractC4290a, AbstractC4291b> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC4293d f27965e;

    /* JADX INFO: renamed from: f */
    public final Pattern f27966f;

    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/SentenceEditPageAdapter$ViewType;", "", "(Ljava/lang/String;I)V", "HeaderAll", "Header", "Sentence", "Translation", "Notes", "Audio", "AddTranslation", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    public enum ViewType {
        HeaderAll,
        Header,
        Sentence,
        Translation,
        Notes,
        Audio,
        AddTranslation
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a */
    public static abstract class AbstractC4290a {

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$a */
        public static final class a extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public static final a f27967a = new a();
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$b */
        public static final class b extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public final double f27968a;

            /* JADX INFO: renamed from: b */
            public final double f27969b;

            /* JADX INFO: renamed from: c */
            public final boolean f27970c;

            /* JADX INFO: renamed from: d */
            public final long f27971d;

            public b(double d10, double d11, long j10, boolean z10) {
                this.f27968a = d10;
                this.f27969b = d11;
                this.f27970c = z10;
                this.f27971d = j10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return Double.compare(this.f27968a, bVar.f27968a) == 0 && Double.compare(this.f27969b, bVar.f27969b) == 0 && this.f27970c == bVar.f27970c && this.f27971d == bVar.f27971d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v6 */
            /* JADX WARN: Type inference failed for: r1v7 */
            public final int hashCode() {
                int iM609e = C0141b.m609e(this.f27969b, Double.hashCode(this.f27968a) * 31, 31);
                boolean z10 = this.f27970c;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return Long.hashCode(this.f27971d) + ((iM609e + r10) * 31);
            }

            public final String toString() {
                return "Audio(start=" + this.f27968a + ", end=" + this.f27969b + ", isPlaying=" + this.f27970c + ", audioProgress=" + this.f27971d + ")";
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$c */
        public static final class c extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public final int f27972a;

            public c(int i10) {
                this.f27972a = i10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f27972a == ((c) obj).f27972a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f27972a);
            }

            public final String toString() {
                return C0166e.m768o(new StringBuilder("Header(header="), this.f27972a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$d */
        public static final class d extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public static final d f27973a = new d();
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$e */
        public static final class e extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public final String f27974a;

            public e(String str) {
                this.f27974a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && C5207g.m11106a(this.f27974a, ((e) obj).f27974a);
            }

            public final int hashCode() {
                return this.f27974a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Notes(notes="), this.f27974a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$f */
        public static final class f extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public final String f27975a;

            public f(String str) {
                this.f27975a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof f) && C5207g.m11106a(this.f27975a, ((f) obj).f27975a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f27975a.hashCode();
            }

            public final String toString() {
                return C0009a.m23l(new StringBuilder("Sentence(sentence="), this.f27975a, ")");
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$a$g */
        public static final class g extends AbstractC4290a {

            /* JADX INFO: renamed from: a */
            public final String f27976a;

            /* JADX INFO: renamed from: b */
            public final String f27977b;

            /* JADX INFO: renamed from: c */
            public final boolean f27978c;

            public g(String str, String str2, boolean z10) {
                C5207g.m11111f(str, "language");
                C5207g.m11111f(str2, "sentence");
                this.f27976a = str;
                this.f27977b = str2;
                this.f27978c = z10;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return C5207g.m11106a(this.f27976a, gVar.f27976a) && C5207g.m11106a(this.f27977b, gVar.f27977b) && this.f27978c == gVar.f27978c;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2, types: [int] */
            /* JADX WARN: Type inference failed for: r1v3 */
            /* JADX WARN: Type inference failed for: r1v4 */
            public final int hashCode() {
                int iM758d = C0166e.m758d(this.f27977b, this.f27976a.hashCode() * 31, 31);
                boolean z10 = this.f27978c;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                return iM758d + r10;
            }

            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Translation(language=");
                sb2.append(this.f27976a);
                sb2.append(", sentence=");
                sb2.append(this.f27977b);
                sb2.append(", viewingAll=");
                return C0166e.m769p(sb2, this.f27978c, ")");
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b */
    public static abstract class AbstractC4291b extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$a */
        public static final class a extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8265c3 f27979u;

            /* JADX WARN: Illegal instructions before constructor call */
            public a(C8265c3 c8265c3) {
                RelativeLayout relativeLayout;
                int i10 = c8265c3.f44645a;
                ViewGroup viewGroup = c8265c3.f44646b;
                switch (i10) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        relativeLayout = (RelativeLayout) viewGroup;
                        break;
                    default:
                        relativeLayout = (RelativeLayout) viewGroup;
                        break;
                }
                C5207g.m11110e(relativeLayout, "binding.root");
                super(relativeLayout);
                this.f27979u = c8265c3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$b */
        public static final class b extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8254a4 f27980u;

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8254a4 c8254a4) {
                ConstraintLayout constraintLayout = c8254a4.f44574a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f27980u = c8254a4;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$c */
        public static final class c extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f27981u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8259b3 c8259b3) {
                RelativeLayout relativeLayoutM16400b = c8259b3.m16400b();
                C5207g.m11110e(relativeLayoutM16400b, "binding.root");
                super(relativeLayoutM16400b);
                this.f27981u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$d */
        public static final class d extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8330n2 f27982u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8330n2 c8330n2) {
                TextView textView = (TextView) c8330n2.f45085a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f27982u = c8330n2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$e */
        public static final class e extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8383x3 f27983u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8383x3 c8383x3) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c8383x3.f45468a;
                C5207g.m11110e(constraintLayout, "binding.root");
                super(constraintLayout);
                this.f27983u = c8383x3;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$f */
        public static final class f extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f27984u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8362t2 c8362t2) {
                ConstraintLayout constraintLayoutM16414c = c8362t2.m16414c();
                C5207g.m11110e(constraintLayoutM16414c, "binding.root");
                super(constraintLayoutM16414c);
                this.f27984u = c8362t2;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$b$g */
        public static final class g extends AbstractC4291b {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f27985u;

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8362t2 c8362t2) {
                ConstraintLayout constraintLayoutM16414c = c8362t2.m16414c();
                C5207g.m11110e(constraintLayoutM16414c, "binding.root");
                super(constraintLayoutM16414c);
                this.f27985u = c8362t2;
            }
        }

        public AbstractC4291b(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$c */
    public static final class C4292c extends C1162m.e<AbstractC4290a> {
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
        
            if (dm.C5207g.m11106a(((com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.AbstractC4290a.f) r6).f27975a, ((com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.AbstractC4290a.f) r7).f27975a) != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
        
            if (r6.f27978c == r7.f27978c) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        
            if (dm.C5207g.m11106a(((com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.AbstractC4290a.e) r6).f27974a, ((com.lingq.p055ui.lesson.edit.SentenceEditPageAdapter.AbstractC4290a.e) r7).f27974a) != false) goto L42;
         */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean mo480a(AbstractC4290a abstractC4290a, AbstractC4290a abstractC4290a2) {
            AbstractC4290a abstractC4290a3 = abstractC4290a;
            AbstractC4290a abstractC4290a4 = abstractC4290a2;
            if (abstractC4290a3 instanceof AbstractC4290a.c) {
                if ((abstractC4290a4 instanceof AbstractC4290a.c) && ((AbstractC4290a.c) abstractC4290a3).f27972a == ((AbstractC4290a.c) abstractC4290a4).f27972a) {
                    return true;
                }
                return false;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.d) {
                return abstractC4290a4 instanceof AbstractC4290a.d;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.f) {
                if (abstractC4290a4 instanceof AbstractC4290a.f) {
                }
                return false;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.g) {
                if (abstractC4290a4 instanceof AbstractC4290a.g) {
                    AbstractC4290a.g gVar = (AbstractC4290a.g) abstractC4290a3;
                    AbstractC4290a.g gVar2 = (AbstractC4290a.g) abstractC4290a4;
                    if (C5207g.m11106a(gVar.f27977b, gVar2.f27977b)) {
                    }
                }
                return false;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.e) {
                if (abstractC4290a4 instanceof AbstractC4290a.e) {
                }
                return false;
            }
            if (!(abstractC4290a3 instanceof AbstractC4290a.b)) {
                if (abstractC4290a3 instanceof AbstractC4290a.a) {
                    return abstractC4290a4 instanceof AbstractC4290a.a;
                }
                throw new NoWhenBranchMatchedException();
            }
            if ((abstractC4290a4 instanceof AbstractC4290a.b) && C5207g.m11106a(abstractC4290a3, abstractC4290a4)) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC4290a abstractC4290a, AbstractC4290a abstractC4290a2) {
            AbstractC4290a abstractC4290a3 = abstractC4290a;
            AbstractC4290a abstractC4290a4 = abstractC4290a2;
            if (abstractC4290a3 instanceof AbstractC4290a.c) {
                return abstractC4290a4 instanceof AbstractC4290a.c;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.d) {
                return abstractC4290a4 instanceof AbstractC4290a.d;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.f) {
                return abstractC4290a4 instanceof AbstractC4290a.f;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.g) {
                return (abstractC4290a4 instanceof AbstractC4290a.g) && C5207g.m11106a(((AbstractC4290a.g) abstractC4290a3).f27976a, ((AbstractC4290a.g) abstractC4290a4).f27976a);
            }
            if (abstractC4290a3 instanceof AbstractC4290a.e) {
                return abstractC4290a4 instanceof AbstractC4290a.e;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.b) {
                return abstractC4290a4 instanceof AbstractC4290a.b;
            }
            if (abstractC4290a3 instanceof AbstractC4290a.a) {
                return abstractC4290a4 instanceof AbstractC4290a.a;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.SentenceEditPageAdapter$d */
    public interface InterfaceC4293d {
        /* JADX INFO: renamed from: a */
        void mo10166a(int i10);

        /* JADX INFO: renamed from: b */
        void mo10167b(int i10);

        /* JADX INFO: renamed from: c */
        void mo10168c(String str);

        /* JADX INFO: renamed from: d */
        void mo10169d();

        /* JADX INFO: renamed from: e */
        void mo10170e(String str);

        /* JADX INFO: renamed from: f */
        void mo10171f();

        /* JADX INFO: renamed from: g */
        void mo10172g(int i10);

        /* JADX INFO: renamed from: h */
        void mo10173h(int i10);

        /* JADX INFO: renamed from: i */
        void mo10174i(String str, String str2);

        /* JADX INFO: renamed from: j */
        void mo10175j();

        /* JADX INFO: renamed from: k */
        void mo10176k();

        /* JADX INFO: renamed from: l */
        void mo10177l();
    }

    public SentenceEditPageAdapter(SentenceEditPageFragment.C4295b c4295b) {
        super(new C4292c());
        this.f27965e = c4295b;
        Pattern patternCompile = Pattern.compile("\\d{2}:\\d{2}\\.\\d{2}");
        C5207g.m11110e(patternCompile, "compile(\"\\\\d{2}:\\\\d{2}\\\\.\\\\d{2}\")");
        this.f27966f = patternCompile;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC4290a abstractC4290aM4528p = m4528p(i10);
        if (abstractC4290aM4528p instanceof AbstractC4290a.c) {
            return ViewType.Header.ordinal();
        }
        if (C5207g.m11106a(abstractC4290aM4528p, AbstractC4290a.d.f27973a)) {
            return ViewType.HeaderAll.ordinal();
        }
        if (abstractC4290aM4528p instanceof AbstractC4290a.e) {
            return ViewType.Notes.ordinal();
        }
        if (abstractC4290aM4528p instanceof AbstractC4290a.f) {
            return ViewType.Sentence.ordinal();
        }
        if (abstractC4290aM4528p instanceof AbstractC4290a.g) {
            return ViewType.Translation.ordinal();
        }
        if (abstractC4290aM4528p instanceof AbstractC4290a.b) {
            return ViewType.Audio.ordinal();
        }
        if (C5207g.m11106a(abstractC4290aM4528p, AbstractC4290a.a.f27967a)) {
            return ViewType.AddTranslation.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        final int i11;
        String strM613i;
        final int i12;
        AbstractC4291b abstractC4291b = (AbstractC4291b) abstractC1109b0;
        if (abstractC4291b instanceof AbstractC4291b.d) {
            AbstractC4290a abstractC4290aM4528p = m4528p(i10);
            C5207g.m11109d(abstractC4290aM4528p, "null cannot be cast to non-null type com.lingq.ui.lesson.edit.SentenceEditPageAdapter.AdapterItem.Header");
            AbstractC4291b.d dVar = (AbstractC4291b.d) abstractC4291b;
            ((TextView) dVar.f27982u.f45086b).setText(dVar.f7054a.getContext().getString(((AbstractC4290a.c) abstractC4290aM4528p).f27972a));
        } else {
            boolean z10 = abstractC4291b instanceof AbstractC4291b.e;
            int i13 = 0;
            InterfaceC4293d interfaceC4293d = this.f27965e;
            if (z10) {
                AbstractC4290a abstractC4290aM4528p2 = m4528p(i10);
                C5207g.m11109d(abstractC4290aM4528p2, "null cannot be cast to non-null type com.lingq.ui.lesson.edit.SentenceEditPageAdapter.AdapterItem.Notes");
                String str = ((AbstractC4290a.e) abstractC4290aM4528p2).f27974a;
                C5207g.m11111f(str, "notes");
                C5207g.m11111f(interfaceC4293d, "interaction");
                C8383x3 c8383x3 = ((AbstractC4291b.e) abstractC4291b).f27983u;
                boolean zHasFocus = ((TextInputEditText) c8383x3.f45469b).hasFocus();
                View view = c8383x3.f45469b;
                if (!zHasFocus) {
                    ((TextInputEditText) view).setText(str);
                }
                TextInputEditText textInputEditText = (TextInputEditText) view;
                C5207g.m11110e(textInputEditText, "etNotes");
                textInputEditText.addTextChangedListener(new C6500u(interfaceC4293d, c8383x3));
                textInputEditText.setImeOptions(1);
                textInputEditText.setRawInputType(1);
                textInputEditText.setOnEditorActionListener(new C6490k(c8383x3, 0));
            } else if (abstractC4291b instanceof AbstractC4291b.f) {
                AbstractC4290a abstractC4290aM4528p3 = m4528p(i10);
                C5207g.m11109d(abstractC4290aM4528p3, "null cannot be cast to non-null type com.lingq.ui.lesson.edit.SentenceEditPageAdapter.AdapterItem.Sentence");
                String str2 = ((AbstractC4290a.f) abstractC4290aM4528p3).f27975a;
                C5207g.m11111f(str2, "sentence");
                C5207g.m11111f(interfaceC4293d, "interaction");
                C8362t2 c8362t2 = ((AbstractC4291b.f) abstractC4291b).f27984u;
                boolean zHasFocus2 = ((TextInputEditText) c8362t2.f45287d).hasFocus();
                View view2 = c8362t2.f45287d;
                if (!zHasFocus2) {
                    ((TextInputEditText) view2).setText(str2);
                }
                TextInputEditText textInputEditText2 = (TextInputEditText) view2;
                C5207g.m11110e(textInputEditText2, "etSentence");
                textInputEditText2.addTextChangedListener(new C6501v(interfaceC4293d, c8362t2));
                textInputEditText2.setImeOptions(1);
                textInputEditText2.setRawInputType(1);
                textInputEditText2.setOnEditorActionListener(new C6496q(i13, c8362t2));
            } else if (abstractC4291b instanceof AbstractC4291b.g) {
                AbstractC4290a abstractC4290aM4528p4 = m4528p(i10);
                C5207g.m11109d(abstractC4290aM4528p4, "null cannot be cast to non-null type com.lingq.ui.lesson.edit.SentenceEditPageAdapter.AdapterItem.Translation");
                AbstractC4290a.g gVar = (AbstractC4290a.g) abstractC4290aM4528p4;
                AbstractC4291b.g gVar2 = (AbstractC4291b.g) abstractC4291b;
                String str3 = gVar.f27976a;
                C5207g.m11111f(str3, "language");
                String str4 = gVar.f27977b;
                C5207g.m11111f(str4, "sentence");
                C5207g.m11111f(interfaceC4293d, "interaction");
                C8362t2 c8362t3 = gVar2.f27985u;
                boolean zHasFocus3 = ((TextInputEditText) c8362t3.f45287d).hasFocus();
                View view3 = c8362t3.f45287d;
                if (!zHasFocus3) {
                    TextInputLayout textInputLayout = (TextInputLayout) c8362t3.f45285b;
                    Context context = gVar2.f7054a.getContext();
                    C5207g.m11110e(context, "itemView.context");
                    textInputLayout.setHint(C4924a.m10439R(context, str3));
                    ((TextInputEditText) view3).setText(str4);
                }
                TextInputEditText textInputEditText3 = (TextInputEditText) view3;
                C5207g.m11110e(textInputEditText3, "etSentence");
                textInputEditText3.addTextChangedListener(new C6502w(interfaceC4293d, str3, c8362t3));
                textInputEditText3.setImeOptions(1);
                textInputEditText3.setRawInputType(1);
                textInputEditText3.setOnEditorActionListener(new C6490k(c8362t3, 1));
            } else {
                final int i14 = 3;
                if (!(abstractC4291b instanceof AbstractC4291b.c)) {
                    if (!(abstractC4291b instanceof AbstractC4291b.b)) {
                        if (abstractC4291b instanceof AbstractC4291b.a) {
                            ImageButton imageButton = (ImageButton) ((AbstractC4291b.a) abstractC4291b).f27979u.f44647c;
                            final int i15 = 2;
                            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: jj.n

                                /* JADX INFO: renamed from: b */
                                public final /* synthetic */ SentenceEditPageAdapter f37100b;

                                {
                                    this.f37100b = this;
                                }

                                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    int i16 = i15;
                                    SentenceEditPageAdapter sentenceEditPageAdapter = this.f37100b;
                                    switch (i16) {
                                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                            sentenceEditPageAdapter.f27965e.mo10173h(6000);
                                            break;
                                        case 1:
                                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                            sentenceEditPageAdapter.f27965e.mo10173h(-10);
                                            break;
                                        case 2:
                                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                            sentenceEditPageAdapter.f27965e.mo10169d();
                                            break;
                                        case 3:
                                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                            sentenceEditPageAdapter.f27965e.mo10176k();
                                            break;
                                        default:
                                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                            sentenceEditPageAdapter.f27965e.mo10166a(6000);
                                            break;
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    AbstractC4290a abstractC4290aM4528p5 = m4528p(i10);
                    C5207g.m11109d(abstractC4290aM4528p5, "null cannot be cast to non-null type com.lingq.ui.lesson.edit.SentenceEditPageAdapter.AdapterItem.Audio");
                    AbstractC4290a.b bVar = (AbstractC4290a.b) abstractC4290aM4528p5;
                    final C8254a4 c8254a4 = ((AbstractC4291b.b) abstractC4291b).f27980u;
                    EditText editText = c8254a4.f44591r;
                    Locale locale = Locale.getDefault();
                    double d10 = 3600;
                    double d11 = bVar.f27968a;
                    double d12 = 60;
                    double d13 = 1000;
                    double d14 = d11 * d13;
                    double d15 = 10;
                    double d16 = d14 / d15;
                    double d17 = 100;
                    String str5 = String.format(locale, "%02d:%02d.%02d", Arrays.copyOf(new Object[]{Integer.valueOf((int) ((d11 % d10) / d12)), Integer.valueOf((int) (d11 % d12)), Integer.valueOf((int) (d16 % d17))}, 3));
                    C5207g.m11110e(str5, "format(locale, format, *args)");
                    editText.setText(str5);
                    Locale locale2 = Locale.getDefault();
                    double d18 = bVar.f27969b;
                    String strM613i2 = C0141b.m613i(new Object[]{Integer.valueOf((int) ((d18 % d10) / d12)), Integer.valueOf((int) (d18 % d12)), Integer.valueOf((int) (((d18 * d13) / d15) % d17))}, 3, locale2, "%02d:%02d.%02d", "format(locale, format, *args)");
                    EditText editText2 = c8254a4.f44590q;
                    editText2.setText(strM613i2);
                    boolean z11 = bVar.f27970c;
                    ImageView imageView = c8254a4.f44592s;
                    if (z11) {
                        imageView.setImageResource(R.drawable.ic_player_pause);
                    } else {
                        imageView.setImageResource(R.drawable.ic_player_play);
                    }
                    List<Integer> list = C6716m.f37937a;
                    long j10 = (long) (d14 + bVar.f27971d);
                    if (j10 == 0) {
                        strM613i = "00:00:00";
                        i11 = 2;
                        i12 = 3;
                    } else {
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(j10);
                        long j11 = 60;
                        i11 = 2;
                        strM613i = C0141b.m613i(new Object[]{Long.valueOf((seconds % ((long) 3600)) / j11), Long.valueOf(seconds % j11), Long.valueOf((j10 / ((long) 10)) % ((long) 100))}, 3, Locale.getDefault(), "%02d:%02d.%02d", "format(locale, format, *args)");
                        i12 = 3;
                    }
                    c8254a4.f44593t.setText(strM613i);
                    c8254a4.f44582i.setOnClickListener(new View.OnClickListener(this) { // from class: jj.m

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37098b;

                        {
                            this.f37098b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i16 = i11;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37098b;
                            switch (i16) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(100);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-6000);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10177l();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(100);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44587n.setOnClickListener(new View.OnClickListener(this) { // from class: jj.n

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37100b;

                        {
                            this.f37100b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i16 = i12;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37100b;
                            switch (i16) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(6000);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-10);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10169d();
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10176k();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(6000);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44575b.setOnClickListener(new View.OnClickListener(this) { // from class: jj.o

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37102b;

                        {
                            this.f37102b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i16 = i11;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37102b;
                            switch (i16) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-100);
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10175j();
                                    break;
                            }
                        }
                    });
                    final int i16 = 4;
                    c8254a4.f44583j.setOnClickListener(new View.OnClickListener(this) { // from class: jj.l

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37096b;

                        {
                            this.f37096b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i17 = i16;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37096b;
                            switch (i17) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-100);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-6000);
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10171f();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(10);
                                    break;
                            }
                        }
                    });
                    final int i17 = 3;
                    c8254a4.f44588o.setOnClickListener(new View.OnClickListener(this) { // from class: jj.m

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37098b;

                        {
                            this.f37098b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i18 = i17;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37098b;
                            switch (i18) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(100);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-6000);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10177l();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(100);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44585l.setOnClickListener(new View.OnClickListener(this) { // from class: jj.n

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37100b;

                        {
                            this.f37100b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i18 = i16;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37100b;
                            switch (i18) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(6000);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-10);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10169d();
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10176k();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(6000);
                                    break;
                            }
                        }
                    });
                    final int i18 = 0;
                    c8254a4.f44576c.setOnClickListener(new View.OnClickListener(this) { // from class: jj.l

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37096b;

                        {
                            this.f37096b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i19 = i18;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37096b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-100);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-6000);
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10171f();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(10);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44580g.setOnClickListener(new View.OnClickListener(this) { // from class: jj.m

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37098b;

                        {
                            this.f37098b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i19 = i18;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37098b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(100);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-6000);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10177l();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(100);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44578e.setOnClickListener(new View.OnClickListener(this) { // from class: jj.n

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37100b;

                        {
                            this.f37100b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i19 = i18;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37100b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(6000);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-10);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10169d();
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10176k();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(6000);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44584k.setOnClickListener(new View.OnClickListener(this) { // from class: jj.o

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37102b;

                        {
                            this.f37102b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i19 = i18;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37102b;
                            switch (i19) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-100);
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10175j();
                                    break;
                            }
                        }
                    });
                    final int i19 = 1;
                    c8254a4.f44589p.setOnClickListener(new View.OnClickListener(this) { // from class: jj.l

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37096b;

                        {
                            this.f37096b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i110 = i19;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37096b;
                            switch (i110) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-100);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-6000);
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10171f();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(10);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44586m.setOnClickListener(new View.OnClickListener(this) { // from class: jj.m

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37098b;

                        {
                            this.f37098b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i110 = i19;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37098b;
                            switch (i110) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(100);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-6000);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10177l();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(100);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44577d.setOnClickListener(new View.OnClickListener(this) { // from class: jj.n

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37100b;

                        {
                            this.f37100b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i110 = i19;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37100b;
                            switch (i110) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(6000);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-10);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10169d();
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10176k();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(6000);
                                    break;
                            }
                        }
                    });
                    c8254a4.f44581h.setOnClickListener(new View.OnClickListener(this) { // from class: jj.o

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37102b;

                        {
                            this.f37102b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i110 = i19;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37102b;
                            switch (i110) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-100);
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10175j();
                                    break;
                            }
                        }
                    });
                    final int i20 = 2;
                    c8254a4.f44579f.setOnClickListener(new View.OnClickListener(this) { // from class: jj.l

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ SentenceEditPageAdapter f37096b;

                        {
                            this.f37096b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view4) {
                            int i110 = i20;
                            SentenceEditPageAdapter sentenceEditPageAdapter = this.f37096b;
                            switch (i110) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(10);
                                    break;
                                case 1:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(-100);
                                    break;
                                case 2:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10173h(-6000);
                                    break;
                                case 3:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10171f();
                                    break;
                                default:
                                    C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                    sentenceEditPageAdapter.f27965e.mo10166a(10);
                                    break;
                            }
                        }
                    });
                    EditText editText3 = c8254a4.f44591r;
                    editText3.setImeOptions(6);
                    editText3.setRawInputType(1);
                    editText3.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jj.p
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i21, KeyEvent keyEvent) {
                            C8254a4 c8254a5 = c8254a4;
                            C5207g.m11111f(c8254a5, "$this_with");
                            if (i21 != 6) {
                                return false;
                            }
                            List<Integer> list2 = C6716m.f37937a;
                            C6716m.m13321f(textView.getContext(), textView);
                            c8254a5.f44591r.clearFocus();
                            return true;
                        }
                    });
                    editText3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jj.r
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view4, boolean z12) {
                            C8254a4 c8254a5 = c8254a4;
                            C5207g.m11111f(c8254a5, "$this_with");
                            SentenceEditPageAdapter sentenceEditPageAdapter = this;
                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                            if (z12) {
                                return;
                            }
                            EditText editText4 = c8254a5.f44591r;
                            Editable text = editText4.getText();
                            C5207g.m11110e(text, "etStartTime.text");
                            boolean zM14271b = new Regex(sentenceEditPageAdapter.f27966f).m14271b(text);
                            SentenceEditPageAdapter.InterfaceC4293d interfaceC4293d2 = sentenceEditPageAdapter.f27965e;
                            if (!zM14271b) {
                                Editable text2 = editText4.getText();
                                C5207g.m11110e(text2, "etStartTime.text");
                                StringBuilder sb2 = new StringBuilder();
                                int length = text2.length();
                                for (int i21 = 0; i21 < length; i21++) {
                                    char cCharAt = text2.charAt(i21);
                                    if (Character.isDigit(cCharAt)) {
                                        sb2.append(cCharAt);
                                    }
                                }
                                interfaceC4293d2.mo10167b(Integer.parseInt(sb2.toString()));
                                return;
                            }
                            Editable text3 = editText4.getText();
                            C5207g.m11110e(text3, "etStartTime.text");
                            int i22 = Integer.parseInt(C7662j.m15260E3(text3, C0062b.m411w2(0, 2)).toString());
                            Editable text4 = editText4.getText();
                            C5207g.m11110e(text4, "etStartTime.text");
                            int i23 = Integer.parseInt(C7662j.m15260E3(text4, C0062b.m411w2(3, 5)).toString());
                            Editable text5 = editText4.getText();
                            C5207g.m11110e(text5, "etStartTime.text");
                            interfaceC4293d2.mo10167b((i23 * 100) + (i22 * 60 * 100) + Integer.parseInt(C7662j.m15260E3(text5, C0062b.m411w2(6, 8)).toString()));
                        }
                    });
                    editText2.setImeOptions(6);
                    editText2.setRawInputType(1);
                    editText2.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: jj.s
                        @Override // android.widget.TextView.OnEditorActionListener
                        public final boolean onEditorAction(TextView textView, int i21, KeyEvent keyEvent) {
                            C8254a4 c8254a5 = c8254a4;
                            C5207g.m11111f(c8254a5, "$this_with");
                            if (i21 != 6) {
                                return false;
                            }
                            List<Integer> list2 = C6716m.f37937a;
                            C6716m.m13321f(textView.getContext(), textView);
                            c8254a5.f44590q.clearFocus();
                            return true;
                        }
                    });
                    editText2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: jj.t
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view4, boolean z12) {
                            C8254a4 c8254a5 = c8254a4;
                            C5207g.m11111f(c8254a5, "$this_with");
                            SentenceEditPageAdapter sentenceEditPageAdapter = this;
                            C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                            if (z12) {
                                return;
                            }
                            EditText editText4 = c8254a5.f44590q;
                            Editable text = editText4.getText();
                            C5207g.m11110e(text, "etEndTime.text");
                            boolean zM14271b = new Regex(sentenceEditPageAdapter.f27966f).m14271b(text);
                            SentenceEditPageAdapter.InterfaceC4293d interfaceC4293d2 = sentenceEditPageAdapter.f27965e;
                            if (!zM14271b) {
                                Editable text2 = editText4.getText();
                                C5207g.m11110e(text2, "etEndTime.text");
                                StringBuilder sb2 = new StringBuilder();
                                int length = text2.length();
                                for (int i21 = 0; i21 < length; i21++) {
                                    char cCharAt = text2.charAt(i21);
                                    if (Character.isDigit(cCharAt)) {
                                        sb2.append(cCharAt);
                                    }
                                }
                                interfaceC4293d2.mo10172g(Integer.parseInt(sb2.toString()));
                                return;
                            }
                            Editable text3 = editText4.getText();
                            C5207g.m11110e(text3, "etEndTime.text");
                            int i22 = Integer.parseInt(C7662j.m15260E3(text3, C0062b.m411w2(0, 2)).toString());
                            Editable text4 = editText4.getText();
                            C5207g.m11110e(text4, "etEndTime.text");
                            int i23 = Integer.parseInt(C7662j.m15260E3(text4, C0062b.m411w2(3, 5)).toString());
                            Editable text5 = editText4.getText();
                            C5207g.m11110e(text5, "etEndTime.text");
                            interfaceC4293d2.mo10172g((i23 * 100) + (i22 * 60 * 100) + Integer.parseInt(C7662j.m15260E3(text5, C0062b.m411w2(6, 8)).toString()));
                        }
                    });
                    return;
                }
                ((TextView) ((AbstractC4291b.c) abstractC4291b).f27981u.f44617b).setOnClickListener(new View.OnClickListener(this) { // from class: jj.l

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ SentenceEditPageAdapter f37096b;

                    {
                        this.f37096b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i110 = i14;
                        SentenceEditPageAdapter sentenceEditPageAdapter = this.f37096b;
                        switch (i110) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                sentenceEditPageAdapter.f27965e.mo10173h(10);
                                break;
                            case 1:
                                C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                sentenceEditPageAdapter.f27965e.mo10166a(-100);
                                break;
                            case 2:
                                C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                sentenceEditPageAdapter.f27965e.mo10173h(-6000);
                                break;
                            case 3:
                                C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                sentenceEditPageAdapter.f27965e.mo10171f();
                                break;
                            default:
                                C5207g.m11111f(sentenceEditPageAdapter, "this$0");
                                sentenceEditPageAdapter.f27965e.mo10166a(10);
                                break;
                        }
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        C5207g.m11111f(recyclerView, "parent");
        if (i10 == ViewType.Sentence.ordinal()) {
            return new AbstractC4291b.f(C8362t2.m16411d(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 == ViewType.Translation.ordinal()) {
            return new AbstractC4291b.g(C8362t2.m16411d(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 == ViewType.Header.ordinal()) {
            return new AbstractC4291b.d(C8330n2.m16407b(LayoutInflater.from(recyclerView.getContext()), recyclerView));
        }
        if (i10 == ViewType.HeaderAll.ordinal()) {
            View viewM849h = C0204c.m849h(recyclerView, R.layout.list_header_sentence_edit_view_all, recyclerView, false);
            int i11 = R.id.tvAll;
            TextView textView = (TextView) C0062b.m298P0(viewM849h, R.id.tvAll);
            if (textView != null) {
                i11 = R.id.tvTitle;
                TextView textView2 = (TextView) C0062b.m298P0(viewM849h, R.id.tvTitle);
                if (textView2 != null) {
                    return new AbstractC4291b.c(new C8259b3((RelativeLayout) viewM849h, textView, textView2, 0));
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h.getResources().getResourceName(i11)));
        }
        if (i10 == ViewType.Notes.ordinal()) {
            View viewM849h2 = C0204c.m849h(recyclerView, R.layout.list_item_sentence_edit_notes, recyclerView, false);
            TextInputEditText textInputEditText = (TextInputEditText) C0062b.m298P0(viewM849h2, R.id.etNotes);
            if (textInputEditText != null) {
                return new AbstractC4291b.e(new C8383x3((ConstraintLayout) viewM849h2, textInputEditText));
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewM849h2.getResources().getResourceName(R.id.etNotes)));
        }
        if (i10 != ViewType.Audio.ordinal()) {
            if (i10 != ViewType.AddTranslation.ordinal()) {
                throw new IllegalStateException();
            }
            View viewM849h3 = C0204c.m849h(recyclerView, R.layout.list_item_sentence_edit_add, recyclerView, false);
            ImageButton imageButton = (ImageButton) C0062b.m298P0(viewM849h3, R.id.btnAdd);
            if (imageButton == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewM849h3.getResources().getResourceName(R.id.btnAdd)));
            }
            RelativeLayout relativeLayout = (RelativeLayout) viewM849h3;
            return new AbstractC4291b.a(new C8265c3(relativeLayout, imageButton, relativeLayout, 1));
        }
        View viewM849h4 = C0204c.m849h(recyclerView, R.layout.list_item_sentence_edit_audio, recyclerView, false);
        int i12 = R.id.btnCopyPrevious;
        LinearLayout linearLayout = (LinearLayout) C0062b.m298P0(viewM849h4, R.id.btnCopyPrevious);
        if (linearLayout != null) {
            i12 = R.id.btnEndCentsAdd;
            ImageButton imageButton2 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndCentsAdd);
            if (imageButton2 != null) {
                i12 = R.id.btnEndCentsSub;
                ImageButton imageButton3 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndCentsSub);
                if (imageButton3 != null) {
                    i12 = R.id.btnEndMinutesAdd;
                    ImageButton imageButton4 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndMinutesAdd);
                    if (imageButton4 != null) {
                        i12 = R.id.btnEndMinutesSub;
                        ImageButton imageButton5 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndMinutesSub);
                        if (imageButton5 != null) {
                            i12 = R.id.btnEndSecondsAdd;
                            ImageButton imageButton6 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndSecondsAdd);
                            if (imageButton6 != null) {
                                i12 = R.id.btnEndSecondsSub;
                                ImageButton imageButton7 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnEndSecondsSub);
                                if (imageButton7 != null) {
                                    i12 = R.id.btnPlay;
                                    LinearLayout linearLayout2 = (LinearLayout) C0062b.m298P0(viewM849h4, R.id.btnPlay);
                                    if (linearLayout2 != null) {
                                        i12 = R.id.btnStartCentsAdd;
                                        ImageButton imageButton8 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartCentsAdd);
                                        if (imageButton8 != null) {
                                            i12 = R.id.btnStartCentsSub;
                                            ImageButton imageButton9 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartCentsSub);
                                            if (imageButton9 != null) {
                                                i12 = R.id.btnStartMinutesAdd;
                                                ImageButton imageButton10 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartMinutesAdd);
                                                if (imageButton10 != null) {
                                                    i12 = R.id.btnStartMinutesSub;
                                                    ImageButton imageButton11 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartMinutesSub);
                                                    if (imageButton11 != null) {
                                                        i12 = R.id.btnStartPlusThree;
                                                        LinearLayout linearLayout3 = (LinearLayout) C0062b.m298P0(viewM849h4, R.id.btnStartPlusThree);
                                                        if (linearLayout3 != null) {
                                                            i12 = R.id.btnStartSecondsAdd;
                                                            ImageButton imageButton12 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartSecondsAdd);
                                                            if (imageButton12 != null) {
                                                                i12 = R.id.btnStartSecondsSub;
                                                                ImageButton imageButton13 = (ImageButton) C0062b.m298P0(viewM849h4, R.id.btnStartSecondsSub);
                                                                if (imageButton13 != null) {
                                                                    i12 = R.id.etEndTime;
                                                                    EditText editText = (EditText) C0062b.m298P0(viewM849h4, R.id.etEndTime);
                                                                    if (editText != null) {
                                                                        i12 = R.id.etStartTime;
                                                                        EditText editText2 = (EditText) C0062b.m298P0(viewM849h4, R.id.etStartTime);
                                                                        if (editText2 != null) {
                                                                            i12 = R.id.ivPlay;
                                                                            ImageView imageView = (ImageView) C0062b.m298P0(viewM849h4, R.id.ivPlay);
                                                                            if (imageView != null) {
                                                                                i12 = R.id.tvTimestamp;
                                                                                TextView textView3 = (TextView) C0062b.m298P0(viewM849h4, R.id.tvTimestamp);
                                                                                if (textView3 != null) {
                                                                                    i12 = R.id.viewEndAdd;
                                                                                    if (((LinearLayout) C0062b.m298P0(viewM849h4, R.id.viewEndAdd)) != null) {
                                                                                        i12 = R.id.viewEndSub;
                                                                                        if (((LinearLayout) C0062b.m298P0(viewM849h4, R.id.viewEndSub)) != null) {
                                                                                            i12 = R.id.viewStartAdd;
                                                                                            if (((LinearLayout) C0062b.m298P0(viewM849h4, R.id.viewStartAdd)) != null) {
                                                                                                i12 = R.id.viewStartSub;
                                                                                                if (((LinearLayout) C0062b.m298P0(viewM849h4, R.id.viewStartSub)) != null) {
                                                                                                    return new AbstractC4291b.b(new C8254a4((ConstraintLayout) viewM849h4, linearLayout, imageButton2, imageButton3, imageButton4, imageButton5, imageButton6, imageButton7, linearLayout2, imageButton8, imageButton9, imageButton10, imageButton11, linearLayout3, imageButton12, imageButton13, editText, editText2, imageView, textView3));
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewM849h4.getResources().getResourceName(i12)));
    }
}
