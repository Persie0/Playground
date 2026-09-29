package com.lingq.p055ui.info;

import ae.C0062b;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import com.lingq.util.C4924a;
import com.lingq.util.ImageSize;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p137gj.C5806b;
import p137gj.C5810f;
import p137gj.ViewTreeObserverOnGlobalLayoutListenerC5807c;
import p225kk.C6716m;
import p254m2.C7472a;
import p260m8.C7499b;
import p301oh.C8045d;
import p338qd.C8573r0;
import p408u6.ViewOnClickListenerC9466e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p512yi.ViewOnClickListenerC10371b;
import ph.C8328n0;
import si.ViewOnClickListenerC9029m;
import sl.C9072e;
import vi.ViewOnClickListenerC9734i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$2", m19206f = "LessonInfoFragment.kt", m19207l = {168}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26871e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26872f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/library/LessonInfo;", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$2$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41391 extends SuspendLambda implements InterfaceC2056p<Pair<? extends LessonInfo, ? extends LibraryItemCounter>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26873e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41391(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41391> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26874f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41391 c41391 = new C41391(this.f26874f, interfaceC9968c);
            c41391.f26873e = obj;
            return c41391;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends LessonInfo, ? extends LibraryItemCounter> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41391) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        /* JADX WARN: Code duplicated, block: B:21:0x0054  */
        /* JADX WARN: Code duplicated, block: B:22:0x0060  */
        /* JADX WARN: Code duplicated, block: B:92:0x029f  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LessonInfo lessonInfo;
            String str;
            List<String> list;
            boolean z10;
            boolean z11;
            boolean z12;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f26873e;
            if (pair != null && (lessonInfo = (LessonInfo) pair.f38012a) != null) {
                LibraryItemCounter libraryItemCounter = (LibraryItemCounter) pair.f38013b;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                final LessonInfoFragment lessonInfoFragment = this.f26874f;
                C8328n0 c8328n0M10098w0 = lessonInfoFragment.m10098w0();
                if (lessonInfoFragment.m10097v0().f35088c.length() == 0) {
                    ImageSize imageSize = ImageSize.Original;
                    str = lessonInfo.f21989z;
                    String strM10423B = C4924a.m10423B(str, lessonInfo.f21967d, imageSize);
                    if (str != null) {
                        lessonInfoFragment.m10098w0().f45068l.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        lessonInfoFragment.m10098w0().f45068l.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    }
                    Context contextM3578a0 = lessonInfoFragment.m3578a0();
                    ComponentCallbacks2C2080b.m6236b(contextM3578a0).m6375f(contextM3578a0).m6254c().m6247G(strM10423B).m6251z(new C5806b(strM10423B, lessonInfoFragment)).m6245E(lessonInfoFragment.m10098w0().f45068l);
                } else {
                    String str2 = lessonInfoFragment.m10097v0().f35089d;
                    if (str2 == null || str2.length() == 0) {
                        ImageSize imageSize2 = ImageSize.Original;
                        str = lessonInfo.f21989z;
                        String strM10423B2 = C4924a.m10423B(str, lessonInfo.f21967d, imageSize2);
                        if (str != null) {
                            lessonInfoFragment.m10098w0().f45068l.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        } else {
                            lessonInfoFragment.m10098w0().f45068l.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        }
                        Context contextM3578a1 = lessonInfoFragment.m3578a0();
                        ComponentCallbacks2C2080b.m6236b(contextM3578a1).m6375f(contextM3578a1).m6254c().m6247G(strM10423B2).m6251z(new C5806b(strM10423B2, lessonInfoFragment)).m6245E(lessonInfoFragment.m10098w0().f45068l);
                    }
                }
                String str3 = lessonInfo.f21966c;
                LessonMediaSource lessonMediaSource = lessonInfo.f21960K;
                String str4 = lessonInfo.f21969f;
                if (str3 != null) {
                    TextView textView = lessonInfoFragment.m10098w0().f45076t;
                    C5207g.m11110e(textView, "binding.tvLessonDescriptionTitle");
                    if (textView.getVisibility() != 8 && C7661i.m15250P2(str3)) {
                        textView.setVisibility(8);
                    }
                    LinearLayout linearLayout = lessonInfoFragment.m10098w0().f45063g;
                    C5207g.m11110e(linearLayout, "binding.btnMoreFromSource");
                    if (linearLayout.getVisibility() != 8 && C7661i.m15250P2(lessonInfoFragment.m10097v0().f35090e)) {
                        linearLayout.setVisibility(8);
                    }
                    if (lessonMediaSource != null && C5207g.m11106a(str4, "external") && (!C7661i.m15250P2(str3))) {
                        TextView textView2 = lessonInfoFragment.m10098w0().f45075s;
                        String strM3600t = lessonInfoFragment.m3600t(R.string.lesson_info_import_content);
                        C5207g.m11110e(strM3600t, "getString(R.string.lesson_info_import_content)");
                        String str5 = String.format(strM3600t, Arrays.copyOf(new Object[]{str3}, 1));
                        C5207g.m11110e(str5, "format(format, *args)");
                        textView2.setText(str5);
                        LinearLayout linearLayout2 = lessonInfoFragment.m10098w0().f45063g;
                        C5207g.m11110e(linearLayout2, "binding.btnMoreFromSource");
                        C4924a.m10457e0(linearLayout2);
                        TextView textView3 = lessonInfoFragment.m10098w0().f45044A;
                        String strM3600t2 = lessonInfoFragment.m3600t(R.string.lesson_info_more_from_source);
                        C5207g.m11110e(strM3600t2, "getString(R.string.lesson_info_more_from_source)");
                        String str6 = String.format(strM3600t2, Arrays.copyOf(new Object[]{str3}, 1));
                        C5207g.m11110e(str6, "format(format, *args)");
                        textView3.setText(str6);
                    } else {
                        lessonInfoFragment.m10098w0().f45075s.setText(str3);
                        LinearLayout linearLayout3 = lessonInfoFragment.m10098w0().f45063g;
                        C5207g.m11110e(linearLayout3, "binding.btnMoreFromSource");
                        C4924a.m10442U(linearLayout3);
                    }
                    TextView textView4 = lessonInfoFragment.m10098w0().f45075s;
                    C5207g.m11110e(textView4, "binding.tvLessonDescription");
                    if (textView4.getVisibility() != 8 && C7661i.m15250P2(str3)) {
                        textView4.setVisibility(8);
                    }
                }
                lessonInfoFragment.m10098w0().f45079w.setText(lessonInfo.f21965b);
                c8328n0M10098w0.f45080x.setText(lessonInfo.f21959J);
                Integer num = lessonInfo.f21978o;
                int iIntValue = num != null ? num.intValue() : 0;
                LinearProgressIndicator linearProgressIndicator = c8328n0M10098w0.f45054K;
                linearProgressIndicator.setMax(iIntValue);
                int iIntValue2 = num != null ? num.intValue() : 0;
                LinearProgressIndicator linearProgressIndicator2 = c8328n0M10098w0.f45055L;
                linearProgressIndicator2.setMax(iIntValue2);
                int iIntValue3 = num != null ? num.intValue() : 0;
                LinearProgressIndicator linearProgressIndicator3 = c8328n0M10098w0.f45056M;
                linearProgressIndicator3.setMax(iIntValue3);
                List<Integer> list2 = C6716m.f37937a;
                String strM13317b = C6716m.m13317b(((long) lessonInfo.f21970g) * ((long) 1000));
                TextView textView5 = c8328n0M10098w0.f45072p;
                textView5.setText(strM13317b);
                textView5.setVisibility(Boolean.valueOf(C7661i.m15250P2(strM13317b) ^ true).booleanValue() ? 0 : 4);
                Resources resourcesM3599s = lessonInfoFragment.m3599s();
                int i10 = lessonInfo.f21980q;
                c8328n0M10098w0.f45081y.setText(resourcesM3599s.getQuantityString(R.plurals.lingq_likes_count_like, i10, Integer.valueOf(i10)));
                Context contextM3578a2 = lessonInfoFragment.m3578a0();
                ComponentCallbacks2C2080b.m6236b(contextM3578a2).m6375f(contextM3578a2).m6259o(lessonInfo.f21953D).m12716c().m6245E(c8328n0M10098w0.f45069m);
                boolean zM11106a = C5207g.m11106a(str4, "private");
                TextView textView6 = c8328n0M10098w0.f45046C;
                TextView textView7 = c8328n0M10098w0.f45047D;
                if (zM11106a || C5207g.m11106a(str4, "D")) {
                    C5207g.m11110e(textView7, "tvSharedByTitle");
                    C4924a.m10422A(textView7);
                    textView6.setText("PRIVATE");
                } else {
                    C5207g.m11110e(textView7, "tvSharedByTitle");
                    C4924a.m10457e0(textView7);
                    textView6.setText(lessonInfo.f21952C);
                }
                lessonInfoFragment.m3578a0();
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
                RecyclerView recyclerView = c8328n0M10098w0.f45071o;
                recyclerView.setLayoutManager(linearLayoutManager);
                if (recyclerView.getItemDecorationCount() > 0) {
                    recyclerView.m4193b0();
                }
                recyclerView.m4199g(new C8045d((int) C6716m.m13316a(5)));
                C5810f c5810f = lessonInfoFragment.f26843U0;
                if (c5810f == null) {
                    C5207g.m11117l("lessonTagsAdapter");
                    throw null;
                }
                recyclerView.setAdapter(c5810f);
                int visibility = recyclerView.getVisibility();
                List<String> list3 = lessonInfo.f21956G;
                if (visibility != 8) {
                    list = list3;
                    if (list == null) {
                        z10 = false;
                    } else {
                        if (list.isEmpty()) {
                            z11 = true;
                            z12 = true;
                        } else {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z11 = true;
                                    if (!C7661i.m15250P2((String) it.next())) {
                                        z12 = false;
                                    }
                                } else {
                                    z11 = true;
                                    z12 = true;
                                }
                            }
                        }
                        if (z12 == z11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    }
                    if (z10) {
                        recyclerView.setVisibility(8);
                    }
                } else {
                    list = list3;
                }
                C5810f c5810f2 = lessonInfoFragment.f26843U0;
                if (c5810f2 == null) {
                    C5207g.m11117l("lessonTagsAdapter");
                    throw null;
                }
                c5810f2.m4529q(list);
                TextView textView8 = c8328n0M10098w0.f45075s;
                C5207g.m11110e(textView8, "tvLessonDescription");
                if (textView8.getVisibility() == 0) {
                    textView8.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC5807c(textView8, c8328n0M10098w0));
                }
                LinearLayout linearLayout4 = c8328n0M10098w0.f45060d;
                C5207g.m11110e(linearLayout4, "btnCourse");
                int visibility2 = linearLayout4.getVisibility();
                String str7 = lessonInfo.f21972i;
                if (visibility2 != 8) {
                    if (str7 == null || C7661i.m15250P2(str7)) {
                        linearLayout4.setVisibility(8);
                    }
                }
                String str8 = lessonInfo.f21962M;
                boolean z13 = str8 == null || C7661i.m15250P2(str8);
                LinearLayout linearLayout5 = c8328n0M10098w0.f45065i;
                if (z13) {
                    C5207g.m11110e(linearLayout5, "btnOriginalUrl");
                    C4924a.m10442U(linearLayout5);
                } else {
                    C5207g.m11110e(linearLayout5, "btnOriginalUrl");
                    C4924a.m10457e0(linearLayout5);
                    c8328n0M10098w0.f45045B.setText(str8);
                }
                c8328n0M10098w0.f45073q.setText(str7);
                boolean z14 = libraryItemCounter != null && libraryItemCounter.f22005b;
                ImageButton imageButton = c8328n0M10098w0.f45062f;
                if (z14) {
                    Context contextM3578a3 = lessonInfoFragment.m3578a0();
                    Object obj2 = C7472a.f41322a;
                    imageButton.setImageDrawable(C7472a.c.m14849b(contextM3578a3, R.drawable.ic_heart_filled_s));
                } else {
                    Context contextM3578a4 = lessonInfoFragment.m3578a0();
                    Object obj3 = C7472a.f41322a;
                    imageButton.setImageDrawable(C7472a.c.m14849b(contextM3578a4, R.drawable.ic_heart_s));
                }
                boolean z15 = libraryItemCounter != null && libraryItemCounter.f22009f;
                ImageButton imageButton2 = c8328n0M10098w0.f45059c;
                if (z15) {
                    imageButton2.setImageDrawable(C7472a.c.m14849b(lessonInfoFragment.m3578a0(), R.drawable.ic_check_thick));
                    List<Integer> list4 = C6716m.f37937a;
                    imageButton2.setColorFilter(C6716m.m13333r(R.attr.greenTint, lessonInfoFragment.m3578a0()));
                } else {
                    imageButton2.setImageDrawable(C7472a.c.m14849b(lessonInfoFragment.m3578a0(), R.drawable.ic_plus_s));
                }
                final int i11 = 0;
                c8328n0M10098w0.f45067k.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.ui.info.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = i11;
                        LessonInfoFragment lessonInfoFragment2 = lessonInfoFragment;
                        switch (i12) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                C8573r0.m16725g0(lessonInfoFragment2).m3995p();
                                break;
                            default:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment2.m10099x0();
                                String str9 = lessonInfoFragment2.m10097v0().f35090e;
                                C5207g.m11111f(str9, "query");
                                C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), null, null, new LessonInfoViewModel$navigateToSearchSource$1(lessonInfoViewModelM10099x0, str9, null), 3);
                                break;
                        }
                    }
                });
                final int i12 = 0;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.lingq.ui.info.c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13 = i12;
                        LessonInfoFragment lessonInfoFragment2 = lessonInfoFragment;
                        switch (i13) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment2.m10099x0();
                                LessonInfo lessonInfo2 = (LessonInfo) lessonInfoViewModelM10099x0.f26922J.getValue();
                                if (lessonInfo2 != null) {
                                    AbstractC4161d.b bVar = new AbstractC4161d.b(lessonInfo2);
                                    if (!lessonInfoViewModelM10099x0.m10102n2()) {
                                        lessonInfoViewModelM10099x0.f26934V.mo16479j(bVar);
                                    } else {
                                        C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), null, null, new LessonInfoViewModel$showBuyPremiumLesson$1(lessonInfoViewModelM10099x0, null), 3);
                                    }
                                }
                                break;
                            default:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                lessonInfoFragment2.m10099x0().m10104p2(InterfaceC4158a.c.f27043a);
                                break;
                        }
                    }
                };
                MaterialButton materialButton = c8328n0M10098w0.f45064h;
                materialButton.setOnClickListener(onClickListener);
                c8328n0M10098w0.f45066j.setOnClickListener(new ViewOnClickListenerC9734i(lessonInfoFragment, 9, c8328n0M10098w0));
                imageButton.setOnClickListener(new ViewOnClickListenerC10371b(4, lessonInfo, libraryItemCounter, lessonInfoFragment));
                c8328n0M10098w0.f45061e.setOnClickListener(new ViewOnClickListenerC9466e(lessonInfoFragment, 10, lessonInfo));
                if ((libraryItemCounter == null || libraryItemCounter.f22009f) ? false : true) {
                    final int i13 = 1;
                    imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.ui.info.c
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i14 = i13;
                            LessonInfoFragment lessonInfoFragment2 = lessonInfoFragment;
                            switch (i14) {
                                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                                    C5207g.m11111f(lessonInfoFragment2, "this$0");
                                    LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment2.m10099x0();
                                    LessonInfo lessonInfo2 = (LessonInfo) lessonInfoViewModelM10099x0.f26922J.getValue();
                                    if (lessonInfo2 != null) {
                                        AbstractC4161d.b bVar = new AbstractC4161d.b(lessonInfo2);
                                        if (!lessonInfoViewModelM10099x0.m10102n2()) {
                                            lessonInfoViewModelM10099x0.f26934V.mo16479j(bVar);
                                        } else {
                                            C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), null, null, new LessonInfoViewModel$showBuyPremiumLesson$1(lessonInfoViewModelM10099x0, null), 3);
                                        }
                                    }
                                    break;
                                default:
                                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonInfoFragment.f26838X0;
                                    C5207g.m11111f(lessonInfoFragment2, "this$0");
                                    lessonInfoFragment2.m10099x0().m10104p2(InterfaceC4158a.c.f27043a);
                                    break;
                            }
                        }
                    });
                }
                MaterialButton materialButton2 = c8328n0M10098w0.f45058b;
                C5207g.m11110e(materialButton2, "btnAddLessonToPlaylist");
                C4924a.m10457e0(materialButton2);
                materialButton2.setOnClickListener(new ViewOnClickListenerC2238x(15, lessonInfoFragment));
                linearLayout4.setOnClickListener(new ViewOnClickListenerC2239y(23, lessonInfoFragment));
                final int i14 = 1;
                c8328n0M10098w0.f45063g.setOnClickListener(new View.OnClickListener() { // from class: com.lingq.ui.info.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15 = i14;
                        LessonInfoFragment lessonInfoFragment2 = lessonInfoFragment;
                        switch (i15) {
                            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                C8573r0.m16725g0(lessonInfoFragment2).m3995p();
                                break;
                            default:
                                InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonInfoFragment.f26838X0;
                                C5207g.m11111f(lessonInfoFragment2, "this$0");
                                LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment2.m10099x0();
                                String str9 = lessonInfoFragment2.m10097v0().f35090e;
                                C5207g.m11111f(str9, "query");
                                C7828f.m15570d(C8573r0.m16767w0(lessonInfoViewModelM10099x0), null, null, new LessonInfoViewModel$navigateToSearchSource$1(lessonInfoViewModelM10099x0, str9, null), 3);
                                break;
                        }
                    }
                });
                linearLayout5.setOnClickListener(new ViewOnClickListenerC9029m(lessonInfo, 13, lessonInfoFragment));
                if (libraryItemCounter != null) {
                    int i15 = libraryItemCounter.f22014k;
                    c8328n0M10098w0.f45074r.setText(String.valueOf(i15));
                    linearProgressIndicator.setProgress(i15, true);
                    int i16 = libraryItemCounter.f22013j;
                    c8328n0M10098w0.f45048E.setText(String.valueOf(i16));
                    linearProgressIndicator3.setProgress(i16, true);
                    int i17 = libraryItemCounter.f22015l;
                    c8328n0M10098w0.f45082z.setText(String.valueOf(i17));
                    linearProgressIndicator2.setProgress(i17, true);
                }
                if (lessonMediaSource != null && C5207g.m11106a(str4, "external")) {
                    C4924a.m10422A(materialButton2);
                    C4924a.m10422A(imageButton);
                    C5207g.m11110e(imageButton2, "btnAddToContinueStudying");
                    C4924a.m10422A(imageButton2);
                    RelativeLayout relativeLayout = c8328n0M10098w0.f45050G;
                    C5207g.m11110e(relativeLayout, "viewDownload");
                    C4924a.m10422A(relativeLayout);
                    C4924a.m10442U(linearLayout4);
                    View view = c8328n0M10098w0.f45051H;
                    C5207g.m11110e(view, "viewDummy");
                    C4924a.m10442U(view);
                    TextView textView9 = c8328n0M10098w0.f45077u;
                    C5207g.m11110e(textView9, "tvLessonPreview");
                    C4924a.m10442U(textView9);
                    TextView textView10 = c8328n0M10098w0.f45078v;
                    C5207g.m11110e(textView10, "tvLessonPreviewTitle");
                    C4924a.m10442U(textView10);
                    LinearLayout linearLayout6 = (LinearLayout) c8328n0M10098w0.f45052I.f45111a;
                    C5207g.m11110e(linearLayout6, "viewLoadingLessonPreview.root");
                    C4924a.m10442U(linearLayout6);
                    materialButton.setText(lessonInfoFragment.m3600t(R.string.lingq_import_lesson));
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$2(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26872f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$2(this.f26872f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26871e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26872f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41391 c41391 = new C41391(lessonInfoFragment, null);
            this.f26871e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26939a0, c41391, this) == coroutineSingletons) {
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
