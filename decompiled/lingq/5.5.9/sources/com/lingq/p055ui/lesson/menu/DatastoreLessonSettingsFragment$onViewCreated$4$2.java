package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import android.content.Context;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.storage.C3398a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7135p;
import ni.C7793a;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$onViewCreated$4$2", m19206f = "DatastoreLessonSettingsFragment.kt", m19207l = {174}, m19208m = "invokeSuspend")
public final class DatastoreLessonSettingsFragment$onViewCreated$4$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28144e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsFragment f28145f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$onViewCreated$4$2$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsFragment$onViewCreated$4$2$1", m19206f = "DatastoreLessonSettingsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43111 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DatastoreLessonSettingsFragment f28146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43111(DatastoreLessonSettingsFragment datastoreLessonSettingsFragment, InterfaceC9968c<? super C43111> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28146e = datastoreLessonSettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C43111(this.f28146e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43111) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String strM9700c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = this.f28146e;
            DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u0 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
            Context contextM3578a0 = datastoreLessonSettingsFragment.m3578a0();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AbstractC7787n.b(R.string.settings_text_font));
            List<Integer> list = C6716m.f37937a;
            C7135p c7135p = datastoreLessonSettingsViewModelM10183u0.f28166U;
            float fIntValue = ((Number) c7135p.getValue()).intValue();
            int size = list.size() - 1;
            int iIndexOf = list.indexOf(c7135p.getValue());
            C7135p c7135p2 = datastoreLessonSettingsViewModelM10183u0.f28163R;
            LessonFont lessonFont = (LessonFont) ((Map) c7135p2.getValue()).get(datastoreLessonSettingsViewModelM10183u0.mo498E1());
            if (lessonFont != null) {
                strM9700c = C3398a.m9700c(lessonFont);
            } else {
                LessonFont.Companion companion = LessonFont.INSTANCE;
                String strMo498E1 = datastoreLessonSettingsViewModelM10183u0.mo498E1();
                companion.getClass();
                strM9700c = C3398a.m9700c(LessonFont.Companion.m9551a(strMo498E1));
            }
            arrayList.add(new AbstractC7787n.j(R.string.settings_size, R.string.placeholder, fIntValue, size, iIndexOf, true, strM9700c, ViewKeys.LessonFontSize.ordinal()));
            List<Double> list2 = C6716m.f37938b;
            C7135p c7135p3 = datastoreLessonSettingsViewModelM10183u0.f28167V;
            arrayList.add(new AbstractC7787n.j(R.string.settings_line_spacing, R.string.settings_line_spacing_description, (float) ((Number) c7135p3.getValue()).doubleValue(), list2.size() - 1, list2.indexOf(c7135p3.getValue()), false, "", ViewKeys.LessonLineSpacing.ordinal()));
            LessonFont.Companion companion2 = LessonFont.INSTANCE;
            String strMo498E2 = datastoreLessonSettingsViewModelM10183u0.mo498E1();
            companion2.getClass();
            C5207g.m11111f(strMo498E2, "language");
            if (LessonFont.Companion.m9553c(strMo498E2).size() > 1) {
                arrayList.add(AbstractC7787n.d.f42747a);
                LessonFont lessonFont2 = (LessonFont) ((Map) c7135p2.getValue()).get(datastoreLessonSettingsViewModelM10183u0.mo498E1());
                String title = lessonFont2 != null ? lessonFont2.getTitle() : null;
                int iOrdinal = ViewKeys.LessonFont.ordinal();
                LessonFont lessonFont3 = (LessonFont) ((Map) c7135p2.getValue()).get(datastoreLessonSettingsViewModelM10183u0.mo498E1());
                arrayList.add(new AbstractC7787n.n(R.string.settings_style, R.string.placeholder, iOrdinal, title, lessonFont3 != null ? C3398a.m9700c(lessonFont3) : C3398a.m9700c(LessonFont.Companion.m9551a(datastoreLessonSettingsViewModelM10183u0.mo498E1())), 8));
            }
            arrayList.add(AbstractC7787n.d.f42747a);
            if (C7793a.m15499c(contextM3578a0)) {
                C7135p c7135p4 = datastoreLessonSettingsViewModelM10183u0.f28165T;
                arrayList.add(new AbstractC7787n.n(R.string.settings_highlight_style, C4924a.m10459f0((LessonHighlightStyle) c7135p4.getValue()), ViewKeys.LessonDarkHighlight.ordinal(), null, ((LessonHighlightStyle) c7135p4.getValue()).name(), 24));
            } else {
                C7135p c7135p5 = datastoreLessonSettingsViewModelM10183u0.f28164S;
                arrayList.add(new AbstractC7787n.n(R.string.settings_highlight_style, C4924a.m10459f0((LessonHighlightStyle) c7135p5.getValue()), ViewKeys.LessonLightHighlight.ordinal(), null, ((LessonHighlightStyle) c7135p5.getValue()).name(), 24));
            }
            datastoreLessonSettingsViewModelM10183u0.f28176d0.setValue(arrayList);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsFragment$onViewCreated$4$2(DatastoreLessonSettingsFragment datastoreLessonSettingsFragment, InterfaceC9968c<? super DatastoreLessonSettingsFragment$onViewCreated$4$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28145f = datastoreLessonSettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreLessonSettingsFragment$onViewCreated$4$2(this.f28145f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreLessonSettingsFragment$onViewCreated$4$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28144e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DatastoreLessonSettingsFragment datastoreLessonSettingsFragment = this.f28145f;
            DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModelM10183u0 = DatastoreLessonSettingsFragment.m10183u0(datastoreLessonSettingsFragment);
            C43111 c43111 = new C43111(datastoreLessonSettingsFragment, null);
            this.f28144e = 1;
            if (C0062b.m369m0(datastoreLessonSettingsViewModelM10183u0.f28186i0, c43111, this) == coroutineSingletons) {
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
