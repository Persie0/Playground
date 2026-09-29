package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.AbstractC3299d;
import com.lingq.player.C3300e;
import com.lingq.util.C4924a;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import ki.C6695a;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7133n;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p304ok.InterfaceC8066b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import pk.InterfaceC8402c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$1", m19206f = "ListeningModeFragment.kt", m19207l = {270}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28750e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28751f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lki/a;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$1$1", m19206f = "ListeningModeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43931 extends SuspendLambda implements InterfaceC2056p<C6695a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28752e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeFragment f28753f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$1$1$a */
        public static final class a implements InterfaceC8402c {
            @Override // pk.InterfaceC8402c
            /* JADX INFO: renamed from: a */
            public final void mo5247a(InterfaceC8066b interfaceC8066b) {
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                interfaceC8066b.pause();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43931(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super C43931> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28753f = listeningModeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43931 c43931 = new C43931(this.f28753f, interfaceC9968c);
            c43931.f28752e = obj;
            return c43931;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6695a c6695a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43931) mo1336a(c6695a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0075  */
        /* JADX WARN: Code duplicated, block: B:13:0x008a  */
        /* JADX WARN: Code duplicated, block: B:15:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:16:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:19:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:21:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:26:0x0119  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C3300e value;
            TextView textView;
            ViewGroup.LayoutParams layoutParams;
            InterfaceC7133n<C3300e> interfaceC7133nMo9424y0;
            C3300e value2;
            TextView textView2;
            ViewGroup.LayoutParams layoutParams2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6695a c6695a = (C6695a) this.f28752e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28753f;
            listeningModeFragment.m10210o0().f45246w.setText(c6695a.f37848b);
            listeningModeFragment.m10210o0().f45245v.setText(c6695a.f37850d);
            ImageView imageView = listeningModeFragment.m10210o0().f45235l;
            C5207g.m11110e(imageView, "binding.ivLesson");
            C4924a.m10438Q(imageView, c6695a.f37849c, 0.0f, 0, 0, 14);
            if (c6695a.f37851e != null && c6695a.f37852f == null) {
                YouTubePlayerView youTubePlayerView = listeningModeFragment.m10210o0().f45247x;
                C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                C4924a.m10457e0(youTubePlayerView);
                if (C7777d.m15480a(listeningModeFragment)) {
                    ImageView imageView2 = listeningModeFragment.m10210o0().f45235l;
                    C5207g.m11110e(imageView2, "binding.ivLesson");
                    C4924a.m10442U(imageView2);
                    textView2 = listeningModeFragment.m10210o0().f45246w;
                    C5207g.m11110e(textView2, "binding.tvTitlePlayer");
                    layoutParams2 = textView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) layoutParams2;
                    c0759b.f5331j = listeningModeFragment.m10210o0().f45247x.getId();
                    textView2.setLayoutParams(c0759b);
                } else {
                    ImageView imageView3 = listeningModeFragment.m10210o0().f45235l;
                    C5207g.m11110e(imageView3, "binding.ivLesson");
                    C4924a.m10457e0(imageView3);
                    textView = listeningModeFragment.m10210o0().f45246w;
                    C5207g.m11110e(textView, "binding.tvTitlePlayer");
                    layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C0759b c0759b2 = (ConstraintLayout.C0759b) layoutParams;
                    c0759b2.f5333k = listeningModeFragment.m10210o0().f45234k.getId();
                    textView.setLayoutParams(c0759b2);
                }
                interfaceC7133nMo9424y0 = listeningModeFragment.m10211p0().mo9424y0();
                do {
                    value2 = interfaceC7133nMo9424y0.getValue();
                } while (!interfaceC7133nMo9424y0.mo14366c(value2, C3300e.m9433b(value2, AbstractC3299d.c.f17756a, null, 2)));
            } else if (listeningModeFragment.m10209n0().f43763c && listeningModeFragment.m10209n0().f43762b) {
                YouTubePlayerView youTubePlayerView2 = listeningModeFragment.m10210o0().f45247x;
                C5207g.m11110e(youTubePlayerView2, "binding.youtubePlayerView");
                C4924a.m10457e0(youTubePlayerView2);
                if (C7777d.m15480a(listeningModeFragment)) {
                    ImageView imageView4 = listeningModeFragment.m10210o0().f45235l;
                    C5207g.m11110e(imageView4, "binding.ivLesson");
                    C4924a.m10442U(imageView4);
                    textView2 = listeningModeFragment.m10210o0().f45246w;
                    C5207g.m11110e(textView2, "binding.tvTitlePlayer");
                    layoutParams2 = textView2.getLayoutParams();
                    if (layoutParams2 != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C0759b c0759b3 = (ConstraintLayout.C0759b) layoutParams2;
                    c0759b3.f5331j = listeningModeFragment.m10210o0().f45247x.getId();
                    textView2.setLayoutParams(c0759b3);
                } else {
                    ImageView imageView5 = listeningModeFragment.m10210o0().f45235l;
                    C5207g.m11110e(imageView5, "binding.ivLesson");
                    C4924a.m10457e0(imageView5);
                    textView = listeningModeFragment.m10210o0().f45246w;
                    C5207g.m11110e(textView, "binding.tvTitlePlayer");
                    layoutParams = textView.getLayoutParams();
                    if (layoutParams != null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C0759b c0759b4 = (ConstraintLayout.C0759b) layoutParams;
                    c0759b4.f5333k = listeningModeFragment.m10210o0().f45234k.getId();
                    textView.setLayoutParams(c0759b4);
                }
                interfaceC7133nMo9424y0 = listeningModeFragment.m10211p0().mo9424y0();
                do {
                    value2 = interfaceC7133nMo9424y0.getValue();
                } while (!interfaceC7133nMo9424y0.mo14366c(value2, C3300e.m9433b(value2, AbstractC3299d.c.f17756a, null, 2)));
            } else {
                listeningModeFragment.m10210o0().f45247x.m10491a(new a());
                YouTubePlayerView youTubePlayerView3 = listeningModeFragment.m10210o0().f45247x;
                C5207g.m11110e(youTubePlayerView3, "binding.youtubePlayerView");
                C4924a.m10442U(youTubePlayerView3);
                ImageView imageView6 = listeningModeFragment.m10210o0().f45235l;
                C5207g.m11110e(imageView6, "binding.ivLesson");
                C4924a.m10457e0(imageView6);
                if (C7777d.m15480a(listeningModeFragment)) {
                    TextView textView3 = listeningModeFragment.m10210o0().f45246w;
                    C5207g.m11110e(textView3, "binding.tvTitlePlayer");
                    ViewGroup.LayoutParams layoutParams3 = textView3.getLayoutParams();
                    if (layoutParams3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    ConstraintLayout.C0759b c0759b5 = (ConstraintLayout.C0759b) layoutParams3;
                    c0759b5.f5331j = listeningModeFragment.m10210o0().f45235l.getId();
                    textView3.setLayoutParams(c0759b5);
                }
                InterfaceC7133n<C3300e> interfaceC7133nMo9424y1 = listeningModeFragment.m10211p0().mo9424y0();
                do {
                    value = interfaceC7133nMo9424y1.getValue();
                } while (!interfaceC7133nMo9424y1.mo14366c(value, C3300e.m9433b(value, AbstractC3299d.a.f17754a, null, 2)));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$1(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super ListeningModeFragment$onViewCreated$7$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28751f = listeningModeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$1(this.f28751f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28750e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28751f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(listeningModeFragment.m10211p0().f28794J);
            C43931 c43931 = new C43931(listeningModeFragment, null);
            this.f28750e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c43931, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
