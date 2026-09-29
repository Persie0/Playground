package com.lingq.p055ui.lesson.player;

import android.os.Bundle;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.C0204c;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C1038i0;
import androidx.view.C1042k0;
import androidx.view.C1046m0;
import androidx.view.C1052r;
import androidx.view.InterfaceC1037i;
import androidx.view.InterfaceC1048n0;
import androidx.view.Lifecycle;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.slider.Slider;
import com.lingq.p055ui.lesson.player.ListeningModeFragment;
import com.lingq.player.AbstractC3298c;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3297b;
import com.lingq.player.C3300e;
import com.lingq.player.PlayerController;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import com.lingq.util.C4924a;
import com.lingq.util.p056ui.FragmentViewBindingDelegate;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants$PlayerState;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import dm.C5209i;
import id.InterfaceC6316a;
import java.util.List;
import java.util.WeakHashMap;
import km.InterfaceC6727j;
import kotlin.C6740a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7796d;
import no.C7828f;
import p003a2.C0009a;
import p040c4.C1681f;
import p118fe.C5509a;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.InterfaceC7774a;
import p301oh.C8049h;
import p303oj.AbstractC8058a;
import p303oj.C8063f;
import p304ok.InterfaceC8066b;
import p338qd.C8573r0;
import p406u4.AbstractC9409f0;
import p406u4.C9415i0;
import p427v3.AbstractC9634a;
import p471x2.C10029b0;
import p471x2.C10049l0;
import p522z2.C10437a;
import ph.C8355s0;
import pk.AbstractC8400a;
import pk.InterfaceC8402c;
import sh.AbstractC9006b;
import sl.C9072e;
import sl.InterfaceC9070c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/player/ListeningModeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class ListeningModeFragment extends AbstractC8058a {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ InterfaceC6727j<Object>[] f28729F0 = {C0204c.m857q(ListeningModeFragment.class, "getBinding()Lcom/lingq/databinding/FragmentListeningModeBinding;")};

    /* JADX INFO: renamed from: A0 */
    public final FragmentViewBindingDelegate f28730A0;

    /* JADX INFO: renamed from: B0 */
    public final C1038i0 f28731B0;

    /* JADX INFO: renamed from: C0 */
    public final C1681f f28732C0;

    /* JADX INFO: renamed from: D0 */
    public C7796d f28733D0;

    /* JADX INFO: renamed from: E0 */
    public PlayerController f28734E0;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$a */
    public static final class C4388a extends AbstractC8400a {
        public C4388a() {
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: d */
        public final void mo9988d(InterfaceC8066b interfaceC8066b, float f3) {
            C3297b value;
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = ListeningModeFragment.this.m10211p0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, 0L, (((int) f3) * 1000) + 500, 11)));
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: e */
        public final void mo9989e(InterfaceC8066b interfaceC8066b, float f3) {
            C3297b value;
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            InterfaceC7133n<C3297b> interfaceC7133nMo9423y = ListeningModeFragment.this.m10211p0().mo9423y();
            do {
                value = interfaceC7133nMo9423y.getValue();
            } while (!interfaceC7133nMo9423y.mo14366c(value, C3297b.m9431a(value, (long) (1000 * f3), 0, 13)));
        }

        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: h */
        public final void mo10114h(InterfaceC8066b interfaceC8066b) {
            StateFlowImpl stateFlowImpl;
            Object value;
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeViewModel listeningModeViewModelM10211p0 = ListeningModeFragment.this.m10211p0();
            do {
                stateFlowImpl = listeningModeViewModelM10211p0.f28797M;
                value = stateFlowImpl.getValue();
                ((Boolean) value).booleanValue();
            } while (!stateFlowImpl.mo14366c(value, Boolean.TRUE));
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // pk.AbstractC8400a, pk.InterfaceC8403d
        /* JADX INFO: renamed from: i */
        public final void mo9990i(InterfaceC8066b interfaceC8066b, PlayerConstants$PlayerState playerConstants$PlayerState) {
            C3300e value;
            AbstractC3299d.c cVar;
            AbstractC3298c.b bVar;
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            PlayerConstants$PlayerState playerConstants$PlayerState2 = PlayerConstants$PlayerState.ENDED;
            ListeningModeFragment listeningModeFragment = ListeningModeFragment.this;
            if (playerConstants$PlayerState == playerConstants$PlayerState2) {
                PlayerController playerController = listeningModeFragment.f28734E0;
                if (playerController == null) {
                    C5207g.m11117l("playerController");
                    throw null;
                }
                playerController.m9397G0(AbstractC3298c.a.f17752a);
                listeningModeFragment.m10211p0().mo9421x(AppUsageType.Listening);
                PlayerController playerController2 = listeningModeFragment.f28734E0;
                if (playerController2 != null) {
                    playerController2.m9394D0();
                    return;
                } else {
                    C5207g.m11117l("playerController");
                    throw null;
                }
            }
            if (playerConstants$PlayerState == PlayerConstants$PlayerState.PLAYING) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y0 = listeningModeFragment.m10211p0().mo9424y0();
                do {
                    value = interfaceC7133nMo9424y0.getValue();
                    cVar = AbstractC3299d.c.f17756a;
                    bVar = AbstractC3298c.b.f17753a;
                    value.getClass();
                } while (!interfaceC7133nMo9424y0.mo14366c(value, C3300e.m9432a(cVar, bVar)));
                listeningModeFragment.m10211p0().mo9402N(AppUsageType.Listening);
                return;
            }
            if (playerConstants$PlayerState == PlayerConstants$PlayerState.PAUSED) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                listeningModeFragment.m10211p0().mo9421x(AppUsageType.Listening);
                PlayerController playerController3 = listeningModeFragment.f28734E0;
                if (playerController3 != null) {
                    playerController3.m9397G0(AbstractC3298c.a.f17752a);
                } else {
                    C5207g.m11117l("playerController");
                    throw null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$b */
    public static final class C4389b implements InterfaceC8402c {
        @Override // pk.InterfaceC8402c
        /* JADX INFO: renamed from: a */
        public final void mo5247a(InterfaceC8066b interfaceC8066b) {
            C5207g.m11111f(interfaceC8066b, "youTubePlayer");
            interfaceC8066b.pause();
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$c */
    public static final class C4390c implements InterfaceC7774a<LessonStudyTranslationSentence> {
        public C4390c() {
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0039  */
        /* JADX WARN: Code duplicated, block: B:25:0x005f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:26:0x0061  */
        /* JADX WARN: Code duplicated, block: B:27:0x0067  */
        @Override // p278nh.InterfaceC7774a
        /* JADX INFO: renamed from: a */
        public final void mo9795a(LessonStudyTranslationSentence lessonStudyTranslationSentence) {
            double dDoubleValue;
            LessonStudyTranslationSentence lessonStudyTranslationSentence2 = lessonStudyTranslationSentence;
            C5207g.m11111f(lessonStudyTranslationSentence2, "sentence");
            boolean z10 = false;
            double dDoubleValue2 = -1.0d;
            ListeningModeFragment listeningModeFragment = ListeningModeFragment.this;
            int i10 = lessonStudyTranslationSentence2.f21895a;
            Double d10 = lessonStudyTranslationSentence2.f21897c;
            if (d10 != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
                if (i10 == 1) {
                    dDoubleValue = d10.doubleValue();
                } else {
                    if (d10.doubleValue() == 0.0d) {
                        dDoubleValue = -1.0d;
                    } else {
                        dDoubleValue = d10.doubleValue();
                    }
                }
                listeningModeViewModelM10211p0.m10213m2(new AbstractC9006b.l(dDoubleValue));
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
            ListeningModeViewModel listeningModeViewModelM10211p1 = listeningModeFragment.m10211p0();
            if (i10 != 1) {
                if (d10 != null && d10.doubleValue() == 0.0d) {
                    z10 = true;
                }
                if (!z10) {
                    if (d10 != null) {
                        if (d10 != null) {
                            dDoubleValue2 = d10.doubleValue();
                        } else {
                            dDoubleValue2 = 0.0d;
                        }
                    }
                }
            } else if (d10 != null) {
                dDoubleValue2 = d10.doubleValue();
            } else {
                dDoubleValue2 = 0.0d;
            }
            listeningModeViewModelM10211p1.f28795K.mo14371k(Double.valueOf(dDoubleValue2));
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$1] */
    public ListeningModeFragment() {
        super(R.layout.fragment_listening_mode);
        this.f28730A0 = C4924a.m10477o0(this, ListeningModeFragment$binding$2.f28736j);
        final ?? r10 = new InterfaceC2041a<Fragment>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Fragment mo807E() {
                return this;
            }
        };
        final InterfaceC9070c interfaceC9070cM13373b = C6740a.m13373b(LazyThreadSafetyMode.NONE, new InterfaceC2041a<InterfaceC1048n0>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final InterfaceC1048n0 mo807E() {
                return (InterfaceC1048n0) r10.mo807E();
            }
        });
        this.f28731B0 = C8573r0.m16711Z(this, C5209i.m11118a(ListeningModeViewModel.class), new InterfaceC2041a<C1046m0>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1046m0 mo807E() {
                return C0009a.m18f(interfaceC9070cM13373b, "owner.viewModelStore");
            }
        }, new InterfaceC2041a<AbstractC9634a>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final AbstractC9634a mo807E() {
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                AbstractC9634a abstractC9634aMo792j = interfaceC1037i != null ? interfaceC1037i.mo792j() : null;
                return abstractC9634aMo792j == null ? AbstractC9634a.a.f49330b : abstractC9634aMo792j;
            }
        }, new InterfaceC2041a<C1042k0.b>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C1042k0.b mo807E() {
                C1042k0.b bVarMo470i;
                InterfaceC1048n0 interfaceC1048n0M16770y = C8573r0.m16770y(interfaceC9070cM13373b);
                InterfaceC1037i interfaceC1037i = interfaceC1048n0M16770y instanceof InterfaceC1037i ? (InterfaceC1037i) interfaceC1048n0M16770y : null;
                if (interfaceC1037i == null || (bVarMo470i = interfaceC1037i.mo470i()) == null) {
                    bVarMo470i = this.mo470i();
                }
                C5207g.m11110e(bVarMo470i, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return bVarMo470i;
            }
        });
        this.f28732C0 = new C1681f(C5209i.m11118a(C8063f.class), new InterfaceC2041a<Bundle>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$special$$inlined$navArgs$1
            {
                super(0);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final Bundle mo807E() {
                Fragment fragment = this;
                Bundle bundle = fragment.f6101g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException(C0166e.m764j("Fragment ", fragment, " has null arguments"));
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: T */
    public final void mo3571T() {
        this.f6090a0 = true;
        m10211p0().mo9421x(AppUsageType.Listening);
    }

    @Override // androidx.fragment.app.Fragment
    /* JADX INFO: renamed from: U */
    public final void mo3572U(View view, Bundle bundle) {
        C5207g.m11111f(view, "view");
        C5509a c5509a = new C5509a(16, this);
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        C10029b0.i.m18727u(view, c5509a);
        C9415i0 c9415i0 = new C9415i0(m3578a0());
        AbstractC9409f0 abstractC9409f0M17816c = c9415i0.m17816c(R.transition.slide_up);
        abstractC9409f0M17816c.mo17785L(C10437a.m19409b(0.05f, 0.7f, 0.1f, 1.0f));
        abstractC9409f0M17816c.mo17783J(400L);
        m3585f0(abstractC9409f0M17816c);
        AbstractC9409f0 abstractC9409f0M17816c2 = c9415i0.m17816c(R.transition.slide_down);
        abstractC9409f0M17816c2.mo17785L(C10437a.m19409b(0.3f, 0.0f, 0.8f, 0.15f));
        abstractC9409f0M17816c2.mo17783J(200L);
        m3591j0(abstractC9409f0M17816c2);
        C7796d c7796d = this.f28733D0;
        if (c7796d == null) {
            C5207g.m11117l("analytics");
            throw null;
        }
        c7796d.m15505b(null, "listening_mode_on");
        C4411a c4411a = new C4411a(new C4390c());
        C8355s0 c8355s0M10210o0 = m10210o0();
        RecyclerView recyclerView = c8355s0M10210o0.f45240q;
        m3578a0();
        final int i10 = 1;
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        List<Integer> list = C6716m.f37937a;
        recyclerView.m4199g(new C8049h((int) C6716m.m13316a(16)));
        recyclerView.setAdapter(c4411a);
        c8355s0M10210o0.f45246w.setSelected(true);
        c8355s0M10210o0.f45245v.setSelected(true);
        ImageView imageView = c8355s0M10210o0.f45235l;
        C5207g.m11110e(imageView, "ivLesson");
        C4924a.m10438Q(imageView, Integer.valueOf(R.drawable.ic_none), 0.0f, 0, 0, 14);
        final int i11 = 0;
        c8355s0M10210o0.f45242s.setOnClickListener(new View.OnClickListener(this) { // from class: oj.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43758b;

            {
                this.f43758b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                ListeningModeFragment listeningModeFragment = this.f43758b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        YouTubePlayerView youTubePlayerView = listeningModeFragment.m10210o0().f45247x;
                        C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                        C4924a.m10422A(youTubePlayerView);
                        listeningModeFragment.m10210o0().f45247x.m10491a(new ListeningModeFragment.C4389b());
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.k.f47226a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.m.f47228a);
                        break;
                }
            }
        });
        c8355s0M10210o0.f45230g.setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.player.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f28891b;

            {
                this.f28891b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                ListeningModeFragment listeningModeFragment = this.f28891b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
                        C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModelM10211p0), null, null, new ListeningModeViewModel$enableSentenceMode$1(listeningModeViewModelM10211p0, null), 3);
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.a.f47216a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.i.f47224a);
                        break;
                }
            }
        });
        c8355s0M10210o0.f45227d.setOnClickListener(new View.OnClickListener(this) { // from class: oj.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43755b;

            {
                this.f43755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                ListeningModeFragment listeningModeFragment = this.f43755b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.b.f47217a);
                        PlayerController playerController = listeningModeFragment.f28734E0;
                        if (playerController == null) {
                            C5207g.m11117l("playerController");
                            throw null;
                        }
                        playerController.pause();
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.h.f47223a);
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.d.f47219a);
                        return;
                }
            }
        });
        c8355s0M10210o0.f45225b.setOnClickListener(new View.OnClickListener(this) { // from class: oj.e

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43760b;

            {
                this.f43760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i11;
                ListeningModeFragment listeningModeFragment = this.f43760b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.c.f47218a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.j.f47225a);
                        break;
                }
            }
        });
        c8355s0M10210o0.f45229f.setOnClickListener(new View.OnClickListener(this) { // from class: oj.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43758b;

            {
                this.f43758b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i12 = i10;
                ListeningModeFragment listeningModeFragment = this.f43758b;
                switch (i12) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        YouTubePlayerView youTubePlayerView = listeningModeFragment.m10210o0().f45247x;
                        C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                        C4924a.m10422A(youTubePlayerView);
                        listeningModeFragment.m10210o0().f45247x.m10491a(new ListeningModeFragment.C4389b());
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.k.f47226a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.m.f47228a);
                        break;
                }
            }
        });
        final int i12 = 2;
        c8355s0M10210o0.f45233j.setOnClickListener(new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.player.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f28891b;

            {
                this.f28891b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                ListeningModeFragment listeningModeFragment = this.f28891b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
                        C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModelM10211p0), null, null, new ListeningModeViewModel$enableSentenceMode$1(listeningModeViewModelM10211p0, null), 3);
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.a.f47216a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.i.f47224a);
                        break;
                }
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: oj.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43755b;

            {
                this.f43755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                ListeningModeFragment listeningModeFragment = this.f43755b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.b.f47217a);
                        PlayerController playerController = listeningModeFragment.f28734E0;
                        if (playerController == null) {
                            C5207g.m11117l("playerController");
                            throw null;
                        }
                        playerController.pause();
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.h.f47223a);
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.d.f47219a);
                        return;
                }
            }
        };
        ImageButton imageButton = c8355s0M10210o0.f45226c;
        imageButton.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: oj.e

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43760b;

            {
                this.f43760b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i10;
                ListeningModeFragment listeningModeFragment = this.f43760b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.c.f47218a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.j.f47225a);
                        break;
                }
            }
        };
        ImageButton imageButton2 = c8355s0M10210o0.f45228e;
        imageButton2.setOnClickListener(onClickListener2);
        View.OnClickListener onClickListener3 = new View.OnClickListener(this) { // from class: oj.d

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43758b;

            {
                this.f43758b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i12;
                ListeningModeFragment listeningModeFragment = this.f43758b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        YouTubePlayerView youTubePlayerView = listeningModeFragment.m10210o0().f45247x;
                        C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                        C4924a.m10422A(youTubePlayerView);
                        listeningModeFragment.m10210o0().f45247x.m10491a(new ListeningModeFragment.C4389b());
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.k.f47226a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.m.f47228a);
                        break;
                }
            }
        };
        LinearLayout linearLayout = c8355s0M10210o0.f45232i;
        linearLayout.setOnClickListener(onClickListener3);
        View.OnClickListener onClickListener4 = new View.OnClickListener(this) { // from class: com.lingq.ui.lesson.player.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f28891b;

            {
                this.f28891b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i11;
                ListeningModeFragment listeningModeFragment = this.f28891b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
                        C7828f.m15570d(C8573r0.m16767w0(listeningModeViewModelM10211p0), null, null, new ListeningModeViewModel$enableSentenceMode$1(listeningModeViewModelM10211p0, null), 3);
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        break;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.a.f47216a);
                        break;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.i.f47224a);
                        break;
                }
            }
        };
        LinearLayout linearLayout2 = c8355s0M10210o0.f45231h;
        linearLayout2.setOnClickListener(onClickListener4);
        View.OnClickListener onClickListener5 = new View.OnClickListener(this) { // from class: oj.b

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f43755b;

            {
                this.f43755b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i13 = i11;
                ListeningModeFragment listeningModeFragment = this.f43755b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.b.f47217a);
                        PlayerController playerController = listeningModeFragment.f28734E0;
                        if (playerController == null) {
                            C5207g.m11117l("playerController");
                            throw null;
                        }
                        playerController.pause();
                        C8573r0.m16725g0(listeningModeFragment).m3995p();
                        return;
                    case 1:
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.h.f47223a);
                        return;
                    default:
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                        C5207g.m11111f(listeningModeFragment, "this$0");
                        listeningModeFragment.m10211p0().m10213m2(AbstractC9006b.d.f47219a);
                        return;
                }
            }
        };
        LinearLayout linearLayout3 = c8355s0M10210o0.f45224a;
        linearLayout3.setOnClickListener(onClickListener5);
        c8355s0M10210o0.f45241r.f15509l.add(new InterfaceC6316a() { // from class: oj.c
            @Override // id.InterfaceC6316a
            /* JADX INFO: renamed from: a */
            public final void mo12944a(Object obj, float f3, boolean z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                ListeningModeFragment listeningModeFragment = this.f43756a;
                C5207g.m11111f(listeningModeFragment, "this$0");
                C5207g.m11111f((Slider) obj, "slider");
                if (z10) {
                    listeningModeFragment.m10211p0().m10213m2(new AbstractC9006b.l(f3));
                }
            }
        });
        C0980t0 c0980t0M3601v = m3601v();
        c0980t0M3601v.m3813c();
        C1052r c1052r = c0980t0M3601v.f6415d;
        YouTubePlayerView youTubePlayerView = m10210o0().f45247x;
        C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
        c1052r.mo3883a(youTubePlayerView);
        if (m10209n0().f43762b) {
            C4924a.m10457e0(linearLayout2);
            C4924a.m10457e0(linearLayout3);
            C4924a.m10442U(linearLayout);
            C4924a.m10442U(imageButton2);
            C4924a.m10442U(imageButton);
        } else {
            C4924a.m10442U(linearLayout2);
            C4924a.m10442U(linearLayout3);
            C4924a.m10457e0(linearLayout);
            C4924a.m10457e0(imageButton2);
            C4924a.m10457e0(imageButton);
        }
        YouTubePlayerView youTubePlayerView2 = m10210o0().f45247x;
        youTubePlayerView2.f32165b.getWebViewYouTubePlayer$core_release().m17276b(new C4388a());
        C7828f.m15570d(C7499b.m14906H(this), null, null, new ListeningModeFragment$onViewCreated$5(this, null), 3).mo15620r1(new InterfaceC2052l<Throwable, C9072e>() { // from class: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$6
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(Throwable th2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                this.f28749b.m10211p0().mo9731b0(true);
                return C9072e.f47360a;
            }
        });
        C7828f.m15570d(C7499b.m14906H(m3601v()), null, null, new C4391xe338ff11(this, Lifecycle.State.STARTED, null, this, c4411a), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n0 */
    public final C8063f m10209n0() {
        return (C8063f) this.f28732C0.getValue();
    }

    /* JADX INFO: renamed from: o0 */
    public final C8355s0 m10210o0() {
        return (C8355s0) this.f28730A0.m10489a(this, f28729F0[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public final ListeningModeViewModel m10211p0() {
        return (ListeningModeViewModel) this.f28731B0.getValue();
    }
}
