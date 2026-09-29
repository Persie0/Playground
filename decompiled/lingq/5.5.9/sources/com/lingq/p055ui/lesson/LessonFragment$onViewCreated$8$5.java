package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.fragment.app.C0980t0;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.info.LessonInfoParent;
import com.lingq.p055ui.lesson.player.LessonPlayerView;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.linguist.R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import dm.C5207g;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kh.C6682i;
import kh.C6684k;
import kh.C6693t;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6744b;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import no.C7828f;
import no.InterfaceC7882z;
import p040c4.C1676a;
import p096ei.C5408a;
import p160hj.C6062h;
import p260m8.C7499b;
import p304ok.InterfaceC8066b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8278e4;
import pk.AbstractC8400a;
import sh.AbstractC9006b;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5", m19206f = "LessonFragment.kt", m19207l = {467}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27284e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27285f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42151 extends SuspendLambda implements InterfaceC2056p<LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27286e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27287f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27288a;

            public a(LessonFragment lessonFragment) {
                this.f27288a = lessonFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27288a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                lessonFragment.m10110r0(true);
                LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                lessonViewModelM10109q0.f27454Z0.setValue(Resource.Status.LOADING);
                C4924a.m10450b(lessonViewModelM10109q0.f27440U1);
                lessonViewModelM10109q0.f27440U1 = C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), lessonViewModelM10109q0.f27423P, null, new LessonViewModel$fetchLesson$1(lessonViewModelM10109q0, null, true), 2);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27289a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Integer f27290b;

            public b(LessonFragment lessonFragment, Integer num) {
                this.f27289a = lessonFragment;
                this.f27290b = num;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27289a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                if (lessonFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                    Integer num = this.f27290b;
                    if (lessonViewModelM10109q0.m10149v2(num.intValue())) {
                        LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                        C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), null, null, new LessonViewModel$showBuyPremiumLesson$1(lessonViewModelM10109q1, num.intValue(), null), 3);
                    } else {
                        lessonFragment.m10107o0().f44701l.f7742c.f7767a.remove(lessonFragment.f27061H0);
                        lessonFragment.m10109q0().f27490k0.mo14371k(Integer.valueOf(num.intValue()));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$c */
        public static final class c implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27291a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ Integer f27292b;

            public c(LessonFragment lessonFragment, Integer num) {
                this.f27291a = lessonFragment;
                this.f27292b = num;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27291a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                if (lessonFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                    LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                    Integer num = this.f27292b;
                    if (lessonViewModelM10109q0.m10149v2(num.intValue())) {
                        LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                        C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), null, null, new LessonViewModel$showBuyPremiumLesson$1(lessonViewModelM10109q1, num.intValue(), null), 3);
                    } else {
                        lessonFragment.m10107o0().f44701l.f7742c.f7767a.remove(lessonFragment.f27061H0);
                        lessonFragment.m10109q0().f27490k0.mo14371k(Integer.valueOf(num.intValue()));
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$d */
        public static final class d implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27293a;

            public d(LessonFragment lessonFragment) {
                this.f27293a = lessonFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27293a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                lessonFragment.m10109q0().m10135B2(AbstractC9006b.f.f47221a);
                LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$navigateLessonEdit$1(lessonViewModelM10109q0, null), 3);
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$e */
        public static final class e implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27294a;

            public e(LessonFragment lessonFragment) {
                this.f27294a = lessonFragment;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27294a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C1676a(R.id.actionToLessonSettings));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$f */
        public static final class f implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27295a;

            public f(LessonFragment lessonFragment) {
                this.f27295a = lessonFragment;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                String str2;
                LessonFragment lessonFragment = this.f27295a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
                UserLanguage value = lessonViewModelM10109q0.mo509w0().getValue();
                if (value == null || (str = value.f21734i) == null) {
                    str = "en";
                }
                UserLanguage value2 = lessonViewModelM10109q0.mo509w0().getValue();
                if (value2 == null || (str2 = value2.f21735j) == null) {
                    str2 = "";
                }
                lessonViewModelM10109q0.m10134A2(new AbstractC4269c.b(C0166e.m766l("https://www.lingq.com/", str, "/grammar-resource/", str2, "/")));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$g */
        public static final class g implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27296a;

            public g(LessonFragment lessonFragment) {
                this.f27296a = lessonFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27296a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6693t("https://www.lingq.com/how-to-use-lingq/", lessonFragment.m3600t(R.string.settings_text_help)));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$h */
        public static final class h implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27297a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonStudy f27298b;

            public h(LessonFragment lessonFragment, LessonStudy lessonStudy) {
                this.f27297a = lessonFragment;
                this.f27298b = lessonStudy;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27297a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                LessonStudy lessonStudy = this.f27298b;
                int i10 = lessonStudy.f21815a;
                String str = lessonStudy.f21816b;
                String str2 = lessonStudy.f21819e;
                String str3 = str2 == null ? "" : str2;
                String str4 = lessonStudy.f21818d;
                String str5 = str4 == null ? "" : str4;
                String str6 = lessonStudy.f21817c;
                if (str6 == null) {
                    str6 = "";
                }
                LessonInfoParent lessonInfoParent = LessonInfoParent.Lesson;
                C5207g.m11111f(str, "title");
                C5207g.m11111f(lessonInfoParent, "from");
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6682i(i10, str, str3, str5, str6, lessonInfoParent));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$i */
        public static final class i implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27299a;

            public i(LessonFragment lessonFragment) {
                this.f27299a = lessonFragment;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonFragment lessonFragment = this.f27299a;
                PopupWindow popupWindow = lessonFragment.f27058E0;
                if (popupWindow == null) {
                    C5207g.m11117l("popupSettings");
                    throw null;
                }
                popupWindow.dismiss();
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6062h(lessonFragment.m10109q0().m10152y2(), false));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$j */
        public static final class j implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27300a;

            public j(LessonFragment lessonFragment) {
                this.f27300a = lessonFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                LessonFragment lessonFragment = this.f27300a;
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C6684k(lessonFragment.m10109q0().m10152y2(), true, true));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$5$1$k */
        public static final class k extends AbstractC8400a {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonStudy f27301a;

            public k(LessonStudy lessonStudy) {
                this.f27301a = lessonStudy;
            }

            @Override // pk.AbstractC8400a, pk.InterfaceC8403d
            /* JADX INFO: renamed from: h */
            public final void mo10114h(InterfaceC8066b interfaceC8066b) {
                Collection collectionM13448p0;
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                String str = this.f27301a.f21835u;
                if (str != null) {
                    List listM14273d = new Regex("\\?v=").m14273d(str);
                    if (!listM14273d.isEmpty()) {
                        ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                collectionM13448p0 = EmptyList.f38032a;
                                break;
                            } else {
                                if (!(((String) listIterator.previous()).length() == 0)) {
                                    collectionM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                                    break;
                                }
                            }
                        }
                    } else {
                        collectionM13448p0 = EmptyList.f38032a;
                        break;
                    }
                    String[] strArr = (String[]) collectionM13448p0.toArray(new String[0]);
                    if (strArr.length > 1) {
                        interfaceC8066b.mo15931b(0.0f, (String) new Regex("&").m14273d(strArr[1]).get(0));
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42151(LessonFragment lessonFragment, InterfaceC9968c<? super C42151> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27287f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42151 c42151 = new C42151(this.f27287f, interfaceC9968c);
            c42151.f27286e = obj;
            return c42151;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42151) mo1336a(lessonStudy, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x014a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudy lessonStudy = (LessonStudy) this.f27286e;
            LessonFragment lessonFragment = this.f27287f;
            C8278e4 c8278e4 = lessonFragment.f27059F0;
            if (c8278e4 == null) {
                C5207g.m11117l("viewLessonMenuBinding");
                throw null;
            }
            c8278e4.f44743h.setOnClickListener(new a(lessonFragment));
            c8278e4.f44746k.setText(lessonStudy.f21816b);
            boolean zM11572e = C5408a.m11572e(lessonFragment.m10109q0().mo498E1());
            Integer num = lessonStudy.f21826l;
            Integer num2 = lessonStudy.f21825k;
            Integer num3 = !zM11572e ? num : num2;
            if (!C5408a.m11572e(lessonFragment.m10109q0().mo498E1())) {
                num = num2;
            }
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            boolean z10 = false;
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), null, null, new LessonViewModel$getLessonCounters$1(lessonViewModelM10109q0, C6744b.m13378j0(new Integer[]{num3, num}), null), 3);
            ImageView imageView = c8278e4.f44741f;
            if (num3 != null) {
                imageView.setOnClickListener(new b(lessonFragment, num3));
            } else {
                C5207g.m11110e(imageView, "btnNextLesson");
                C4924a.m10422A(imageView);
            }
            ImageView imageView2 = c8278e4.f44742g;
            if (num != null) {
                imageView2.setOnClickListener(new c(lessonFragment, num));
            } else {
                C5207g.m11110e(imageView2, "btnPreviousLesson");
                C4924a.m10422A(imageView2);
            }
            c8278e4.f44739d.setOnClickListener(new d(lessonFragment));
            c8278e4.f44744i.setOnClickListener(new e(lessonFragment));
            c8278e4.f44737b.setOnClickListener(new f(lessonFragment));
            c8278e4.f44738c.setOnClickListener(new g(lessonFragment));
            c8278e4.f44740e.setOnClickListener(new h(lessonFragment, lessonStudy));
            c8278e4.f44745j.setOnClickListener(new i(lessonFragment));
            lessonFragment.m10107o0().f44712w.getClass();
            String str = lessonStudy.f21835u;
            if (str == null || lessonFragment.m10109q0().m10151x2()) {
                ImageView imageView3 = lessonFragment.m10107o0().f44705p;
                C5207g.m11110e(imageView3, "binding.tbPlayVideo");
                C4924a.m10442U(imageView3);
            } else {
                LessonPlayerView lessonPlayerView = lessonFragment.m10107o0().f44712w;
                C5207g.m11110e(lessonPlayerView, "binding.viewPlayer");
                if (lessonPlayerView.getVisibility() == 0) {
                    z10 = true;
                }
                if (z10) {
                    ImageView imageView4 = lessonFragment.m10107o0().f44705p;
                    C5207g.m11110e(imageView4, "binding.tbPlayVideo");
                    C4924a.m10442U(imageView4);
                } else {
                    ImageView imageView5 = lessonFragment.m10107o0().f44705p;
                    C5207g.m11110e(imageView5, "binding.tbPlayVideo");
                    C4924a.m10457e0(imageView5);
                    lessonFragment.m10107o0().f44705p.setOnClickListener(new j(lessonFragment));
                }
            }
            String str2 = lessonStudy.f21820f;
            if (str2 == null && str != null) {
                ImageView imageView6 = lessonFragment.m10107o0().f44703n;
                C5207g.m11110e(imageView6, "binding.tbPlay");
                C4924a.m10442U(imageView6);
            }
            if (lessonStudy.f21834t == null) {
                LessonViewModel lessonViewModelM10109q1 = lessonFragment.m10109q0();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q1), lessonViewModelM10109q1.f27423P, null, new LessonViewModel$updateIsTaken$1(lessonViewModelM10109q1, lessonStudy.f21815a, null), 2);
            }
            if (str != null && str2 == null) {
                C0980t0 c0980t0M3601v = lessonFragment.m3601v();
                c0980t0M3601v.m3813c();
                C1052r c1052r = c0980t0M3601v.f6415d;
                YouTubePlayerView youTubePlayerView = lessonFragment.m10107o0().f44689A;
                C5207g.m11110e(youTubePlayerView, "binding.youtubePlayerView");
                c1052r.mo3883a(youTubePlayerView);
                lessonFragment.m10107o0().f44689A.f32165b.getWebViewYouTubePlayer$core_release().m17276b(new k(lessonStudy));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$5(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27285f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$5(this.f27285f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27284e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27285f;
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lessonFragment.m10109q0().f27517x0);
            C42151 c42151 = new C42151(lessonFragment, null);
            this.f27284e = 1;
            if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, c42151, this) == coroutineSingletons) {
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
