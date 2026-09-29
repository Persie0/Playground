package p487xi;

import ae.C0062b;
import android.content.Context;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.recyclerview.widget.AbstractC1153g0;
import androidx.recyclerview.widget.AbstractC1170u;
import androidx.recyclerview.widget.C1143b0;
import androidx.recyclerview.widget.C1162m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.commons.p053ui.StatsItemType;
import com.lingq.commons.p053ui.views.CurrentDayStreakView;
import com.lingq.commons.p053ui.views.LineGraph;
import com.lingq.commons.p053ui.views.ScrollingPagerIndicator;
import com.lingq.commons.p053ui.views.StreakActivityLevelView;
import com.lingq.commons.p053ui.views.StreakView;
import com.lingq.p055ui.lesson.stats.LessonCompleteFragment$onViewCreated$lessonStatsAdapter$2;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.language.LanguageProgressMetric;
import com.lingq.shared.uimodel.language.LanguageProgressPeriod;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.util.C4924a;
import com.linguist.R;
import dk.C5196a;
import dk.C5197b;
import dk.C5198c;
import dk.C5199d;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import mo.C7661i;
import ni.C7793a;
import p003a2.C0009a;
import p024b3.C1299f;
import p199jd.ViewOnClickListenerC6464i;
import p225kk.C6716m;
import p254m2.C7472a;
import p278nh.AbstractC7791r;
import p278nh.C7779f;
import p278nh.C7784k;
import p278nh.InterfaceC7774a;
import p278nh.InterfaceC7775b;
import p278nh.InterfaceC7792s;
import p324pj.C8398d;
import ph.C8259b3;
import ph.C8265c3;
import ph.C8266c4;
import ph.C8271d3;
import ph.C8289g3;
import ph.C8290g4;
import ph.C8331n3;
import ph.C8337o3;
import ph.C8362t2;
import ph.C8367u2;
import ph.C8372v2;
import ph.C8378w3;
import ph.C8382x2;
import tl.C9325m;

/* JADX INFO: renamed from: xi.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C10201i extends AbstractC1170u<AbstractC7791r, a> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC7792s f51574e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7775b f51575f;

    /* JADX INFO: renamed from: xi.i$a */
    public static abstract class a extends RecyclerView.AbstractC1109b0 {

        /* JADX INFO: renamed from: xi.i$a$a, reason: collision with other inner class name */
        public static final class C10685a extends a {

            /* JADX INFO: renamed from: u */
            public final C8378w3 f51576u;

            /* JADX WARN: Illegal instructions before constructor call */
            public C10685a(C8378w3 c8378w3) {
                LinearLayout linearLayout = c8378w3.f45445a;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f51576u = c8378w3;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$b */
        public static final class b extends a {

            /* JADX INFO: renamed from: u */
            public final C8331n3 f51577u;

            /* JADX INFO: renamed from: v */
            public final C5199d f51578v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f51579w;

            /* JADX INFO: renamed from: xi.i$a$b$a, reason: collision with other inner class name */
            public static final class C10686a implements InterfaceC7774a<Pair<? extends ChallengeDetail, ? extends Boolean>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7792s f51580a;

                public C10686a(InterfaceC7792s interfaceC7792s) {
                    this.f51580a = interfaceC7792s;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p278nh.InterfaceC7774a
                /* JADX INFO: renamed from: a */
                public final void mo9795a(Pair<? extends ChallengeDetail, ? extends Boolean> pair) {
                    Pair<? extends ChallengeDetail, ? extends Boolean> pair2 = pair;
                    C5207g.m11111f(pair2, "it");
                    this.f51580a.mo9910b((ChallengeDetail) pair2.f38012a, ((Boolean) pair2.f38013b).booleanValue());
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public b(C8331n3 c8331n3, InterfaceC7792s interfaceC7792s) {
                C5207g.m11111f(interfaceC7792s, "listener");
                MaterialCardView materialCardView = (MaterialCardView) c8331n3.f45087a;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51577u = c8331n3;
                this.f51578v = new C5199d(new C10686a(interfaceC7792s));
                materialCardView.getContext();
                this.f51579w = new LinearLayoutManager(1);
            }
        }

        /* JADX INFO: renamed from: xi.i$a$c */
        public static final class c extends a {

            /* JADX INFO: renamed from: u */
            public final C8266c4 f51581u;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(C8266c4 c8266c4) {
                MaterialCardView materialCardView = (MaterialCardView) c8266c4.f44650b;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51581u = c8266c4;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$d */
        public static final class d extends a {

            /* JADX INFO: renamed from: u */
            public final C8372v2 f51582u;

            /* JADX WARN: Illegal instructions before constructor call */
            public d(C8372v2 c8372v2) {
                MaterialCardView materialCardView = (MaterialCardView) c8372v2.f45406b;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51582u = c8372v2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$e */
        public static final class e extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f51583u;

            /* JADX WARN: Illegal instructions before constructor call */
            public e(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f51583u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$f */
        public static final class f extends a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f51584u;

            /* JADX WARN: Illegal instructions before constructor call */
            public f(C8259b3 c8259b3) {
                RelativeLayout relativeLayoutM16400b = c8259b3.m16400b();
                C5207g.m11110e(relativeLayoutM16400b, "binding.root");
                super(relativeLayoutM16400b);
                this.f51584u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$g */
        public static final class g extends a {

            /* JADX INFO: renamed from: u */
            public final C8289g3 f51585u;

            /* JADX INFO: renamed from: v */
            public final C5197b f51586v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f51587w;

            /* JADX INFO: renamed from: xi.i$a$g$a, reason: collision with other inner class name */
            public static final class C10687a implements InterfaceC7774a<C5196a> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7792s f51588a;

                public C10687a(InterfaceC7792s interfaceC7792s) {
                    this.f51588a = interfaceC7792s;
                }

                @Override // p278nh.InterfaceC7774a
                /* JADX INFO: renamed from: a */
                public final void mo9795a(C5196a c5196a) {
                    C5196a c5196a2 = c5196a;
                    C5207g.m11111f(c5196a2, "it");
                    this.f51588a.mo9915g(c5196a2.f33238a, c5196a2.f33243f, c5196a2.f33239b);
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public g(C8289g3 c8289g3, InterfaceC7792s interfaceC7792s) {
                C5207g.m11111f(interfaceC7792s, "listener");
                MaterialCardView materialCardView = c8289g3.f44817a;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51585u = c8289g3;
                this.f51586v = new C5197b(new C10687a(interfaceC7792s));
                materialCardView.getContext();
                this.f51587w = new LinearLayoutManager(1);
            }
        }

        /* JADX INFO: renamed from: xi.i$a$h */
        public static final class h extends a {

            /* JADX INFO: renamed from: u */
            public final C8382x2 f51589u;

            /* JADX INFO: renamed from: v */
            public final C5198c f51590v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f51591w;

            /* JADX WARN: Illegal instructions before constructor call */
            public h(C8382x2 c8382x2) {
                RelativeLayout relativeLayoutM16418a = c8382x2.m16418a();
                C5207g.m11110e(relativeLayoutM16418a, "binding.root");
                super(relativeLayoutM16418a);
                this.f51589u = c8382x2;
                this.f51590v = new C5198c();
                c8382x2.m16418a().getContext();
                this.f51591w = new LinearLayoutManager(0);
            }
        }

        /* JADX INFO: renamed from: xi.i$a$i */
        public static final class i extends a {

            /* JADX INFO: renamed from: u */
            public final C8362t2 f51592u;

            /* JADX INFO: renamed from: v */
            public final C8398d f51593v;

            /* JADX INFO: renamed from: w */
            public final LinearLayoutManager f51594w;

            /* JADX INFO: renamed from: xi.i$a$i$a, reason: collision with other inner class name */
            public static final class C10688a implements InterfaceC7774a<Pair<? extends String, ? extends Integer>> {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7792s f51595a;

                public C10688a(InterfaceC7792s interfaceC7792s) {
                    this.f51595a = interfaceC7792s;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p278nh.InterfaceC7774a
                /* JADX INFO: renamed from: a */
                public final void mo9795a(Pair<? extends String, ? extends Integer> pair) {
                    Pair<? extends String, ? extends Integer> pair2 = pair;
                    C5207g.m11111f(pair2, "it");
                    this.f51595a.mo9912d((String) pair2.f38012a, ((Number) pair2.f38013b).intValue());
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public i(C8362t2 c8362t2, InterfaceC7792s interfaceC7792s) {
                C5207g.m11111f(interfaceC7792s, "listener");
                MaterialCardView materialCardView = (MaterialCardView) c8362t2.f45285b;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51592u = c8362t2;
                this.f51593v = new C8398d(new C10688a(interfaceC7792s));
                materialCardView.getContext();
                this.f51594w = new LinearLayoutManager(1);
            }
        }

        /* JADX INFO: renamed from: xi.i$a$j */
        public static final class j extends a {

            /* JADX INFO: renamed from: u */
            public final C8259b3 f51596u;

            /* JADX WARN: Illegal instructions before constructor call */
            public j(C8259b3 c8259b3) {
                RelativeLayout relativeLayoutM16400b = c8259b3.m16400b();
                C5207g.m11110e(relativeLayoutM16400b, "binding.root");
                super(relativeLayoutM16400b);
                this.f51596u = c8259b3;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$k */
        public static final class k extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f51597u;

            /* JADX WARN: Illegal instructions before constructor call */
            public k(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f51597u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$l */
        public static final class l extends a {

            /* JADX INFO: renamed from: u */
            public final C8265c3 f51598u;

            /* JADX WARN: Illegal instructions before constructor call */
            public l(C8265c3 c8265c3) {
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
                this.f51598u = c8265c3;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$m */
        public static final class m extends a {

            /* JADX INFO: renamed from: u */
            public final C8372v2 f51599u;

            /* JADX WARN: Illegal instructions before constructor call */
            public m(C8372v2 c8372v2) {
                RelativeLayout relativeLayoutM16417a = c8372v2.m16417a();
                C5207g.m11110e(relativeLayoutM16417a, "binding.root");
                super(relativeLayoutM16417a);
                this.f51599u = c8372v2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$n */
        public static final class n extends a {

            /* JADX INFO: renamed from: u */
            public final C8367u2 f51600u;

            /* JADX WARN: Illegal instructions before constructor call */
            public n(C8367u2 c8367u2) {
                TextView textView = c8367u2.f45315a;
                C5207g.m11110e(textView, "binding.root");
                super(textView);
                this.f51600u = c8367u2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$o */
        public static final class o extends a {

            /* JADX INFO: renamed from: u */
            public final C8372v2 f51601u;

            /* JADX WARN: Illegal instructions before constructor call */
            public o(C8372v2 c8372v2) {
                LinearLayout linearLayout = (LinearLayout) c8372v2.f45406b;
                C5207g.m11110e(linearLayout, "binding.root");
                super(linearLayout);
                this.f51601u = c8372v2;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$p */
        public static final class p extends a {

            /* JADX INFO: renamed from: u */
            public final C8337o3 f51602u;

            /* JADX WARN: Illegal instructions before constructor call */
            public p(C8337o3 c8337o3) {
                MaterialCardView materialCardView = c8337o3.f45112a;
                C5207g.m11110e(materialCardView, "binding.root");
                super(materialCardView);
                this.f51602u = c8337o3;
            }
        }

        /* JADX INFO: renamed from: xi.i$a$q */
        public static final class q extends a {

            /* JADX INFO: renamed from: u */
            public final C8271d3 f51603u;

            /* JADX WARN: Illegal instructions before constructor call */
            public q(C8271d3 c8271d3) {
                ConstraintLayout constraintLayoutM16401a = c8271d3.m16401a();
                C5207g.m11110e(constraintLayoutM16401a, "binding.root");
                super(constraintLayoutM16401a);
                this.f51603u = c8271d3;
            }
        }

        public a(View view) {
            super(view);
        }
    }

    /* JADX INFO: renamed from: xi.i$b */
    public static final class b extends C1162m.e<AbstractC7791r> {
        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: a */
        public final boolean mo480a(AbstractC7791r abstractC7791r, AbstractC7791r abstractC7791r2) {
            AbstractC7791r abstractC7791r3 = abstractC7791r;
            AbstractC7791r abstractC7791r4 = abstractC7791r2;
            if (!(abstractC7791r3 instanceof AbstractC7791r.l) || !(abstractC7791r4 instanceof AbstractC7791r.l)) {
                if ((abstractC7791r3 instanceof AbstractC7791r.e) && (abstractC7791r4 instanceof AbstractC7791r.e)) {
                    return C5207g.m11106a(((AbstractC7791r.e) abstractC7791r3).f42830a, ((AbstractC7791r.e) abstractC7791r4).f42830a);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.k) && (abstractC7791r4 instanceof AbstractC7791r.k)) {
                    return C5207g.m11106a(((AbstractC7791r.k) abstractC7791r3).f42843a, ((AbstractC7791r.k) abstractC7791r4).f42843a);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.j) && (abstractC7791r4 instanceof AbstractC7791r.j)) {
                    AbstractC7791r.j jVar = (AbstractC7791r.j) abstractC7791r3;
                    AbstractC7791r.j jVar2 = (AbstractC7791r.j) abstractC7791r4;
                    if (C5207g.m11106a(jVar.f42840b, jVar2.f42840b) && jVar.f42839a == jVar2.f42839a) {
                    }
                    return false;
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.h) && (abstractC7791r4 instanceof AbstractC7791r.h)) {
                    return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.f) && (abstractC7791r4 instanceof AbstractC7791r.f)) {
                    return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.g) && (abstractC7791r4 instanceof AbstractC7791r.g)) {
                    return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.i) && (abstractC7791r4 instanceof AbstractC7791r.i)) {
                    return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.a) && (abstractC7791r4 instanceof AbstractC7791r.a)) {
                    return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                }
                if ((abstractC7791r3 instanceof AbstractC7791r.n) && (abstractC7791r4 instanceof AbstractC7791r.n)) {
                    if (((AbstractC7791r.n) abstractC7791r3).f42852a == ((AbstractC7791r.n) abstractC7791r4).f42852a) {
                    }
                } else {
                    if ((abstractC7791r3 instanceof AbstractC7791r.b) && (abstractC7791r4 instanceof AbstractC7791r.b)) {
                        return C5207g.m11106a(((AbstractC7791r.b) abstractC7791r3).f42825a, ((AbstractC7791r.b) abstractC7791r4).f42825a);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.d) && (abstractC7791r4 instanceof AbstractC7791r.d)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.o) && (abstractC7791r4 instanceof AbstractC7791r.o)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.q) && (abstractC7791r4 instanceof AbstractC7791r.q)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.c) && (abstractC7791r4 instanceof AbstractC7791r.c)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.p) && (abstractC7791r4 instanceof AbstractC7791r.p)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                    if ((abstractC7791r3 instanceof AbstractC7791r.m) && (abstractC7791r4 instanceof AbstractC7791r.m)) {
                        return C5207g.m11106a(abstractC7791r3, abstractC7791r4);
                    }
                }
                return false;
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.C1162m.e
        /* JADX INFO: renamed from: b */
        public final boolean mo481b(AbstractC7791r abstractC7791r, AbstractC7791r abstractC7791r2) {
            AbstractC7791r abstractC7791r3 = abstractC7791r;
            AbstractC7791r abstractC7791r4 = abstractC7791r2;
            if ((!(abstractC7791r3 instanceof AbstractC7791r.l) || !(abstractC7791r4 instanceof AbstractC7791r.l)) && ((!(abstractC7791r3 instanceof AbstractC7791r.e) || !(abstractC7791r4 instanceof AbstractC7791r.e)) && ((!(abstractC7791r3 instanceof AbstractC7791r.k) || !(abstractC7791r4 instanceof AbstractC7791r.k)) && (!(abstractC7791r3 instanceof AbstractC7791r.j) || !(abstractC7791r4 instanceof AbstractC7791r.j) ? (!(abstractC7791r3 instanceof AbstractC7791r.h) || !(abstractC7791r4 instanceof AbstractC7791r.h)) && (!(abstractC7791r3 instanceof AbstractC7791r.f) || !(abstractC7791r4 instanceof AbstractC7791r.f) ? (!(abstractC7791r3 instanceof AbstractC7791r.g) || !(abstractC7791r4 instanceof AbstractC7791r.g)) && ((!(abstractC7791r3 instanceof AbstractC7791r.i) || !(abstractC7791r4 instanceof AbstractC7791r.i)) && ((!(abstractC7791r3 instanceof AbstractC7791r.a) || !(abstractC7791r4 instanceof AbstractC7791r.a)) && ((!(abstractC7791r3 instanceof AbstractC7791r.n) || !(abstractC7791r4 instanceof AbstractC7791r.n)) && ((!(abstractC7791r3 instanceof AbstractC7791r.b) || !(abstractC7791r4 instanceof AbstractC7791r.b)) && ((!(abstractC7791r3 instanceof AbstractC7791r.d) || !(abstractC7791r4 instanceof AbstractC7791r.d)) && ((!(abstractC7791r3 instanceof AbstractC7791r.o) || !(abstractC7791r4 instanceof AbstractC7791r.o)) && ((!(abstractC7791r3 instanceof AbstractC7791r.q) || !(abstractC7791r4 instanceof AbstractC7791r.q)) && ((!(abstractC7791r3 instanceof AbstractC7791r.c) || !(abstractC7791r4 instanceof AbstractC7791r.c)) && ((!(abstractC7791r3 instanceof AbstractC7791r.p) || !(abstractC7791r4 instanceof AbstractC7791r.p)) && (!(abstractC7791r3 instanceof AbstractC7791r.m) || !(abstractC7791r4 instanceof AbstractC7791r.m))))))))))) : ((AbstractC7791r.f) abstractC7791r3).f42831a != ((AbstractC7791r.f) abstractC7791r4).f42831a) : ((AbstractC7791r.j) abstractC7791r3).f42839a != ((AbstractC7791r.j) abstractC7791r4).f42839a)))) {
                return false;
            }
            return true;
        }
    }

    public C10201i(InterfaceC7792s interfaceC7792s, LessonCompleteFragment$onViewCreated$lessonStatsAdapter$2 lessonCompleteFragment$onViewCreated$lessonStatsAdapter$2) {
        super(new b());
        this.f51574e = interfaceC7792s;
        this.f51575f = lessonCompleteFragment$onViewCreated$lessonStatsAdapter$2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: g */
    public final int mo4228g(int i10) {
        AbstractC7791r abstractC7791rM4528p = m4528p(i10);
        if (abstractC7791rM4528p instanceof AbstractC7791r.l) {
            return StatsItemType.Title.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.e) {
            return StatsItemType.Description.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.k) {
            return StatsItemType.Timer.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.j) {
            return StatsItemType.Streak.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.g) {
            return StatsItemType.Goals.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.h) {
            return StatsItemType.LineGraph.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.f) {
            return StatsItemType.Filter.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.i) {
            return StatsItemType.Numbers.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.a) {
            return StatsItemType.ButtonActions.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.b) {
            return StatsItemType.Challenges.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.n) {
            return StatsItemType.TitleViewAll.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.m) {
            return StatsItemType.TitleWithButton.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.d) {
            return StatsItemType.CurrentDay.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.o) {
            return StatsItemType.Today.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.q) {
            return StatsItemType.TwoFilters.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.c) {
            return StatsItemType.CombinedLineGraph.ordinal();
        }
        if (abstractC7791rM4528p instanceof AbstractC7791r.p) {
            return StatsItemType.TodayAllTime.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: i */
    public final void mo478i(RecyclerView.AbstractC1109b0 abstractC1109b0, int i10) {
        int i11;
        int i12;
        int i13;
        String strM613i;
        int i14;
        String strM613i2;
        a aVar = (a) abstractC1109b0;
        final int i15 = 1;
        final int i16 = 0;
        if (aVar instanceof a.n) {
            AbstractC7791r abstractC7791rM4528p = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Title");
            AbstractC7791r.l lVar = (AbstractC7791r.l) abstractC7791rM4528p;
            a.n nVar = (a.n) aVar;
            TextView textView = nVar.f51600u.f45316b;
            View view = nVar.f7054a;
            int i17 = lVar.f42844a;
            Object obj = lVar.f42845b;
            if (obj == null) {
                strM613i2 = view.getContext().getString(i17);
            } else {
                Locale locale = Locale.getDefault();
                String string = view.getContext().getString(i17);
                C5207g.m11110e(string, "itemView.context.getString(value.title)");
                strM613i2 = C0141b.m613i(new Object[]{obj}, 1, locale, string, "format(locale, format, *args)");
            }
            textView.setText(strM613i2);
            return;
        }
        if (aVar instanceof a.e) {
            AbstractC7791r abstractC7791rM4528p2 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p2, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Description");
            ((a.e) aVar).f51583u.f45316b.setText(((AbstractC7791r.e) abstractC7791rM4528p2).f42830a);
            return;
        }
        if (aVar instanceof a.k) {
            AbstractC7791r abstractC7791rM4528p3 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p3, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Timer");
            a.k kVar = (a.k) aVar;
            TextView textView2 = kVar.f51597u.f45316b;
            Locale locale2 = Locale.getDefault();
            String string2 = kVar.f7054a.getContext().getString(R.string.stats_time_remaining);
            C5207g.m11110e(string2, "itemView.context.getStri…ing.stats_time_remaining)");
            C0009a.m32u(new Object[]{((AbstractC7791r.k) abstractC7791rM4528p3).f42843a}, 1, locale2, string2, "format(locale, format, *args)", textView2);
            return;
        }
        boolean z10 = aVar instanceof a.f;
        View view2 = aVar.f7054a;
        if (z10) {
            AbstractC7791r abstractC7791rM4528p4 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p4, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Filter");
            AbstractC7791r.f fVar = (AbstractC7791r.f) abstractC7791rM4528p4;
            a.f fVar2 = (a.f) aVar;
            C8259b3 c8259b3 = fVar2.f51584u;
            ((TextView) c8259b3.f44617b).setText(fVar2.f7054a.getContext().getString(fVar.f42831a));
            AppCompatSpinner appCompatSpinner = (AppCompatSpinner) c8259b3.f44619d;
            C5207g.m11110e(appCompatSpinner, "holder.binding.spinnerFilter");
            C4924a.m10457e0(appCompatSpinner);
            List<LanguageProgressSort> list = fVar.f42832b;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (LanguageProgressSort languageProgressSort : list) {
                Context context = view2.getContext();
                C5207g.m11111f(languageProgressSort, "<this>");
                switch (C4924a.a.f32091f[languageProgressSort.ordinal()]) {
                    case 1:
                        i14 = R.string.periods_all_time;
                        break;
                    case 2:
                        i14 = R.string.periods_last_year;
                        break;
                    case 3:
                        i14 = R.string.periods_last_six_months;
                        break;
                    case 4:
                        i14 = R.string.periods_last_three_months;
                        break;
                    case 5:
                        i14 = R.string.periods_last_month;
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        i14 = R.string.periods_last_two_weeks;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        i14 = R.string.periods_last_week;
                        break;
                    case 8:
                        i14 = R.string.periods_yesterday;
                        break;
                    case 9:
                        i14 = R.string.periods_today;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList.add(context.getString(i14));
            }
            ArrayAdapter arrayAdapter = new ArrayAdapter(view2.getContext(), R.layout.stats_activity_spinner_style, arrayList);
            arrayAdapter.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
            appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter);
            Iterator<LanguageProgressSort> it = list.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                } else if (!C5207g.m11106a(it.next().getKey(), fVar.f42833c)) {
                    i18++;
                }
            }
            appCompatSpinner.setSelection(i18 != -1 ? i18 : 0);
            appCompatSpinner.setOnItemSelectedListener(new C10205m(aVar, this, fVar));
            return;
        }
        if (aVar instanceof a.j) {
            AbstractC7791r abstractC7791rM4528p5 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p5, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Streak");
            AbstractC7791r.j jVar = (AbstractC7791r.j) abstractC7791rM4528p5;
            boolean z11 = jVar.f42842d;
            C8259b3 c8259b4 = ((a.j) aVar).f51596u;
            if (z11) {
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) c8259b4.f44617b;
                C5207g.m11110e(shimmerFrameLayout, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout);
                ((ShimmerFrameLayout) c8259b4.f44617b).m6747b();
                StreakView streakView = (StreakView) c8259b4.f44619d;
                C5207g.m11110e(streakView, "streakView");
                C4924a.m10422A(streakView);
                return;
            }
            ((ShimmerFrameLayout) c8259b4.f44617b).m6748c();
            ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) c8259b4.f44617b;
            C5207g.m11110e(shimmerFrameLayout2, "shimmerLayout");
            C4924a.m10442U(shimmerFrameLayout2);
            StreakView streakView2 = (StreakView) c8259b4.f44619d;
            C5207g.m11110e(streakView2, "streakView");
            C4924a.m10457e0(streakView2);
            streakView2.setActiveStates(jVar.f42840b);
            streakView2.m9382g();
            return;
        }
        if (aVar instanceof a.h) {
            AbstractC7791r abstractC7791rM4528p6 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p6, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.LineGraph");
            a.h hVar = (a.h) aVar;
            C8382x2 c8382x2 = hVar.f51589u;
            ((ShimmerFrameLayout) c8382x2.f45467e).m6748c();
            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) c8382x2.f45467e;
            C5207g.m11110e(shimmerFrameLayout3, "shimmerLayout");
            C4924a.m10422A(shimmerFrameLayout3);
            RecyclerView recyclerView = (RecyclerView) c8382x2.f45464b;
            C5207g.m11110e(recyclerView, "onBindViewHolder$lambda$3$lambda$2");
            C4924a.m10457e0(recyclerView);
            recyclerView.setLayoutManager(hVar.f51591w);
            C5198c c5198c = hVar.f51590v;
            recyclerView.setAdapter(c5198c);
            c5198c.m4529q(null);
            if (recyclerView.getOnFlingListener() == null) {
                new C1143b0().m4486a(recyclerView);
            }
            ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) c8382x2.f45466d;
            scrollingPagerIndicator.getClass();
            scrollingPagerIndicator.m9368b(recyclerView, new C7784k());
            return;
        }
        int i19 = 4;
        if (aVar instanceof a.g) {
            AbstractC7791r abstractC7791rM4528p7 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p7, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Goals");
            AbstractC7791r.g gVar = (AbstractC7791r.g) abstractC7791rM4528p7;
            a.g gVar2 = (a.g) aVar;
            C8289g3 c8289g3 = gVar2.f51585u;
            if (gVar.f42836c) {
                ShimmerFrameLayout shimmerFrameLayout4 = c8289g3.f44819c;
                C5207g.m11110e(shimmerFrameLayout4, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout4);
                c8289g3.f44819c.m6747b();
                RecyclerView recyclerView2 = c8289g3.f44818b;
                C5207g.m11110e(recyclerView2, "rvGoals");
                C4924a.m10422A(recyclerView2);
                return;
            }
            c8289g3.f44819c.m6748c();
            ShimmerFrameLayout shimmerFrameLayout5 = c8289g3.f44819c;
            C5207g.m11110e(shimmerFrameLayout5, "shimmerLayout");
            C4924a.m10442U(shimmerFrameLayout5);
            String strValueOf = String.valueOf(gVar.f42835b);
            C5207g.m11111f(strValueOf, "activityScore");
            TextView textView3 = c8289g3.f44821e;
            C5207g.m11110e(textView3, "binding.tvActivityScoreTitle");
            textView3.setVisibility(C7661i.m15250P2(strValueOf) ^ true ? 0 : 4);
            c8289g3.f44820d.setText(strValueOf);
            RecyclerView recyclerView3 = c8289g3.f44818b;
            C5207g.m11110e(recyclerView3, "onBindViewHolder$lambda$5$lambda$4");
            C4924a.m10457e0(recyclerView3);
            recyclerView3.setLayoutManager(gVar2.f51587w);
            C5197b c5197b = gVar2.f51586v;
            recyclerView3.setAdapter(c5197b);
            c5197b.m4529q(gVar.f42834a);
            return;
        }
        if (aVar instanceof a.i) {
            AbstractC7791r abstractC7791rM4528p8 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p8, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Numbers");
            AbstractC7791r.i iVar = (AbstractC7791r.i) abstractC7791rM4528p8;
            a.i iVar2 = (a.i) aVar;
            C8362t2 c8362t2 = iVar2.f51592u;
            if (iVar.f42838b) {
                ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) c8362t2.f45287d;
                C5207g.m11110e(shimmerFrameLayout6, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout6);
                ((ShimmerFrameLayout) c8362t2.f45287d).m6747b();
                RecyclerView recyclerView4 = (RecyclerView) c8362t2.f45286c;
                C5207g.m11110e(recyclerView4, "rvNumberItems");
                C4924a.m10422A(recyclerView4);
                return;
            }
            ((ShimmerFrameLayout) c8362t2.f45287d).m6748c();
            ShimmerFrameLayout shimmerFrameLayout7 = (ShimmerFrameLayout) c8362t2.f45287d;
            C5207g.m11110e(shimmerFrameLayout7, "shimmerLayout");
            C4924a.m10442U(shimmerFrameLayout7);
            RecyclerView recyclerView5 = (RecyclerView) c8362t2.f45286c;
            C5207g.m11110e(recyclerView5, "onBindViewHolder$lambda$7$lambda$6");
            C4924a.m10457e0(recyclerView5);
            RecyclerView.AbstractC1117j itemAnimator = recyclerView5.getItemAnimator();
            if (itemAnimator instanceof AbstractC1153g0) {
                ((AbstractC1153g0) itemAnimator).f7288g = false;
            }
            recyclerView5.setItemAnimator(null);
            recyclerView5.setLayoutManager(iVar2.f51594w);
            C8398d c8398d = iVar2.f51593v;
            recyclerView5.setAdapter(c8398d);
            c8398d.m4529q(iVar.f42837a);
            return;
        }
        if (aVar instanceof a.C10685a) {
            AbstractC7791r abstractC7791rM4528p9 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p9, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.ButtonActions");
            AbstractC7791r.a aVar2 = (AbstractC7791r.a) abstractC7791rM4528p9;
            if (aVar2.f42823c) {
                C8378w3 c8378w3 = ((a.C10685a) aVar).f51576u;
                MaterialButton materialButton = c8378w3.f45446b;
                C5207g.m11110e(materialButton, "holder.binding.btnAddToPlaylist");
                C4924a.m10422A(materialButton);
                MaterialButton materialButton2 = c8378w3.f45447c;
                C5207g.m11110e(materialButton2, "holder.binding.btnLike");
                C4924a.m10422A(materialButton2);
                return;
            }
            a.C10685a c10685a = (a.C10685a) aVar;
            boolean z12 = aVar2.f42824d;
            C8378w3 c8378w4 = c10685a.f51576u;
            if (z12) {
                MaterialButton materialButton3 = c8378w4.f45446b;
                C5207g.m11110e(materialButton3, "btnAddToPlaylist");
                C4924a.m10457e0(materialButton3);
            } else {
                MaterialButton materialButton4 = c8378w4.f45446b;
                C5207g.m11110e(materialButton4, "btnAddToPlaylist");
                C4924a.m10442U(materialButton4);
            }
            MaterialButton materialButton5 = c8378w4.f45447c;
            C5207g.m11110e(materialButton5, "btnLike");
            C4924a.m10457e0(materialButton5);
            MaterialButton materialButton6 = c8378w4.f45446b;
            materialButton6.setIconResource(R.drawable.ic_bottom_playlist);
            boolean z13 = aVar2.f42821a;
            View view3 = c10685a.f7054a;
            materialButton6.setText(z13 ? view3.getContext().getString(R.string.lesson_remove_from_playlist) : view3.getContext().getString(R.string.lesson_add_to_playlist));
            boolean z14 = aVar2.f42822b;
            MaterialButton materialButton7 = c8378w4.f45447c;
            if (z14) {
                materialButton7.setText(view3.getContext().getString(R.string.lingq_likes_past));
                materialButton7.setIconResource(R.drawable.ic_heart_filled_s);
            } else {
                materialButton7.setText(view3.getContext().getString(R.string.lingq_like_present));
                materialButton7.setIconResource(R.drawable.ic_heart_s);
            }
            if (z12) {
                materialButton6.setOnClickListener(new ViewOnClickListenerC6464i(this, i19, aVar2));
            }
            materialButton7.setOnClickListener(new View.OnClickListener(this) { // from class: xi.f

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C10201i f51569b;

                {
                    this.f51569b = this;
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    int i20 = i16;
                    C10201i c10201i = this.f51569b;
                    switch (i20) {
                        case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                            C5207g.m11111f(c10201i, "this$0");
                            InterfaceC7775b interfaceC7775b = c10201i.f51575f;
                            if (interfaceC7775b != null) {
                                interfaceC7775b.mo10218a();
                            }
                            break;
                        default:
                            C5207g.m11111f(c10201i, "this$0");
                            c10201i.f51574e.mo9911c(true);
                            break;
                    }
                }
            });
            return;
        }
        if (aVar instanceof a.b) {
            AbstractC7791r abstractC7791rM4528p10 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p10, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Challenges");
            AbstractC7791r.b bVar = (AbstractC7791r.b) abstractC7791rM4528p10;
            a.b bVar2 = (a.b) aVar;
            C8331n3 c8331n3 = bVar2.f51577u;
            boolean z15 = bVar.f42826b;
            if (z15) {
                ShimmerFrameLayout shimmerFrameLayout8 = (ShimmerFrameLayout) c8331n3.f45090d;
                C5207g.m11110e(shimmerFrameLayout8, "shimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout8);
                ((ShimmerFrameLayout) c8331n3.f45090d).m6747b();
                RecyclerView recyclerView6 = (RecyclerView) c8331n3.f45089c;
                C5207g.m11110e(recyclerView6, "rvChallenges");
                C4924a.m10422A(recyclerView6);
                MaterialButton materialButton8 = (MaterialButton) c8331n3.f45088b;
                C5207g.m11110e(materialButton8, "btnSignupChallenge");
                C4924a.m10442U(materialButton8);
                return;
            }
            List<ChallengeDetail> list2 = bVar.f42825a;
            if (z15 || !(!list2.isEmpty())) {
                if (bVar.f42826b || !list2.isEmpty()) {
                    return;
                }
                ((ShimmerFrameLayout) c8331n3.f45090d).m6748c();
                ShimmerFrameLayout shimmerFrameLayout9 = (ShimmerFrameLayout) c8331n3.f45090d;
                C5207g.m11110e(shimmerFrameLayout9, "shimmerLayout");
                C4924a.m10442U(shimmerFrameLayout9);
                RecyclerView recyclerView7 = (RecyclerView) c8331n3.f45089c;
                C5207g.m11110e(recyclerView7, "rvChallenges");
                C4924a.m10442U(recyclerView7);
                MaterialButton materialButton9 = (MaterialButton) c8331n3.f45088b;
                C5207g.m11110e(materialButton9, "btnSignupChallenge");
                C4924a.m10457e0(materialButton9);
                materialButton9.setOnClickListener(new View.OnClickListener(this) { // from class: xi.g

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C10201i f51571b;

                    {
                        this.f51571b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i20 = i16;
                        C10201i c10201i = this.f51571b;
                        switch (i20) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                C5207g.m11111f(c10201i, "this$0");
                                c10201i.f51574e.mo9916h();
                                break;
                            default:
                                C5207g.m11111f(c10201i, "this$0");
                                c10201i.f51574e.mo9911c(false);
                                break;
                        }
                    }
                });
                return;
            }
            ((ShimmerFrameLayout) c8331n3.f45090d).m6748c();
            ShimmerFrameLayout shimmerFrameLayout10 = (ShimmerFrameLayout) c8331n3.f45090d;
            C5207g.m11110e(shimmerFrameLayout10, "shimmerLayout");
            C4924a.m10442U(shimmerFrameLayout10);
            MaterialButton materialButton10 = (MaterialButton) c8331n3.f45088b;
            C5207g.m11110e(materialButton10, "btnSignupChallenge");
            C4924a.m10442U(materialButton10);
            RecyclerView recyclerView8 = (RecyclerView) c8331n3.f45089c;
            C5207g.m11110e(recyclerView8, "onBindViewHolder$lambda$12$lambda$10");
            C4924a.m10457e0(recyclerView8);
            RecyclerView.AbstractC1117j itemAnimator2 = recyclerView8.getItemAnimator();
            if (itemAnimator2 instanceof AbstractC1153g0) {
                ((AbstractC1153g0) itemAnimator2).f7288g = false;
            }
            recyclerView8.setItemAnimator(null);
            recyclerView8.setLayoutManager(bVar2.f51579w);
            C5199d c5199d = bVar2.f51578v;
            recyclerView8.setAdapter(c5199d);
            c5199d.m4529q(list2);
            return;
        }
        if (aVar instanceof a.m) {
            AbstractC7791r abstractC7791rM4528p11 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p11, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.TitleWithViewAll");
            a.m mVar = (a.m) aVar;
            C8372v2 c8372v2 = mVar.f51599u;
            c8372v2.f45407c.setText(mVar.f7054a.getContext().getString(((AbstractC7791r.n) abstractC7791rM4528p11).f42852a));
            ((TextView) c8372v2.f45408d).setOnClickListener(new ViewOnClickListenerC10200h(i16, this));
            return;
        }
        if (aVar instanceof a.l) {
            AbstractC7791r abstractC7791rM4528p12 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p12, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.TitleRepairStreak");
            AbstractC7791r.m mVar2 = (AbstractC7791r.m) abstractC7791rM4528p12;
            a.l lVar2 = (a.l) aVar;
            C8265c3 c8265c3 = lVar2.f51598u;
            TextView textView4 = (TextView) c8265c3.f44648d;
            View view4 = lVar2.f7054a;
            int i20 = mVar2.f42846a;
            Object obj2 = mVar2.f42847b;
            if (obj2 == null) {
                strM613i = view4.getContext().getString(i20);
            } else {
                Locale locale3 = Locale.getDefault();
                String string3 = view4.getContext().getString(i20);
                C5207g.m11110e(string3, "itemView.context.getString(item.title)");
                strM613i = C0141b.m613i(new Object[]{obj2}, 1, locale3, string3, "format(locale, format, *args)");
            }
            textView4.setText(strM613i);
            TextView textView5 = (TextView) c8265c3.f44647c;
            C5207g.m11110e(textView5, "binding.btnRepairStreak");
            textView5.setVisibility((mVar2.f42848c == null ? 0 : 1) == 0 ? 4 : 0);
            ((TextView) c8265c3.f44647c).setOnClickListener(new ViewOnClickListenerC6464i(this, 5, mVar2));
            return;
        }
        if (aVar instanceof a.d) {
            AbstractC7791r abstractC7791rM4528p13 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p13, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CurrentDay");
            a.d dVar = (a.d) aVar;
            C8372v2 c8372v3 = dVar.f51582u;
            TextView textView6 = c8372v3.f45407c;
            Locale locale4 = Locale.getDefault();
            String string4 = dVar.f7054a.getContext().getString(R.string.stats_time_remaining);
            C5207g.m11110e(string4, "itemView.context.getStri…ing.stats_time_remaining)");
            C0009a.m32u(new Object[]{null}, 1, locale4, string4, "format(locale, format, *args)", textView6);
            CurrentDayStreakView currentDayStreakView = (CurrentDayStreakView) c8372v3.f45408d;
            C8290g4 c8290g4 = currentDayStreakView.binding;
            C0009a.m32u(new Object[]{0, 0}, 2, Locale.getDefault(), "%d/%d", "format(locale, format, *args)", c8290g4.f44825d);
            ImageView imageView = c8290g4.f44823b;
            C1299f.m4817c(imageView, null);
            Context context2 = currentDayStreakView.getContext();
            Object obj3 = C7472a.f41322a;
            imageView.setImageDrawable(C7472a.c.m14849b(context2, R.drawable.ic_fire_big));
            List<Integer> list3 = C6716m.f37937a;
            C4924a.m10444W(imageView, (int) C6716m.m13316a(32));
            C4924a.m10445X(imageView, (int) C6716m.m13316a(32));
            CircularProgressIndicator circularProgressIndicator = c8290g4.f44822a;
            circularProgressIndicator.setMax(0);
            circularProgressIndicator.setProgress(0);
            return;
        }
        if (aVar instanceof a.p) {
            AbstractC7791r abstractC7791rM4528p14 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p14, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.Today");
            AbstractC7791r.o oVar = (AbstractC7791r.o) abstractC7791rM4528p14;
            C8337o3 c8337o3 = ((a.p) aVar).f51602u;
            StreakActivityLevelView streakActivityLevelView = c8337o3.f45117f;
            streakActivityLevelView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC10202j(streakActivityLevelView, oVar));
            c8337o3.f45114c.setText(String.valueOf(oVar.f42853a));
            c8337o3.f45115d.setText(String.valueOf(oVar.f42854b));
            c8337o3.f45116e.setText(String.valueOf(oVar.f42855c));
            c8337o3.f45113b.setText(C0166e.m770q(new Object[]{Double.valueOf(oVar.f42856d)}, 1, "%.2f", "format(format, *args)"));
            return;
        }
        if (!(aVar instanceof a.q)) {
            if (!(aVar instanceof a.c)) {
                if (aVar instanceof a.o) {
                    AbstractC7791r abstractC7791rM4528p15 = m4528p(i10);
                    C5207g.m11109d(abstractC7791rM4528p15, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.TodayAllTime");
                    a.o oVar2 = (a.o) aVar;
                    boolean z16 = ((AbstractC7791r.p) abstractC7791rM4528p15).f42860a;
                    C8372v2 c8372v4 = oVar2.f51601u;
                    View view5 = oVar2.f7054a;
                    if (z16) {
                        ((TextView) c8372v4.f45408d).setTextAppearance(R.style.TextAppearance_Header_Bold);
                        TextView textView7 = c8372v4.f45407c;
                        textView7.setTextAppearance(R.style.TextAppearance_Header);
                        TextView textView8 = (TextView) c8372v4.f45408d;
                        List<Integer> list4 = C6716m.f37937a;
                        Context context3 = view5.getContext();
                        C5207g.m11110e(context3, "itemView.context");
                        textView8.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context3));
                        Context context4 = view5.getContext();
                        C5207g.m11110e(context4, "itemView.context");
                        textView7.setTextColor(C6716m.m13333r(R.attr.tertiaryTextColor, context4));
                    } else {
                        ((TextView) c8372v4.f45408d).setTextAppearance(R.style.TextAppearance_Header);
                        TextView textView9 = c8372v4.f45407c;
                        textView9.setTextAppearance(R.style.TextAppearance_Header_Bold);
                        List<Integer> list5 = C6716m.f37937a;
                        Context context5 = view5.getContext();
                        C5207g.m11110e(context5, "itemView.context");
                        textView9.setTextColor(C6716m.m13333r(R.attr.primaryTextColor, context5));
                        TextView textView10 = (TextView) c8372v4.f45408d;
                        Context context6 = view5.getContext();
                        C5207g.m11110e(context6, "itemView.context");
                        textView10.setTextColor(C6716m.m13333r(R.attr.tertiaryTextColor, context6));
                    }
                    ((TextView) c8372v4.f45408d).setOnClickListener(new View.OnClickListener(this) { // from class: xi.f

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C10201i f51569b;

                        {
                            this.f51569b = this;
                        }

                        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i21 = i15;
                            C10201i c10201i = this.f51569b;
                            switch (i21) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(c10201i, "this$0");
                                    InterfaceC7775b interfaceC7775b = c10201i.f51575f;
                                    if (interfaceC7775b != null) {
                                        interfaceC7775b.mo10218a();
                                    }
                                    break;
                                default:
                                    C5207g.m11111f(c10201i, "this$0");
                                    c10201i.f51574e.mo9911c(true);
                                    break;
                            }
                        }
                    });
                    c8372v4.f45407c.setOnClickListener(new View.OnClickListener(this) { // from class: xi.g

                        /* JADX INFO: renamed from: b */
                        public final /* synthetic */ C10201i f51571b;

                        {
                            this.f51571b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view6) {
                            int i21 = i15;
                            C10201i c10201i = this.f51571b;
                            switch (i21) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    C5207g.m11111f(c10201i, "this$0");
                                    c10201i.f51574e.mo9916h();
                                    break;
                                default:
                                    C5207g.m11111f(c10201i, "this$0");
                                    c10201i.f51574e.mo9911c(false);
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            AbstractC7791r abstractC7791rM4528p16 = m4528p(i10);
            C5207g.m11109d(abstractC7791rM4528p16, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.CombinedLineGraph");
            AbstractC7791r.c cVar = (AbstractC7791r.c) abstractC7791rM4528p16;
            a.c cVar2 = (a.c) aVar;
            boolean z17 = cVar.f42829c;
            C8266c4 c8266c4 = cVar2.f51581u;
            if (z17) {
                ShimmerFrameLayout shimmerFrameLayout11 = (ShimmerFrameLayout) c8266c4.f44653e;
                C5207g.m11110e(shimmerFrameLayout11, "cumulativeShimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout11);
                ShimmerFrameLayout shimmerFrameLayout12 = (ShimmerFrameLayout) c8266c4.f44654f;
                C5207g.m11110e(shimmerFrameLayout12, "dailyShimmerLayout");
                C4924a.m10457e0(shimmerFrameLayout12);
                ((ShimmerFrameLayout) c8266c4.f44653e).m6747b();
                shimmerFrameLayout12.m6747b();
                LineGraph lineGraph = (LineGraph) c8266c4.f44651c;
                C5207g.m11110e(lineGraph, "cumulativeGraph");
                C4924a.m10422A(lineGraph);
                LineGraph lineGraph2 = (LineGraph) c8266c4.f44652d;
                C5207g.m11110e(lineGraph2, "dailyGraph");
                C4924a.m10422A(lineGraph2);
                return;
            }
            ((ShimmerFrameLayout) c8266c4.f44653e).m6748c();
            ShimmerFrameLayout shimmerFrameLayout13 = (ShimmerFrameLayout) c8266c4.f44654f;
            shimmerFrameLayout13.m6748c();
            ShimmerFrameLayout shimmerFrameLayout14 = (ShimmerFrameLayout) c8266c4.f44653e;
            C5207g.m11110e(shimmerFrameLayout14, "cumulativeShimmerLayout");
            C4924a.m10422A(shimmerFrameLayout14);
            C4924a.m10422A(shimmerFrameLayout13);
            LineGraph lineGraph3 = (LineGraph) c8266c4.f44651c;
            C5207g.m11110e(lineGraph3, "cumulativeGraph");
            C4924a.m10457e0(lineGraph3);
            LineGraph lineGraph4 = (LineGraph) c8266c4.f44652d;
            C5207g.m11110e(lineGraph4, "dailyGraph");
            C4924a.m10457e0(lineGraph4);
            List<Integer> list6 = C6716m.f37937a;
            View view6 = cVar2.f7054a;
            Context context7 = view6.getContext();
            C5207g.m11110e(context7, "itemView.context");
            C7779f c7779f = cVar.f42827a;
            lineGraph3.setLineColor(C6716m.m13333r(c7779f.f42714b, context7));
            lineGraph3.setCoordinatePoints(c7779f.f42715c);
            Context context8 = view6.getContext();
            C5207g.m11110e(context8, "itemView.context");
            C7779f c7779f2 = cVar.f42828b;
            lineGraph4.setLineColor(C6716m.m13333r(c7779f2.f42714b, context8));
            lineGraph4.setCoordinatePoints(c7779f2.f42715c);
            return;
        }
        AbstractC7791r abstractC7791rM4528p17 = m4528p(i10);
        C5207g.m11109d(abstractC7791rM4528p17, "null cannot be cast to non-null type com.lingq.commons.ui.StatsItem.TwoFilters");
        AbstractC7791r.q qVar = (AbstractC7791r.q) abstractC7791rM4528p17;
        a.q qVar2 = (a.q) aVar;
        C8271d3 c8271d3 = qVar2.f51603u;
        ((TextView) c8271d3.f44671b).setText(qVar2.f7054a.getContext().getString(qVar.f42861a));
        AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) c8271d3.f44673d;
        C5207g.m11110e(appCompatSpinner2, "holder.binding.spinnerFilter1");
        C4924a.m10457e0(appCompatSpinner2);
        AppCompatSpinner appCompatSpinner3 = (AppCompatSpinner) c8271d3.f44674e;
        C5207g.m11110e(appCompatSpinner3, "holder.binding.spinnerFilter2");
        C4924a.m10457e0(appCompatSpinner3);
        List<LanguageProgressMetric> list7 = qVar.f42862b;
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list7, 10));
        for (LanguageProgressMetric languageProgressMetric : list7) {
            Context context9 = view2.getContext();
            C5207g.m11111f(languageProgressMetric, "<this>");
            switch (C4924a.a.f32093h[languageProgressMetric.ordinal()]) {
                case 1:
                    i13 = R.string.stats_known_words;
                    break;
                case 2:
                    i13 = R.string.complete_lingqs_created;
                    break;
                case 3:
                    i13 = R.string.stats_learned_lingqs;
                    break;
                case 4:
                    i13 = R.string.stats_hours_listening;
                    break;
                case 5:
                    i13 = R.string.stats_reading_words;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i13 = R.string.stats_coins_earned;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i13 = R.string.stats_hours_speaking;
                    break;
                case 8:
                    i13 = R.string.stats_written_words;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList2.add(context9.getString(i13));
        }
        List<LanguageProgressPeriod> list8 = qVar.f42863c;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list8, 10));
        for (LanguageProgressPeriod languageProgressPeriod : list8) {
            Context context10 = view2.getContext();
            C5207g.m11111f(languageProgressPeriod, "<this>");
            switch (C4924a.a.f32092g[languageProgressPeriod.ordinal()]) {
                case 1:
                    i12 = R.string.periods_last_seven_days;
                    break;
                case 2:
                    i12 = R.string.periods_last_14_days;
                    break;
                case 3:
                    i12 = R.string.periods_last_30_days;
                    break;
                case 4:
                    i12 = R.string.periods_this_month;
                    break;
                case 5:
                    i12 = R.string.periods_last_month;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    i12 = R.string.periods_last_three_months;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    i12 = R.string.periods_last_six_months;
                    break;
                case 8:
                    i12 = R.string.periods_all_time;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList3.add(context10.getString(i12));
        }
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(view2.getContext(), R.layout.stats_activity_spinner_style, arrayList2);
        arrayAdapter2.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
        appCompatSpinner2.setAdapter((SpinnerAdapter) arrayAdapter2);
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(view2.getContext(), R.layout.stats_activity_spinner_style, arrayList3);
        arrayAdapter3.setDropDownViewResource(R.layout.view_spinner_dropdown_text);
        appCompatSpinner3.setAdapter((SpinnerAdapter) arrayAdapter3);
        Iterator<LanguageProgressMetric> it2 = list7.iterator();
        int i21 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                i21 = -1;
            } else if (C5207g.m11106a(it2.next().getKey(), qVar.f42864d)) {
                i11 = -1;
            } else {
                i21++;
            }
        }
        appCompatSpinner2.setSelection(i21 == i11 ? 0 : i21);
        Iterator<LanguageProgressPeriod> it3 = list8.iterator();
        int i22 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i22 = -1;
            } else if (!C5207g.m11106a(it3.next().getKey(), qVar.f42865e)) {
                i22++;
            }
        }
        appCompatSpinner3.setSelection(i22 != -1 ? i22 : 0);
        appCompatSpinner2.setOnItemSelectedListener(new C10203k(aVar, this, qVar, i22));
        appCompatSpinner3.setOnItemSelectedListener(new C10204l(aVar, this, qVar, i21));
    }

    /* JADX WARN: Code duplicated, block: B:108:0x031d A[PHI: r2
      0x031d: PHI (r2v74 int) = (r2v73 int), (r2v75 int) binds: [B:102:0x02fc, B:104:0x0307] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:152:0x045d A[PHI: r2
      0x045d: PHI (r2v51 int) = (r2v50 int), (r2v52 int) binds: [B:146:0x0436, B:148:0x0442] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x0160 A[PHI: r2
      0x0160: PHI (r2v98 int) = (r2v97 int), (r2v99 int) binds: [B:42:0x013a, B:44:0x0146] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j */
    public final RecyclerView.AbstractC1109b0 mo479j(RecyclerView recyclerView, int i10) {
        RecyclerView.AbstractC1109b0 oVar;
        C5207g.m11111f(recyclerView, "parent");
        int i11 = 4;
        int i12 = 0;
        if (i10 == StatsItemType.Title.ordinal()) {
            View viewInflate = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_title, (ViewGroup) recyclerView, false);
            if (viewInflate == null) {
                throw new NullPointerException("rootView");
            }
            TextView textView = (TextView) viewInflate;
            oVar = new a.n(new C8367u2(textView, textView, i11));
        } else if (i10 == StatsItemType.Description.ordinal()) {
            oVar = new a.e(C8367u2.m16416a(C7793a.m15500d(recyclerView), recyclerView));
        } else {
            if (i10 != StatsItemType.Timer.ordinal()) {
                int iOrdinal = StatsItemType.Streak.ordinal();
                int i13 = 7;
                int i14 = R.id.shimmerLayout;
                if (i10 == iOrdinal) {
                    View viewInflate2 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_streak, (ViewGroup) recyclerView, false);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C0062b.m298P0(viewInflate2, R.id.shimmerLayout);
                    if (shimmerFrameLayout != null) {
                        i14 = R.id.streakView;
                        StreakView streakView = (StreakView) C0062b.m298P0(viewInflate2, R.id.streakView);
                        if (streakView != null) {
                            oVar = new a.j(new C8259b3((RelativeLayout) viewInflate2, shimmerFrameLayout, streakView, i13));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i14)));
                }
                int iOrdinal2 = StatsItemType.Goals.ordinal();
                InterfaceC7792s interfaceC7792s = this.f51574e;
                if (i10 == iOrdinal2) {
                    View viewInflate3 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_list, (ViewGroup) recyclerView, false);
                    RecyclerView recyclerView2 = (RecyclerView) C0062b.m298P0(viewInflate3, R.id.rvGoals);
                    if (recyclerView2 != null) {
                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate3, R.id.shimmerLayout);
                        if (shimmerFrameLayout2 != null) {
                            i14 = R.id.tvActivityScore;
                            TextView textView2 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvActivityScore);
                            if (textView2 != null) {
                                i14 = R.id.tvActivityScoreTitle;
                                TextView textView3 = (TextView) C0062b.m298P0(viewInflate3, R.id.tvActivityScoreTitle);
                                if (textView3 != null) {
                                    oVar = new a.g(new C8289g3((MaterialCardView) viewInflate3, recyclerView2, shimmerFrameLayout2, textView2, textView3, 1), interfaceC7792s);
                                }
                            }
                        }
                    } else {
                        i14 = R.id.rvGoals;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i14)));
                }
                if (i10 == StatsItemType.LineGraph.ordinal()) {
                    View viewInflate4 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_line_graphs, (ViewGroup) recyclerView, false);
                    int i15 = R.id.indicator;
                    ScrollingPagerIndicator scrollingPagerIndicator = (ScrollingPagerIndicator) C0062b.m298P0(viewInflate4, R.id.indicator);
                    if (scrollingPagerIndicator != null) {
                        i15 = R.id.rvContent;
                        RecyclerView recyclerView3 = (RecyclerView) C0062b.m298P0(viewInflate4, R.id.rvContent);
                        if (recyclerView3 != null) {
                            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate4, R.id.shimmerLayout);
                            if (shimmerFrameLayout3 != null) {
                                oVar = new a.h(new C8382x2((RelativeLayout) viewInflate4, scrollingPagerIndicator, recyclerView3, shimmerFrameLayout3, 5));
                            }
                        } else {
                            i14 = i15;
                        }
                    } else {
                        i14 = i15;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate4.getResources().getResourceName(i14)));
                }
                int iOrdinal3 = StatsItemType.Filter.ordinal();
                int i16 = R.id.tvTitle;
                if (i10 == iOrdinal3) {
                    View viewInflate5 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_filter, (ViewGroup) recyclerView, false);
                    AppCompatSpinner appCompatSpinner = (AppCompatSpinner) C0062b.m298P0(viewInflate5, R.id.spinnerFilter);
                    if (appCompatSpinner != null) {
                        TextView textView4 = (TextView) C0062b.m298P0(viewInflate5, R.id.tvTitle);
                        if (textView4 != null) {
                            oVar = new a.f(new C8259b3(6, appCompatSpinner, (RelativeLayout) viewInflate5, textView4));
                        }
                    } else {
                        i16 = R.id.spinnerFilter;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate5.getResources().getResourceName(i16)));
                }
                if (i10 == StatsItemType.Numbers.ordinal()) {
                    View viewInflate6 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_numbers_view, (ViewGroup) recyclerView, false);
                    RecyclerView recyclerView4 = (RecyclerView) C0062b.m298P0(viewInflate6, R.id.rvNumberItems);
                    if (recyclerView4 != null) {
                        ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate6, R.id.shimmerLayout);
                        if (shimmerFrameLayout4 != null) {
                            oVar = new a.i(new C8362t2((MaterialCardView) viewInflate6, recyclerView4, shimmerFrameLayout4, i13), interfaceC7792s);
                        }
                    } else {
                        i14 = R.id.rvNumberItems;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate6.getResources().getResourceName(i14)));
                }
                if (i10 == StatsItemType.ButtonActions.ordinal()) {
                    View viewInflate7 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_button_actions, (ViewGroup) recyclerView, false);
                    LinearLayout linearLayout = (LinearLayout) viewInflate7;
                    int i17 = R.id.btnAddToPlaylist;
                    MaterialButton materialButton = (MaterialButton) C0062b.m298P0(viewInflate7, R.id.btnAddToPlaylist);
                    if (materialButton != null) {
                        i17 = R.id.btnLike;
                        MaterialButton materialButton2 = (MaterialButton) C0062b.m298P0(viewInflate7, R.id.btnLike);
                        if (materialButton2 != null) {
                            oVar = new a.C10685a(new C8378w3(linearLayout, materialButton, materialButton2, 1));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate7.getResources().getResourceName(i17)));
                }
                if (i10 == StatsItemType.TitleViewAll.ordinal()) {
                    View viewInflate8 = C7793a.m15500d(recyclerView).inflate(R.layout.list_header_stats_view_all, (ViewGroup) recyclerView, false);
                    TextView textView5 = (TextView) C0062b.m298P0(viewInflate8, R.id.tvTitle);
                    if (textView5 != null) {
                        i16 = R.id.tvViewAll;
                        TextView textView6 = (TextView) C0062b.m298P0(viewInflate8, R.id.tvViewAll);
                        if (textView6 != null) {
                            oVar = new a.m(new C8372v2(1, textView6, (RelativeLayout) viewInflate8, textView5));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate8.getResources().getResourceName(i16)));
                }
                if (i10 == StatsItemType.TitleWithButton.ordinal()) {
                    View viewInflate9 = C7793a.m15500d(recyclerView).inflate(R.layout.list_header_stats_text_button, (ViewGroup) recyclerView, false);
                    TextView textView7 = (TextView) C0062b.m298P0(viewInflate9, R.id.btnRepairStreak);
                    if (textView7 != null) {
                        TextView textView8 = (TextView) C0062b.m298P0(viewInflate9, R.id.tvTitle);
                        if (textView8 != null) {
                            oVar = new a.l(new C8265c3((RelativeLayout) viewInflate9, textView7, textView8, i12));
                        }
                    } else {
                        i16 = R.id.btnRepairStreak;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate9.getResources().getResourceName(i16)));
                }
                if (i10 == StatsItemType.Challenges.ordinal()) {
                    View viewInflate10 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_challenges_list, (ViewGroup) recyclerView, false);
                    int i18 = R.id.btnSignupChallenge;
                    MaterialButton materialButton3 = (MaterialButton) C0062b.m298P0(viewInflate10, R.id.btnSignupChallenge);
                    if (materialButton3 != null) {
                        i18 = R.id.rvChallenges;
                        RecyclerView recyclerView5 = (RecyclerView) C0062b.m298P0(viewInflate10, R.id.rvChallenges);
                        if (recyclerView5 != null) {
                            ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate10, R.id.shimmerLayout);
                            if (shimmerFrameLayout5 != null) {
                                oVar = new a.b(new C8331n3((MaterialCardView) viewInflate10, materialButton3, recyclerView5, shimmerFrameLayout5), interfaceC7792s);
                            }
                        } else {
                            i14 = i18;
                        }
                    } else {
                        i14 = i18;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate10.getResources().getResourceName(i14)));
                }
                if (i10 == StatsItemType.CurrentDay.ordinal()) {
                    View viewInflate11 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_current_day, (ViewGroup) recyclerView, false);
                    int i19 = R.id.tvTime;
                    TextView textView9 = (TextView) C0062b.m298P0(viewInflate11, R.id.tvTime);
                    if (textView9 != null) {
                        i19 = R.id.viewStreak;
                        CurrentDayStreakView currentDayStreakView = (CurrentDayStreakView) C0062b.m298P0(viewInflate11, R.id.viewStreak);
                        if (currentDayStreakView != null) {
                            oVar = new a.d(new C8372v2(3, currentDayStreakView, (MaterialCardView) viewInflate11, textView9));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate11.getResources().getResourceName(i19)));
                }
                if (i10 == StatsItemType.Today.ordinal()) {
                    View viewInflate12 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_language_stats_today, (ViewGroup) recyclerView, false);
                    int i20 = R.id.tvHoursListened;
                    TextView textView10 = (TextView) C0062b.m298P0(viewInflate12, R.id.tvHoursListened);
                    if (textView10 != null) {
                        i20 = R.id.tvHoursListenedTitle;
                        if (((TextView) C0062b.m298P0(viewInflate12, R.id.tvHoursListenedTitle)) != null) {
                            i20 = R.id.tvLingQCreated;
                            TextView textView11 = (TextView) C0062b.m298P0(viewInflate12, R.id.tvLingQCreated);
                            if (textView11 != null) {
                                i20 = R.id.tvLingQCreatedTitle;
                                if (((TextView) C0062b.m298P0(viewInflate12, R.id.tvLingQCreatedTitle)) != null) {
                                    i20 = R.id.tvWordsLearned;
                                    TextView textView12 = (TextView) C0062b.m298P0(viewInflate12, R.id.tvWordsLearned);
                                    if (textView12 != null) {
                                        i20 = R.id.tvWordsLearnedTitle;
                                        if (((TextView) C0062b.m298P0(viewInflate12, R.id.tvWordsLearnedTitle)) != null) {
                                            i20 = R.id.tvWordsRead;
                                            TextView textView13 = (TextView) C0062b.m298P0(viewInflate12, R.id.tvWordsRead);
                                            if (textView13 != null) {
                                                i20 = R.id.tvWordsReadTitle;
                                                if (((TextView) C0062b.m298P0(viewInflate12, R.id.tvWordsReadTitle)) != null) {
                                                    i20 = R.id.viewStreakActivityLevel;
                                                    StreakActivityLevelView streakActivityLevelView = (StreakActivityLevelView) C0062b.m298P0(viewInflate12, R.id.viewStreakActivityLevel);
                                                    if (streakActivityLevelView != null) {
                                                        oVar = new a.p(new C8337o3((MaterialCardView) viewInflate12, textView10, textView11, textView12, textView13, streakActivityLevelView));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate12.getResources().getResourceName(i20)));
                }
                if (i10 == StatsItemType.TwoFilters.ordinal()) {
                    View viewInflate13 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_two_filters, (ViewGroup) recyclerView, false);
                    int i21 = R.id.spinnerFilter1;
                    AppCompatSpinner appCompatSpinner2 = (AppCompatSpinner) C0062b.m298P0(viewInflate13, R.id.spinnerFilter1);
                    if (appCompatSpinner2 != null) {
                        i21 = R.id.spinnerFilter2;
                        AppCompatSpinner appCompatSpinner3 = (AppCompatSpinner) C0062b.m298P0(viewInflate13, R.id.spinnerFilter2);
                        if (appCompatSpinner3 != null) {
                            TextView textView14 = (TextView) C0062b.m298P0(viewInflate13, R.id.tvTitle);
                            if (textView14 != null) {
                                oVar = new a.q(new C8271d3((ConstraintLayout) viewInflate13, appCompatSpinner2, appCompatSpinner3, textView14, 3));
                            }
                        } else {
                            i16 = i21;
                        }
                    } else {
                        i16 = i21;
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate13.getResources().getResourceName(i16)));
                }
                if (i10 != StatsItemType.CombinedLineGraph.ordinal()) {
                    if (i10 != StatsItemType.TodayAllTime.ordinal()) {
                        throw new IllegalStateException();
                    }
                    View viewInflate14 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_today_all_time, (ViewGroup) recyclerView, false);
                    int i22 = R.id.tvAllTime;
                    TextView textView15 = (TextView) C0062b.m298P0(viewInflate14, R.id.tvAllTime);
                    if (textView15 != null) {
                        i22 = R.id.tvToday;
                        TextView textView16 = (TextView) C0062b.m298P0(viewInflate14, R.id.tvToday);
                        if (textView16 != null) {
                            oVar = new a.o(new C8372v2(4, textView16, (LinearLayout) viewInflate14, textView15));
                        }
                    }
                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate14.getResources().getResourceName(i22)));
                }
                View viewInflate15 = C7793a.m15500d(recyclerView).inflate(R.layout.list_item_stats_combined_graphs, (ViewGroup) recyclerView, false);
                int i23 = R.id.cumulativeGraph;
                LineGraph lineGraph = (LineGraph) C0062b.m298P0(viewInflate15, R.id.cumulativeGraph);
                if (lineGraph != null) {
                    i23 = R.id.cumulativeShimmerLayout;
                    ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate15, R.id.cumulativeShimmerLayout);
                    if (shimmerFrameLayout6 != null) {
                        i23 = R.id.dailyGraph;
                        LineGraph lineGraph2 = (LineGraph) C0062b.m298P0(viewInflate15, R.id.dailyGraph);
                        if (lineGraph2 != null) {
                            i23 = R.id.dailyShimmerLayout;
                            ShimmerFrameLayout shimmerFrameLayout7 = (ShimmerFrameLayout) C0062b.m298P0(viewInflate15, R.id.dailyShimmerLayout);
                            if (shimmerFrameLayout7 != null) {
                                i23 = R.id.tvCumulative;
                                if (((TextView) C0062b.m298P0(viewInflate15, R.id.tvCumulative)) != null) {
                                    i23 = R.id.tvDaily;
                                    TextView textView17 = (TextView) C0062b.m298P0(viewInflate15, R.id.tvDaily);
                                    if (textView17 != null) {
                                        oVar = new a.c(new C8266c4((MaterialCardView) viewInflate15, lineGraph, shimmerFrameLayout6, lineGraph2, shimmerFrameLayout7, textView17));
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate15.getResources().getResourceName(i23)));
                return oVar;
            }
            oVar = new a.k(C8367u2.m16416a(C7793a.m15500d(recyclerView), recyclerView));
        }
        return oVar;
    }
}
